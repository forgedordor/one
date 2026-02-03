package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chlm extends fcyz implements fdat {
    int a;
    final /* synthetic */ chlu b;
    final /* synthetic */ List c;
    final /* synthetic */ Map d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chlm(fcxy fcxyVar, chlu chluVar, List list, Map map) {
        super(2, fcxyVar);
        this.b = chluVar;
        this.c = list;
        this.d = map;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chlm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            chlu chluVar = this.b;
            List<ResolvedRecipient> list = this.c;
            ArrayList arrayList = new ArrayList(fcva.p(list, 10));
            for (ResolvedRecipient resolvedRecipient : list) {
                chpn chpnVar = (chpn) chpo.a.createBuilder();
                chpnVar.getClass();
                String str = ((choy) resolvedRecipient.k()).b;
                if (str == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                chpp.c(str, chpnVar);
                String strH = ((choy) resolvedRecipient.k()).h();
                if (strH == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                chpnVar.copyOnWrite();
                chpo chpoVar = (chpo) chpnVar.instance;
                chpoVar.b |= 16;
                chpoVar.f = strH;
                Object objB = chluVar.d.b();
                objB.getClass();
                chpp.b(((Number) objB).longValue(), chpnVar);
                arrayList.add(chpp.a(chpnVar));
            }
            chng chngVar = chluVar.b;
            this.a = 1;
            obj = chngVar.a(arrayList, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            Map map = this.d;
            chpo chpoVar2 = ((chpk) obj2).f;
            if (chpoVar2 == null) {
                chpoVar2 = chpo.a;
            }
            if (map.get(chpoVar2.c) != null) {
                arrayList2.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(arrayList2, 10)), 16));
        for (Object obj3 : arrayList2) {
            Map map2 = this.d;
            chpo chpoVar3 = ((chpk) obj3).f;
            if (chpoVar3 == null) {
                chpoVar3 = chpo.a;
            }
            Object obj4 = map2.get(chpoVar3.c);
            obj4.getClass();
            linkedHashMap.put((anue) obj4, obj3);
        }
        return linkedHashMap;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        chlm chlmVar = new chlm(fcxyVar, this.b, this.c, this.d);
        chlmVar.e = obj;
        return chlmVar;
    }
}
