package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pbo implements wf, pcl {
    private final pcz a = new pcz(new pcy());
    private boolean b;

    public final void a(pda pdaVar, wf wfVar) {
        lcg.a(wfVar != null);
        this.a.b(pdaVar, wfVar);
    }

    @Override // defpackage.wf
    public final void c(boolean z) {
        if (z) {
            this.b = true;
        }
    }

    @Override // defpackage.wf
    public final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.b) {
            return;
        }
        ((wf) this.a.a(motionEvent)).d(recyclerView, motionEvent);
    }

    @Override // defpackage.pcl
    public final void g() {
        this.b = false;
    }

    @Override // defpackage.wf
    public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.b && pbz.b(motionEvent)) {
            this.b = false;
        }
        return !this.b && ((wf) this.a.a(motionEvent)).j(recyclerView, motionEvent);
    }

    @Override // defpackage.pcl
    public final boolean k() {
        return this.b;
    }
}
