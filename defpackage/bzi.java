package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bzi {
    static bzi d(long j, long j2, bwj bwjVar) {
        lcg.b(j >= 0, "duration must be positive value.");
        lcg.b(j2 >= 0, "bytes must be positive value.");
        return new bww(j, j2, bwjVar);
    }

    public abstract long a();

    public abstract long b();

    public abstract bwj c();
}
