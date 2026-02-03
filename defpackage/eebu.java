package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eebu extends TouchDelegate {
    private static final Rect c = new Rect();
    public final List a;
    public TouchDelegate b;

    public eebu(View view) {
        super(c, view);
        this.a = new ArrayList();
    }

    public final void a(TouchDelegate touchDelegate) {
        this.a.add(touchDelegate);
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TouchDelegate touchDelegate;
        boolean zOnTouchEvent;
        int actionMasked = motionEvent.getActionMasked();
        boolean z = false;
        if (actionMasked != 0) {
            TouchDelegate touchDelegate2 = this.b;
            if (touchDelegate2 != null && touchDelegate2.onTouchEvent(motionEvent)) {
                z = true;
            }
            if (actionMasked != 1 && actionMasked != 32) {
                return z;
            }
            this.b = null;
            return z;
        }
        if (motionEvent.getPointerCount() > 1) {
            return false;
        }
        List list = this.a;
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                return false;
            }
            touchDelegate = (TouchDelegate) list.get(size);
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            zOnTouchEvent = touchDelegate.onTouchEvent(motionEvent);
            motionEvent.setLocation(x, y);
        } while (!zOnTouchEvent);
        this.b = touchDelegate;
        return true;
    }
}
