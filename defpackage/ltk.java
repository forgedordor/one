package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ltk {
    public static final List a;

    static {
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(0.5f);
        a = fcva.g(new fcti(fValueOf, fValueOf), new fcti(fValueOf2, fValueOf2));
    }

    public static final long a(lti ltiVar) {
        List list = ltiVar.b;
        return csy.a((((ltb) fcva.N(list)).a() + ((ltb) fcva.S(list)).c()) / 2.0f, (((ltb) fcva.N(list)).b() + ((ltb) fcva.S(list)).d()) / 2.0f);
    }
}
