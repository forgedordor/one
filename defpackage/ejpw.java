package defpackage;

import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejpw {
    public static final String a(Locale locale, String str, ekgp ekgpVar, boolean z) {
        String strA;
        char cCharAt;
        char upperCase;
        int i;
        int i2 = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ekqg ekqgVarListIterator = ekgpVar.entrySet().listIterator();
        while (ekqgVarListIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
            ekfwVar.h(entry.getKey());
            ejmm ejmmVar = (ejmm) entry.getValue();
            ekfwVar.h(ejmmVar.d().isEmpty() ? ejmmVar.f() : ejmmVar.d());
        }
        Object[] array = ekfwVar.g().toArray();
        Map map = ejqk.a;
        ejqm ejqmVar = (ejqm) map.get(locale);
        if (ejqmVar == null && !locale.getCountry().isEmpty()) {
            ejqmVar = (ejqm) map.get(new Locale(locale.getLanguage()));
        }
        if (ejqmVar != null) {
            strA = ejpv.a(str.replaceAll("\\{[^{}\\s]+\\}", "\ufdd5$0\ufdd5"), array);
            int iIndexOf = strA.indexOf("\ufdd5");
            if (iIndexOf >= 0) {
                StringBuilder sb = new StringBuilder(strA.substring(0, iIndexOf));
                while (true) {
                    i = iIndexOf + 1;
                    int iIndexOf2 = strA.indexOf("\ufdd5", i);
                    if (iIndexOf2 < 0) {
                        break;
                    }
                    ejqk.a(ejqmVar, sb, strA.substring(i, iIndexOf2));
                    iIndexOf = iIndexOf2;
                }
                ejqk.a(ejqmVar, sb, strA.substring(i));
                strA = sb.toString();
            }
        } else {
            strA = ejpv.a(str, array);
        }
        if (!z || strA.length() == 0 || cCharAt == (upperCase = Character.toUpperCase((cCharAt = strA.charAt(0))))) {
            return strA;
        }
        return upperCase + strA.substring(1);
    }
}
