package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tax extends fcyz implements fdat {
    final /* synthetic */ tbe a;
    final /* synthetic */ List b;
    final /* synthetic */ fdce c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tax(fcxy fcxyVar, tbe tbeVar, List list, fdce fdceVar) {
        super(2, fcxyVar);
        this.a = tbeVar;
        this.b = list;
        this.c = fdceVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tax) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        szf szfVar = (szf) fcva.T(this.b);
        if (szd.c(szfVar != null ? new Long(szfVar.a) : null)) {
            this.c.a = true;
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        tax taxVar = new tax(fcxyVar, this.a, this.b, this.c);
        taxVar.d = obj;
        return taxVar;
    }
}
