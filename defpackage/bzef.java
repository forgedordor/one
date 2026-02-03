package defpackage;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzef extends fcyz implements fdat {
    int a;
    final /* synthetic */ Collection b;
    final /* synthetic */ bzem c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzef(fcxy fcxyVar, Collection collection, bzem bzemVar) {
        super(2, fcxyVar);
        this.b = collection;
        this.c = bzemVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzef) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            Collection collection = this.b;
            LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(collection, 10)), 16));
            for (Object obj2 : collection) {
                linkedHashMap.put(obj2, new fctk(true));
            }
            bzem bzemVar = this.c;
            bzeg bzegVar = new bzeg(bzemVar);
            bzeh bzehVar = new bzeh(bzemVar, null);
            this.a = 1;
            obj = bzfl.a(linkedHashMap, bzegVar, bzehVar, this);
            if (obj != fcylVar) {
            }
        }
        if (i != 1) {
            return obj;
        }
        bzem bzemVar2 = this.c;
        bzei bzeiVar = new bzei(bzemVar2);
        bzej bzejVar = new bzej(bzemVar2, null);
        this.a = 2;
        Object objA = bzfl.a((Map) obj, bzeiVar, bzejVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bzef bzefVar = new bzef(fcxyVar, this.b, this.c);
        bzefVar.d = obj;
        return bzefVar;
    }
}
