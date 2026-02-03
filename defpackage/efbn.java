package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efbn extends efdc {
    private final String a;

    public efbn(String str) {
        this.a = str;
    }

    @Override // defpackage.efdc
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof efdc) {
            return this.a.equals(((efdc) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
