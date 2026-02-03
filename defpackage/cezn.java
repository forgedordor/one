package defpackage;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cezn {
    public static final cezn a = new cezn();
    private static final List b = new ArrayList();

    private cezn() {
    }

    public final synchronized ekgb a() {
        return ekfv.a(b);
    }

    public final synchronized void b(MotionEvent motionEvent) {
        List list = b;
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.getClass();
        list.add(motionEventObtain);
    }

    public final synchronized void c() {
        b.clear();
    }
}
