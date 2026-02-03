package defpackage;

import android.app.Activity;
import android.os.Handler;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzjl extends dzjm {
    final /* synthetic */ dzjn a;

    public dzjl(dzjn dzjnVar) {
        this.a = dzjnVar;
    }

    @Override // defpackage.dzjm, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        dzjn dzjnVar = this.a;
        int i = dzjnVar.b - 1;
        dzjnVar.b = i;
        if (i == 0) {
            dzjnVar.h = dzfh.b(activity.getClass());
            Handler handler = dzjnVar.e;
            ejyb.e(handler);
            Runnable runnable = dzjnVar.f;
            ejyb.e(runnable);
            handler.postDelayed(runnable, 700L);
        }
    }

    @Override // defpackage.dzjm, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        dzjn dzjnVar = this.a;
        int i = dzjnVar.b + 1;
        dzjnVar.b = i;
        if (i == 1) {
            if (dzjnVar.c) {
                Iterator it = dzjnVar.g.iterator();
                while (it.hasNext()) {
                    ((dziw) it.next()).l(dzfh.b(activity.getClass()));
                }
                dzjnVar.c = false;
                return;
            }
            Handler handler = dzjnVar.e;
            ejyb.e(handler);
            Runnable runnable = dzjnVar.f;
            ejyb.e(runnable);
            handler.removeCallbacks(runnable);
        }
    }

    @Override // defpackage.dzjm, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        dzjn dzjnVar = this.a;
        int i = dzjnVar.a + 1;
        dzjnVar.a = i;
        if (i == 1 && dzjnVar.d) {
            for (dziw dziwVar : dzjnVar.g) {
                dzfh.b(activity.getClass());
            }
            dzjnVar.d = false;
        }
    }

    @Override // defpackage.dzjm, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        dzjn dzjnVar = this.a;
        dzjnVar.a--;
        dzfh.b(activity.getClass());
        dzjnVar.a();
    }
}
