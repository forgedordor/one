package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dham extends dgzn {
    public static final /* synthetic */ int Z = 0;
    public boolean Y;
    private ebjr aa;
    private String ab;
    private String ac;
    private String ad;
    private int ae;

    public dham(Context context, dgvq dgvqVar, fcsu fcsuVar, String str, ebja ebjaVar, dhgr dhgrVar, dfcg dfcgVar, dhjt dhjtVar, InstantMessageConfiguration instantMessageConfiguration, int i, deza dezaVar) {
        super(context, dgvqVar, fcsuVar, str, ebjaVar, dhgrVar, dfcgVar, dhjtVar, instantMessageConfiguration, i, dezaVar);
        dhja.c("Creating a new chat session as originating to %s", dhiz.USER_ID.c(str));
    }

    @Override // defpackage.dgwe
    protected final String A() {
        return "OriginatingChatSession";
    }

    @Override // defpackage.dgzn, defpackage.dgwe
    protected final void P() throws dgwp, ebki {
        String str;
        String str2;
        try {
            ebqo ebqoVarG = this.l.g();
            if (ebqoVarG == null) {
                throw new ebki("SDB body part cannot be null");
            }
            String strB = ebqoVarG.b();
            if (strB == null) {
                throw new ebki("SDB content cannot be null");
            }
            ebkn ebknVarB = ebkk.b(strB);
            ebkd ebkdVar = (ebkd) ebknVarB.c.get(0);
            ebkb ebkbVarA = ebkdVar.a("path");
            if (ebkbVarA == null || (str = ebkbVarA.b) == null) {
                throw new ebki("Media path in SDP session description cannot be null");
            }
            ebkb ebkbVarA2 = ebkdVar.a("fingerprint");
            ebkb ebkbVarA3 = ebkdVar.a("msrp-cema");
            ebkb ebkbVarA4 = ebkdVar.a("setup");
            if (ebkbVarA2 != null && (str2 = ebkbVarA2.b) != null) {
                this.ac = str2;
            }
            String str3 = ebknVarB.d() ? ebknVarB.h.a : ebkdVar.c.a;
            int i = ebkdVar.a;
            this.ad = str3;
            this.ab = str;
            this.ae = i;
            if (dfoq.n() && ebkbVarA3 == null && ebkbVarA4 != null && Objects.equals(ebkbVarA4.b, "active")) {
                try {
                    if (!this.ad.equals(ebkd.d(this.ab))) {
                        dhja.g("Reached unimplemented CEMA retry case!", new Object[0]);
                    }
                } catch (Exception e) {
                    throw new ebki("MSRP Path is not a valid MSRP URI", e);
                }
            }
            super.P();
        } catch (Exception e2) {
            dhja.i(e2, "Error while completing session: %s", e2.getMessage());
            throw new dgwp(e2);
        }
    }

    @Override // defpackage.dgzn, defpackage.dgwe
    protected final void T(ebqr ebqrVar) {
        if (!this.Y && aE() != null && aE().size() > 0) {
            ebqrVar.r("Require: recipient-list-invite");
        }
        if (((dgzn) this).E) {
            dhja.c("Overriding accept-contact header for conference invitation.Client must only set IM tag!", new Object[0]);
            try {
                dhjv.t(ebqrVar, dfog.E() ? (String[]) Collection.EL.toArray(this.X.d(), new IntFunction() { // from class: dhaj
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i) {
                        int i2 = dham.Z;
                        return new String[i];
                    }
                }) : dhjv.C(ai()), false, false);
            } catch (ebml e) {
                dhja.q("Unable to overwrite accept-contact header: %s", e.getMessage());
            }
        }
        super.T(ebqrVar);
    }

    @Override // defpackage.dgwe
    protected final ebqo[] ak() throws dgwr {
        String strAD;
        ebqo ebqoVar;
        dgyx dgyxVar;
        ebkn ebknVar = new ebkn();
        ebknVar.c(ebkq.a);
        final ebkd ebkdVarD = this.w ? ((dgzn) this).F.d() : ((dgzn) this).F.b();
        if (!dfoq.q()) {
            ebkdVarD.e(new ebkb("connection", "new"));
        }
        ebkdVarD.e(new ebkb("setup", true != ((Boolean) dfoq.c().a.e.a()).booleanValue() ? "active" : "actpass"));
        ebkdVarD.e(new ebkb("accept-types", aC()));
        dgzx dgzxVar = this.X;
        if (dgzxVar.f()) {
            strAD = "*";
        } else {
            strAD = super.aD();
            if (dfpc.d()) {
                strAD = strAD.concat(" multipart/related application/conference-info+xml");
            }
        }
        ebkdVarD.e(new ebkb("accept-wrapped-types", strAD));
        ebkdVarD.e((dgzxVar.f() ? ebke.SEND_ONLY : ebke.SEND_RECEIVE).g);
        if (dfoq.n()) {
            ebkdVarD.e(new ebkb("msrp-cema", null));
        }
        ((!dgzxVar.f() || (dgyxVar = this.N) == null) ? Optional.empty() : Optional.ofNullable(dgyxVar.g).map(new Function() { // from class: dhai
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = dham.Z;
                return new ebkb("file-selector", "size:" + ((ebco) obj).l());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        })).ifPresent(new Consumer() { // from class: dhal
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ebkdVarD.e((ebkb) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ebknVar.a(ebkdVarD);
        ebqo ebqoVar2 = new ebqo(ebknVar.f(), "application/sdp");
        if (!this.Y) {
            if (aE().size() > 0) {
                dhno dhnoVar = new dhno();
                dhnn dhnnVar = new dhnn();
                dhnoVar.b().add(dhnnVar);
                for (int i = 0; i < aE().size(); i++) {
                    dhnl dhnlVar = new dhnl((String) aE().get(i));
                    dhnlVar.f = dhni.TO;
                    dhnnVar.b.add(dhnlVar);
                }
                try {
                    return new ebqo[]{ebqoVar2, new ebqo(dhno.e(dhnoVar))};
                } catch (IOException e) {
                    dhja.i(e, "Error while generating SIP body part: %s", e.getMessage());
                    return new ebqo[]{ebqoVar2};
                }
            }
            dgyx dgyxVar2 = this.N;
            if (dgyxVar2 == null) {
                dhja.g("Not capable of CPM or SIMPLE IM", new Object[0]);
                return new ebqo[]{ebqoVar2};
            }
            if (!ai()) {
                try {
                    ebco ebcoVar = dgyxVar2.g;
                    if (ebcoVar == null) {
                        throw new dgwr("MessageContent is null");
                    }
                    byte[] bArrB = elec.b(ebcoVar.d());
                    if ("message/cpim".equals(dgyxVar2.h)) {
                        ebqoVar = new ebqo(bArrB, "message/cpim");
                    } else {
                        ebcp ebcpVar = new ebcp(dgyxVar2.h, "utf-8");
                        ebcpVar.o("imdn", "urn:ietf:params:imdn");
                        ebcpVar.l("sip:anonymous@anonymous.invalid");
                        ebcpVar.p("sip:anonymous@anonymous.invalid");
                        ebcpVar.m("DateTime", dhie.a().toString());
                        ebcpVar.n("urn:ietf:params:imdn", "Disposition-Notification", D);
                        ebcpVar.n("urn:ietf:params:imdn", "Message-ID", dgyxVar2.k);
                        ebcpVar.j(bArrB);
                        ebqoVar = new ebqo(ebcpVar.toString(), "message/cpim");
                    }
                    ebqoVar.e = dgyxVar2.b();
                    return new ebqo[]{ebqoVar2, ebqoVar};
                } catch (IOException e2) {
                    throw new dgwr("Failed to get messageContent InputStream", e2);
                }
            }
            try {
                dhja.w(10, 3, "Queueing init INVITE to MSRP pipe %s with messageid=%s", dgyxVar2, dgyxVar2.k);
                this.K.addFirst(dgyxVar2);
            } catch (dgzc e3) {
                dhja.i(e3, "Can't queue the initial message to msrp pipe", new Object[0]);
            }
        }
        return new ebqo[]{ebqoVar2};
    }

    @Override // defpackage.dgwe
    public final String[] al() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (ai()) {
            arrayList3.add(true != this.X.f() ? "urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.session" : "urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.largemsg");
        } else {
            arrayList.add("+g.oma.sip-im");
        }
        if (((dgzn) this).E) {
            arrayList2.add("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp");
            if (this.Q) {
                arrayList2.add("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopush");
            }
        } else if (((dgzn) this).J && dfou.d()) {
            arrayList.add(dgxd.b());
            arrayList2.add("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.chatbot");
        } else {
            dgyx dgyxVar = this.N;
            if (dgyxVar != null && "application/vnd.gsma.rcs-ft-http+xml".equals(dgyxVar.h)) {
                arrayList.add("require");
                arrayList.add("explicit");
                arrayList2.add("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp");
            }
        }
        if (this.V) {
            arrayList.add("+vnd.google.rcs.encrypted");
        } else if (((Boolean) dfpk.a().b.u.a()).booleanValue() || this.U) {
            arrayList.add("+g.gsma.rcs.msgrevoke");
        }
        return dhjv.D(arrayList, arrayList2, arrayList3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        r4 = bj(r5);
        defpackage.dhja.w(12, 3, "Generated MSRP message for session %s with messageid=%s", r10.k, r5.k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a5, code lost:
    
        if (r4 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c8, code lost:
    
        throw new defpackage.ebjd("Can't generate msrp message: outgoing message is null");
     */
    @Override // defpackage.dgvh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void b() throws defpackage.ebjd {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dham.b():void");
    }

    public final void bn(dhgp dhgpVar, String[] strArr) {
        bm();
        ba(strArr);
        String strB = ai() ? ebmh.b() : dhgpVar.d;
        String str = ai() ? dhgpVar.d : null;
        if (Objects.isNull(strB)) {
            dhja.q("contributionId is empty.", new Object[0]);
        } else {
            this.y = strB;
        }
        if (ai()) {
            this.z = str;
        }
        dhgpVar.f.ifPresent(new Consumer() { // from class: dhak
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                String str2 = (String) obj;
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                this.a.q = str2;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
