package defpackage;

import android.graphics.Bitmap;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwgu implements eora {
    final /* synthetic */ dwje a;
    final /* synthetic */ dwqw b;
    final /* synthetic */ dwgv c;

    public dwgu(dwgv dwgvVar, dwje dwjeVar, dwqw dwqwVar) {
        this.a = dwjeVar;
        this.b = dwqwVar;
        this.c = dwgvVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        dwgx dwgxVar = (dwgx) obj;
        dwhf dwhfVarA = dwgxVar.a();
        dwgv dwgvVar = this.c;
        dwje dwjeVar = this.a;
        dwqw dwqwVar = this.b;
        dwgvVar.b(dwjeVar, dwhfVarA, dwqwVar);
        final dwhf dwhfVarA2 = dwgxVar.a();
        ListenableFuture listenableFutureSubmit = dwgvVar.b.submit(new dvjl(dwgvVar.a, ((dwhd) dwhfVarA2).d));
        ejvr ejvrVar = new ejvr() { // from class: dwgr
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                Bitmap bitmap = (Bitmap) obj2;
                dwhc dwhcVar = new dwhc(dwhfVarA2);
                if (bitmap != null) {
                    dwhcVar.f(bitmap);
                }
                return dwhcVar.a();
            }
        };
        eoqg eoqgVar = eoqg.a;
        eork.r(eooq.f(listenableFutureSubmit, ejvrVar, eoqgVar), new dwgt(this, dwjeVar, dwqwVar), eoqgVar);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
    }
}
