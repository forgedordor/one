package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwec {
    public static ejwi a(eynn eynnVar) {
        int i;
        int i2 = eynnVar.d;
        int iA = eyrb.a(i2);
        if (iA == 0) {
            iA = 1;
        }
        int i3 = iA - 2;
        if (i3 != 1) {
            i = 2;
            if (i3 != 2) {
                if (i3 == 3) {
                    i = 3;
                } else if (i3 != 4) {
                    i = 5;
                    if (i3 != 5) {
                        i = 0;
                    }
                } else {
                    i = 4;
                }
            }
        } else {
            i = 1;
        }
        int iA2 = eyrb.a(i2);
        ejud ejudVar = ejud.a;
        int i4 = (iA2 != 0 ? iA2 : 1) - 2;
        if (i4 != 3 && i4 != 4) {
            return ejudVar;
        }
        eyoc eyocVar = eynnVar.b == 11 ? (eyoc) eynnVar.c : eyoc.a;
        int i5 = ekgb.d;
        ekfw ekfwVar = new ekfw();
        Iterator<E> it = eyocVar.b.iterator();
        while (it.hasNext()) {
            ekfwVar.h(dweg.a((eypt) it.next()));
        }
        ekgb ekgbVarG = ekfwVar.g();
        if (ekgbVarG != null) {
            return ejwi.j(new dwmr(i, (dwoy) ((ejwt) ejwi.j(new dwko(new dwnw(ekgbVarG)))).a));
        }
        throw new NullPointerException("Null contactIds");
    }
}
