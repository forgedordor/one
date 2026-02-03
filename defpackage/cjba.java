package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.rcs.client.messaging.GroupOperationResult;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationRequest;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationResponse;
import com.google.android.rcs.client.messaging.data.Conversation;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjba implements cjaa {
    public final efff a;
    private final asrc b;
    private final eosc c;

    public cjba(efff efffVar, asrc asrcVar, eosc eoscVar) {
        this.a = efffVar;
        this.b = asrcVar;
        this.c = eoscVar;
    }

    public static final auik n(aubl aublVar, evqs evqsVar) {
        auij auijVar = (auij) auik.a.createBuilder();
        auijVar.copyOnWrite();
        auik auikVar = (auik) auijVar.instance;
        aublVar.getClass();
        auikVar.c = aublVar;
        auikVar.b |= 1;
        auijVar.copyOnWrite();
        auik auikVar2 = (auik) auijVar.instance;
        evqsVar.getClass();
        auikVar2.b |= 2;
        auikVar2.d = evqsVar;
        return (auik) auijVar.build();
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ Intent a(Object obj) {
        return new Intent("com.google.android.apps.messaging.messaging_service_trigger_group_notification_response").putExtra("messaging_service_trigger_group_notification_extra", ((auii) obj).d.I());
    }

    @Override // defpackage.cjaa
    public final aubl b(Intent intent) {
        return cjcc.a(GroupOperationResult.c(intent).a());
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ eiju c(Object obj) {
        return this.b.j((auik) obj);
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ eiju d(Object obj) {
        final TriggerGroupNotificationRequest triggerGroupNotificationRequest = (TriggerGroupNotificationRequest) obj;
        return eijx.g(new Callable() { // from class: cjaz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a.triggerGroupNotification(triggerGroupNotificationRequest);
            }
        }, this.c);
    }

    @Override // defpackage.cjaa
    public final evqs e(Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("messaging_service_trigger_group_notification_extra");
        if (byteArrayExtra != null) {
            return evqs.x(byteArrayExtra);
        }
        throw new IllegalArgumentException("Opaque data is missing from intent");
    }

    @Override // defpackage.cjaa
    public final /* synthetic */ evqs f(Object obj) {
        return ((auii) obj).d;
    }

    @Override // defpackage.cjaa
    public final Optional g(Intent intent) {
        Conversation conversationB = GroupOperationResult.c(intent).b();
        return conversationB.c() == 2 ? Optional.of(conversationB.b()) : Optional.empty();
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ Object h(aubl aublVar, evqs evqsVar) {
        return n(aublVar, evqsVar);
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ Object i(Object obj, evqs evqsVar) {
        return n(cjcc.a(((TriggerGroupNotificationResponse) obj).a()), evqsVar);
    }

    @Override // defpackage.cjaa
    public final /* synthetic */ Object j(aubl aublVar, Intent intent, evqs evqsVar) {
        return n(aublVar, evqsVar);
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ Object k(Object obj, PendingIntent pendingIntent) {
        auii auiiVar = (auii) obj;
        efcy efcyVar = new efcy();
        efhi efhiVar = new efhi();
        audu auduVar = auiiVar.c;
        if (auduVar == null) {
            auduVar = audu.a;
        }
        aubq aubqVar = auduVar.d;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        efhiVar.b(cjbl.b(aubqVar));
        audu auduVar2 = auiiVar.c;
        if (auduVar2 == null) {
            auduVar2 = audu.a;
        }
        efhiVar.c(auduVar2.c);
        efhiVar.d(2);
        efcyVar.b(efhiVar.a());
        efcyVar.c(pendingIntent);
        if (((Boolean) cizt.b.e()).booleanValue()) {
            efcyVar.d(auiiVar.d);
        }
        return efcyVar.a();
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ String l(Object obj) {
        audu auduVar = ((auii) obj).c;
        if (auduVar == null) {
            auduVar = audu.a;
        }
        return "RcsConversationId: ".concat(String.valueOf(auduVar.c));
    }

    @Override // defpackage.cjaa
    public final String m() {
        return "triggerGroupNotification";
    }
}
