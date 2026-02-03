package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egwu extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ fdat c;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egwu(fdat fdatVar, Object obj, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = fdatVar;
        this.d = obj;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((egwu) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(1:(1:(3:6|27|28)(5:7|32|8|19|24))(1:12))(3:13|(1:15)|29)|30|16|(3:18|19|24)|29|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        r5 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        if (r1.fO(r5, r4) == r0) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r4.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1c
            if (r1 == r2) goto L10
            defpackage.fctl.b(r5)
            goto L6e
        L10:
            java.lang.Object r1 = r4.a
            java.lang.Object r2 = r4.e
            fdpm r2 = (defpackage.fdpm) r2
            defpackage.fctl.b(r5)     // Catch: java.lang.Throwable -> L1a
            goto L4c
        L1a:
            r5 = move-exception
            goto L54
        L1c:
            java.lang.Object r1 = r4.e
            fdpm r1 = (defpackage.fdpm) r1
            defpackage.fctl.b(r5)
            goto L3b
        L24:
            defpackage.fctl.b(r5)
            java.lang.Object r5 = r4.e
            fdpm r5 = (defpackage.fdpm) r5
            egwz r1 = new egwz
            r1.<init>()
            r4.e = r5
            r4.b = r3
            java.lang.Object r1 = r5.fO(r1, r4)
            if (r1 == r0) goto L71
            r1 = r5
        L3b:
            fdat r5 = r4.c     // Catch: java.lang.Throwable -> L52
            java.lang.Object r3 = r4.d     // Catch: java.lang.Throwable -> L52
            r4.e = r1     // Catch: java.lang.Throwable -> L52
            r4.a = r1     // Catch: java.lang.Throwable -> L52
            r4.b = r2     // Catch: java.lang.Throwable -> L52
            java.lang.Object r5 = r5.a(r3, r4)     // Catch: java.lang.Throwable -> L52
            if (r5 == r0) goto L71
            r2 = r1
        L4c:
            eguy r3 = new eguy     // Catch: java.lang.Throwable -> L1a
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L1a
            goto L5a
        L52:
            r5 = move-exception
            r2 = r1
        L54:
            egux r3 = new egux
            r3.<init>(r5)
            r1 = r2
        L5a:
            egwy r5 = new egwy
            r5.<init>(r3)
            r2 = 0
            r4.e = r2
            r4.a = r2
            r2 = 3
            r4.b = r2
            java.lang.Object r5 = r1.fO(r5, r4)
            if (r5 != r0) goto L6e
            goto L71
        L6e:
            fctx r5 = defpackage.fctx.a
            return r5
        L71:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egwu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        egwu egwuVar = new egwu(this.c, this.d, fcxyVar);
        egwuVar.e = obj;
        return egwuVar;
    }
}
