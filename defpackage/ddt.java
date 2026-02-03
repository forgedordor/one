package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ddt extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ fdoa c;
    final /* synthetic */ ddp d;
    final /* synthetic */ hsf e;
    final /* synthetic */ hsf f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddt(fdoa fdoaVar, ddp ddpVar, hsf hsfVar, hsf hsfVar2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = fdoaVar;
        this.d = ddpVar;
        this.e = hsfVar;
        this.f = hsfVar2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ddt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0029 -> B:9:0x002c). Please report as a decompilation issue!!! */
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
            if (r1 == 0) goto L10
            java.lang.Object r1 = r10.a
            java.lang.Object r2 = r10.g
            fdjx r2 = (defpackage.fdjx) r2
            defpackage.fctl.b(r11)
            goto L2c
        L10:
            defpackage.fctl.b(r11)
            java.lang.Object r11 = r10.g
            fdjx r11 = (defpackage.fdjx) r11
            fdoa r1 = r10.c
            fdoc r1 = r1.r()
            r2 = r11
        L1e:
            r10.g = r2
            r10.a = r1
            r11 = 1
            r10.b = r11
            java.lang.Object r11 = r1.a(r10)
            if (r11 != r0) goto L2c
            return r0
        L2c:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L59
            java.lang.Object r11 = r1.b()
            fdoa r3 = r10.c
            java.lang.Object r3 = r3.m()
            java.lang.Object r3 = defpackage.fdog.a(r3)
            if (r3 == 0) goto L46
            r5 = r3
            goto L47
        L46:
            r5 = r11
        L47:
            ddp r6 = r10.d
            hsf r7 = r10.e
            hsf r8 = r10.f
            dds r4 = new dds
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r11 = 3
            r3 = 0
            defpackage.fdil.d(r2, r3, r3, r4, r11)
            goto L1e
        L59:
            fctx r11 = defpackage.fctx.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddt.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ddt ddtVar = new ddt(this.c, this.d, this.e, this.f, fcxyVar);
        ddtVar.g = obj;
        return ddtVar;
    }
}
