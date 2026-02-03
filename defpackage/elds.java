package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elds {
    public static final elds a = new elds("about:invalid#zGuavaz");
    public final String b;

    public elds(String str) {
        str.getClass();
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof elds) {
            return this.b.equals(((elds) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 18288376;
    }

    public final String toString() {
        return "SafeUrl{" + this.b + "}";
    }
}
