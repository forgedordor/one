package defpackage;

import android.os.Handler;
import android.os.Looper;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvxm {
    public final Handler a = new Handler(Looper.getMainLooper());

    public static boolean a(Status status) {
        if (status == null) {
            return false;
        }
        Status.Code code = Status.Code.OK;
        int iOrdinal = status.getCode().ordinal();
        return iOrdinal == 1 || iOrdinal == 4 || iOrdinal == 8 || iOrdinal == 10 || iOrdinal == 13 || iOrdinal == 14;
    }
}
