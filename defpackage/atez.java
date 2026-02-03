package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atez implements athk {
    private final athk a;
    private final atjr b = atjr.k;

    public atez(athk athkVar) {
        this.a = athkVar;
    }

    @Override // defpackage.athk
    public final atjr a() {
        return this.b;
    }

    @Override // defpackage.athk
    public final Object b(fcxy fcxyVar) {
        return fctx.a;
    }

    @Override // defpackage.athk
    public final Object g(fcxy fcxyVar) {
        return fctx.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        if (r2 != r4) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // defpackage.athk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.atha r18, defpackage.atii r19, defpackage.fcxy r20) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r20
            boolean r3 = r2 instanceof defpackage.atey
            if (r3 == 0) goto L19
            r3 = r2
            atey r3 = (defpackage.atey) r3
            int r4 = r3.d
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.d = r4
            goto L1e
        L19:
            atey r3 = new atey
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.b
            fcyl r4 = defpackage.fcyl.a
            int r5 = r3.d
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L4c
            if (r5 == r7) goto L3c
            if (r5 != r6) goto L34
            java.lang.Object r1 = r3.a
            atim r1 = (defpackage.atim) r1
            defpackage.fctl.b(r2)
            goto L6f
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3c:
            atii r1 = r3.e
            java.lang.Object r5 = r3.a
            atha r5 = (defpackage.atha) r5
            defpackage.fctl.b(r2)
            r16 = r5
            r5 = r1
            r1 = r2
            r2 = r16
            goto L5a
        L4c:
            defpackage.fctl.b(r2)
            r2 = r18
            r3.a = r2
            r3.e = r1
            r3.d = r7
            if (r1 == r4) goto La9
            r5 = r1
        L5a:
            atim r1 = (defpackage.atim) r1
            boolean r7 = r1 instanceof defpackage.atii
            if (r7 == 0) goto L95
            athk r7 = r0.a
            r3.a = r1
            r8 = 0
            r3.e = r8
            r3.d = r6
            java.lang.Object r2 = r7.h(r2, r5, r3)
            if (r2 == r4) goto La9
        L6f:
            atim r2 = (defpackage.atim) r2
            r1.getClass()
            r2.getClass()
            boolean r3 = r1 instanceof defpackage.atik
            if (r3 != 0) goto L94
            boolean r3 = r2 instanceof defpackage.atik
            if (r3 == 0) goto L80
            goto L94
        L80:
            r4 = r1
            atii r4 = (defpackage.atii) r4
            atii r2 = (defpackage.atii) r2
            evqs r5 = r2.f
            com.google.android.rcs.client.messaging.data.ContentType r6 = r2.b
            evqs r7 = r2.h
            com.google.android.rcs.client.messaging.data.ContentType r8 = r2.d
            r9 = 0
            r10 = 3615(0xe1f, float:5.066E-42)
            atii r1 = defpackage.atii.b(r4, r5, r6, r7, r8, r9, r10)
        L94:
            return r1
        L95:
            atii r2 = new atii
            r14 = 0
            r15 = 4095(0xfff, float:5.738E-42)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r2
        La9:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atez.h(atha, atii, fcxy):java.lang.Object");
    }

    @Override // defpackage.athk
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // defpackage.athk
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // defpackage.athk
    public final /* synthetic */ boolean l() {
        return false;
    }
}
