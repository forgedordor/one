package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxyf {
    public static String a(String str, ConversationIdType conversationIdType, List list) {
        cqaz.q(list.size());
        StringBuilder sb = new StringBuilder();
        Locale locale = Locale.US;
        brao braoVar = MessagesTable.c.k;
        bsgr bsgrVar = PartsTable.d;
        sb.append(String.format(locale, " %s <= %d AND %s != %d AND %s != %d AND %s != %d AND %s is not null AND (", braoVar, 100, braoVar, 3, braoVar, 16, bsgrVar.y, Integer.valueOf(elha.RICH_CARD_THUMBNAIL.a()), bsgrVar.e));
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                sb.append(" OR ");
            }
            sb.append(String.format(Locale.US, "%s='%s'", bsgrVar.f, list.get(i)));
        }
        sb.append(')');
        if (!TextUtils.isEmpty(str)) {
            sb.append(" AND ");
            b(sb, str);
        }
        if (!conversationIdType.b()) {
            sb.append(String.format(Locale.US, "AND %s=%s", bsgrVar.p, conversationIdType));
        }
        return sb.toString();
    }

    public static void b(StringBuilder sb, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        sb.append("(");
        sb.append(String.format(Locale.US, "%s='%s' OR ", ParticipantsTable.c.r, str));
        Locale locale = Locale.US;
        bran branVar = MessagesTable.c;
        brao braoVar = branVar.c;
        brao braoVar2 = branVar.y;
        brao braoVar3 = branVar.b;
        String[] strArr = boiv.a;
        sb.append(String.format(locale, "(%s=%s AND %s IN (SELECT a.%s FROM %s as a  INNER JOIN %s as b ON a.%s = b.%s WHERE b.%s = '%s'))", braoVar, braoVar2, braoVar3, "conversation_id", "conversation_to_participants", "participants", "participant_id", "_id", "lookup_key", str));
        sb.append(") ");
    }
}
