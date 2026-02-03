package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.CheckBox;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ecsv implements TextWatcher {
    final /* synthetic */ int a;
    final /* synthetic */ CheckBox b;
    final /* synthetic */ ecsz c;

    public ecsv(ecsz ecszVar, int i, CheckBox checkBox) {
        this.a = i;
        this.b = checkBox;
        this.c = ecszVar;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String strTrim = charSequence.toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            return;
        }
        ecsz ecszVar = this.c;
        ecszVar.a[this.a] = true;
        this.b.setChecked(true);
        ecszVar.b = strTrim;
        ecszVar.c.a(new ecsx(ecszVar.b, ecszVar.a));
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
