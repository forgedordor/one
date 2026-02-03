package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.rcs.client.messaging.GroupOperationResult;
import com.google.android.rcs.client.messaging.UpdateGroupRequest;
import com.google.android.rcs.client.messaging.UpdateGroupResponse;
import com.google.android.rcs.client.messaging.data.Conversation;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjbd implements cjaa {
    public final efff a;
    private final asrc b;
    private final eosc c;

    public cjbd(efff efffVar, asrc asrcVar, eosc eoscVar) {
        this.a = efffVar;
        this.b = asrcVar;
        this.c = eoscVar;
    }

    public static final auis n(aubl aublVar, evqs evqsVar) {
        auir auirVar = (auir) auis.a.createBuilder();
        auirVar.copyOnWrite();
        auis auisVar = (auis) auirVar.instance;
        aublVar.getClass();
        auisVar.c = aublVar;
        auisVar.b |= 1;
        auirVar.copyOnWrite();
        auis auisVar2 = (auis) auirVar.instance;
        evqsVar.getClass();
        auisVar2.b |= 2;
        auisVar2.d = evqsVar;
        return (auis) auirVar.build();
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ Intent a(Object obj) {
        return new Intent("com.google.android.apps.messaging.messaging_service_update_group_response").putExtra("messaging_service_update_group_extra", ((auip) obj).e.I());
    }

    @Override // defpackage.cjaa
    public final aubl b(Intent intent) {
        return cjcc.a(GroupOperationResult.c(intent).a());
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ eiju c(Object obj) {
        return this.b.k((auis) obj);
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ eiju d(Object obj) {
        final UpdateGroupRequest updateGroupRequest = (UpdateGroupRequest) obj;
        return eijx.g(new Callable() { // from class: cjbc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a.updateGroup(updateGroupRequest);
            }
        }, this.c);
    }

    @Override // defpackage.cjaa
    public final evqs e(Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("messaging_service_update_group_extra");
        if (byteArrayExtra != null) {
            return evqs.x(byteArrayExtra);
        }
        throw new IllegalArgumentException("Opaque data is missing from intent");
    }

    @Override // defpackage.cjaa
    public final /* synthetic */ evqs f(Object obj) {
        return ((auip) obj).e;
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
        return n(cjcc.a(((UpdateGroupResponse) obj).a()), evqsVar);
    }

    @Override // defpackage.cjaa
    public final /* synthetic */ Object j(aubl aublVar, Intent intent, evqs evqsVar) {
        return n(aublVar, evqsVar);
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ Object k(Object obj, PendingIntent pendingIntent) {
        auip auipVar = (auip) obj;
        efda efdaVar = new efda();
        efhi efhiVar = new efhi();
        audu auduVar = auipVar.c;
        if (auduVar == null) {
            auduVar = audu.a;
        }
        aubq aubqVar = auduVar.d;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        efhiVar.b(cjbl.b(aubqVar));
        audu auduVar2 = auipVar.c;
        if (auduVar2 == null) {
            auduVar2 = audu.a;
        }
        efhiVar.c(auduVar2.c);
        efhiVar.d(2);
        efdaVar.b(efhiVar.a());
        efdaVar.c(pendingIntent);
        efdaVar.e(auipVar.d);
        if (((Boolean) cizt.b.e()).booleanValue()) {
            efdaVar.d(auipVar.e);
        }
        return efdaVar.a();
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ String l(Object obj) {
        audu auduVar = ((auip) obj).c;
        if (auduVar == null) {
            auduVar = audu.a;
        }
        return "RcsConversationId: ".concat(String.valueOf(auduVar.c));
    }

    @Override // defpackage.cjaa
    public final String m() {
        return "updateGroup";
    }
}
