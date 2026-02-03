package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dopx extends fcyz implements fdat {
    int a;
    final /* synthetic */ dlsu b;
    final /* synthetic */ List c;
    final /* synthetic */ dopy d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dopx(dlsu dlsuVar, List list, dopy dopyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dlsuVar;
        this.c = list;
        this.d = dopyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dopx) c((eaik) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eaik eaikVar = (eaik) this.e;
            dlsu dlsuVar = this.b;
            List<String> list = this.c;
            eahg eahgVar = (eahg) eahh.a.createBuilder();
            eahgVar.getClass();
            eahgVar.copyOnWrite();
            eahh eahhVar = (eahh) eahgVar.instance;
            eahhVar.b |= 1;
            eahhVar.c = dlsuVar.a;
            DesugarCollections.unmodifiableList(eahhVar.d).getClass();
            ArrayList arrayList = new ArrayList(fcva.p(list, 10));
            for (String str : list) {
                eahy eahyVar = (eahy) eahz.a.createBuilder();
                eahyVar.getClass();
                str.getClass();
                eahyVar.copyOnWrite();
                eahz eahzVar = (eahz) eahyVar.instance;
                eahzVar.b |= 1;
                eahzVar.c = str;
                evsn evsnVarBuild = eahyVar.build();
                evsnVarBuild.getClass();
                arrayList.add((eahz) evsnVarBuild);
            }
            eahgVar.copyOnWrite();
            eahh eahhVar2 = (eahh) eahgVar.instance;
            evtg evtgVar = eahhVar2.d;
            if (!evtgVar.c()) {
                eahhVar2.d = evsn.mutableCopy(evtgVar);
            }
            evpz.addAll(arrayList, eahhVar2.d);
            eahgVar.copyOnWrite();
            eahh eahhVar3 = (eahh) eahgVar.instance;
            eahhVar3.e = 1;
            eahhVar3.b |= 2;
            evsn evsnVarBuild2 = eahgVar.build();
            evsnVarBuild2.getClass();
            this.a = 1;
            obj = eaikVar.b((eahh) evsnVarBuild2, new fbrg(), this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        eahp eahpVar = ((eahj) obj).b;
        if (eahpVar == null) {
            eahpVar = eahp.a;
        }
        return eahpVar.c;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dopx dopxVar = new dopx(this.b, this.c, this.d, fcxyVar);
        dopxVar.e = obj;
        return dopxVar;
    }
}
