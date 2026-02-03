package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cino implements ciol {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/MmsGroupUpgradeBackupScheduler");
    public static final dzfh b = new dzfh("MmsGroupUpgradeBackupSchedulerTimer");
    public static final dzfh c = new dzfh("MmsGroupUpgradeBackupSchedulerMemory");
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    private final fdjx h;

    public cino(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar4.getClass();
        this.h = fdjxVar;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
    }

    @Override // defpackage.ciol
    public final eiju a(ConversationIdType conversationIdType) {
        conversationIdType.getClass();
        return auvw.i(this.h, new cinn(this, conversationIdType, null));
    }
}
