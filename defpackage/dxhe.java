package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dxhe {
    public static dxhd r() {
        dxhb dxhbVar = new dxhb();
        dxhbVar.e(0L);
        dxhbVar.i(0);
        dxhbVar.e = ekon.a;
        dxhbVar.j(0L);
        dxhbVar.g(0L);
        dxhbVar.f(0);
        dxhbVar.c(0L);
        dxhbVar.d(0L);
        return dxhbVar;
    }

    public static dxhe u(long j, String str, int i, String str2, String str3, String str4, int i2, String str5, ekhx ekhxVar, String str6, long j2, long j3, int i3, long j4, String str7, long j5) {
        dxhd dxhdVarR = r();
        dxhdVarR.e(j);
        dxhdVarR.b(str);
        dxhdVarR.k(i);
        dxhb dxhbVar = (dxhb) dxhdVarR;
        dxhbVar.a = str2;
        dxhbVar.b = str3;
        dxhbVar.c = str4;
        dxhdVarR.i(i2);
        dxhbVar.d = str5;
        dxhbVar.e = ekhxVar;
        dxhbVar.f = str6;
        dxhdVarR.j(j2);
        dxhdVarR.g(j3);
        dxhdVarR.f(i3);
        dxhdVarR.c(j4);
        dxhbVar.g = str7;
        dxhdVarR.d(j5);
        return dxhdVarR.a();
    }

    public abstract int a();

    public abstract int b();

    public abstract long c();

    public abstract long d();

    public abstract long e();

    public abstract long f();

    public abstract long g();

    public abstract dxhd h();

    public abstract ekhx i();

    public abstract String j();

    public abstract String k();

    public abstract String l();

    public abstract String m();

    public abstract String n();

    public abstract String o();

    public abstract String p();

    public abstract int q();

    public final dxvi s() {
        int iQ = q();
        return iQ != 1 ? iQ != 2 ? iQ != 3 ? iQ != 4 ? new dxvn(j(), d()) : new dxvl(j()) : dxwf.a : dxwh.a : new dxvp(j());
    }

    public final boolean t() {
        return s().b();
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("SpecificId", dxuf.a(j()));
        return ejwfVarB.toString();
    }
}
