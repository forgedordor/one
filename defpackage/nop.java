package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nop implements noq {
    private final long a;
    private final noo b;

    public nop(long j) {
        this(j, 0L);
    }

    @Override // defpackage.noq
    public final noo b(long j) {
        return this.b;
    }

    @Override // defpackage.noq
    public final long w() {
        return this.a;
    }

    @Override // defpackage.noq
    public final boolean y() {
        return false;
    }

    public nop(long j, long j2) {
        this.a = j;
        nor norVar = j2 == 0 ? nor.a : new nor(0L, j2);
        this.b = new noo(norVar, norVar);
    }
}
