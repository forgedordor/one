package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahzq extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ ahzs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahzq(ahzs ahzsVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = ahzsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahzq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cb, code lost:
    
        if (r2.a(r11, r10) != r0) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r10.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 == r2) goto L11
            defpackage.fctl.b(r11)
            goto Lce
        L11:
            java.lang.Object r1 = r10.a
            defpackage.fctl.b(r11)
            goto L80
        L17:
            defpackage.fctl.b(r11)
            goto L30
        L1b:
            defpackage.fctl.b(r11)
            ahzs r11 = r10.c
            fcsu r11 = r11.a
            java.lang.Object r11 = r11.b()
            ahwd r11 = (defpackage.ahwd) r11
            r10.b = r3
            java.lang.Object r11 = r11.k(r10)
            if (r11 == r0) goto Ld1
        L30:
            ahzs r1 = r10.c
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r11 = r11.iterator()
        L3d:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L5d
            java.lang.Object r4 = r11.next()
            r5 = r4
            ahto r5 = (defpackage.ahto) r5
            android.content.Context r6 = r1.b
            cswl r6 = defpackage.cswl.a(r6)
            int r6 = r6.b
            long r6 = (long) r6
            long r8 = r5.g
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 <= 0) goto L3d
            r3.add(r4)
            goto L3d
        L5d:
            ahzu r11 = r1.c
            int r4 = r3.size()
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            java.lang.String r4 = "Found %d executions waiting for app update after boot complete"
            r11.b(r4, r5)
            fcsu r11 = r1.a
            java.lang.Object r11 = r11.b()
            ahwd r11 = (defpackage.ahwd) r11
            r10.a = r3
            r10.b = r2
            java.lang.Object r11 = r11.l(r10)
            if (r11 == r0) goto Ld1
            r1 = r3
        L80:
            ahzs r2 = r10.c
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r11 = r11.iterator()
        L8d:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto Lad
            java.lang.Object r4 = r11.next()
            r5 = r4
            ahto r5 = (defpackage.ahto) r5
            android.content.Context r6 = r2.b
            cswl r6 = defpackage.cswl.a(r6)
            int r6 = r6.b
            long r6 = (long) r6
            long r8 = r5.g
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 <= 0) goto L8d
            r3.add(r4)
            goto L8d
        Lad:
            ahzu r11 = r2.c
            int r4 = r3.size()
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            java.lang.String r4 = "Found %d executions waiting for reprompt after package replaced"
            r11.b(r4, r5)
            java.util.List r11 = defpackage.fcva.ah(r1, r3)
            r1 = 0
            r10.a = r1
            r1 = 3
            r10.b = r1
            java.lang.Object r11 = r2.a(r11, r10)
            if (r11 != r0) goto Lce
            goto Ld1
        Lce:
            fctx r11 = defpackage.fctx.a
            return r11
        Ld1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahzq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ahzq(this.c, fcxyVar);
    }
}
