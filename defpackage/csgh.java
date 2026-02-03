package defpackage;

import j$.util.Map;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csgh {
    public static final /* synthetic */ int a = 0;
    private static final Map b;

    static {
        fcwa.g(new fcti(dhun.a, Float.valueOf(0.0f)), new fcti(dhun.b, Float.valueOf(0.5f)), new fcti(dhun.c, Float.valueOf(1.0f)));
        b = fcwa.g(new fcti(dhun.a, csdo.a), new fcti(dhun.b, csdo.b), new fcti(dhun.c, csdo.c));
    }

    public static final csdo a(dhun dhunVar) {
        return (csdo) Map.EL.getOrDefault(b, dhunVar, csdo.a);
    }
}
