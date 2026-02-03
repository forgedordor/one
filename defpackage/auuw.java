package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class auuw extends fcyz implements fdat {
    final /* synthetic */ auux a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auuw(auux auuxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = auuxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((auuw) c((fdos) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        fdos fdosVar = (fdos) this.b;
        Iterator it = this.a.a.iterator();
        while (it.hasNext()) {
            auvw.k(fdosVar, null, null, new auuv(fdosVar, (fdap) it.next(), null), 3);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        auuw auuwVar = new auuw(this.a, fcxyVar);
        auuwVar.b = obj;
        return auuwVar;
    }
}
