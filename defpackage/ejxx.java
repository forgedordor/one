package defpackage;

import j$.time.Duration;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejxx {
    public static ejxr a(ejxr ejxrVar) {
        return ((ejxrVar instanceof ejxv) || (ejxrVar instanceof ejxt)) ? ejxrVar : ejxrVar instanceof Serializable ? new ejxt(ejxrVar) : new ejxv(ejxrVar);
    }

    public static ejxr b(ejxr ejxrVar, Duration duration) {
        boolean z = false;
        if (!duration.isNegative() && !duration.isZero()) {
            z = true;
        }
        ejwl.f(z, "duration (%s) must be > 0", duration);
        return new ejxs(ejxrVar, ejvv.a(duration));
    }
}
