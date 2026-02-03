package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnon implements dnnv {
    private final dngx a;
    private final Optional b;
    private final dtpd c;

    public dnon(dngx dngxVar, Optional optional, Optional optional2) {
        optional.getClass();
        this.a = dngxVar;
        this.b = optional2;
        this.c = (dtpd) fdct.b(optional);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dnnv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.dnom
            if (r0 == 0) goto L13
            r0 = r9
            dnom r0 = (defpackage.dnom) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dnom r0 = new dnom
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            java.lang.String r8 = r0.d
            defpackage.fctl.b(r9)
            goto L55
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            defpackage.fctl.b(r9)
            dtpd r9 = r7.c
            if (r9 == 0) goto L92
            j$.util.Optional r2 = r7.b
            dnoi r5 = new dnoi
            r5.<init>()
            dnoj r6 = new dnoj
            r6.<init>()
            r2.ifPresent(r6)
            dngx r2 = r7.a
            r0.d = r8
            r0.c = r3
            java.lang.Object r9 = r2.a(r8, r9, r0)
            if (r9 != r1) goto L55
            return r1
        L55:
            dtma r9 = (defpackage.dtma) r9
            if (r9 == 0) goto L83
            evtg r9 = r9.h
            r9.getClass()
            java.util.Iterator r9 = r9.iterator()
        L62:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L78
            java.lang.Object r0 = r9.next()
            r1 = r0
            dtlw r1 = (defpackage.dtlw) r1
            java.lang.String r1 = r1.c
            boolean r1 = defpackage.fdbq.f(r1, r8)
            if (r1 == 0) goto L62
            goto L79
        L78:
            r0 = r4
        L79:
            dtlw r0 = (defpackage.dtlw) r0
            if (r0 == 0) goto L7f
            java.lang.String r4 = r0.d
        L7f:
            android.net.Uri r4 = android.net.Uri.parse(r4)
        L83:
            j$.util.Optional r8 = r7.b
            dnok r9 = new dnok
            r9.<init>()
            dnol r0 = new dnol
            r0.<init>()
            r8.ifPresent(r0)
        L92:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnon.a(java.lang.String, fcxy):java.lang.Object");
    }
}
