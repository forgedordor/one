package com.google.android.apps.messaging.ui.conversation.details;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import defpackage.afzc;
import defpackage.auvw;
import defpackage.cvvs;
import defpackage.cwhh;
import defpackage.fdjx;
import defpackage.fdpl;
import defpackage.lxd;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConversationDetailsViewModel extends lxd {
    public final fdpl a;
    public final afzc b;
    public final cwhh c;
    private final fdjx d;

    public ConversationDetailsViewModel(ConversationId conversationId, fdjx fdjxVar, fdpl fdplVar, afzc afzcVar, cwhh cwhhVar) {
        conversationId.getClass();
        fdjxVar.getClass();
        fdplVar.getClass();
        afzcVar.getClass();
        this.d = fdjxVar;
        this.a = fdplVar;
        this.b = afzcVar;
        this.c = cwhhVar;
        auvw.k(fdjxVar, null, null, new cvvs(this, null), 3);
    }
}
