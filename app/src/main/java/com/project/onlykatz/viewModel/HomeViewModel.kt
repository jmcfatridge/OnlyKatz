package com.project.onlykatz.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.project.onlykatz.model.Kat
import com.project.onlykatz.repo.KatRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel(val katRepo:KatRepo) : ViewModel() {

    private val _listOfKats:MutableLiveData<List<Kat>> = MutableLiveData()
    val listOfKats:LiveData<List<Kat>> get() = _listOfKats

    fun getTheKats(limit:Int, page:Int, order:String) = viewModelScope.launch(Dispatchers.IO) {
        val result = katRepo.getKats(limit, page, order)
        _listOfKats.postValue(result)
    }
}