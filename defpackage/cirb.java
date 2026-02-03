package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cirb extends fcyz implements fdap {
    final /* synthetic */ cird a;
    final /* synthetic */ cayy b;
    final /* synthetic */ cirg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cirb(cird cirdVar, cayy cayyVar, cirg cirgVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.a = cirdVar;
        this.b = cayyVar;
        this.c = cirgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        List list;
        cayy cayyVar;
        fdfr fdfrVar;
        int i;
        final bojh bojhVar;
        fctl.b(obj);
        cirg cirgVar = this.c;
        ConversationIdType conversationIdTypeB = barn.b(cirgVar.b);
        final cird cirdVar = this.a;
        if (cirgVar.e == 1) {
            ciok ciokVar = (ciok) cirdVar.i.b();
            enbz enbzVar = (enbz) encn.b.createBuilder();
            enbzVar.getClass();
            enuu.b(((aika) ciokVar.a.b()).b(conversationIdTypeB), enbzVar);
            enuu.c(6, enbzVar);
            enuu.g(enbzVar);
            ciokVar.a(enuu.a(enbzVar));
        }
        ekrg ekrgVar = cird.a;
        ekrw ekrwVarE = ekrgVar.e();
        ekrz ekrzVar = eksq.a;
        ekrwVarE.X(ekrzVar, "BugleGroupManagement");
        ekrd ekrdVar = (ekrd) ekrwVarE;
        ekrz ekrzVar2 = cqnc.s;
        ekrdVar.X(ekrzVar2, conversationIdTypeB);
        ekrd ekrdVar2 = (ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/backup/BackupUpgradedMmsGroupHandler", "logStart", 145, "BackupUpgradedMmsGroupHandler.kt");
        int iB = cire.b(cirgVar.d);
        if (iB == 0) {
            iB = 1;
        }
        ekrdVar2.B("BackupUpgradedMmsGroupHandler: Backing up %s batch #%s...", cire.a(iB), cirgVar.e);
        if (conversationIdTypeB.b()) {
            return cirdVar.l(conversationIdTypeB, 2, cirgVar);
        }
        bojh bojhVarR = ((bakt) cirdVar.d.b()).r(conversationIdTypeB);
        int i2 = bojhVarR == null ? 3 : !bvdi.d(bojhVarR.k()) ? 4 : bojhVarR.ad() == null ? 5 : 0;
        if (i2 != 0) {
            return cirdVar.l(conversationIdTypeB, i2, cirgVar);
        }
        int iB2 = cire.b(cirgVar.d);
        if (iB2 == 0) {
            iB2 = 1;
        }
        if (iB2 - 2 != 1) {
            return cirdVar.l(conversationIdTypeB, 1, cirgVar);
        }
        evtg evtgVar = cirgVar.c;
        evtgVar.getClass();
        fcsu fcsuVar = cirdVar.f;
        baxe baxeVar = (baxe) fcsuVar.b();
        ArrayList arrayList = new ArrayList(fcva.p(evtgVar, 10));
        Iterator<E> it = evtgVar.iterator();
        while (it.hasNext()) {
            arrayList.add(bary.b((String) it.next()));
        }
        ekgb<MessageCoreData> ekgbVarL = baxeVar.L(arrayList);
        ekgbVarL.getClass();
        if (cirgVar.c.size() == 0) {
            list = fcvo.a;
        } else {
            evtg evtgVar2 = cirgVar.c;
            evtgVar2.getClass();
            long j = bary.b((String) fcva.S(evtgVar2)).a;
            baxe baxeVar2 = (baxe) fcsuVar.b();
            brec brecVarA = cinx.a();
            brecVarA.m(bojhVarR.C());
            brecVarA.v(j);
            ekgb ekgbVarJ = baxeVar2.J(brecVarA, (int) ((Number) cirdVar.j.b()).longValue());
            ekgbVarJ.getClass();
            ArrayList arrayList2 = new ArrayList(fcva.p(ekgbVarJ, 10));
            ekqh it2 = ekgbVarJ.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((MessageIdType) it2.next()).b());
            }
            list = arrayList2;
        }
        if (!ekgbVarL.isEmpty()) {
            for (MessageCoreData messageCoreData : ekgbVarL) {
                if (!messageCoreData.cO() || messageCoreData.u() == null || messageCoreData.dj()) {
                    ConversationIdType conversationIdTypeC = bojhVarR.C();
                    conversationIdTypeC.getClass();
                    return cirdVar.l(conversationIdTypeC, 6, cirgVar);
                }
            }
        }
        final cayy cayyVar2 = this.b;
        fdfr fdfrVar2 = new fdfr(new fdfs(fcva.ax(ekgbVarL), new fdap() { // from class: cira
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                ((MessageCoreData) obj2).getClass();
                return Boolean.valueOf(!cayyVar2.b());
            }
        }));
        int i3 = 0;
        while (fdfrVar2.hasNext()) {
            final MessageCoreData messageCoreData2 = (MessageCoreData) fdfrVar2.next();
            final Uri uriU = messageCoreData2.u();
            if (uriU == null) {
                throw new IllegalStateException("Required value was null.");
            }
            final String strA = chxq.a(messageCoreData2, bojhVarR.ad(), bojhVarR);
            ejxr ejxrVar = chxx.a;
            ekgb ekgbVar = ekgbVarL;
            if (chum.a(strA)) {
                if (fdbq.f(strA, messageCoreData2.aw())) {
                    cayyVar = cayyVar2;
                    fdfrVar = fdfrVar2;
                    i = i3;
                    bojhVar = bojhVarR;
                } else {
                    cayyVar = cayyVar2;
                    bojhVar = bojhVarR;
                    i = i3;
                    fdfrVar = fdfrVar2;
                    Object objA = ((dqsn) cirdVar.g.b()).a("BackupUpgradedMmsGroupHandler#backupMmsMessageToTelephony", new dqsl() { // from class: ciqz
                        @Override // defpackage.dqsl
                        public final Object a(byeu byeuVar) {
                            cird cirdVar2 = cirdVar;
                            baxe baxeVar3 = (baxe) cirdVar2.f.b();
                            MessageCoreData messageCoreData3 = messageCoreData2;
                            ConversationIdType conversationIdTypeC2 = bojhVar.C();
                            MessageIdType messageIdTypeC = messageCoreData3.C();
                            String[] strArr = MessagesTable.a;
                            brdu brduVar = new brdu();
                            String str = strA;
                            brduVar.u(str);
                            baxeVar3.V(conversationIdTypeC2, messageIdTypeC, brduVar);
                            if (!((cmqj) cirdVar2.e.b()).R(uriU, str)) {
                                byeuVar.a(false);
                            }
                            return true;
                        }
                    });
                    objA.getClass();
                    if (((Boolean) objA).booleanValue()) {
                    }
                }
                i3 = i + 1;
                if (i3 < 0) {
                    fcva.l();
                }
                ekgbVarL = ekgbVar;
                bojhVarR = bojhVar;
                fdfrVar2 = fdfrVar;
                cayyVar2 = cayyVar;
            } else {
                cayyVar = cayyVar2;
                fdfrVar = fdfrVar2;
                i = i3;
                bojhVar = bojhVarR;
            }
            ekgbVarL = ekgbVar;
            i3 = i;
            bojhVarR = bojhVar;
            fdfrVar2 = fdfrVar;
            cayyVar2 = cayyVar;
        }
        cayy cayyVar3 = cayyVar2;
        int i4 = i3;
        bojh bojhVar2 = bojhVarR;
        int size = ekgbVarL.size();
        if (cayyVar3.b()) {
            ConversationIdType conversationIdTypeC2 = bojhVar2.C();
            conversationIdTypeC2.getClass();
            if (!cayyVar3.c()) {
                return cirdVar.l(conversationIdTypeC2, 7, cirgVar);
            }
            ekrw ekrwVarE2 = ekrgVar.e();
            ekrwVarE2.X(ekrzVar, "BugleGroupManagement");
            ekrd ekrdVar3 = (ekrd) ekrwVarE2;
            ekrdVar3.X(ekrzVar2, conversationIdTypeC2);
            ekrd ekrdVar4 = (ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/backup/BackupUpgradedMmsGroupHandler", "onCancelledExecution", 267, "BackupUpgradedMmsGroupHandler.kt");
            int iB3 = cire.b(cirgVar.d);
            ekrdVar4.t("BackupUpgradedMmsGroupHandler: %s execution is cancelled. Scheduling for retry...", cire.a(iB3 == 0 ? 1 : iB3));
            return cbcw.m();
        }
        if (i4 == size) {
            ConversationIdType conversationIdTypeC3 = bojhVar2.C();
            conversationIdTypeC3.getClass();
            return cirdVar.k(conversationIdTypeC3, cirgVar, list);
        }
        if (cayyVar3.c()) {
            ConversationIdType conversationIdTypeC4 = bojhVar2.C();
            conversationIdTypeC4.getClass();
            ekrw ekrwVarE3 = ekrgVar.e();
            ekrwVarE3.X(ekrzVar, "BugleGroupManagement");
            ekrd ekrdVar5 = (ekrd) ekrwVarE3;
            ekrdVar5.X(ekrzVar2, conversationIdTypeC4);
            ekrd ekrdVar6 = (ekrd) ekrdVar5.h("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/backup/BackupUpgradedMmsGroupHandler", "retry", 346, "BackupUpgradedMmsGroupHandler.kt");
            int iB4 = cire.b(cirgVar.d);
            ekrdVar6.t("BackupUpgradedMmsGroupHandler: %s batch failed for some messages. Scheduling for retry...", cire.a(iB4 == 0 ? 1 : iB4));
            return cbcw.m();
        }
        ConversationIdType conversationIdTypeC5 = bojhVar2.C();
        conversationIdTypeC5.getClass();
        ekrw ekrwVarJ = ekrgVar.j();
        ekrwVarJ.X(ekrzVar, "BugleGroupManagement");
        ekrd ekrdVar7 = (ekrd) ekrwVarJ;
        ekrdVar7.X(ekrzVar2, conversationIdTypeC5);
        ekrd ekrdVar8 = (ekrd) ekrdVar7.h("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/backup/BackupUpgradedMmsGroupHandler", "giveUpOnCurrentBatch", 361, "BackupUpgradedMmsGroupHandler.kt");
        int iB5 = cire.b(cirgVar.d);
        ekrdVar8.t("BackupUpgradedMmsGroupHandler: Exhausted all retries for a %s backup batch. Giving up on this batch...", cire.a(iB5 == 0 ? 1 : iB5));
        return cirdVar.k(conversationIdTypeC5, cirgVar, list);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cirb(this.a, this.b, this.c, (fcxy) obj).b(fctx.a);
    }
}
