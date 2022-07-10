package edu.tomerbu.locationdemos.work

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class MyWorker(private val appContext: Context, private val workerParams: WorkerParameters):
    Worker(appContext, workerParams) {
    override fun doWork(): Result {

        println("Doing work")

        // Indicate whether the work finished successfully with the Result
        return Result.success()
    }
}