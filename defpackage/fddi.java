package defpackage;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fddi extends fdda {
    @Override // defpackage.fdda
    public final Random e() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        threadLocalRandomCurrent.getClass();
        return threadLocalRandomCurrent;
    }

    @Override // defpackage.fddf
    public final int f(int i) {
        return ThreadLocalRandom.current().nextInt(0, 9);
    }

    @Override // defpackage.fddf
    public final long g(long j) {
        return ThreadLocalRandom.current().nextLong(0L, j);
    }

    @Override // defpackage.fddf
    public final long hw(long j) {
        return ThreadLocalRandom.current().nextLong(j);
    }
}
