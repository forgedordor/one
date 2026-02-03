package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eghx implements efze, efzf {
    private final egia a;
    private final egcd b;

    public eghx(egia egiaVar, egcd egcdVar) {
        this.a = egiaVar;
        this.b = egcdVar;
    }

    @Override // defpackage.efze, defpackage.efzc
    public final ListenableFuture a(efzi efziVar) {
        return this.a.a();
    }

    @Override // defpackage.efze
    public final ListenableFuture b(efwo efwoVar) {
        return this.b.a(efwoVar);
    }

    @Override // defpackage.efze
    public final /* synthetic */ ListenableFuture c(efwo efwoVar) {
        return efzd.a(this, efwoVar);
    }
}
