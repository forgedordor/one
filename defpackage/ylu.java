package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ylu extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ auyl[] c;
    final /* synthetic */ yko d;
    final /* synthetic */ ylw e;
    final /* synthetic */ yki f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylu(fcxy fcxyVar, auyl[] auylVarArr, yko ykoVar, ylw ylwVar, yki ykiVar) {
        super(3, fcxyVar);
        this.c = auylVarArr;
        this.d = ykoVar;
        this.e = ylwVar;
        this.f = ykiVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ylu yluVar = new ylu((fcxy) obj3, this.c, this.d, this.e, this.f);
        yluVar.g = (fdpm) obj;
        yluVar.b = (Object[]) obj2;
        return yluVar.b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v1, types: [fdpm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        dkly dklyVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r2 = this.g;
            Object obj2 = this.b;
            auyl[] auylVarArr = this.c;
            ArrayList arrayList = new ArrayList(12);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= 12) {
                    break;
                }
                if (auylVarArr[i2] != null) {
                    dklyVar = ((Object[]) obj2)[i3];
                    i3++;
                }
                arrayList.add(dklyVar);
                i2++;
            }
            Object[] array = arrayList.toArray(new Object[0]);
            Object obj3 = array[0];
            obj3.getClass();
            dkgq dkgqVar = (dkgq) obj3;
            dkny dknyVar = (dkny) array[1];
            dknh dknhVar = (dknh) array[2];
            dkzl dkzlVar = (dkzl) array[3];
            dkol dkolVar = (dkol) array[4];
            dklyVar = this.d.p ? (dkly) array[5] : null;
            evxl evxlVar = (evxl) array[6];
            zap zapVar = (zap) array[7];
            evxl evxlVar2 = (evxl) array[8];
            Object obj4 = array[9];
            obj4.getClass();
            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
            anlb anlbVar = (anlb) array[10];
            Object obj5 = array[11];
            fdcm.e(obj5, 1);
            yki ykiVarB = this.e.b(this.f, dkgqVar, dknyVar, dknhVar, dkzlVar, dkolVar, dklyVar, evxlVar, zapVar, evxlVar2, zBooleanValue, anlbVar, (fdap) obj5);
            this.a = 1;
            if (r2.fO(ykiVarB, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
