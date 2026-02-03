package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eibq implements Serializable, eids {
    private static final long serialVersionUID = -5526853588017907499L;

    @Override // defpackage.eids
    public final int a() {
        return 1500;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return eids.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eids)) {
            return false;
        }
        ((eids) obj).a();
        return true;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 1335632595;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.apps.tiktok.tracing.MaxSpansPerTrace(1500)";
    }
}
