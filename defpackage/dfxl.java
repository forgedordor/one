package defpackage;

import android.content.Context;
import com.google.android.rcs.client.messaging.SendMessageRequest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfxl {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;

    public dfxl(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
        this.e = fcsuVar5;
        this.f = fcsuVar6;
        this.g = fcsuVar7;
        this.h = fcsuVar8;
    }

    public final dfxk a(SendMessageRequest sendMessageRequest) {
        sendMessageRequest.getClass();
        return new dfxk(sendMessageRequest, (Context) this.a.b(), (efpp) this.b.b(), (efqv) this.c.b(), this.d, (eosc) this.e.b(), (deza) this.f.b(), (dfux) this.g.b(), (efqt) this.h.b());
    }
}
