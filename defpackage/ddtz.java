package defpackage;

import android.content.Context;
import android.os.SystemClock;
import j$.util.concurrent.ThreadLocalRandom;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddtz implements AutoCloseable {
    private final int c;
    private final Context d;
    private final float e;
    private int f = 13;
    private final long a = System.currentTimeMillis();
    private final long b = SystemClock.uptimeMillis();

    public ddtz(Context context, int i, float f) {
        this.c = i;
        this.d = context;
        this.e = f;
    }

    public final void a() {
        this.f = 0;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Context context = this.d;
        if (ddty.a == null) {
            synchronized (ddty.b) {
                if (ddty.a == null) {
                    ddty.a = new ddty(context);
                }
            }
        }
        int i = this.c;
        ddty ddtyVar = ddty.a;
        int i2 = this.f;
        long j = this.a;
        long j2 = this.b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jUptimeMillis = SystemClock.uptimeMillis() - j2;
        if (ThreadLocalRandom.current().nextFloat() < this.e) {
            ddtyVar.a(i, i2, j, jCurrentTimeMillis, (int) jUptimeMillis);
        }
    }
}
