package defpackage;

import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqkl extends dqko {
    final /* synthetic */ eosd a;
    final /* synthetic */ fcsu b;

    public dqkl(eosd eosdVar, fcsu fcsuVar) {
        this.a = eosdVar;
        this.b = fcsuVar;
    }

    @Override // defpackage.eoqu, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(new dqkn(runnable, this.b));
    }

    @Override // defpackage.dqko, defpackage.eoqz
    public final /* synthetic */ eosc h() {
        return this.a;
    }

    @Override // defpackage.eoqu, defpackage.eker
    public final /* synthetic */ Object hp() {
        return this.a;
    }

    @Override // defpackage.eoqz, defpackage.eoqu
    public final /* synthetic */ ExecutorService i() {
        return this.a;
    }

    @Override // defpackage.dqko
    public final eosd j() {
        return this.a;
    }

    @Override // defpackage.eoqu, java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.eoqu, java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.eker
    public final String toString() {
        return "ExceptionHandling[" + super.toString() + "]";
    }
}
