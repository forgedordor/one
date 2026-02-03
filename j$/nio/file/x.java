package j$.nio.file;

import java.nio.file.PathMatcher;

/* loaded from: classes9.dex */
public final /* synthetic */ class x implements z {
    public final /* synthetic */ PathMatcher a;

    public /* synthetic */ x(PathMatcher pathMatcher) {
        this.a = pathMatcher;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PathMatcher pathMatcher = this.a;
        if (obj instanceof x) {
            obj = ((x) obj).a;
        }
        return pathMatcher.equals(obj);
    }

    @Override // j$.nio.file.z
    public final /* synthetic */ boolean g(Path path) {
        return this.a.matches(s.f(path));
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
