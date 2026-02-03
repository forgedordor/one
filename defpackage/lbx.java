package defpackage;

import android.text.Spannable;
import android.text.util.Linkify;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lbx {
    public static final Comparator a = new Comparator() { // from class: lbv
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            lbw lbwVar = (lbw) obj;
            lbw lbwVar2 = (lbw) obj2;
            int i = lbwVar.c;
            int i2 = lbwVar2.c;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            return Integer.compare(lbwVar2.d, lbwVar.d);
        }
    };

    public static void a(ArrayList arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter) {
        boolean z;
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            String strGroup = matcher.group(0);
            if (matchFilter == null || matchFilter.acceptMatch(spannable, iStart, iEnd)) {
                if (strGroup != null) {
                    lbw lbwVar = new lbw();
                    int length = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            z = false;
                            break;
                        }
                        String str = strArr[i];
                        if (strGroup.regionMatches(true, 0, str, 0, str.length())) {
                            z = true;
                            if (!strGroup.regionMatches(false, 0, str, 0, str.length())) {
                                strGroup = String.valueOf(str).concat(String.valueOf(strGroup.substring(str.length())));
                            }
                        } else {
                            i++;
                        }
                    }
                    if (!z) {
                        strGroup = String.valueOf(strArr[0]).concat(strGroup);
                    }
                    lbwVar.b = strGroup;
                    lbwVar.c = iStart;
                    lbwVar.d = iEnd;
                    arrayList.add(lbwVar);
                }
            }
        }
    }
}
