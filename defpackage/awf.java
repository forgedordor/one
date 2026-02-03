package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awf {
    private final awd a;

    private awf(awd awdVar) {
        this.a = awdVar;
    }

    public static awf a(Object obj) {
        if (obj == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 31 ? new awf(new awe(obj)) : new awf(new awd(obj));
    }

    public final Object b() {
        return this.a.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof awf) {
            return this.a.equals(((awf) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
