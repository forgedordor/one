package defpackage;

import android.support.v7.widget.GridLayoutManager;
import com.google.android.libraries.compose.ui.views.recycler.reactive.ReactiveGridLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnyi extends fcyz implements fdat {
    /* synthetic */ Object a;
    final /* synthetic */ dnyn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnyi(dnyn dnynVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnynVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnyi) c((Map) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object next;
        fctl.b(obj);
        Map map = (Map) this.a;
        dnyn dnynVar = this.b;
        dnyw dnywVar = dnynVar.an;
        ReactiveGridLayoutManager reactiveGridLayoutManager = null;
        if (dnywVar == null) {
            fdbq.c("recentStickersAdapter");
            dnywVar = null;
        }
        List list = dnywVar.f;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            dnwt dnwtVar = (dnwt) entry.getKey();
            dnvg dnvgVar = (dnvg) entry.getValue();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (fdbq.f((dnwt) next, dnwtVar)) {
                    break;
                }
            }
            dnwt dnwtVar2 = (dnwt) next;
            if (dnwtVar2 == null) {
                dnwtVar.b = dngp.a(new dnws(new dohu(new dnxx(dnvgVar, null))));
            } else {
                dnwtVar = dnwtVar2;
            }
            arrayList.add(dnwtVar);
        }
        List listA = dndw.a(list, arrayList, dnynVar.bJ() ? 1 : 0, null, null, 56);
        dnywVar.f = arrayList;
        ReactiveGridLayoutManager reactiveGridLayoutManager2 = dnynVar.ao;
        if (reactiveGridLayoutManager2 == null) {
            fdbq.c("stickerListLayoutManager");
        } else {
            reactiveGridLayoutManager = reactiveGridLayoutManager2;
        }
        dndw.b(listA, ((GridLayoutManager) reactiveGridLayoutManager).b * 6, dnywVar);
        dnynVar.bL();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dnyi dnyiVar = new dnyi(this.b, fcxyVar);
        dnyiVar.a = obj;
        return dnyiVar;
    }
}
