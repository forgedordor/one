package defpackage;

import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efpp extends efoq {
    static final ejvj a = new efqw();

    @Override // defpackage.efoq, defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        Conversation conversation = (Conversation) obj;
        cjgo cjgoVar = (cjgo) cjgr.a.createBuilder();
        cjjq cjjqVar = (cjjq) cjjr.a.createBuilder();
        String strB = conversation.b();
        cjjqVar.copyOnWrite();
        cjjr cjjrVar = (cjjr) cjjqVar.instance;
        cjjrVar.b |= 1;
        cjjrVar.c = strB;
        cjjr cjjrVar2 = (cjjr) cjjqVar.build();
        cjgoVar.copyOnWrite();
        cjgr cjgrVar = (cjgr) cjgoVar.instance;
        cjjrVar2.getClass();
        cjgrVar.e = cjjrVar2;
        cjgrVar.b |= 4;
        cjju cjjuVar = (cjju) a.fH().fM(conversation.a());
        cjgoVar.copyOnWrite();
        cjgr cjgrVar2 = (cjgr) cjgoVar.instance;
        cjjuVar.getClass();
        cjgrVar2.d = cjjuVar;
        cjgrVar2.b |= 2;
        int i = conversation.c() + (-1) != 0 ? 3 : 2;
        cjgoVar.copyOnWrite();
        cjgr cjgrVar3 = (cjgr) cjgoVar.instance;
        cjgrVar3.c = i - 1;
        cjgrVar3.b |= 1;
        return (cjgr) cjgoVar.build();
    }

    @Override // defpackage.efoq, defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        cjgr cjgrVar = (cjgr) obj;
        efhi efhiVar = new efhi();
        ejvj ejvjVar = a;
        cjju cjjuVar = cjgrVar.d;
        if (cjjuVar == null) {
            cjjuVar = cjju.a;
        }
        efhiVar.b((RcsDestinationId) ejvjVar.fM(cjjuVar));
        int iA = cjgq.a(cjgrVar.c);
        int i = 1;
        if (iA == 0) {
            iA = 1;
        }
        int i2 = iA - 1;
        if (i2 != 1) {
            if (i2 == 2) {
                i = 2;
            } else if (i2 != 3) {
                throw new IllegalArgumentException("Conversation type not supported");
            }
        }
        efhiVar.d(i);
        cjjr cjjrVar = cjgrVar.e;
        if (cjjrVar == null) {
            cjjrVar = cjjr.a;
        }
        efhiVar.c(cjjrVar.c);
        return efhiVar.a();
    }
}
