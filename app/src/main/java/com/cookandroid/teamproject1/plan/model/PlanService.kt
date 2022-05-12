package com.cookandroid.teamproject1.plan.model

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * 작성자 : 원도혜
 * Plan api 연동
 * +플랜 상세 조회 api 연동 : 윤성식
 */

interface PlanService {
    //플랜 목록조회
    @GET("/api/v1/plans/plan-list?")
    fun getDiaryPlan(
        @Header("X-ACCESS-TOKEN") jwt: String,
        @Header("X-REFRESH-TOKEN") refreshToken: Int
//        @Query("Status") status: String
    ) : Call<ResponseDiaryPlanData>

    //플랜 상세조회
    @GET("/api/v1/plans/plan-detail/{planId}")
    fun getDiaryPlanView(
        @Header("X-ACCESS-TOKEN") jwt: String,
        @Header("X-REFRESH-TOKEN") refreshToken: Int,
        @Path("planId") planId : Int
//        @Query("Status") status: String
    ) : Call<ResponsePlanViewData>
}
