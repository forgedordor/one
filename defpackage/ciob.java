package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ciob implements ejxr {
    final /* synthetic */ ConversationIdType a;

    public ciob(ConversationIdType conversationIdType) {
        this.a = conversationIdType;
    }

    @Override // defpackage.ejxr
    public final /* bridge */ /* synthetic */ Object get() {
        ConversationIdType conversationIdType = this.a;
        Integer numC = cioj.c(conversationIdType);
        if (numC == null) {
            return false;
        }
        int iIntValue = numC.intValue();
        String[] strArr = botm.a;
        bote boteVar = new bote();
        boteVar.ap("MmsGroupUpgradeDatabaseOperations#incrementMmsGroupUpgradeRetries");
        int i = iIntValue + 1;
        int iIntValue2 = botm.g().intValue();
        int iIntValue3 = botm.g().intValue();
        if (iIntValue3 < 60050) {
            dqru.x("mms_group_upgrade_retries", iIntValue3);
        }
        if (iIntValue2 >= 60050) {
            boteVar.a.put("mms_group_upgrade_retries", Integer.valueOf(i));
        }
        return Boolean.valueOf(boteVar.f(conversationIdType));
    }
}
