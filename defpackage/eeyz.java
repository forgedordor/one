package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eeyz {
    protected final eeza a;
    private final IntentFilter c;
    private final Context d;
    protected final Set b = new HashSet();
    private eeyy e = null;
    private volatile boolean f = false;

    protected eeyz(eeza eezaVar, IntentFilter intentFilter, Context context) {
        this.a = eezaVar;
        this.c = intentFilter;
        this.d = efaa.a(context);
    }

    private final void e() {
        eeyy eeyyVar;
        Set set = this.b;
        if (!set.isEmpty() && this.e == null) {
            this.e = new eeyy(this);
            if (Build.VERSION.SDK_INT >= 33) {
                this.d.registerReceiver(this.e, this.c, 2);
            } else {
                this.d.registerReceiver(this.e, this.c);
            }
        }
        if (!set.isEmpty() || (eeyyVar = this.e) == null) {
            return;
        }
        this.d.unregisterReceiver(eeyyVar);
        this.e = null;
    }

    protected abstract void a(Context context, Intent intent);

    public final synchronized void b(Object obj) {
        Iterator it = new HashSet(this.b).iterator();
        while (it.hasNext()) {
            adix adixVar = (adix) it.next();
            adiz adizVar = adixVar.a;
            eg egVar = adixVar.b;
            int i = ((eeyu) obj).a;
            if (i != 11) {
                switch (i) {
                    case 0:
                        ((eksl) adiz.a.n().h("com/google/android/apps/messaging/inappupdate/InAppUpdatePresenterImpl", "registerAppUpdateListener", 327, "InAppUpdatePresenterImpl.java")).r("Update flow transitioned to InstallStatus code: %s.", i);
                        ((adja) adizVar.d.b()).b(14, true);
                        break;
                    case 1:
                        ((eksl) adiz.a.n().h("com/google/android/apps/messaging/inappupdate/InAppUpdatePresenterImpl", "registerAppUpdateListener", 302, "InAppUpdatePresenterImpl.java")).q("Update pending.");
                        break;
                    case 2:
                        ((eksl) adiz.a.n().h("com/google/android/apps/messaging/inappupdate/InAppUpdatePresenterImpl", "registerAppUpdateListener", 305, "InAppUpdatePresenterImpl.java")).q("Update downloading.");
                        break;
                    case 3:
                        ((eksl) adiz.a.n().h("com/google/android/apps/messaging/inappupdate/InAppUpdatePresenterImpl", "registerAppUpdateListener", 318, "InAppUpdatePresenterImpl.java")).q("Update installing.");
                        break;
                    case 4:
                        ((adja) adizVar.d.b()).b(12, true);
                        ((eksl) adiz.a.n().h("com/google/android/apps/messaging/inappupdate/InAppUpdatePresenterImpl", "registerAppUpdateListener", 324, "InAppUpdatePresenterImpl.java")).q("Update installed.");
                        break;
                    case 5:
                        ((eksl) ((eksl) adiz.a.j()).h("com/google/android/apps/messaging/inappupdate/InAppUpdatePresenterImpl", "registerAppUpdateListener", 292, "InAppUpdatePresenterImpl.java")).r("Update failed with error code %s.", ((eeyu) obj).b);
                        ((adja) adizVar.d.b()).b(6, true);
                        adizVar.j();
                        auvh.h(((adjc) adizVar.e.b()).c(true));
                        break;
                    case 6:
                        ((eksl) ((eksl) adiz.a.h()).h("com/google/android/apps/messaging/inappupdate/InAppUpdatePresenterImpl", "registerAppUpdateListener", 285, "InAppUpdatePresenterImpl.java")).q("Update canceled by user");
                        ((adja) adizVar.d.b()).b(7, true);
                        adizVar.j();
                        break;
                    default:
                        ((adja) adizVar.d.b()).b(1, true);
                        ((eksl) ((eksl) adiz.a.j()).h("com/google/android/apps/messaging/inappupdate/InAppUpdatePresenterImpl", "registerAppUpdateListener", 340, "InAppUpdatePresenterImpl.java")).r("Unexpected InstallStatus code occurred: %s.", i);
                        break;
                }
            } else {
                ((eksl) adiz.a.n().h("com/google/android/apps/messaging/inappupdate/InAppUpdatePresenterImpl", "registerAppUpdateListener", 308, "InAppUpdatePresenterImpl.java")).q("Update downloaded, fetching new update info.");
                ((adja) adizVar.d.b()).b(10, true);
                adizVar.i(egVar);
            }
        }
    }

    public final synchronized void c(adix adixVar) {
        this.a.d("registerListener", new Object[0]);
        this.b.add(adixVar);
        e();
    }

    public final synchronized void d(adix adixVar) {
        this.a.d("unregisterListener", new Object[0]);
        this.b.remove(adixVar);
        e();
    }
}
