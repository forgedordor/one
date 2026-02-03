package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csye {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/video/SafeDuoKitClientKt");

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.dcsx r4, defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof defpackage.csyd
            if (r0 == 0) goto L13
            r0 = r5
            csyd r0 = (defpackage.csyd) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            csyd r0 = new csyd
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)     // Catch: java.lang.Exception -> L48
            goto L43
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.fctl.b(r5)
            defn r4 = r4.f()     // Catch: java.lang.Exception -> L48
            com.google.common.util.concurrent.ListenableFuture r4 = defpackage.drgi.a(r4)     // Catch: java.lang.Exception -> L48
            r0.b = r3     // Catch: java.lang.Exception -> L48
            java.lang.Object r5 = defpackage.fdxs.c(r4, r0)     // Catch: java.lang.Exception -> L48
            if (r5 != r1) goto L43
            return r1
        L43:
            com.google.android.gms.duokit.GetApiAvailabilityResponse r5 = (com.google.android.gms.duokit.GetApiAvailabilityResponse) r5     // Catch: java.lang.Exception -> L48
            int r4 = r5.a     // Catch: java.lang.Exception -> L48
            goto L6a
        L48:
            r4 = move-exception
            ekrg r5 = defpackage.csye.a
            ekrw r5 = r5.j()
            ekrz r0 = defpackage.eksq.a
            java.lang.String r1 = "Bugle"
            r5.X(r0, r1)
            r0 = 16
            java.lang.String r1 = "SafeDuoKitClient.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/video/SafeDuoKitClientKt"
            java.lang.String r3 = "safeApiProviderAvailability"
            ekrw r5 = r5.h(r2, r3, r0, r1)
            ekrd r5 = (defpackage.ekrd) r5
            java.lang.String r0 = "Error calling getApiAvailabilityAsync. API availability unknown"
            r5.t(r0, r4)
            r4 = 0
        L6a:
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csye.a(dcsx, fcxy):java.lang.Object");
    }
}
