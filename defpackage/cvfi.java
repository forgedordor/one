package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvfi implements ehaw {
    final /* synthetic */ cvfm a;

    public cvfi(cvfm cvfmVar) {
        this.a = cvfmVar;
    }

    @Override // defpackage.ehaw
    public final /* bridge */ /* synthetic */ egyk a() {
        return crxn.a;
    }

    @Override // defpackage.ehaw
    public final ListenableFuture b() {
        cvfm cvfmVar = this.a;
        return eicj.d(cvfmVar.k, new cvfh(cvfmVar, null));
    }
}
