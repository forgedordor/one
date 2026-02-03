package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awks extends fcyz implements fdat {
    final /* synthetic */ Set a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awks(fcxy fcxyVar, Set set) {
        super(2, fcxyVar);
        this.a = set;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awks) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        String[] strArr = awko.a;
        awkl awklVar = new awkl(awko.a);
        awklVar.A("DestinationsTableOperations#getDestinations");
        Set set = this.a;
        awklVar.c(new awkt(set));
        ekgb<awjq> ekgbVarZ = awklVar.b().z();
        ekgbVarZ.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVarZ, 10));
        for (awjq awjqVar : ekgbVarZ) {
            awjqVar.getClass();
            arrayList.add(awkr.a(awjqVar));
        }
        if (arrayList.size() == set.size()) {
            return arrayList;
        }
        throw new IllegalStateException("Did not find a Destination for every token queried. Number of unique tokens queried: " + set.size() + ". Result size: " + arrayList.size() + ".");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        awks awksVar = new awks(fcxyVar, this.a);
        awksVar.b = obj;
        return awksVar;
    }
}
