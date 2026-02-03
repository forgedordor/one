package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mfo extends BroadcastReceiver {
    final /* synthetic */ mfp a;

    public mfo(mfp mfpVar) {
        this.a = mfpVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, Intent intent) {
        this.a.a.execute(new Runnable() { // from class: mfn
            /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r10 = this;
                    android.content.Context r0 = r2
                    java.lang.String r1 = "connectivity"
                    java.lang.Object r1 = r0.getSystemService(r1)
                    android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
                    r2 = 0
                    r3 = 5
                    if (r1 != 0) goto Lf
                    goto L51
                Lf:
                    android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L51
                    r4 = 1
                    if (r1 == 0) goto L50
                    boolean r5 = r1.isConnected()
                    if (r5 != 0) goto L1d
                    goto L50
                L1d:
                    int r5 = r1.getType()
                    r6 = 2
                    r7 = 9
                    r8 = 6
                    r9 = 4
                    if (r5 == 0) goto L3b
                    if (r5 == r4) goto L39
                    if (r5 == r9) goto L3b
                    if (r5 == r3) goto L3b
                    if (r5 == r8) goto L37
                    if (r5 == r7) goto L35
                    r2 = 8
                    goto L51
                L35:
                    r2 = 7
                    goto L51
                L37:
                    r2 = r3
                    goto L51
                L39:
                    r2 = r6
                    goto L51
                L3b:
                    int r1 = r1.getSubtype()
                    switch(r1) {
                        case 1: goto L4e;
                        case 2: goto L4e;
                        case 3: goto L4c;
                        case 4: goto L4c;
                        case 5: goto L4c;
                        case 6: goto L4c;
                        case 7: goto L4c;
                        case 8: goto L4c;
                        case 9: goto L4c;
                        case 10: goto L4c;
                        case 11: goto L4c;
                        case 12: goto L4c;
                        case 13: goto L37;
                        case 14: goto L4c;
                        case 15: goto L4c;
                        case 16: goto L42;
                        case 17: goto L4c;
                        case 18: goto L39;
                        case 19: goto L42;
                        case 20: goto L44;
                        default: goto L42;
                    }
                L42:
                    r2 = r8
                    goto L51
                L44:
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r4 = 29
                    if (r1 < r4) goto L51
                    r2 = r7
                    goto L51
                L4c:
                    r2 = r9
                    goto L51
                L4e:
                    r2 = 3
                    goto L51
                L50:
                    r2 = r4
                L51:
                    mfo r1 = r10.a
                    int r4 = android.os.Build.VERSION.SDK_INT
                    mfp r1 = r1.a
                    r5 = 31
                    if (r4 < r5) goto L7a
                    if (r2 != r3) goto L7a
                    java.lang.String r2 = "phone"
                    java.lang.Object r0 = r0.getSystemService(r2)     // Catch: java.lang.RuntimeException -> L76
                    android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch: java.lang.RuntimeException -> L76
                    defpackage.mee.f(r0)     // Catch: java.lang.RuntimeException -> L76
                    mfk r2 = new mfk     // Catch: java.lang.RuntimeException -> L76
                    r2.<init>(r1)     // Catch: java.lang.RuntimeException -> L76
                    java.util.concurrent.Executor r4 = r1.a     // Catch: java.lang.RuntimeException -> L76
                    defpackage.air$$ExternalSyntheticApiModelOutline1.m(r0, r4, r2)     // Catch: java.lang.RuntimeException -> L76
                    defpackage.air$$ExternalSyntheticApiModelOutline1.m(r0, r2)     // Catch: java.lang.RuntimeException -> L76
                    return
                L76:
                    r1.d(r3)
                    return
                L7a:
                    r1.d(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mfn.run():void");
            }
        });
    }
}
