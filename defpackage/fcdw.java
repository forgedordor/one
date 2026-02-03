package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum fcdw {
    NO_ERROR(0, Status.p),
    PROTOCOL_ERROR(1, Status.o),
    INTERNAL_ERROR(2, Status.o),
    FLOW_CONTROL_ERROR(3, Status.o),
    SETTINGS_TIMEOUT(4, Status.o),
    STREAM_CLOSED(5, Status.o),
    FRAME_SIZE_ERROR(6, Status.o),
    REFUSED_STREAM(7, Status.p),
    CANCEL(8, Status.c),
    COMPRESSION_ERROR(9, Status.o),
    CONNECT_ERROR(10, Status.o),
    ENHANCE_YOUR_CALM(11, Status.k.withDescription("Bandwidth exhausted")),
    INADEQUATE_SECURITY(12, Status.i.withDescription("Permission denied as protocol is not secure enough to call")),
    HTTP_1_1_REQUIRED(13, Status.d);

    public static final fcdw[] o;
    public final Status p;
    private final int r;

    static {
        fcdw[] fcdwVarArrValues = values();
        fcdw[] fcdwVarArr = new fcdw[((int) fcdwVarArrValues[fcdwVarArrValues.length - 1].a()) + 1];
        for (fcdw fcdwVar : fcdwVarArrValues) {
            fcdwVarArr[(int) fcdwVar.a()] = fcdwVar;
        }
        o = fcdwVarArr;
    }

    fcdw(int i, Status status) {
        this.r = i;
        String strConcat = "HTTP/2 error code: ".concat(String.valueOf(name()));
        if (status.getDescription() != null) {
            strConcat = strConcat + " (" + status.getDescription() + ")";
        }
        this.p = status.withDescription(strConcat);
    }

    public final long a() {
        return this.r;
    }
}
