package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpzi {
    public static final boolean a(Status status) {
        status.getClass();
        switch (status.getCode()) {
            case OK:
            case UNKNOWN:
            case INVALID_ARGUMENT:
            case NOT_FOUND:
            case ALREADY_EXISTS:
            case PERMISSION_DENIED:
            case FAILED_PRECONDITION:
            case OUT_OF_RANGE:
            case UNIMPLEMENTED:
            case DATA_LOSS:
            case UNAUTHENTICATED:
                return false;
            case CANCELLED:
            case DEADLINE_EXCEEDED:
            case RESOURCE_EXHAUSTED:
            case ABORTED:
            case INTERNAL:
            case UNAVAILABLE:
                return true;
            default:
                throw new fctg();
        }
    }

    public static final boolean b(Status status) {
        status.getClass();
        int iOrdinal = status.getCode().ordinal();
        return iOrdinal == 4 || iOrdinal == 8 || iOrdinal == 14;
    }
}
