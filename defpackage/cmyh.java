package defpackage;

import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmyh {
    public final Map a;

    public cmyh(String str) throws NumberFormatException {
        ekgp ekgpVarC;
        int iMax;
        ekgi ekgiVar = new ekgi();
        try {
            ejxh ejxhVar = cmyi.c;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str2 : ejxhVar.a.g(str)) {
                Iterator itH = ejxhVar.b.h(str2);
                ejwl.f(itH.hasNext(), "Chunk [%s] is not a valid entry", str2);
                String str3 = (String) itH.next();
                ejwl.f(!linkedHashMap.containsKey(str3), "Duplicate key [%s] found.", str3);
                ejwl.f(itH.hasNext(), "Chunk [%s] is not a valid entry", str2);
                linkedHashMap.put(str3, (String) itH.next());
                ejwl.f(true ^ itH.hasNext(), "Chunk [%s] is not a valid entry", str2);
            }
            Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
            mapUnmodifiableMap.getClass();
            for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
                String str4 = (String) entry.getKey();
                String str5 = (String) entry.getValue();
                str4.getClass();
                ezan ezanVarC = ezan.c(str4);
                str5.getClass();
                Matcher matcher = cmyi.d.matcher(str5);
                matcher.getClass();
                if (!matcher.matches()) {
                    throw new IllegalArgumentException("Invalid suggestion combination config string");
                }
                String strGroup = matcher.group(1);
                String strGroup2 = matcher.group(2);
                int i = 0;
                if (strGroup != null && strGroup.length() != 0) {
                    i = Integer.parseInt(strGroup);
                }
                if (strGroup2 == null || strGroup2.length() == 0) {
                    Object objE = crbf.b.e();
                    objE.getClass();
                    iMax = Math.max(i, ((Number) objE).intValue());
                } else {
                    iMax = Integer.parseInt(strGroup2);
                }
                ekgiVar.i(ezanVarC, new cmyb(i, iMax));
            }
            ekgpVarC = ekgiVar.c();
        } catch (Exception e) {
            ekrw ekrwVarJ = cmyi.a.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarJ).g(e).h("com/google/android/apps/messaging/shared/suggestions/SuggestionTypeCombinationsConfig$SuggestionTypeCombination", "getSuggestionTypeCombinationMap", 62, "SuggestionTypeCombinationsConfig.kt")).t("Error while parsing config string %s", str);
            ekgpVarC = ekoj.a;
        }
        this.a = ekgpVarC;
    }
}
