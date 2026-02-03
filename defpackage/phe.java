package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class phe implements pft, pgu {
    public final pgz a;

    public phe(pgz pgzVar) {
        this.a = pgzVar;
    }

    @Override // defpackage.pei
    public final Object a(String str, fdap fdapVar, fcxy fcxyVar) throws Exception {
        phi phiVarA = this.a.a(str);
        try {
            Object objInvoke = fdapVar.invoke(phiVarA);
            fdaa.a(phiVarA, null);
            return objInvoke;
        } finally {
        }
    }

    @Override // defpackage.pft
    public final Object b(pfs pfsVar, fdat fdatVar, fcxy fcxyVar) {
        return e(pfsVar, fdatVar, fcxyVar);
    }

    @Override // defpackage.pft
    public final Object c() {
        return Boolean.valueOf(this.a.a.i());
    }

    @Override // defpackage.pgu
    public final pgz d() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.pfs r11, defpackage.fdat r12, defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.phe.e(pfs, fdat, fcxy):java.lang.Object");
    }
}
