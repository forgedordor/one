package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aofq {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/selfidentity/contactfetcher/ContactUtilBasedSelfContactFetcher");
    private final cqiz b;

    public aofq(cqiz cqizVar) {
        cqizVar.getClass();
        this.b = cqizVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002d A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #1 {all -> 0x0036, blocks: (B:5:0x000d, B:7:0x0013, B:8:0x002d), top: B:20:0x000d, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.aofr a() {
        /*
            r6 = this;
            r0 = 0
            cqiz r1 = r6.b     // Catch: java.lang.Exception -> L3d
            bacf r1 = r1.f()     // Catch: java.lang.Exception -> L3d
            android.database.Cursor r1 = r1.a()     // Catch: java.lang.Exception -> L3d
            if (r1 == 0) goto L2d
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L2d
            aofr r2 = new aofr     // Catch: java.lang.Throwable -> L36
            r3 = 1
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> L36
            r3.getClass()     // Catch: java.lang.Throwable -> L36
            r4 = 2
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L36
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch: java.lang.Throwable -> L36
            r4.getClass()     // Catch: java.lang.Throwable -> L36
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L36
            goto L32
        L2d:
            aofr r2 = new aofr     // Catch: java.lang.Throwable -> L36
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L36
        L32:
            defpackage.fczl.a(r1, r0)     // Catch: java.lang.Exception -> L3d
            return r2
        L36:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L38
        L38:
            r3 = move-exception
            defpackage.fczl.a(r1, r2)     // Catch: java.lang.Exception -> L3d
            throw r3     // Catch: java.lang.Exception -> L3d
        L3d:
            r1 = move-exception
            ekrg r2 = defpackage.aofq.a
            ekrw r2 = r2.i()
            ekrd r2 = (defpackage.ekrd) r2
            ekrw r1 = r2.g(r1)
            r2 = 30
            java.lang.String r3 = "ContactUtilBasedSelfContactFetcher.kt"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/api/messaging/selfidentity/contactfetcher/ContactUtilBasedSelfContactFetcher"
            java.lang.String r5 = "getSelfParticipantProperties"
            ekrw r1 = r1.h(r4, r5, r2, r3)
            ekrd r1 = (defpackage.ekrd) r1
            java.lang.String r2 = "failed to get SelfParticipantProperties from self profile"
            r1.q(r2)
            aofr r1 = new aofr
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aofq.a():aofr");
    }
}
