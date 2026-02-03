package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum drtz implements evst {
    DEFAULT(0),
    PHENOTYPE(1),
    MANAGED_CONFIG(2),
    OEM(3),
    OVERRIDE(4),
    HERMETRIC_OVERRIDE(5);

    public final int g;

    drtz(int i) {
        this.g = i;
    }

    @Override // defpackage.evst
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
