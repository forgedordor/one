package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ateg implements atnv {
    private final fcsu a;

    public ateg(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    @Override // defpackage.atnv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.emxe a(defpackage.atbq r9) throws java.lang.NumberFormatException {
        /*
            r8 = this;
            atbd r9 = (defpackage.atbd) r9
            ekgp r0 = r9.c
            java.lang.String r1 = "Retry-After"
            boolean r2 = r0.containsKey(r1)
            r3 = 0
            if (r2 != 0) goto Lf
            goto L4a
        Lf:
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L1c
            goto L4a
        L1c:
            r2 = 0
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.NumberFormatException -> L28
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NumberFormatException -> L28
            long r3 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L28
            goto L4a
        L28:
            r0 = move-exception
            eksp r2 = defpackage.atbq.f
            ekrw r2 = r2.j()
            eksl r2 = (defpackage.eksl) r2
            ekrw r0 = r2.g(r0)
            eksl r0 = (defpackage.eksl) r0
            r2 = 146(0x92, float:2.05E-43)
            java.lang.String r5 = "FileTransferFailure.java"
            java.lang.String r6 = "com/google/android/apps/messaging/shared/chatapi/filetransfer/FileTransferFailure"
            java.lang.String r7 = "getRetryAfterValue"
            ekrw r0 = r0.h(r6, r7, r2, r5)
            eksl r0 = (defpackage.eksl) r0
            java.lang.String r2 = "Failed to parse %s header. Retrying immediately."
            r0.t(r2, r1)
        L4a:
            int r9 = r9.b
            r0 = 401(0x191, float:5.62E-43)
            r1 = 1
            r2 = 4
            r5 = 2
            if (r9 == r0) goto L74
            r0 = 410(0x19a, float:5.75E-43)
            if (r9 == r0) goto L73
            r0 = 422(0x1a6, float:5.91E-43)
            if (r9 == r0) goto L74
            r0 = 403(0x193, float:5.65E-43)
            if (r9 == r0) goto L65
            r0 = 404(0x194, float:5.66E-43)
            if (r9 == r0) goto L73
            r2 = 3
            goto L74
        L65:
            fcsu r9 = r8.a
            java.lang.Object r9 = r9.b()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r1 == r9) goto L74
        L73:
            r2 = r5
        L74:
            emxe r9 = defpackage.emxe.a
            evsf r9 = r9.createBuilder()
            emxb r9 = (defpackage.emxb) r9
            r9.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r0 = r9.instance
            emxe r0 = (defpackage.emxe) r0
            int r2 = r2 + (-1)
            r0.c = r2
            int r2 = r0.b
            r1 = r1 | r2
            r0.b = r1
            r9.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r0 = r9.instance
            emxe r0 = (defpackage.emxe) r0
            int r1 = r0.b
            r1 = r1 | r5
            r0.b = r1
            r0.d = r3
            evsn r9 = r9.build()
            emxe r9 = (defpackage.emxe) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ateg.a(atbq):emxe");
    }
}
