package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xv extends TouchDelegate {
    private final View a;
    private final Rect b;
    private final Rect c;
    private final Rect d;
    private final int e;
    private boolean f;

    public xv(Rect rect, Rect rect2, View view) {
        super(rect, view);
        this.e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.b = new Rect();
        this.d = new Rect();
        this.c = new Rect();
        a(rect, rect2);
        this.a = view;
    }

    public final void a(Rect rect, Rect rect2) {
        this.b.set(rect);
        Rect rect3 = this.d;
        rect3.set(rect);
        int i = -this.e;
        rect3.inset(i, i);
        this.c.set(rect2);
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z3 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z2 = this.f;
                if (z2 && !this.d.contains(x, y)) {
                    z3 = z2;
                    z = false;
                }
            } else {
                if (action == 3) {
                    z2 = this.f;
                    this.f = false;
                }
                z = true;
                z3 = false;
            }
            z3 = z2;
            z = true;
        } else if (this.b.contains(x, y)) {
            this.f = true;
            z = true;
        } else {
            z = true;
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        if (!z || this.c.contains(x, y)) {
            Rect rect = this.c;
            motionEvent.setLocation(x - rect.left, y - rect.top);
        } else {
            View view = this.a;
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return this.a.dispatchTouchEvent(motionEvent);
    }
}
