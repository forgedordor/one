package defpackage;

import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dftk extends eyix {
    private final eyir b;
    private final eyir c;

    public dftk(eyik eyikVar, eyik eyikVar2, eyir eyirVar, eyir eyirVar2) {
        super(eyikVar2, new eyji(dftk.class), eyikVar);
        this.b = eyje.c(eyirVar);
        this.c = eyje.c(eyirVar2);
    }

    @Override // defpackage.eyix
    public final /* bridge */ /* synthetic */ ListenableFuture b(Object obj) {
        List list = (List) obj;
        RemoveUserFromGroupRequest removeUserFromGroupRequest = (RemoveUserFromGroupRequest) list.get(0);
        dfvw dfvwVar = (dfvw) list.get(1);
        if (dfvwVar.d().isPresent()) {
            Object obj2 = dfvwVar.d().get();
            dgvh dgvhVar = (dgvh) obj2;
            if (dgvhVar.a != dgws.STOPPED && dgvhVar.a != dgws.STOPPING) {
                dgzn dgznVar = (dgzn) obj2;
                dftf dftfVar = new dftf(dgznVar, removeUserFromGroupRequest.b());
                dgznVar.aF(dftfVar.c);
                dgznVar.bb(dgwq.LEAVE);
                dgwe dgweVar = (dgwe) obj2;
                if (dgweVar.p) {
                    dgvhVar.l();
                    return dftfVar;
                }
                dgweVar.af(5, 29);
                return dftfVar;
            }
        }
        efcb efcbVar = new efcb();
        efcbVar.b(removeUserFromGroupRequest.b());
        efcbVar.c(dfwf.b(dfvwVar));
        return eork.i(efcbVar.a());
    }

    @Override // defpackage.eyix
    protected final ListenableFuture c() {
        return eork.f(this.b.d(), this.c.d());
    }
}
