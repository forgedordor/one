package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbzn {
    public static final Logger a = Logger.getLogger(fbzn.class.getName());
    public final String b;
    public final AtomicLong c;

    public fbzn(long j) {
        AtomicLong atomicLong = new AtomicLong();
        this.c = atomicLong;
        ejwl.b(j > 0, "value must be positive");
        this.b = "keepalive time nanos";
        atomicLong.set(j);
    }
}
