package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zmz implements fdpm {
    final /* synthetic */ fdpm a;

    public zmz(fdpm fdpmVar) {
        this.a = fdpmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fdpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fO(java.lang.Object r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.zmy
            if (r0 == 0) goto L13
            r0 = r10
            zmy r0 = (defpackage.zmy) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            zmy r0 = new zmy
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r10)
            goto L68
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            defpackage.fctl.b(r10)
            fdpm r10 = r8.a
            com.google.android.apps.messaging.shared.api.messaging.MessageId r9 = (com.google.android.apps.messaging.shared.api.messaging.MessageId) r9
            ekrg r2 = defpackage.znp.a
            ekrw r2 = r2.h()
            r4 = 148(0x94, float:2.07E-43)
            java.lang.String r5 = "MessageListPagingDataProviderImpl.kt"
            java.lang.String r6 = "com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingDataProviderImpl$getInitialMessageId$$inlined$map$1$2"
            java.lang.String r7 = "emit"
            ekrw r2 = r2.h(r6, r7, r4, r5)
            ekrd r2 = (defpackage.ekrd) r2
            r4 = 0
            if (r9 == 0) goto L52
            java.lang.String r5 = r9.a()
            goto L53
        L52:
            r5 = r4
        L53:
            java.lang.String r6 = "getInitialMessageId - oldestUnreadMessageIdFlow emitted: %s"
            r2.t(r6, r5)
            if (r9 == 0) goto L5f
            zmr r4 = new zmr
            r4.<init>(r9)
        L5f:
            r0.b = r3
            java.lang.Object r9 = r10.fO(r4, r0)
            if (r9 != r1) goto L68
            return r1
        L68:
            fctx r9 = defpackage.fctx.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zmz.fO(java.lang.Object, fcxy):java.lang.Object");
    }
}
