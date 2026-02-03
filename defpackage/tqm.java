package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tqm implements ehaw {
    final /* synthetic */ tqo a;

    public tqm(tqo tqoVar) {
        this.a = tqoVar;
    }

    @Override // defpackage.ehaw
    public final egyk a() {
        return cpym.a;
    }

    @Override // defpackage.ehaw
    public final ListenableFuture b() {
        tqo tqoVar = this.a;
        return auvw.c(tqoVar.f, fcyi.a, fdjz.a, new tql(tqoVar, null));
    }
}
