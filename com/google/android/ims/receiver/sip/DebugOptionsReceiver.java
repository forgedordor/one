package com.google.android.ims.receiver.sip;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.ims.util.common.RcsIntents;
import defpackage.dgtw;
import defpackage.dheg;
import defpackage.dhff;
import defpackage.dhgz;
import defpackage.dhja;
import defpackage.kxj;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class DebugOptionsReceiver extends dheg<Void> {
    private static boolean a = false;
    private static final DebugOptionsReceiver b = new DebugOptionsReceiver();
    private static dgtw c;
    private static dhgz d;

    public static synchronized void a(Context context, dgtw dgtwVar, dhgz dhgzVar) {
        if (a) {
            return;
        }
        kxj.g(context, b, new IntentFilter(RcsIntents.ACTION_DEBUG_OPTION_INCREASE_SESSION_ID));
        c = dgtwVar;
        d = dhgzVar;
        a = true;
    }

    public static synchronized void b(Context context) {
        if (a) {
            context.unregisterReceiver(b);
            c = null;
            d = null;
            a = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    @Override // defpackage.dheg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ void c(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            defpackage.cqaz.l(r7)
            java.lang.String r6 = r7.getAction()
            r0 = 0
            if (r6 != 0) goto L12
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.String r7 = "Null action. Ignoring debug option intent."
            defpackage.dhja.q(r7, r6)
            return
        L12:
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r0] = r6
            java.lang.String r3 = "Processing debug action %s"
            defpackage.dhja.c(r3, r2)
            int r2 = r6.hashCode()
            r3 = -1534316517(0xffffffffa48c301b, float:-6.0796815E-17)
            r4 = 2
            if (r2 == r3) goto L45
            r3 = -1263275559(0xffffffffb4b3f1d9, float:-3.3517316E-7)
            if (r2 == r3) goto L3b
            r3 = 976675763(0x3a36e3b3, float:6.976679E-4)
            if (r2 == r3) goto L31
            goto L4f
        L31:
            java.lang.String r2 = "rcs.intent.action.debugOptionSendErrorResultFromEngine"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L4f
            r2 = r1
            goto L50
        L3b:
            java.lang.String r2 = "rcs.intent.action.debugOptionIncreaseSessionId"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L4f
            r2 = r0
            goto L50
        L45:
            java.lang.String r2 = "rcs.intent.action.forceClientToUnregister"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L4f
            r2 = r4
            goto L50
        L4f:
            r2 = -1
        L50:
            if (r2 == 0) goto L78
            if (r2 == r1) goto L6a
            if (r2 == r4) goto L60
            java.lang.Object[] r7 = new java.lang.Object[r1]
            r7[r0] = r6
            java.lang.String r6 = "Unknown debug action: %s"
            defpackage.dhja.k(r6, r7)
            return
        L60:
            dgtw r6 = com.google.android.ims.receiver.sip.DebugOptionsReceiver.c
            if (r6 == 0) goto L95
            dezf r7 = defpackage.dezf.DEBUG_OPTIONS_FORCED_UNREGISTER
            r6.stop(r7)
            return
        L6a:
            java.lang.String r6 = "rcs.intent.extra.sendErrorResultFromEngine"
            boolean r6 = r7.getBooleanExtra(r6, r0)
            dhgz r7 = com.google.android.ims.receiver.sip.DebugOptionsReceiver.d
            if (r7 == 0) goto L95
            r7.p(r6)
            return
        L78:
            java.lang.String r6 = "rcs.intent.extra.delta"
            r2 = 50000(0xc350, double:2.47033E-319)
            long r6 = r7.getLongExtra(r6, r2)
            dhgz r2 = com.google.android.ims.receiver.sip.DebugOptionsReceiver.d
            if (r2 == 0) goto L95
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r3
            java.lang.String r0 = "Increasing session ID by %d"
            defpackage.dhja.c(r0, r1)
            r2.k(r6)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.ims.receiver.sip.DebugOptionsReceiver.c(android.content.Context, android.content.Intent):void");
    }

    @Override // defpackage.dheg
    public final boolean e(Context context, Intent intent) {
        synchronized (DebugOptionsReceiver.class) {
            dhja.c("Received debug action %s", intent.getAction());
            if (dhff.e(context, intent)) {
                return true;
            }
            dhja.q("Caller not trusted, dropping Debug Options intent: %s", intent);
            return false;
        }
    }
}
