package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aab implements wf {
    final /* synthetic */ aam a;

    public aab(aam aamVar) {
        this.a = aamVar;
    }

    @Override // defpackage.wf
    public final void c(boolean z) {
        if (z) {
            this.a.m(null, 0);
        }
    }

    @Override // defpackage.wf
    public final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
        aam aamVar = this.a;
        aamVar.q.onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = aamVar.o;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (aamVar.i == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int iFindPointerIndex = motionEvent.findPointerIndex(aamVar.i);
        if (iFindPointerIndex >= 0) {
            aamVar.g(actionMasked, motionEvent, iFindPointerIndex);
        }
        wv wvVar = aamVar.b;
        if (wvVar != null) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (iFindPointerIndex >= 0) {
                        aamVar.o(motionEvent, aamVar.k, iFindPointerIndex);
                        aamVar.i(wvVar);
                        Runnable runnable = aamVar.n;
                        aamVar.m.removeCallbacks(runnable);
                        runnable.run();
                        aamVar.m.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == aamVar.i) {
                        aamVar.i = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        aamVar.o(motionEvent, aamVar.k, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = aamVar.o;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            aamVar.m(null, 0);
            aamVar.i = -1;
        }
    }

    @Override // defpackage.wf
    public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
        int iFindPointerIndex;
        aam aamVar = this.a;
        aamVar.q.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        aaj aajVar = null;
        if (actionMasked == 0) {
            aamVar.i = motionEvent.getPointerId(0);
            aamVar.c = motionEvent.getX();
            aamVar.d = motionEvent.getY();
            aamVar.j();
            if (aamVar.b == null) {
                List list = aamVar.l;
                if (!list.isEmpty()) {
                    View viewE = aamVar.e(motionEvent);
                    int size = list.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        aaj aajVar2 = (aaj) list.get(size);
                        if (aajVar2.h.a == viewE) {
                            aajVar = aajVar2;
                            break;
                        }
                        size--;
                    }
                }
                if (aajVar != null) {
                    aamVar.c -= aajVar.l;
                    aamVar.d -= aajVar.m;
                    wv wvVar = aajVar.h;
                    aamVar.h(wvVar, true);
                    if (aamVar.a.remove(wvVar.a)) {
                        aamVar.j.n(wvVar);
                    }
                    aamVar.m(wvVar, aajVar.i);
                    aamVar.o(motionEvent, aamVar.k, 0);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            aamVar.i = -1;
            aamVar.m(null, 0);
        } else {
            int i = aamVar.i;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                aamVar.g(actionMasked, motionEvent, iFindPointerIndex);
            }
        }
        VelocityTracker velocityTracker = aamVar.o;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return aamVar.b != null;
    }
}
