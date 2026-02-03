package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class estl extends fbnm {
    private final Object a = new Object();
    private long b;
    private long c;
    private final estk d;

    public estl(estk estkVar) {
        this.d = estkVar;
    }

    @Override // defpackage.fbtg
    public final void b(long j) {
        synchronized (this.a) {
            this.c += j;
        }
    }

    @Override // defpackage.fbtg
    public final void c(long j) {
        synchronized (this.a) {
            this.b += j;
        }
    }

    @Override // defpackage.fbtg
    public final void e() {
        synchronized (this.a) {
            estk estkVar = this.d;
            long j = this.b;
            boolean z = true;
            ejwl.b(j >= 0, "Cannot record negative request bytes.");
            estkVar.g.add(Long.valueOf(j));
            long j2 = this.c;
            if (j2 < 0) {
                z = false;
            }
            ejwl.b(z, "Cannot record negative response bytes.");
            estkVar.h.add(Long.valueOf(j2));
        }
    }
}
