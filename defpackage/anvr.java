package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anvr extends fcyz implements fdat {
    final /* synthetic */ BugleConversationId a;
    final /* synthetic */ ekgb b;
    final /* synthetic */ anvt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anvr(BugleConversationId bugleConversationId, ekgb ekgbVar, anvt anvtVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = bugleConversationId;
        this.b = ekgbVar;
        this.c = anvtVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((anvr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekgb<Recipient> ekgbVar = this.b;
        ArrayList<ParticipantsTable.BindData> arrayList = new ArrayList(fcva.p(ekgbVar, 10));
        for (Recipient recipient : ekgbVar) {
            recipient.getClass();
            arrayList.add(((anug) recipient).n());
        }
        BugleConversationId bugleConversationId = this.a;
        int size = arrayList.size();
        ConversationIdType conversationIdType = bugleConversationId.a;
        if (size == 1) {
            ((bbcw) this.c.c.b()).b((ParticipantsTable.BindData) arrayList.get(0), conversationIdType);
        } else {
            final bbcw bbcwVar = (bbcw) this.c.c.b();
            final bbcx bbcxVar = bbcx.b;
            eieu eieuVarK = eiiy.k("UpdateBugleParticipantAndConversations#updateSendDestinationsForConversationParticipants");
            try {
                cqaz.h();
                List<ParticipantsTable.BindData> listK = ((bakt) bbcwVar.c.b()).K(conversationIdType);
                cvw cvwVar = new cvw();
                for (ParticipantsTable.BindData bindData : listK) {
                    String strT = bindData.T();
                    if (strT != null) {
                        cvwVar.put(strT, bindData);
                    }
                }
                final ArrayList arrayList2 = new ArrayList();
                for (ParticipantsTable.BindData bindData2 : arrayList) {
                    String strT2 = bindData2.T();
                    if (strT2 != null) {
                        ParticipantsTable.BindData bindData3 = (ParticipantsTable.BindData) cvwVar.get(strT2);
                        if (!bbdl.k(bindData2)) {
                            int i = bbbd.a;
                            if (bindData3 == null || !TextUtils.equals(bindData2.T(), bindData3.T()) || !TextUtils.equals(bindData2.V(), bindData3.V())) {
                                arrayList2.add(bindData2);
                            }
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    cqbd cqbdVarC = bbcw.b.c();
                    cqbdVarC.I("Updating send destinations participants.");
                    cqbdVarC.L("participantSendDiff", arrayList2);
                    cqbdVarC.c(conversationIdType);
                    cqbdVarC.r();
                    bbcwVar.f.d("UpdateBugleParticipantAndConversations#updateSendDestinationsForParticipants", new Runnable() { // from class: bbcm
                        @Override // java.lang.Runnable
                        public final void run() {
                            for (ParticipantsTable.BindData bindData4 : arrayList2) {
                                bbcx bbcxVar2 = bbcxVar;
                                bbcw bbcwVar2 = bbcwVar;
                                final String strT3 = bindData4.T();
                                strT3.getClass();
                                bsbs bsbsVarF = ParticipantsTable.f();
                                bsbsVarF.ap("updateParticipantSendDestination");
                                bsbsVarF.N(bindData4.V());
                                bsbsVarF.U(new Function() { // from class: bbcn
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        bsbx bsbxVar = (bsbx) obj2;
                                        eksp ekspVar = bbcw.a;
                                        bsbxVar.v(-2);
                                        String[] strArr = ParticipantsTable.a;
                                        bsbx bsbxVar2 = new bsbx();
                                        bsbxVar2.r(strT3);
                                        bsbxVar.aq(bsbxVar2);
                                        return bsbxVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                int iA = bbcwVar2.a(bsbsVarF, bbcxVar2);
                                if (iA == 1) {
                                    ((ains) bbcwVar2.l.b()).c("Bugle.Datamodel.Participant.UpdateParticipantSendDestination");
                                    iA = 1;
                                }
                                ((bbca) bbcwVar2.e.b()).p(iA, iA != 1 ? "Failed to update participant's send destination." : "Successfully updated participant's send destination.");
                            }
                        }
                    });
                }
                eieuVarK.close();
            } catch (Throwable th) {
                try {
                    eieuVarK.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new anvr(this.a, this.b, this.c, fcxyVar);
    }
}
