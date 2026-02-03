package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eul extends fcyz implements fdat {
    int a;
    final /* synthetic */ euo b;
    final /* synthetic */ ivy c;
    final /* synthetic */ fdae d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eul(euo euoVar, ivy ivyVar, fdae fdaeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = euoVar;
        this.c = ivyVar;
        this.d = fdaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eul) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c4  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r12.a
            defpackage.fctl.b(r13)
            if (r1 == 0) goto Lb
            goto Lc9
        Lb:
            euo r13 = r12.b
            ivy r1 = r12.c
            fdae r2 = r12.d
            euk r3 = new euk
            r3.<init>(r13, r1, r2)
            r1 = 1
            r12.a = r1
            java.lang.Object r2 = r3.invoke()
            if (r2 == 0) goto Lc4
            eui r13 = r13.a
            dss r13 = (defpackage.dss) r13
            ihu r2 = (defpackage.ihu) r2
            boolean r2 = defpackage.dss.l(r13, r2)
            if (r2 != 0) goto Lc4
            fdiu r2 = new fdiu
            fcxy r4 = defpackage.fcym.c(r12)
            r2.<init>(r4, r1)
            r2.B()
            dsn r4 = new dsn
            r4.<init>(r3, r2)
            dsg r3 = r13.e
            fdae r5 = r4.a
            java.lang.Object r5 = r5.invoke()
            if (r5 != 0) goto L4f
            fdis r13 = r4.b
            fctx r1 = defpackage.fctx.a
            r13.w(r1)
            goto Lbe
        L4f:
            fdis r6 = r4.b
            dsf r7 = new dsf
            r7.<init>()
            r6.d(r7)
            hum r3 = r3.a
            int r6 = r3.b
            r7 = 0
            fddq r6 = defpackage.fddu.r(r7, r6)
            int r8 = r6.a
            int r6 = r6.b
            if (r8 > r6) goto Lb4
        L68:
            java.lang.Object[] r9 = r3.a
            r9 = r9[r6]
            dsn r9 = (defpackage.dsn) r9
            fdae r9 = r9.a
            java.lang.Object r9 = r9.invoke()
            if (r9 != 0) goto L77
            goto Laf
        L77:
            r10 = r9
            ihu r10 = (defpackage.ihu) r10
            r11 = r5
            ihu r11 = (defpackage.ihu) r11
            ihu r10 = r11.d(r10)
            boolean r11 = defpackage.fdbq.f(r10, r5)
            if (r11 == 0) goto L8c
            int r6 = r6 + r1
            r3.f(r6, r4)
            goto Lb7
        L8c:
            boolean r9 = defpackage.fdbq.f(r10, r9)
            if (r9 != 0) goto Laf
            java.util.concurrent.CancellationException r9 = new java.util.concurrent.CancellationException
            java.lang.String r10 = "bringIntoView call interrupted by a newer, non-overlapping call"
            r9.<init>(r10)
            int r10 = r3.b
            int r10 = r10 + (-1)
            if (r10 > r6) goto Laf
        L9f:
            java.lang.Object[] r11 = r3.a
            r11 = r11[r6]
            dsn r11 = (defpackage.dsn) r11
            fdis r11 = r11.b
            r11.h(r9)
            if (r10 == r6) goto Laf
            int r10 = r10 + 1
            goto L9f
        Laf:
            if (r6 == r8) goto Lb4
            int r6 = r6 + (-1)
            goto L68
        Lb4:
            r3.f(r7, r4)
        Lb7:
            boolean r1 = r13.j
            if (r1 != 0) goto Lbe
            r13.g()
        Lbe:
            java.lang.Object r13 = r2.m()
            if (r13 == r0) goto Lc6
        Lc4:
            fctx r13 = defpackage.fctx.a
        Lc6:
            if (r13 != r0) goto Lc9
            return r0
        Lc9:
            fctx r13 = defpackage.fctx.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eul.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new eul(this.b, this.c, this.d, fcxyVar);
    }
}
