package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffcr implements ffgb {
    public final long a;
    public boolean b;
    public final ffez c = new ffez();
    public final ffez d = new ffez();
    public boolean e;
    final /* synthetic */ ffct f;

    public ffcr(ffct ffctVar, long j, boolean z) {
        this.f = ffctVar;
        this.a = j;
        this.b = z;
    }

    @Override // defpackage.ffgb
    public final ffgd a() {
        return this.f.i;
    }

    @Override // defpackage.ffgb
    public final long b(ffez ffezVar, long j) throws Throwable {
        Throwable th;
        Throwable ffdaVar;
        boolean z;
        long jB;
        do {
            ffct ffctVar = this.f;
            synchronized (ffctVar) {
                ffcs ffcsVar = ffctVar.i;
                ffcsVar.e();
                try {
                    th = null;
                    if (ffctVar.j() == 0 || this.b) {
                        ffdaVar = null;
                    } else {
                        ffdaVar = ffctVar.k;
                        if (ffdaVar == null) {
                            int iJ = ffctVar.j();
                            if (iJ == 0) {
                                throw null;
                            }
                            ffdaVar = new ffda(iJ);
                        }
                    }
                    if (this.e) {
                        throw new IOException("stream closed");
                    }
                    ffez ffezVar2 = this.d;
                    long j2 = ffezVar2.b;
                    z = false;
                    if (j2 > 0) {
                        jB = ffezVar2.b(ffezVar, Math.min(8192L, j2));
                        long j3 = ffctVar.c + jB;
                        ffctVar.c = j3;
                        long j4 = j3 - ffctVar.d;
                        if (ffdaVar == null) {
                            ffcl ffclVar = ffctVar.b;
                            if (j4 >= ffclVar.q.c() / 2) {
                                ffclVar.h(ffctVar.a, j4);
                                ffctVar.d = ffctVar.c;
                            }
                        } else {
                            th = ffdaVar;
                        }
                    } else {
                        if (this.b || ffdaVar != null) {
                            th = ffdaVar;
                        } else {
                            ffctVar.g();
                            z = true;
                        }
                        jB = -1;
                    }
                    ffcsVar.b();
                } catch (Throwable th2) {
                    ffctVar.i.b();
                    throw th2;
                }
            }
        } while (z);
        if (jB != -1) {
            return jB;
        }
        if (th == null) {
            return -1L;
        }
        throw th;
    }

    public final void c(long j) {
        byte[] bArr = fezr.a;
        this.f.b.e(j);
    }

    @Override // defpackage.ffgb, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        ffct ffctVar = this.f;
        synchronized (ffctVar) {
            this.e = true;
            ffez ffezVar = this.d;
            j = ffezVar.b;
            ffezVar.B();
            ffctVar.notifyAll();
        }
        if (j > 0) {
            c(j);
        }
        this.f.d();
    }
}
