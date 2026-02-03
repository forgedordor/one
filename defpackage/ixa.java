package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ixa implements ivy {
    private final jdf a;

    public ixa(jdf jdfVar) {
        this.a = jdfVar;
    }

    private final long b() {
        jdf jdfVarA = ixb.a(this.a);
        return ihs.d(h(jdfVarA.p, 0L), a().h(jdfVarA.g, 0L));
    }

    public final jer a() {
        return this.a.g;
    }

    @Override // defpackage.ivy
    public final void ek(ivy ivyVar, float[] fArr) {
        a().ek(ivyVar, fArr);
    }

    @Override // defpackage.ivy
    public final long g() {
        jdf jdfVar = this.a;
        return (jdfVar.a << 32) | (jdfVar.b & 4294967295L);
    }

    @Override // defpackage.ivy
    public final long h(ivy ivyVar, long j) {
        return i(ivyVar, j, true);
    }

    @Override // defpackage.ivy
    public final long i(ivy ivyVar, long j, boolean z) {
        if (!(ivyVar instanceof ixa)) {
            jdf jdfVarA = ixb.a(this.a);
            long jI = i(jdfVarA.p, j, z);
            long j2 = jdfVarA.h;
            int iA = kjb.a(j2);
            int iB = kjb.b(j2);
            long jD = ihs.d(jI, (4294967295L & Float.floatToRawIntBits(iB)) | (Float.floatToRawIntBits(iA) << 32));
            ivy ivyVar2 = jdfVarA.g;
            ivy ivyVarP = ivyVar2.p();
            if (ivyVarP != null) {
                ivyVar2 = ivyVarP;
            }
            return ihs.e(jD, ivyVar2.i(ivyVar, 0L, z));
        }
        boolean z2 = !z;
        jdf jdfVar = ((ixa) ivyVar).a;
        jer jerVar = jdfVar.g;
        jerVar.ao();
        jdf jdfVarC = a().ag(jerVar).C();
        if (jdfVarC != null) {
            long jC = kjb.c(kjb.d(jdfVar.A(jdfVarC, z2), kjc.c(j)), this.a.A(jdfVarC, z2));
            return (Float.floatToRawIntBits(kjb.b(jC)) & 4294967295L) | (Float.floatToRawIntBits(kjb.a(jC)) << 32);
        }
        jdf jdfVarA2 = ixb.a(jdfVar);
        long jD2 = kjb.d(kjb.d(jdfVar.A(jdfVarA2, z2), jdfVarA2.h), kjc.c(j));
        jdf jdfVar2 = this.a;
        jdf jdfVarA3 = ixb.a(jdfVar2);
        long jC2 = kjb.c(jD2, kjb.d(jdfVar2.A(jdfVarA3, z2), jdfVarA3.h));
        long jFloatToRawIntBits = Float.floatToRawIntBits(kjb.a(jC2));
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(kjb.b(jC2)) & 4294967295L;
        jer jerVar2 = jdfVarA3.g.x;
        jerVar2.getClass();
        jer jerVar3 = jdfVarA2.g.x;
        jerVar3.getClass();
        return jerVar2.i(jerVar3, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), z);
    }

    @Override // defpackage.ivy
    public final long j(long j) {
        return a().j(ihs.e(j, b()));
    }

    @Override // defpackage.ivy
    public final long k(long j) {
        return a().k(ihs.e(0L, b()));
    }

    @Override // defpackage.ivy
    public final long l(long j) {
        return a().l(ihs.e(j, b()));
    }

    @Override // defpackage.ivy
    public final long m(long j) {
        return ihs.e(a().m(j), b());
    }

    @Override // defpackage.ivy
    public final long n(long j) {
        return ihs.e(a().n(j), b());
    }

    @Override // defpackage.ivy
    public final ihu o(ivy ivyVar, boolean z) {
        return a().o(ivyVar, z);
    }

    @Override // defpackage.ivy
    public final ivy p() {
        jdf jdfVarC;
        if (!u()) {
            itw.d("LayoutCoordinate operations are only valid when isAttached is true");
        }
        jer jerVar = a().x;
        if (jerVar == null || (jdfVarC = jerVar.C()) == null) {
            return null;
        }
        return jdfVarC.p;
    }

    @Override // defpackage.ivy
    public final ivy r() {
        jdf jdfVarC;
        if (!u()) {
            itw.d("LayoutCoordinate operations are only valid when isAttached is true");
        }
        jer jerVar = a().t.x().x;
        if (jerVar == null || (jdfVarC = jerVar.C()) == null) {
            return null;
        }
        return jdfVarC.p;
    }

    @Override // defpackage.ivy
    public final void t(float[] fArr) {
        a().t(fArr);
    }

    @Override // defpackage.ivy
    public final boolean u() {
        return a().u();
    }
}
