package defpackage;

import com.google.android.apps.messaging.shared.datamodel.search.appsearch.schema.v1.Conversation;
import com.google.android.apps.messaging.shared.datamodel.search.appsearch.schema.v1.Message;
import com.google.android.apps.messaging.shared.datamodel.search.appsearch.schema.v1.Participant;
import com.google.android.apps.messaging.shared.datamodel.search.appsearch.schema.v2.ConversationV2;
import com.google.android.apps.messaging.shared.datamodel.search.appsearch.schema.v2.MessageV2;
import com.google.android.apps.messaging.shared.datamodel.search.appsearch.schema.v2.ParticipantV2;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxto extends agc {
    public static final bxto a = new bxto();
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/datamodel/search/appsearch/schema/v2/AppSearchSchemaMigratorV2");

    private bxto() {
    }

    @Override // defpackage.agc
    public final afv a(int i, int i2, afv afvVar) {
        if (i >= i2 || i2 != 2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        String strM = afvVar.m();
        int iHashCode = strM.hashCode();
        if (iHashCode != -1859676397) {
            if (iHashCode != -1675388953) {
                if (iHashCode == 904474787 && strM.equals("Conversation")) {
                    Conversation conversation = (Conversation) afvVar.i(Conversation.class);
                    String str = conversation.b;
                    int i3 = bxtn.a;
                    return afv.f(new ConversationV2("Conversation", str, bxtn.a(), conversation.c, conversation.d, conversation.e));
                }
            } else if (strM.equals("Message")) {
                Message message = (Message) afvVar.i(Message.class);
                String str2 = message.b;
                int i4 = bxtn.a;
                return afv.f(new MessageV2("Message", str2, bxtn.a(), message.c, message.d, message.e, message.f, message.g));
            }
        } else if (strM.equals("Participant")) {
            Participant participant = (Participant) afvVar.i(Participant.class);
            String str3 = participant.b;
            int i5 = bxtn.a;
            return afv.f(new ParticipantV2("Participant", str3, bxtn.a(), participant.c, participant.d, participant.e, participant.f, participant.g));
        }
        throw new IllegalArgumentException("unknown document type, schemaType=".concat(afvVar.m()));
    }

    @Override // defpackage.agc
    public final boolean b(int i, int i2) {
        if (i2 != 2) {
            return false;
        }
        ekrw ekrwVarE = b.e();
        ekrwVarE.X(eksq.a, "BugleSearch");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/datamodel/search/appsearch/schema/v2/AppSearchSchemaMigratorV2", "shouldMigrate", 36, "AppSearchSchemaMigratorV2.kt")).u("AppSearch should upgrade schema, currentVersion=%s, finalVersion=%s", i, 2);
        return i < 2;
    }

    @Override // defpackage.agc
    public final afv c() {
        throw new UnsupportedOperationException("AppSearchSchemaMigratorV2 onDowngrade is not supported.");
    }
}
