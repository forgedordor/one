package defpackage;

import com.google.android.ims.rcsservice.businessinfo.AgentUseCase;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anvx {
    public final bktm a;

    public anvx(bktm bktmVar) {
        this.a = bktmVar;
    }

    public final AgentUseCase a() {
        return this.a.f();
    }

    public final String b() {
        return this.a.i();
    }

    public final String c() {
        return this.a.g();
    }

    public final String d() {
        return this.a.j();
    }

    public final String e() {
        return this.a.k();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!fdbq.f(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return fdbq.f(this.a, ((anvx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
