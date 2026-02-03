package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaqp extends cmwg {
    private final abvq a;
    private final eosc b;

    public aaqp(abvq abvqVar, eosc eoscVar) {
        this.a = abvqVar;
        this.b = eoscVar;
    }

    @Override // defpackage.cohg
    public final eieu a() {
        return eiiy.k("CustodianBackgroundStartupTask");
    }

    @Override // defpackage.cmwg
    public final eiju b() {
        eiju eijuVarA = this.a.a();
        eijuVarA.k(auvh.c(new Consumer() { // from class: aaqo
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((Optional) obj).ifPresent(new Consumer() { // from class: aaqn
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        Collection.EL.stream(((aalr) obj2).a).forEach(new Consumer() { // from class: aalq
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj3) {
                                ((aalu) obj3).a();
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }), this.b);
        return eijuVarA;
    }

    @Override // defpackage.cmwz
    public final boolean c() {
        return true;
    }
}
