package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crjz {
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/util/p2p/reaction/ReactionPattern");
    public final int a;
    private final Pattern c;
    private final int d;
    private final int e;

    private crjz(ejgw ejgwVar) {
        int iB = ejgv.b(ejgwVar.c);
        ejwl.a(iB == 0 || iB != 2);
        this.c = Pattern.compile(ejgwVar.b, 64);
        int iB2 = ejgv.b(ejgwVar.c);
        int i = 4;
        if (iB2 != 0 && iB2 == 3) {
            i = 3;
        }
        this.a = i;
        boolean z = ejgwVar.d;
        this.d = true != z ? 1 : 2;
        this.e = true == z ? 1 : 2;
    }

    public static Optional b(ejgw ejgwVar) {
        try {
            crjz crjzVar = new crjz(ejgwVar);
            if (crjzVar.c.matcher("").groupCount() == 2) {
                return Optional.of(crjzVar);
            }
            ekrw ekrwVarI = b.i();
            ekrwVarI.X(eksq.a, "BugleAnnotation");
            ((ekrd) ((ekrd) ekrwVarI).h("com/google/android/apps/messaging/shared/util/p2p/reaction/ReactionPattern", "parseRegex", 50, "ReactionPattern.java")).q("Incorrect number of capture group in regex.");
            return Optional.empty();
        } catch (PatternSyntaxException e) {
            ekrw ekrwVarI2 = b.i();
            ekrwVarI2.X(eksq.a, "BugleAnnotation");
            ((ekrd) ((ekrd) ekrwVarI2).h("com/google/android/apps/messaging/shared/util/p2p/reaction/ReactionPattern", "parseRegex", 43, "ReactionPattern.java")).t("Pattern %s is not a valid regex.", e.getPattern());
            return Optional.empty();
        } catch (IllegalArgumentException unused) {
            ekrw ekrwVarI3 = b.i();
            ekrwVarI3.X(eksq.a, "BugleAnnotation");
            ((ekrd) ((ekrd) ekrwVarI3).h("com/google/android/apps/messaging/shared/util/p2p/reaction/ReactionPattern", "parseRegex", 46, "ReactionPattern.java")).q("ReactionRegex type is unspecified.");
            return Optional.empty();
        }
    }

    public final Optional a(String str) {
        if (TextUtils.isEmpty(str)) {
            return Optional.empty();
        }
        Matcher matcher = this.c.matcher(str);
        if (!matcher.matches()) {
            return Optional.empty();
        }
        String strGroup = matcher.group(this.e);
        String strGroup2 = matcher.group(this.d);
        return (strGroup == null || strGroup2 == null) ? Optional.empty() : Optional.of(new crjr(strGroup, strGroup2));
    }
}
