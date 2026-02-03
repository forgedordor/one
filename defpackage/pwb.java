package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pwb {
    public static final pwb a = new pwb("LOCALE", 0);
    public static final pwb b = new pwb("LEFT_TO_RIGHT", 1);
    public static final pwb c = new pwb("RIGHT_TO_LEFT", 2);
    public static final pwb d = new pwb("TOP_TO_BOTTOM", 3);
    public static final pwb e = new pwb("BOTTOM_TO_TOP", 4);
    private final String f;
    private final int g;

    private pwb(String str, int i) {
        this.f = str;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pwb)) {
            return false;
        }
        pwb pwbVar = (pwb) obj;
        return fdbq.f(this.f, pwbVar.f) && this.g == pwbVar.g;
    }

    public final int hashCode() {
        return (this.f.hashCode() * 31) + this.g;
    }

    public final String toString() {
        return this.f;
    }
}
