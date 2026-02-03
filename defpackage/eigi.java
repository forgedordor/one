package defpackage;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eigi implements TextWatcher {
    final /* synthetic */ TextWatcher a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ int d;
    final /* synthetic */ String e;
    final /* synthetic */ eigp f;

    public eigi(eigp eigpVar, TextWatcher textWatcher, String str, String str2, int i, String str3) {
        this.a = textWatcher;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = eigpVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (eidc.v()) {
            this.a.afterTextChanged(editable);
            return;
        }
        eieh eiehVarC = this.f.c(this.e, this.b, this.c, this.d);
        try {
            this.a.afterTextChanged(editable);
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (eidc.v()) {
            this.a.beforeTextChanged(charSequence, i, i2, i3);
            return;
        }
        eieh eiehVarC = this.f.c(this.e, this.b, this.c, this.d);
        try {
            this.a.beforeTextChanged(charSequence, i, i2, i3);
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (eidc.v()) {
            this.a.onTextChanged(charSequence, i, i2, i3);
            return;
        }
        eieh eiehVarC = this.f.c(this.e, this.b, this.c, this.d);
        try {
            this.a.onTextChanged(charSequence, i, i2, i3);
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
