package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ycd {
    private static final ekrg d = ekrg.c("com/google/android/apps/messaging/conversation2/messagelist/LazyPagingScrollHelper");
    public final oxm a;
    public final hox b = new hpl(false, hsi.a);
    public final fctc c = fctd.a(new fdae() { // from class: ycb
        @Override // defpackage.fdae
        public final Object invoke() {
            cczi ccziVar = vcv.a;
            return (Boolean) vcv.f.e();
        }
    });
    private final ejy e;

    public ycd(ejy ejyVar, oxm oxmVar) {
        this.e = ejyVar;
        this.a = oxmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ycc
            java.lang.String r1 = "PagedMessageListScrollHelper.kt"
            if (r0 == 0) goto L15
            r0 = r8
            ycc r0 = (defpackage.ycc) r0
            int r2 = r0.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r0.d = r2
            goto L1a
        L15:
            ycc r0 = new ycc
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.b
            fcyl r2 = defpackage.fcyl.a
            int r3 = r0.d
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L34
            if (r3 != r5) goto L2c
            int r7 = r0.a
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L52 java.lang.IndexOutOfBoundsException -> L54
            goto L6b
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            defpackage.fctl.b(r8)
            hox r8 = r6.b     // Catch: java.lang.Throwable -> L52 java.lang.IndexOutOfBoundsException -> L54
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L52 java.lang.IndexOutOfBoundsException -> L54
            r8.b(r3)     // Catch: java.lang.Throwable -> L52 java.lang.IndexOutOfBoundsException -> L54
            oxm r8 = r6.a     // Catch: java.lang.Throwable -> L52 java.lang.IndexOutOfBoundsException -> L54
            r8.f(r7)     // Catch: java.lang.Throwable -> L52 java.lang.IndexOutOfBoundsException -> L54
            ejy r8 = r6.e     // Catch: java.lang.Throwable -> L52 java.lang.IndexOutOfBoundsException -> L54
            r0.a = r7     // Catch: java.lang.Throwable -> L52 java.lang.IndexOutOfBoundsException -> L54
            r0.d = r5     // Catch: java.lang.Throwable -> L52 java.lang.IndexOutOfBoundsException -> L54
            java.lang.Object r7 = r8.j(r7, r4, r0)     // Catch: java.lang.Throwable -> L52 java.lang.IndexOutOfBoundsException -> L54
            if (r7 != r2) goto L6b
            return r2
        L52:
            r7 = move-exception
            goto L77
        L54:
            ekrg r8 = defpackage.ycd.d     // Catch: java.lang.Throwable -> L52
            ekrw r8 = r8.j()     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = "com/google/android/apps/messaging/conversation2/messagelist/LazyPagingScrollHelper"
            java.lang.String r2 = "animateScrollToItem"
            r3 = 46
            ekrw r8 = r8.h(r0, r2, r3, r1)     // Catch: java.lang.Throwable -> L52
            ekrd r8 = (defpackage.ekrd) r8     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = "Failed to scroll to item, invalid item index: %d"
            r8.r(r0, r7)     // Catch: java.lang.Throwable -> L52
        L6b:
            hox r7 = r6.b
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            r7.b(r8)
            fctx r7 = defpackage.fctx.a
            return r7
        L77:
            hox r8 = r6.b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r8.b(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ycd.a(int, fcxy):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ycd)) {
            return false;
        }
        ycd ycdVar = (ycd) obj;
        return fdbq.f(this.e, ycdVar.e) && fdbq.f(this.a, ycdVar.a);
    }

    public final int hashCode() {
        return (this.e.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "LazyPagingScrollHelper(messageListState=" + this.e + ", lazyMessages=" + this.a + ")";
    }
}
