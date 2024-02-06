package com.example.marsphotos.data

import com.example.marsphotos.network.MarsApi
import com.example.marsphotos.network.MarsApiService
import com.example.marsphotos.network.MarsPhoto

interface MarsPhotosRepository {
    suspend fun getMarsPhothos():List<MarsPhoto>
}

class NetworkMarsPhotosRepository( private val marsApiService: MarsApiService): MarsPhotosRepository{
    override suspend fun getMarsPhothos(): List<MarsPhoto> = marsApiService.getPhotosPerro()
}

