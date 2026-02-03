package defpackage;

import android.content.Intent;
import com.google.android.ims.util.common.RcsIntents;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjay implements cjad {
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/shared/rcs/messaging/SendMessageMethod");
    public final cjab a;
    public final cjbf b;
    private final eosc d;

    public cjay(cjab cjabVar, cjbf cjbfVar, eosc eoscVar) {
        this.a = cjabVar;
        this.b = cjbfVar;
        this.d = eoscVar;
    }

    @Override // defpackage.cjad
    public final eiju a(final Intent intent) {
        ejwl.a("com.google.android.apps.messaging.messaging_service_send_message_response".equals(intent.getAction()));
        ((ekrd) ((ekrd) c.h()).h("com/google/android/apps/messaging/shared/rcs/messaging/SendMessageMethod", "processIntent", 106, "SendMessageMethod.java")).t("SendMessageMethod received intent: %s", intent.getAction());
        Optional optionalOfNullable = Optional.ofNullable(intent.getStringExtra(RcsIntents.EXTRA_TRACE_ID));
        auib auibVar = auib.a;
        String str = (String) optionalOfNullable.filter(Predicate$CC.isEqual(auibVar.c).mo538negate()).orElse(cqdr.a().b);
        intent.putExtra(RcsIntents.EXTRA_TRACE_ID, str);
        final auia auiaVar = (auia) auibVar.createBuilder();
        Optional optionalOfNullable2 = Optional.ofNullable(str);
        auiaVar.getClass();
        optionalOfNullable2.ifPresent(new Consumer() { // from class: cjar
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                auia auiaVar2 = auiaVar;
                String str2 = (String) obj;
                auiaVar2.copyOnWrite();
                auib auibVar2 = (auib) auiaVar2.instance;
                auib auibVar3 = auib.a;
                str2.getClass();
                auibVar2.b |= 1;
                auibVar2.c = str2;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return this.a.b(intent).h(new ejvr() { // from class: cjas
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Void r5 = (Void) obj;
                if (((Boolean) ((cczi) cjbf.d.get()).e()).booleanValue()) {
                    Intent intent2 = intent;
                    auia auiaVar2 = auiaVar;
                    cjay cjayVar = this.a;
                    cjayVar.b.a((auib) auiaVar2.build(), basd.a(intent2.getStringExtra(RcsIntents.EXTRA_MESSAGE_ID)));
                }
                return r5;
            }
        }, this.d);
    }

    @Override // defpackage.cjad
    public final String b() {
        return "Bugle.MessagingService.SendMessageResponse.Latency";
    }
}
