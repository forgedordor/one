package j$.nio.file;

import java.nio.file.PathMatcher;

/* loaded from: classes9.dex */
public final /* synthetic */ class y implements PathMatcher {
    public final /* synthetic */ z a;

    public /* synthetic */ y(z zVar) {
        this.a = zVar;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        z zVar = this.a;
        if (obj instanceof y) {
            obj = ((y) obj).a;
        }
        return zVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.PathMatcher
    public final /* synthetic */ boolean matches(java.nio.file.Path path) {
        return this.a.g(r.f(path));
    }
}
