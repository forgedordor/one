package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pbk implements wf, pcl {
    private final wf a;
    private boolean b;

    public pbk(wf wfVar) {
        this.a = wfVar;
    }

    @Override // defpackage.wf
    public final void c(boolean z) {
        this.b = true;
    }

    @Override // defpackage.wf
    public final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.a.j(recyclerView, motionEvent);
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
        return !this.b && this.a.j(recyclerView, motionEvent);
    }

    @Override // defpackage.pcl
    public final boolean k() {
        return this.b;
    }
}
