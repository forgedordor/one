package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.ims.service.JibeService;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhfd extends BroadcastReceiver {
    private Context a = null;
    private dhfk b = null;

    private static boolean c(Context context) {
        if (dhka.d(context) || dhka.e(context)) {
            return true;
        }
        dhja.o("Skip using TelephonyChangeReceiver: it cannot start services", new Object[0]);
        return false;
    }

    public final synchronized void a() {
        Context context = this.a;
        if (context == null) {
            dhja.g("TelephonyChangeReceiver is not registered.", new Object[0]);
            return;
        }
        lzx lzxVarA = lzx.a(context);
        HashMap map = lzxVarA.b;
        synchronized (map) {
            ArrayList arrayList = (ArrayList) map.remove(this);
            if (arrayList != null) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    lzw lzwVar = (lzw) arrayList.get(size);
                    lzwVar.d = true;
                    int i = 0;
                    while (true) {
                        IntentFilter intentFilter = lzwVar.a;
                        if (i < intentFilter.countActions()) {
                            String action = intentFilter.getAction(i);
                            HashMap map2 = lzxVarA.c;
                            ArrayList arrayList2 = (ArrayList) map2.get(action);
                            if (arrayList2 != null) {
                                int size2 = arrayList2.size();
                                while (true) {
                                    size2--;
                                    if (size2 < 0) {
                                        break;
                                    }
                                    lzw lzwVar2 = (lzw) arrayList2.get(size2);
                                    if (lzwVar2.b == this) {
                                        lzwVar2.d = true;
                                        arrayList2.remove(size2);
                                    }
                                }
                                if (arrayList2.size() <= 0) {
                                    map2.remove(action);
                                }
                            }
                            i++;
                        }
                    }
                }
            }
        }
        this.a = null;
        this.b = null;
    }

    public final synchronized void b(Context context, Intent intent, dhfk dhfkVar) {
        if (this.a != null && this.b != null) {
            dhja.g("TelephonyChangeReceiver is already registered.", new Object[0]);
            return;
        }
        if (c(context)) {
            this.a = context;
            this.b = dhfkVar;
            kxj.g(context, this, dhey.q());
            if (intent != null) {
                onReceive(context, intent);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (dflg.a()) {
            dhja.q("TelephonyChangeReceiver dropping deprecated action: %s", intent);
            return;
        }
        dhja.c("TelephonyChangeReceiver triggered.", new Object[0]);
        String action = intent.getAction();
        if (!"com.google.android.ims.SIM_LOADED".equals(action) && !"com.google.android.ims.SIM_ABSENT".equals(action)) {
            dhja.k("Unexpected intent: %s", intent);
            return;
        }
        if (c(context)) {
            dhja.o("Sending SIM state to JibeService in Bugle", new Object[0]);
            if (this.b != null) {
                dhip dhipVar = JibeService.a;
                String action2 = intent.getAction();
                if ("com.google.android.ims.SIM_LOADED".equals(action2)) {
                    dhja.p(JibeService.a, "SIM state changed: loaded", new Object[0]);
                    JibeService.a(context, action2, null);
                } else if ("com.google.android.ims.SIM_ABSENT".equals(action2)) {
                    dhja.p(JibeService.a, "SIM state changed: absent", new Object[0]);
                    JibeService.a(context, action2, intent.getExtras());
                }
            }
        }
    }
}
