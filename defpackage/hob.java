package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hob {
    public static final hny a = new hny();

    public static final fdjx a(fcyh fcyhVar, hml hmlVar) {
        fcyhVar.get(fdlr.c);
        return new hqw(hmlVar.g(), fcyhVar);
    }

    public static final void b(Object obj, Object obj2, fdap fdapVar, hml hmlVar) {
        boolean zD = hmlVar.D(obj) | hmlVar.D(obj2);
        hmw hmwVar = (hmw) hmlVar;
        Object objS = hmwVar.S();
        if (zD || objS == hmk.a) {
            objS = new hnw(fdapVar);
            hmwVar.af(objS);
        }
    }

    public static final void c(Object obj, fdap fdapVar, hml hmlVar) {
        boolean zD = hmlVar.D(obj);
        Object objF = hmlVar.f();
        if (zD || objF == hmk.a) {
            objF = new hnw(fdapVar);
            hmlVar.y(objF);
        }
    }

    public static final void d(Object[] objArr, fdap fdapVar, hml hmlVar) {
        boolean zD = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zD |= hmlVar.D(obj);
        }
        Object objF = hmlVar.f();
        if (zD || objF == hmk.a) {
            hmlVar.y(new hnw(fdapVar));
        }
    }

    public static final void e(Object obj, Object obj2, Object obj3, fdat fdatVar, hml hmlVar) {
        boolean zD = hmlVar.D(obj) | hmlVar.D(obj2) | hmlVar.D(obj3);
        hmw hmwVar = (hmw) hmlVar;
        Object objS = hmwVar.S();
        if (zD || objS == hmk.a) {
            objS = new hom(hmwVar.y, fdatVar);
            hmwVar.af(objS);
        }
    }

    public static final void f(Object obj, Object obj2, fdat fdatVar, hml hmlVar) {
        fcyh fcyhVarG = hmlVar.g();
        boolean zD = hmlVar.D(obj) | hmlVar.D(obj2);
        Object objF = hmlVar.f();
        if (zD || objF == hmk.a) {
            objF = new hom(fcyhVarG, fdatVar);
            hmlVar.y(objF);
        }
    }

    public static final void g(Object obj, fdat fdatVar, hml hmlVar) {
        fcyh fcyhVarG = hmlVar.g();
        boolean zD = hmlVar.D(obj);
        Object objF = hmlVar.f();
        if (zD || objF == hmk.a) {
            objF = new hom(fcyhVarG, fdatVar);
            hmlVar.y(objF);
        }
    }

    public static final void h(Object[] objArr, fdat fdatVar, hml hmlVar) {
        fcyh fcyhVarG = hmlVar.g();
        boolean zD = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zD |= hmlVar.D(obj);
        }
        Object objF = hmlVar.f();
        if (zD || objF == hmk.a) {
            hmlVar.y(new hom(fcyhVarG, fdatVar));
        }
    }

    public static final void i(fdae fdaeVar, hml hmlVar) {
        hmlVar.r(fdaeVar);
    }
}
