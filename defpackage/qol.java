package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qol {
    public final Object a;
    public final Throwable b;

    public qol(Object obj) {
        this.a = obj;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qol)) {
            return false;
        }
        qol qolVar = (qol) obj;
        Object obj2 = this.a;
        if (obj2 != null && obj2.equals(qolVar.a)) {
            return true;
        }
        Throwable th = this.b;
        if (th == null || qolVar.b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public qol(Throwable th) {
        this.b = th;
        this.a = null;
    }
}
