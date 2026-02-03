package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ecvg implements TextWatcher {
    final /* synthetic */ List a;
    final /* synthetic */ int b;
    final /* synthetic */ ecvj c;

    public ecvg(ecvj ecvjVar, List list, int i) {
        this.a = list;
        this.b = i;
        this.c = ecvjVar;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String strTrim = charSequence.toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            return;
        }
        this.c.a.a(new ecvi(4, strTrim, ((exnj) this.a.get(this.b)).d));
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
