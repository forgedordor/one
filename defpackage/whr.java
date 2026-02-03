package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class whr extends fcyz implements fdat {
    int a;
    final /* synthetic */ wiq b;
    final /* synthetic */ vvs c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public whr(fcxy fcxyVar, wiq wiqVar, vvs vvsVar) {
        super(2, fcxyVar);
        this.b = wiqVar;
        this.c = vvsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((whr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0094, code lost:
    
        if (r8 != r0) goto L20;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r7.a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1e
            if (r1 == r3) goto L12
            defpackage.fctl.b(r8)
            goto L97
        L12:
            java.lang.Object r1 = r7.d
            wlk r1 = (defpackage.wlk) r1
            defpackage.fctl.b(r8)
            whq r8 = (defpackage.whq) r8
            vvs r8 = r8.a
            goto L86
        L1e:
            defpackage.fctl.b(r8)
            goto L44
        L22:
            defpackage.fctl.b(r8)
            java.lang.Object r8 = r7.d
            fdjx r8 = (defpackage.fdjx) r8
            wiq r8 = r7.b
            fcsu r1 = r8.o
            java.lang.Object r1 = r1.b()
            vth r1 = (defpackage.vth) r1
            vvs r5 = r7.c
            vvl r6 = r5.a()
            r1.a(r6)
            r7.a = r4
            java.lang.Object r8 = r8.g(r5, r7)
            if (r8 == r0) goto Ld4
        L44:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L70
            wiq r8 = r7.b
            fcsu r0 = r8.o
            java.lang.Object r0 = r0.b()
            vth r0 = (defpackage.vth) r0
            vvs r1 = r7.c
            wre r8 = r8.f
            fdvc r8 = r8.a
            java.lang.Object r8 = r8.c()
            vvw r8 = (defpackage.vvw) r8
            java.util.List r8 = r8.b
            int r8 = r8.size()
            r0.b(r1, r8)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L70:
            wiq r8 = r7.b
            fdvc r1 = r8.p
            java.lang.Object r1 = r1.c()
            wlk r1 = (defpackage.wlk) r1
            vvs r4 = r7.c
            r7.d = r1
            r7.a = r3
            java.lang.Object r8 = r8.e(r4, r7)
            if (r8 == r0) goto Ld4
        L86:
            wiq r3 = r7.b
            vvs r8 = (defpackage.vvs) r8
            r4 = 0
            r7.d = r4
            r4 = 3
            r7.a = r4
            java.lang.Object r8 = r3.c(r8, r1, r7)
            if (r8 != r0) goto L97
            goto Ld4
        L97:
            whp r8 = (defpackage.whp) r8
            if (r8 == 0) goto La1
            wmq r0 = r8.a
            wmq r1 = defpackage.wmq.g
            if (r0 == r1) goto Lc9
        La1:
            wiq r0 = r7.b
            fcsu r1 = r0.o
            java.lang.Object r1 = r1.b()
            vth r1 = (defpackage.vth) r1
            vvs r3 = r7.c
            if (r8 == 0) goto Lb6
            java.util.List r0 = r8.b
            int r0 = r0.size()
            goto Lc6
        Lb6:
            wre r0 = r0.f
            fdvc r0 = r0.a
            java.lang.Object r0 = r0.c()
            vvw r0 = (defpackage.vvw) r0
            java.util.List r0 = r0.b
            int r0 = r0.size()
        Lc6:
            r1.b(r3, r0)
        Lc9:
            if (r8 == 0) goto Lcf
            wmq r8 = r8.a
            boolean r2 = r8.h
        Lcf:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        Ld4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.whr.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        whr whrVar = new whr(fcxyVar, this.b, this.c);
        whrVar.d = obj;
        return whrVar;
    }
}
