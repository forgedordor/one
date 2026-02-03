package defpackage;

import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aoee extends fcyz implements fdat {
    int a;
    final /* synthetic */ aoeg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoee(aoeg aoegVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aoegVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aoee) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarB = this.b.f.b();
            this.a = 1;
            obj = fdxs.c(eijuVarB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ekgb ekgbVar = (ekgb) obj;
        ekgbVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : ekgbVar) {
            if (((aoer) obj2).x()) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.size() <= 1) {
            return Optional.ofNullable(fcva.P(arrayList));
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aoee(this.b, fcxyVar);
    }
}
