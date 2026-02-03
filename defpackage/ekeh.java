package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ekeh implements Iterable {
    private final ejwi a;

    protected ekeh() {
        this.a = ejud.a;
    }

    public static ekeh b(Iterable iterable, Iterable iterable2) {
        Iterable[] iterableArr = {iterable, iterable2};
        for (int i = 0; i < 2; i++) {
            iterableArr[i].getClass();
        }
        return new ekeg(iterableArr);
    }

    public static ekeh d(Iterable iterable) {
        return iterable instanceof ekeh ? (ekeh) iterable : new ekec(iterable, iterable);
    }

    public static ekeh e(Object[] objArr) {
        return d(Arrays.asList(objArr));
    }

    public final ejwi a(ejwm ejwmVar) {
        return ekis.c(h(), ejwmVar);
    }

    public final ekeh c(ejwm ejwmVar) {
        return d(ekis.d(h(), ejwmVar));
    }

    public final ekeh f(ejvr ejvrVar) {
        return d(ekis.f(h(), ejvrVar));
    }

    public final ekgb g() {
        return ekgb.j(h());
    }

    public final Iterable h() {
        return (Iterable) this.a.e(this);
    }

    public final String toString() {
        return ekis.n(h());
    }

    public ekeh(Iterable iterable) {
        this.a = ejwi.j(iterable);
    }
}
