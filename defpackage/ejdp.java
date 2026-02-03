package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejdp implements fdpm {
    final /* synthetic */ ejfj a;
    final /* synthetic */ ejfn b;
    final /* synthetic */ fdci c;
    final /* synthetic */ ejdt d;

    public ejdp(ejfj ejfjVar, ejfn ejfnVar, fdci fdciVar, ejdt ejdtVar) {
        this.a = ejfjVar;
        this.b = ejfnVar;
        this.c = fdciVar;
        this.d = ejdtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r6, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.ejdo
            if (r0 == 0) goto L13
            r0 = r8
            ejdo r0 = (defpackage.ejdo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ejdo r0 = new ejdo
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r8)
            goto L55
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r8)
            ejfj r8 = r5.a
            hox r8 = r8.m
            java.lang.Object r8 = r8.a()
            if (r8 != 0) goto L71
            ejfn r8 = r5.b
            fdci r2 = r5.c
            ejfr r8 = r8.H()
            java.lang.Object r2 = r2.a
            android.net.Uri r2 = (android.net.Uri) r2
            kjg r4 = new kjg
            r4.<init>(r6)
            r0.c = r3
            java.lang.Object r8 = r8.a(r2, r4, r0)
            if (r8 == r1) goto L70
        L55:
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            if (r8 != 0) goto L68
            ejdt r6 = r5.d
            abvd r7 = r6.c
            if (r7 == 0) goto L64
            dnwz r8 = defpackage.dnwz.b
            r7.b(r8)
        L64:
            defpackage.ejdt.b(r6)
            goto L71
        L68:
            ejfj r6 = r5.a
            hox r6 = r6.m
            r6.b(r8)
            goto L71
        L70:
            return r1
        L71:
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejdp.b(long, fcxy):java.lang.Object");
    }

    @Override // defpackage.fdpm
    public final /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        return b(((kjg) obj).a, fcxyVar);
    }
}
