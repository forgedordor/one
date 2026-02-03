package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dgza {
    public static final dgza c;
    public static final dgza d;
    public static final dgza e;
    public static final dgza f;
    public static final dgza g;

    static {
        dgyz dgyzVarD = d();
        dgyzVarD.d(1);
        c = dgyzVarD.a();
        dgyz dgyzVarD2 = d();
        dgyzVarD2.d(2);
        d = dgyzVarD2.a();
        dgyz dgyzVarD3 = d();
        dgyzVarD3.d(3);
        e = dgyzVarD3.a();
        dgyz dgyzVarD4 = d();
        dgyzVarD4.d(4);
        f = dgyzVarD4.a();
        dgyz dgyzVarD5 = d();
        dgyzVarD5.d(5);
        g = dgyzVarD5.a();
        dgyz dgyzVarD6 = d();
        dgyzVarD6.d(6);
        dgyzVarD6.a();
    }

    public static dgyz d() {
        dgyf dgyfVar = new dgyf();
        dgyfVar.b(0);
        dgyfVar.c(Duration.ZERO);
        return dgyfVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract Duration c();
}
