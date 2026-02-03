package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doci extends fcyz implements fdat {
    int a;
    final /* synthetic */ docj b;
    final /* synthetic */ docn c;
    final /* synthetic */ List d;
    final /* synthetic */ CharSequence e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doci(docj docjVar, docn docnVar, List list, CharSequence charSequence, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = docjVar;
        this.c = docnVar;
        this.d = list;
        this.e = charSequence;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((doci) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        sp spVar = null;
        fctl.b(obj);
        if (i == 0) {
            docj docjVar = this.b;
            docn docnVar = this.c;
            List list = this.d;
            List list2 = docnVar.f;
            this.a = 1;
            obj = fdin.a(docjVar.aY().hE(), new dobw(list2, list, null), this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        docn docnVar2 = this.c;
        docnVar2.f = this.d;
        dndw.b((List) obj, docnVar2.f.size(), docnVar2);
        docnVar2.g = this.e.toString();
        docj docjVar2 = this.b;
        wb wbVar = docjVar2.an;
        if (wbVar == null) {
            fdbq.c("searchLayoutManager");
            wbVar = null;
        }
        sp spVar2 = docjVar2.ak;
        if (spVar2 == null) {
            fdbq.c("searchAdapter");
        } else {
            spVar = spVar2;
        }
        docjVar2.bi(wbVar, spVar);
        docjVar2.bL();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new doci(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
