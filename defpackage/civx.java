package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import com.google.android.ims.util.Content;
import j$.util.Optional;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class civx {
    private final bbhh A;
    private final Optional B;
    private final ayph C;
    private final fcsu D;
    private final bbgy E;
    private final cggg F;
    private final bveg G;
    private final civf H;
    private final fcsu I;
    private final cmpq J;
    private final asra K;
    private final fcsu L;
    private final fcsu M;
    private final fcsu N;
    private final fcsu O;
    private final ains P;
    private final fcsu Q;
    private final fcsu R;
    private final fcsu S;
    private final fcsu T;
    private final fcsu U;
    private final fcsu V;
    private final fcsu W;
    private final fcsu X;
    private final fcsu Y;
    private final Optional Z;
    private final fcsu aa;
    private final efnn ab;
    private final fcsu ac;
    private final fcsu ad;
    private final fcsu ae;
    private final fcsu af;
    private final fcsu ag;
    private final fcsu ah;
    private final fdjx ai;
    private final fcsu aj;
    private final aqoc ak;
    private final fcsu al;
    private final fcsu am;
    private final fcsu an;
    private final fcsu ao;
    private final fcsu ap;
    private final arph aq;
    private final fcsu ar;
    private final cbtt as;
    private final ayeo at;
    public final fcsu b;
    public final fcsu c;
    public final cteb d;
    public final bxlc e;
    public final bbfn f;
    public final cjnr g;
    public final ayfx h;
    public final dqsn i;
    public final bydb j;
    public final fcsu k;
    public final eygg l;
    public final fcsu m;
    public final fcsu n;
    public final fcsu o;
    public final fcsu p;
    public final apto q;
    private final fcsu t;
    private final fcsu u;
    private final fcsu v;
    private final fcsu w;
    private final crtq x;
    private final fcsu y;
    private final fcsu z;
    private static final eksp r = eksp.c("BugleNotifications");
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/rcs/incoming/IncomingRcsMessageProcessor");
    private static final List s = fcva.g(ChatMessage.Type.TEXT, ChatMessage.Type.RBM_SPECIFIC_MESSAGE, ChatMessage.Type.TEST, ChatMessage.Type.TEST_FAILURE, ChatMessage.Type.ENCRYPTED_MESSAGE, ChatMessage.Type.ENCRYPTION_FTD, ChatMessage.Type.PROTO_MESSAGE);

    public civx(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, cteb ctebVar, fcsu fcsuVar6, crtq crtqVar, fcsu fcsuVar7, fcsu fcsuVar8, bbhh bbhhVar, Optional optional, ayph ayphVar, fcsu fcsuVar9, cbtt cbttVar, bbgy bbgyVar, cggg cgggVar, bxlc bxlcVar, bbfn bbfnVar, cjnr cjnrVar, ayfx ayfxVar, ayeo ayeoVar, bveg bvegVar, dqsn dqsnVar, civf civfVar, bydb bydbVar, fcsu fcsuVar10, cmpq cmpqVar, asrh asrhVar, asra asraVar, fcsu fcsuVar11, fcsu fcsuVar12, eygg eyggVar, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, ains ainsVar, fcsu fcsuVar16, fcsu fcsuVar17, fcsu fcsuVar18, fcsu fcsuVar19, fcsu fcsuVar20, fcsu fcsuVar21, fcsu fcsuVar22, fcsu fcsuVar23, fcsu fcsuVar24, fcsu fcsuVar25, fcsu fcsuVar26, fcsu fcsuVar27, fcsu fcsuVar28, Optional optional2, fcsu fcsuVar29, efnn efnnVar, fcsu fcsuVar30, fcsu fcsuVar31, fcsu fcsuVar32, fcsu fcsuVar33, fcsu fcsuVar34, fcsu fcsuVar35, apto aptoVar, fcsu fcsuVar36, fdjx fdjxVar, fdjx fdjxVar2, fcsu fcsuVar37, aqoc aqocVar, fcsu fcsuVar38, fcsu fcsuVar39, fcsu fcsuVar40, fcsu fcsuVar41, fcsu fcsuVar42, arph arphVar, fcsu fcsuVar43) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        ctebVar.getClass();
        fcsuVar6.getClass();
        crtqVar.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        bbhhVar.getClass();
        optional.getClass();
        fcsuVar9.getClass();
        bbgyVar.getClass();
        cgggVar.getClass();
        bxlcVar.getClass();
        bbfnVar.getClass();
        cjnrVar.getClass();
        ayfxVar.getClass();
        ayeoVar.getClass();
        bvegVar.getClass();
        dqsnVar.getClass();
        bydbVar.getClass();
        fcsuVar10.getClass();
        cmpqVar.getClass();
        asrhVar.getClass();
        asraVar.getClass();
        fcsuVar11.getClass();
        fcsuVar12.getClass();
        eyggVar.getClass();
        fcsuVar13.getClass();
        fcsuVar14.getClass();
        fcsuVar15.getClass();
        ainsVar.getClass();
        fcsuVar16.getClass();
        fcsuVar17.getClass();
        fcsuVar18.getClass();
        fcsuVar19.getClass();
        fcsuVar20.getClass();
        fcsuVar21.getClass();
        fcsuVar22.getClass();
        fcsuVar23.getClass();
        fcsuVar24.getClass();
        fcsuVar25.getClass();
        fcsuVar26.getClass();
        fcsuVar27.getClass();
        fcsuVar28.getClass();
        fcsuVar29.getClass();
        fcsuVar30.getClass();
        fcsuVar31.getClass();
        fcsuVar32.getClass();
        fcsuVar33.getClass();
        fcsuVar34.getClass();
        fcsuVar35.getClass();
        fcsuVar36.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        fcsuVar37.getClass();
        aqocVar.getClass();
        fcsuVar38.getClass();
        fcsuVar39.getClass();
        fcsuVar40.getClass();
        fcsuVar41.getClass();
        fcsuVar42.getClass();
        arphVar.getClass();
        fcsuVar43.getClass();
        this.t = fcsuVar;
        this.b = fcsuVar2;
        this.u = fcsuVar3;
        this.c = fcsuVar4;
        this.v = fcsuVar5;
        this.d = ctebVar;
        this.w = fcsuVar6;
        this.x = crtqVar;
        this.y = fcsuVar7;
        this.z = fcsuVar8;
        this.A = bbhhVar;
        this.B = optional;
        this.C = ayphVar;
        this.D = fcsuVar9;
        this.as = cbttVar;
        this.E = bbgyVar;
        this.F = cgggVar;
        this.e = bxlcVar;
        this.f = bbfnVar;
        this.g = cjnrVar;
        this.h = ayfxVar;
        this.at = ayeoVar;
        this.G = bvegVar;
        this.i = dqsnVar;
        this.H = civfVar;
        this.j = bydbVar;
        this.I = fcsuVar10;
        this.J = cmpqVar;
        this.K = asraVar;
        this.k = fcsuVar11;
        this.L = fcsuVar12;
        this.l = eyggVar;
        this.M = fcsuVar13;
        this.N = fcsuVar14;
        this.O = fcsuVar15;
        this.P = ainsVar;
        this.m = fcsuVar16;
        this.Q = fcsuVar17;
        this.R = fcsuVar18;
        this.S = fcsuVar19;
        this.n = fcsuVar20;
        this.T = fcsuVar21;
        this.U = fcsuVar22;
        this.V = fcsuVar23;
        this.W = fcsuVar24;
        this.X = fcsuVar25;
        this.Y = fcsuVar26;
        this.o = fcsuVar27;
        this.p = fcsuVar28;
        this.Z = optional2;
        this.aa = fcsuVar29;
        this.ab = efnnVar;
        this.ac = fcsuVar30;
        this.ad = fcsuVar31;
        this.ae = fcsuVar32;
        this.af = fcsuVar33;
        this.ag = fcsuVar34;
        this.ah = fcsuVar35;
        this.q = aptoVar;
        this.ai = fdjxVar;
        this.aj = fcsuVar37;
        this.ak = aqocVar;
        this.al = fcsuVar38;
        this.am = fcsuVar39;
        this.an = fcsuVar40;
        this.ao = fcsuVar41;
        this.ap = fcsuVar42;
        this.aq = arphVar;
        this.ar = fcsuVar43;
    }

    private final axcy i(chxo chxoVar) {
        return ((chtu) this.ae.b()).b(chxoVar.h());
    }

    private final MessageCoreData j(chxo chxoVar, ParticipantsTable.BindData bindData, axcy axcyVar, ConversationIdType conversationIdType, cive civeVar, String str, boolean z, boolean z2, LocationInformation locationInformation, eyga eygaVar) throws IOException {
        MessageCoreData messageCoreData;
        byte[] bArr;
        ((bbca) this.b.b()).i(bindData);
        boolean z3 = civn.a(str, locationInformation, civeVar) || chxoVar.a() == 116;
        long jE = (((Boolean) ccze.j.e()).booleanValue() && civeVar.e() && chxoVar.e() > 0) ? chxoVar.e() : chxoVar.d();
        int iA = chxoVar.a() != 0 ? chxoVar.a() : 100;
        bveg bvegVar = this.G;
        basd basdVarM = chxoVar.m();
        String strR = bindData.R();
        SelfIdentityId selfIdentityIdF = axcyVar.f();
        chxoVar.C();
        Uri uri = null;
        MessageCoreData messageCoreDataS = bvegVar.s(basdVarM, strR, selfIdentityIdF, conversationIdType, iA, 1, true == civeVar.d() ? null : str, z, z2, chxoVar.e(), jE);
        messageCoreDataS.bx(z3);
        if (locationInformation == null) {
            messageCoreData = messageCoreDataS;
        } else {
            bbgy bbgyVar = this.E;
            Content content = locationInformation.g;
            if (content != null && (bArr = content.a) != null) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    Uri uriG = bxlf.g(byteArrayInputStream, bbgyVar.c);
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException e) {
                        bbgy.a.s("Could not save location preview, http url will be used instead.", e);
                    }
                    uri = uriG;
                } finally {
                }
            }
            if (uri == null) {
                uri = Uri.EMPTY;
            }
            Uri uri2 = uri;
            StringBuilder sb = new StringBuilder();
            String strLineSeparator = System.lineSeparator();
            cssr.d(sb, !TextUtils.isEmpty(locationInformation.a) ? locationInformation.a : bbgyVar.c.getString(R.string.shared_location), strLineSeparator);
            List listI = ejxk.d(System.lineSeparator()).i(locationInformation.a);
            int i = 0;
            while (true) {
                if (i >= listI.size()) {
                    cssr.d(sb, String.format(Locale.US, "https://www.google.com/maps/place/%1$.5f,%2$.5f/", Double.valueOf(locationInformation.d), Double.valueOf(locationInformation.c)), strLineSeparator);
                    break;
                }
                if (csss.b((String) listI.get(i))) {
                    break;
                }
                i++;
            }
            String string = sb.toString();
            baii baiiVar = bbgyVar.d;
            fcsu fcsuVar = baiiVar.a;
            elha elhaVar = elha.LOCATION_CUSTOM;
            cqxl cqxlVar = (cqxl) fcsuVar.b();
            cqxlVar.getClass();
            Context context = (Context) baiiVar.b.b();
            context.getClass();
            cqmp cqmpVar = (cqmp) baiiVar.c.b();
            cqmpVar.getClass();
            cmum cmumVar = (cmum) baiiVar.d.b();
            cmumVar.getClass();
            cqmz cqmzVar = (cqmz) baiiVar.e.b();
            cqmzVar.getClass();
            bahv bahvVar = (bahv) baiiVar.f.b();
            bahvVar.getClass();
            bxfu bxfuVar = (bxfu) baiiVar.g.b();
            bxfuVar.getClass();
            cmtv cmtvVar = (cmtv) baiiVar.i.b();
            cmtvVar.getClass();
            baii baiiVar2 = (baii) baiiVar.v.b();
            baiiVar2.getClass();
            cqsu cqsuVar = (cqsu) baiiVar.j.b();
            cqsuVar.getClass();
            cogw cogwVar = (cogw) baiiVar.k.b();
            cogwVar.getClass();
            crqx crqxVar = (crqx) baiiVar.l.b();
            crqxVar.getClass();
            cqok cqokVar = (cqok) baiiVar.m.b();
            cqokVar.getClass();
            Optional optional = (Optional) ((eyig) baiiVar.n).a;
            cqxp cqxpVar = (cqxp) baiiVar.o.b();
            cqxpVar.getClass();
            eosc eoscVar = (eosc) baiiVar.p.b();
            eoscVar.getClass();
            apsl apslVar = (apsl) baiiVar.q.b();
            apslVar.getClass();
            elhaVar.getClass();
            aqbx aqbxVar = (aqbx) baiiVar.s.b();
            fcsu fcsuVar2 = baiiVar.r;
            fcsu fcsuVar3 = baiiVar.h;
            aqbxVar.getClass();
            messageCoreData = messageCoreDataS;
            messageCoreData.aM(new PendingAttachmentData(cqxlVar, context, cqmpVar, cmumVar, cqmzVar, bahvVar, bxfuVar, fcsuVar3, cmtvVar, baiiVar2, cqsuVar, cogwVar, crqxVar, cqokVar, optional, cqxpVar, eoscVar, apslVar, fcsuVar2, string, uri2, elhaVar, locationInformation, aqbxVar));
        }
        messageCoreData.bs(eygaVar);
        if (((arns) this.ar.b()).a() && basd.l(chxoVar.l())) {
            messageCoreData.bG(chxoVar.l());
        }
        fcsu fcsuVar4 = this.M;
        messageCoreData.bP(((alrj) fcsuVar4.b()).b(chxoVar.g()));
        messageCoreData.bM(((alrj) fcsuVar4.b()).b(chxoVar.h()));
        this.as.b(messageCoreData, chxoVar.f());
        messageCoreData.bH((chxoVar.u() || chxoVar.y()) ? bvdx.NOT_SENT : bvdx.NOT_REQUESTED);
        if (!chxoVar.u()) {
            this.P.c("Bugle.Rcs.Chat.Message.DeliveryReportNotRequested.Counts");
        }
        messageCoreData.bI(chxoVar.v() ? bvdx.NOT_SENT : bvdx.NOT_REQUESTED);
        return messageCoreData;
    }

    private final boolean k(ConversationIdType conversationIdType, aubq aubqVar) {
        return ((baqm) this.ac.b()).g(conversationIdType, aubqVar);
    }

    public final bvdk a(ConversationIdType conversationIdType, String str, boolean z) {
        bvdk bvdkVarG = ((baxe) this.u.b()).G(conversationIdType, str, false, z);
        bvdkVarG.getClass();
        return bvdkVarG;
    }

    public final eiju b(chxo chxoVar) {
        chxoVar.getClass();
        return auvw.c(this.ai, fcyi.a, fdjz.a, new civq(this, chxoVar, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.chxo r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.civo
            if (r0 == 0) goto L13
            r0 = r9
            civo r0 = (defpackage.civo) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            civo r0 = new civo
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4b
            if (r2 == r6) goto L47
            if (r2 == r5) goto L43
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            defpackage.fctl.b(r9)
            return r9
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            awjl r8 = r0.f
            java.lang.Object r2 = r0.a
            ajsm r4 = r0.e
            defpackage.fctl.b(r9)
            goto Lc1
        L43:
            defpackage.fctl.b(r9)
            return r9
        L47:
            defpackage.fctl.b(r9)
            return r9
        L4b:
            defpackage.fctl.b(r9)
            awpx r9 = r8.j()
            if (r9 == 0) goto L72
            fcsu r8 = r7.af
            java.lang.Object r8 = r8.b()
            atzy r8 = (defpackage.atzy) r8
            fcsu r2 = r7.ag
            java.lang.Object r2 = r2.b()
            awnf r2 = (defpackage.awnf) r2
            awjl r9 = r2.a(r9)
            r0.d = r6
            java.lang.Object r8 = r8.a(r9, r0)
            if (r8 != r1) goto L71
            goto Ld5
        L71:
            return r8
        L72:
            java.lang.String r9 = r8.p()
            boolean r9 = defpackage.civn.b(r9)
            if (r9 == 0) goto L92
            fcsu r9 = r7.af
            java.lang.Object r9 = r9.b()
            atzy r9 = (defpackage.atzy) r9
            awjl r8 = r8.i()
            r0.d = r5
            java.lang.Object r8 = r9.a(r8, r0)
            if (r8 != r1) goto L91
            goto Ld5
        L91:
            return r8
        L92:
            cbtt r9 = r7.as
            android.os.Bundle r2 = r8.f()
            boolean r9 = r9.c(r2)
            if (r9 == 0) goto La1
            ajsm r9 = defpackage.ajsm.b
            goto La3
        La1:
            ajsm r9 = defpackage.ajsm.a
        La3:
            fcsu r2 = r7.af
            java.lang.Object r2 = r2.b()
            atzy r2 = (defpackage.atzy) r2
            awjl r5 = r8.i()
            r0.e = r9
            r0.a = r2
            r0.f = r5
            r0.d = r4
            java.lang.Object r8 = r7.d(r8, r0)
            if (r8 != r1) goto Lbe
            goto Ld5
        Lbe:
            r4 = r9
            r9 = r8
            r8 = r5
        Lc1:
            r9.getClass()
            axcm r9 = (defpackage.axcm) r9
            r5 = 0
            r0.e = r5
            r0.a = r5
            r0.f = r5
            r0.d = r3
            java.lang.Object r8 = r2.b(r8, r9, r4, r0)
            if (r8 != r1) goto Ld6
        Ld5:
            return r1
        Ld6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.civx.c(chxo, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.chxo r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.civp
            if (r0 == 0) goto L13
            r0 = r6
            civp r0 = (defpackage.civp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            civp r0 = new civp
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L5d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            arph r6 = r4.aq
            boolean r6 = r6.a()
            if (r6 == 0) goto L49
            axcm r5 = r5.k()
            if (r5 == 0) goto L41
            return r5
        L41:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Required value was null."
            r5.<init>(r6)
            throw r5
        L49:
            fcsu r6 = r4.ah
            java.lang.Object r6 = r6.b()
            awxo r6 = (defpackage.awxo) r6
            aubq r5 = r5.h()
            r0.c = r3
            java.lang.Object r6 = r6.e(r5, r0)
            if (r6 == r1) goto L64
        L5d:
            awxn r6 = (defpackage.awxn) r6
            axcm r5 = r6.b()
            return r5
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.civx.d(chxo, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0bcd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02db  */
    /* JADX WARN: Type inference failed for: r10v66, types: [fcxy, fcyh] */
    /* JADX WARN: Type inference failed for: r36v0, types: [civx] */
    /* JADX WARN: Type inference failed for: r4v143, types: [cdzb, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.chxo r37, defpackage.fcxy r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 3158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.civx.e(chxo, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
    
        if (r12 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
    
        if (r12 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.chxo r10, defpackage.aubq r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.civu
            if (r0 == 0) goto L13
            r0 = r12
            civu r0 = (defpackage.civu) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            civu r0 = new civu
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            java.lang.String r3 = "sendDeliveredReportForBlockedUser"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/rcs/incoming/IncomingRcsMessageProcessor"
            java.lang.String r5 = "BugleDataModel"
            r6 = 2
            r7 = 1
            java.lang.String r8 = "IncomingRcsMessageProcessor.kt"
            if (r2 == 0) goto L42
            if (r2 == r7) goto L3c
            if (r2 != r6) goto L34
            java.lang.Object r10 = r0.a
            defpackage.fctl.b(r12)
            goto L98
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            java.lang.Object r10 = r0.a
            defpackage.fctl.b(r12)
            goto L8a
        L42:
            defpackage.fctl.b(r12)
            boolean r12 = r10.u()
            if (r12 != 0) goto L71
            ekrg r11 = defpackage.civx.a
            ekrw r11 = r11.e()
            ekrz r12 = defpackage.eksq.a
            r11.X(r12, r5)
            ekrd r11 = (defpackage.ekrd) r11
            ekrz r12 = defpackage.cqnc.f
            basd r10 = r10.m()
            r11.X(r12, r10)
            r10 = 1279(0x4ff, float:1.792E-42)
            ekrw r10 = r11.h(r4, r3, r10, r8)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r11 = "No need to send a delivered report for blocked user."
            r10.q(r11)
            fctx r10 = defpackage.fctx.a
            return r10
        L71:
            fcsu r12 = r9.an
            java.lang.Object r12 = r12.b()
            arym r12 = (defpackage.arym) r12
            boolean r12 = r12.a()
            if (r12 == 0) goto L8d
            r0.a = r10
            r0.d = r7
            java.lang.Object r12 = r9.h(r10, r0)
            if (r12 != r1) goto L8a
            goto L97
        L8a:
            chwo r12 = (defpackage.chwo) r12
            goto L9a
        L8d:
            r0.a = r10
            r0.d = r6
            java.lang.Object r12 = r9.g(r10, r11, r0)
            if (r12 != r1) goto L98
        L97:
            return r1
        L98:
            chwo r12 = (defpackage.chwo) r12
        L9a:
            fcsu r11 = r9.y
            java.lang.Object r11 = r11.b()
            ajhd r11 = (defpackage.ajhd) r11
            chxo r10 = (defpackage.chxo) r10
            basd r10 = r10.m()
            enxu r0 = r12.b
            enyw r12 = r12.c
            r11.aa(r10, r0, r12)
            ekrg r10 = defpackage.civx.a
            ekrw r10 = r10.e()
            ekrz r11 = defpackage.eksq.a
            r10.X(r11, r5)
            r11 = 1296(0x510, float:1.816E-42)
            ekrw r10 = r10.h(r4, r3, r11, r8)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r11 = "Stop incoming RCS message processing from blocked user."
            r10.q(r11)
            fctx r10 = defpackage.fctx.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.civx.f(chxo, aubq, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.chxo r12, defpackage.aubq r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.civx.g(chxo, aubq, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.chxo r24, defpackage.fcxy r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.civx.h(chxo, fcxy):java.lang.Object");
    }
}
