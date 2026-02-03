package defpackage;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fcyt implements Serializable, fcxy, fcyw {
    public final fcxy C;

    public fcyt(fcxy fcxyVar) {
        this.C = fcxyVar;
    }

    protected abstract Object b(Object obj);

    public fcxy c(Object obj, fcxy fcxyVar) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // defpackage.fcyw
    public fcyw dJ() {
        fcxy fcxyVar = this.C;
        if (fcxyVar instanceof fcyw) {
            return (fcyw) fcxyVar;
        }
        return null;
    }

    public String toString() {
        String name = getClass().getName();
        Objects.toString(name);
        return "Continuation at ".concat(String.valueOf(name));
    }

    @Override // defpackage.fcxy
    public final void w(Object obj) {
        fcxy fcxyVar = this;
        while (true) {
            fcxyVar.getClass();
            fcyt fcytVar = (fcyt) fcxyVar;
            fcxy fcxyVar2 = fcytVar.C;
            fcxyVar2.getClass();
            try {
                obj = fcytVar.b(obj);
                if (obj == fcyl.a) {
                    return;
                }
            } catch (Throwable th) {
                obj = fctl.a(th);
            }
            fcytVar.f();
            if (!(fcxyVar2 instanceof fcyt)) {
                fcxyVar2.w(obj);
                return;
            }
            fcxyVar = fcxyVar2;
        }
    }

    @Override // defpackage.fcyw
    public void dK() {
    }

    protected void f() {
    }
}
