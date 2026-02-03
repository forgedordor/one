package defpackage;

import android.util.Log;
import j$.util.Objects;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aew {
    public final int a;
    public final Object b;
    public final String c;

    public aew(int i, Object obj, String str) {
        this.a = i;
        this.b = obj;
        this.c = str;
    }

    public static aew a(Throwable th) {
        boolean z = th instanceof ahy;
        if (!z || ((ahy) th).a != 6) {
            Log.w("AppSearchResult", "Converting throwable to failed result.", th);
            if (!z) {
                String simpleName = th.getClass().getSimpleName();
                int i = 2;
                if (!(th instanceof IllegalStateException) && !(th instanceof NullPointerException)) {
                    i = th instanceof IllegalArgumentException ? 3 : th instanceof IOException ? 4 : th instanceof SecurityException ? 8 : 1;
                }
                return new aew(i, null, simpleName + ": " + th.getMessage());
            }
        }
        ahy ahyVar = (ahy) th;
        return new aew(ahyVar.a, null, ahyVar.getMessage());
    }

    public final boolean b() {
        return this.a == 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aew)) {
            return false;
        }
        aew aewVar = (aew) obj;
        return this.a == aewVar.a && Objects.equals(this.b, aewVar.b) && Objects.equals(this.c, aewVar.c);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c);
    }

    public final String toString() {
        if (b()) {
            Object obj = this.b;
            java.util.Objects.toString(obj);
            return "[SUCCESS]: ".concat(String.valueOf(obj));
        }
        return "[FAILURE(" + this.a + ")]: " + this.c;
    }
}
