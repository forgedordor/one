package defpackage;

import android.text.TextUtils;
import j$.util.OptionalLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgxh {
    private final dgxf a;

    public dgxh(dgxf dgxfVar) {
        this.a = dgxfVar;
    }

    final dgwx a(String str, boolean z) {
        dgwx dgwxVarB = this.a.b();
        if (str != null) {
            if (str.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.im")) {
                dgwxVarB.e(true);
                if (dfpo.u() && z) {
                    dgwxVarB.q(str.contains(dhbr.a()));
                } else {
                    dgwxVarB.q(true);
                }
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.ft")) {
                dgwxVarB.n(true);
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.ftthumb")) {
                dgwxVarB.f(true);
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopush")) {
                dgwxVarB.k(true);
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopullft")) {
                dgwxVarB.j(true);
            }
            if (str.contains("+g.gsma.rcs.ipvideocallonly")) {
                dgwxVarB.o(true);
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-service.ims.icsi.mmtel") || str.contains("+g.gsma.rcs.ipcall")) {
                dgwxVarB.m(true);
            }
            if ((str.contains("urn%3Aurn-7%3A3gpp-service.ims.icsi.mmtel") || str.contains("+g.gsma.rcs.ipcall")) && str.contains("video")) {
                dgwxVarB.P();
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.joyn.intmsg")) {
                dgwxVarB.h(true);
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp")) {
                dgwxVarB.i(true);
            }
            if (str.contains("+g.jibe.stickers")) {
                dgwxVarB.s(true);
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.callcomposer")) {
                dgwxVarB.O();
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.callunanswered")) {
                dgwxVarB.Q();
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.sharedmap")) {
                dgwxVarB.R();
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.sharedsketch")) {
                dgwxVarB.S();
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.ftsms")) {
                dgwxVarB.g(true);
            }
            if (str.contains("urn%3Aurn-7%3A3gppapplication.ims.iari.rcs.geosms")) {
                dgwxVarB.l(true);
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.chatbot")) {
                dgwxVarB.p(true);
                if (str.contains(dgwx.d())) {
                    dgwxVarB.r(true);
                }
            }
        }
        return dgwxVarB;
    }

    final dgwx b(ebqq ebqqVar, boolean z) {
        OptionalLong optionalLongEmpty;
        if (ebqqVar == null) {
            throw new IllegalArgumentException("SIP message must not be null");
        }
        dgwx dgwxVarA = a(ebqqVar.j("Contact"), z);
        String strJ = ebqqVar.j("P-Last-Online");
        if (TextUtils.isEmpty(strJ)) {
            optionalLongEmpty = OptionalLong.empty();
        } else {
            try {
                optionalLongEmpty = OptionalLong.of(Long.parseLong(strJ) * 1000);
            } catch (Exception unused) {
                dhja.q("Unable to parse last activity timestamp: %s", strJ);
                optionalLongEmpty = OptionalLong.empty();
            }
        }
        if (optionalLongEmpty.isPresent()) {
            dgwxVarA.e = optionalLongEmpty.getAsLong();
        }
        return dgwxVarA;
    }
}
