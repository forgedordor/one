package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class tta implements eooz {
    public final /* synthetic */ tvi a;

    @Override // defpackage.eooz
    public final ListenableFuture a(Object obj) {
        final fbtf fbtfVar = (fbtf) obj;
        if (!Status.Code.PERMISSION_DENIED.equals(fbtfVar.a.getCode())) {
            return eijx.d(fbtfVar);
        }
        final tvi tviVar = this.a;
        evrv evrvVar = (evrv) evrw.a.createBuilder();
        evrvVar.a("box_devices");
        return tviVar.k((evrw) evrvVar.build()).i(new eooz() { // from class: ttk
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                tvi tviVar2 = tviVar;
                eiju eijuVarA = tviVar2.g.a((eqiz) obj2);
                final fbtf fbtfVar2 = fbtfVar;
                return eijuVarA.i(new eooz() { // from class: ttg
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj3) {
                        eksp ekspVar = tvi.a;
                        return eijx.d(fbtfVar2);
                    }
                }, tviVar2.h);
            }
        }, tviVar.h);
    }
}
