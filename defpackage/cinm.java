package defpackage;

import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cinm extends fcyz implements fdap {
    final /* synthetic */ cino a;
    final /* synthetic */ ConversationIdType b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cinm(cino cinoVar, ConversationIdType conversationIdType, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.a = cinoVar;
        this.b = conversationIdType;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cino cinoVar = this.a;
        baxe baxeVar = (baxe) cinoVar.d.b();
        brec brecVarA = cinx.a();
        ConversationIdType conversationIdType = this.b;
        brecVarA.m(conversationIdType);
        ekgb ekgbVarJ = baxeVar.J(brecVarA, Alert.DURATION_SHOW_INDEFINITELY);
        ekgbVarJ.getClass();
        if (ekgbVarJ.isEmpty()) {
            ekrw ekrwVarH = cino.a.h();
            ekrwVarH.X(eksq.a, "BugleGroupManagement");
            ekrd ekrdVar = (ekrd) ekrwVarH;
            ekrdVar.X(cqnc.s, conversationIdType);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/MmsGroupUpgradeBackupScheduler", "scheduleBackupWork", 77, "MmsGroupUpgradeBackupScheduler.kt")).q("MmsGroupUpgradeBackupScheduler: No MMS messages in upgraded group, skipping backup.");
        } else {
            List listAm = fcva.am(ekgbVarJ, (int) ((Number) cinoVar.g.b()).longValue());
            ciri ciriVar = (ciri) cinoVar.e.b();
            cirf cirfVar = (cirf) cirg.a.createBuilder();
            cirfVar.getClass();
            String strA = conversationIdType.a();
            strA.getClass();
            cirh.c(strA, cirfVar);
            cirh.g(cirfVar);
            ArrayList arrayList = new ArrayList(fcva.p(listAm, 10));
            Iterator it = listAm.iterator();
            while (it.hasNext()) {
                arrayList.add(((MessageIdType) it.next()).b());
            }
            cirh.e(arrayList, cirfVar);
            cirh.f(3, cirfVar);
            cirh.b(1, cirfVar);
            int i = ((ekoe) ekgbVarJ).c;
            cirh.d(i, cirfVar);
            cirg cirgVarA = cirh.a(cirfVar);
            caxr caxrVar = new caxr();
            caxrVar.a = "TELEPHONY";
            ((cazj) ciriVar.a.b()).a(cbcu.g("backup_upgraded_mms_group", cirgVarA, caxrVar.a()));
            ekrw ekrwVarH2 = cino.a.h();
            ekrwVarH2.X(eksq.a, "BugleGroupManagement");
            ekrd ekrdVar2 = (ekrd) ekrwVarH2;
            ekrdVar2.X(cqnc.s, conversationIdType);
            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/MmsGroupUpgradeBackupScheduler", "scheduleBackupWork", 98, "MmsGroupUpgradeBackupScheduler.kt")).r("MmsGroupUpgradeBackupScheduler: Scheduled backup of %s MMS messages.", i);
        }
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cinm(this.a, this.b, (fcxy) obj).b(fctx.a);
    }
}
