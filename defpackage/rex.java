package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rex implements res {
    public final csq b = new ruv();

    @Override // defpackage.res
    public final void a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            csq csqVar = this.b;
            if (i >= csqVar.d) {
                return;
            }
            rew rewVar = (rew) csqVar.d(i);
            Object objG = csqVar.g(i);
            rev revVar = rewVar.c;
            if (rewVar.e == null) {
                rewVar.e = rewVar.d.getBytes(res.a);
            }
            revVar.a(rewVar.e, objG, messageDigest);
            i++;
        }
    }

    public final Object b(rew rewVar) {
        csq csqVar = this.b;
        return csqVar.containsKey(rewVar) ? csqVar.get(rewVar) : rewVar.b;
    }

    public final void c(rex rexVar) {
        this.b.i(rexVar.b);
    }

    public final void d(rew rewVar, Object obj) {
        this.b.put(rewVar, obj);
    }

    @Override // defpackage.res
    public final boolean equals(Object obj) {
        if (obj instanceof rex) {
            return this.b.equals(((rex) obj).b);
        }
        return false;
    }

    @Override // defpackage.res
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.b.toString() + "}";
    }
}
