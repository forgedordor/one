package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
class eqcf implements ejvr {
    @Override // defpackage.ejvr
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        eqcp eqcpVar = (eqcp) obj;
        switch (eqcpVar.ordinal()) {
            case 0:
                return exzj.TACHYGRAM_ERROR_CANCELLED;
            case 1:
                return exzj.TACHYGRAM_ERROR_UNKNOWN;
            case 2:
                return exzj.TACHYGRAM_ERROR_INVALID_ARGUMENT;
            case 3:
                return exzj.TACHYGRAM_ERROR_DEADLINE_EXCEEDED;
            case 4:
                return exzj.TACHYGRAM_ERROR_NOT_FOUND;
            case 5:
                return exzj.TACHYGRAM_ERROR_ALREADY_EXISTS;
            case 6:
                return exzj.TACHYGRAM_ERROR_PERMISSION_DENIED;
            case 7:
                return exzj.TACHYGRAM_ERROR_RESOURCE_EXHAUSTED;
            case 8:
                return exzj.TACHYGRAM_ERROR_FAILED_PRECONDITION;
            case 9:
                return exzj.TACHYGRAM_ERROR_ABORTED;
            case 10:
                return exzj.TACHYGRAM_ERROR_OUT_OF_RANGE;
            case 11:
                return exzj.TACHYGRAM_ERROR_UNIMPLEMENTED;
            case 12:
                return exzj.TACHYGRAM_ERROR_INTERNAL;
            case 13:
                return exzj.TACHYGRAM_ERROR_UNAVAILABLE;
            case 14:
                return exzj.TACHYGRAM_ERROR_DATA_LOSS;
            case 15:
                return exzj.TACHYGRAM_ERROR_UNAUTHENTICATED;
            case 16:
                return exzj.TACHYGRAM_ERROR_TACHYGRAM_INTERNAL;
            case 17:
                return exzj.TACHYGRAM_ERROR_TACHYGRAM_EXTERNAL;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(eqcpVar))));
        }
    }
}
