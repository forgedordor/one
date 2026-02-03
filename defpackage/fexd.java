package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fexd {
    public static final /* synthetic */ int a = 0;
    private static final Pattern b = Pattern.compile("(?i)^cid:.*");
    private static final Pattern c = Pattern.compile("[<>]");

    public static String a(String str) {
        return (fewr.b("ical4j.compatibility.notes") && b.matcher(str).matches()) ? c.matcher(str).replaceAll("") : str;
    }

    public static URI b(String str) throws URISyntaxException {
        try {
            return new URI(a(str));
        } catch (URISyntaxException e) {
            if (!fewr.b("ical4j.parsing.relaxed")) {
                throw e;
            }
            String strA = a(str);
            int iIndexOf = strA.indexOf(58);
            if (iIndexOf != -1 && iIndexOf < strA.length() - 1) {
                try {
                    return new URI(strA.substring(0, iIndexOf), strA.substring(iIndexOf + 1), null);
                } catch (URISyntaxException unused) {
                    return new URI("net.fortunal.ical4j.invalid", str, null);
                }
            }
            try {
                return new URI("net.fortunal.ical4j.invalid", str, null);
            } catch (URISyntaxException unused2) {
                throw new IllegalArgumentException("Could not build URI from ".concat(String.valueOf(str)));
            }
        }
    }
}
