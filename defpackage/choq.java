package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class choq extends fcyz implements fdat {
    final /* synthetic */ chos a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public choq(fcxy fcxyVar, chos chosVar) {
        super(2, fcxyVar);
        this.a = chosVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((choq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        chos chosVar = this.a;
        Uri uri = chosVar.h.a;
        if (uri == null) {
            return null;
        }
        cqsx cqsxVar = chosVar.d;
        int i = (int) chosVar.f;
        return cqsxVar.b(uri, i, i, chosVar.e);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        choq choqVar = new choq(fcxyVar, this.a);
        choqVar.b = obj;
        return choqVar;
    }
}
