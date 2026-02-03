package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chqc extends fcyz implements fdat {
    int a;
    final /* synthetic */ chqg b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chqc(fcxy fcxyVar, chqg chqgVar) {
        super(2, fcxyVar);
        this.b = chqgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chqc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            chqg chqgVar = this.b;
            this.a = 1;
            obj = chqgVar.c.invoke(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        Iterator it = ((Iterable) obj).iterator();
        int iB = 0;
        while (it.hasNext()) {
            iB += chqa.b(chqa.a((bojh) it.next()));
        }
        return new Integer(iB);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        chqc chqcVar = new chqc(fcxyVar, this.b);
        chqcVar.c = obj;
        return chqcVar;
    }
}
