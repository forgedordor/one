package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ruq implements res {
    private final Object b;

    public ruq(Object obj) {
        rvi.f(obj);
        this.b = obj;
    }

    @Override // defpackage.res
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(a));
    }

    @Override // defpackage.res
    public final boolean equals(Object obj) {
        if (obj instanceof ruq) {
            return this.b.equals(((ruq) obj).b);
        }
        return false;
    }

    @Override // defpackage.res
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.b.toString() + "}";
    }
}
