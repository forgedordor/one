package defpackage;

import com.google.media.webrtc.common.StatusOr;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwlb {
    public static Object a(StatusOr statusOr) {
        if (statusOr.hasValue) {
            return statusOr.value;
        }
        throw new fbtf(statusOr.status);
    }

    public static void b(Status status) {
        if (!status.f()) {
            throw new fbtf(status);
        }
    }
}
