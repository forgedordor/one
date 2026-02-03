package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dake extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fdat c;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dake(fcxy fcxyVar, fdat fdatVar, Object obj) {
        super(3, fcxyVar);
        this.c = fdatVar;
        this.d = obj;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dake dakeVar = new dake((fcxy) obj3, this.c, this.d);
        dakeVar.e = (fdpm) obj;
        dakeVar.b = obj2;
        return dakeVar.b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (r6 != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (defpackage.fdpy.c(r1, r4, r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [fdpm] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 == r3) goto Le
            defpackage.fctl.b(r6)
            goto L53
        Le:
            java.lang.Object r1 = r5.e
            defpackage.fctl.b(r6)     // Catch: java.lang.Exception -> L14
            goto L2b
        L14:
            r6 = move-exception
            goto L3d
        L16:
            defpackage.fctl.b(r6)
            java.lang.Object r1 = r5.e
            java.lang.Object r6 = r5.b
            fctx r6 = (defpackage.fctx) r6
            fdat r6 = r5.c     // Catch: java.lang.Exception -> L14
            java.lang.Object r4 = r5.d     // Catch: java.lang.Exception -> L14
            r5.a = r3     // Catch: java.lang.Exception -> L14
            java.lang.Object r6 = r6.a(r4, r5)     // Catch: java.lang.Exception -> L14
            if (r6 == r0) goto L52
        L2b:
            fdpl r6 = (defpackage.fdpl) r6     // Catch: java.lang.Exception -> L14
            dakh r3 = new dakh     // Catch: java.lang.Exception -> L14
            r3.<init>(r6)     // Catch: java.lang.Exception -> L14
            dakd r6 = new dakd     // Catch: java.lang.Exception -> L14
            r6.<init>(r2)     // Catch: java.lang.Exception -> L14
            fdrc r4 = new fdrc     // Catch: java.lang.Exception -> L14
            r4.<init>(r3, r6)     // Catch: java.lang.Exception -> L14
            goto L47
        L3d:
            dajx r3 = new dajx
            r3.<init>(r6)
            fdpu r4 = new fdpu
            r4.<init>(r3)
        L47:
            r5.e = r2
            r6 = 2
            r5.a = r6
            java.lang.Object r6 = defpackage.fdpy.c(r1, r4, r5)
            if (r6 != r0) goto L53
        L52:
            return r0
        L53:
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dake.b(java.lang.Object):java.lang.Object");
    }
}
