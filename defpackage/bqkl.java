package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.ArrayList;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqkl extends dqsi {
    public static final String[] a = {"message_reactions._id", "message_reactions.message_id", "message_reactions.reactions_data", "message_reactions.reacted_message_id", "message_reactions.reaction", "message_reactions.applied_reaction", "message_reactions.animation_effect"};
    public static final ekgp b;
    public static final bqjp c;
    public static final int[] d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("message_reactions.reacted_message_id", 46020);
        ekgiVar.i("message_reactions.reaction", 48000);
        ekgiVar.i("message_reactions.applied_reaction", 59060);
        ekgiVar.i("message_reactions.animation_effect", 59520);
        b = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("reacted_message_id", "index_message_reactions_reacted_message_id");
        ekgiVar2.i("animation_effect", "index_message_reactions_animation_effect");
        ekgiVar2.c();
        c = new bqjp();
        d = new int[]{42000, 46020, 48000, 59060, 59520};
    }

    public static final bqkg a() {
        String[] strArr;
        Integer numC = c();
        if (numC.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("message_reactions._id");
            ekfwVar.h("message_reactions.message_id");
            ekfwVar.h("message_reactions.reactions_data");
            if (numC.intValue() >= 46020) {
                ekfwVar.h("message_reactions.reacted_message_id");
            }
            if (numC.intValue() >= 48000) {
                ekfwVar.h("message_reactions.reaction");
            }
            if (numC.intValue() >= 59060) {
                ekfwVar.h("message_reactions.applied_reaction");
            }
            if (numC.intValue() >= 59520) {
                ekfwVar.h("message_reactions.animation_effect");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new bqkg(strArr);
    }

    public static dqsy b() {
        return dqru.e("$primary");
    }

    public static Integer c() {
        return Integer.valueOf(h().a());
    }

    public static String d(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("message_id INTEGER NOT NULL UNIQUE ON CONFLICT FAIL REFERENCES messages(_id) ON DELETE CASCADE ");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("reactions_data BLOB");
        if (i >= 46020) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("reacted_message_id INTEGER REFERENCES messages(_id) ON DELETE CASCADE ");
        }
        if (i >= 48000) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("reaction INTEGER");
        }
        if (i >= 59060) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("applied_reaction BLOB");
        }
        if (i >= 59520) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("animation_effect BLOB");
        }
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(");");
        return sb.toString();
    }

    public static void e(dqsy dqsyVar, int i) {
        dqsyVar.v(d(i, "message_reactions"));
        for (String str : g(i)) {
            dqsyVar.v(str);
        }
    }

    public static void f(MessageIdType messageIdType, Consumer consumer, Runnable runnable) {
        bqkg bqkgVarA = a();
        bqkgVarA.A("message_reactions.queryOnMessageId");
        bqkgVarA.q();
        bqkk bqkkVar = new bqkk();
        bqkkVar.b(messageIdType);
        bqkgVarA.k(new bqkj(bqkkVar));
        bqit bqitVar = (bqit) dqru.c(bqkgVarA.b());
        if (bqitVar != null) {
            consumer.accept(bqitVar);
        } else {
            runnable.run();
        }
    }

    public static String[] g(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 46020) {
            arrayList.add("DROP INDEX IF EXISTS index_message_reactions_reacted_message_id");
            arrayList.add("CREATE INDEX index_message_reactions_reacted_message_id ON message_reactions(reacted_message_id);");
        }
        if (i >= 59520) {
            arrayList.add("DROP INDEX IF EXISTS index_message_reactions_animation_effect");
            arrayList.add("CREATE INDEX index_message_reactions_animation_effect ON message_reactions(animation_effect) WHERE animation_effect NOT NULL;");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static dqxa h() {
        return b().M();
    }
}
