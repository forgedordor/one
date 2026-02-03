package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drha implements View.OnTouchListener {
    final /* synthetic */ Button a;

    public drha(Button button) {
        this.a = button;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.a.onTouchEvent(motionEvent);
        return true;
    }
}
