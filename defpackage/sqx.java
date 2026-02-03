package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sqx implements efze, efzf {
    private final Optional a;
    private final egcd b;
    private final egia c;

    public sqx(Optional optional, egcd egcdVar, egia egiaVar) {
        egcdVar.getClass();
        this.a = optional;
        this.b = egcdVar;
        this.c = egiaVar;
    }

    @Override // defpackage.efze, defpackage.efzc
    public final ListenableFuture a(efzi efziVar) {
        this.a.isPresent();
        return this.c.a();
    }

    @Override // defpackage.efze
    public final ListenableFuture b(efwo efwoVar) {
        efwoVar.getClass();
        return this.b.a(efwoVar);
    }

    @Override // defpackage.efze
    public final /* synthetic */ ListenableFuture c(efwo efwoVar) {
        return efzd.a(this, efwoVar);
    }
}
