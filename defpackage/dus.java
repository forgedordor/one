package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dus extends fcyz implements fdat {
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ fdci d;
    final /* synthetic */ duu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dus(fdci fdciVar, duu duuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = fdciVar;
        this.e = duuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dus) c((fdap) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0036 -> B:22:0x004a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0043 -> B:20:0x0045). Please report as a decompilation issue!!! */
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
            if (r1 == 0) goto L10
            java.lang.Object r1 = r5.a
            java.lang.Object r2 = r5.c
            fdap r2 = (defpackage.fdap) r2
            defpackage.fctl.b(r6)
            goto L45
        L10:
            defpackage.fctl.b(r6)
            java.lang.Object r6 = r5.c
            fdap r6 = (defpackage.fdap) r6
            r2 = r6
        L18:
            fdci r1 = r5.d
            java.lang.Object r6 = r1.a
            boolean r3 = r6 instanceof defpackage.dth
            if (r3 != 0) goto L4f
            boolean r3 = r6 instanceof defpackage.dte
            if (r3 != 0) goto L4f
            boolean r3 = r6 instanceof defpackage.dtf
            r4 = 0
            if (r3 == 0) goto L2c
            dtf r6 = (defpackage.dtf) r6
            goto L2d
        L2c:
            r6 = r4
        L2d:
            if (r6 == 0) goto L32
            r2.invoke(r6)
        L32:
            duu r6 = r5.e
            fdoa r6 = r6.h
            if (r6 == 0) goto L4a
            r5.c = r2
            r5.a = r1
            r3 = 1
            r5.b = r3
            java.lang.Object r6 = r6.i(r5)
            if (r6 == r0) goto L49
        L45:
            r4 = r6
            dti r4 = (defpackage.dti) r4
            goto L4a
        L49:
            return r0
        L4a:
            fdci r1 = (defpackage.fdci) r1
            r1.a = r4
            goto L18
        L4f:
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dus.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dus dusVar = new dus(this.d, this.e, fcxyVar);
        dusVar.c = obj;
        return dusVar;
    }
}
