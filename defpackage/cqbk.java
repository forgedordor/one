package defpackage;

import android.content.Context;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqbk {
    public static final /* synthetic */ int a = 0;
    private static final Pattern b = Pattern.compile("\\.");

    public static String a(Context context, String str) {
        String lowerCase = str.trim().toLowerCase(craf.c(context));
        String[] strArrSplit = lowerCase.split("@", 2);
        return strArrSplit.length == 2 ? ("gmail.com".equals(strArrSplit[1]) || "googlemail.com".equals(strArrSplit[1])) ? String.format("%s@%s", b.matcher(strArrSplit[0]).replaceAll(""), "gmail.com") : lowerCase : lowerCase;
    }
}
