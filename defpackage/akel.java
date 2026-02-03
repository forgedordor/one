package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akel {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;

    public akel(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
        fcsuVar3.getClass();
        this.c = fcsuVar3;
        fcsuVar4.getClass();
        this.d = fcsuVar4;
        fcsuVar5.getClass();
        this.e = fcsuVar5;
        fcsuVar6.getClass();
        this.f = fcsuVar6;
        fcsuVar7.getClass();
        this.g = fcsuVar7;
    }

    public final EmergencyConversation a(BugleConversation bugleConversation) {
        fdjx fdjxVar = (fdjx) this.a.b();
        fdjxVar.getClass();
        anph anphVar = (anph) this.b.b();
        anphVar.getClass();
        amyo amyoVar = (amyo) this.c.b();
        amyoVar.getClass();
        akey akeyVar = (akey) this.d.b();
        akeyVar.getClass();
        amra amraVar = (amra) this.g.b();
        amraVar.getClass();
        return new EmergencyConversation(fdjxVar, anphVar, amyoVar, akeyVar, this.e, this.f, amraVar, bugleConversation);
    }
}
