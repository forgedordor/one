package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lln extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ fdcg c;
    final /* synthetic */ llo d;
    final /* synthetic */ Object e;
    final /* synthetic */ boolean f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lln(fdcg fdcgVar, llo lloVar, Object obj, boolean z, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = fdcgVar;
        this.d = lloVar;
        this.e = obj;
        this.f = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lln) c((lme) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
    
        if (r6 == r0) goto L24;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.b
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 == r2) goto Ld
            defpackage.fctl.b(r6)
            goto L5e
        Ld:
            java.lang.Object r1 = r5.a
            java.lang.Object r2 = r5.g
            lme r2 = (defpackage.lme) r2
            defpackage.fctl.b(r6)
            goto L35
        L17:
            defpackage.fctl.b(r6)
            java.lang.Object r6 = r5.g
            lme r6 = (defpackage.lme) r6
            fdcg r1 = r5.c
            llo r3 = r5.d
            lmg r3 = r3.c()
            r5.g = r6
            r5.a = r1
            r5.b = r2
            java.lang.Object r2 = r3.e()
            if (r2 == r0) goto L7f
            r4 = r2
            r2 = r6
            r6 = r4
        L35:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            fdcg r1 = (defpackage.fdcg) r1
            r1.a = r6
            java.lang.Object r6 = r5.e
            r1 = 0
            r5.g = r1
            r5.a = r1
            r3 = 2
            r5.b = r3
            r2.c()
            lmd r3 = new lmd
            r3.<init>(r2, r6, r1)
            java.io.File r6 = r2.a
            java.lang.Object r6 = defpackage.lmc.a(r6, r3, r5)
            if (r6 == r0) goto L5b
            fctx r6 = defpackage.fctx.a
        L5b:
            if (r6 != r0) goto L5e
            goto L7f
        L5e:
            boolean r6 = r5.f
            if (r6 == 0) goto L7c
            llo r6 = r5.d
            java.lang.Object r0 = r5.e
            ljt r1 = new ljt
            if (r0 == 0) goto L6f
            int r2 = r0.hashCode()
            goto L70
        L6f:
            r2 = 0
        L70:
            llp r6 = r6.c
            fdcg r3 = r5.c
            int r3 = r3.a
            r1.<init>(r0, r2, r3)
            r6.b(r1)
        L7c:
            fctx r6 = defpackage.fctx.a
            return r6
        L7f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lln.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        lln llnVar = new lln(this.c, this.d, this.e, this.f, fcxyVar);
        llnVar.g = obj;
        return llnVar;
    }
}
