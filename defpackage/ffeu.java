package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffeu implements fffz {
    final /* synthetic */ ffew a;
    final /* synthetic */ fffz b;

    public ffeu(ffew ffewVar, fffz fffzVar) {
        this.a = ffewVar;
        this.b = fffzVar;
    }

    @Override // defpackage.fffz
    public final /* synthetic */ ffgd a() {
        return this.a;
    }

    @Override // defpackage.fffz, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ffew ffewVar = this.a;
        ffewVar.e();
        try {
            this.b.close();
            if (ffewVar.f()) {
                throw ffewVar.d(null);
            }
        } catch (IOException e) {
            if (!ffewVar.f()) {
                throw e;
            }
            throw ffewVar.d(e);
        } finally {
            ffewVar.f();
        }
    }

    @Override // defpackage.fffz, java.io.Flushable
    public final void flush() throws IOException {
        ffew ffewVar = this.a;
        ffewVar.e();
        try {
            this.b.flush();
            if (ffewVar.f()) {
                throw ffewVar.d(null);
            }
        } catch (IOException e) {
            if (!ffewVar.f()) {
                throw e;
            }
            throw ffewVar.d(e);
        } finally {
            ffewVar.f();
        }
    }

    @Override // defpackage.fffz
    public final void hO(ffez ffezVar, long j) throws IOException {
        ffes.b(ffezVar.b, 0L, j);
        while (true) {
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            fffw fffwVar = ffezVar.a;
            fffwVar.getClass();
            while (true) {
                if (j2 >= 65536) {
                    break;
                }
                j2 += fffwVar.c - fffwVar.b;
                if (j2 >= j) {
                    j2 = j;
                    break;
                } else {
                    fffwVar = fffwVar.f;
                    fffwVar.getClass();
                }
            }
            ffew ffewVar = this.a;
            fffz fffzVar = this.b;
            ffewVar.e();
            try {
                try {
                    fffzVar.hO(ffezVar, j2);
                    if (ffewVar.f()) {
                        throw ffewVar.d(null);
                    }
                    j -= j2;
                } catch (IOException e) {
                    if (!ffewVar.f()) {
                        throw e;
                    }
                    throw ffewVar.d(e);
                }
            } catch (Throwable th) {
                ffewVar.f();
                throw th;
            }
        }
    }

    public final String toString() {
        return "AsyncTimeout.sink(" + this.b + ")";
    }
}
