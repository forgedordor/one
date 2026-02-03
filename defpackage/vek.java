package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vek extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ List c;
    final /* synthetic */ veo d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vek(fcxy fcxyVar, List list, veo veoVar) {
        super(3, fcxyVar);
        this.c = list;
        this.d = veoVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        vek vekVar = new vek((fcxy) obj3, this.c, this.d);
        vekVar.e = (fdpm) obj;
        vekVar.b = obj2;
        return vekVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdpl fdplVarC;
        int i;
        fcyl fcylVar = fcyl.a;
        int i2 = this.a;
        fctl.b(obj);
        if (i2 == 0) {
            ?? r2 = this.e;
            zqw zqwVar = (zqw) this.b;
            List list = this.c;
            ArrayList<vdy> arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((vdy) obj2).a().contains(zqwVar.a())) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(fcva.p(arrayList, 10));
            for (vdy vdyVar : arrayList) {
                veo veoVar = this.d;
                fdpl fdqzVar = new fdqz(new vel(null), vdyVar.b());
                Object objB = veoVar.e.b();
                objB.getClass();
                boolean zBooleanValue = ((Boolean) fdct.a((Optional) objB, false)).booleanValue();
                long j = fdhi.a;
                Object objB2 = veoVar.d.b();
                objB2.getClass();
                long jG = fdhk.g(((Number) objB2).longValue(), fdhl.c);
                vem vemVar = new vem(vdyVar, null);
                if (zBooleanValue) {
                    fdqzVar = avan.a(fdqzVar, jG, 1, vemVar);
                }
                fdrc fdrcVar = new fdrc(fdqzVar, new ven(null));
                String simpleName = vdyVar.getClass().getSimpleName();
                simpleName.getClass();
                arrayList2.add(auyk.a(fdrcVar, simpleName));
            }
            if (arrayList2.isEmpty()) {
                fdplVarC = new fdpu(fcvo.a);
                i = 1;
            } else {
                veo veoVar2 = this.d;
                long j2 = fdhi.a;
                fcsu fcsuVar = veoVar2.c;
                Object objB3 = fcsuVar.b();
                objB3.getClass();
                long jLongValue = ((Number) objB3).longValue();
                fdhl fdhlVar = fdhl.c;
                long jG2 = fdhk.g(jLongValue, fdhlVar);
                fdpl[] fdplVarArr = (fdpl[]) fcva.ao(arrayList2).toArray(new fdpl[0]);
                int length = fdplVarArr.length;
                boolean[] zArr = new boolean[length];
                for (int i3 = 0; i3 < length; i3++) {
                    zArr[i3] = false;
                }
                int length2 = fdplVarArr.length;
                ArrayList arrayList3 = new ArrayList(length2);
                int i4 = 0;
                int i5 = 0;
                while (i5 < length2) {
                    arrayList3.add(new fdtm(fdplVarArr[i5], new ved(zArr, i4, null)));
                    i5++;
                    i4++;
                    fdplVarArr = fdplVarArr;
                }
                fdjx fdjxVar = veoVar2.b;
                fdqz fdqzVar2 = new fdqz(new vei(fdjxVar, jG2, fdplVarArr, zArr, null), new veg((fdpl[]) fcva.ao(arrayList3).toArray(new fdpl[0])));
                fdvc fdvcVarB = auyk.b(veoVar2.g.a, "TrustedContactsUiAdapter");
                Object objB4 = fcsuVar.b();
                objB4.getClass();
                fdplVarC = avac.c(fdqzVar2, fdvcVarB, fdjxVar, fdhk.g(((Number) objB4).longValue(), fdhlVar), new vej(null));
                i = 1;
            }
            this.a = i;
            if (fdpy.c(r2, fdplVarC, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
