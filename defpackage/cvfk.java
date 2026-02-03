package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvfk implements ehaw {
    final /* synthetic */ cvfm a;

    public cvfk(cvfm cvfmVar) {
        this.a = cvfmVar;
    }

    @Override // defpackage.ehaw
    public final /* synthetic */ egyk a() {
        return cvfm.c;
    }

    @Override // defpackage.ehaw
    public final ListenableFuture b() {
        cvfm cvfmVar = this.a;
        return auvw.c(cvfmVar.k, fcyi.a, fdjz.a, new cvfj(cvfmVar, null));
    }
}
