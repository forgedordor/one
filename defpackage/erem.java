package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erem extends eqst {
    private final String a;
    private final ermy b;

    public erem(String str, ermy ermyVar) {
        this.a = str;
        this.b = ermyVar;
    }

    @Override // defpackage.eqst
    public final boolean a() {
        return this.b != ermy.RAW;
    }

    public final String toString() {
        String str = this.a;
        int iOrdinal = this.b.ordinal();
        return String.format("(typeUrl=%s, outputPrefixType=%s)", str, iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK");
    }
}
