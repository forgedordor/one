package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eter {
    private final eteq a = new eteq();

    public final Pattern a(String str) {
        eteq eteqVar = this.a;
        Pattern pattern = (Pattern) eteqVar.a(str);
        if (pattern != null) {
            return pattern;
        }
        Pattern patternCompile = Pattern.compile(str);
        eteqVar.b(str, patternCompile);
        return patternCompile;
    }
}
