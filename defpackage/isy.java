package defpackage;

import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class isy {
    public static final void a(irs irsVar, long j, fdap fdapVar, boolean z) {
        MotionEvent motionEventA = irsVar.a();
        if (motionEventA == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEventA.getAction();
        if (z) {
            motionEventA.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        motionEventA.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        fdapVar.invoke(motionEventA);
        motionEventA.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        motionEventA.setAction(action);
    }
}
