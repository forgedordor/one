package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hnt extends iax implements hnu {
    public final fdae a;
    public hns b = new hns(hzt.b().v());
    private final hrn c;

    public hnt(fdae fdaeVar, hrn hrnVar) {
        this.a = fdaeVar;
        this.c = hrnVar;
    }

    @Override // defpackage.hsf
    public final Object a() {
        fdap fdapVarK = hzt.b().k();
        if (fdapVarK != null) {
            fdapVarK.invoke(this);
        }
        hzg hzgVarB = hzt.b();
        return b((hns) hzt.f(this.b, hzgVarB), hzgVarB, true, this.a).e;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.hns b(defpackage.hns r22, defpackage.hzg r23, boolean r24, defpackage.fdae r25) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hnt.b(hns, hzg, boolean, fdae):hns");
    }

    @Override // defpackage.hnu
    public final hrn c() {
        return this.c;
    }

    @Override // defpackage.iaw
    public final iay d() {
        return this.b;
    }

    @Override // defpackage.iaw
    public final void e(iay iayVar) {
        iayVar.getClass();
        this.b = (hns) iayVar;
    }

    @Override // defpackage.hnu
    public final hns f() {
        hzg hzgVarB = hzt.b();
        return b((hns) hzt.f(this.b, hzgVarB), hzgVarB, false, this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        hns hnsVar = (hns) hzt.e(this.b);
        sb.append(hnsVar.d(hzt.b()) ? String.valueOf(hnsVar.e) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
