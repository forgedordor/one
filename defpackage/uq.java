package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes.dex */
final class uq implements View.OnTouchListener {
    final /* synthetic */ us a;

    public uq(us usVar) {
        this.a = usVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action != 0) {
            if (action != 1) {
                return false;
            }
            us usVar = this.a;
            usVar.p.removeCallbacks(usVar.o);
            return false;
        }
        us usVar2 = this.a;
        PopupWindow popupWindow = usVar2.r;
        if (popupWindow == null || !popupWindow.isShowing() || x < 0 || x >= usVar2.r.getWidth() || y < 0 || y >= usVar2.r.getHeight()) {
            return false;
        }
        usVar2.p.postDelayed(usVar2.o, 250L);
        return false;
    }
}
