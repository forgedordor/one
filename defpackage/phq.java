package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class phq extends fcyz implements fdat {
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ pex f;
    final /* synthetic */ fdap g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public phq(boolean z, boolean z2, pex pexVar, fcxy fcxyVar, fdap fdapVar) {
        super(2, fcxyVar);
        this.d = z;
        this.e = z2;
        this.f = pexVar;
        this.g = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((phq) c((pft) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r7.a(r6) != r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f A[PHI: r1 r7
      0x008f: PHI (r1v9 pft) = (r1v8 pft), (r1v15 pft) binds: [B:29:0x008d, B:8:0x0016] A[DONT_GENERATE, DONT_INLINE]
      0x008f: PHI (r7v15 java.lang.Object) = (r7v14 java.lang.Object), (r7v0 java.lang.Object) binds: [B:29:0x008d, B:8:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b2 A[RETURN] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.b
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L35
            if (r1 == r4) goto L2b
            if (r1 == r3) goto L1f
            if (r1 == r2) goto L16
            java.lang.Object r0 = r6.c
            defpackage.fctl.b(r7)
            goto La0
        L16:
            java.lang.Object r1 = r6.c
            pft r1 = (defpackage.pft) r1
            defpackage.fctl.b(r7)
            goto L8f
        L1f:
            java.lang.Object r1 = r6.a
            java.lang.Object r3 = r6.c
            pft r3 = (defpackage.pft) r3
            defpackage.fctl.b(r7)
            r5 = r1
            r1 = r3
            goto L79
        L2b:
            java.lang.Object r1 = r6.a
            java.lang.Object r4 = r6.c
            pft r4 = (defpackage.pft) r4
            defpackage.fctl.b(r7)
            goto L5b
        L35:
            defpackage.fctl.b(r7)
            java.lang.Object r7 = r6.c
            pft r7 = (defpackage.pft) r7
            boolean r1 = r6.d
            if (r1 == 0) goto Lb4
            boolean r1 = r6.e
            if (r1 == 0) goto L47
            pfs r5 = defpackage.pfs.a
            goto L49
        L47:
            pfs r5 = defpackage.pfs.b
        L49:
            if (r1 != 0) goto L78
            r6.c = r7
            r6.a = r5
            r6.b = r4
            java.lang.Object r1 = r7.c()
            if (r1 != r0) goto L58
            goto Lb3
        L58:
            r4 = r7
            r7 = r1
            r1 = r5
        L5b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L75
            pex r7 = r6.f
            pdz r7 = r7.b()
            r6.c = r4
            r6.a = r1
            r6.b = r3
            java.lang.Object r7 = r7.a(r6)
            if (r7 == r0) goto Lb3
        L75:
            r5 = r1
            r1 = r4
            goto L79
        L78:
            r1 = r7
        L79:
            fdap r7 = r6.g
            php r3 = new php
            r4 = 0
            r3.<init>(r4, r7)
            r6.c = r1
            r6.a = r4
            r6.b = r2
            pfs r5 = (defpackage.pfs) r5
            java.lang.Object r7 = r1.b(r5, r3, r6)
            if (r7 == r0) goto Lb3
        L8f:
            boolean r2 = r6.e
            if (r2 != 0) goto Lb2
            r6.c = r7
            r2 = 4
            r6.b = r2
            java.lang.Object r1 = r1.c()
            if (r1 == r0) goto Lb3
            r0 = r7
            r7 = r1
        La0:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto Lb1
            pex r7 = r6.f
            pdz r7 = r7.b()
            r7.b()
        Lb1:
            return r0
        Lb2:
            return r7
        Lb3:
            return r0
        Lb4:
            r7.getClass()
            pgu r7 = (defpackage.pgu) r7
            pgz r7 = r7.d()
            fdap r0 = r6.g
            java.lang.Object r7 = r0.invoke(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.phq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        phq phqVar = new phq(this.d, this.e, this.f, fcxyVar, this.g);
        phqVar.c = obj;
        return phqVar;
    }
}
