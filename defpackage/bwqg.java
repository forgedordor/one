package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwqg extends fcyz implements fdat {
    final /* synthetic */ bwqm a;
    final /* synthetic */ List b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwqg(fcxy fcxyVar, bwqm bwqmVar, List list) {
        super(2, fcxyVar);
        this.a = bwqmVar;
        this.b = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bwqg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        if (!eicg.b(u())) {
            throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
        }
        eieu eieuVarH = eiiy.h("E2eeInfoDataSource#getFreshRemoteInstances");
        try {
            ekgb ekgbVarD = ((celq) this.a.c.b()).d(ekfv.a(this.b));
            fczl.a(eieuVarH, null);
            return ekgbVarD;
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bwqg bwqgVar = new bwqg(fcxyVar, this.a, this.b);
        bwqgVar.c = obj;
        return bwqgVar;
    }
}
