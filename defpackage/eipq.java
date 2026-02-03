package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eipq {
    public static final eipq a = new eipm(5);
    public static final eipq b = new eipm(3);
    public static final eipq c = new eipm(4);
    public static final eipq d = new eipm(7);
    public static final eipq e = new eipm(8);

    public abstract String a();

    public abstract int b();

    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putString("__error__", eipp.a(b()));
        if (!a().isEmpty()) {
            bundle.putString("__error_details__", a());
        }
        return bundle;
    }

    public final String toString() {
        return String.format("%s, %s", eipp.a(b()), a());
    }
}
