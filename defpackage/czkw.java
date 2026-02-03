package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czkw extends cvjh {
    final /* synthetic */ int b;
    final /* synthetic */ View c;
    final /* synthetic */ czkx d;

    public czkw(czkx czkxVar, int i, View view) {
        this.b = i;
        this.c = view;
        this.d = czkxVar;
    }

    @Override // defpackage.cvjh
    public final void a() {
        czkx czkxVar = this.d;
        int i = this.b;
        if (i == czkxVar.e) {
            return;
        }
        czkxVar.f = i;
        czkxVar.a.at(i);
    }

    @Override // defpackage.cvjh, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        super.onLongPress(motionEvent);
        this.c.performHapticFeedback(0);
    }

    @Override // defpackage.cvjh
    public final void b() {
    }
}
