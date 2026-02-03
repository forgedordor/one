package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edik implements eora {
    final /* synthetic */ edim a;

    public edik(edim edimVar) {
        this.a = edimVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        final etva etvaVar = (etva) obj;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(ekjz.g(etvaVar.d, new ejvr() { // from class: edih
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                return Uri.parse(((etwa) obj2).c);
            }
        }));
        Iterator<E> it = etvaVar.d.iterator();
        while (it.hasNext()) {
            arrayList.addAll(ekjz.g(((etwa) it.next()).g, new ejvr() { // from class: edii
                @Override // defpackage.ejvr
                public final Object apply(Object obj2) {
                    return Uri.parse(((etxg) obj2).d);
                }
            }));
        }
        this.a.a(arrayList, new ejvr() { // from class: edij
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                ekgp ekgpVar;
                List list;
                List list2 = (List) obj2;
                etva etvaVar2 = etvaVar;
                int i = 0;
                List listSubList = list2.subList(0, etvaVar2.d.size());
                evtg<etwa> evtgVar = etvaVar2.d;
                List listSubList2 = list2.subList(evtgVar.size(), list2.size());
                ekgi ekgiVar = new ekgi();
                int size = 0;
                for (etwa etwaVar : evtgVar) {
                    if (etwaVar.g.isEmpty()) {
                        String str = etwaVar.b;
                        int i2 = ekgb.d;
                        ekgiVar.i(str, ekoe.a);
                    } else {
                        ekgiVar.i(etwaVar.b, ekgb.n(listSubList2.subList(size, etwaVar.g.size() + size)));
                        size += etwaVar.g.size();
                    }
                }
                ekgp ekgpVarC = ekgiVar.c();
                edkg edkgVar = new edkg();
                etvu etvuVar = etvaVar2.b;
                if (etvuVar == null) {
                    etvuVar = etvu.a;
                }
                edkgVar.f(etvuVar.b);
                etvu etvuVar2 = etvaVar2.b;
                if (etvuVar2 == null) {
                    etvuVar2 = etvu.a;
                }
                edkgVar.b(etvuVar2.c);
                etvu etvuVar3 = etvaVar2.b;
                if (etvuVar3 == null) {
                    etvuVar3 = etvu.a;
                }
                edkgVar.h(etvuVar3.d);
                etvu etvuVar4 = etvaVar2.b;
                if (etvuVar4 == null) {
                    etvuVar4 = etvu.a;
                }
                edkgVar.e(etvuVar4.e);
                evtg evtgVar2 = etvaVar2.d;
                ekgi ekgiVar2 = new ekgi();
                int i3 = 0;
                while (i3 < evtgVar2.size()) {
                    etwa etwaVar2 = (etwa) evtgVar2.get(i3);
                    String str2 = etwaVar2.b;
                    Bitmap bitmap = (Bitmap) listSubList.get(i3);
                    ekgb ekgbVar = (ekgb) ekgpVarC.get(etwaVar2.b);
                    int i4 = ekgb.d;
                    ekfw ekfwVar = new ekfw();
                    if (etwaVar2.g.isEmpty()) {
                        ekgpVar = ekgpVarC;
                        list = listSubList;
                    } else {
                        edkp edkpVar = new edkp();
                        edkpVar.f(etwaVar2.g.size());
                        etvy etvyVar = etwaVar2.f;
                        if (etvyVar == null) {
                            etvyVar = etvy.a;
                        }
                        edkpVar.c(etvyVar.b);
                        etvy etvyVar2 = etwaVar2.f;
                        if (etvyVar2 == null) {
                            etvyVar2 = etvy.a;
                        }
                        edkpVar.e(etvyVar2.c);
                        etvy etvyVar3 = etwaVar2.f;
                        if (etvyVar3 == null) {
                            etvyVar3 = etvy.a;
                        }
                        edkpVar.d(etvyVar3.d);
                        edkpVar.g(etwaVar2.c);
                        edkpVar.b(bitmap);
                        ekfwVar.h(edkpVar.a());
                        evtg evtgVar3 = etwaVar2.g;
                        ekfw ekfwVar2 = new ekfw();
                        ekgpVar = ekgpVarC;
                        while (i < evtgVar3.size()) {
                            etxg etxgVar = (etxg) evtgVar3.get(i);
                            Bitmap bitmap2 = (Bitmap) ekgbVar.get(i);
                            List list3 = listSubList;
                            edkp edkpVar2 = new edkp();
                            int i5 = i;
                            edkpVar2.f(etxgVar.b);
                            etvy etvyVar4 = etxgVar.c;
                            if (etvyVar4 == null) {
                                etvyVar4 = etvy.a;
                            }
                            edkpVar2.c(etvyVar4.b);
                            etvy etvyVar5 = etxgVar.c;
                            if (etvyVar5 == null) {
                                etvyVar5 = etvy.a;
                            }
                            edkpVar2.e(etvyVar5.c);
                            etvy etvyVar6 = etxgVar.c;
                            if (etvyVar6 == null) {
                                etvyVar6 = etvy.a;
                            }
                            edkpVar2.d(etvyVar6.d);
                            edkpVar2.g(etxgVar.d);
                            edkpVar2.b(bitmap2);
                            ekfwVar2.h(edkpVar2.a());
                            i = i5 + 1;
                            listSubList = list3;
                        }
                        list = listSubList;
                        ekfwVar.j(ekfwVar2.g());
                    }
                    edke edkeVar = new edke();
                    edkeVar.g(etwaVar2.b);
                    edkeVar.j(etwaVar2.c);
                    edkeVar.c(etwaVar2.d);
                    edkeVar.d(etwaVar2.e);
                    etvy etvyVar7 = etwaVar2.f;
                    if (etvyVar7 == null) {
                        etvyVar7 = etvy.a;
                    }
                    edkeVar.e(etvyVar7.b);
                    etvy etvyVar8 = etwaVar2.f;
                    if (etvyVar8 == null) {
                        etvyVar8 = etvy.a;
                    }
                    edkeVar.h(etvyVar8.c);
                    etvy etvyVar9 = etwaVar2.f;
                    if (etvyVar9 == null) {
                        etvyVar9 = etvy.a;
                    }
                    edkeVar.f(etvyVar9.d);
                    edkeVar.b(bitmap);
                    edkeVar.i(ekfwVar.g());
                    ekgiVar2.i(str2, edkeVar.a());
                    i3++;
                    ekgpVarC = ekgpVar;
                    listSubList = list;
                    i = 0;
                }
                edkgVar.a = ekgiVar2.c();
                int i6 = ekgb.d;
                ekfw ekfwVar3 = new ekfw();
                etvu etvuVar5 = etvaVar2.b;
                if (etvuVar5 == null) {
                    etvuVar5 = etvu.a;
                }
                String str3 = etvuVar5.d;
                ekgb ekgbVar2 = ekoe.a;
                ekfwVar3.h(edja.a(str3, ekgbVar2));
                ekfwVar3.j(ekjz.g(etvaVar2.c, new ejvr() { // from class: edif
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj3) {
                        etxa etxaVar = (etxa) obj3;
                        return edja.a(etxaVar.b, ekjz.g(etxaVar.c, new ejvr() { // from class: edie
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj4) {
                                etvs etvsVar = (etvs) obj4;
                                return new edkr(etvsVar.b, etvsVar.c);
                            }
                        }));
                    }
                }));
                edkgVar.g(ekfwVar3.g());
                edkgVar.d(ekgb.n(etvaVar2.e));
                edkgVar.c(ekgbVar2);
                return edkgVar.a();
            }
        });
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        edim edimVar = this.a;
        edimVar.g.j(ediz.b(edimVar.d.a(th)));
    }
}
