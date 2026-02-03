package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfsf extends eyix {
    private final eyir b;

    public dfsf(eyik eyikVar, eyik eyikVar2, eyir eyirVar) {
        super(eyikVar2, new eyji(dfsf.class), eyikVar);
        this.b = eyje.c(eyirVar);
    }

    @Override // defpackage.eyix
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        int i;
        cjgr cjgrVar;
        dftb dftbVar = (dftb) obj;
        dfny dfnyVar = dfsd.a;
        if (dftbVar.b().isPresent()) {
            Object obj2 = dftbVar.b().get();
            dgwe dgweVar = (dgwe) obj2;
            String str = dgweVar.ai() ? dgweVar.z : dgweVar.y;
            if (str == null) {
                throw new IllegalArgumentException(true != dgweVar.ai() ? "contributionId is null in SIMPLE-IM session" : "conversationId is null in CPM session");
            }
            cjgo cjgoVar = (cjgo) cjgr.a.createBuilder();
            cjjq cjjqVar = (cjjq) cjjr.a.createBuilder();
            cjjqVar.copyOnWrite();
            cjjr cjjrVar = (cjjr) cjjqVar.instance;
            cjjrVar.b |= 1;
            cjjrVar.c = str;
            cjgoVar.copyOnWrite();
            cjgr cjgrVar2 = (cjgr) cjgoVar.instance;
            cjjr cjjrVar2 = (cjjr) cjjqVar.build();
            cjjrVar2.getClass();
            cjgrVar2.e = cjjrVar2;
            cjgrVar2.b |= 4;
            dgzn dgznVar = (dgzn) obj2;
            i = dgznVar.E ? 3 : dgznVar.J ? 4 : 2;
            cjgoVar.copyOnWrite();
            cjgr cjgrVar3 = (cjgr) cjgoVar.instance;
            cjgrVar3.c = i - 1;
            cjgrVar3.b |= 1;
            cjju cjjuVarB = dgznVar.E ? dfxc.b(dgznVar.I) : dfxc.a(dgweVar.y());
            cjgoVar.copyOnWrite();
            cjgr cjgrVar4 = (cjgr) cjgoVar.instance;
            cjjuVarB.getClass();
            cjgrVar4.d = cjjuVarB;
            cjgrVar4.b |= 2;
            cjgrVar = (cjgr) cjgoVar.build();
        } else {
            if (!dftbVar.a().isPresent()) {
                throw new IllegalArgumentException("No message or session presented");
            }
            dgyx dgyxVar = (dgyx) dftbVar.a().get();
            if (dgyxVar.o) {
                throw new IllegalArgumentException("Group message was not sent/received with a session!");
            }
            String string = UUID.randomUUID().toString();
            cjgo cjgoVar2 = (cjgo) cjgr.a.createBuilder();
            i = dgyxVar.o ? 3 : dgyxVar.q ? 4 : 2;
            cjgoVar2.copyOnWrite();
            cjgr cjgrVar5 = (cjgr) cjgoVar2.instance;
            cjgrVar5.c = i - 1;
            cjgrVar5.b |= 1;
            cjjq cjjqVar2 = (cjjq) cjjr.a.createBuilder();
            cjjqVar2.copyOnWrite();
            cjjr cjjrVar3 = (cjjr) cjjqVar2.instance;
            string.getClass();
            cjjrVar3.b = 1 | cjjrVar3.b;
            cjjrVar3.c = string;
            cjgoVar2.copyOnWrite();
            cjgr cjgrVar6 = (cjgr) cjgoVar2.instance;
            cjjr cjjrVar4 = (cjjr) cjjqVar2.build();
            cjjrVar4.getClass();
            cjgrVar6.e = cjjrVar4;
            cjgrVar6.b |= 4;
            cjju cjjuVarA = dfxc.a(dgyxVar.c);
            cjgoVar2.copyOnWrite();
            cjgr cjgrVar7 = (cjgr) cjgoVar2.instance;
            cjjuVarA.getClass();
            cjgrVar7.d = cjjuVarA;
            cjgrVar7.b |= 2;
            cjgrVar = (cjgr) cjgoVar2.build();
        }
        return eork.i(cjgrVar);
    }

    @Override // defpackage.eyix
    protected final ListenableFuture c() {
        return this.b.d();
    }
}
