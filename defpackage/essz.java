package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class essz {
    public final Status a;
    public final int b;

    private essz(int i, Status status) {
        this.b = i;
        this.a = status;
    }

    static essz a(int i, Status status) {
        if (i != 4) {
            i = 5;
        }
        ejwl.l(true);
        status.getClass();
        return new essz(i, status);
    }

    static essz b(int i) {
        ejwl.l(true);
        return new essz(i, null);
    }
}
