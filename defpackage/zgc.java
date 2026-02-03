package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class zgc extends fdbo implements fdap {
    public zgc(Object obj) {
        super(1, obj, zgh.class, "navigateToImage", "navigateToImage(Landroid/net/Uri;)V", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Uri uri = (Uri) obj;
        uri.getClass();
        zgh zghVar = (zgh) this.g;
        auvw.k(zghVar.e, null, null, new zgb(zghVar, uri, null), 3);
        return fctx.a;
    }
}
