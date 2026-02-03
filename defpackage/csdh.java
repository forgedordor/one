package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
class csdh implements ejvr {
    @Override // defpackage.ejvr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final eofg apply(Status.Code code) {
        Status.Code code2 = Status.Code.OK;
        switch (code.ordinal()) {
            case 1:
                return eofg.RPC_CANCELLED;
            case 2:
                return eofg.RPC_UNKNOWN;
            case 3:
                return eofg.RPC_INVALID_ARGUMENT;
            case 4:
                return eofg.RPC_DEADLINE_EXCEEDED;
            case 5:
                return eofg.RPC_NOT_FOUND;
            case 6:
                return eofg.RPC_ALREADY_EXISTS;
            case 7:
                return eofg.RPC_PERMISSION_DENIED;
            case 8:
                return eofg.RPC_RESOURCE_EXHAUSTED;
            case 9:
                return eofg.RPC_FAILED_PRECONDITION;
            case 10:
                return eofg.RPC_ABORTED;
            case 11:
                return eofg.RPC_OUT_OF_RANGE;
            case 12:
                return eofg.RPC_UNIMPLEMENTED;
            case 13:
                return eofg.RPC_INTERNAL;
            case 14:
                return eofg.RPC_UNAVAILABLE;
            case 15:
                return eofg.RPC_DATA_LOSS;
            case 16:
                return eofg.RPC_UNAUTHENTICATED;
            default:
                return b(code);
        }
    }

    public eofg b(Status.Code code) {
        throw null;
    }
}
