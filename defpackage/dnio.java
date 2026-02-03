package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnio implements TextWatcher {
    final /* synthetic */ dnip a;

    public dnio(dnip dnipVar) {
        this.a = dnipVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Iterator it = this.a.c.iterator();
        while (it.hasNext()) {
            ((dnjk) it.next()).a(String.valueOf(editable));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
