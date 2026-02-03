package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pci implements wf {
    final /* synthetic */ pck a;

    public pci(pck pckVar) {
        this.a = pckVar;
    }

    @Override // defpackage.wf
    public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 3) {
            return false;
        }
        this.a.b();
        return false;
    }

    @Override // defpackage.wf
    public final void c(boolean z) {
    }

    @Override // defpackage.wf
    public final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
