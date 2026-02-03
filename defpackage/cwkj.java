package defpackage;

import android.view.View;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwkj implements uej {
    public final ekgp a = ekgp.q(uer.REACTION_BADGE, this, uer.CUSTOM_REACTION_BADGE, this, uer.STAR_BADGE, this, uer.CALENDAR_BADGE, this, uer.SCHEDULED_SEND_BADGE, this, uer.REMINDER_BADGE, this);
    private final Optional b;
    private final ConversationMessageView c;

    public cwkj(Optional optional, ConversationMessageView conversationMessageView) {
        this.b = optional;
        this.c = conversationMessageView;
    }

    @Override // defpackage.uej
    public final void a(View view, uer uerVar) {
        ConversationMessageView conversationMessageView = this.c;
        baea baeaVar = conversationMessageView.d;
        Optional optional = this.b;
        ejwl.a(optional.isPresent());
        uer uerVar2 = uer.REACTION_BADGE;
        int iOrdinal = uerVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            unm unmVarA = ((uni) optional.get()).a(baeaVar);
            SelfIdentityId selfIdentityIdP = baeaVar.p();
            cklv cklvVar = baeaVar.r;
            cklvVar.getClass();
            einf.g(new umx(unmVarA, selfIdentityIdP, cklvVar), conversationMessageView);
            return;
        }
        if (iOrdinal == 2) {
            einf.g(new uuk(conversationMessageView, view, new BugleConversationId(baeaVar.q()), baeaVar.r(), baeaVar.l()), conversationMessageView);
            return;
        }
        if (iOrdinal == 3) {
            int i = ekgb.d;
            einf.g(new cwsq(ekoe.a), conversationMessageView);
            return;
        }
        if (iOrdinal == 4) {
            cmcw cmcwVar = baeaVar.w;
            return;
        }
        if (iOrdinal != 5) {
            return;
        }
        czxn czxnVar = (czxn) czxo.a.createBuilder();
        String strA = baeaVar.q().a();
        czxnVar.copyOnWrite();
        czxo czxoVar = (czxo) czxnVar.instance;
        strA.getClass();
        czxoVar.b = 4 | czxoVar.b;
        czxoVar.e = strA;
        String strB = baeaVar.r().b();
        czxnVar.copyOnWrite();
        czxo czxoVar2 = (czxo) czxnVar.instance;
        strB.getClass();
        czxoVar2.b = 2 | czxoVar2.b;
        czxoVar2.d = strB;
        czxnVar.copyOnWrite();
        czxo czxoVar3 = (czxo) czxnVar.instance;
        czxoVar3.b |= 8;
        czxoVar3.f = true;
        long j = baeaVar.j;
        czxnVar.copyOnWrite();
        czxo czxoVar4 = (czxo) czxnVar.instance;
        czxoVar4.b |= 16;
        czxoVar4.g = 0L;
        czxo czxoVarBuild = czxnVar.build();
        if (czxoVarBuild == null) {
            throw new NullPointerException("Null reminderDialogData");
        }
        einf.g(new czxc(czxoVarBuild), conversationMessageView);
    }
}
