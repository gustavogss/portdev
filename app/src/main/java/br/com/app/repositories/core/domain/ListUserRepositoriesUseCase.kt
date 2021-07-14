package br.com.app.repositories.core.domain

import br.com.app.repositories.core.UseCase
import br.com.app.repositories.core.data.model.Repo
import br.com.app.repositories.core.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}