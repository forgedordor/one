package defpackage;

import android.graphics.Bitmap;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyvx implements rfg {
    final /* synthetic */ dyvy a;
    private final dyvv b;
    private ListenableFuture c;
    private final int d;

    public dyvx(dyvy dyvyVar, dyvv dyvvVar, int i) {
        this.a = dyvyVar;
        this.b = dyvvVar;
        this.d = i;
    }

    @Override // defpackage.rfg
    public final Class a() {
        return Bitmap.class;
    }

    @Override // defpackage.rfg
    public final void d() {
        ListenableFuture listenableFuture = this.c;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
            this.c = null;
        }
    }

    @Override // defpackage.rfg
    public final reb eX() {
        return reb.LOCAL;
    }

    @Override // defpackage.rfg
    public final void g(rbh rbhVar, rff rffVar) {
        ListenableFuture listenableFutureG = this.a.a.g(((dyvb) this.b.b()).a, this.d);
        this.c = listenableFutureG;
        eika.l(listenableFutureG, new dyvw(rffVar), eoqg.a);
    }

    @Override // defpackage.rfg
    public final void e() {
    }
}
