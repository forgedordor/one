package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yls implements fdae {
    final /* synthetic */ auyl[] a;
    final /* synthetic */ yko b;
    final /* synthetic */ ylw c;
    final /* synthetic */ yki d;

    public yls(auyl[] auylVarArr, yko ykoVar, ylw ylwVar, yki ykiVar) {
        this.a = auylVarArr;
        this.b = ykoVar;
        this.c = ylwVar;
        this.d = ykiVar;
    }

    @Override // defpackage.fdae
    public final yki invoke() {
        ArrayList arrayList = new ArrayList(12);
        int i = 0;
        while (true) {
            Object objB = null;
            if (i >= 12) {
                break;
            }
            auyl auylVar = this.a[i];
            if (auylVar != null) {
                objB = auylVar.b();
            }
            arrayList.add(objB);
            i++;
        }
        Object[] array = arrayList.toArray(new Object[0]);
        Object obj = array[0];
        obj.getClass();
        dkgq dkgqVar = (dkgq) obj;
        dkny dknyVar = (dkny) array[1];
        dknh dknhVar = (dknh) array[2];
        dkzl dkzlVar = (dkzl) array[3];
        dkol dkolVar = (dkol) array[4];
        dkly dklyVar = this.b.p ? (dkly) array[5] : null;
        evxl evxlVar = (evxl) array[6];
        zap zapVar = (zap) array[7];
        evxl evxlVar2 = (evxl) array[8];
        Object obj2 = array[9];
        obj2.getClass();
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        anlb anlbVar = (anlb) array[10];
        Object obj3 = array[11];
        fdcm.e(obj3, 1);
        return this.c.b(this.d, dkgqVar, dknyVar, dknhVar, dkzlVar, dkolVar, dklyVar, evxlVar, zapVar, evxlVar2, zBooleanValue, anlbVar, (fdap) obj3);
    }
}
