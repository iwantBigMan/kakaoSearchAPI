package com.example.kakaosearchapi.constants

import com.example.kakaosearchapi.BuildConfig.KAKAO_API_KEY

// 상수 저장
class Constants {

    companion object{
        const val BASE_URL = "https://dapi.kakao.com"

        // 개인 API 사용
        const val AUTH_HEADER = "KakaoAK $KAKAO_API_KEY"
    }
}