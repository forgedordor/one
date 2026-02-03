package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahvn extends fcyz implements fdat {
    final /* synthetic */ UUID a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahvn(fcxy fcxyVar, UUID uuid) {
        super(2, fcxyVar);
        this.a = uuid;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahvn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        String[] strArr = btsn.a;
        btsi btsiVar = new btsi(btsn.a);
        btsiVar.A("getDatabaseMetadata");
        btsiVar.c(ahvo.a);
        btqt btqtVarA = btqy.a();
        btqtVarA.c(new ahvp(this.a));
        btrc btrcVar = (btrc) ((btsi) btsiVar.j(dqts.i(btqtVarA.b(), btqy.c.a, btsn.b.b))).b().l();
        if (btrcVar != null) {
            return btrcVar.m();
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ahvn ahvnVar = new ahvn(fcxyVar, this.a);
        ahvnVar.b = obj;
        return ahvnVar;
    }
}
