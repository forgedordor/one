package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcwr {
    public static final Iterator a(Iterator it, int i, int i2, boolean z, boolean z2) {
        it.getClass();
        return !it.hasNext() ? fcvn.a : fdey.a(new fcwq(i, i2, it, z2, z, null));
    }

    public static final void b(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException(i != i2 ? a.z(i2, i, "Both size ", " and step ", " must be greater than zero.") : a.e(i, "size ", " must be greater than zero."));
        }
    }
}
