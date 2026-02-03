package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class esnm {
    public static esnm b(String str) {
        ejwl.f(ejuq.a.i(str), "Only ASCII header keys are permitted: %s", str);
        return new esmg(str.toLowerCase(Locale.US));
    }

    public abstract String a();
}
