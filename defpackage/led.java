package defpackage;

import android.view.VelocityTracker;
import j$.util.DesugarCollections;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class led {
    public static final Map a = DesugarCollections.synchronizedMap(new WeakHashMap());

    public static lee a(VelocityTracker velocityTracker) {
        return (lee) a.get(velocityTracker);
    }
}
