package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgrx {
    private final cgrw a;
    private final cgkj b;

    public cgrx(cgkj cgkjVar, cgrw cgrwVar) {
        cgkjVar.getClass();
        this.b = cgkjVar;
        this.a = cgrwVar;
    }

    public final void a(BugleConversationId bugleConversationId) {
        cgrp cgrpVar = (cgrp) cgrq.a.createBuilder();
        akll akllVar = (akll) akln.a.createBuilder();
        aklm aklmVar = aklm.BUGLE;
        akllVar.copyOnWrite();
        ((akln) akllVar.instance).b = aklmVar.a();
        String string = bugleConversationId.a.toString();
        akllVar.copyOnWrite();
        akln aklnVar = (akln) akllVar.instance;
        string.getClass();
        aklnVar.c = string;
        evqs evqsVarX = evqs.x(((akln) akllVar.build()).toByteArray());
        cgrpVar.copyOnWrite();
        cgrq cgrqVar = (cgrq) cgrpVar.instance;
        cgrqVar.b |= 1;
        cgrqVar.c = evqsVarX;
        this.b.d(this.a, cgrpVar.build(), false);
    }
}
