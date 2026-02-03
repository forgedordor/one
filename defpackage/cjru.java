package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjru implements ehaw {
    final /* synthetic */ cjrv a;
    final /* synthetic */ String b;

    public cjru(cjrv cjrvVar, String str) {
        this.a = cjrvVar;
        this.b = str;
    }

    @Override // defpackage.ehaw
    public final egyk a() {
        return cjrv.a;
    }

    @Override // defpackage.ehaw
    public final /* bridge */ /* synthetic */ ListenableFuture b() {
        cjrv cjrvVar = this.a;
        return auvw.c(cjrvVar.b, fcyi.a, fdjz.a, new cjrt(cjrvVar, this.b, null));
    }
}
