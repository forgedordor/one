package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ytd {
    public final cqmb a;
    public final cwmr b;
    public final apql c;
    public final aqkj d;
    private final cult e;

    public ytd(cqmb cqmbVar, cwmr cwmrVar, cult cultVar, apql apqlVar, aqkj aqkjVar) {
        cqmbVar.getClass();
        cwmrVar.getClass();
        cultVar.getClass();
        apqlVar.getClass();
        this.a = cqmbVar;
        this.b = cwmrVar;
        this.e = cultVar;
        this.c = apqlVar;
        this.d = aqkjVar;
    }

    public final auyl a(final ysx ysxVar) {
        auyl[] auylVarArr = {new auxq(new fdae() { // from class: ysy
            @Override // defpackage.fdae
            public final Object invoke() {
                ysx ysxVar2 = ysxVar;
                amwf amwfVar = ysxVar2.a;
                String strC = amwfVar.c();
                strC.getClass();
                ytd ytdVar = this.a;
                List<String> listC = ytdVar.a.c(strC);
                listC.getClass();
                List listA = null;
                if (!listC.isEmpty() && listC.size() <= ((Number) cwkl.b.e()).intValue()) {
                    fcww fcwwVar = new fcww((byte[]) null);
                    for (String str : listC) {
                        fcwwVar.add(new djok(str, ytdVar.b.b(str)));
                    }
                    listA = fcva.a(fcwwVar);
                }
                List list = listA;
                fdae fdaeVar = ysxVar2.d;
                String strC2 = amwfVar.c();
                strC2.getClass();
                boolean z = ysxVar2.e;
                boolean z2 = ysxVar2.b;
                String str2 = ysxVar2.c;
                boolean z3 = ysxVar2.f;
                boolean z4 = ysxVar2.g;
                dkzl dkzlVar = ysxVar2.h;
                dkpc dkpcVar = ysxVar2.i;
                apql apqlVar = ytdVar.c;
                aqkj aqkjVar = ytdVar.d;
                boolean zA = apqlVar.a();
                boolean z5 = false;
                if (aqkjVar.a() && apqlVar.a()) {
                    z5 = true;
                }
                return new djpa(list, fdaeVar, null, strC2, z, z2, new fdae() { // from class: djoy
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return false;
                    }
                }, new fdae() { // from class: djoz
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return fctx.a;
                    }
                }, str2, true, z3, true, z4, false, dkzlVar, dkpcVar, z4, new dlhx(zA, z5, 46));
            }
        }), auyp.a(this.e.a)};
        for (int i = 0; i < 2; i++) {
            auyl auylVar = auylVarArr[i];
            if (auylVar != null && !(auylVar instanceof auxq)) {
                auyl[] auylVarArr2 = (auyl[]) fcur.K(auylVarArr).toArray(new auyl[0]);
                ytc ytcVar = new ytc((fdpl[]) Arrays.copyOf(auylVarArr2, auylVarArr2.length), auylVarArr);
                ArrayList arrayList = new ArrayList(2);
                int i2 = 0;
                while (true) {
                    Object objB = null;
                    if (i2 >= 2) {
                        break;
                    }
                    auyl auylVar2 = auylVarArr[i2];
                    if (auylVar2 != null) {
                        objB = auylVar2.b();
                    }
                    arrayList.add(objB);
                    i2++;
                }
                Object[] array = arrayList.toArray(new Object[0]);
                djpa djpaVarL = (djpa) array[0];
                if (!((Boolean) array[1]).booleanValue()) {
                    djpaVarL = djpa.l(djpaVarL, null, false, false, 524286);
                }
                return auyp.b(ytcVar, djpaVarL);
            }
        }
        return new auxq(new ysz(auylVarArr));
    }
}
