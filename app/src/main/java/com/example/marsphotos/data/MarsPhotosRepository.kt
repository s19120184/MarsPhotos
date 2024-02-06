package com.example.marsphotos.data

import com.example.marsphotos.network.MarsApi
import com.example.marsphotos.network.MarsApiService
import com.example.marsphotos.network.MarsPhoto

interface MarsPhotosRepository {
    suspend fun getMarsPhothos():List<MarsPhoto>
}

class NetworkMarsPhotosRepository(): MarsPhotosRepository{
    override suspend fun getMarsPhothos(): List<MarsPhoto> {
        return MarsApi.retrofitService.getPhotosPerro()
    }
}