package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jmy extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ fdoa d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmy(fdoa fdoaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = fdoaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((jmy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e A[Catch: all -> 0x0045, TRY_LEAVE, TryCatch #0 {all -> 0x0045, blocks: (B:5:0x000a, B:12:0x0026, B:14:0x002e, B:9:0x0018, B:8:0x0013), top: B:23:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:12:0x0026). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r4.c
            if (r1 == 0) goto Le
            java.lang.Object r1 = r4.b
            java.lang.Object r2 = r4.a
            defpackage.fctl.b(r5)     // Catch: java.lang.Throwable -> L45
            goto L26
        Le:
            defpackage.fctl.b(r5)
            fdoa r2 = r4.d
            fdoc r5 = r2.r()     // Catch: java.lang.Throwable -> L45
            r1 = r5
        L18:
            r4.a = r2     // Catch: java.lang.Throwable -> L45
            r4.b = r1     // Catch: java.lang.Throwable -> L45
            r5 = 1
            r4.c = r5     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = r1.a(r4)     // Catch: java.lang.Throwable -> L45
            if (r5 != r0) goto L26
            return r0
        L26:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L45
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L45
            if (r5 == 0) goto L3e
            java.lang.Object r5 = r1.b()     // Catch: java.lang.Throwable -> L45
            fctx r5 = (defpackage.fctx) r5     // Catch: java.lang.Throwable -> L45
            java.util.concurrent.atomic.AtomicBoolean r5 = defpackage.jna.b     // Catch: java.lang.Throwable -> L45
            r3 = 0
            r5.set(r3)     // Catch: java.lang.Throwable -> L45
            defpackage.hzf.f()     // Catch: java.lang.Throwable -> L45
            goto L18
        L3e:
            r5 = 0
            defpackage.fdok.a(r2, r5)
            fctx r5 = defpackage.fctx.a
            return r5
        L45:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L47
        L47:
            r0 = move-exception
            defpackage.fdok.a(r2, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jmy.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new jmy(this.d, fcxyVar);
    }
}
