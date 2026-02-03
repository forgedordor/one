package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eaez {
    public final boolean a = true;
    public final String b;
    public final evqs c;
    public final ekhx d;
    public final ekgp e;
    public final eaey f;

    public eaez(eaar eaarVar, eaey eaeyVar) {
        if (eaarVar.b.b.isEmpty()) {
            eaaj.a.equals(eaarVar.c);
        }
        this.b = eaarVar.f();
        this.c = eaarVar.d();
        eaarVar.e();
        eaarVar.a();
        Map mapG = eaarVar.g();
        this.d = mapG != null ? ekhx.o(mapG.keySet()) : ekon.a;
        eaan eaanVarB = eaarVar.b();
        ekgi ekgiVarH = ekgp.h(eaanVarB.b.size() + 3);
        ekqg ekqgVarListIterator = eaanVarB.b.listIterator();
        while (ekqgVarListIterator.hasNext()) {
            eaam eaamVar = (eaam) ekqgVarListIterator.next();
            ekgiVarH.i(eaamVar.c(), eaamVar.b());
        }
        ekgiVarH.i("__phenotype_server_token", eaarVar.e());
        ekgiVarH.i("__phenotype_snapshot_token", eaarVar.f());
        ekgiVarH.i("__phenotype_configuration_version", Long.valueOf(eaarVar.a()));
        this.e = ekgiVarH.b();
        this.f = eaeyVar;
    }

    public final boolean a() {
        return this.f.c == 17;
    }

    public final boolean b() {
        return this.f.b == 3;
    }

    public eaez(eafc eafcVar, eaey eaeyVar) {
        evqs evqsVar;
        String str;
        eafc.a.equals(eafcVar);
        this.b = eafcVar.c;
        this.c = eafcVar.d;
        String str2 = eafcVar.e;
        long j = eafcVar.f;
        this.d = ekon.a;
        ekgi ekgiVarH = ekgp.h(eafcVar.g.size() + 3);
        for (eafe eafeVar : eafcVar.g) {
            int i = eafeVar.c;
            int i2 = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
            if (i2 == 0) {
                throw null;
            }
            int i3 = i2 - 1;
            if (i3 == 0) {
                ekgiVarH.i(eafeVar.e, Long.valueOf(i == 2 ? ((Long) eafeVar.d).longValue() : 0L));
            } else if (i3 == 1) {
                ekgiVarH.i(eafeVar.e, Boolean.valueOf(i == 3 ? ((Boolean) eafeVar.d).booleanValue() : false));
            } else if (i3 == 2) {
                ekgiVarH.i(eafeVar.e, Double.valueOf(i == 4 ? ((Double) eafeVar.d).doubleValue() : 0.0d));
            } else if (i3 == 3) {
                String str3 = eafeVar.e;
                if (i == 5) {
                    str = (String) eafeVar.d;
                } else {
                    str = "";
                }
                ekgiVarH.i(str3, str);
            } else if (i3 == 4) {
                String str4 = eafeVar.e;
                if (i == 6) {
                    evqsVar = (evqs) eafeVar.d;
                } else {
                    evqsVar = evqs.b;
                }
                ekgiVarH.i(str4, evqsVar.I());
            }
        }
        ekgiVarH.i("__phenotype_server_token", eafcVar.e);
        ekgiVarH.i("__phenotype_snapshot_token", eafcVar.c);
        ekgiVarH.i("__phenotype_configuration_version", Long.valueOf(eafcVar.f));
        this.e = ekgiVarH.b();
        this.f = eaeyVar;
    }
}
