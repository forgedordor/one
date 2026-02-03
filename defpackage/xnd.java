package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xnd extends fcyz implements fdat {
    final /* synthetic */ ekgb a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xnd(fcxy fcxyVar, ekgb ekgbVar) {
        super(2, fcxyVar);
        this.a = ekgbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xnd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        for (Object obj2 : this.a) {
            if (((aoer) obj2).w()) {
                return obj2;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        xnd xndVar = new xnd(fcxyVar, this.a);
        xndVar.b = obj;
        return xndVar;
    }
}
