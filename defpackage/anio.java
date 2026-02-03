package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anio implements ancm {
    private final anib a;

    public anio(anib anibVar) {
        anibVar.getClass();
        this.a = anibVar;
    }

    @Override // defpackage.ancm
    public final brdr a(brdr brdrVar) {
        btbo btboVarB = btbt.b();
        btboVarB.A("+loadReadReports");
        btboVarB.d(new Function() { // from class: anin
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btba btbaVar = (btba) obj;
                btbaVar.getClass();
                return new btbb[]{btbaVar.a, btbaVar.b, btbaVar.c, btbaVar.e, btbaVar.f};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVar.H(dqts.i(btboVarB.b(), btbt.c.b, MessagesTable.c.a).g());
        return brdrVar;
    }

    @Override // defpackage.ancm
    public final boolean c() {
        return true;
    }

    @Override // defpackage.ancm
    public final void d(anck anckVar, MessagesTable.BindData bindData, andw andwVar, ekgp ekgpVar, ajts ajtsVar, anbi anbiVar) {
        bindData.getClass();
        andwVar.getClass();
        ekgpVar.getClass();
        ajtsVar.getClass();
        if (bindData.m() == 3) {
            String[] strArr = btbt.a;
            btai[] btaiVarArr = (btai[]) bindData.aH("read_reports", new btai[0]);
            btaiVarArr.getClass();
            List listM = fcur.M(btaiVarArr);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM) {
                if (((btai) obj).m() > 0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(fcva.p(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(andwVar.c(String.valueOf(((btai) it.next()).k())));
            }
            anckVar.d(ekfv.a(fcva.ae(arrayList2)));
            List listM2 = fcur.M(btaiVarArr);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : listM2) {
                if (((btai) obj2).q().isPresent()) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(fcva.p(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(andwVar.c(String.valueOf(((btai) it2.next()).k())));
            }
            anckVar.c(ekfv.a(fcva.ae(arrayList4)));
        }
    }

    @Override // defpackage.ancm
    public final anbf e() {
        return this.a;
    }

    @Override // defpackage.ancm
    public final /* synthetic */ bsje b(bsje bsjeVar) {
        return bsjeVar;
    }
}
