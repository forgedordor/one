package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pbl implements wf, pcl {
    public boolean a;

    @Override // defpackage.wf
    public final void c(boolean z) {
        throw new UnsupportedOperationException("Wrap me in an InterceptFilter.");
    }

    @Override // defpackage.pcl
    public final void g() {
        this.a = false;
    }

    @Override // defpackage.wf
    public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (pbz.d(motionEvent) && this.a) {
            this.a = false;
            return true;
        }
        if (pbz.b(motionEvent) && this.a) {
            g();
        }
        return false;
    }

    @Override // defpackage.pcl
    public final boolean k() {
        return this.a;
    }

    @Override // defpackage.wf
    public final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
