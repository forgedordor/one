package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcnh {
    public static final fdpl a(fbnd fbndVar, fbrk fbrkVar, Object obj, fbnc fbncVar, fbrg fbrgVar) {
        if (fbrkVar.a == fbrj.SERVER_STREAMING) {
            return c(fbndVar, fbrkVar, fbncVar, fbrgVar, new fcmz(obj));
        }
        Objects.toString(fbrkVar);
        throw new IllegalArgumentException("Expected a server streaming RPC method, but got ".concat(fbrkVar.toString()));
    }

    public static final Object b(fbnd fbndVar, fbrk fbrkVar, Object obj, fbnc fbncVar, fbrg fbrgVar, fcxy fcxyVar) {
        if (fbrkVar.a == fbrj.UNARY) {
            return fdtc.f(fcnn.a(c(fbndVar, fbrkVar, fbncVar, fbrgVar, new fcmz(obj)), fbrkVar), fcxyVar);
        }
        Objects.toString(fbrkVar);
        throw new IllegalArgumentException("Expected a unary RPC method, but got ".concat(fbrkVar.toString()));
    }

    private static final fdpl c(fbnd fbndVar, fbrk fbrkVar, fbnc fbncVar, fbrg fbrgVar, fcna fcnaVar) {
        return new fdui(new fcng(fbncVar, fbndVar, fbrkVar, fbrgVar, fcnaVar, null));
    }
}
