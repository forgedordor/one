package defpackage;

import com.google.android.ims.provisioning.config.ImsConfiguration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhfw {
    private final dhfe a = new dhfe();
    private final ImsConfiguration b;

    public dhfw(ImsConfiguration imsConfiguration) {
        this.b = imsConfiguration;
    }

    public final void a(ebqs ebqsVar) {
        if (ebqsVar == null) {
            throw new IllegalArgumentException("SIP response must not be null");
        }
        if (ebqsVar.j("Proxy-Authenticate") != null) {
            dhfe dhfeVar = this.a;
            dhfeVar.b = ebqsVar.k("Proxy-Authenticate", "realm");
            dhfeVar.e = ebqsVar.k("Proxy-Authenticate", "qop");
            dhfeVar.d = ebqsVar.k("Proxy-Authenticate", "nonce");
        }
    }

    public final void b(ebqr ebqrVar) {
        dhfe dhfeVar = this.a;
        if (dhfeVar.b == null || dhfeVar.d == null) {
            return;
        }
        try {
            dhfeVar.c();
            ImsConfiguration imsConfiguration = this.b;
            String strB = dhfeVar.b(imsConfiguration.mAuthDigestUsername, imsConfiguration.mAuthDigestPassword, ebqrVar.z(), ebqrVar.A(), dhfeVar.a(), ebqrVar.g());
            String strQ = "Proxy-Authorization: Digest username=\"" + imsConfiguration.mAuthDigestUsername + "\",uri=\"" + ebqrVar.A() + "\",algorithm=MD5,realm=\"" + dhfeVar.b + "\",nc=" + dhfeVar.a() + ",nonce=\"" + dhfeVar.c + "\",response=\"" + strB + "\",cnonce=\"" + dhfeVar.a + "\"";
            String str = dhfeVar.e;
            if (str != null) {
                strQ = a.q(str, strQ, ",qop=");
            }
            ebqrVar.r(strQ);
        } catch (Exception e) {
            dhja.i(e, "Can't create the proxy authorization header", new Object[0]);
            throw new IllegalArgumentException("Can't create the proxy authorization header");
        }
    }
}
