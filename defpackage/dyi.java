package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dyi extends fcyz implements fdat {
    long a;
    int b;
    /* synthetic */ long c;
    final /* synthetic */ dyk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyi(dyk dykVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = dykVar;
    }

    @Override // defpackage.fdat
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dyi) c(new kjo(((kjo) obj).a), (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r11.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1c
            if (r1 == r2) goto L14
            long r0 = r11.a
            long r2 = r11.c
            defpackage.fctl.b(r12)
            goto L67
        L14:
            long r1 = r11.a
            long r3 = r11.c
            defpackage.fctl.b(r12)
            goto L4b
        L1c:
            long r3 = r11.c
            defpackage.fctl.b(r12)
            goto L34
        L22:
            defpackage.fctl.b(r12)
            long r4 = r11.c
            dyk r12 = r11.d
            iqt r12 = r12.f
            r11.b = r3
            java.lang.Object r12 = r12.e(r4, r11)
            if (r12 == r0) goto L79
            r3 = r4
        L34:
            kjo r12 = (defpackage.kjo) r12
            long r5 = r12.a
            long r5 = defpackage.kjo.c(r3, r5)
            dyk r12 = r11.d
            r11.c = r3
            r11.a = r5
            r11.b = r2
            java.lang.Object r12 = r12.a(r5, r11)
            if (r12 == r0) goto L79
            r1 = r5
        L4b:
            kjo r12 = (defpackage.kjo) r12
            long r8 = r12.a
            dyk r12 = r11.d
            iqt r5 = r12.f
            long r6 = defpackage.kjo.c(r1, r8)
            r11.c = r3
            r11.a = r8
            r12 = 3
            r11.b = r12
            r10 = r11
            java.lang.Object r12 = r5.d(r6, r8, r10)
            if (r12 == r0) goto L79
            r2 = r3
            r0 = r8
        L67:
            kjo r12 = (defpackage.kjo) r12
            long r4 = r12.a
            long r0 = defpackage.kjo.c(r0, r4)
            long r0 = defpackage.kjo.c(r2, r0)
            kjo r12 = new kjo
            r12.<init>(r0)
            return r12
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyi.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dyi dyiVar = new dyi(this.d, fcxyVar);
        dyiVar.c = ((kjo) obj).a;
        return dyiVar;
    }
}
