package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum quu {
    JSON(".json"),
    ZIP(".zip");

    public final String c;

    quu(String str) {
        this.c = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.c;
    }
}
