package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
@fdac
/* loaded from: classes.dex */
public final class ida {
    public static final Object a(AtomicReference atomicReference) {
        icx icxVar = (icx) atomicReference.get();
        if (icxVar != null) {
            return icxVar.b;
        }
        return null;
    }

    public static final Object b(AtomicReference atomicReference, fdap fdapVar, fdat fdatVar, fcxy fcxyVar) {
        return fdjy.a(new icz(fdapVar, atomicReference, fdatVar, null), fcxyVar);
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
