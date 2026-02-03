package defpackage;

import java.security.Principal;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dffg extends dfgo {
    private final Principal b;
    private final String c;

    public dffg(Principal principal, String str) {
        this.b = principal;
        if (str == null) {
            throw new NullPointerException("Null password");
        }
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dfgo) {
            dfgo dfgoVar = (dfgo) obj;
            if (this.b.equals(dfgoVar.getUserPrincipal()) && this.c.equals(dfgoVar.getPassword())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dfgo, org.apache.http.auth.Credentials
    public final String getPassword() {
        return this.c;
    }

    @Override // defpackage.dfgo, org.apache.http.auth.Credentials
    public final Principal getUserPrincipal() {
        return this.b;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "GbaCredentials{userPrincipal=" + this.b.toString() + ", password=" + this.c + "}";
    }
}
