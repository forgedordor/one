package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dvxj implements Serializable {
    public static final dvxj f;
    public static final dvxj g;

    static {
        dvxc dvxcVar = new dvxc();
        dvxcVar.c(0L);
        dvxcVar.b(1.0d);
        dvxcVar.e(0L);
        dvxcVar.f(0);
        dvxcVar.d(1);
        dvxcVar.a();
        dvxc dvxcVar2 = new dvxc();
        dvxcVar2.c(1000L);
        dvxcVar2.b(1.0d);
        dvxcVar2.e(2000L);
        dvxcVar2.f(1);
        dvxcVar2.d(1000);
        f = dvxcVar2.a();
        dvxc dvxcVar3 = new dvxc();
        dvxcVar3.c(1000L);
        dvxcVar3.b(2.0d);
        dvxcVar3.e(30000L);
        dvxcVar3.f(3);
        dvxcVar3.d(1000);
        g = dvxcVar3.a();
    }

    public abstract double a();

    public abstract int b();

    public abstract int c();

    public abstract long d();

    public abstract long e();
}
