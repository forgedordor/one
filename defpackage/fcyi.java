package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcyi implements Serializable, fcyh {
    public static final fcyi a = new fcyi();
    private static final long serialVersionUID = 0;

    private fcyi() {
    }

    private final Object readResolve() {
        return a;
    }

    @Override // defpackage.fcyh
    public final <E extends fcyf> E get(fcyg<E> fcygVar) {
        fcygVar.getClass();
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.fcyh
    public final fcyh minusKey(fcyg<?> fcygVar) {
        fcygVar.getClass();
        return this;
    }

    @Override // defpackage.fcyh
    public final fcyh plus(fcyh fcyhVar) {
        fcyhVar.getClass();
        return fcyhVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // defpackage.fcyh
    public final <R> R fold(R r, fdat<? super R, ? super fcyf, ? extends R> fdatVar) {
        return r;
    }
}
