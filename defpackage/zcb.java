package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zcb implements zby {
    public final fcsu a;
    public final apwf b;
    private final fcsu c;
    private final fdjx d;
    private final cult e;

    public zcb(fcsu fcsuVar, fcsu fcsuVar2, fdjx fdjxVar, cult cultVar, apwf apwfVar) {
        fcsuVar.getClass();
        fdjxVar.getClass();
        cultVar.getClass();
        this.c = fcsuVar;
        this.a = fcsuVar2;
        this.d = fdjxVar;
        this.e = cultVar;
        this.b = apwfVar;
    }

    @Override // defpackage.zby
    public final auyl a(ajlt ajltVar) {
        fdvc auxsVar;
        ajltVar.getClass();
        angr angrVarI = ajltVar.i();
        anhj anhjVarA = angrVarI != null ? angrVarI.a() : null;
        angl anglVar = anhjVarA instanceof angl ? (angl) anhjVarA : null;
        if (anglVar != null) {
            fdvc fdvcVar = (fdvc) ((Map) this.c.b()).get(anglVar.a);
            if (fdvcVar == null) {
                auxsVar = null;
            } else {
                cult cultVar = this.e;
                fdjx fdjxVar = this.d;
                fdus fdusVar = fdur.b;
                fdat fdatVar = new fdat() { // from class: zbz
                    @Override // defpackage.fdat
                    public final Object a(Object obj, Object obj2) {
                        evxl evxlVar = (evxl) obj;
                        if (((Boolean) obj2).booleanValue()) {
                            return evxlVar;
                        }
                        return null;
                    }
                };
                fdvc[] fdvcVarArr = {fdvcVar, cultVar.a};
                int i = 0;
                while (true) {
                    if (i >= 2) {
                        auxsVar = new auxs(new avar(fdvcVarArr, fdatVar));
                        break;
                    }
                    fdvc fdvcVar2 = fdvcVarArr[i];
                    if (fdvcVar2 == null || (fdvcVar2 instanceof auxs)) {
                        i++;
                    } else {
                        fdvc[] fdvcVarArr2 = (fdvc[]) fcur.K(fdvcVarArr).toArray(new fdvc[0]);
                        avau avauVar = new avau((fdpl[]) Arrays.copyOf(fdvcVarArr2, fdvcVarArr2.length), fdvcVarArr, fdatVar);
                        ArrayList arrayList = new ArrayList(2);
                        for (int i2 = 0; i2 < 2; i2++) {
                            fdvc fdvcVar3 = fdvcVarArr[i2];
                            arrayList.add(fdvcVar3 != null ? fdvcVar3.c() : null);
                        }
                        Object[] array = arrayList.toArray(new Object[0]);
                        auxsVar = fdtg.b(avauVar, fdjxVar, fdusVar, fdatVar.a(array[0], array[1]));
                    }
                }
            }
            if (auxsVar != null) {
                return auyp.a(auxsVar);
            }
        }
        return null;
    }

    @Override // defpackage.zby
    public final void b(ajlt ajltVar) {
        ajltVar.getClass();
        auvw.k(this.d, null, null, new zca(this, ajltVar, null), 3);
    }
}
