package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cird extends cayv {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/backup/BackupUpgradedMmsGroupHandler");
    public static final dzfh b = new dzfh("BackupUpgradedMmsGroupHandlerTimer");
    public static final dzfh c = new dzfh("BackupUpgradedMmsGroupHandlerMemory");
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    private final fdjx k;
    private final fcsu l;

    public cird(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, ciri ciriVar, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        ciriVar.getClass();
        fcsuVar4.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        this.k = fdjxVar;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.h = fcsuVar5;
        this.i = fcsuVar6;
        this.l = fcsuVar7;
        this.j = fcsuVar8;
    }

    private final int m(final ConversationIdType conversationIdType) {
        baxe baxeVar = (baxe) this.f.b();
        brdr brdrVarE = MessagesTable.e("getSuccessfullyBackedUpMessagesToTelephonyCount#query");
        brdrVarE.h(new Function() { // from class: ciqy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                brecVar.m(conversationIdType);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarE.g(cinx.a());
        int i = 0;
        brdrVarE.c(MessagesTable.c.s);
        ekgb ekgbVarK = baxeVar.K(brdrVarE.b());
        ekgbVarK.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : ekgbVarK) {
            String strAw = ((MessageCoreData) obj).aw();
            ejxr ejxrVar = chxx.a;
            if (chum.a(strAw)) {
                arrayList.add(obj);
            }
        }
        ArrayList<chxw> arrayList2 = new ArrayList(fcva.p(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(chxx.c(((MessageCoreData) it.next()).aw()));
        }
        if (arrayList2.isEmpty()) {
            return 0;
        }
        for (chxw chxwVar : arrayList2) {
            if (chxwVar != null && chxwVar.e().isPresent() && (((chuv) chxwVar.e().get()).b & 1) != 0 && (i = i + 1) < 0) {
                fcva.l();
            }
        }
        return i;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.b(caze.WORKMANAGER_ONLY);
        caxzVarL.c((int) ((Number) this.l.b()).longValue());
        caxzVarL.f(pza.a);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("BackupUpgradedMmsGroupHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = cirg.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        cirg cirgVar = (cirg) evuhVar;
        cirgVar.getClass();
        return auvw.c(this.k, fcyi.a, fdjz.a, new circ(this, cayyVar, cirgVar, null));
    }

    public final cbcw k(ConversationIdType conversationIdType, cirg cirgVar, List list) {
        if (!list.isEmpty()) {
            cirf cirfVar = (cirf) cirg.a.createBuilder();
            cirfVar.getClass();
            String strA = conversationIdType.a();
            strA.getClass();
            cirh.c(strA, cirfVar);
            int iB = cire.b(cirgVar.d);
            if (iB == 0) {
                iB = 1;
            }
            cirh.f(iB, cirfVar);
            cirh.g(cirfVar);
            cirh.e(list, cirfVar);
            cirh.d(cirgVar.f, cirfVar);
            cirh.b(cirgVar.e + 1, cirfVar);
            cirg cirgVarA = cirh.a(cirfVar);
            caxr caxrVar = new caxr();
            int iB2 = cire.b(cirgVar.d);
            caxrVar.a = cire.a(iB2 != 0 ? iB2 : 1);
            return cbcw.j(ekgb.r(cbcu.g("backup_upgraded_mms_group", cirgVarA, caxrVar.a())));
        }
        int iM = m(conversationIdType);
        if (iM < cirgVar.f) {
            ((ciok) this.i.b()).c(conversationIdType, 8, cirgVar.f, iM);
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleGroupManagement");
            ekrd ekrdVar = (ekrd) ekrwVarJ;
            ekrdVar.X(cqnc.s, conversationIdType);
            ekrd ekrdVar2 = (ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/backup/BackupUpgradedMmsGroupHandler", "onBackupCompleted", 308, "BackupUpgradedMmsGroupHandler.kt");
            int iB3 = cire.b(cirgVar.d);
            ekrdVar2.t("BackupUpgradedMmsGroupHandler: Finished backing up upgraded MMS group to %s, but not all messages were backed up", cire.a(iB3 != 0 ? iB3 : 1));
            return cbcw.k();
        }
        ciok ciokVar = (ciok) this.i.b();
        enbz enbzVar = (enbz) encn.b.createBuilder();
        enbzVar.getClass();
        enuu.b(((aika) ciokVar.a.b()).b(conversationIdType), enbzVar);
        enuu.c(7, enbzVar);
        enuu.g(enbzVar);
        ciokVar.a(enuu.a(enbzVar));
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleGroupManagement");
        ekrd ekrdVar3 = (ekrd) ekrwVarH;
        ekrdVar3.X(cqnc.s, conversationIdType);
        ekrd ekrdVar4 = (ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/backup/BackupUpgradedMmsGroupHandler", "onBackupCompleted", 291, "BackupUpgradedMmsGroupHandler.kt");
        int iB4 = cire.b(cirgVar.d);
        ekrdVar4.t("BackupUpgradedMmsGroupHandler: Finished backing up upgraded MMS group to %s", cire.a(iB4 != 0 ? iB4 : 1));
        return cbcw.i();
    }

    public final cbcw l(ConversationIdType conversationIdType, int i, cirg cirgVar) {
        String str;
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "BugleGroupManagement");
        ekrd ekrdVar = (ekrd) ekrwVarJ;
        ekrdVar.X(cqnc.s, conversationIdType);
        ekrd ekrdVar2 = (ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/backup/BackupUpgradedMmsGroupHandler", "onBackupFailed", 376, "BackupUpgradedMmsGroupHandler.kt");
        int iB = cire.b(cirgVar.d);
        if (iB == 0) {
            iB = 1;
        }
        switch (i) {
            case 1:
                str = "UNKNOWN_MMS_GROUP_CONVERSATION_BACKUP_FAILURE_REASON";
                break;
            case 2:
                str = "INVALID_PARAMETERS_MISSING_CONVERSATION_ID";
                break;
            case 3:
                str = "INVALID_PARAMETERS_UNKNOWN_CONVERSATION";
                break;
            case 4:
                str = "INVALID_PARAMETERS_CONVERSATION_NOT_RCS_GROUP";
                break;
            case 5:
                str = "INVALID_PARAMETERS_GROUP_WITHOUT_CONFERENCE_URI";
                break;
            case 6:
                str = "INVALID_PARAMETERS_NOT_ALL_MESSAGES_MMS";
                break;
            default:
                str = "CANCELLED_EXECUTION";
                break;
        }
        ekrdVar2.D("BackupUpgradedMmsGroupHandler: %s Backup failed with %s reason", cire.a(iB), str);
        ((ciok) this.i.b()).c(conversationIdType, i, cirgVar.f, m(conversationIdType));
        return cbcw.k();
    }
}
