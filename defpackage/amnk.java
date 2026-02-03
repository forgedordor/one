package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amnk implements cldw, anpj {
    private final fcsu a;
    private final cqtq b;

    public amnk(fcsu fcsuVar, cqtp cqtpVar) {
        cqtpVar.getClass();
        this.a = fcsuVar;
        this.b = cqtpVar.a(new amnj());
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.b.a(new cqtk() { // from class: amnh
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "DefaultSmsAppObservableSupplier::register", "DefaultSmsAppObservableSupplier::callback", "DefaultSmsAppObservableSupplier::unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        eiju eijuVarE = eijx.e(c());
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.cldw
    public final eiju d(boolean z) {
        this.b.c(new Supplier() { // from class: amni
            @Override // java.util.function.Supplier
            public final Object get() {
                return fctx.a;
            }
        }, "DefaultSmsAppObservableSupplier::notify");
        eiju eijuVarE = eijx.e(null);
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.anpj
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Boolean c() {
        return Boolean.valueOf(((crnp) this.a.b()).d());
    }
}
