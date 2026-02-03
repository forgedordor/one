package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abnp extends abpg {
    private final abto a;
    private final abqi b;
    private final abqi c;
    private final abpm d;
    private final ejxr e;
    private final boolean f;
    private final ConcurrentHashMap g;

    public abnp(abto abtoVar, abqi abqiVar, abqi abqiVar2, abpm abpmVar, ejxr ejxrVar, boolean z, ConcurrentHashMap concurrentHashMap) {
        this.a = abtoVar;
        this.b = abqiVar;
        this.c = abqiVar2;
        this.d = abpmVar;
        if (ejxrVar == null) {
            throw new NullPointerException("Null openFutureSupplier");
        }
        this.e = ejxrVar;
        this.f = z;
        this.g = concurrentHashMap;
    }

    @Override // defpackage.abpg
    public final abpm a() {
        return this.d;
    }

    @Override // defpackage.abpg
    public final abqi b() {
        return this.b;
    }

    @Override // defpackage.abpg
    public final abqi c() {
        return this.c;
    }

    @Override // defpackage.abpg
    public final abto d() {
        return this.a;
    }

    @Override // defpackage.abpg
    public final ejxr e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abpg) {
            abpg abpgVar = (abpg) obj;
            if (this.a.equals(abpgVar.d()) && this.b.equals(abpgVar.b()) && this.c.equals(abpgVar.c()) && this.d.equals(abpgVar.a()) && this.e.equals(abpgVar.e()) && this.f == abpgVar.g() && this.g.equals(abpgVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.abpg
    public final ConcurrentHashMap f() {
        return this.g;
    }

    @Override // defpackage.abpg
    public final boolean g() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        ConcurrentHashMap concurrentHashMap = this.g;
        ejxr ejxrVar = this.e;
        abpm abpmVar = this.d;
        abqi abqiVar = this.c;
        abqi abqiVar2 = this.b;
        return "JsBridgeChannel{wrappedWebView=" + this.a.toString() + ", incomingRequestTransport=" + abqiVar2.toString() + ", outgoingRequestTransport=" + abqiVar.toString() + ", requestHandler=" + abpmVar.toString() + ", openFutureSupplier=" + ejxrVar.toString() + ", isPaused=" + this.f + ", closeableResources=" + concurrentHashMap.toString() + "}";
    }
}
