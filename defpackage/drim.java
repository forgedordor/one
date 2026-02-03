package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class drim extends ea {
    protected erwu a;
    protected int b;
    protected int c;

    static Bundle a(erwu erwuVar, int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("Question", erwuVar.toByteArray());
        bundle.putInt("DispalyLogoResId", i);
        bundle.putInt("QuestionIndex", i2);
        return bundle;
    }

    public abstract erxa b();

    public abstract String e();

    @Override // defpackage.ea
    public void h(Bundle bundle) {
        super.h(bundle);
        Bundle bundle2 = this.m;
        this.a = (erwu) drhy.a(erwu.a, bundle2.getByteArray("Question"));
        this.b = bundle2.getInt("DispalyLogoResId", 0);
        this.c = bundle2.getInt("QuestionIndex");
    }

    public abstract void p();

    public abstract void q(String str);

    public void f() {
    }
}
