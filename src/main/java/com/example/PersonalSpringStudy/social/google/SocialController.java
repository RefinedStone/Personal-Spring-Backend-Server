package com.example.PersonalSpringStudy.social.google;


import com.example.PersonalSpringStudy.global.dto.ResponseDto;
import com.example.PersonalSpringStudy.social.google.Constant.SocialLoginType;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class SocialController {

    private final OAuthService oAuthService;

    /**
     * 유저 소셜 로그인으로 리다이렉트 해주는 url
     * [GET] /accounts/auth
     */

    @GetMapping("/auth/{socialLoginType}") //GOOGLE이 들어올 것이다.
    public void socialLoginRedirect(@PathVariable(name = "socialLoginType") String SocialLoginPath) throws IOException {
        SocialLoginType socialLoginType = SocialLoginType.valueOf(SocialLoginPath.toUpperCase());
        oAuthService.request(socialLoginType);
    }

    /**
     * Social Login API Server 요청에 의한 callback 을 처리
     *
     * @param socialLoginPath (GOOGLE, FACEBOOK, NAVER, KAKAO)
     * @param code            API Server 로부터 넘어오는 code
     * @return SNS Login 요청 결과로 받은 Json 형태의 java 객체 (access_token, jwt_token, user_num 등)
     */

//    @GetMapping(value = "/auth/{socialLoginType}/callback")
    @GetMapping(value = "/{socialLoginType}/test")
    public ResponseDto<?> callback(
            @PathVariable(name = "socialLoginType") String socialLoginPath,
            @RequestParam(name = "code") String code) throws IOException {
        System.out.println(">> 소셜 로그인 API 서버로부터 받은 code :" + code);
        SocialLoginType socialLoginType = SocialLoginType.valueOf(socialLoginPath.toUpperCase());
        return ResponseDto.success(oAuthService.oAuthLogin(socialLoginType, code));
    }


}
