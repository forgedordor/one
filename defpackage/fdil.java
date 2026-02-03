package defpackage;

/* loaded from: classes6.dex */
public final class fdil {
    public static final Object a(fcyh fcyhVar, fdat fdatVar, fcxy fcxyVar) {
        return fdin.a(fcyhVar, fdatVar, fcxyVar);
    }

    public static final fdkf b(fdjx fdjxVar, fcyh fcyhVar, fdjz fdjzVar, fdat fdatVar) {
        return fdin.b(fdjxVar, fcyhVar, fdjzVar, fdatVar);
    }

    public static /* synthetic */ fdkf c(fdjx fdjxVar, fdjz fdjzVar, fdat fdatVar, int i) {
        fcyi fcyiVar = (i & 1) != 0 ? fcyi.a : null;
        if ((i & 2) != 0) {
            fdjzVar = fdjz.a;
        }
        return fdin.b(fdjxVar, fcyiVar, fdjzVar, fdatVar);
    }

    public static /* synthetic */ fdlr d(fdjx fdjxVar, fcyh fcyhVar, fdjz fdjzVar, fdat fdatVar, int i) {
        if ((i & 1) != 0) {
            fcyhVar = fcyi.a;
        }
        if ((i & 2) != 0) {
            fdjzVar = fdjz.a;
        }
        return fdin.c(fdjxVar, fcyhVar, fdjzVar, fdatVar);
    }
}
