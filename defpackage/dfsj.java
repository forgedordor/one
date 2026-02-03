package defpackage;

import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.TraceId;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfsj extends eyix {
    private final eyir b;
    private final eyir c;
    private final eyir d;
    private final eyir e;
    private final eyir f;

    public dfsj(eyik eyikVar, eyik eyikVar2, eyir eyirVar, eyir eyirVar2, eyir eyirVar3, eyir eyirVar4, eyir eyirVar5) {
        super(eyikVar2, new eyji(dfsj.class), eyikVar);
        this.b = eyje.c(eyirVar);
        this.c = eyje.c(eyirVar2);
        this.d = eyje.c(eyirVar3);
        this.e = eyje.c(eyirVar4);
        this.f = eyje.c(eyirVar5);
    }

    @Override // defpackage.eyix
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        Optional optionalEmpty;
        List list = (List) obj;
        Optional optional = (Optional) list.get(0);
        cjgr cjgrVar = (cjgr) list.get(1);
        efqs efqsVar = (efqs) list.get(2);
        TraceId traceId = (TraceId) list.get(3);
        efra efraVar = (efra) list.get(4);
        dfny dfnyVar = dfsd.a;
        if (optional.isPresent()) {
            cjjk cjjkVar = (cjjk) cjjl.a.createBuilder();
            cjlm cjlmVar = (cjlm) efraVar.fH().fM(traceId);
            cjjkVar.copyOnWrite();
            cjjl cjjlVar = (cjjl) cjjkVar.instance;
            cjlmVar.getClass();
            cjjlVar.c = cjlmVar;
            cjjlVar.b |= 1;
            cjib cjibVar = (cjib) efqsVar.fH().fM((Message) optional.get());
            cjjkVar.copyOnWrite();
            cjjl cjjlVar2 = (cjjl) cjjkVar.instance;
            cjibVar.getClass();
            cjjlVar2.e = cjibVar;
            cjjlVar2.b |= 4;
            cjjkVar.copyOnWrite();
            cjjl cjjlVar3 = (cjjl) cjjkVar.instance;
            cjgrVar.getClass();
            cjjlVar3.d = cjgrVar;
            cjjlVar3.b |= 2;
            optionalEmpty = Optional.of((cjjl) cjjkVar.build());
        } else {
            optionalEmpty = Optional.empty();
        }
        return eork.i(optionalEmpty);
    }

    @Override // defpackage.eyix
    protected final ListenableFuture c() {
        eyir eyirVar = this.f;
        eyir eyirVar2 = this.e;
        eyir eyirVar3 = this.d;
        return eork.f(this.b.d(), this.c.d(), eyirVar3.d(), eyirVar2.d(), eyirVar.d());
    }
}
