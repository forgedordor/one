package defpackage;

import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxxb implements eora {
    final /* synthetic */ SettableFuture a;
    final /* synthetic */ bxxc b;

    public bxxb(bxxc bxxcVar, SettableFuture settableFuture) {
        this.a = settableFuture;
        this.b = bxxcVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        bxxc bxxcVar = this.b;
        bxxcVar.b = null;
        this.a.set((bxwf) obj);
        bxxcVar.b();
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        this.a.set(bxwf.e());
        this.b.b();
    }
}
