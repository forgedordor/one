package defpackage;

import androidx.car.app.model.Alert;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqxa {
    public final AtomicReference a = new AtomicReference();
    public final AtomicInteger b = new AtomicInteger();
    public final Supplier c;

    public dqxa(Supplier supplier) {
        this.c = supplier;
    }

    public final int a() {
        Thread thread = (Thread) this.a.get();
        return (thread != null && thread == Thread.currentThread()) ? ((Integer) this.c.get()).intValue() : Alert.DURATION_SHOW_INDEFINITELY;
    }
}
