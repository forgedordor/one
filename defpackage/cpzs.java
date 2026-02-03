package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpzs {
    private final auml a;
    private final auml b;

    /* JADX WARN: Illegal instructions before constructor call */
    public cpzs() {
        auml aumlVar = auml.UNSPECIFIED_STATUS;
        this(aumlVar, aumlVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpzs)) {
            return false;
        }
        cpzs cpzsVar = (cpzs) obj;
        return this.a == cpzsVar.a && this.b == cpzsVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "FeatureOverlapStatus(multiDeviceStatus=" + this.a + ", backupAndRestoreStatus=" + this.b + ")";
    }

    public cpzs(auml aumlVar, auml aumlVar2) {
        aumlVar.getClass();
        aumlVar2.getClass();
        this.a = aumlVar;
        this.b = aumlVar2;
    }
}
