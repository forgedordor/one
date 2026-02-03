package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aisq implements Closeable {
    public final int a;
    public final int b;
    public final long c;
    final /* synthetic */ aisw d;

    public aisq(aisw aiswVar, int i, int i2, long j) {
        this.d = aiswVar;
        this.a = i;
        this.b = i2;
        this.c = j;
    }

    public final void a() {
        this.d.f(this, exmt.CANCELLED);
    }

    public final void b() {
        this.d.f(this, exmt.OK);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.f(this, exmt.OK);
    }
}
