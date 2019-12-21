package com.example.splashsplash

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class StudentRegisterationInfoAdapter :
    RecyclerView.Adapter<StudentRegisterationInfoAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.adapter_student_reg_info, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return 5;
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}