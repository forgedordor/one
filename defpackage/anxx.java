package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anxx implements awhf {
    final /* synthetic */ anxy a;

    public anxx(anxy anxyVar) {
        this.a = anxyVar;
    }

    @Override // defpackage.awhf
    public final void a(awhi awhiVar, Map map) {
        if (awhiVar != awhi.RCS) {
            return;
        }
        Set setKeySet = map.keySet();
        anxy anxyVar = this.a;
        ekgb ekgbVarG = ekpg.c(setKeySet, anxyVar.f).f().g();
        if (ekgbVarG.isEmpty()) {
            return;
        }
        ((eksl) ((eksl) anxy.a.h()).h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ProviderBatchRcsCapabilitiesSupplier$RcsChangeListener", "onBatchCapabilitiesUpdate", 209, "ProviderBatchRcsCapabilitiesSupplier.java")).w("%d RCS Capabilities updated in batch update: %s", ekgbVarG.size(), anxj.a((Iterable) Collection.EL.stream(ekgbVarG).map(new Function() { // from class: anxl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eksp ekspVar = anxy.a;
                return cqcv.b(((aubq) obj).d);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(ekcv.a)));
        anxyVar.d.c(new Supplier() { // from class: anxv
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "ProviderBatchRcsCapabilitiesSupplier::onBatchCapabilitiesUpdate");
    }

    @Override // defpackage.awhf
    public final void b(awhi awhiVar, aubq aubqVar) {
        if (awhiVar == awhi.RCS) {
            anxy anxyVar = this.a;
            if (anxyVar.f.contains(aubqVar)) {
                ((eksl) ((eksl) anxy.a.h()).h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/ProviderBatchRcsCapabilitiesSupplier$RcsChangeListener", "onCapabilitiesUpdate", 186, "ProviderBatchRcsCapabilitiesSupplier.java")).t("RCS capabilities updated for destination: %s", cqcv.b(aubqVar.d));
                anxyVar.d.c(new Supplier() { // from class: anxw
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return null;
                    }
                }, "ProviderBatchRcsCapabilitiesSupplier::onRcsCapabilitiesUpdate");
            }
        }
    }
}
