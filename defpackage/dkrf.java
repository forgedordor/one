package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkrf implements fdat {
    final /* synthetic */ dkri a;
    final /* synthetic */ int b;
    final /* synthetic */ boolean c;

    public dkrf(dkri dkriVar, int i, boolean z) {
        this.a = dkriVar;
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.fdat
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dkri dkriVar = this.a;
            List list = ((dkrj) dkriVar).a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                int i2 = this.b;
                int i3 = i2 - 1;
                if (i > i3) {
                    break;
                }
                if (i != i3 || list.size() <= i2) {
                    hmlVar.v(1190955016);
                    dkrg.b(this.c, hxe.d(-1033169775, new dkre(dkriVar, i), hmlVar), hmlVar, 48);
                    hmlVar.o();
                } else {
                    hmlVar.v(1190690307);
                    dkrg.b(this.c, hxe.d(-1466777080, new dkrd(dkriVar, i), hmlVar), hmlVar, 48);
                    hmlVar.o();
                }
            }
        }
        return fctx.a;
    }
}
