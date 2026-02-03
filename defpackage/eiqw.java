package defpackage;

import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiqw extends eiqv {
    public final Map a;
    private final Optional b;

    public eiqw(Map map, Optional optional) {
        if (map == null) {
            throw new NullPointerException("Null paramValues");
        }
        this.a = map;
        this.b = optional;
    }

    @Override // defpackage.eiqv
    public final Optional a() {
        return this.b;
    }

    @Override // defpackage.eiqv
    public final Map b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eiqv) {
            eiqv eiqvVar = (eiqv) obj;
            if (this.a.equals(eiqvVar.b()) && this.b.equals(eiqvVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Optional optional = this.b;
        return "ArgumentsWrapper{paramValues=" + this.a.toString() + ", requestMetadata=" + optional.toString() + "}";
    }
}
