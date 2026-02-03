package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class smq {
    public static smq f(sgj sgjVar) {
        return new smu(sgjVar.a, sgjVar.b, sgjVar.c, sgjVar.d, sgjVar.e, sgjVar.f);
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public final sgj e() {
        return new sgj(h(), g(), b(), c(), a(), d());
    }

    public abstract String g();

    public abstract String h();
}
