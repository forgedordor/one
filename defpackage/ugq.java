package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ugq extends fcyz implements fdat {
    int a;
    final /* synthetic */ bcuw b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ugq(fcxy fcxyVar, bcuw bcuwVar) {
        super(2, fcxyVar);
        this.b = bcuwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ugq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarX = this.b.x();
            eijuVarX.getClass();
            this.a = 1;
            obj = fdxs.c(eijuVarX, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        obj.getClass();
        return Optional.ofNullable(fcva.Q((List) obj, 0));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ugq ugqVar = new ugq(fcxyVar, this.b);
        ugqVar.c = obj;
        return ugqVar;
    }
}
