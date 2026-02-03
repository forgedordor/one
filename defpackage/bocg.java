package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.ArrayList;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bocg extends dqsi {
    public static final String[] a = {"conversation_participants._id", "conversation_participants.conversation_id", "conversation_participants.participant_id", "conversation_participants.is_normalized", "conversation_participants.rcs_group_join_status", "conversation_participants.last_modified_by_key"};
    public static final ekgp b;
    public static final bobj c;
    public static final int[] d;
    public static final int[] e;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("conversation_participants.is_normalized", 58090);
        ekgiVar.i("conversation_participants.rcs_group_join_status", 58570);
        ekgiVar.i("conversation_participants.last_modified_by_key", 59440);
        b = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("conversation_id", "index_conversation_participants_conversation_id");
        ekgiVar2.i("participant_id", "index_conversation_participants_participant_id");
        ekgiVar2.c();
        c = new bobj();
        d = new int[]{58090, 58460, 58570, 59440};
        e = new int[]{58600};
    }

    public static final boca a() {
        String[] strArr;
        Integer numD = d();
        if (numD.intValue() == Integer.MAX_VALUE) {
            strArr = a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h("conversation_participants._id");
            ekfwVar.h("conversation_participants.conversation_id");
            ekfwVar.h("conversation_participants.participant_id");
            if (numD.intValue() >= 58090) {
                ekfwVar.h("conversation_participants.is_normalized");
            }
            if (numD.intValue() >= 58570) {
                ekfwVar.h("conversation_participants.rcs_group_join_status");
            }
            if (numD.intValue() >= 59440) {
                ekfwVar.h("conversation_participants.last_modified_by_key");
            }
            strArr = (String[]) ekfwVar.g().toArray(new String[0]);
        }
        return new boca(strArr);
    }

    public static bocd b() {
        bocd bocdVar = new bocd();
        if (d().intValue() >= 59440) {
            bbaj bbajVarB = bbam.b();
            int iIntValue = d().intValue();
            int iIntValue2 = d().intValue();
            if (iIntValue2 < 59440) {
                dqru.x("last_modified_by_key", iIntValue2);
            }
            if (iIntValue >= 59440) {
                bocdVar.a.put("last_modified_by_key", bbam.c(bbajVarB));
            }
            bocdVar.e.b().c("last_modified_by_key");
        }
        return bocdVar;
    }

    public static dqsy c() {
        return dqru.e("$primary");
    }

    public static Integer d() {
        return Integer.valueOf(g().a());
    }

    public static String e(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("_id INTEGER PRIMARY KEY AUTOINCREMENT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("conversation_id INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("participant_id INT");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("is_normalized INT DEFAULT(0)");
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append("rcs_group_join_status INT DEFAULT(0)");
        if (i >= 59440) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("last_modified_by_key TEXT");
        }
        sb.insert(0, a.a(str, "CREATE TABLE ", " ("));
        sb.append(", UNIQUE(conversation_id,participant_id,is_normalized) ON CONFLICT FAIL FOREIGN KEY (conversation_id) REFERENCES conversations (_id) ON DELETE CASCADE FOREIGN KEY (participant_id) REFERENCES participants (_id));");
        return sb.toString();
    }

    public static void f(int i, boar... boarVarArr) {
        dqru.B(c(), i, false, new BiConsumer() { // from class: boan
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                boar boarVar = (boar) obj;
                Long l = (Long) obj2;
                String[] strArr = bocg.a;
                if (l.longValue() >= 0) {
                    boarVar.a = String.valueOf(l);
                    boarVar.fN(0);
                }
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, boarVarArr);
    }

    public static dqxa g() {
        return c().M();
    }

    static String[] h() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP INDEX IF EXISTS index_conversation_participants_conversation_id");
        arrayList.add("CREATE INDEX index_conversation_participants_conversation_id ON conversation_participants(conversation_id);");
        arrayList.add("DROP INDEX IF EXISTS index_conversation_participants_participant_id");
        arrayList.add("CREATE INDEX index_conversation_participants_participant_id ON conversation_participants(participant_id);");
        return (String[]) arrayList.toArray(new String[0]);
    }
}
