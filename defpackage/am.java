package defpackage;

import java.text.ParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class am extends ad {
    public Map b;
    public Map c;
    private final Map e = new HashMap();
    private static final ResourceBundle d = new s();
    public static final am a = new am();

    private am() {
    }

    public final al a(String str) {
        boolean zContainsKey;
        aj ajVarA;
        al alVar;
        Object[][] objArr;
        Map map = this.e;
        synchronized (map) {
            zContainsKey = map.containsKey(str);
            ajVarA = null;
            alVar = zContainsKey ? (al) map.get(str) : null;
        }
        if (zContainsKey) {
            return alVar;
        }
        try {
            Object[][] objArr2 = (Object[][]) d.getObject("rules");
            int length = objArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    objArr = null;
                    break;
                }
                Object[] objArr3 = objArr2[i];
                if (str.equals(objArr3[0])) {
                    objArr = (Object[][]) objArr3[1];
                    break;
                }
                i++;
            }
            StringBuilder sb = new StringBuilder();
            for (Object[] objArr4 : objArr) {
                if (sb.length() > 0) {
                    sb.append("; ");
                }
                sb.append((String) objArr4[0]);
                sb.append(": ");
                sb.append((String) objArr4[1]);
            }
            String string = sb.toString();
            al alVar2 = al.a;
            String strTrim = string.trim();
            if (strTrim.length() == 0) {
                alVar = al.a;
            } else {
                ak akVar = new ak();
                if (strTrim.endsWith(";")) {
                    strTrim = strTrim.substring(0, strTrim.length() - 1);
                }
                for (String str2 : al.g.split(strTrim)) {
                    aj ajVarA2 = al.a(str2.trim());
                    akVar.a |= (ajVarA2.c == null && ajVarA2.d == null) ? false : true;
                    akVar.a(ajVarA2);
                }
                List list = akVar.b;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    aj ajVar = (aj) it.next();
                    if ("other".equals(ajVar.a)) {
                        it.remove();
                        ajVarA = ajVar;
                    }
                }
                if (ajVarA == null) {
                    ajVarA = al.a("other:");
                }
                list.add(ajVarA);
                alVar = new al(akVar);
            }
        } catch (ParseException | MissingResourceException unused) {
        }
        Map map2 = this.e;
        synchronized (map2) {
            if (map2.containsKey(str)) {
                alVar = (al) map2.get(str);
            } else {
                map2.put(str, alVar);
            }
        }
        return alVar;
    }

    public final void b() {
        Map map;
        Map treeMap;
        Map treeMap2;
        synchronized (this) {
            map = this.b;
        }
        if (map == null) {
            try {
                ResourceBundle resourceBundle = d;
                Object[][] objArr = (Object[][]) resourceBundle.getObject("locales");
                treeMap = new TreeMap();
                for (Object[] objArr2 : objArr) {
                    treeMap.put((String) objArr2[0], (String) objArr2[1]);
                }
                Object[][] objArr3 = (Object[][]) resourceBundle.getObject("locales_ordinals");
                treeMap2 = new TreeMap();
                for (Object[] objArr4 : objArr3) {
                    treeMap2.put((String) objArr4[0], (String) objArr4[1]);
                }
            } catch (MissingResourceException unused) {
                treeMap = Collections.EMPTY_MAP;
                treeMap2 = Collections.EMPTY_MAP;
            }
            synchronized (this) {
                if (this.b == null) {
                    this.b = treeMap;
                    this.c = treeMap2;
                }
            }
        }
    }
}
