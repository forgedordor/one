package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bar extends bak {
    final Executor n;
    public final Object o = new Object();
    bbm p;
    public baq q;

    public bar(Executor executor) {
        this.n = executor;
    }

    @Override // defpackage.bak
    public final bbm b(bkw bkwVar) {
        return bkwVar.f();
    }

    @Override // defpackage.bak
    public final void d() {
        synchronized (this.o) {
            bbm bbmVar = this.p;
            if (bbmVar != null) {
                bbmVar.close();
                this.p = null;
            }
        }
    }

    @Override // defpackage.bak
    public final void e(bbm bbmVar) {
        synchronized (this.o) {
            if (!this.m) {
                bbmVar.close();
                return;
            }
            if (this.q == null) {
                baq baqVar = new baq(bbmVar, this);
                this.q = baqVar;
                bqk.i(c(baqVar), new ban(baqVar), bpc.a());
            } else {
                if (bbmVar.e().a() <= this.q.e().a()) {
                    bbmVar.close();
                } else {
                    bbm bbmVar2 = this.p;
                    if (bbmVar2 != null) {
                        bbmVar2.close();
                    }
                    this.p = bbmVar;
                }
            }
        }
    }
}
