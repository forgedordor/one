package defpackage;

import android.content.pm.ProviderInfo;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dncz extends fcyz implements fdat {
    final /* synthetic */ Uri a;
    final /* synthetic */ dndk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dncz(Uri uri, dndk dndkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = uri;
        this.b = dndkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dncz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        ProviderInfo providerInfoResolveContentProvider;
        fctl.b(obj);
        String authority = this.a.getAuthority();
        if (authority == null || (providerInfoResolveContentProvider = this.b.g.getPackageManager().resolveContentProvider(authority, 0)) == null) {
            return null;
        }
        return providerInfoResolveContentProvider.packageName;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dncz(this.a, this.b, fcxyVar);
    }
}
