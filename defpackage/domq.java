package defpackage;

import android.content.pm.ProviderInfo;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class domq extends fcyz implements fdat {
    final /* synthetic */ Uri a;
    final /* synthetic */ domr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public domq(Uri uri, domr domrVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = uri;
        this.b = domrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((domq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        String authority = this.a.getAuthority();
        ProviderInfo providerInfoResolveContentProvider = authority != null ? this.b.a.getPackageManager().resolveContentProvider(authority, 0) : null;
        return Boolean.valueOf(fdbq.f(providerInfoResolveContentProvider != null ? providerInfoResolveContentProvider.packageName : null, this.b.a.getPackageName()));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new domq(this.a, this.b, fcxyVar);
    }
}
