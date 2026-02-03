package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sqw implements efze, efzf {
    public final egkc a;
    public final egjv b;
    public eiju c;

    public sqw(egkc egkcVar, egjv egjvVar) {
        egkcVar.getClass();
        this.a = egkcVar;
        this.b = egjvVar;
    }

    @Override // defpackage.efze, defpackage.efzc
    public final /* bridge */ /* synthetic */ ListenableFuture a(efzi efziVar) {
        eiju eijuVar = this.c;
        if (eijuVar != null) {
            return eijuVar;
        }
        eiju eijuVarG = eiju.g(this.a.a(efziVar));
        eijuVarG.getClass();
        return eijuVarG;
    }

    @Override // defpackage.efze
    public final ListenableFuture b(efwo efwoVar) {
        efwoVar.getClass();
        return this.a.b(efwoVar);
    }

    @Override // defpackage.efze
    public final /* synthetic */ ListenableFuture c(efwo efwoVar) {
        return efzd.a(this, efwoVar);
    }
}
