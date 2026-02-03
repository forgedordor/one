package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bqg implements bpr {
    final /* synthetic */ akv a;

    public bqg(akv akvVar) {
        this.a = akvVar;
    }

    @Override // defpackage.bpr
    public final ListenableFuture a(Object obj) {
        return bqk.b(this.a.a(obj));
    }
}
