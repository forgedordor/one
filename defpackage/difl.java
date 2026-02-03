package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class difl extends difn {
    private final Map a;

    public difl(Map map) {
        this.a = map;
    }

    @Override // defpackage.difn, defpackage.dify
    public final Map a() {
        return this.a;
    }

    @Override // defpackage.dify
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dify) {
            dify difyVar = (dify) obj;
            if (difyVar.b() == 1 && ekmi.m(this.a, difyVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ConfigDataMapOrSyncFailureReason{configDataMap=" + ekmi.g(this.a) + "}";
    }
}
