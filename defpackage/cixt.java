package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.rcs.client.messaging.AddUserToGroupRequest;
import com.google.android.rcs.client.messaging.AddUserToGroupResponse;
import com.google.android.rcs.client.messaging.GroupOperationResult;
import com.google.android.rcs.client.messaging.data.Conversation;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cixt implements cjaa {
    public final efff a;
    private final asrc b;
    private final eosc c;

    public cixt(efff efffVar, asrc asrcVar, eosc eoscVar) {
        this.a = efffVar;
        this.b = asrcVar;
        this.c = eoscVar;
    }

    public static final aubf n(aubl aublVar, evqs evqsVar) {
        aube aubeVar = (aube) aubf.a.createBuilder();
        aubeVar.copyOnWrite();
        aubf aubfVar = (aubf) aubeVar.instance;
        aublVar.getClass();
        aubfVar.c = aublVar;
        aubfVar.b |= 1;
        aubeVar.copyOnWrite();
        aubf aubfVar2 = (aubf) aubeVar.instance;
        evqsVar.getClass();
        aubfVar2.b |= 2;
        aubfVar2.d = evqsVar;
        return (aubf) aubeVar.build();
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ Intent a(Object obj) {
        return new Intent("com.google.android.apps.messaging.messaging_service_add_user_to_group_response").putExtra("messaging_service_add_user_to_group_extra", ((aubd) obj).e.I());
    }

    @Override // defpackage.cjaa
    public final aubl b(Intent intent) {
        return cjcc.a(GroupOperationResult.c(intent).a());
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ eiju c(Object obj) {
        return this.b.a((aubf) obj);
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ eiju d(Object obj) {
        final AddUserToGroupRequest addUserToGroupRequest = (AddUserToGroupRequest) obj;
        return eijx.g(new Callable() { // from class: cixs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a.addUserToGroup(addUserToGroupRequest);
            }
        }, this.c);
    }

    @Override // defpackage.cjaa
    public final evqs e(Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("messaging_service_add_user_to_group_extra");
        if (byteArrayExtra != null) {
            return evqs.x(byteArrayExtra);
        }
        throw new IllegalArgumentException("Opaque data is missing from intent");
    }

    @Override // defpackage.cjaa
    public final /* synthetic */ evqs f(Object obj) {
        return ((aubd) obj).e;
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
        return n(cjcc.a(((AddUserToGroupResponse) obj).a()), evqsVar);
    }

    @Override // defpackage.cjaa
    public final /* synthetic */ Object j(aubl aublVar, Intent intent, evqs evqsVar) {
        return n(aublVar, evqsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ Object k(Object obj, PendingIntent pendingIntent) {
        aubd aubdVar = (aubd) obj;
        ejwl.b(aubdVar.d.size() == 1, "AddUserToGroupRequest must add exactly 1 user");
        aubp aubpVarB = aubp.b(((aubq) aubdVar.d.get(0)).c);
        if (aubpVarB == null) {
            aubpVarB = aubp.UNKNOWN_TYPE;
        }
        ejwl.b(aubpVarB == aubp.PHONE, "AddUserToGroupRequest must add a ChatEndpoint of type PHONE");
        efbl efblVar = new efbl();
        efhi efhiVar = new efhi();
        audu auduVar = aubdVar.c;
        if (auduVar == null) {
            auduVar = audu.a;
        }
        aubq aubqVar = auduVar.d;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        efhiVar.b(cjbl.b(aubqVar));
        audu auduVar2 = aubdVar.c;
        if (auduVar2 == null) {
            auduVar2 = audu.a;
        }
        efhiVar.c(auduVar2.c);
        efhiVar.d(2);
        efblVar.b(efhiVar.a());
        efblVar.e(cjbl.b((aubq) aubdVar.d.get(0)));
        efblVar.c(pendingIntent);
        if (((Boolean) cizt.b.e()).booleanValue()) {
            efblVar.d(aubdVar.e);
        }
        return efblVar.a();
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ String l(Object obj) {
        audu auduVar = ((aubd) obj).c;
        if (auduVar == null) {
            auduVar = audu.a;
        }
        return "RcsConversationId: ".concat(String.valueOf(auduVar.c));
    }

    @Override // defpackage.cjaa
    public final String m() {
        return "addUserToGroup";
    }
}
