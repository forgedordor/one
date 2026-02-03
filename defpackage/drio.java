package defpackage;

import android.graphics.Point;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drio implements ViewTreeObserver.OnGlobalLayoutListener {
    private View a;
    private drin b;

    public final void a() {
        View view = this.a;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        this.a = null;
        this.b = null;
    }

    public final void b(drin drinVar, View view) {
        this.b = drinVar;
        this.a = view;
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Point pointB = this.b.B();
        this.a.measure(pointB.x, pointB.y);
        this.b.E(this.a.getMeasuredWidth(), this.a.getMeasuredHeight());
        a();
    }
}
