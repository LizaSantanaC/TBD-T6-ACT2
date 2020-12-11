package com.liza.android.room;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import java.util.List;

public class WordViewModel extends AndroidViewModel {
    private WordRepository mRepository;
    private final LiveData<List<Word>> mAllWords;

    public WordViewModel() {
        super(App.mApp);
        mRepository = new WordRepository(App.mApp);
        mAllWords = mRepository.getAllWords();
    }

    LiveData<List<Word>> getAllWords() {
        return mAllWords;
    }
    void insert(Word word) {
        mRepository.insert(word);
    }
}
