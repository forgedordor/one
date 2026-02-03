package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjrn implements ehaw {
    final /* synthetic */ cjqt a;
    final /* synthetic */ cjrp b;

    public cjrn(cjrp cjrpVar, cjqt cjqtVar) {
        this.a = cjqtVar;
        this.b = cjrpVar;
    }

    @Override // defpackage.ehaw
    public final egyk a() {
        return cjxi.c;
    }

    @Override // defpackage.ehaw
    public final ListenableFuture b() {
        return this.b.c(this.a);
    }
}
