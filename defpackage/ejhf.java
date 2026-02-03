package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejhf {
    public final Pattern a;
    public final Pattern b;
    public final int c;

    public ejhf(ejgj ejgjVar) {
        Pattern patternCompile = Pattern.compile(ejgjVar.b, 64);
        this.a = patternCompile;
        int i = ejgjVar.c;
        this.c = i;
        String str = ejgjVar.d;
        this.b = !str.isEmpty() ? Pattern.compile(str, 64) : null;
        boolean z = i > 0 && i <= patternCompile.matcher("").groupCount();
        String str2 = ejgjVar.b;
        if (!z) {
            throw new IllegalStateException(ejxq.a("Regex \"%s\" was invalid with \"%s\" capture group", str2, Integer.valueOf(i)));
        }
    }
}
