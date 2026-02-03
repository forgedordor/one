package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjbr {
    public final fcsu a;
    private final fcsu b;

    public cjbr(fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
    }

    public final aubq a() {
        return (aubq) ((cejp) this.b.b()).b().orElseThrow(new Supplier() { // from class: cjbn
            @Override // java.util.function.Supplier
            public final Object get() {
                return new IllegalArgumentException("RCS self identity is not present.");
            }
        });
    }
}
