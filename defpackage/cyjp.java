package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyjp implements ehaw {
    final /* synthetic */ int a;
    final /* synthetic */ cyjq b;

    public cyjp(cyjq cyjqVar, int i) {
        this.a = i;
        this.b = cyjqVar;
    }

    @Override // defpackage.ehaw
    public final egyk a() {
        return new egyb("debug_tachyon_state_data_source");
    }

    @Override // defpackage.ehaw
    public final ListenableFuture b() {
        final cyjq cyjqVar = this.b;
        return cyjqVar.a(this.a).i(new eooz() { // from class: cyjo
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cejg cejgVar = (cejg) obj;
                final eiju eijuVarI = cejgVar.o().i();
                final eiju eijuVarJ = cejgVar.o().j();
                return eijx.m(eijuVarI, eijuVarJ).a(eiid.l(new Callable() { // from class: cyjn
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        cevq cevqVar = (cevq) eork.q(eijuVarI);
                        byte[] bArr = (byte[]) eork.q(eijuVarJ);
                        int iOrdinal = cevqVar.ordinal();
                        return iOrdinal != 0 ? iOrdinal != 1 ? (iOrdinal == 2 || iOrdinal == 3) ? "REGISTERED" : iOrdinal != 4 ? "" : "UNKNOWN" : true != Arrays.equals(bArr, new byte[0]) ? "WAITING_FOR_VERIFICATION" : "NOT REGISTERED" : "UNKNOWN";
                    }
                }), cyjqVar.c);
            }
        }, cyjqVar.c);
    }
}
