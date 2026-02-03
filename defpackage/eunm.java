package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eunm implements ViewTreeObserver.OnPreDrawListener, ViewTreeObserver.OnWindowFocusChangeListener, ViewTreeObserver.OnGlobalFocusChangeListener, ViewTreeObserver.OnWindowAttachListener {
    private final eund a;
    private final TextView b;
    private final int e;
    private final int f;
    private long g = System.currentTimeMillis() - 300;
    private final Rect c = new Rect();
    private final Rect d = new Rect();

    public eunm(eund eundVar, TextView textView, int i, int i2) {
        this.a = eundVar;
        this.b = textView;
        this.e = i;
        this.f = i2;
    }

    private final boolean a(boolean z, String str) {
        if (eunn.f(this.b, z)) {
            return false;
        }
        eunn.c(a.a(str, "TextViewListener.", ": Dismissing toolbar."));
        eunn.b(this.a);
        return true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        a(true, "onGlobalFocusChanged");
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!a(true, "onPreDraw")) {
            eund eundVar = this.a;
            if (eundVar.i() && jCurrentTimeMillis - this.g >= 300) {
                Rect rect = this.d;
                eunn.e(rect, this.b, this.e, this.f);
                Rect rect2 = this.c;
                if (!rect.equals(rect2)) {
                    rect2.set(rect);
                    eundVar.e(rect2);
                    eundVar.g();
                    this.g = jCurrentTimeMillis;
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewTreeObserver.OnWindowAttachListener
    public final void onWindowAttached() {
        a(true, "onWindowAttached");
    }

    @Override // android.view.ViewTreeObserver.OnWindowAttachListener
    public final void onWindowDetached() {
        a(true, "onWindowDetached");
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        a(z, "onWindowFocusChanged");
    }
}
