package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dec {
    public static final deh a(dib dibVar, Object obj) {
        deh dehVar = (deh) dibVar.a.invoke(obj);
        dehVar.d();
        return dehVar;
    }

    public static /* synthetic */ deb b(float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return new deb(diu.a, Float.valueOf(f), new ded(f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static /* synthetic */ deb c(deb debVar, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = ((Number) debVar.a()).floatValue();
        }
        if ((i & 2) != 0) {
            f2 = ((ded) debVar.a).a;
        }
        return new deb(debVar.e, Float.valueOf(f), new ded(f2), debVar.b, debVar.c, debVar.d);
    }
}
