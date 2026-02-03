package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aijz {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/analytics/AnalyticsDatabaseOperations");
    private final cogw b;
    private final fcsu c;
    private final aika d;
    private final aixq e;
    private final fcsu f;
    private final fcsu g;

    public aijz(cogw cogwVar, fcsu fcsuVar, aika aikaVar, aixq aixqVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.b = cogwVar;
        this.c = fcsuVar;
        this.d = aikaVar;
        this.e = aixqVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
    }

    public final int a(long j) {
        long epochMilli = this.b.f().toEpochMilli() - j;
        String[] strArr = botm.a;
        bopp boppVar = botm.c;
        bopq bopqVar = boppVar.f;
        bran branVar = MessagesTable.c;
        return (int) ((dqsy) this.c.b()).d(String.format("%s LEFT JOIN %s ON %s=%s", "conversations", "messages", bopqVar, branVar.a), String.format("%s = ? AND %s > ?", boppVar.O, branVar.i), new String[]{Integer.toString(2), Long.toString(epochMilli)});
    }

    public final int b(long j) throws Throwable {
        Cursor cursorQuery;
        cqaz.h();
        long epochMilli = this.b.f().toEpochMilli() - j;
        String[] strArr = botm.a;
        bopp boppVar = botm.c;
        bopq bopqVar = boppVar.f;
        bran branVar = MessagesTable.c;
        String str = String.format("%s LEFT JOIN %s ON %s=%s", "conversations", "messages", bopqVar, branVar.a);
        bopq bopqVar2 = boppVar.O;
        brao braoVar = branVar.i;
        bopq bopqVar3 = boppVar.y;
        try {
            cursorQuery = ((dqsy) this.c.b()).h().query(str, new String[]{bopqVar3.toString()}, String.format("%s = ? AND %s > ? and %s IS NOT NULL and %s != ''", bopqVar2, braoVar, bopqVar3, bopqVar3), new String[]{Integer.toString(0), Long.toString(epochMilli)}, null, null, null);
            int i = 0;
            while (cursorQuery.moveToNext()) {
                try {
                    if (alwh.k(cursorQuery.getString(0))) {
                        i++;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return i;
        } catch (Throwable th2) {
            th = th2;
            cursorQuery = null;
        }
    }

    public final int c(long j) {
        long epochMilli = this.b.f().toEpochMilli() - j;
        int[] iArrDn = MessageData.dn();
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.toString(3));
        arrayList.add(Long.toString(-1L));
        arrayList.add(Long.toString(epochMilli));
        for (int i = 0; i < 5; i++) {
            arrayList.add(Integer.toString(iArrDn[i]));
        }
        StringBuilder sb = new StringBuilder();
        bran branVar = MessagesTable.c;
        sb.append(branVar.j);
        sb.append(" = ? AND ");
        sb.append(branVar.I);
        sb.append(" != ? AND ");
        sb.append(branVar.g);
        sb.append(" > ? AND (");
        for (int i2 = 0; i2 < 5; i2++) {
            if (i2 > 0) {
                sb.append(" OR ");
            }
            sb.append(branVar.k);
            sb.append(" = ?");
        }
        sb.append(")");
        return (int) ((dqsy) this.c.b()).d("messages", sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final ekgp d(long j) throws Throwable {
        Cursor cursorQuery;
        HashMap map = new HashMap();
        long epochMilli = this.b.f().toEpochMilli() - j;
        String[] strArr = botm.a;
        bopp boppVar = botm.c;
        bopq bopqVar = boppVar.y;
        brzh brzhVar = ParticipantsTable.c;
        try {
            cursorQuery = ((dqsy) this.c.b()).h().query(String.format("%s LEFT JOIN %s ON %s=%s", "conversations", "participants", bopqVar, brzhVar.f), new String[]{bopqVar.toString(), brzhVar.v.toString()}, String.format("%s = 1 AND %s > ?", boppVar.R, boppVar.S), new String[]{Long.toString(epochMilli)}, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        ((ekrd) ((ekrd) a.j()).h("com/google/android/apps/messaging/shared/analytics/AnalyticsDatabaseOperations", "getRbmBotsFromInteractiveRbmConversations", 157, "AnalyticsDatabaseOperations.java")).q("null in PARTICIPANT_NORMALIZED_DESTINATION for RBM bot");
                    } else {
                        if (map.put(string, Boolean.valueOf(cursorQuery.getInt(1) == 1)) != null) {
                            ((ekrd) ((ekrd) a.j()).h("com/google/android/apps/messaging/shared/analytics/AnalyticsDatabaseOperations", "getRbmBotsFromInteractiveRbmConversations", 163, "AnalyticsDatabaseOperations.java")).t("Duplicated conversation found with %s", cqcv.b(string));
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return ekgp.j(map);
        } catch (Throwable th2) {
            th = th2;
            cursorQuery = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x040b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0410  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.elki e(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1044
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aijz.e(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType):elki");
    }
}
