package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pih {
    public static final pim a(pgz pgzVar, String str) throws Exception {
        long j;
        Map mapB;
        Set set;
        int i;
        String str2;
        Throwable th;
        pil pilVar;
        pgz pgzVar2 = pgzVar;
        phi phiVarA = pgzVar2.a(a.a(str, "PRAGMA table_info(`", "`)"));
        try {
            long j2 = 0;
            String str3 = "name";
            if (phiVarA.j()) {
                int iA = pie.a(phiVarA, "name");
                int iA2 = pie.a(phiVarA, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
                int iA3 = pie.a(phiVarA, "notnull");
                int iA4 = pie.a(phiVarA, "pk");
                int iA5 = pie.a(phiVarA, "dflt_value");
                fcxe fcxeVar = new fcxe();
                while (true) {
                    String strD = phiVarA.d(iA);
                    j = j2;
                    fcxeVar.put(strD, new pij(strD, phiVarA.d(iA2), phiVarA.b(iA3) != j2, (int) phiVarA.b(iA4), phiVarA.i(iA5) ? null : phiVarA.d(iA5), 2));
                    if (!phiVarA.j()) {
                        break;
                    }
                    pgzVar2 = pgzVar;
                    j2 = j;
                }
                mapB = fcwa.b(fcxeVar);
                fdaa.a(phiVarA, null);
            } else {
                mapB = fcvp.a;
                fdaa.a(phiVarA, null);
                j = 0;
            }
            phiVarA = pgzVar2.a(a.a(str, "PRAGMA foreign_key_list(`", "`)"));
            try {
                int iA6 = pie.a(phiVarA, "id");
                int iA7 = pie.a(phiVarA, "seq");
                int iA8 = pie.a(phiVarA, "table");
                int iA9 = pie.a(phiVarA, "on_delete");
                int iA10 = pie.a(phiVarA, "on_update");
                int iA11 = pie.a(phiVarA, "id");
                int iA12 = pie.a(phiVarA, "seq");
                int iA13 = pie.a(phiVarA, "from");
                int iA14 = pie.a(phiVarA, "to");
                Map map = mapB;
                fcww fcwwVar = new fcww((byte[]) null);
                while (phiVarA.j()) {
                    fcwwVar.add(new phy((int) phiVarA.b(iA11), (int) phiVarA.b(iA12), phiVarA.d(iA13), phiVarA.d(iA14)));
                    iA9 = iA9;
                    str3 = str3;
                }
                int i2 = iA9;
                String str4 = str3;
                List listAk = fcva.ak(fcva.a(fcwwVar));
                phiVarA.h();
                fcxk fcxkVar = new fcxk();
                while (phiVarA.j()) {
                    if (phiVarA.b(iA7) == j) {
                        int iB = (int) phiVarA.b(iA6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList<phy> arrayList3 = new ArrayList();
                        for (Object obj : listAk) {
                            if (((phy) obj).a == iB) {
                                arrayList3.add(obj);
                            }
                        }
                        for (phy phyVar : arrayList3) {
                            arrayList.add(phyVar.b);
                            arrayList2.add(phyVar.c);
                        }
                        int i3 = i2;
                        fcxkVar.add(new pik(phiVarA.d(iA8), phiVarA.d(i3), phiVarA.d(iA10), arrayList, arrayList2));
                        i2 = i3;
                    }
                }
                Set setA = fcwm.a(fcxkVar);
                fdaa.a(phiVarA, null);
                pgz pgzVar3 = pgzVar;
                phiVarA = pgzVar3.a(a.a(str, "PRAGMA index_list(`", "`)"));
                String str5 = str4;
                try {
                    int iA15 = pie.a(phiVarA, str5);
                    int iA16 = pie.a(phiVarA, "origin");
                    int iA17 = pie.a(phiVarA, "unique");
                    if (iA15 == -1 || iA16 == -1 || iA17 == -1) {
                        fdaa.a(phiVarA, null);
                        set = null;
                    } else {
                        fcxk fcxkVar2 = new fcxk();
                        while (true) {
                            if (!phiVarA.j()) {
                                Set setA2 = fcwm.a(fcxkVar2);
                                fdaa.a(phiVarA, null);
                                set = setA2;
                                break;
                            }
                            if (fdbq.f("c", phiVarA.d(iA16))) {
                                String strD2 = phiVarA.d(iA15);
                                boolean z = phiVarA.b(iA17) == 1;
                                phiVarA = pgzVar3.a(a.a(strD2, "PRAGMA index_xinfo(`", "`)"));
                                try {
                                    int iA18 = pie.a(phiVarA, "seqno");
                                    int iA19 = pie.a(phiVarA, "cid");
                                    int iA20 = pie.a(phiVarA, str5);
                                    int i4 = iA15;
                                    int iA21 = pie.a(phiVarA, "desc");
                                    int i5 = iA16;
                                    if (iA18 == -1 || iA19 == -1 || iA20 == -1 || iA21 == -1) {
                                        i = iA17;
                                        str2 = str5;
                                        th = null;
                                        fdaa.a(phiVarA, null);
                                        pilVar = null;
                                    } else {
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        i = iA17;
                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                        while (phiVarA.j()) {
                                            String str6 = str5;
                                            if (((int) phiVarA.b(iA19)) >= 0) {
                                                int iB2 = (int) phiVarA.b(iA18);
                                                String strD3 = phiVarA.d(iA20);
                                                String str7 = phiVarA.b(iA21) > j ? "DESC" : "ASC";
                                                Integer numValueOf = Integer.valueOf(iB2);
                                                linkedHashMap.put(numValueOf, strD3);
                                                linkedHashMap2.put(numValueOf, str7);
                                                str5 = str6;
                                                iA21 = iA21;
                                            } else {
                                                str5 = str6;
                                            }
                                        }
                                        str2 = str5;
                                        List listAl = fcva.al(linkedHashMap.entrySet(), new pif());
                                        ArrayList arrayList4 = new ArrayList(fcva.p(listAl, 10));
                                        Iterator it = listAl.iterator();
                                        while (it.hasNext()) {
                                            arrayList4.add((String) ((Map.Entry) it.next()).getValue());
                                        }
                                        List listAo = fcva.ao(arrayList4);
                                        List listAl2 = fcva.al(linkedHashMap2.entrySet(), new pig());
                                        ArrayList arrayList5 = new ArrayList(fcva.p(listAl2, 10));
                                        Iterator it2 = listAl2.iterator();
                                        while (it2.hasNext()) {
                                            arrayList5.add((String) ((Map.Entry) it2.next()).getValue());
                                        }
                                        pilVar = new pil(strD2, z, listAo, fcva.ao(arrayList5));
                                        fdaa.a(phiVarA, null);
                                        th = null;
                                    }
                                    if (pilVar == null) {
                                        fdaa.a(phiVarA, th);
                                        set = null;
                                        break;
                                    }
                                    fcxkVar2.add(pilVar);
                                    pgzVar3 = pgzVar;
                                    iA15 = i4;
                                    iA16 = i5;
                                    iA17 = i;
                                    str5 = str2;
                                } finally {
                                }
                            } else {
                                pgzVar3 = pgzVar;
                            }
                        }
                    }
                    return new pim(str, map, setA, set);
                } finally {
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
