package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aivi {
    private final cqce a = cqce.g("Bugle", "LogEmitter");
    private final fcsu b;
    private final boolean c;

    public aivi(fcsu fcsuVar, cqpz cqpzVar) {
        this.b = fcsuVar;
        this.c = cqpzVar.i("bugle_enable_analytics", true);
    }

    public final boolean a(Supplier supplier) {
        boolean z = false;
        if (!this.c) {
            this.a.m("Clearcut loggings are disabled.");
            return false;
        }
        try {
            ellg ellgVar = (ellg) supplier.get();
            if (1 == (((ellh) ellgVar.instance).b & 1)) {
                z = true;
            }
            ejwl.a(z);
            ((aill) this.b.b()).j(ellgVar);
        } catch (Throwable th) {
            this.a.o("Failed to emit event", th);
        }
        return true;
    }
}
