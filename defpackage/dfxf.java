package defpackage;

import android.content.Context;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfxf {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;

    public dfxf(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
        this.e = fcsuVar5;
    }

    public final dfxe a(RemoveUserFromGroupRequest removeUserFromGroupRequest) {
        removeUserFromGroupRequest.getClass();
        return new dfxe(removeUserFromGroupRequest, (Context) this.a.b(), (efpp) this.b.b(), (efqv) this.c.b(), this.d, (eosc) this.e.b());
    }
}
