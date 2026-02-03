package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class cmgh {
    public static cmgg c() {
        cmfl cmflVar = new cmfl();
        cmflVar.b(false);
        return cmflVar;
    }

    public abstract cmfn a();

    public abstract Optional b();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cmgh) {
            cmgh cmghVar = (cmgh) obj;
            if (a().equals(cmghVar.a()) && b().equals(cmghVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((a().hashCode() ^ 1000003) * 1000003) ^ b().hashCode();
    }
}
