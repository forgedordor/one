package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwpv extends fcyz implements fdat {
    final /* synthetic */ bwqa a;
    final /* synthetic */ List b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwpv(fcxy fcxyVar, bwqa bwqaVar, List list) {
        super(2, fcxyVar);
        this.a = bwqaVar;
        this.b = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bwpv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        eieu eieuVarH = eiiy.h("E2eeInfoDataLoader#getFreshRemoteInstances");
        try {
            ekgb ekgbVarD = ((celq) this.a.a.b()).d(ekfv.a(this.b));
            fczl.a(eieuVarH, null);
            return ekgbVarD;
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bwpv bwpvVar = new bwpv(fcxyVar, this.a, this.b);
        bwpvVar.c = obj;
        return bwpvVar;
    }
}
