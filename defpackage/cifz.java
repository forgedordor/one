package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cifz {
    private long a;

    public cifz(long j) {
        this.a = j;
    }

    public final cigb a() {
        return new cigb(this.a);
    }

    public final void b(ciga cigaVar) {
        this.a &= ~cigaVar.f;
    }

    public final void c(ciga cigaVar) {
        this.a |= cigaVar.f;
    }
}
