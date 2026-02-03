package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejmd {
    public final Pattern a;
    public final Pattern b;
    public final int c;

    public ejmd(ejgr ejgrVar) {
        this.a = Pattern.compile(ejgrVar.b, 64);
        this.c = ejgrVar.c;
        String str = ejgrVar.d;
        this.b = !str.isEmpty() ? Pattern.compile(str, 64) : null;
    }
}
