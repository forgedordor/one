package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos.EmergencySosConversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akfg {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;

    public akfg(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        fcsuVar3.getClass();
        this.c = fcsuVar3;
        fcsuVar4.getClass();
        this.d = fcsuVar4;
    }

    public final EmergencySosConversation a(BugleConversation bugleConversation) {
        anph anphVar = (anph) this.a.b();
        anphVar.getClass();
        akfl akflVar = (akfl) this.b.b();
        akflVar.getClass();
        amrl amrlVar = (amrl) this.d.b();
        amrlVar.getClass();
        bugleConversation.getClass();
        return new EmergencySosConversation(anphVar, akflVar, this.c, amrlVar, bugleConversation);
    }
}
