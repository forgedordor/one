package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementContentType;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfrp extends dgym {
    private static final dhip a = new dhip("MessageReceivedListener");
    private static final ekhx b = ekhx.r("application/conference-info+xml", GroupManagementContentType.CONTENT_TYPE);
    private final dgzn c;
    private final eosc d;
    private final dfrt e;

    public dfrp(eosc eoscVar, dfrt dfrtVar, dgzn dgznVar) {
        this.d = eoscVar;
        this.c = dgznVar;
        this.e = dfrtVar;
    }

    private static final boolean d(dgyx dgyxVar) {
        String strF = dgyxVar.h;
        if ("message/cpim".equals(strF)) {
            try {
                Optional optionalG = ((efgn) efhe.a(dgyxVar.f)).c.g();
                Optional optionalOf = optionalG.isPresent() ? Optional.of(ContentType.e((String) optionalG.get())) : Optional.empty();
                if (optionalOf.isPresent()) {
                    strF = ((ContentType) optionalOf.get()).f();
                }
            } catch (IOException e) {
                throw new IllegalArgumentException("CPIM message could not be parsed.", e);
            }
        }
        return b.contains(strF);
    }

    @Override // defpackage.dgym, defpackage.dgzd
    public final void c(dgyx dgyxVar) {
        if (d(dgyxVar)) {
            return;
        }
        if (dfpc.d() && d(dgyxVar)) {
            return;
        }
        dfqf dfqfVar = new dfqf();
        dfqfVar.b(dgyxVar);
        dfqfVar.c(this.c);
        ListenableFuture listenableFutureA = this.e.a(dfqfVar.a());
        dhja.l(a.b("handleReceiveMessagebbugle"), "handle received message %s", dgyxVar.k);
        eork.r(listenableFutureA, new dfro(), this.d);
    }
}
