package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwsp {
    public static ejwi a(dwqw dwqwVar) {
        Object objC;
        ejwi ejwiVarJ;
        if (dwqwVar.h().a() != 3 || !((dwnt) dwqwVar.h().b()).a.equals("photos")) {
            return ejud.a;
        }
        HashMap mapG = dvhy.g(((dwnt) dwqwVar.h().b()).b);
        try {
            ejwi ejwiVarJ2 = ejud.a;
            int iIntValue = ((Integer) mapG.get("WIDTH")).intValue();
            int iIntValue2 = ((Integer) mapG.get("HEIGHT")).intValue();
            int iIntValue3 = ((Integer) mapG.get("SIZE")).intValue();
            int iIntValue4 = ((Integer) mapG.get("DOWNLOAD_STATUS")).intValue();
            if (mapG.containsKey("THUMBNAIL")) {
                ejwiVarJ2 = ejwi.j((byte[]) mapG.get("THUMBNAIL"));
            }
            ejwi ejwiVar = ejwiVarJ2;
            if (mapG.containsKey("MEDIA_ID")) {
                HashMap map = (HashMap) mapG.get("MEDIA_ID");
                try {
                    dwsq dwsqVar = new dwsq();
                    dwsqVar.b((String) map.get("RESOURCE_ID"));
                    dwsqVar.c(((Integer) map.get("RESOURCE_REGION")).intValue());
                    ejwiVarJ = ejwi.j(dwsqVar.a());
                } catch (RuntimeException e) {
                    dvhv.d("PhotoConverters", "failed to convert HashMap to LighterMediaId", e);
                    ejwiVarJ = ejud.a;
                }
                objC = ejwiVarJ.c();
            } else {
                objC = null;
            }
            return ejwi.j(new dwss((dwsu) objC, mapG.containsKey("LOCAL_URI") ? (String) mapG.get("LOCAL_URI") : null, ejwiVar, iIntValue, iIntValue2, iIntValue3, iIntValue4));
        } catch (RuntimeException e2) {
            dvhv.d("PhotoConverters", "failed to convert HashMap to PhotoData", e2);
            return ejud.a;
        }
    }
}
