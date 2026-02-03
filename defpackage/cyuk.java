package defpackage;

import android.text.Editable;
import android.text.Spanned;
import android.text.TextWatcher;
import android.widget.Filter;
import com.google.android.apps.messaging.ui.generic.spannedautocomplete.SpannedMultiAutoCompleteTextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyuk implements TextWatcher {
    final /* synthetic */ SpannedMultiAutoCompleteTextView a;
    private cyuh[] b;
    private boolean c = false;

    public cyuk(SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView) {
        this.a = spannedMultiAutoCompleteTextView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable == null) {
            return;
        }
        cyuh[] cyuhVarArr = this.b;
        if (cyuhVarArr != null && cyuhVarArr.length > 0) {
            int length = editable.length();
            int iMin = 0;
            for (cyuh cyuhVar : this.b) {
                length = Math.max(Math.min(length, editable.getSpanStart(cyuhVar)), 0);
                iMin = Math.min(Math.max(iMin, editable.getSpanEnd(cyuhVar)), editable.length());
                editable.removeSpan(cyuhVar);
            }
            if (iMin > length) {
                editable.delete(length, iMin);
            }
        }
        final SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView = this.a;
        if (!spannedMultiAutoCompleteTextView.f || spannedMultiAutoCompleteTextView.o()) {
            if (spannedMultiAutoCompleteTextView.n()) {
                if (spannedMultiAutoCompleteTextView.h != null) {
                    spannedMultiAutoCompleteTextView.e = true;
                    int selectionEnd = spannedMultiAutoCompleteTextView.getSelectionEnd();
                    int iFindTokenStart = spannedMultiAutoCompleteTextView.d.findTokenStart(editable, selectionEnd);
                    czyi czyiVar = spannedMultiAutoCompleteTextView.m;
                    if (czyiVar != null) {
                        czyiVar.a();
                        return;
                    } else {
                        spannedMultiAutoCompleteTextView.h.filter(editable.subSequence(iFindTokenStart, selectionEnd), new Filter.FilterListener() { // from class: cyuj
                            @Override // android.widget.Filter.FilterListener
                            public final void onFilterComplete(int i) {
                                spannedMultiAutoCompleteTextView.m(i);
                            }
                        });
                        return;
                    }
                }
                return;
            }
            if (spannedMultiAutoCompleteTextView.m != null) {
                boolean z = this.c;
                ejwl.l(true);
                if (z) {
                    Editable text = spannedMultiAutoCompleteTextView.getText();
                    int selectionEnd2 = spannedMultiAutoCompleteTextView.getSelectionEnd();
                    int iFindTokenStart2 = selectionEnd2 >= 0 ? selectionEnd2 - spannedMultiAutoCompleteTextView.d.findTokenStart(text, selectionEnd2) : 0;
                    if (iFindTokenStart2 < 2 && iFindTokenStart2 > 0) {
                        spannedMultiAutoCompleteTextView.m.a();
                        return;
                    }
                }
            }
            spannedMultiAutoCompleteTextView.i();
            Filter filter = spannedMultiAutoCompleteTextView.h;
            if (filter != null) {
                filter.filter(null);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView = this.a;
        spannedMultiAutoCompleteTextView.f = spannedMultiAutoCompleteTextView.o();
        this.b = null;
        if (i3 != 0) {
            z = false;
        } else if (i2 > 0) {
            z = true;
            i3 = 0;
        } else {
            i3 = 0;
            z = false;
        }
        this.c = i3 < i2;
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (!z || spanned == null) {
            return;
        }
        int i4 = (i + i2) - i3;
        this.b = (cyuh[]) spanned.getSpans(i4, i4, cyuh.class);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
