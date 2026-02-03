package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwiq {
    public static final cqce a = cqce.g("BugleE2eeEtouffee", "IncomingFailedToDecryptReceiptProcessor");
    public final fcsu b;
    public final bwey c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final bwgr h;
    private final fcsu i;
    private final fcsu j;
    private final auau k;
    private final fcsu l;

    public bwiq(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, bwgr bwgrVar, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, auau auauVar, bwey bweyVar, fcsu fcsuVar8) {
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.h = bwgrVar;
        this.i = fcsuVar5;
        this.b = fcsuVar6;
        this.j = fcsuVar7;
        this.k = auauVar;
        this.c = bweyVar;
        this.l = fcsuVar8;
    }

    private final void b(basd basdVar, MessageCoreData messageCoreData, boolean z) {
        cqce cqceVar = a;
        cqbd cqbdVarE = cqceVar.e();
        cqbdVarE.I("Message was already sent over MAX_FTD_RETRY_COUNT times.");
        cqbdVarE.z("getSendCounter", messageCoreData.q());
        cqbdVarE.r();
        ajqy ajqyVarP = ajrb.p();
        ajqyVarP.c(messageCoreData.C());
        ajqyVarP.h(19);
        ajqyVarP.f(this.k.a());
        if (z) {
            ((ajqm) ajqyVarP).d = Optional.of(false);
            ajqyVarP.b(false);
        }
        ((ajqm) ajqyVarP).e = Optional.of(1);
        if (((ajrc) this.l.b()).c(ajqyVarP.a())) {
            return;
        }
        cqbd cqbdVarE2 = cqceVar.e();
        cqbdVarE2.I("Unable to update message id, counter, and state of the message when trying to resend the message. User won't be able to successfully resend the message.");
        cqbdVarE2.A("rcsMessageId", basdVar);
        cqbdVarE2.z("originalMessageCounter", messageCoreData.q());
        cqbdVarE2.r();
    }

    final boolean a(eyfr eyfrVar, basd basdVar, aubq aubqVar, aubq aubqVar2) {
        String strJ;
        String str = aubqVar.d;
        String str2 = aubqVar2.d;
        fcsu fcsuVar = this.e;
        MessageCoreData messageCoreDataX = ((baxe) fcsuVar.b()).x(basdVar);
        if (messageCoreDataX == null) {
            ((ains) this.b.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 10);
            cqbd cqbdVarE = a.e();
            cqbdVarE.I("Message not found.");
            cqbdVarE.h(basdVar);
            cqbdVarE.r();
            return false;
        }
        MessageIdType messageIdTypeD = messageCoreDataX.D();
        MessageCoreData messageCoreDataW = !messageIdTypeD.c() ? ((baxe) fcsuVar.b()).w(messageIdTypeD) : null;
        bajf bajfVarA = ((axgh) this.d.b()).a(messageCoreDataX.A());
        if (bajfVarA == null) {
            ((ains) this.b.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 11);
            cqbd cqbdVarE2 = a.e();
            cqbdVarE2.I("Reencrypting message in a deleted conversation is not possible");
            cqbdVarE2.h(messageCoreDataX.F());
            cqbdVarE2.A("conversationId", messageCoreDataX.A());
            cqbdVarE2.r();
            return false;
        }
        int iE = bajfVarA.E();
        if (messageCoreDataX.q() < (iE == 0 ? 5 : bwbv.b())) {
            bwgr bwgrVar = this.h;
            ewth ewthVar = (ewth) ewti.a.createBuilder();
            ewthVar.copyOnWrite();
            ewti ewtiVar = (ewti) ewthVar.instance;
            eyfrVar.getClass();
            ewtiVar.c = eyfrVar;
            ewtiVar.b |= 1;
            ewthVar.copyOnWrite();
            ewti ewtiVar2 = (ewti) ewthVar.instance;
            str2.getClass();
            ewtiVar2.b |= 2;
            ewtiVar2.d = str2;
            ewthVar.copyOnWrite();
            ewti ewtiVar3 = (ewti) ewthVar.instance;
            str.getClass();
            ewtiVar3.b |= 4;
            ewtiVar3.e = str;
            ((cazj) bwgrVar.a.b()).a(cbcu.f("FtdHandlerWorkItem", (ewti) ewthVar.build()));
            cqbd cqbdVarC = a.c();
            cqbdVarC.I("Scheduled a work item to resend a message that resulted in an FTD receipt.");
            cqbdVarC.A("Original RCS message ID", basdVar.b);
            cqbdVarC.r();
            return true;
        }
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_E2EE_MESSAGE_RETRY_LIMIT_EXCEEDED;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        elyj elyjVar = (elyj) elyk.a.createBuilder();
        String strF = messageCoreDataX.E().f();
        elyjVar.copyOnWrite();
        elyk elykVar = (elyk) elyjVar.instance;
        elykVar.b |= 1;
        elykVar.c = strF;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        elyk elykVar2 = (elyk) elyjVar.build();
        elykVar2.getClass();
        ellhVar2.U = elykVar2;
        ellhVar2.c |= 2097152;
        ((aill) this.i.b()).j(ellgVar);
        ((ains) this.b.b()).e("Bugle.Etouffee.Ftd.Process.Status.Counts", 16);
        b(basdVar, messageCoreDataX, false);
        if (messageCoreDataW != null) {
            if (iE == 0) {
                b(basdVar, messageCoreDataW, true);
            }
            bxjg bxjgVar = (bxjg) this.f.b();
            ConversationIdType conversationIdTypeA = messageCoreDataW.A();
            MessageIdType messageIdTypeC = messageCoreDataW.C();
            fcsu fcsuVar2 = this.g;
            ParticipantsTable.BindData bindDataC = ((bbca) fcsuVar2.b()).c(str);
            if (bindDataC != null) {
                strJ = bindDataC.R();
                strJ.getClass();
            } else {
                strJ = ((bbca) fcsuVar2.b()).j(bbbd.f(str));
            }
            bxjgVar.a(conversationIdTypeA, messageIdTypeC, strJ, ((cogw) this.j.b()).f());
        }
        return false;
    }
}
