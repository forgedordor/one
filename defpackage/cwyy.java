package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.util.Log;
import j$.util.function.Consumer$CC;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwyy {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/dark/DarkModeManager");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final cwyu e;
    public eiju f;
    public boolean g;
    private final Context h;
    private final AtomicInteger i = new AtomicInteger(-1);

    public cwyy(Context context, cwyu cwyuVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.h = context;
        this.b = fcsuVar;
        this.e = cwyuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
    }

    public final void a(int i) {
        if (!craf.c && i == -1) {
            i = 1;
        }
        this.i.set(i);
        int i2 = je.b;
        if (i != -1 && i != 0 && i != 1 && i != 2 && i != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (je.b != i) {
            je.b = i;
            synchronized (je.g) {
                csr csrVar = new csr(je.f);
                while (csrVar.hasNext()) {
                    je jeVar = (je) ((WeakReference) csrVar.next()).get();
                    if (jeVar != null) {
                        jeVar.p();
                    }
                }
            }
        }
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/ui/dark/DarkModeManager", "setDarkMode", 197, "DarkModeManager.java")).r("DarkModeManager: setDarkMode: %s", i);
    }

    public final void b(final int i) {
        if (craf.e) {
            UiModeManager uiModeManager = (UiModeManager) this.h.getSystemService("uimode");
            uiModeManager.getClass();
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = 0;
                }
            }
            uiModeManager.setApplicationNightMode(i2);
        }
        a(i);
        eiju.g(((ecjh) this.e.a.b()).b(new ejvr() { // from class: cwyr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cwyp cwypVar = (cwyp) ((cwyq) obj).toBuilder();
                cwypVar.copyOnWrite();
                cwyq cwyqVar = (cwyq) cwypVar.instance;
                cwyqVar.b |= 1;
                cwyqVar.c = i;
                return (cwyq) cwypVar.build();
            }
        }, eoqg.a)).k(auvh.c(new Consumer() { // from class: cwyv
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                cwyy cwyyVar = this.a;
                int i3 = i;
                if (i3 == -1) {
                    ((ains) cwyyVar.c.b()).c("Bugle.ThemeMode.SystemDefault.Counts");
                } else if (i3 == 1) {
                    ((ains) cwyyVar.c.b()).c("Bugle.DarkMode.Disabled.Counts");
                } else {
                    if (i3 != 2) {
                        throw new IllegalArgumentException(a.g(i3, "Unsupported theme mode: "));
                    }
                    ((ains) cwyyVar.c.b()).c("Bugle.DarkMode.Enabled.Counts");
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }), (Executor) this.d.b());
    }
}
