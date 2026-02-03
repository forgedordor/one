package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyvw implements eora {
    final /* synthetic */ rff a;

    public dyvw(rff rffVar) {
        this.a = rffVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.c((Bitmap) obj);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        this.a.f(th instanceof Exception ? (Exception) th : new Exception(th));
    }
}
