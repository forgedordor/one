package defpackage;

import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class pbx {
    public abstract pbw a(MotionEvent motionEvent);

    final boolean b(MotionEvent motionEvent) {
        pbw pbwVarA = a(motionEvent);
        return (pbwVarA == null || ((acwz) pbwVarA).b == -1) ? false : true;
    }

    protected final boolean c(MotionEvent motionEvent) {
        pbw pbwVarA;
        return (!b(motionEvent) || (pbwVarA = a(motionEvent)) == null || ((acwz) pbwVarA).a == null) ? false : true;
    }
}
