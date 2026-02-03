package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egeb {
    private static final ekrg b = ekrg.c("com/google/apps/tiktok/account/data/device/DeviceAccountsChangedMonitor");
    public final Set a;
    private final Context c;
    private final eosc d;
    private final egoc e;
    private boolean f = false;

    public egeb(Context context, Set set, eosc eoscVar, egoc egocVar) {
        this.c = context;
        this.a = set;
        this.d = eoscVar;
        this.e = egocVar;
    }

    final ListenableFuture a() {
        ((ekrd) ((ekrd) b.g()).h("com/google/apps/tiktok/account/data/device/DeviceAccountsChangedMonitor", "notifyAccountsChanged", 55, "DeviceAccountsChangedMonitor.java")).q("Device Accounts Changed");
        ListenableFuture listenableFutureN = eork.n(eiid.c(new eooy() { // from class: egea
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                ArrayList arrayList = new ArrayList(1);
                ekqg ekqgVarListIterator = ((ekph) this.a.a).listIterator();
                while (ekqgVarListIterator.hasNext()) {
                    egfq egfqVar = (egfq) ekqgVarListIterator.next();
                    try {
                        arrayList.add(fdxs.b(egfqVar.f, fcyi.a, fdjz.a, new egfp(egfqVar, null)));
                    } catch (Exception e) {
                        arrayList.add(eork.h(e));
                    }
                }
                return eork.c(arrayList).a(new eopa(null), eoqg.a);
            }
        }), this.d);
        this.e.h(listenableFutureN);
        return listenableFutureN;
    }

    public final synchronized void b() {
        if (this.f) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.accounts.LOGIN_ACCOUNTS_CHANGED");
        this.c.registerReceiver(new egdz(), intentFilter);
        this.f = true;
    }

    final synchronized boolean c() {
        return this.f;
    }
}
