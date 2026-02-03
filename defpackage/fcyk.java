package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcyk implements fcxy, fcyw {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(fcyk.class, Object.class, "result");
    private final fcxy b;
    public volatile Object result;

    public fcyk(fcxy fcxyVar, Object obj) {
        this.b = fcxyVar;
        this.result = obj;
    }

    @Override // defpackage.fcyw
    public final fcyw dJ() {
        fcxy fcxyVar = this.b;
        if (fcxyVar instanceof fcyw) {
            return (fcyw) fcxyVar;
        }
        return null;
    }

    public final String toString() {
        fcxy fcxyVar = this.b;
        Objects.toString(fcxyVar);
        return "SafeContinuation for ".concat(fcxyVar.toString());
    }

    @Override // defpackage.fcxy
    public final fcyh u() {
        return this.b.u();
    }

    @Override // defpackage.fcxy
    public final void w(Object obj) {
        while (true) {
            Object obj2 = this.result;
            fcyl fcylVar = fcyl.b;
            if (obj2 != fcylVar) {
                fcyl fcylVar2 = fcyl.a;
                if (obj2 != fcylVar2) {
                    throw new IllegalStateException("Already resumed");
                }
                if (fcyj.a(a, this, fcylVar2, fcyl.c)) {
                    this.b.w(obj);
                    return;
                }
            } else if (fcyj.a(a, this, fcylVar, obj)) {
                return;
            }
        }
    }

    @Override // defpackage.fcyw
    public final void dK() {
    }
}
