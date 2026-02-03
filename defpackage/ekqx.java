package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekqx extends ekse {
    public static final ekrt a = new ekqv();
    public final AtomicLong b = new AtomicLong(-1);

    @Override // defpackage.ekse
    public final void a() {
        AtomicLong atomicLong = this.b;
        atomicLong.set(Math.max(-atomicLong.get(), 0L));
    }
}
