package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekhs {
    public final List a = new ArrayList();

    public final ekhu a() {
        List list = this.a;
        ekfw ekfwVar = new ekfw(list.size());
        eknz eknzVar = eknz.a;
        Collections.sort(list, ekny.a);
        Iterator it = list.iterator();
        ekja ekjaVar = it instanceof ekja ? (ekja) it : new ekja(it);
        while (ekjaVar.hasNext()) {
            eknz eknzVar2 = (eknz) ekjaVar.next();
            while (ekjaVar.hasNext()) {
                if (!ekjaVar.b) {
                    ekjaVar.c = ekjaVar.a.next();
                    ekjaVar.b = true;
                }
                eknz eknzVar3 = (eknz) ekjaVar.c;
                if (eknzVar2.j(eknzVar3)) {
                    ejwl.i(eknzVar2.e(eknzVar3).k(), "Overlapping ranges not permitted but found %s overlapping %s", eknzVar2, eknzVar3);
                    eknz eknzVar4 = (eknz) ekjaVar.next();
                    ekdx ekdxVar = eknzVar2.b;
                    ekdx ekdxVar2 = eknzVar4.b;
                    int iCompareTo = ekdxVar.compareTo(ekdxVar2);
                    ekdx ekdxVar3 = eknzVar2.c;
                    ekdx ekdxVar4 = eknzVar4.c;
                    int iCompareTo2 = ekdxVar3.compareTo(ekdxVar4);
                    if (iCompareTo > 0 || iCompareTo2 < 0) {
                        if (iCompareTo < 0 || iCompareTo2 > 0) {
                            if (iCompareTo > 0) {
                                ekdxVar = ekdxVar2;
                            }
                            if (iCompareTo2 < 0) {
                                ekdxVar3 = ekdxVar4;
                            }
                            eknzVar2 = new eknz(ekdxVar, ekdxVar3);
                        } else {
                            eknzVar2 = eknzVar4;
                        }
                    }
                }
            }
            ekfwVar.h(eknzVar2);
        }
        ekgb ekgbVarG = ekfwVar.g();
        return !ekgbVarG.isEmpty() ? (((ekoe) ekgbVarG).c == 1 && ((eknz) ekis.l(ekgbVarG)).equals(eknz.a)) ? ekhu.b : new ekhu(ekgbVarG) : ekhu.a;
    }

    public final void b(eknz eknzVar) {
        ejwl.f(!eknzVar.k(), "range must not be empty, but was %s", eknzVar);
        this.a.add(eknzVar);
    }

    public final void c(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            b((eknz) it.next());
        }
    }
}
