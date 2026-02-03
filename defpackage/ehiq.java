package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehiq implements fdap {
    final /* synthetic */ fdav a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ ehis d;
    final /* synthetic */ eryi e;

    public ehiq(fdav fdavVar, String str, int i, ehis ehisVar, eryi eryiVar) {
        this.a = fdavVar;
        this.b = str;
        this.c = i;
        this.d = ehisVar;
        this.e = eryiVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String[] strArr;
        evqs evqsVar;
        byte[] bArrI = (byte[]) obj;
        Integer numValueOf = Integer.valueOf(this.c);
        Set set = this.d.e;
        eryi eryiVar = this.e;
        if (eryiVar != null) {
            evtg evtgVar = eryiVar.i;
            evtgVar.getClass();
            strArr = (String[]) fcva.ab(fcwm.g(set, evtgVar)).toArray(new String[0]);
        } else {
            strArr = (String[]) set.toArray(new String[0]);
        }
        if (bArrI == null) {
            bArrI = null;
            if (eryiVar != null && (evqsVar = eryiVar.j) != null) {
                bArrI = evqsVar.I();
            }
        }
        return this.a.a(this.b, numValueOf, strArr, bArrI);
    }
}
