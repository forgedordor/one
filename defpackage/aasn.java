package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum aasn {
    DIGIT(0),
    URL(1),
    EMAIL(2);

    public final int d;

    aasn(int i) {
        this.d = i;
    }

    public static aasn a(int i) {
        for (aasn aasnVar : values()) {
            if (aasnVar.d == i) {
                return aasnVar;
            }
        }
        throw new IllegalArgumentException();
    }
}
