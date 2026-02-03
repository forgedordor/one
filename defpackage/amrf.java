package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amrf implements fdpm {
    final /* synthetic */ amri a;

    public amrf(amri amriVar) {
        this.a = amriVar;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        ((Boolean) obj).booleanValue();
        this.a.e.c(new Supplier() { // from class: amre
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        }, "EmergencyVoiceAccessConstraintSupplier::isVoiceAccessEnabledFlow");
        return fctx.a;
    }
}
