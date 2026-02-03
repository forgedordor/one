package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfrz implements awgo {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/inboxmessagedispatcher/TachygramExecutionKeyExtractor");
    private static final List b = fcva.g(ezji.GROUP, ezji.TACHYGRAM_MESSAGE, ezji.REFLECTED_TACHYGRAM_MESSAGE);

    @Override // defpackage.awgo
    public final /* bridge */ /* synthetic */ String a(Object obj) {
        obj.getClass();
        List list = b;
        ezjj ezjjVar = (ezjj) obj;
        ezji ezjiVarB = ezji.b(ezjjVar.d);
        if (ezjiVarB == null) {
            ezjiVarB = ezji.UNRECOGNIZED;
        }
        if (!list.contains(ezjiVarB)) {
            ezji ezjiVarB2 = ezji.b(ezjjVar.d);
            if (ezjiVarB2 == null) {
                ezjiVarB2 = ezji.UNRECOGNIZED;
            }
            throw new IllegalStateException("TachygramExecutionKeyExtractor called for messageType: " + ezjiVarB2.a());
        }
        ezjh ezjhVarB = ezjh.b(ezjjVar.k);
        if (ezjhVarB == null) {
            ezjhVarB = ezjh.UNRECOGNIZED;
        }
        if (ezjhVarB == ezjh.EPHEMERAL) {
            return "default key for parallel execution";
        }
        ezji ezjiVarB3 = ezji.b(ezjjVar.d);
        if (ezjiVarB3 == null) {
            ezjiVarB3 = ezji.UNRECOGNIZED;
        }
        if (ezjiVarB3 != ezji.REFLECTED_TACHYGRAM_MESSAGE) {
            if ((ezjjVar.b & 4) != 0) {
                ezol ezolVar = ezjjVar.j;
                if (ezolVar == null) {
                    ezolVar = ezol.a;
                }
                return "tachygram ".concat(String.valueOf(ezolVar.c));
            }
            ezol ezolVar2 = ezjjVar.g;
            if (ezolVar2 == null) {
                ezolVar2 = ezol.a;
            }
            return "tachygram ".concat(String.valueOf(ezolVar2.c));
        }
        try {
            eztw eztwVar = (eztw) evsn.parseFrom(eztw.a, ((ezjj) obj).e, evrr.a());
            eztwVar.getClass();
            ezol ezolVar3 = eztwVar.c;
            if (ezolVar3 == null) {
                ezolVar3 = ezol.a;
            }
            return "tachygram ".concat(String.valueOf(ezolVar3.c));
        } catch (evtj unused) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleNetwork");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/net/inboxmessagedispatcher/TachygramExecutionKeyExtractor", "extractKey", 46, "TachygramExecutionKeyExtractor.kt")).q("Error parsing ReflectedTachygramMessageContainer proto.");
            return "default key for parallel execution";
        }
    }
}
