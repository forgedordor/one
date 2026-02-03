package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsty {
    public final String a;
    public final int b;

    public dsty(int i, String str) {
        this.b = i;
        this.a = str;
    }

    public static dsty a(String str) {
        str.getClass();
        return new dsty(1, str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dsty) {
            dsty dstyVar = (dsty) obj;
            if (dstyVar.b - 1 == this.b - 1 && ejwh.a(dstyVar.a, this.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return (this.b - 1) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
