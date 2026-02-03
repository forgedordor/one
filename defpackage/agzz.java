package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import com.google.android.ims.util.common.RcsIntents;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agzz extends cldb {
    private static final cqce b = cqce.g("Bugle", "PopupListener");
    boolean a = false;
    private final eigp c;
    private final agzy d;

    public agzz(eigp eigpVar, agzy agzyVar) {
        this.c = eigpVar;
        this.d = agzyVar;
    }

    @Override // defpackage.cldb
    protected final int a() {
        return 18;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return this.c.c("PopupListener Receive broadcast", "com/google/android/apps/messaging/popup/PopupListener", "beginRootTrace", 42);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    @Override // defpackage.cldb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eiju c(android.content.Context r7, android.content.Intent r8) {
        /*
            r6 = this;
            cqce r7 = defpackage.agzz.b
            cqbd r7 = r7.c()
            java.lang.String r0 = "Received request"
            r7.I(r0)
            java.lang.String r0 = r8.getAction()
            r7.I(r0)
            r7.r()
            java.lang.String r7 = r8.getAction()
            int r0 = r7.hashCode()
            r1 = 1
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            switch(r0) {
                case -1567985380: goto L58;
                case -482560605: goto L4e;
                case -61934465: goto L44;
                case 250542075: goto L3a;
                case 406935855: goto L30;
                case 615574789: goto L26;
                default: goto L25;
            }
        L25:
            goto L62
        L26:
            java.lang.String r0 = "rcs.intent.action.forwardProvisioningWelcomeMessage"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L62
            r7 = r2
            goto L63
        L30:
            java.lang.String r0 = "rcs.intent.action.receivedRcsPromoRequest"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L62
            r7 = r4
            goto L63
        L3a:
            java.lang.String r0 = "rcs.intent.action.receivedRcsSuccessRequest"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L62
            r7 = r3
            goto L63
        L44:
            java.lang.String r0 = "rcs.intent.action.receivedLegalFyiRequest"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L62
            r7 = r5
            goto L63
        L4e:
            java.lang.String r0 = "rcs.intent.action.receivedGoogleTosRequest"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L62
            r7 = 0
            goto L63
        L58:
            java.lang.String r0 = "rcs.intent.action.receivedCarrierTosRequest"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L62
            r7 = r1
            goto L63
        L62:
            r7 = -1
        L63:
            if (r7 == 0) goto La4
            if (r7 == r1) goto L9d
            if (r7 == r5) goto L95
            if (r7 == r4) goto L8f
            if (r7 == r3) goto L89
            if (r7 != r2) goto L75
            agzy r7 = r6.d
            r7.e(r2)
            goto La9
        L75:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "unexpected intent: "
            java.lang.String r8 = r0.concat(r8)
            r7.<init>(r8)
            throw r7
        L89:
            agzy r7 = r6.d
            r7.e(r3)
            goto La9
        L8f:
            agzy r7 = r6.d
            r7.e(r4)
            goto La9
        L95:
            agzy r7 = r6.d
            r8 = 15
            r7.e(r8)
            goto La9
        L9d:
            agzy r7 = r6.d
            r8 = 7
            r7.e(r8)
            goto La9
        La4:
            agzy r7 = r6.d
            r7.e(r5)
        La9:
            r7 = 0
            eiju r7 = defpackage.eijx.e(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agzz.c(android.content.Context, android.content.Intent):eiju");
    }

    @Override // defpackage.cldb
    public final String d() {
        return null;
    }

    public final synchronized void e(Context context) {
        if (this.a) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter(RcsIntents.ACTION_NOTIFY_RECEIVED_PROVISIONING_WELCOME_MESSAGE);
        intentFilter.addAction(RcsIntents.ACTION_NOTIFY_RECEIVED_RCS_PROMO_REQUEST);
        intentFilter.addAction(RcsIntents.ACTION_NOTIFY_RECEIVED_RCS_SUCCESS_REQUEST);
        intentFilter.addAction(RcsIntents.ACTION_NOTIFY_RECEIVED_GOOGLE_TOS_REQUEST);
        intentFilter.addAction(RcsIntents.ACTION_NOTIFY_RECEIVED_LEGAL_FYI_REQUEST);
        intentFilter.addAction(RcsIntents.ACTION_NOTIFY_RECEIVED_CARRIER_TOS_REQUEST);
        intentFilter.countActions();
        kxj.g(context, this, intentFilter);
        this.a = true;
    }

    public final synchronized void f(Context context) {
        if (this.a) {
            context.unregisterReceiver(this);
            this.a = false;
        }
    }
}
