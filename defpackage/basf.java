package defpackage;

import android.os.BaseBundle;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class basf {
    public final String b;

    protected basf(String str) {
        this.b = str;
    }

    private static String a(basf basfVar, String str) {
        String str2;
        return (basfVar == null || (str2 = basfVar.b) == null) ? str : str2;
    }

    public static String c(basf basfVar) {
        return a(basfVar, "null");
    }

    public static String d(basf basfVar) {
        if (basfVar == null) {
            return null;
        }
        return basfVar.b;
    }

    public static String e(basf basfVar) {
        return a(basfVar, "");
    }

    public static void h(BaseBundle baseBundle, String str, basf basfVar) {
        baseBundle.putString(str, basfVar.b);
    }

    public static boolean j(basf basfVar) {
        return !l(basfVar);
    }

    public static boolean l(basf basfVar) {
        return basfVar != null && basfVar.k();
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        basf basfVar = (basf) obj;
        String str = this.b;
        boolean z = str == null;
        String str2 = basfVar.b;
        if (z != (str2 == null)) {
            return false;
        }
        if (str == null) {
            return true;
        }
        return str.equals(str2);
    }

    public final String f() {
        String str = this.b;
        return str == null ? "" : str;
    }

    public final void g(Consumer consumer) {
        if (k()) {
            consumer.accept(this);
        }
    }

    public final int hashCode() {
        String str = this.b;
        if (str == null) {
            return 1;
        }
        return str.hashCode();
    }

    public final boolean i() {
        return !k();
    }

    public final boolean k() {
        return this.b != null;
    }

    public final Object m(Function function) {
        return k() ? function.apply(this) : bary.a;
    }
}
