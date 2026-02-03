package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edbx implements TextWatcher {
    final /* synthetic */ edby a;

    public edbx(edby edbyVar) {
        this.a = edbyVar;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence.toString().isEmpty()) {
            edcx edcxVar = this.a.an;
            edcxVar.e = 1;
            if (edcxVar.b.g() && ((edjc) edcxVar.b.c()).a().g()) {
                edcxVar.b();
            } else {
                edcxVar.a();
            }
        }
        if (i3 > 0) {
            this.a.an.c(charSequence.toString());
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
