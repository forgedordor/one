package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgaa extends dgab {
    public final dhfe a = new dhfe();
    public boolean b = true;

    @Override // defpackage.dgab
    public final void a() {
        dhfe dhfeVar = this.a;
        dhfeVar.d = null;
        dhfeVar.b = null;
        dhfeVar.c = null;
    }

    @Override // defpackage.dgab
    public final void b(ebqs ebqsVar) throws dfzh {
        String strSubstring;
        String strJ = ebqsVar.j("WWW-Authenticate");
        String strJ2 = ebqsVar.j("Authentication-Info");
        if (strJ != null) {
            try {
                dhfe dhfeVar = this.a;
                dhfeVar.b = ebqsVar.k("WWW-Authenticate", "realm");
                dhfeVar.e = ebqsVar.k("WWW-Authenticate", "qop");
                dhfeVar.d = ebqsVar.k("WWW-Authenticate", "nonce");
                return;
            } catch (Exception e) {
                dhja.i(e, "Can't read the WWW-Authenticate header", new Object[0]);
                throw new dfzh("Can't read the security header: ".concat(String.valueOf(e.getMessage())), e);
            }
        }
        if (strJ2 == null) {
            if (this.b) {
                a();
                return;
            }
            return;
        }
        try {
            dhfe dhfeVar2 = this.a;
            ebkr ebkrVar = dhjv.a;
            int iIndexOf = strJ2.indexOf("nextnonce=");
            if (iIndexOf != -1) {
                int iIndexOf2 = strJ2.indexOf(",", iIndexOf);
                if (iIndexOf2 == -1) {
                    iIndexOf2 = strJ2.length();
                }
                strSubstring = strJ2.substring(iIndexOf + 11, iIndexOf2 - 1);
            } else {
                strSubstring = null;
            }
            dhfeVar2.d = strSubstring;
        } catch (Exception e2) {
            dhja.i(e2, "Can't read the authentication-info header", new Object[0]);
            throw new dfzh("Can't read the security header".concat(String.valueOf(e2.getMessage())), e2);
        }
    }
}
