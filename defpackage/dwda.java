package defpackage;

import android.content.Context;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwda {
    static final fbrb a;
    private static dwda b;

    static {
        dwcz dwczVar = new dwcz();
        int i = fbrb.d;
        a = new fbqy("google.internal.communications.instantmessaging.v1.tachyonerror-bin", dwczVar);
        b = null;
    }

    public static dwda b() {
        if (b == null) {
            b = new dwda();
        }
        return b;
    }

    public final int a(Context context, Throwable th) {
        if (!dvjv.a(context)) {
            return 6;
        }
        if (th.getCause() instanceof dbmi) {
            return 7;
        }
        return th instanceof dwcp ? 8 : 9;
    }

    public final felx c(Throwable th) {
        fbrg fbrgVarA = Status.a(th);
        if (fbrgVarA == null) {
            return felx.UNKNOWN;
        }
        ezqf ezqfVar = (ezqf) fbrgVarA.c(a);
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
}
