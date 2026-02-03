package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class basi extends basf {
    public static final basi a = new basi(null);

    private basi(String str) {
        super(str);
    }

    public static basi a(String str) {
        return str == null ? a : new basi(str);
    }

    public final String toString() {
        return "FeatureNameType: ".concat(String.valueOf(this.b));
    }
}
