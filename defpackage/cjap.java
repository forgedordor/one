package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.rcs.client.messaging.MessagingOperationResult;
import com.google.android.rcs.client.messaging.RevokeMessageRequest;
import com.google.android.rcs.client.messaging.RevokeMessageResponse;
import com.google.android.rcs.client.messaging.data.Conversation;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjap implements cjaa {
    public final efff a;
    private final asrc b;
    private final eosc c;

    public cjap(efff efffVar, asrc asrcVar, eosc eoscVar) {
        this.a = efffVar;
        this.b = asrcVar;
        this.c = eoscVar;
    }

    public static final augq n(aubl aublVar, evqs evqsVar) {
        augp augpVar = (augp) augq.a.createBuilder();
        augpVar.copyOnWrite();
        augq augqVar = (augq) augpVar.instance;
        aublVar.getClass();
        augqVar.c = aublVar;
        augqVar.b |= 1;
        augpVar.copyOnWrite();
        augq augqVar2 = (augq) augpVar.instance;
        evqsVar.getClass();
        augqVar2.b |= 2;
        augqVar2.d = evqsVar;
        return (augq) augpVar.build();
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ Intent a(Object obj) {
        return new Intent("com.google.android.apps.messaging.messaging_service_revoke_message_response").putExtra("messaging_service_revoke_message_response_extra", ((augo) obj).f.I());
    }

    @Override // defpackage.cjaa
    public final aubl b(Intent intent) {
        return cjcc.a(MessagingOperationResult.f(intent).a());
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ eiju c(Object obj) {
        return this.b.h((augq) obj);
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ eiju d(Object obj) {
        final RevokeMessageRequest revokeMessageRequest = (RevokeMessageRequest) obj;
        return eijx.g(new Callable() { // from class: cjao
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a.revokeMessage(revokeMessageRequest);
            }
        }, this.c);
    }

    @Override // defpackage.cjaa
    public final evqs e(Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("messaging_service_revoke_message_response_extra");
        if (byteArrayExtra != null) {
            return evqs.x(byteArrayExtra);
        }
        throw new IllegalArgumentException("Opaque data is missing from intent");
    }

    @Override // defpackage.cjaa
    public final /* synthetic */ evqs f(Object obj) {
        return ((augo) obj).f;
    }

    @Override // defpackage.cjaa
    public final Optional g(Intent intent) {
        Conversation conversationB = MessagingOperationResult.f(intent).b();
        return conversationB.c() == 2 ? Optional.of(conversationB.b()) : Optional.empty();
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ Object h(aubl aublVar, evqs evqsVar) {
        return n(aublVar, evqsVar);
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ Object i(Object obj, evqs evqsVar) {
        return n(cjcc.a(((RevokeMessageResponse) obj).a()), evqsVar);
    }

    @Override // defpackage.cjaa
    public final /* synthetic */ Object j(aubl aublVar, Intent intent, evqs evqsVar) {
        return n(aublVar, evqsVar);
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ Object k(Object obj, PendingIntent pendingIntent) {
        augo augoVar = (augo) obj;
        efcr efcrVar = new efcr();
        efhi efhiVar = new efhi();
        aubq aubqVar = augoVar.c;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        efhiVar.b(cjbl.b(aubqVar));
        efhiVar.c(augoVar.e);
        aubp aubpVar = aubp.GROUP;
        aubq aubqVar2 = augoVar.c;
        if (aubqVar2 == null) {
            aubqVar2 = aubq.a;
        }
        aubp aubpVarB = aubp.b(aubqVar2.c);
        if (aubpVarB == null) {
            aubpVarB = aubp.UNKNOWN_TYPE;
        }
        efhiVar.d(true == aubpVar.equals(aubpVarB) ? 2 : 1);
        efcrVar.b(efhiVar.a());
        efcrVar.d(augoVar.d);
        efcrVar.c(pendingIntent);
        if (((Boolean) cizt.b.e()).booleanValue()) {
            efcrVar.e(augoVar.f);
        }
        return efcrVar.a();
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ String l(Object obj) {
        return "RcsMessageId: ".concat(String.valueOf(((augo) obj).d));
    }

    @Override // defpackage.cjaa
    public final String m() {
        return "revokeMessage";
    }
}
