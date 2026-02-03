package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfsk extends eyix {
    private final eyir b;
    private final eyir c;

    public dfsk(eyik eyikVar, eyik eyikVar2, eyir eyirVar, eyir eyirVar2) {
        super(eyikVar2, new eyji(dfsk.class), eyikVar);
        this.b = eyje.c(eyirVar);
        this.c = eyje.c(eyirVar2);
    }

    @Override // defpackage.eyix
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        Optional optional = (Optional) list.get(0);
        dfvi dfviVar = (dfvi) list.get(1);
        if (!((Boolean) dfsd.b.a()).booleanValue() || !optional.isPresent()) {
            return eork.i(cjjf.a);
        }
        cjjl cjjlVar = (cjjl) optional.get();
        cjjc cjjcVar = (cjjc) cjjd.a.createBuilder();
        cjgr cjgrVar = cjjlVar.d;
        if (cjgrVar == null) {
            cjgrVar = cjgr.a;
        }
        cjjcVar.copyOnWrite();
        cjjd cjjdVar = (cjjd) cjjcVar.instance;
        cjgrVar.getClass();
        cjjdVar.e = cjgrVar;
        cjjdVar.b = 1 | cjjdVar.b;
        cjjcVar.copyOnWrite();
        cjjd cjjdVar2 = (cjjd) cjjcVar.instance;
        cjjdVar2.d = cjjlVar;
        cjjdVar2.c = 2;
        cjjcVar.copyOnWrite();
        cjjd cjjdVar3 = (cjjd) cjjcVar.instance;
        cjjdVar3.b |= 8;
        cjjdVar3.h = 0;
        evvp evvpVarB = evwz.b(dfviVar.b.f());
        cjjcVar.copyOnWrite();
        cjjd cjjdVar4 = (cjjd) cjjcVar.instance;
        evvpVarB.getClass();
        cjjdVar4.f = evvpVarB;
        cjjdVar4.b |= 2;
        return dfviVar.a((cjjd) cjjcVar.build());
    }

    @Override // defpackage.eyix
    protected final ListenableFuture c() {
        return eork.f(this.b.d(), this.c.d());
    }
}
