package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eebw implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;

    public eebw(View view, View view2, int i, int i2, int i3) {
        this.a = view;
        this.b = view2;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eebu eebuVar;
        Rect rect = new Rect();
        View view = this.a;
        Rect rect2 = eebx.a;
        view.getHitRect(rect2);
        rect.set(rect2);
        Object parent = view.getParent();
        while (true) {
            View view2 = this.b;
            if (parent == view2) {
                rect.left -= this.c;
                rect.top = rect.top;
                rect.right += this.d;
                rect.bottom += this.e;
                TouchDelegate touchDelegate = new TouchDelegate(rect, view);
                TouchDelegate touchDelegate2 = view2.getTouchDelegate();
                if (touchDelegate2 == null) {
                    eebuVar = new eebu(view2);
                } else if (touchDelegate2 instanceof eebu) {
                    eebuVar = (eebu) touchDelegate2;
                } else {
                    eebu eebuVar2 = new eebu(view2);
                    eebuVar2.a(touchDelegate2);
                    eebuVar = eebuVar2;
                }
                eebuVar.a(touchDelegate);
                view2.setTouchDelegate(eebuVar);
                view.addOnAttachStateChangeListener(new eebv(eebuVar, touchDelegate));
                return;
            }
            if (!(parent instanceof View)) {
                return;
            }
            View view3 = (View) parent;
            view3.getHitRect(rect2);
            rect.offset(rect2.left, rect2.top);
            parent = view3.getParent();
        }
    }
}
