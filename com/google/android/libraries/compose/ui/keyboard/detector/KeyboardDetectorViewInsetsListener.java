package com.google.android.libraries.compose.ui.keyboard.detector;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import androidx.lifecycle.OnLifecycleEvent;
import com.google.android.libraries.compose.ui.keyboard.detector.KeyboardDetectorViewInsetsListener;
import defpackage.dngc;
import defpackage.dpjy;
import defpackage.dpjz;
import defpackage.dpka;
import defpackage.dpkb;
import defpackage.dpkc;
import defpackage.dpkd;
import defpackage.dpke;
import defpackage.dpkg;
import defpackage.dpkt;
import defpackage.dpku;
import defpackage.fdae;
import defpackage.fdap;
import defpackage.fdbv;
import defpackage.fdcj;
import defpackage.fdcu;
import defpackage.fdcz;
import defpackage.fdeh;
import defpackage.lva;
import defpackage.lvi;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class KeyboardDetectorViewInsetsListener extends WindowInsetsAnimation$Callback implements View.OnApplyWindowInsetsListener, lvi, dpkt {
    static final /* synthetic */ fdeh[] a;
    public static final /* synthetic */ int e = 0;
    public final dpku b;
    public dpkb c;
    public boolean d;
    private final dngc f;
    private final fdcz g;

    static {
        fdbv fdbvVar = new fdbv(KeyboardDetectorViewInsetsListener.class, "state", "getState()Lcom/google/android/libraries/compose/ui/keyboard/detector/KeyboardDetectorViewInsetsListener$KeyboardListeningState;", 0);
        int i = fdcj.a;
        a = new fdeh[]{fdbvVar};
    }

    public KeyboardDetectorViewInsetsListener(dngc dngcVar, dpku dpkuVar) {
        super(0);
        this.f = dngcVar;
        this.b = dpkuVar;
        this.g = new dpkg(dpkd.a, this);
    }

    private final void e(String str, final fdap fdapVar) {
        final dpke dpkeVar = (dpke) this.g.c(a[0]);
        if (dpkeVar instanceof dpkc) {
            if (str != null) {
                this.f.f(str, new fdae() { // from class: dpjs
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        int i = KeyboardDetectorViewInsetsListener.e;
                        fdapVar.invoke(((dpkc) dpkeVar).b);
                        return fctx.a;
                    }
                });
            } else {
                fdapVar.invoke(((dpkc) dpkeVar).b);
            }
        }
    }

    public final int a(WindowInsets windowInsets) {
        if (!windowInsets.isVisible(WindowInsets.Type.ime())) {
            return 0;
        }
        int iB = windowInsets.getInsets(WindowInsets.Type.navigationBars()).bottom;
        dpkb dpkbVar = this.c;
        Float fValueOf = dpkbVar != null ? Float.valueOf(dpkbVar.a()) : null;
        if (fValueOf != null) {
            iB = fdcu.b(iB * fValueOf.floatValue());
        }
        return windowInsets.getInsets(WindowInsets.Type.ime()).bottom - iB;
    }

    public final dpkb b(WindowInsetsAnimation windowInsetsAnimation) {
        return this.b.getRootWindowInsets().isVisible(WindowInsets.Type.ime()) ? new dpjz(windowInsetsAnimation) : new dpka(windowInsetsAnimation);
    }

    @Override // defpackage.dpkt
    public final void c(boolean z) {
        if (z) {
            this.c = null;
            e("KeyboardDetectorViewInsetsListener#onWindowFocusChanged", new fdap() { // from class: dpjt
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ((dpje) obj).getClass();
                    this.a.b.requestApplyInsets();
                    return fctx.a;
                }
            });
        }
    }

    public final void d(dpke dpkeVar) {
        this.g.d(a[0], dpkeVar);
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, final WindowInsets windowInsets) {
        view.getClass();
        windowInsets.getClass();
        if (this.c == null) {
            e("KeyboardDetectorViewInsetsListener#onApplyWindowInsets", new fdap() { // from class: dpjp
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    dpje dpjeVar = (dpje) obj;
                    dpjeVar.getClass();
                    WindowInsets windowInsets2 = windowInsets;
                    dpjd dpjdVar = windowInsets2.isVisible(WindowInsets.Type.ime()) ? dpjd.a : dpjd.d;
                    KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener = this;
                    dpjeVar.b(dpjdVar);
                    dpjeVar.a(keyboardDetectorViewInsetsListener.a(windowInsets2));
                    return fctx.a;
                }
            });
        }
        return windowInsets;
    }

    public final void onEnd(final WindowInsetsAnimation windowInsetsAnimation) {
        windowInsetsAnimation.getClass();
        super.onEnd(windowInsetsAnimation);
        this.c = null;
        e("KeyboardDetectorViewInsetsListener#onEnd", new fdap() { // from class: dpjw
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dpje dpjeVar = (dpje) obj;
                dpjeVar.getClass();
                KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener = this;
                if (dpjy.a(windowInsetsAnimation)) {
                    dpjeVar.b(keyboardDetectorViewInsetsListener.b.getRootWindowInsets().isVisible(WindowInsets.Type.ime()) ? dpjd.a : dpjd.d);
                }
                dpku dpkuVar = keyboardDetectorViewInsetsListener.b;
                WindowInsets rootWindowInsets = dpkuVar.getRootWindowInsets();
                rootWindowInsets.getClass();
                dpjeVar.a(keyboardDetectorViewInsetsListener.a(rootWindowInsets));
                dpkuVar.requestApplyInsets();
                return fctx.a;
            }
        });
    }

    public final void onPrepare(final WindowInsetsAnimation windowInsetsAnimation) {
        windowInsetsAnimation.getClass();
        super.onPrepare(windowInsetsAnimation);
        if (dpjy.a(windowInsetsAnimation)) {
            final dpkb dpkbVarB = b(windowInsetsAnimation);
            this.c = dpkbVarB;
            this.d = false;
            dpku dpkuVar = this.b;
            final fdae fdaeVar = new fdae() { // from class: dpju
                @Override // defpackage.fdae
                public final Object invoke() {
                    KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener = this.a;
                    ldq.b(keyboardDetectorViewInsetsListener.b, new dpkf(keyboardDetectorViewInsetsListener, dpkbVarB, windowInsetsAnimation));
                    return fctx.a;
                }
            };
            Handler handler = dpkuVar.getHandler();
            if (handler != null) {
                Message messageObtain = Message.obtain(dpkuVar.getHandler(), new Runnable() { // from class: dpjq
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = KeyboardDetectorViewInsetsListener.e;
                        fdaeVar.invoke();
                    }
                });
                messageObtain.setAsynchronous(true);
                handler.sendMessageAtFrontOfQueue(messageObtain);
            }
        }
    }

    public final WindowInsets onProgress(final WindowInsets windowInsets, List list) {
        windowInsets.getClass();
        list.getClass();
        if (this.c != null) {
            e("KeyboardDetectorViewInsetsListener#onProgress", new fdap() { // from class: dpjx
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    dpje dpjeVar = (dpje) obj;
                    dpjeVar.getClass();
                    dpjeVar.a(this.a.a(windowInsets));
                    return fctx.a;
                }
            });
        }
        return windowInsets;
    }

    @OnLifecycleEvent(a = lva.ON_RESUME)
    public final void onResume() {
        this.c = null;
        e(null, new fdap() { // from class: dpjv
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((dpje) obj).getClass();
                this.a.b.requestApplyInsets();
                return fctx.a;
            }
        });
    }

    public final WindowInsetsAnimation.Bounds onStart(final WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        windowInsetsAnimation.getClass();
        bounds.getClass();
        if (dpjy.a(windowInsetsAnimation)) {
            this.d = true;
            e("KeyboardDetectorViewInsetsListener#onStart", new fdap() { // from class: dpjr
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    dpjd dpjdVar;
                    dpje dpjeVar = (dpje) obj;
                    dpjeVar.getClass();
                    KeyboardDetectorViewInsetsListener keyboardDetectorViewInsetsListener = this.a;
                    dpkb dpkbVarB = keyboardDetectorViewInsetsListener.c;
                    if (dpkbVarB == null) {
                        dpkbVarB = keyboardDetectorViewInsetsListener.b(windowInsetsAnimation);
                    }
                    if (dpkbVarB instanceof dpka) {
                        dpjdVar = dpjd.b;
                    } else {
                        if (!(dpkbVarB instanceof dpjz)) {
                            throw new fctg();
                        }
                        dpjdVar = dpjd.c;
                    }
                    dpjeVar.b(dpjdVar);
                    return fctx.a;
                }
            });
        }
        WindowInsetsAnimation.Bounds boundsOnStart = super.onStart(windowInsetsAnimation, bounds);
        boundsOnStart.getClass();
        return boundsOnStart;
    }
}
