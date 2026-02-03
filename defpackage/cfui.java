package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfui extends fcyz implements fdat {
    int a;
    final /* synthetic */ ezkl b;
    final /* synthetic */ cfut c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfui(ezkl ezklVar, cfut cfutVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ezklVar;
        this.c = cfutVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfui) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002f -> B:13:0x0031). Please report as a decompilation issue!!! */
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
            r2 = 1
            if (r1 == 0) goto Le
            if (r1 == r2) goto La
            goto Le
        La:
            defpackage.fctl.b(r8)
            goto L31
        Le:
            defpackage.fctl.b(r8)
        L11:
            long r3 = defpackage.fdhi.a
            ezkl r8 = r7.b
            ezjz r8 = r8.d
            if (r8 != 0) goto L1b
            ezjz r8 = defpackage.ezjz.a
        L1b:
            r3 = 10
            long r5 = r8.b
            long r3 = java.lang.Math.max(r3, r5)
            fdhl r8 = defpackage.fdhl.d
            long r3 = defpackage.fdhk.g(r3, r8)
            r7.a = r2
            java.lang.Object r8 = defpackage.fdkj.d(r3, r7)
            if (r8 == r0) goto L79
        L31:
            ekrg r8 = defpackage.cfut.a
            ezlb r8 = defpackage.ezlb.a
            evsf r8 = r8.createBuilder()
            ezkn r8 = (defpackage.ezkn) r8
            r8.getClass()
            ezkw r1 = defpackage.ezkw.a
            evsf r1 = r1.createBuilder()
            ezkv r1 = (defpackage.ezkv) r1
            r1.getClass()
            evsn r1 = r1.build()
            r1.getClass()
            ezkw r1 = (defpackage.ezkw) r1
            r8.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r3 = r8.instance
            ezlb r3 = (defpackage.ezlb) r3
            r3.c = r1
            r1 = 3
            r3.b = r1
            evsn r8 = r8.build()
            r8.getClass()
            ezlb r8 = (defpackage.ezlb) r8
            fctk r1 = new fctk
            r1.<init>(r8)
            r8 = 2
            r7.a = r8
            cfut r8 = r7.c
            fdue r8 = r8.j
            java.lang.Object r8 = r8.fO(r1, r7)
            if (r8 != r0) goto L11
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfui.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cfui(this.b, this.c, fcxyVar);
    }
}
