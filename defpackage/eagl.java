package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eagl {
    private final eagk a = new eagk();

    public final Pattern a(String str) {
        eagk eagkVar = this.a;
        Pattern pattern = (Pattern) eagkVar.a(str);
        if (pattern != null) {
            return pattern;
        }
        Pattern patternCompile = Pattern.compile(str);
        eagkVar.b(str, patternCompile);
        return patternCompile;
    }
}
