package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chos implements antq {
    public final Instant a;
    public final boolean b;
    public final fctc c;
    public final cqsx d;
    public final long e;
    public final long f;
    public final chpb g;
    public chpc h;
    private final boolean i;
    private final fcsu j;
    private final fcyh k;
    private final fctc l = fctd.a(new fdae() { // from class: chon
        @Override // defpackage.fdae
        public final Object invoke() {
            return (alqm) this.a.c.a();
        }
    });

    public chos(chpb chpbVar, chpc chpcVar, Instant instant, boolean z, boolean z2, fctc fctcVar, fcsu fcsuVar, cqsx cqsxVar, fcyh fcyhVar, long j, long j2) {
        this.g = chpbVar;
        this.h = chpcVar;
        this.a = instant;
        this.i = z;
        this.b = z2;
        this.c = fctcVar;
        this.j = fcsuVar;
        this.d = cqsxVar;
        this.k = fcyhVar;
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.antq
    public final Instant a() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.antq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r13 instanceof defpackage.chor
            if (r0 == 0) goto L13
            r0 = r13
            chor r0 = (defpackage.chor) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            chor r0 = new chor
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            java.lang.String r4 = "mimetype"
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r0 = r0.a
            defpackage.fctl.b(r13)
            goto L9f
        L2c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L34:
            defpackage.fctl.b(r13)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            chpb r2 = r12.g
            java.lang.String r5 = r2.c
            java.lang.String r6 = "data2"
            java.lang.String r7 = "vnd.android.cursor.item/name"
            r8 = 0
            if (r5 == 0) goto L69
            boolean r9 = defpackage.fdgn.H(r5)
            if (r9 == 0) goto L4e
            goto L69
        L4e:
            java.lang.String r9 = r2.d
            if (r9 == 0) goto L69
            boolean r10 = defpackage.fdgn.H(r9)
            if (r10 != 0) goto L69
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            r2.put(r4, r7)
            r2.put(r6, r5)
            java.lang.String r5 = "data3"
            r2.put(r5, r9)
            goto L82
        L69:
            java.lang.String r2 = r2.e
            if (r2 == 0) goto L81
            boolean r5 = defpackage.fdgn.H(r2)
            if (r5 == 0) goto L74
            goto L81
        L74:
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            r5.put(r4, r7)
            r5.put(r6, r2)
            r2 = r5
            goto L82
        L81:
            r2 = r8
        L82:
            if (r2 == 0) goto L87
            r13.add(r2)
        L87:
            fcyh r2 = r12.k
            fcyh r2 = defpackage.eicg.a(r2)
            choq r5 = new choq
            r5.<init>(r8, r12)
            r0.a = r13
            r0.d = r3
            java.lang.Object r0 = defpackage.fdin.a(r2, r5, r0)
            if (r0 == r1) goto Lb6
            r11 = r0
            r0 = r13
            r13 = r11
        L9f:
            byte[] r13 = (byte[]) r13
            if (r13 == 0) goto Lb5
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>()
            java.lang.String r2 = "vnd.android.cursor.item/photo"
            r1.put(r4, r2)
            java.lang.String r2 = "data15"
            r1.put(r2, r13)
            r0.add(r1)
        Lb5:
            return r0
        Lb6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chos.b(fcxy):java.lang.Object");
    }

    @Override // defpackage.antq
    public final boolean c() {
        return this.i;
    }

    @Override // defpackage.antq
    public final void d() {
        chpb chpbVar;
        String str;
        if (this.h.a != null || (str = (chpbVar = this.g).e) == null || str.length() == 0) {
            return;
        }
        this.h = new chpc(((cpbn) this.j.b()).d(str, (alqm) this.l.a(), null), chpbVar.a, false, 4);
    }

    @Override // defpackage.ants
    public final chpb f() {
        return this.g;
    }

    @Override // defpackage.ants
    public final chpc g() {
        return this.h;
    }
}
