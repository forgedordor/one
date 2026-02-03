package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffcq implements fffz {
    public final boolean a;
    public boolean b;
    final /* synthetic */ ffct c;
    private final ffez d = new ffez();

    public ffcq(ffct ffctVar, boolean z) {
        this.c = ffctVar;
        this.a = z;
    }

    private final void c(boolean z) {
        ffcs ffcsVar;
        ffez ffezVar;
        long jMin;
        boolean z2;
        ffct ffctVar = this.c;
        synchronized (ffctVar) {
            ffcsVar = ffctVar.j;
            ffcsVar.e();
            while (ffctVar.e >= ffctVar.f && !this.a && !this.b && ffctVar.j() == 0) {
                try {
                    ffctVar.g();
                } catch (Throwable th) {
                    ffctVar.j.b();
                    throw th;
                }
            }
            ffcsVar.b();
            ffctVar.e();
            long j = ffctVar.f - ffctVar.e;
            ffezVar = this.d;
            jMin = Math.min(j, ffezVar.b);
            ffctVar.e += jMin;
            boolean z3 = false;
            if (z && jMin == ffezVar.b) {
                z3 = true;
            }
            z2 = z3;
        }
        ffcsVar.e();
        try {
            ffctVar.b.f(ffctVar.a, z2, ffezVar, jMin);
        } finally {
            this.c.j.b();
        }
    }

    @Override // defpackage.fffz
    public final ffgd a() {
        return this.c.j;
    }

    @Override // defpackage.fffz, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        byte[] bArr = fezr.a;
        ffct ffctVar = this.c;
        synchronized (ffctVar) {
            if (this.b) {
                return;
            }
            int iJ = ffctVar.j();
            ffct ffctVar2 = this.c;
            if (!ffctVar2.h.a) {
                ffez ffezVar = this.d;
                if (ffezVar.b > 0) {
                    while (ffezVar.b > 0) {
                        c(true);
                    }
                } else if (iJ == 0) {
                    ffctVar2.b.f(ffctVar2.a, true, null, 0L);
                }
            }
            synchronized (ffctVar2) {
                this.b = true;
            }
            ffct ffctVar3 = this.c;
            ffctVar3.b.d();
            ffctVar3.d();
        }
    }

    @Override // defpackage.fffz, java.io.Flushable
    public final void flush() {
        byte[] bArr = fezr.a;
        ffct ffctVar = this.c;
        synchronized (ffctVar) {
            ffctVar.e();
        }
        while (this.d.b > 0) {
            c(false);
            this.c.b.d();
        }
    }

    @Override // defpackage.fffz
    public final void hO(ffez ffezVar, long j) {
        byte[] bArr = fezr.a;
        ffez ffezVar2 = this.d;
        ffezVar2.hO(ffezVar, j);
        while (ffezVar2.b >= 16384) {
            c(false);
        }
    }
}
