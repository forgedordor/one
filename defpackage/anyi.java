package defpackage;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anyi implements awhf {
    final /* synthetic */ anyj a;

    public anyi(anyj anyjVar) {
        this.a = anyjVar;
    }

    @Override // defpackage.awhf
    public final void a(awhi awhiVar, Map map) {
        awhiVar.getClass();
        map.getClass();
        if (awhiVar != awhi.RCS) {
            return;
        }
        anyj anyjVar = this.a;
        List listAo = fcva.ao(fcva.as(map.keySet(), anyjVar.b));
        if (listAo.isEmpty()) {
            return;
        }
        ((eksl) anyj.a.h()).w("%d RCS Capabilities updated in batch update: %s", listAo.size(), fcva.aF(listAo, ", ", null, null, new fdap() { // from class: anyb
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                aubq aubqVar = (aubq) obj;
                aubqVar.getClass();
                String strB = cqcv.b(aubqVar.d);
                strB.getClass();
                return strB;
            }
        }, 30));
        anyjVar.c.c(new Supplier() { // from class: anyh
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "BatchRcsCapabilitiesWithValidityWindowSupplierFactory::onBatchCapabilitiesUpdate");
    }

    @Override // defpackage.awhf
    public final void b(awhi awhiVar, aubq aubqVar) {
        awhiVar.getClass();
        aubqVar.getClass();
        if (awhiVar == awhi.RCS) {
            anyj anyjVar = this.a;
            if (anyjVar.b.contains(aubqVar)) {
                eksl ekslVar = (eksl) anyj.a.h();
                String strB = cqcv.b(aubqVar.d);
                strB.getClass();
                ekslVar.t("RCS capabilities updated for destination: %s", strB);
                anyjVar.c.c(new Supplier() { // from class: anyg
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return null;
                    }
                }, "BatchRcsCapabilitiesWithValidityWindowSupplierFactory::onRcsCapabilitiesUpdate");
            }
        }
    }
}
