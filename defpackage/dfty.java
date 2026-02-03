package defpackage;

import j$.time.Duration;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfty {
    public dfty() {
        int iIntValue = ((Integer) dfog.o().a.av.a()).intValue();
        int iIntValue2 = ((Integer) dfog.o().a.aw.a()).intValue();
        int iIntValue3 = ((Integer) dfog.o().a.ax.a()).intValue();
        ejwl.b(iIntValue > 0, "Capacity must be positive");
        ejwl.b(iIntValue2 > 0, "Refill rate must be positive");
        ejwl.b(iIntValue3 > 0, "Refill amount must be positive");
        Duration.ofMillis(iIntValue2).toNanos();
        new ArrayDeque();
    }
}
