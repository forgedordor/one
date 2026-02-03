package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class feop extends femq implements fenp {
    public static final /* synthetic */ int a = 0;
    private static final long serialVersionUID = -4034423507432249165L;

    static {
        new feop();
    }

    protected feop() {
        b("ABBREV", new fenq());
        b("ALTREP", new fenr());
        b("CN", new fens());
        b("CUTYPE", new fent());
        b("DELEGATED-FROM", new fenu());
        b("DELEGATED-TO", new fenv());
        b("DIR", new fenw());
        b(VCardConstants.PARAM_ENCODING, new fenx());
        b("FMTTYPE", new fenz());
        b("FBTYPE", new feny());
        b(VCardConstants.PARAM_LANGUAGE, new feoa());
        b(VCardConstants.PROPERTY_MEMBER, new feob());
        b("PARTSTAT", new feoc());
        b("RANGE", new feod());
        b(VCardConstants.PROPERTY_RELATED, new feof());
        b("RELTYPE", new feoe());
        b(VCardConstants.PROPERTY_ROLE, new feog());
        b("RSVP", new feoh());
        b("SCHEDULE-AGENT", new feoi());
        b("SCHEDULE-STATUS", new feoj());
        b("SENT-BY", new feok());
        b(VCardConstants.PARAM_TYPE, new feol());
        b("TZID", new feom());
        b(VCardConstants.PARAM_VALUE, new feon());
        b("VVENUE", new feoo());
    }

    @Override // defpackage.fenp
    public final feno a(String str, String str2) {
        fenp fenpVar = (fenp) hN(str);
        if (fenpVar != null) {
            return fenpVar.a(str, str2);
        }
        if (str.startsWith("X-") && str.length() > 2) {
            return new feua(str, str2);
        }
        if (c()) {
            return new feua(str, str2);
        }
        throw new IllegalArgumentException("Invalid parameter name: ".concat(String.valueOf(str)));
    }
}
