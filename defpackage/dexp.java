package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dexp {
    public static final /* synthetic */ int a = 0;

    static {
        dfod.a(185025024);
    }

    public static dgyx a(dgzn dgznVar, String str, String str2, byte[] bArr, eyga eygaVar) {
        ebky ebkyVar = dgznVar.l;
        if (!dgznVar.E) {
            String str3 = ebkyVar.g;
            dgznVar.y();
            return c(str, str2, bArr, eygaVar, dgznVar.ai());
        }
        String str4 = ebkyVar.g;
        String str5 = dgznVar.I;
        ebcp ebcpVarB = b(str2, bArr, str, eygaVar, dgznVar.ai());
        if (str4 != null) {
            ebcpVarB.l(str4);
        }
        ebcpVarB.p("sip:anonymous@anonymous.invalid");
        return d(ebcpVarB, str);
    }

    public static ebcp b(String str, byte[] bArr, String str2, eyga eygaVar, boolean z) {
        ebcp ebcpVar = new ebcp(str, "utf-8");
        ebcpVar.m("DateTime", dhie.a().toString());
        ebcpVar.j(bArr);
        ebcpVar.o("imdn", "urn:ietf:params:imdn");
        ebcpVar.n("urn:ietf:params:imdn", "Disposition-Notification", (dfpk.v() && z) ? dgzn.D + ", " + ebcu.INTERWORKING_SMS.p : dgzn.D);
        ebcpVar.n("urn:ietf:params:imdn", "Message-ID", str2);
        for (Map.Entry entry : DesugarCollections.unmodifiableMap(eygaVar.b).entrySet()) {
            String str3 = (String) entry.getKey();
            for (Map.Entry entry2 : DesugarCollections.unmodifiableMap(((eyge) entry.getValue()).b).entrySet()) {
                ebcpVar.n(str3, (String) entry2.getKey(), (String) entry2.getValue());
            }
        }
        return ebcpVar;
    }

    public static dgyx c(String str, String str2, byte[] bArr, eyga eygaVar, boolean z) {
        ebcp ebcpVarB = b(str2, bArr, str, eygaVar, z);
        ebcpVarB.l("sip:anonymous@anonymous.invalid");
        ebcpVarB.p("sip:anonymous@anonymous.invalid");
        return d(ebcpVarB, str);
    }

    private static dgyx d(ebcp ebcpVar, String str) {
        String strI = ebcpVar.i();
        strI.getClass();
        dgyx dgyxVar = new dgyx(strI, ebcpVar);
        dgyxVar.k = str;
        String strF = ebcpVar.f();
        strF.getClass();
        dgyxVar.c = strF;
        return dgyxVar;
    }
}
