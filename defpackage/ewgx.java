package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum ewgx implements evst {
    IMS_EXCEPTION_CODE_ERROR_UNSPECIFIED(0),
    IMS_EXCEPTION_CODE_ERROR_SERVICE_UNAVAILABLE(1),
    IMS_EXCEPTION_CODE_ERROR_UNSUPPORTED_OPERATION(2),
    IMS_EXCEPTION_CODE_ERROR_INVALID_SUBSCRIPTION(3);

    public final int e;

    ewgx(int i) {
        this.e = i;
    }

    public static ewgx b(int i) {
        if (i == 0) {
            return IMS_EXCEPTION_CODE_ERROR_UNSPECIFIED;
        }
        if (i == 1) {
            return IMS_EXCEPTION_CODE_ERROR_SERVICE_UNAVAILABLE;
        }
        if (i == 2) {
            return IMS_EXCEPTION_CODE_ERROR_UNSUPPORTED_OPERATION;
        }
        if (i != 3) {
            return null;
        }
        return IMS_EXCEPTION_CODE_ERROR_INVALID_SUBSCRIPTION;
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
