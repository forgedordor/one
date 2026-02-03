package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djji extends fcyz implements fdau {
    int a;
    final /* synthetic */ fdci b;
    final /* synthetic */ hox c;
    final /* synthetic */ hox d;
    final /* synthetic */ hox e;
    final /* synthetic */ djjn f;
    final /* synthetic */ iqa g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djji(fdci fdciVar, hox hoxVar, hox hoxVar2, hox hoxVar3, djjn djjnVar, iqa iqaVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.b = fdciVar;
        this.c = hoxVar;
        this.d = hoxVar2;
        this.e = hoxVar3;
        this.f = djjnVar;
        this.g = iqaVar;
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        long j = ((ihs) obj2).a;
        djji djjiVar = new djji(this.b, this.c, this.d, this.e, this.f, this.g, (fcxy) obj3);
        djjiVar.h = (dwn) obj;
        return djjiVar.b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r4 == r0) goto L23;
     */
    /* JADX WARN: Type inference failed for: r4v1, types: [dwn, java.lang.Object] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) throws java.lang.Throwable {
        /*
            r3 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r3.a
            r2 = 1
            defpackage.fctl.b(r4)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L17
            goto L29
        Ld:
            java.lang.Object r4 = r3.h
            r3.a = r2
            java.lang.Object r4 = r4.b(r3)
            if (r4 == r0) goto L6e
        L17:
            fdci r4 = r3.b
            java.lang.Object r4 = r4.a
            fdkf r4 = (defpackage.fdkf) r4
            if (r4 == 0) goto L2b
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = r4.c(r3)
            if (r4 != r0) goto L29
            goto L6e
        L29:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
        L2b:
            hox r4 = r3.c
            java.lang.Object r4 = r4.a()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0 = 0
            if (r4 != 0) goto L62
            hox r4 = r3.d
            java.lang.Object r4 = r4.a()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L62
            hox r4 = r3.e
            java.lang.Object r4 = r4.a()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L62
            djjn r4 = r3.f
            fdae r4 = r4.e
            r4.invoke()
            iqa r4 = r3.g
            r4.a(r0)
        L62:
            hox r4 = r3.e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.b(r0)
            fctx r4 = defpackage.fctx.a
            return r4
        L6e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djji.b(java.lang.Object):java.lang.Object");
    }
}
