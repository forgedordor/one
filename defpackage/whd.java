package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class whd extends fcyz implements fdat {
    final /* synthetic */ whe a;
    final /* synthetic */ Uri b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public whd(fcxy fcxyVar, whe wheVar, Uri uri) {
        super(2, fcxyVar);
        this.a = wheVar;
        this.b = uri;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((whd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        whe wheVar = this.a;
        return Boolean.valueOf(wheVar.d.g(wheVar.b, this.b));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        whd whdVar = new whd(fcxyVar, this.a, this.b);
        whdVar.c = obj;
        return whdVar;
    }
}
