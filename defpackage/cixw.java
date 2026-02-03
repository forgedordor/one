package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.rcs.client.messaging.CreateGroupRequest;
import com.google.android.rcs.client.messaging.CreateGroupResponse;
import com.google.android.rcs.client.messaging.GroupOperationResult;
import com.google.android.rcs.client.messaging.data.Conversation;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cixw implements cjaa {
    public final efff a;
    private final cjbl b;
    private final asrc c;
    private final chwq d;
    private final eosc e;

    public cixw(cjbl cjblVar, efff efffVar, asrc asrcVar, chwq chwqVar, eosc eoscVar) {
        this.b = cjblVar;
        this.a = efffVar;
        this.c = asrcVar;
        this.d = chwqVar;
        this.e = eoscVar;
    }

    public static final auch n(aubl aublVar, evqs evqsVar) {
        return (auch) o(aublVar, evqsVar).build();
    }

    private static aucg o(aubl aublVar, evqs evqsVar) {
        aucg aucgVar = (aucg) auch.a.createBuilder();
        aucgVar.copyOnWrite();
        auch auchVar = (auch) aucgVar.instance;
        aublVar.getClass();
        auchVar.c = aublVar;
        auchVar.b |= 1;
        aucgVar.copyOnWrite();
        auch auchVar2 = (auch) aucgVar.instance;
        evqsVar.getClass();
        auchVar2.b |= 4;
        auchVar2.e = evqsVar;
        enyw enywVar = enyw.RCS_SMAPI;
        aucgVar.copyOnWrite();
        auch auchVar3 = (auch) aucgVar.instance;
        auchVar3.f = enywVar.h;
        auchVar3.b |= 8;
        return aucgVar;
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ Intent a(Object obj) {
        return new Intent("com.google.android.apps.messaging.messaging_service_create_group_response").putExtra("messaging_service_create_group_extra", ((auce) obj).h.I());
    }

    @Override // defpackage.cjaa
    public final aubl b(Intent intent) {
        return cjcc.a(GroupOperationResult.c(intent).a());
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ eiju c(Object obj) {
        return this.c.b((auch) obj);
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ eiju d(Object obj) {
        final CreateGroupRequest createGroupRequest = (CreateGroupRequest) obj;
        return eijx.g(new Callable() { // from class: cixv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.a.createGroup(createGroupRequest);
            }
        }, this.e);
    }

    @Override // defpackage.cjaa
    public final evqs e(Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("messaging_service_create_group_extra");
        if (byteArrayExtra != null) {
            return evqs.x(byteArrayExtra);
        }
        throw new IllegalArgumentException("Opaque data is missing from intent");
    }

    @Override // defpackage.cjaa
    public final /* synthetic */ evqs f(Object obj) {
        return ((auce) obj).h;
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
        return n(cjcc.a(((CreateGroupResponse) obj).a()), evqsVar);
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ Object j(aubl aublVar, Intent intent, evqs evqsVar) {
        aucg aucgVarO = o(aublVar, evqsVar);
        if (((Boolean) ((cczi) atob.a.get()).e()).booleanValue()) {
            aubq aubqVarA = this.b.a(GroupOperationResult.c(intent).b().a(), true);
            aucgVarO.copyOnWrite();
            auch auchVar = (auch) aucgVarO.instance;
            auch auchVar2 = auch.a;
            aubqVarA.getClass();
            auchVar.d = aubqVarA;
            auchVar.b |= 2;
        }
        return (auch) aucgVarO.build();
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ Object k(Object obj, PendingIntent pendingIntent) {
        auce auceVar = (auce) obj;
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        evtg<aubq> evtgVar = auceVar.g;
        ejwl.b(evtgVar.size() >= 2, "CreateGroupChatRequest must include 2 or more remote participants");
        ejwl.b((auceVar.b & 8) != 0, "CreateGroupChatRequest must include sender");
        aubq aubqVar = auceVar.f;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        int iE = this.d.e(Optional.of(aubqVar)) - 1;
        ejwl.d(evtgVar.size() <= iE, "CreateGroupChatRequest must include fewer than %s remote participants", iE);
        for (aubq aubqVar2 : evtgVar) {
            aubp aubpVarB = aubp.b(aubqVar2.c);
            if (aubpVarB == null) {
                aubpVarB = aubp.UNKNOWN_TYPE;
            }
            ejwl.b(aubpVarB == aubp.PHONE, "CreateGroupChatRequest must only include remote participants of type PHONE");
            ekfwVar.h(cjbl.b(aubqVar2));
        }
        efbr efbrVar = new efbr();
        efbrVar.b(auceVar.c);
        efbrVar.f(auceVar.d);
        efbrVar.d(ekfwVar.g());
        efbrVar.c(pendingIntent);
        if (((Boolean) cizt.b.e()).booleanValue()) {
            efbrVar.e(auceVar.h);
        }
        return efbrVar.a();
    }

    @Override // defpackage.cjaa
    public final /* bridge */ /* synthetic */ String l(Object obj) {
        return "RcsConversationId: ".concat(String.valueOf(((auce) obj).c));
    }

    @Override // defpackage.cjaa
    public final String m() {
        return "createGroup";
    }
}
