package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfwr extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;

    public cfwr(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cfwr cfwrVar = new cfwr((fcxy) obj3);
        cfwrVar.a = (Set) obj;
        cfwrVar.b = (cfwj) obj2;
        return cfwrVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ?? r3 = this.a;
        Object obj2 = this.b;
        if (obj2 instanceof cfwg) {
            return fcwm.h(r3, ((cfwj) obj2).a);
        }
        if (obj2 instanceof cfwh) {
            return fcwm.f(r3, ((cfwj) obj2).a);
        }
        if (obj2 instanceof cfwi) {
            return fcvq.a;
        }
        throw new fctg();
    }
}
