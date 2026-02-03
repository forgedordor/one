package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tct extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ tcx c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tct(fcxy fcxyVar, tcx tcxVar) {
        super(3, fcxyVar);
        this.c = tcxVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        tct tctVar = new tct((fcxy) obj3, this.c);
        tctVar.d = (fdpm) obj;
        tctVar.b = (Object[]) obj2;
        return tctVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r10 = this.d;
            List listN = fcur.N((fcti[]) this.b);
            ArrayList<fcti> arrayList = new ArrayList();
            for (Object obj2 : listN) {
                if (((egxh) ((fcti) obj2).a) instanceof egxb) {
                    arrayList.add(obj2);
                }
            }
            for (fcti fctiVar : arrayList) {
                ekrd ekrdVar = (ekrd) tcx.a.j();
                Object obj3 = fctiVar.a;
                obj3.getClass();
                ((ekrd) ekrdVar.g(((egxb) obj3).a).h("com/google/android/apps/messaging/banner/BannersUiAdapterImpl", "removeFailedBanners", 111, "BannersUiAdapterImpl.kt")).q("Failed to load banner");
            }
            listN.removeAll(arrayList);
            List listAo = fcva.ao(listN);
            this.a = 1;
            if (r10.fO(listAo, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
