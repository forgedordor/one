package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fcrn {
    public final fbnd a;
    public final fbnc b;

    protected fcrn(fbnd fbndVar, fbnc fbncVar) {
        fbndVar.getClass();
        this.a = fbndVar;
        this.b = fbncVar;
    }

    protected abstract fcrn a(fbnd fbndVar, fbnc fbncVar);

    public final fcrn i(fbmz fbmzVar) {
        fbna fbnaVarA = fbnc.a(this.b);
        fbnaVarA.c = fbmzVar;
        return a(this.a, new fbnc(fbnaVarA));
    }

    public final fcrn j(String str) {
        fbna fbnaVarA = fbnc.a(this.b);
        fbnaVarA.d = str;
        return a(this.a, new fbnc(fbnaVarA));
    }

    public final fcrn k(long j, TimeUnit timeUnit) {
        return a(this.a, this.b.b(fbol.c(j, timeUnit)));
    }

    public final fcrn l(Executor executor) {
        return a(this.a, this.b.c(executor));
    }

    public final fcrn m(fbni... fbniVarArr) {
        return a(fbnk.b(this.a, fbniVarArr), this.b);
    }

    public final fcrn n(fbnb fbnbVar, Object obj) {
        return a(this.a, this.b.f(fbnbVar, obj));
    }
}
