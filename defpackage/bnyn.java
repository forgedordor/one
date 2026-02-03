package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ConversationNotificationSettingsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bnyn {
    public static dqsq a() {
        return new dqry(ConversationNotificationSettingsTable.d, "conversation_notification_settings_table", new dqrx() { // from class: bnyl
            @Override // defpackage.dqrx
            public final void a(int i, dqsy dqsyVar) {
                Integer numValueOf = Integer.valueOf(i);
                String[] strArr = ConversationNotificationSettingsTable.a;
                numValueOf.getClass();
                if (i != 60720) {
                    return;
                }
                ConversationNotificationSettingsTable.c(dqsyVar);
            }
        });
    }
}
