package defpackage;

import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xk implements View.OnKeyListener {
    final /* synthetic */ SearchView a;

    public xk(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        SearchView searchView = this.a;
        if (searchView.mSearchable != null) {
            if (searchView.mSearchSrcTextView.isPopupShowing() && searchView.mSearchSrcTextView.getListSelection() != -1) {
                return searchView.onSuggestionsKey(view, i, keyEvent);
            }
            if (TextUtils.getTrimmedLength(searchView.mSearchSrcTextView.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i == 66) {
                view.cancelLongPress();
                searchView.launchQuerySearch(0, null, searchView.mSearchSrcTextView.getText().toString());
                return true;
            }
        }
        return false;
    }
}
