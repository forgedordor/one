package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Debug;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehrd implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    private static final ekrg a = ekrg.c("com/google/apps/tiktok/media/ImageManagerStackMonitor");
    private final Context b;
    private final Deque c = new ArrayDeque();
    private final Set d = new HashSet();
    private final Map e = new HashMap();

    public ehrd(Context context) {
        this.b = context;
        ((Application) context).registerActivityLifecycleCallbacks(this);
        context.registerComponentCallbacks(this);
    }

    final void a(Activity activity, ehrb ehrbVar) {
        Map map = this.e;
        Set set = (Set) map.get(activity);
        if (set != null) {
            set.add(ehrbVar);
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(ehrbVar);
        map.put(activity, hashSet);
    }

    final void b(int i) {
        ejwl.a(true);
        ekrd ekrdVar = (ekrd) ((ekrd) a.g()).h("com/google/apps/tiktok/media/ImageManagerStackMonitor", "trimGlideManagers", 132, "ImageManagerStackMonitor.java");
        Deque deque = this.c;
        ekrdVar.u("Trimming Glide: lru=%d; max=%d", deque.size(), i);
        int size = deque.size() - i;
        for (int i2 = 0; i2 < size; i2++) {
            if (this.d.contains((Activity) deque.peekFirst())) {
                break;
            }
            Set set = (Set) this.e.get((Activity) deque.removeFirst());
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((ehrb) it.next()).a.p();
                }
            }
        }
        if (size > 0) {
            if (Debug.getNativeHeapAllocatedSize() > Runtime.getRuntime().totalMemory() * 0.8d) {
                raw.b(this.b).i(15);
            }
        }
    }

    final void c(Activity activity, ehrb ehrbVar) {
        Set set = (Set) this.e.get(activity);
        if (set != null) {
            set.remove(ehrbVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.c.remove(activity);
        this.e.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Deque deque = this.c;
        deque.remove(activity);
        deque.add(activity);
        this.d.add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.d.remove(activity);
        if (activity.isChangingConfigurations() || activity.isFinishing()) {
            return;
        }
        double nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize() / Runtime.getRuntime().maxMemory();
        if (nativeHeapAllocatedSize >= 0.8d) {
            b(1);
        } else if (nativeHeapAllocatedSize >= 0.7d) {
            b(2);
        } else if (nativeHeapAllocatedSize >= 0.6d) {
            b(3);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i < 20) {
            b(i >= 15 ? 1 : i >= 10 ? 2 : 3);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
