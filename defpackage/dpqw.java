package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpqw extends fcyy implements fdat {
    float a;
    long b;
    int c;
    final /* synthetic */ dprl d;
    final /* synthetic */ dppy e;
    final /* synthetic */ dplv f;
    final /* synthetic */ hox g;
    final /* synthetic */ hsf h;
    final /* synthetic */ hsf i;
    private /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpqw(dprl dprlVar, dppy dppyVar, dplv dplvVar, hox hoxVar, hsf hsfVar, hsf hsfVar2, fcxy fcxyVar) {
        super(fcxyVar);
        this.d = dprlVar;
        this.e = dppyVar;
        this.f = dplvVar;
        this.g = hoxVar;
        this.h = hsfVar;
        this.i = hsfVar2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpqw) c((ire) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0041 -> B:8:0x0043). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r10.c
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L14
            long r4 = r10.b
            float r1 = r10.a
            java.lang.Object r6 = r10.j
            ire r6 = (defpackage.ire) r6
            defpackage.fctl.b(r11)
            goto L43
        L14:
            defpackage.fctl.b(r11)
            java.lang.Object r11 = r10.j
            ire r11 = (defpackage.ire) r11
            hox r1 = r10.g
            defpackage.dprg.g(r1, r3)
            hsf r1 = r10.h
            hsf r4 = r10.i
            dprl r5 = r10.d
            float r1 = defpackage.dprg.a(r1)
            long r6 = defpackage.dprg.c(r4)
            java.lang.String r4 = "Beginning to detect transformation"
            defpackage.dprg.f(r5, r4)
            r4 = r6
            r6 = r11
        L35:
            r10.j = r6
            r10.a = r1
            r10.b = r4
            r10.c = r2
            java.lang.Object r11 = defpackage.ird.a(r6, r10)
            if (r11 == r0) goto Lbf
        L43:
            hox r7 = r10.g
            irs r11 = (defpackage.irs) r11
            boolean r8 = defpackage.dprg.h(r7)
            if (r8 != 0) goto L6d
            hsf r8 = r10.h
            float r8 = defpackage.dprg.a(r8)
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 != 0) goto L63
            hsf r8 = r10.i
            long r8 = defpackage.dprg.c(r8)
            boolean r8 = defpackage.ihs.h(r8, r4)
            if (r8 != 0) goto L6d
        L63:
            defpackage.dprg.g(r7, r2)
            dprl r8 = r10.d
            java.lang.String r9 = "Transformation detected and marked as active"
            defpackage.dprg.f(r8, r9)
        L6d:
            java.util.List r11 = r11.a
            boolean r8 = r11.isEmpty()
            if (r8 == 0) goto L76
            goto L8b
        L76:
            java.util.Iterator r11 = r11.iterator()
        L7a:
            boolean r8 = r11.hasNext()
            if (r8 == 0) goto L8b
            java.lang.Object r8 = r11.next()
            ise r8 = (defpackage.ise) r8
            boolean r8 = r8.d
            if (r8 == 0) goto L7a
            goto L35
        L8b:
            dppy r11 = r10.e
            dpsb r11 = (defpackage.dpsb) r11
            boolean r11 = r11.d
            if (r11 == 0) goto Lac
            dprl r11 = r10.d
            boolean r11 = r11.c()
            if (r11 != 0) goto Lac
            dplv r11 = r10.f
            boolean r0 = r11.b()
            if (r0 != 0) goto Lac
            boolean r0 = defpackage.dprg.h(r7)
            if (r0 == 0) goto Lac
            r11.g()
        Lac:
            boolean r11 = defpackage.dprg.h(r7)
            if (r11 == 0) goto Lb9
            dprl r11 = r10.d
            java.lang.String r0 = "Transformation ended and will be marked as completed"
            defpackage.dprg.f(r11, r0)
        Lb9:
            defpackage.dprg.g(r7, r3)
            fctx r11 = defpackage.fctx.a
            return r11
        Lbf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpqw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dpqw dpqwVar = new dpqw(this.d, this.e, this.f, this.g, this.h, this.i, fcxyVar);
        dpqwVar.j = obj;
        return dpqwVar;
    }
}
