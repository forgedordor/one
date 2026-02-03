package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daad implements ehaw {
    final /* synthetic */ daae a;

    public daad(daae daaeVar) {
        this.a = daaeVar;
    }

    @Override // defpackage.ehaw
    public final egyk a() {
        return daae.a;
    }

    @Override // defpackage.ehaw
    public final ListenableFuture b() {
        daae daaeVar = this.a;
        return auvw.c(daaeVar.b, fcyi.a, fdjz.a, new daac(daaeVar, null));
    }
}
