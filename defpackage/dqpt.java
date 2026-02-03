package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dqpt {
    public static dqpr m() {
        dqog dqogVar = new dqog();
        dqogVar.b = new Supplier() { // from class: dqpp
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        };
        dqogVar.g(false);
        dqogVar.e = 8;
        dqogVar.d(false);
        dqogVar.e(false);
        dqogVar.l(false);
        dqogVar.k(false);
        dqogVar.c = new dqps() { // from class: dqpq
        };
        dqogVar.f(false);
        dqogVar.i(0);
        return dqogVar;
    }

    public abstract int a();

    public abstract dqps b();

    public abstract String c();

    public abstract Supplier d();

    public abstract Supplier e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract boolean k();

    public abstract int l();
}
