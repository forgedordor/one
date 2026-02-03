package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebqp {
    public static final Pattern a = Pattern.compile("(\\d+)\\s+(\\S+)\\s+\"(\\d+)\\s+.+\"");

    public static int a(ebqs ebqsVar) {
        String strJ = ebqsVar.j("Retry-After");
        if (strJ != null) {
            try {
                return Integer.parseInt(strJ);
            } catch (NumberFormatException e) {
                dhja.s(e, "Retry-After does not contain a parsable integer (%s).", strJ);
            }
        }
        return 0;
    }
}
