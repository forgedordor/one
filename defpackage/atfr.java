package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atfr extends fcyz implements fdat {
    final /* synthetic */ atfx a;
    final /* synthetic */ Uri b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atfr(atfx atfxVar, Uri uri, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = atfxVar;
        this.b = uri;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((atfr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return Boolean.valueOf(this.a.k.a(this.b) > ((Number) bxmw.d.e()).longValue());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new atfr(this.a, this.b, fcxyVar);
    }
}
