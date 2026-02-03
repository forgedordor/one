package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amsb extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ amsc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amsb(amsc amscVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = amscVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amsb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0085 A[RETURN] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.c
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2a
            if (r1 == r3) goto L1e
            if (r1 == r2) goto L12
            defpackage.fctl.b(r8)
            goto L85
        L12:
            java.lang.Object r1 = r7.b
            amlm r1 = (defpackage.amlm) r1
            java.lang.Object r2 = r7.a
            amsc r2 = (defpackage.amsc) r2
            defpackage.fctl.b(r8)
            goto L70
        L1e:
            java.lang.Object r1 = r7.b
            amsc r1 = (defpackage.amsc) r1
            java.lang.Object r3 = r7.a
            eiju r3 = (defpackage.eiju) r3
            defpackage.fctl.b(r8)
            goto L58
        L2a:
            defpackage.fctl.b(r8)
            amsc r8 = r7.d
            java.util.concurrent.atomic.AtomicBoolean r1 = r8.i
            boolean r1 = r1.get()
            if (r1 == 0) goto L38
            return r4
        L38:
            anpj r1 = r8.e
            anpj r5 = r8.d
            eiju r1 = r1.b()
            eiju r5 = r5.b()
            r1.getClass()
            r7.a = r5
            r7.b = r8
            r7.c = r3
            java.lang.Object r1 = defpackage.fdxs.c(r1, r7)
            if (r1 != r0) goto L54
            goto L86
        L54:
            r3 = r1
            r1 = r8
            r8 = r3
            r3 = r5
        L58:
            r8.getClass()
            amlm r8 = (defpackage.amlm) r8
            r3.getClass()
            r7.a = r1
            r7.b = r8
            r7.c = r2
            java.lang.Object r2 = defpackage.fdxs.c(r3, r7)
            if (r2 == r0) goto L86
            r6 = r1
            r1 = r8
            r8 = r2
            r2 = r6
        L70:
            r8.getClass()
            ajts r8 = (defpackage.ajts) r8
            r7.a = r4
            r7.b = r4
            r3 = 3
            r7.c = r3
            eksp r3 = defpackage.amsc.a
            java.lang.Object r8 = r2.h(r1, r8, r7)
            if (r8 != r0) goto L85
            goto L86
        L85:
            return r4
        L86:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amsb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new amsb(this.d, fcxyVar);
    }
}
