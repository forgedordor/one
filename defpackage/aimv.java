package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aimv extends ejyn {
    final /* synthetic */ aimw a;

    public aimv(aimw aimwVar) {
        this.a = aimwVar;
    }

    @Override // defpackage.ejyn
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        aimw aimwVar = this.a;
        crof crofVarH = aimwVar.a.h(iIntValue);
        int[] iArrD = crofVarH.D();
        String strU = crofVarH.u();
        String strQ = crofVarH.q();
        elpw elpwVar = (elpw) elpy.a.createBuilder();
        int i = iArrD[0];
        elpwVar.copyOnWrite();
        elpy elpyVar = (elpy) elpwVar.instance;
        elpyVar.b |= 1;
        elpyVar.c = i;
        int i2 = iArrD[1];
        elpwVar.copyOnWrite();
        elpy elpyVar2 = (elpy) elpwVar.instance;
        elpyVar2.b |= 2;
        elpyVar2.d = i2;
        if (strU == null) {
            strU = "UNKNOWN";
        }
        elpwVar.copyOnWrite();
        elpy elpyVar3 = (elpy) elpwVar.instance;
        elpyVar3.b |= 4;
        elpyVar3.e = strU;
        if (strQ == null) {
            strQ = "UNKNOWN";
        }
        elpwVar.copyOnWrite();
        elpy elpyVar4 = (elpy) elpwVar.instance;
        elpyVar4.b |= 8;
        elpyVar4.f = strQ;
        int i3 = true == (((aqsn) aimwVar.e.b()).a() ? ((Boolean) aimwVar.d.i(iIntValue).map(new Function() { // from class: aimu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return Boolean.valueOf(((cmmh) obj2).o);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue() : aimwVar.b.t()) ? 2 : 1;
        elpwVar.copyOnWrite();
        elpy elpyVar5 = (elpy) elpwVar.instance;
        elpyVar5.g = i3 - 1;
        elpyVar5.b |= 16;
        if (craf.b) {
            int simCarrierId = aimwVar.c.getSimCarrierId();
            elpwVar.copyOnWrite();
            elpy elpyVar6 = (elpy) elpwVar.instance;
            elpyVar6.b |= 32;
            elpyVar6.h = simCarrierId;
        }
        return (elpy) elpwVar.build();
    }
}
