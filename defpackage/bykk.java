package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bykk {
    private static final cqce a = cqce.g("BugleCms", "CmsBuilderDependencyQueue");

    public static final ekgb a(byiv byivVar, List list) {
        int iA;
        int i;
        cqbd cqbdVarA = a.a();
        cqbdVarA.I("Missing dependencies for item");
        cqbdVarA.A("itemId", byivVar.e);
        int i2 = ekgb.d;
        ekfw ekfwVar = new ekfw();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cpys cpysVar = (cpys) it.next();
            int iB = cpysVar.b() - 1;
            cqbdVarA.A(iB != 0 ? iB != 1 ? iB != 3 ? iB != 4 ? "MessageId" : "cms_encryption_key_index" : "backup_key_index" : "ConversationId" : "ParticipantId", cpysVar.a());
            int iB2 = cpysVar.b() - 1;
            int i3 = iB2 != 0 ? iB2 != 1 ? (iB2 == 3 || iB2 == 4) ? 7 : 1 : 2 : 3;
            if (i3 == 7) {
                int iB3 = cpysVar.b() - 1;
                if (iB3 == 3) {
                    i = 2;
                } else {
                    if (iB3 != 4) {
                        throw new UnsupportedOperationException("Cannot getKeyType() for non-key dependency");
                    }
                    i = 1;
                }
                ejxr ejxrVar = byqi.a;
                iA = byrx.c(i);
            } else {
                iA = bzas.a(17);
            }
            byiu byiuVar = (byiu) byiv.a.createBuilder();
            int i4 = byivVar.c;
            byiuVar.copyOnWrite();
            byiv byivVar2 = (byiv) byiuVar.instance;
            byivVar2.b = 1 | byivVar2.b;
            byivVar2.c = i4;
            byiuVar.copyOnWrite();
            byiv byivVar3 = (byiv) byiuVar.instance;
            byivVar3.b = 2 | byivVar3.b;
            byivVar3.d = i3;
            String strA = cpysVar.a();
            byiuVar.copyOnWrite();
            byiv byivVar4 = (byiv) byiuVar.instance;
            byivVar4.b = 4 | byivVar4.b;
            byivVar4.e = strA;
            byiuVar.copyOnWrite();
            byiv byivVar5 = (byiv) byiuVar.instance;
            byivVar5.b |= 8;
            byivVar5.f = iA;
            boolean z = byivVar.g;
            byiuVar.copyOnWrite();
            byiv byivVar6 = (byiv) byiuVar.instance;
            byivVar6.b |= 16;
            byivVar6.g = z;
            ekfwVar.h((byiv) byiuVar.build());
            cqbdVarA.I("added");
        }
        cqbdVarA.r();
        return ekfwVar.g();
    }
}
