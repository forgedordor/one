package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgqq implements fgqp {
    private static final Set a = Collections.singleton("UTC");

    @Override // defpackage.fgqp
    public final Set a() {
        return a;
    }

    @Override // defpackage.fgqp
    public final fgmz b(String str) {
        if ("UTC".equalsIgnoreCase(str)) {
            return fgmz.a;
        }
        return null;
    }
}
