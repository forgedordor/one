package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chom {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;

    public chom(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
        fcsuVar3.getClass();
        this.c = fcsuVar3;
    }

    public final chol a(ResolvedRecipient resolvedRecipient, chpk chpkVar) {
        chot chotVar = (chot) this.b.b();
        chotVar.getClass();
        resolvedRecipient.getClass();
        return new chol(this.a, chotVar, this.c, resolvedRecipient, chpkVar);
    }
}
