package defpackage;

import android.text.Editable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eewf extends eemg {
    final /* synthetic */ eewj a;

    public eewf(eewj eewjVar) {
        this.a = eewjVar;
    }

    @Override // defpackage.eemg, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.c().l();
    }

    @Override // defpackage.eemg, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.c().y();
    }
}
