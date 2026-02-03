package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbax extends BroadcastReceiver {
    final /* synthetic */ cbay a;

    public cbax(cbay cbayVar) {
        this.a = cbayVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, final Intent intent) {
        cbay cbayVar = this.a;
        eieh eiehVarC = cbayVar.e.c("dump_pwq_state", "com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueDebugger$2", "onReceive", 360);
        try {
            eijx.f(new Runnable() { // from class: cbaw
                /* JADX WARN: Removed duplicated region for block: B:105:0x0245  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x0096  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x009d A[Catch: all -> 0x02c8, TryCatch #1 {all -> 0x02c8, blocks: (B:3:0x0013, B:5:0x002c, B:47:0x00cf, B:49:0x00d7, B:50:0x0113, B:57:0x0147, B:72:0x01cd, B:73:0x01d2, B:77:0x01dd, B:78:0x01e5, B:80:0x01eb, B:116:0x0255, B:117:0x0269, B:118:0x027c, B:119:0x028f, B:120:0x02a3, B:125:0x02be, B:130:0x02c7, B:129:0x02c4, B:56:0x013d, B:6:0x0033, B:41:0x0098, B:43:0x00a6, B:45:0x00b0, B:46:0x00c6, B:42:0x009d, B:126:0x02bf, B:75:0x01d5, B:76:0x01dc, B:60:0x0153, B:64:0x0163, B:66:0x0178, B:67:0x018b, B:70:0x01a4, B:54:0x0138), top: B:136:0x0013, inners: #0, #2, #3, #4 }] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 746
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.cbaw.run():void");
                }
            }, cbayVar.c);
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
