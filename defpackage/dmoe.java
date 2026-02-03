package defpackage;

import j$.time.Duration;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmoe extends fcyz implements fdaw {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    final /* synthetic */ dmoo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmoe(dmoo dmooVar, fcxy fcxyVar) {
        super(5, fcxyVar);
        this.e = dmooVar;
    }

    @Override // defpackage.fdaw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        dmoe dmoeVar = new dmoe(this.e, (fcxy) obj5);
        dmoeVar.a = (dmoz) obj;
        dmoeVar.b = (Duration) obj2;
        dmoeVar.c = (dmrw) obj3;
        dmoeVar.d = (dmso) obj4;
        return dmoeVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        List listA;
        fctl.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        dmrw dmrwVar = (dmrw) this.c;
        List<dmrk> list = dmrwVar.a;
        boolean z = dmrwVar.b;
        Object obj4 = this.d;
        if (list.isEmpty()) {
            listA = fcvo.a;
        } else {
            fcww fcwwVar = new fcww((byte[]) null);
            ArrayList arrayList = new ArrayList(fcva.p(list, 10));
            for (final dmrk dmrkVar : list) {
                final dmoo dmooVar = this.e;
                arrayList.add(new dmsb(dmrkVar.b, dmrkVar.c, dmrkVar.d, z, dmrkVar.e, new fdap() { // from class: dmnm
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj5) {
                        lvj lvjVar = (lvj) obj5;
                        lvjVar.getClass();
                        dmrk dmrkVar2 = dmrkVar;
                        dmoo dmooVar2 = dmooVar;
                        fdil.d(dmooVar2.d, null, null, new dmon(dmooVar2, lvjVar, dmrkVar2, null), 3);
                        return fctx.a;
                    }
                }));
            }
            fcwwVar.addAll(arrayList);
            listA = fcva.a(fcwwVar);
        }
        List list2 = listA;
        obj3.getClass();
        return dmoz.a((dmoz) obj2, 0, null, 0, (Duration) obj3, false, null, list2, (dmso) obj4, 2060279);
    }
}
