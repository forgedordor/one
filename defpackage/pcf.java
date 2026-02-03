package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pcf implements wf {
    private final pbx a;
    private boolean b;

    public pcf(pbx pbxVar, pcq pcqVar) {
        lcg.a(true);
        lcg.a(pcqVar != null);
        this.a = pbxVar;
    }

    @Override // defpackage.wf
    public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
        boolean z;
        if (pbz.g(motionEvent)) {
            motionEvent.getX();
            motionEvent.getY();
            if (pbz.b(motionEvent)) {
                pbx pbxVar = this.a;
                if (pbxVar.b(motionEvent)) {
                    pbxVar.a(motionEvent);
                    z = true;
                } else {
                    z = false;
                }
                this.b = z;
            } else if (this.b && pbz.c(motionEvent)) {
                ViewConfiguration.get(recyclerView.getContext()).getScaledTouchSlop();
            }
        }
        return false;
    }

    @Override // defpackage.wf
    public final void c(boolean z) {
    }

    @Override // defpackage.wf
    public final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
