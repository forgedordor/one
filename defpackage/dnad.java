package defpackage;

import android.net.Uri;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnad extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnau b;
    final /* synthetic */ dojv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnad(dnau dnauVar, dojv dojvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnauVar;
        this.c = dojvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnad) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        dnad dnadVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            dnadVar = this;
        } else {
            dnau dnauVar = this.b;
            dojv dojvVar = this.c;
            dolm dolmVarR = dnauVar.r();
            dogj dogjVarL = dojvVar.l();
            Uri uri = Uri.parse(dojvVar.f());
            uri.getClass();
            Long l = new Long(dojvVar.a());
            Instant instantC = dojvVar.c();
            dltc dltcVarFo = dojvVar.fo();
            this.a = 1;
            dnadVar = this;
            obj = dolm.e(dolmVarR, dogjVarL, uri, l, instantC, dltcVarFo, dnadVar);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        dnadVar.b.bc((dojw) obj);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnad(this.b, this.c, fcxyVar);
    }
}
