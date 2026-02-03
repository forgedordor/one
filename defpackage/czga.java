package defpackage;

import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czga extends cvjh {
    final /* synthetic */ czgf b;

    public czga(czgf czgfVar) {
        this.b = czgfVar;
    }

    @Override // defpackage.cvjh
    public final void a() {
        czgf czgfVar = this.b;
        if (czgfVar.j != czgd.VIDEO) {
            czgfVar.d();
        } else if (czgfVar.i()) {
            czgfVar.c();
        } else {
            czgfVar.b();
        }
    }

    @Override // defpackage.cvjh
    public final void b() {
        czgf czgfVar = this.b;
        if (czgfVar.j == czgd.VIDEO && czgfVar.i()) {
            czgfVar.c();
        }
    }

    @Override // defpackage.cvjh, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        super.onLongPress(motionEvent);
        czgf czgfVar = this.b;
        czgd czgdVar = czgfVar.j;
        czgd czgdVar2 = czgd.VIDEO;
        if (czgdVar == czgdVar2) {
            czgfVar.w.performHapticFeedback(0);
        }
        if (czgfVar.j == czgd.PHOTO) {
            czgfVar.k(czgdVar2, 5);
        }
        czgfVar.b();
        czgfVar.D.setPressed(false);
    }
}
