package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feyt {
    public static final Pattern a = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern b = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String c;
    public final String d;
    public final String e;
    public final String[] f;

    public feyt(String str, String str2, String str3, String[] strArr) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = strArr;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof feyt) && fdbq.f(((feyt) obj).c, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return this.c;
    }
}
