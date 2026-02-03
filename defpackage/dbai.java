package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbai {
    public final Context a;
    public final fdap b;
    public final fdap c;
    private final efwo d;
    private final egif e;

    public dbai(Context context, efwo efwoVar, egif egifVar) {
        context.getClass();
        efwoVar.getClass();
        egifVar.getClass();
        this.a = context;
        this.d = efwoVar;
        this.e = egifVar;
        this.b = new elge(new dbah(this, null));
        this.c = new elge(new dbag(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r10, defpackage.fcxy r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.dbaf
            if (r0 == 0) goto L13
            r0 = r11
            dbaf r0 = (defpackage.dbaf) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            dbaf r0 = new dbaf
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r10 = r0.b
            java.lang.Object r0 = r0.a
            defpackage.fctl.b(r11)
            goto L8b
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            defpackage.fctl.b(r11)
            android.content.Context r11 = r9.a
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            android.content.ComponentName r4 = new android.content.ComponentName
            java.lang.Class<com.google.android.apps.messaging.youtube.YouTubePlayerActionListener_Receiver> r5 = com.google.android.apps.messaging.youtube.YouTubePlayerActionListener_Receiver.class
            r4.<init>(r11, r5)
            android.content.Intent r2 = r2.setComponent(r4)
            java.lang.String r4 = "com.google.android.apps.messaging.youtube.action.YOUTUBE_PLAYER"
            android.content.Intent r2 = r2.setAction(r4)
            java.lang.String r4 = "com.google.android.apps.messaging.youtube.extra.YOUTUBE_PLAYER_ACTION"
            android.content.Intent r2 = r2.putExtra(r4, r10)
            r2.getClass()
            r0.a = r11
            r0.b = r10
            r0.e = r3
            egif r4 = r9.e
            efwo r5 = r9.d
            r6 = 2
            com.google.common.util.concurrent.ListenableFuture[] r6 = new com.google.common.util.concurrent.ListenableFuture[r6]
            egcd r7 = r4.c
            com.google.common.util.concurrent.ListenableFuture r5 = r7.c(r5)
            r7 = 0
            r6[r7] = r5
            com.google.common.util.concurrent.ListenableFuture r4 = r4.a()
            r6[r3] = r4
            com.google.common.util.concurrent.ListenableFuture r3 = defpackage.eork.f(r6)
            egid r4 = new egid
            r4.<init>()
            eoqg r2 = defpackage.eoqg.a
            com.google.common.util.concurrent.ListenableFuture r2 = defpackage.eooq.f(r3, r4, r2)
            java.lang.Object r0 = defpackage.fdxs.c(r2, r0)
            if (r0 == r1) goto La0
            r8 = r0
            r0 = r11
            r11 = r8
        L8b:
            android.content.Intent r11 = (android.content.Intent) r11
            android.content.Context r0 = (android.content.Context) r0
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            android.app.PendingIntent r10 = defpackage.ebsn.d(r0, r10, r11, r1)
            if (r10 == 0) goto L98
            return r10
        L98:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Required value was null."
            r10.<init>(r11)
            throw r10
        La0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbai.a(int, fcxy):java.lang.Object");
    }
}
