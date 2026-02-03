package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdky extends fcyz implements fdat {
    int a;
    final /* synthetic */ cdla b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdky(fcxy fcxyVar, cdla cdlaVar) {
        super(2, fcxyVar);
        this.b = cdlaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdky) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a7, code lost:
    
        if (r0.a(r5, r2, r4, true, r3, r14, r7, r15) == r9) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r16) throws java.lang.Throwable {
        /*
            r15 = this;
            fcyl r9 = defpackage.fcyl.a
            int r0 = r15.a
            r1 = 1
            defpackage.fctl.b(r16)
            if (r0 == 0) goto L11
            if (r0 == r1) goto Le
            goto Laa
        Le:
            r0 = r16
            goto L2d
        L11:
            java.lang.Object r0 = r15.c
            fdjx r0 = (defpackage.fdjx) r0
            cdla r0 = r15.b
            fcsu r0 = r0.d
            java.lang.Object r0 = r0.b()
            cdku r0 = (defpackage.cdku) r0
            cmfo r0 = r0.c
            eiju r0 = r0.h()
            r15.a = r1
            java.lang.Object r0 = defpackage.fdxs.c(r0, r15)
            if (r0 == r9) goto Lad
        L2d:
            cdjt r0 = (defpackage.cdjt) r0
            j$.time.Instant r2 = j$.time.Instant.EPOCH
            j$.time.Instant r3 = j$.time.Instant.EPOCH
            j$.time.Instant r4 = j$.time.Instant.EPOCH
            boolean r5 = r0.e
            r6 = 2
            if (r1 == r5) goto L3c
            r5 = r1
            goto L3d
        L3c:
            r5 = r6
        L3d:
            long r10 = r0.d
            r12 = 0
            int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            r14 = 0
            if (r7 <= 0) goto L7b
            j$.time.Instant r2 = j$.time.Instant.ofEpochMilli(r10)
            boolean r7 = r0.e
            if (r7 == 0) goto L55
            long r10 = r0.d
            j$.time.Instant r3 = j$.time.Instant.ofEpochMilli(r10)
            goto L7b
        L55:
            evvp r4 = r0.g
            if (r4 != 0) goto L5b
            evvp r4 = defpackage.evvp.a
        L5b:
            long r10 = r4.b
            int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r4 <= 0) goto L6e
            evvp r3 = r0.g
            if (r3 != 0) goto L67
            evvp r3 = defpackage.evvp.a
        L67:
            long r3 = r3.b
            j$.time.Instant r3 = j$.time.Instant.ofEpochSecond(r3)
            r5 = r6
        L6e:
            long r10 = r0.d
            j$.time.Instant r4 = j$.time.Instant.ofEpochMilli(r10)
            r7 = 4
            r14 = r7
            r7 = r4
            r4 = r5
            r5 = r14
            r14 = r1
            goto L7d
        L7b:
            r7 = r4
            r4 = r5
        L7d:
            boolean r10 = r0.f
            if (r10 == 0) goto L8e
            evvp r0 = r0.g
            if (r0 != 0) goto L87
            evvp r0 = defpackage.evvp.a
        L87:
            long r3 = r0.b
            j$.time.Instant r3 = j$.time.Instant.ofEpochSecond(r3)
            r4 = 3
        L8e:
            if (r5 == r1) goto Laa
            cdla r0 = r15.b
            r2.getClass()
            r3.getClass()
            r7.getClass()
            r15.a = r6
            r1 = r5
            r5 = r3
            r3 = r4
            r4 = 1
            r8 = r15
            r6 = r14
            java.lang.Object r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 != r9) goto Laa
            goto Lad
        Laa:
            fctx r0 = defpackage.fctx.a
            return r0
        Lad:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdky.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cdky cdkyVar = new cdky(fcxyVar, this.b);
        cdkyVar.c = obj;
        return cdkyVar;
    }
}
