package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dqpi {
    private static final AtomicInteger a = new AtomicInteger();
    public final int h;
    public final Consumer i;

    public dqpi() {
        this.h = a.getAndIncrement();
        this.i = null;
    }

    public Object d(dqwl dqwlVar, dqsd dqsdVar) {
        c(dqwlVar, dqsdVar);
        return null;
    }

    public void e(dqwl dqwlVar, dqsd dqsdVar, Object obj) {
        b(dqwlVar, dqsdVar);
    }

    public final int hashCode() {
        return this.h;
    }

    public dqpi(Consumer consumer) {
        this.h = a.getAndIncrement();
        this.i = consumer;
    }

    public void ga(dqwl dqwlVar) {
    }

    public void b(dqwl dqwlVar, dqsd dqsdVar) {
    }

    public void c(dqwl dqwlVar, dqsd dqsdVar) {
    }
}
