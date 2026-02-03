package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class men {
    public final float a;
    public final double b;
    public final long c;
    public int d;
    private final int e;

    public men(long j, float f) {
        this(j, f, null);
    }

    public final boolean a() {
        return this.d < this.e;
    }

    public men(long j, float f, byte[] bArr) {
        mee.a(j > 0);
        mee.a(f > 0.0f);
        mee.a(j > 0);
        this.c = j;
        this.a = f;
        this.e = Math.max(Math.round((j / 1000000.0f) * f), 1);
        this.b = 1000000.0f / f;
    }
}
