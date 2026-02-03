package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ewnp implements evsv {
    static final evsv a = new ewnp();

    private ewnp() {
    }

    @Override // defpackage.evsv
    public final boolean a(int i) {
        ewnq ewnqVar;
        switch (i) {
            case 0:
                ewnqVar = ewnq.SOCKET_FAILURE_UNKNOWN;
                break;
            case 1:
                ewnqVar = ewnq.SOCKET_FAILURE_UNABLE_TO_OPEN;
                break;
            case 2:
                ewnqVar = ewnq.SOCKET_FAILURE_READ_TIMEOUT;
                break;
            case 3:
                ewnqVar = ewnq.SOCKET_FAILURE_WRITE_TIMEOUT;
                break;
            case 4:
                ewnqVar = ewnq.SOCKET_FAILURE_HOST_VERIFICATION_FAILED;
                break;
            case 5:
                ewnqVar = ewnq.SOCKET_FAILURE_READ_ERROR;
                break;
            case 6:
                ewnqVar = ewnq.SOCKET_FAILURE_WRITE_ERROR;
                break;
            case 7:
                ewnqVar = ewnq.SOCKET_FAILURE_UNABLE_TO_CLOSE;
                break;
            case 8:
                ewnqVar = ewnq.SOCKET_FAILURE_TLS_HANDSHAKE_FAILED;
                break;
            default:
                ewnqVar = null;
                break;
        }
        return ewnqVar != null;
    }
}
