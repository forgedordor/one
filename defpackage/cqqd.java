package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cqqd extends BroadcastReceiver {
    final /* synthetic */ cqqe a;

    public cqqd(cqqe cqqeVar) {
        this.a = cqqeVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null || !action.equals("com.google.gservices.intent.action.GSERVICES_CHANGED")) {
            return;
        }
        final cqqe cqqeVar = this.a;
        auvh.h(cqqeVar.e.submit(eiid.k(new Runnable() { // from class: cqqa
            @Override // java.lang.Runnable
            public final void run() {
                List list = cqqeVar.f;
                synchronized (list) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
            }
        })));
    }
}
