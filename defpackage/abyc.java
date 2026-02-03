package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abyc implements ehaw {
    final /* synthetic */ abyd a;

    public abyc(abyd abydVar) {
        this.a = abydVar;
    }

    @Override // defpackage.ehaw
    public final egyk a() {
        return cpyk.b;
    }

    @Override // defpackage.ehaw
    public final ListenableFuture b() {
        abyd abydVar = this.a;
        return auvw.c(abydVar.b, fcyi.a, fdjz.a, new abyb(abydVar, null));
    }
}
