package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eoqf extends eoot {
    private eoqe b;

    public eoqf(ekfn ekfnVar, boolean z, Executor executor, eooy eooyVar) {
        super(ekfnVar, z, false);
        this.b = new eoqc(this, eooyVar, executor);
        t();
    }

    @Override // defpackage.eoot
    public final void g() {
        eoqe eoqeVar = this.b;
        if (eoqeVar != null) {
            eoqeVar.f();
        }
    }

    @Override // defpackage.eooi
    protected final void l() {
        eoqe eoqeVar = this.b;
        if (eoqeVar != null) {
            eoqeVar.h();
        }
    }

    @Override // defpackage.eoot
    public final void v(int i) {
        super.v(i);
        if (i == 1) {
            this.b = null;
        }
    }

    public eoqf(ekfn ekfnVar, boolean z, Executor executor, Callable callable) {
        super(ekfnVar, z, false);
        this.b = new eoqd(this, callable, executor);
        t();
    }

    @Override // defpackage.eoot
    public final void e(int i, Object obj) {
    }
}
