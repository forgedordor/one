package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffev implements ffgb {
    final /* synthetic */ ffew a;
    final /* synthetic */ ffgb b;

    public ffev(ffew ffewVar, ffgb ffgbVar) {
        this.a = ffewVar;
        this.b = ffgbVar;
    }

    @Override // defpackage.ffgb
    public final /* synthetic */ ffgd a() {
        return this.a;
    }

    @Override // defpackage.ffgb
    public final long b(ffez ffezVar, long j) throws IOException {
        ffew ffewVar = this.a;
        ffewVar.e();
        try {
            long jB = this.b.b(ffezVar, j);
            if (ffewVar.f()) {
                throw ffewVar.d(null);
            }
            return jB;
        } catch (IOException e) {
            if (ffewVar.f()) {
                throw ffewVar.d(e);
            }
            throw e;
        } finally {
            ffewVar.f();
        }
    }

    @Override // defpackage.ffgb, java.io.Closeable, java.lang.AutoCloseable
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

    public final String toString() {
        return "AsyncTimeout.source(" + this.b + ")";
    }
}
