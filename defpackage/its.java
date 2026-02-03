package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class its {
    public final itr a = new itr(1, 1);
    public final itr b = new itr(1, 1);
    public long c;

    public final void a(long j, long j2) {
        this.a.b(j, Float.intBitsToFloat((int) (j2 >> 32)));
        this.b.b(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public final void b() {
        this.a.c();
        this.b.c();
        this.c = 0L;
    }
}
