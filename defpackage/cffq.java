package defpackage;

import j$.util.Optional;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cffq {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;

    public cffq(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
        fcsuVar3.getClass();
        this.c = fcsuVar3;
    }

    public final cffp a(long j, Optional optional, Callable callable, Supplier supplier) {
        eosc eoscVar = (eosc) this.a.b();
        eoscVar.getClass();
        cfgs cfgsVar = (cfgs) this.b.b();
        cfgsVar.getClass();
        ((ceop) this.c.b()).getClass();
        return new cffp(eoscVar, cfgsVar, j, optional, callable, supplier);
    }
}
