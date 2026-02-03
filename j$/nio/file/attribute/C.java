package j$.nio.file.attribute;

import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.UserPrincipal;
import javax.security.auth.Subject;

/* loaded from: classes9.dex */
public final /* synthetic */ class C implements E {
    public final /* synthetic */ UserPrincipal a;

    public /* synthetic */ C(UserPrincipal userPrincipal) {
        this.a = userPrincipal;
    }

    public static /* synthetic */ E a(UserPrincipal userPrincipal) {
        if (userPrincipal == null) {
            return null;
        }
        if (userPrincipal instanceof D) {
            return ((D) userPrincipal).a;
        }
        if (!r.w(userPrincipal)) {
            return new C(userPrincipal);
        }
        GroupPrincipal groupPrincipalL = r.l(userPrincipal);
        if (groupPrincipalL == null) {
            return null;
        }
        return new x(groupPrincipalL);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        UserPrincipal userPrincipal = this.a;
        if (obj instanceof C) {
            obj = ((C) obj).a;
        }
        return userPrincipal.equals(obj);
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
