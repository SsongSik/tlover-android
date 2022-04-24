package com.cookandroid.teamproject1.id.view

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cookandroid.teamproject1.SelectRVAdapter
import com.cookandroid.teamproject1.SelectDataModel
import com.cookandroid.teamproject1.R
import com.cookandroid.teamproject1.databinding.SelectDestBinding

class SelectDestActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var selectRVAdapter: SelectRVAdapter
    private var dataList = mutableListOf<SelectDataModel>()

    lateinit var binding: SelectDestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SelectDestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerView = binding.selectDestGrid
        recyclerView.layoutManager = GridLayoutManager(applicationContext, 3)
        selectRVAdapter = SelectRVAdapter(applicationContext)
        recyclerView.adapter = selectRVAdapter

        dataList.add(SelectDataModel("서울"))
        dataList.add(SelectDataModel("제주도"))
        dataList.add(SelectDataModel("경기도"))
        dataList.add(SelectDataModel("충청북도"))
        dataList.add(SelectDataModel("충청남도"))
        dataList.add(SelectDataModel("인천"))
        dataList.add(SelectDataModel("경상북도"))
        dataList.add(SelectDataModel("경상남도"))
        dataList.add(SelectDataModel("강원도"))
        dataList.add(SelectDataModel("전라북도"))
        dataList.add(SelectDataModel("전라남도"))
        dataList.add(SelectDataModel("기타"))

        selectRVAdapter.setDataList(dataList)

        binding.selectDestBtnConfirm.setOnClickListener{
            startActivity(Intent(this, SelectThemeActivity::class.java))
        }
    }

    fun changeConfirmButton() {
        binding.selectDestBtnConfirm.setBackgroundResource(R.drawable.confirm_btn_background_clicked)
        binding.selectDestBtnConfirm.setTextColor(Color.WHITE)
    }
}

