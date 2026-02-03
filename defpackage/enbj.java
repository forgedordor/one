package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum enbj implements evst {
    MLS_EXTENSION_ERROR_UNKNOWN(0),
    MLS_EXTENSION_ERROR_EXTENSION_SERIALIZATION_ERROR(1),
    MLS_EXTENSION_ERROR_EXTENSION_DESERIALIZATION_ERROR(2),
    MLS_EXTENSION_ERROR_EXTENSION_INCORRECT_TYPE(3);

    public final int e;

    enbj(int i) {
        this.e = i;
    }

    @Override // defpackage.evst
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
