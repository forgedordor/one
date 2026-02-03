package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dndi extends fcyz implements fdat {
    final /* synthetic */ dndk a;
    final /* synthetic */ Uri b;
    final /* synthetic */ ebsu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dndi(dndk dndkVar, Uri uri, ebsu ebsuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dndkVar;
        this.b = uri;
        this.c = ebsuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dndi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return ebsv.c(this.a.g, this.b, this.c);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dndi(this.a, this.b, this.c, fcxyVar);
    }
}
