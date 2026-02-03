package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffxe {
    public final String a;
    public final String b;

    public ffxe(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    private static final int a(String str) {
        if (str == null) {
            return 1;
        }
        return str.hashCode();
    }

    private static final boolean b(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ffxe)) {
            return false;
        }
        ffxe ffxeVar = (ffxe) obj;
        if (ffxeVar != this) {
            return b(this.a, ffxeVar.a) && b(this.b, ffxeVar.b);
        }
        return true;
    }

    public final int hashCode() {
        return a(this.a) + (a(this.b) * 31);
    }
}
