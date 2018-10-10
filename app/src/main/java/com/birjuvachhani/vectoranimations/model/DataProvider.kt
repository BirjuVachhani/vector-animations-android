package com.birjuvachhani.vectoranimations.model

import android.content.Context
import com.birjuvachhani.vectoranimations.R

/**
 * Created by Birju Vachhani on 09/10/18.
 */
object DataProvider {
    private val thumbnails = intArrayOf(
            R.drawable.ic_progress_and_done,
            R.drawable.ic_heartbeat_loader,
            R.drawable.ic_journal,
            R.drawable.ic_profile
    )
    private val vectorTypes: Array<Enum<VectorType>> = arrayOf(
            VectorType.AVD,
            VectorType.AVD,
            VectorType.INTERACTIVE,
            VectorType.INTERACTIVE
    )

    fun getDataList(context: Context): ArrayList<VectorModel> {
        val vectorNames = context.resources.getStringArray(R.array.anim_names)
        val list = ArrayList<VectorModel>()
        for (i in 0 until thumbnails.size) {
            val vectorModel = VectorModel(
                    name = vectorNames[i],
                    thumbnail = thumbnails[i],
                    type = vectorTypes[i]
            )
            list.add(vectorModel)
        }
        return list
    }
}