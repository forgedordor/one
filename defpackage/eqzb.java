package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqzb {
    public static final Logger a = Logger.getLogger(eqzb.class.getName());
    private static final AtomicBoolean b = new AtomicBoolean(false);

    private eqzb() {
    }

    public static boolean a() {
        return b.get();
    }
}
