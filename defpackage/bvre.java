package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvre implements ehaw {
    final /* synthetic */ bvsb a;

    public bvre(bvsb bvsbVar) {
        this.a = bvsbVar;
    }

    @Override // defpackage.ehaw
    public final egyk a() {
        return bvqt.a;
    }

    @Override // defpackage.ehaw
    public final ListenableFuture b() {
        bvsb bvsbVar = this.a;
        return auvw.c(bvsbVar.c, fcyi.a, fdjz.a, new bvrd(bvsbVar, null));
    }
}
