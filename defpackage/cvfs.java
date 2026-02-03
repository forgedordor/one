package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvfs implements ehaw {
    final /* synthetic */ cvfu a;

    public cvfs(cvfu cvfuVar) {
        this.a = cvfuVar;
    }

    @Override // defpackage.ehaw
    public final /* synthetic */ egyk a() {
        return cvfu.b;
    }

    @Override // defpackage.ehaw
    public final ListenableFuture b() {
        cvfu cvfuVar = this.a;
        return auvw.c(cvfuVar.g, fcyi.a, fdjz.a, new cvfr(cvfuVar, null));
    }
}
