package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class deia implements degp {
    protected final void b(degq degqVar) {
        if (degqVar.a != this) {
            throw new IllegalArgumentException(String.format("Ticks (%s) must be from this Ticker (%s)", degqVar, this));
        }
    }
}
