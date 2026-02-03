package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvom implements ehaw {
    final /* synthetic */ bvoq a;
    final /* synthetic */ efwo b;

    public bvom(bvoq bvoqVar, efwo efwoVar) {
        this.a = bvoqVar;
        this.b = efwoVar;
    }

    @Override // defpackage.ehaw
    public final egyk a() {
        return bvpf.a;
    }

    @Override // defpackage.ehaw
    public final ListenableFuture b() {
        bvoq bvoqVar = this.a;
        return auvw.c(bvoqVar.h, fcyi.a, fdjz.a, new bvol(bvoqVar, this.b, null));
    }
}
