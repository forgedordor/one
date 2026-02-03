package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uzt extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ uzu d;
    final /* synthetic */ String e;
    final /* synthetic */ epiv f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uzt(uzu uzuVar, String str, epiv epivVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = uzuVar;
        this.e = str;
        this.f = epivVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((uzt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:5:0x000d, B:24:0x0057, B:32:0x0070, B:34:0x007a, B:35:0x007b, B:38:0x007e, B:39:0x0080, B:42:0x0083, B:43:0x0089), top: B:46:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:5:0x000d, B:24:0x0057, B:32:0x0070, B:34:0x007a, B:35:0x007b, B:38:0x007e, B:39:0x0080, B:42:0x0083, B:43:0x0089), top: B:46:0x0007 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v4, types: [dzub, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
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
            r2 = 0
            java.lang.String r3 = "MagicRewriteRequestToServer"
            if (r1 == 0) goto L1a
            java.lang.Object r0 = r10.b
            java.lang.Object r1 = r10.a
            defpackage.fctl.b(r11)     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L14 java.util.concurrent.CancellationException -> L16 defpackage.ejde -> L18
            goto L57
        L11:
            r11 = move-exception
            goto L8a
        L14:
            r11 = move-exception
            goto L70
        L16:
            r11 = move-exception
            goto L7e
        L18:
            r11 = move-exception
            goto L83
        L1a:
            defpackage.fctl.b(r11)
            uzu r11 = r10.d
            dzuc r1 = r11.a
            dzub r1 = r1.d()
            dzua r4 = defpackage.dzua.SUCCESS
            java.lang.String r5 = r10.e     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L7c defpackage.ejde -> L81
            epiv r6 = r10.f     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L7c defpackage.ejde -> L81
            cczi r7 = defpackage.crbf.ba     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L7c defpackage.ejde -> L81
            java.lang.Object r7 = r7.e()     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L7c defpackage.ejde -> L81
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L7c defpackage.ejde -> L81
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L7c defpackage.ejde -> L81
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L4a
            fcsu r7 = r11.b     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L7c defpackage.ejde -> L81
            java.lang.Object r7 = r7.b()     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L7c defpackage.ejde -> L81
            j$.util.Optional r7 = (j$.util.Optional) r7     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L7c defpackage.ejde -> L81
            boolean r7 = r7.isPresent()     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L7c defpackage.ejde -> L81
            if (r7 == 0) goto L4a
            r9 = r8
        L4a:
            r10.a = r1     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L7c defpackage.ejde -> L81
            r10.b = r4     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L7c defpackage.ejde -> L81
            r10.c = r8     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L7c defpackage.ejde -> L81
            java.lang.Object r11 = r11.d(r5, r6, r9, r10)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L7c defpackage.ejde -> L81
            if (r11 == r0) goto L6a
            r0 = r4
        L57:
            epis r11 = (defpackage.epis) r11     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L14 java.util.concurrent.CancellationException -> L16 defpackage.ejde -> L18
            uzu r4 = r10.d
            dzfh r5 = new dzfh
            r5.<init>(r3)
            dzuc r3 = r4.a
            dzub r1 = (defpackage.dzub) r1
            dzua r0 = (defpackage.dzua) r0
            r3.f(r1, r5, r2, r0)
            return r11
        L6a:
            return r0
        L6b:
            r11 = move-exception
            r0 = r4
            goto L8a
        L6e:
            r11 = move-exception
            r0 = r4
        L70:
            dzua r0 = defpackage.dzua.ERROR     // Catch: java.lang.Throwable -> L11
            fbrb r4 = defpackage.agrd.a     // Catch: java.lang.Throwable -> L11
            agrr r4 = defpackage.agrd.a(r11)     // Catch: java.lang.Throwable -> L11
            if (r4 == 0) goto L7b
            throw r4     // Catch: java.lang.Throwable -> L11
        L7b:
            throw r11     // Catch: java.lang.Throwable -> L11
        L7c:
            r11 = move-exception
            r0 = r4
        L7e:
            dzua r0 = defpackage.dzua.CANCEL     // Catch: java.lang.Throwable -> L11
            throw r11     // Catch: java.lang.Throwable -> L11
        L81:
            r11 = move-exception
            r0 = r4
        L83:
            dzua r0 = defpackage.dzua.ERROR     // Catch: java.lang.Throwable -> L11
            java.lang.Exception r11 = defpackage.agre.a(r11)     // Catch: java.lang.Throwable -> L11
            throw r11     // Catch: java.lang.Throwable -> L11
        L8a:
            uzu r4 = r10.d
            dzfh r5 = new dzfh
            r5.<init>(r3)
            dzuc r3 = r4.a
            dzub r1 = (defpackage.dzub) r1
            dzua r0 = (defpackage.dzua) r0
            r3.f(r1, r5, r2, r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uzt.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new uzt(this.d, this.e, this.f, fcxyVar);
    }
}
