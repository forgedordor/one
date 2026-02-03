package defpackage;

import android.view.MotionEvent;
import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jnq {
    public static final jnq a = new jnq();

    private jnq() {
    }

    public final boolean a(MotionEvent motionEvent, int i) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i)) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i)) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040;
    }
}
