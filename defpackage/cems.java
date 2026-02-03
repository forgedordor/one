package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cems {
    public static final ekrz a = new ekrz("tachyon_grpc_status_code", Status.Code.class, false, false);
    public static final fbrb b;

    static {
        cemr cemrVar = new cemr();
        int i = fbrb.d;
        b = new fbqy("google.internal.communications.instantmessaging.v1.tachyonerror-bin", cemrVar);
    }

    public static Status.Code a(Throwable th) {
        Status statusC = Status.c(th);
        return statusC == null ? Status.Code.UNKNOWN : statusC.getCode();
    }

    public static felx b(Throwable th) {
        fbrg fbrgVarA = Status.a(th);
        if (fbrgVarA == null) {
            return felx.UNKNOWN;
        }
        ezqf ezqfVar = (ezqf) fbrgVarA.c(b);
        if (ezqfVar != null) {
            int i = ezqfVar.b;
            felx felxVarB = felx.b(i);
            if (felxVarB == null) {
                felxVarB = felx.UNRECOGNIZED;
            }
            felx felxVar = felx.UNRECOGNIZED;
            if (felxVarB != felxVar) {
                felx felxVarB2 = felx.b(i);
                return felxVarB2 == null ? felxVar : felxVarB2;
            }
        }
        return felx.UNKNOWN;
    }

    public static boolean c(Status.Code code) {
        Status.Code code2 = Status.Code.OK;
        int iOrdinal = code.ordinal();
        return iOrdinal == 1 || iOrdinal == 4 || iOrdinal == 8 || iOrdinal == 10 || iOrdinal == 13 || iOrdinal == 14;
    }

    public static boolean d(Throwable th) {
        return c(a(th));
    }
}
