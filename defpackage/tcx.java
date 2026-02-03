package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tcx {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/banner/BannersUiAdapterImpl");
    public final fdpl b;
    public String c;
    public final fdvc d;
    public final tck e;
    public final tdu f;
    public final tdu g;
    private final fcsu h;
    private final fdvc i;

    public tcx(tck tckVar, tdu tduVar, tdu tduVar2, fcsu fcsuVar, fdjx fdjxVar, Map map, fdpl fdplVar, fdpl fdplVar2) {
        this.e = tckVar;
        this.f = tduVar;
        this.g = tduVar2;
        this.h = fcsuVar;
        this.b = fdplVar2;
        this.i = (((Boolean) ((cczi) crbf.by.get()).e()).booleanValue() && ((Optional) fcsuVar.b()).isPresent()) ? ((xpi) ((Optional) fcsuVar.b()).get()).a() : fdvf.a(false);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!((tdg) entry.getKey()).b()) {
                ((ekrd) a.h().h("com/google/android/apps/messaging/banner/BannersUiAdapterImpl", "isEnabled", 89, "BannersUiAdapterImpl.kt")).D("Filtering out banner %s with %s because of being disabled", entry.getKey(), entry.getValue());
            }
            if (((tdg) entry.getKey()).b()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        List<fcti> listAl = fcva.al(fcwa.p(linkedHashMap), new tcw());
        ArrayList arrayList = new ArrayList(fcva.p(listAl, 10));
        for (fcti fctiVar : listAl) {
            arrayList.add(new tcr(((tdg) fctiVar.a).a(), fctiVar));
        }
        fdua fduaVar = new fdua(new fdua(new fdua(new tcu((fdpl[]) fcva.ao(arrayList).toArray(new fdpl[0]), this), fdplVar, new tcm(this)), this.i, new tcn(this)), this.g.a, new tco(this));
        tcv tcvVar = new tcv(null, this);
        int i = fdsn.a;
        this.d = fdtg.b(new fdwg(tcvVar, fduaVar), fdjxVar, fdur.a(0L, 3), null);
    }

    public static final tdj b(fcti fctiVar) {
        return (tdj) fctiVar.b;
    }

    public final tdh a(fcti fctiVar) {
        return (tdh) fctiVar.a;
    }
}
