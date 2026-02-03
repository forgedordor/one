package defpackage;

import io.grpc.Status;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fboi {
    public static fbsl a(fbog fbogVar, fbsm fbsmVar, fbrg fbrgVar, fbsn fbsnVar) {
        fbog fbogVarA = fbogVar.a();
        try {
            return new fboh(fbsnVar.a(fbsmVar, fbrgVar), fbogVar);
        } finally {
            fbogVar.f(fbogVarA);
        }
    }

    public static Status b(fbog fbogVar) {
        fbogVar.getClass();
        if (!fbogVar.i()) {
            return null;
        }
        Throwable thC = fbogVar.c();
        if (thC == null) {
            return Status.c.withDescription("io.grpc.Context was cancelled without error");
        }
        if (thC instanceof TimeoutException) {
            return Status.f.withDescription(thC.getMessage()).d(thC);
        }
        Status statusC = Status.c(thC);
        return (Status.Code.UNKNOWN.equals(statusC.getCode()) && statusC.t == thC) ? Status.c.withDescription("Context cancelled").d(thC) : statusC.d(thC);
    }
}
