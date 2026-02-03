package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzox extends dzpp {
    public final dzfh a;
    public final boolean b;
    private final String c;

    public dzox(String str, dzfh dzfhVar, boolean z) {
        this.c = str;
        this.a = dzfhVar;
        this.b = z;
    }

    @Override // defpackage.dzpp
    public final dzfh a() {
        return this.a;
    }

    @Override // defpackage.dzpp
    public final String b() {
        return this.c;
    }

    @Override // defpackage.dzpp
    public final boolean c() {
        return this.b;
    }

    public final String toString() {
        return "MeasurementKey{rawStringEventName=" + this.c + ", noPiiEventName=" + String.valueOf(this.a) + ", isActivity=" + this.b + "}";
    }
}
