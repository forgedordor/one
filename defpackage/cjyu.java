package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjyu implements ehaw {
    final /* synthetic */ cjzf a;
    final /* synthetic */ String b;

    public cjyu(cjzf cjzfVar, String str) {
        this.a = cjzfVar;
        this.b = str;
    }

    @Override // defpackage.ehaw
    public final egyk a() {
        return cjzf.b;
    }

    @Override // defpackage.ehaw
    public final /* bridge */ /* synthetic */ ListenableFuture b() {
        String str = this.b;
        cjzf cjzfVar = this.a;
        return auvw.c(cjzfVar.d, fcyi.a, fdjz.a, new cjyt(str, cjzfVar, null));
    }
}
