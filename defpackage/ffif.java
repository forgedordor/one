package defpackage;

import java.security.Permission;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffif extends Permission {
    private final Set a;

    public ffif(String str) {
        super(str);
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        hashSet.add(str);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ffif) && this.a.equals(((ffif) obj).a);
    }

    @Override // java.security.Permission
    public final String getActions() {
        return this.a.toString();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.security.Permission
    public final boolean implies(Permission permission) {
        if (!(permission instanceof ffif)) {
            return false;
        }
        ffif ffifVar = (ffif) permission;
        return getName().equals(ffifVar.getName()) || this.a.containsAll(ffifVar.a);
    }
}
