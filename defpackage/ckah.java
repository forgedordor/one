package defpackage;

import j$.util.DesugarCollections;
import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckah extends fcyz implements fdat {
    int a;
    final /* synthetic */ ckbk b;
    final /* synthetic */ dggn c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckah(fcxy fcxyVar, ckbk ckbkVar, dggn dggnVar) {
        super(2, fcxyVar);
        this.b = ckbkVar;
        this.c = dggnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckah) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ckbk ckbkVar = this.b;
            this.a = 1;
            obj = ckbkVar.u(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ckbv ckbvVar = ((ckce) obj).d;
        if (ckbvVar == null) {
            ckbvVar = ckbv.a;
        }
        return Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(ckbvVar.c), this.b.B(this.c), new Integer(0));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ckah ckahVar = new ckah(fcxyVar, this.b, this.c);
        ckahVar.d = obj;
        return ckahVar;
    }
}
