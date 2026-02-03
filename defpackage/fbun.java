package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbun extends fbur {
    @Override // defpackage.fbur
    public final Status a(int i) {
        return i == fbuq.a ? Status.b : Status.i.withDescription("Rejected by (internal-only) security policy");
    }
}
