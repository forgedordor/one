package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class camp extends fcyz implements fdat {
    int a;
    final /* synthetic */ cams b;
    final /* synthetic */ evvp c;
    final /* synthetic */ caly d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public camp(fcxy fcxyVar, cams camsVar, evvp evvpVar, caly calyVar) {
        super(2, fcxyVar);
        this.b = camsVar;
        this.c = evvpVar;
        this.d = calyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((camp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) throws java.lang.Throwable {
        /*
            r3 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r3.a
            r2 = 1
            defpackage.fctl.b(r4)
            if (r1 == 0) goto Lb
            return r4
        Lb:
            java.lang.Object r4 = r3.e
            fdjx r4 = (defpackage.fdjx) r4
            cams r4 = r3.b
            boolean r4 = r4.h()
            if (r4 == 0) goto L35
            evvp r4 = r3.c
            evvp r1 = defpackage.evxc.c
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L35
            caly r1 = r3.d
            cpmc r1 = r1.fs()
            eiju r4 = r1.af(r4)
            r3.a = r2
            java.lang.Object r4 = defpackage.fdxs.c(r4, r3)
            if (r4 != r0) goto L34
            goto L48
        L34:
            return r4
        L35:
            caly r4 = r3.d
            cpmc r4 = r4.fs()
            eiju r4 = r4.p()
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = defpackage.fdxs.c(r4, r3)
            if (r4 != r0) goto L49
        L48:
            return r0
        L49:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.camp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        camp campVar = new camp(fcxyVar, this.b, this.c, this.d);
        campVar.e = obj;
        return campVar;
    }
}
