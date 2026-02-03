package defpackage;

/* compiled from: PG */
@fdac
/* loaded from: classes.dex */
public final class khd {
    public final int a;

    public static String a(int i) {
        StringBuilder sb = new StringBuilder("LineBreak(strategy=");
        int iA = khe.a(i);
        String str = "Invalid";
        sb.append((Object) (kha.a(iA, 1) ? "Strategy.Simple" : kha.a(iA, 2) ? "Strategy.HighQuality" : kha.a(iA, 3) ? "Strategy.Balanced" : kha.a(iA, 0) ? "Strategy.Unspecified" : "Invalid"));
        sb.append(", strictness=");
        int iB = khe.b(i);
        sb.append((Object) (khb.a(iB, 1) ? "Strictness.None" : khb.a(iB, 2) ? "Strictness.Loose" : khb.a(iB, 3) ? "Strictness.Normal" : khb.a(iB, 4) ? "Strictness.Strict" : khb.a(iB, 0) ? "Strictness.Unspecified" : "Invalid"));
        sb.append(", wordBreak=");
        int iC = khe.c(i);
        if (khc.a(iC, 1)) {
            str = "WordBreak.None";
        } else if (khc.a(iC, 2)) {
            str = "WordBreak.Phrase";
        } else if (khc.a(iC, 0)) {
            str = "WordBreak.Unspecified";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }

    public static final boolean b(int i, int i2) {
        return i == i2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof khd) && this.a == ((khd) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
