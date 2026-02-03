package j$.nio.file.attribute;

import java.nio.file.attribute.UserPrincipal;
import javax.security.auth.Subject;

/* loaded from: classes9.dex */
public final /* synthetic */ class D implements UserPrincipal {
    public final /* synthetic */ E a;

    public /* synthetic */ D(E e) {
        this.a = e;
    }

    public static /* synthetic */ UserPrincipal a(E e) {
        if (e == null) {
            return null;
        }
        return e instanceof C ? ((C) e).a : e instanceof x ? ((x) e).a : new D(e);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        E e = this.a;
        if (obj instanceof D) {
            obj = ((D) obj).a;
        }
        return e.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String getName() {
        return this.a.getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(Subject subject) {
        return this.a.implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String toString() {
        return this.a.toString();
    }
}
