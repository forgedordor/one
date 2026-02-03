package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dezq {
    public int a;
    public boolean b = true;
    public boolean c = false;

    public static String a(boolean z) {
        return z ? "yes" : "no";
    }

    public static boolean b(String str) {
        return str.equals("1") || str.equals("yes") || str.equals("true");
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dezq)) {
            return false;
        }
        dezq dezqVar = (dezq) obj;
        return this.b == dezqVar.b && this.c == dezqVar.c && this.a == dezqVar.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), Boolean.valueOf(this.c), Integer.valueOf(this.a)});
    }

    public final String toString() {
        return "User count: " + this.a + ", locked: " + this.c + ", active: " + this.b;
    }
}
