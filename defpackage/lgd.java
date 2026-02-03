package defpackage;

import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lgd extends lgh {
    final WindowInsets.Builder a;

    public lgd() {
        this.a = new WindowInsets.Builder();
    }

    @Override // defpackage.lgh
    public lgt a() {
        h();
        lgt lgtVarO = lgt.o(this.a.build());
        lgtVarO.r(this.b);
        return lgtVarO;
    }

    @Override // defpackage.lgh
    public void b(kzc kzcVar) {
        this.a.setStableInsets(kzcVar.a());
    }

    @Override // defpackage.lgh
    public void c(kzc kzcVar) {
        this.a.setSystemWindowInsets(kzcVar.a());
    }

    @Override // defpackage.lgh
    public void d(kzc kzcVar) {
        this.a.setMandatorySystemGestureInsets(kzcVar.a());
    }

    @Override // defpackage.lgh
    public void e(kzc kzcVar) {
        this.a.setSystemGestureInsets(kzcVar.a());
    }

    @Override // defpackage.lgh
    public void f(kzc kzcVar) {
        this.a.setTappableElementInsets(kzcVar.a());
    }

    public lgd(lgt lgtVar) {
        WindowInsets.Builder builder;
        super(lgtVar);
        WindowInsets windowInsetsE = lgtVar.e();
        if (windowInsetsE != null) {
            builder = new WindowInsets.Builder(windowInsetsE);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.a = builder;
    }
}
