package defpackage;

import java.net.SocketTimeoutException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffcs extends ffew {
    final /* synthetic */ ffct a;

    public ffcs(ffct ffctVar) {
        this.a = ffctVar;
    }

    @Override // defpackage.ffew
    protected final void a() {
        ffct ffctVar = this.a;
        ffctVar.l(9);
        ffcl ffclVar = ffctVar.b;
        synchronized (ffclVar) {
            long j = ffclVar.n;
            long j2 = ffclVar.m;
            if (j >= j2) {
                ffclVar.m = j2 + 1;
                ffclVar.p = System.nanoTime() + 1000000000;
                ffclVar.i.f(new ffci(String.valueOf(ffclVar.d).concat(" ping"), ffclVar));
            }
        }
    }

    public final void b() {
        if (f()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
