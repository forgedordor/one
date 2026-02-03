package defpackage;

import android.content.Intent;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import com.google.android.ims.util.common.RcsIntents;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciyr implements cjad {
    private final fcsu c;
    private final fcsu d;
    private final cjbf e;
    private final atau f;
    private static final cqce b = cqce.g("BugleRcs", "GetMessagesMethod");
    public static final cczv a = cdag.h(cdag.b, "enable_get_single_message_strategy", true);

    public ciyr(fcsu fcsuVar, fcsu fcsuVar2, atau atauVar, cjbf cjbfVar) {
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.f = atauVar;
        this.e = cjbfVar;
    }

    @Override // defpackage.cjad
    public final eiju a(Intent intent) {
        auib auibVar;
        ejwl.a("com.google.android.apps.messaging.shared.messaging.incoming_chat_message_action".equals(intent.getAction()));
        String stringExtra = intent.getStringExtra(RcsIntents.EXTRA_TRACE_ID);
        if (ejwk.c(stringExtra)) {
            auibVar = (auib) this.f.fM(cqdr.a());
        } else {
            auia auiaVar = (auia) auib.a.createBuilder();
            auiaVar.copyOnWrite();
            auib auibVar2 = (auib) auiaVar.instance;
            stringExtra.getClass();
            auibVar2.b |= 1;
            auibVar2.c = stringExtra;
            auibVar = (auib) auiaVar.build();
        }
        if (((Boolean) ((cczi) cjbf.e.get()).e()).booleanValue()) {
            this.e.c(auibVar, basd.a(intent.getStringExtra(RcsIntents.EXTRA_MESSAGE_ID)), 5, 18);
        }
        cqbd cqbdVarA = b.a();
        cqbdVarA.I("GetMessagesMethod.processIntent");
        cqbdVarA.A(GroupManagementRequest.ACTION_TAG, intent.getAction());
        cqbdVarA.r();
        return c().a(auibVar);
    }

    @Override // defpackage.cjad
    public final String b() {
        return "Bugle.MessagingService.Intent.IncomingChatMessage.Latency";
    }

    public final ciys c() {
        return ((Boolean) a.e()).booleanValue() ? (ciys) this.d.b() : (ciys) this.c.b();
    }
}
