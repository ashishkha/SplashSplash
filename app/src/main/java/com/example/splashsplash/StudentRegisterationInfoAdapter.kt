package com.example.splashsplash

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.adapter_student_reg_info.view.*

class StudentRegisterationInfoAdapter :
    RecyclerView.Adapter<StudentRegisterationInfoAdapter.ViewHolder>() {

    private var studentRegisterationInfoAdapterList: List<String>? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.adapter_student_reg_info, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        if (studentRegisterationInfoAdapterList == null) {
            return 0
        }
        return studentRegisterationInfoAdapterList!!.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.txtViewName.setText(studentRegisterationInfoAdapterList?.get(position))
    }

    fun setData(studentRegisterationInfoAdapterList: List<String>) {
        this.studentRegisterationInfoAdapterList = studentRegisterationInfoAdapterList
        notifyDataSetChanged()

    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtViewName = itemView.txtViewName
    }
}