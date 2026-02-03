package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akhk extends fcyz implements fdat {
    int a;
    final /* synthetic */ akho b;
    final /* synthetic */ ajts c;
    final /* synthetic */ auib d;
    final /* synthetic */ Uri e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akhk(akho akhoVar, ajts ajtsVar, auib auibVar, Uri uri, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = akhoVar;
        this.c = ajtsVar;
        this.d = auibVar;
        this.e = uri;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akhk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        akho akhoVar = this.b;
        ajts ajtsVar = this.c;
        auib auibVar = this.d;
        Uri uri = this.e;
        this.a = 1;
        Object objC = akhoVar.c(ajtsVar, auibVar, uri, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akhk(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
