package defpackage;

import android.content.Context;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dhat extends dgzn {
    public static final /* synthetic */ int ag = 0;
    private boolean Y;
    String Z;
    String aa;
    String ab;
    int ac;
    String ad;
    ebjr ae;
    public final Queue af;

    public dhat(Context context, dgvq dgvqVar, fcsu fcsuVar, ebqr ebqrVar, ebja ebjaVar, dhgr dhgrVar, dfcg dfcgVar, dhjt dhjtVar, InstantMessageConfiguration instantMessageConfiguration, deza dezaVar) throws ebmn {
        String strB;
        super(context, dgvqVar, fcsuVar, ebqrVar, ebjaVar, dhgrVar, dfcgVar, dhjtVar, instantMessageConfiguration, dezaVar);
        this.af = new ArrayDeque();
        dhja.c("Creating new chat session as terminating", new Object[0]);
        ebqo ebqoVarC = ebqrVar.c("application/resource-lists+xml");
        if (ebqoVarC != null) {
            try {
                dhnn dhnnVar = (dhnn) dhno.a(new InputStreamReader(new ByteArrayInputStream(ebqoVarC.a), "utf-8")).b().get(0);
                if (dhnnVar != null && dhnnVar.b.size() > 0) {
                    List list = dhnnVar.b;
                    String[] strArr = new String[list.size()];
                    for (int i = 0; i < list.size(); i++) {
                        strArr[i] = ((dhnl) list.get(i)).d;
                    }
                    ba(strArr);
                }
                String strJ = ebqrVar.j("Referred-By");
                if (strJ == null) {
                    dhja.h(dgzn.B, "Invite missing REFERRED_BY header", new Object[0]);
                } else {
                    ((dgzn) this).H = this.L.a(dhjv.l(strJ, u(), this.m));
                }
            } catch (IOException e) {
                dhja.i(e, "Error while reading resource lists: %s", e.getMessage());
            }
        }
        ebqo ebqoVarC2 = ebqrVar.c("application/sdp");
        if (ebqoVarC2 == null || (strB = ebqoVarC2.b()) == null) {
            throw new ebmn("Can't create a session for an INVITE with no SDP");
        }
        this.w = strB.contains("TCP/TLS/MSRP");
    }

    @Override // defpackage.dgwe
    protected String A() {
        return "TerminatingChatSession";
    }

    @Override // defpackage.dgzn
    public final Optional aB() {
        String str = this.W;
        return (str == null || !str.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.chatbot") || ((dgzn) this).J) ? Optional.empty() : Optional.of(dgzl.INVALID_CHAT_BOT);
    }

    @Override // defpackage.dgzn
    protected final String aD() {
        if (this.X.f()) {
            return "*";
        }
        String strAD = super.aD();
        return (dfpc.d() && bf()) ? strAD.concat(" multipart/related application/conference-info+xml") : strAD;
    }

    @Override // defpackage.dgwe
    protected ebqo[] ak() throws dgwr, IOException {
        String strB;
        String str;
        ebqo ebqoVarG = this.l.g();
        if (ebqoVarG == null || (strB = ebqoVarG.b()) == null) {
            throw new dgwr("Can't prepare a session without a sip dialog path");
        }
        try {
            ebkn ebknVarB = ebkk.b(strB);
            ebkd ebkdVar = (ebkd) ebknVarB.c.get(0);
            ebkb ebkbVarA = ebkdVar.a("path");
            ebkb ebkbVarA2 = ebkdVar.a("fingerprint");
            if (ebkbVarA2 != null) {
                this.aa = ebkbVarA2.b;
            }
            if (ebkbVarA == null || (str = ebkbVarA.b) == null) {
                throw new dgwr("Can't prepare a prepare a session for an SDP without a PATH");
            }
            this.Z = str;
            this.ab = ebknVarB.d() ? ebknVarB.h.a : ebkdVar.c.a;
            ebkb ebkbVarA3 = ebkdVar.a("msrp-cema");
            if (dfoq.n()) {
                if (ebkbVarA3 != null) {
                    this.Y = true;
                } else {
                    try {
                        if (!this.ab.equals(ebkd.d(this.Z))) {
                            aT(dgzl.INVALID_PARAMETERS);
                            throw new dgwr("Incoming SDP does not specify CEMA but path does not match C/M lines");
                        }
                    } catch (Exception e) {
                        throw new dgwr("MSRP Path is not a valid MSRP URI", e);
                    }
                }
            }
            this.ac = ebkdVar.a;
            String strG = ebji.g(ebkdVar);
            this.ad = strG;
            dhja.c("Local setup attribute is %s", strG);
            if (!"active".equals(this.ad)) {
                this.ae = ay(this.Z, this);
            }
            boolean zEquals = "active".equals(this.ad);
            ebkn ebknVar = new ebkn();
            ebknVar.c(ebkq.a);
            ebqo ebqoVar = null;
            try {
                ebkd ebkdVarAz = az(zEquals);
                ebkdVarAz.e(new ebkb("accept-types", aC()));
                ebkdVarAz.e(new ebkb("accept-wrapped-types", aD()));
                if (!dfoq.q()) {
                    ebkdVarAz.e(new ebkb("connection", "new"));
                }
                ebkdVarAz.e(new ebkb("setup", this.ad));
                ebkdVarAz.e((this.X.f() ? ebke.RECEIVE_ONLY : ebke.SEND_RECEIVE).g);
                if (this.Y) {
                    ebkdVarAz.e(new ebkb("msrp-cema", null));
                }
                ebknVar.a(ebkdVarAz);
                ebqoVar = new ebqo(ebknVar.f(), "application/sdp");
            } catch (IllegalStateException unused) {
            }
            if (Objects.isNull(ebqoVar)) {
                throw new dgwr("SIP body parts cannot be build");
            }
            return new ebqo[]{ebqoVar};
        } catch (ebki e2) {
            throw new dgwr(e2);
        }
    }

    @Override // defpackage.dgwe
    public String[] al() {
        Optional optionalEmpty;
        int i = ekgb.d;
        final ekfw ekfwVar = new ekfw();
        ekfw ekfwVar2 = new ekfw();
        ekfw ekfwVar3 = new ekfw();
        if (ai()) {
            ekfwVar3.h("urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.session");
        } else {
            ekfwVar.h("+g.oma.sip-im");
        }
        if (((dgzn) this).J) {
            ekfwVar2.h("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.chatbot");
            try {
                optionalEmpty = Collection.EL.stream(((dfzw) ((dfzz) this.T).b()).h).filter(new Predicate() { // from class: dhar
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo538negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        int i2 = dhat.ag;
                        return ((String) obj).startsWith("+g.gsma.rcs.botversion");
                    }
                }).findFirst();
            } catch (IllegalStateException unused) {
                dhja.c("RegistrationContext is not available.", new Object[0]);
                optionalEmpty = Optional.empty();
            }
            optionalEmpty.ifPresent(new Consumer() { // from class: dhas
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ekfwVar.h((String) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        if (((dgzn) this).E) {
            ekfwVar2.h("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp");
            if (this.Q) {
                ekfwVar2.h("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopush");
            }
        }
        return dhjv.D(ekfwVar.g(), ekfwVar2.g(), ekfwVar3.g());
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009d, code lost:
    
        defpackage.dhja.o("Generating msrp message for session %s", r10.k);
        r4 = bj(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ac, code lost:
    
        if (r4 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ca, code lost:
    
        throw new defpackage.ebjd("Can't generate msrp message: outgoing message is null");
     */
    @Override // defpackage.dgvh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void b() throws defpackage.ebjd {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhat.b():void");
    }
}
