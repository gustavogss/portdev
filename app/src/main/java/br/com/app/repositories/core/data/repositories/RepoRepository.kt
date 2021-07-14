package br.com.app.repositories.core.data.repositories

import br.com.app.repositories.core.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}