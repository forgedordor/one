package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djma implements fdav {
    final /* synthetic */ List a;

    public djma(List list) {
        this.a = list;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        eih eihVar = (eih) obj;
        int iIntValue = ((Number) obj2).intValue();
        hml hmlVar = (hml) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (true != hmlVar.D(eihVar) ? 2 : 4) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= true != hmlVar.B(iIntValue) ? 16 : 32;
        }
        if (hmlVar.J((i & 147) != 146, i & 1)) {
            djvp djvpVar = (djvp) this.a.get(iIntValue);
            hmlVar.v(-1699582848);
            hmlVar.v(222270869);
            ics icsVarJ = ics.e;
            if (((Boolean) dljt.b(hmlVar).k.invoke()).booleanValue()) {
                hmlVar.v(575395669);
                float f = 8.0f;
                if (!(djvpVar instanceof djyu) && !(djvpVar instanceof dkbu) && !(djvpVar instanceof dkcd) && !(djvpVar instanceof dkeg)) {
                    f = 0.0f;
                }
                hmlVar.o();
                icsVarJ = efy.j(icsVarJ, f, 0.0f, 0.0f, 0.0f, 14);
            }
            hmlVar.o();
            djvo.a(djvpVar, icsVarJ, hmlVar, 0, 0);
            hmlVar.o();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
