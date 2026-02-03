package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class cqce {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/common/Logger");
    public final String b;
    private final cqbs c;

    private cqce(String str, cqbs cqbsVar) {
        this.b = str;
        this.c = cqbsVar;
    }

    @Deprecated
    public static cqce f(String str, final Class cls) {
        return new cqce(str, new cqbs() { // from class: cqcc
            @Override // defpackage.cqbs
            public final void a(StringBuilder sb) {
                sb.append(cls.getSimpleName());
            }
        });
    }

    @Deprecated
    public static cqce g(String str, final String str2) {
        return new cqce(str, new cqbs() { // from class: cqcd
            @Override // defpackage.cqbs
            public final void a(StringBuilder sb) {
                sb.append(str2);
            }
        });
    }

    private final cqbd u(int i) {
        ThreadLocal threadLocal = cqbd.a;
        cqbd cqbdVar = (cqbd) threadLocal.get();
        if (cqbdVar == null) {
            cqbdVar = new cqbd();
            threadLocal.set(cqbdVar);
        } else {
            cqbdVar.r();
        }
        cqbdVar.t(i, this.b, this.c);
        return cqbdVar;
    }

    @Deprecated
    public final cqbd a() {
        return u(3);
    }

    @Deprecated
    public final cqbd b() {
        return u(6);
    }

    @Deprecated
    public final cqbd c() {
        return u(4);
    }

    @Deprecated
    public final cqbd d() {
        return u(2);
    }

    @Deprecated
    public final cqbd e() {
        return u(5);
    }

    public final ekrd h() {
        ekrd ekrdVar = (ekrd) a.g();
        ekrdVar.X(eksq.a, this.b);
        return ekrdVar;
    }

    public final ekrd i() {
        ekrd ekrdVar = (ekrd) a.h();
        ekrdVar.X(eksq.a, this.b);
        return ekrdVar;
    }

    public final ekrd j() {
        ekrd ekrdVar = (ekrd) a.i();
        ekrdVar.X(eksq.a, this.b);
        return ekrdVar;
    }

    public final ekrd k() {
        ekrd ekrdVar = (ekrd) a.j();
        ekrdVar.X(eksq.a, this.b);
        return ekrdVar;
    }

    @Deprecated
    public final void l(String str) {
        cqca.c("BugleBattery", str);
    }

    @Deprecated
    public final void m(String str) {
        cqbd cqbdVarA = a();
        cqbdVarA.I(str);
        cqbdVarA.r();
    }

    @Deprecated
    public final void n(String str) {
        cqbd cqbdVarB = b();
        cqbdVarB.I(str);
        cqbdVarB.r();
    }

    @Deprecated
    public final void o(String str, Throwable th) {
        cqbd cqbdVarB = b();
        cqbdVarB.I(str);
        cqbdVarB.s(th);
    }

    @Deprecated
    public final void p(String str) {
        cqbd cqbdVarC = c();
        cqbdVarC.I(str);
        cqbdVarC.r();
    }

    @Deprecated
    public final void q(String str) {
        cqbd cqbdVarD = d();
        cqbdVarD.I(str);
        cqbdVarD.r();
    }

    @Deprecated
    public final void r(String str) {
        cqbd cqbdVarE = e();
        cqbdVarE.I(str);
        cqbdVarE.r();
    }

    @Deprecated
    public final void s(String str, Throwable th) {
        cqbd cqbdVarE = e();
        cqbdVarE.I(str);
        cqbdVarE.s(th);
    }

    @Deprecated
    public final boolean t(int i) {
        return cqca.q(this.b, i);
    }
}
