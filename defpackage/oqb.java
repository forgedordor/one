package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oqb implements fdpm {
    final /* synthetic */ fdci a;
    final /* synthetic */ fdau b;
    final /* synthetic */ fdpm c;

    public oqb(fdci fdciVar, fdau fdauVar, fdpm fdpmVar) {
        this.a = fdciVar;
        this.b = fdauVar;
        this.c = fdpmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (r8.fO(r9, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.oqa
            if (r0 == 0) goto L13
            r0 = r9
            oqa r0 = (defpackage.oqa) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            oqa r0 = new oqa
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r9)
            goto L62
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            fdci r8 = r0.d
            defpackage.fctl.b(r9)
            goto L4e
        L38:
            defpackage.fctl.b(r9)
            fdci r9 = r7.a
            fdau r2 = r7.b
            java.lang.Object r5 = r9.a
            r0.d = r9
            r0.c = r4
            java.lang.Object r8 = r2.a(r5, r8, r0)
            if (r8 == r1) goto L65
            r6 = r9
            r9 = r8
            r8 = r6
        L4e:
            r8.a = r9
            fdpm r8 = r7.c
            fdci r9 = r7.a
            java.lang.Object r9 = r9.a
            r2 = 0
            r0.d = r2
            r0.c = r3
            java.lang.Object r8 = r8.fO(r9, r0)
            if (r8 != r1) goto L62
            goto L65
        L62:
            fctx r8 = defpackage.fctx.a
            return r8
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oqb.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
