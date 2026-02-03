package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhfr implements ehaw {
    final /* synthetic */ fhft a;

    public fhfr(fhft fhftVar) {
        this.a = fhftVar;
    }

    @Override // defpackage.ehaw
    public final egyk a() {
        return cpxy.a;
    }

    @Override // defpackage.ehaw
    public final ListenableFuture b() {
        fhft fhftVar = this.a;
        return auvw.c(fhftVar.d, fcyi.a, fdjz.a, new fhfq(fhftVar, null));
    }
}
