package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvdo implements ehaw {
    final /* synthetic */ cvdq a;

    public cvdo(cvdq cvdqVar) {
        this.a = cvdqVar;
    }

    @Override // defpackage.ehaw
    public final /* synthetic */ egyk a() {
        return cvdq.b;
    }

    @Override // defpackage.ehaw
    public final ListenableFuture b() {
        cvdq cvdqVar = this.a;
        return auvw.c(cvdqVar.e, fcyi.a, fdjz.a, new cvdn(cvdqVar, null));
    }
}
