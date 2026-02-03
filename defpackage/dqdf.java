package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqdf extends fcyz implements fdat {
    int a;
    final /* synthetic */ dqdh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqdf(dqdh dqdhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dqdhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqdf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        dqdh dqdhVar;
        Uri uri;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0 && (uri = (dqdhVar = this.b).c) != null) {
            domv domvVarA = dqdhVar.a();
            this.a = 1;
            if (domvVarA.b(uri) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dqdf(this.b, fcxyVar);
    }
}
