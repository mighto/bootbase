//package com.boot.base.controller;
//
//import java.util.Collections;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.util.StringUtils;
//import org.springframework.web.bind.annotation.RequestMapping;
//
///**
// * 功能描述:
// * 作者: mistaker
// * 邮箱: 2029635554@qq.com
// * 创建时间: 2018年1月11日
// *************************************
// */
//
//@Controller
//public class MainController {
//
//	@Autowired
//	private OAuth2AuthorizedClientService authorizedClientService;
//
//	@RequestMapping("/")
//	public String index(Model model, OAuth2AuthenticationToken authentication) {
//		OAuth2AuthorizedClient authorizedClient = this.getAuthorizedClient(authentication);
//		model.addAttribute("userName", authentication.getName());
//		model.addAttribute("clientName", authorizedClient.getClientRegistration().getClientName());
//		return "index";
//	}
//
//	@RequestMapping("/userinfo")
//	public String userinfo(Model model, OAuth2AuthenticationToken authentication) {
//		OAuth2AuthorizedClient authorizedClient = this.getAuthorizedClient(authentication);
//		Map userAttributes = Collections.emptyMap();
//		String userInfoEndpointUri = authorizedClient.getClientRegistration()
//			.getProviderDetails().getUserInfoEndpoint().getUri();
//		if (!StringUtils.isEmpty(userInfoEndpointUri)) {	// userInfoEndpointUri is optional for OIDC Clients
//			userAttributes = WebClient.builder()
//				.filter(oauth2Credentials(authorizedClient))
//				.build()
//				.get()
//				.uri(userInfoEndpointUri)
//				.retrieve()
//				.bodyToMono(Map.class)
//				.block();
//		}
//		model.addAttribute("userAttributes", userAttributes);
//		return "userinfo";
//	}
//
//	private OAuth2AuthorizedClient getAuthorizedClient(OAuth2AuthenticationToken authentication) {
//		return this.authorizedClientService.loadAuthorizedClient(
//			authentication.getAuthorizedClientRegistrationId(), authentication.getName());
//	}
//
//	private ExchangeFilterFunction oauth2Credentials(OAuth2AuthorizedClient authorizedClient) {
//		return ExchangeFilterFunction.ofRequestProcessor(
//			clientRequest -> {
//				ClientRequest authorizedRequest = ClientRequest.from(clientRequest)
//					.header(HttpHeaders.AUTHORIZATION, "Bearer " + authorizedClient.getAccessToken().getTokenValue())
//					.build();
//				return Mono.just(authorizedRequest);
//			});
//	}
//}
