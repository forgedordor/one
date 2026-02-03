package defpackage;

import android.os.Parcelable;
import android.text.SpanWatcher;
import android.text.Spannable;
import com.google.android.apps.messaging.ui.generic.spannedautocomplete.SpannedMultiAutoCompleteTextView;
import com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyui implements SpanWatcher {
    final /* synthetic */ SpannedMultiAutoCompleteTextView a;

    public cyui(SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView) {
        this.a = spannedMultiAutoCompleteTextView;
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        czyt czytVar;
        if (!(obj instanceof cyuh) || (czytVar = this.a.k) == null) {
            return;
        }
        Parcelable parcelable = ((cyuh) obj).a;
        if (parcelable instanceof SearchFilterDataItem) {
            czytVar.a.h((SearchFilterDataItem) parcelable);
        } else {
            cqca.n("BugleZeroStateSearch", "Token of the wrong type was removed. Expected an instance of SearchFilterDataItem");
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        if (!(obj instanceof cyuh) || i2 - i == i4 - i3) {
            return;
        }
        cqaz.c("TokenSpan should not be changed after creation.");
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        czyt czytVar;
        if (!(obj instanceof cyuh) || (czytVar = this.a.k) == null) {
            return;
        }
        Parcelable parcelable = ((cyuh) obj).a;
        if (parcelable instanceof SearchFilterDataItem) {
            czytVar.a.j((SearchFilterDataItem) parcelable);
        } else {
            cqca.n("BugleZeroStateSearch", "Token of the wrong type was removed. Expected an instance of SearchFilterDataItem");
        }
    }
}
