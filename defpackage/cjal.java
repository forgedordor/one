package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.rcs.client.messaging.GroupOperationResult;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupResponse;
import com.google.android.rcs.client.messaging.data.Conversation;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjal implements cjaa {
    public final efff a;
    private final asrc b;
    private final eosc c;

    public cjal(efff efffVar, asrc asrcVar, eosc eoscVar) {
        this.a = efffVar;
        this.b = asrcVar;
        this.c = eoscVar;
    }

    public static final augk n(aubl aublVar, evqs evqsVar) {
        augj augjVar = (augj) augk.a.createBuilder();
        augjVar.copyOnWrite();
        augk augkVar = (augk) augjVar.instance;
        aublVar.getClass();
        augkVar.c = aublVar;
        augkVar.b |= 1;
        augjVar.copyOnWrite();
        augk augkVar2 = (augk) augjVar.instance;
        evqsVar.getClass();
        augkVar2.b |= 2;
        augkVar2.d = evqsVar;
        return (augk) augjVar.build();
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ Intent a(Object obj) {
        return new Intent("com.google.android.apps.messaging.messaging_service_remove_user_from_group_response").putExtra("messaging_service_remove_user_from_group_extra", ((augi) obj).e.I());
    }

    @Override // defpackage.cjaa
    public final aubl b(Intent intent) {
        return cjcc.a(GroupOperationResult.c(intent).a());
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ eiju c(Object obj) {
        return this.b.g((augk) obj);
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ eiju d(Object obj) {
        final RemoveUserFromGroupRequest removeUserFromGroupRequest = (RemoveUserFromGroupRequest) obj;
        return eijx.g(new Callable() { // from class: cjak
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a.removeUserFromGroup(removeUserFromGroupRequest);
            }
        }, this.c);
    }

    @Override // defpackage.cjaa
    public final evqs e(Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("messaging_service_remove_user_from_group_extra");
        if (byteArrayExtra != null) {
            return evqs.x(byteArrayExtra);
        }
        throw new IllegalArgumentException("Opaque data is missing from intent");
    }

    @Override // defpackage.cjaa
    public final /* synthetic */ evqs f(Object obj) {
        return ((augi) obj).e;
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
        return n(cjcc.a(((RemoveUserFromGroupResponse) obj).a()), evqsVar);
    }

    @Override // defpackage.cjaa
    public final /* synthetic */ Object j(aubl aublVar, Intent intent, evqs evqsVar) {
        return n(aublVar, evqsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ Object k(Object obj, PendingIntent pendingIntent) {
        augi augiVar = (augi) obj;
        ejwl.b(augiVar.d.size() == 1, "RemoveUserFromGroupRequest must add exactly 1 user");
        aubp aubpVarB = aubp.b(((aubq) augiVar.d.get(0)).c);
        if (aubpVarB == null) {
            aubpVarB = aubp.UNKNOWN_TYPE;
        }
        ejwl.b(aubpVarB == aubp.PHONE, "RemoveUserFromGroupRequest must add a ChatEndpoint of type PHONE");
        efcp efcpVar = new efcp();
        efhi efhiVar = new efhi();
        audu auduVar = augiVar.c;
        if (auduVar == null) {
            auduVar = audu.a;
        }
        aubq aubqVar = auduVar.d;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        efhiVar.b(cjbl.b(aubqVar));
        audu auduVar2 = augiVar.c;
        if (auduVar2 == null) {
            auduVar2 = audu.a;
        }
        efhiVar.c(auduVar2.c);
        efhiVar.d(2);
        efcpVar.b(efhiVar.a());
        efcpVar.e(cjbl.b((aubq) augiVar.d.get(0)));
        efcpVar.c(pendingIntent);
        if (((Boolean) cizt.b.e()).booleanValue()) {
            efcpVar.d(augiVar.e);
        }
        return efcpVar.a();
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ String l(Object obj) {
        audu auduVar = ((augi) obj).c;
        if (auduVar == null) {
            auduVar = audu.a;
        }
        return "RcsConversationId: ".concat(String.valueOf(auduVar.c));
    }

    @Override // defpackage.cjaa
    public final String m() {
        return "removeUserFromGroup";
    }
}
