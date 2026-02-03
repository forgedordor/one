package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_GroupNotification;
import com.google.android.rcs.client.messaging.data.GroupEvent;
import com.google.android.rcs.client.messaging.data.GroupInformation;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfry extends eyix {
    private final eyir b;
    private final eyir c;
    private final eyir d;
    private final eyir e;
    private final eyir f;

    public dfry(eyik eyikVar, eyik eyikVar2, eyir eyirVar, eyir eyirVar2, eyir eyirVar3, eyir eyirVar4, eyir eyirVar5) {
        super(eyikVar2, new eyji(dfry.class), eyikVar);
        this.b = eyje.c(eyirVar);
        this.c = eyje.c(eyirVar2);
        this.d = eyje.c(eyirVar3);
        this.e = eyje.c(eyirVar4);
        this.f = eyje.c(eyirVar5);
    }

    @Override // defpackage.eyix
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        dfvb dfvbVar = (dfvb) list.get(0);
        dfvi dfviVar = (dfvi) list.get(1);
        efpp efppVar = (efpp) list.get(2);
        efqb efqbVar = (efqb) list.get(3);
        efpx efpxVar = (efpx) list.get(4);
        if (!((Boolean) dfrx.a.a()).booleanValue()) {
            return eork.i(cjjf.a);
        }
        cjjg cjjgVar = (cjjg) cjjh.a.createBuilder();
        cjgr cjgrVar = (cjgr) efppVar.fH().fM(((AutoValue_GroupNotification) dfvbVar.a()).a);
        cjjgVar.copyOnWrite();
        cjjh cjjhVar = (cjjh) cjjgVar.instance;
        cjgrVar.getClass();
        cjjhVar.e = cjgrVar;
        cjjhVar.b |= 2;
        if (((AutoValue_GroupNotification) dfvbVar.a()).b.isPresent()) {
            cjhu cjhuVarA = efqbVar.apply((GroupInformation) ((AutoValue_GroupNotification) dfvbVar.a()).b.get());
            cjjgVar.copyOnWrite();
            cjjh cjjhVar2 = (cjjh) cjjgVar.instance;
            cjhuVarA.getClass();
            cjjhVar2.d = cjhuVarA;
            cjjhVar2.c = 4;
        }
        if (((AutoValue_GroupNotification) dfvbVar.a()).c.isPresent()) {
            cjhs cjhsVarA = efpxVar.apply((GroupEvent) ((AutoValue_GroupNotification) dfvbVar.a()).c.get());
            cjjgVar.copyOnWrite();
            cjjh cjjhVar3 = (cjjh) cjjgVar.instance;
            cjhsVarA.getClass();
            cjjhVar3.d = cjhsVarA;
            cjjhVar3.c = 3;
        }
        cjjh cjjhVar4 = (cjjh) cjjgVar.build();
        cjjc cjjcVar = (cjjc) cjjd.a.createBuilder();
        cjgr cjgrVar2 = cjjhVar4.e;
        if (cjgrVar2 == null) {
            cjgrVar2 = cjgr.a;
        }
        cjjcVar.copyOnWrite();
        cjjd cjjdVar = (cjjd) cjjcVar.instance;
        cjgrVar2.getClass();
        cjjdVar.e = cjgrVar2;
        cjjdVar.b = 1 | cjjdVar.b;
        cjjcVar.copyOnWrite();
        cjjd cjjdVar2 = (cjjd) cjjcVar.instance;
        cjjhVar4.getClass();
        cjjdVar2.d = cjjhVar4;
        cjjdVar2.c = 3;
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
        eyir eyirVar = this.f;
        eyir eyirVar2 = this.e;
        eyir eyirVar3 = this.d;
        return eork.f(this.b.d(), this.c.d(), eyirVar3.d(), eyirVar2.d(), eyirVar.d());
    }
}
