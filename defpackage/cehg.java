package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.lang.Iterable$EL;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cehg {
    public final fcsu A;
    public final fcsu B;
    public final fcsu C;
    public final apri D;
    public final fcsu E;
    public final fcsu F;
    public final aqac G;
    public final fcsu H;
    public final apvf I;
    private final eosc K;
    private final cphu L;
    private final cqsu M;
    private final bbhi N;
    private final Optional O;
    private final bafp P;
    private final cqbm Q;
    private final cqmz R;
    private final fcsu S;
    private final fcsu T;
    private final bvkr U;
    private final ajnf V;
    private final cmuq W;
    private final aofc X;
    private final afhk Y;
    private final Optional Z;
    private final fcsu ab;
    private final eygg ac;
    private final int ad;
    private final fcsu af;
    private final fcsu ag;
    private final fcsu ah;
    private final fcsu ai;
    private final aqoy aj;
    private final fcsu ak;
    private final fcsu al;
    private final aqad am;
    private final fcsu an;
    private final fcsu ao;
    private final arta ap;
    private cub aq;
    public final Context h;
    public final eosc i;
    public final eygg j;
    public final eygg k;
    public final eygg l;
    public final cogw m;
    public final fcsu n;
    public final crqv o;
    public final chwq p;
    public final crny q;
    public final cqbm r;
    public final ceox s;
    public final crtn t;
    public final Optional u;
    public final bvur w;
    public final awhr y;
    public final fcsu z;
    public static final cqce a = cqce.g("BugleNetwork", "NetworkUtils");
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/net/NetworkUtils");
    private static final cczi J = cdag.e(cdag.b, "ditto_thumbnail_size", 100);
    public static final cczi c = cdag.e(cdag.b, "ditto_thumbnail_quality", 0);
    public static final cczi d = cdag.e(cdag.b, "ditto_upload_thread_count", 3);
    public static final cczi e = cdag.e(cdag.b, "ditto_download_thread_count", 5);
    public static final cczi f = cdag.e(cdag.b, "ditto_last_fcm_downgrade_day_limit", 7);
    public static final ekfk g = ekfk.b(bvdk.UNARCHIVED, eowr.ACTIVE, bvdk.ARCHIVED, eowr.ARCHIVED, bvdk.KEEP_ARCHIVED, eowr.KEEP_ARCHIVED, bvdk.SPAM_FOLDER, eowr.SPAM_FOLDER, bvdk.BLOCKED_FOLDER, eowr.BLOCKED_FOLDER, bvdk.CROSS_COUNTRY_FOLDER, eowr.CROSS_COUNTRY_FOLDER);
    private final Object ae = new Object();
    private final ejxr aa = ejxx.a(new ejxr() { // from class: cegy
        @Override // defpackage.ejxr
        public final Object get() {
            return cqdp.a("DittoUpload", ((Integer) cehg.d.e()).intValue(), 1);
        }
    });
    public final ejxr v = ejxx.a(new ejxr() { // from class: cegz
        @Override // defpackage.ejxr
        public final Object get() {
            return cqdp.a("DittoDownload", ((Integer) cehg.e.e()).intValue(), 1);
        }
    });
    public final Bitmap.CompressFormat x = Bitmap.CompressFormat.JPEG;

    public cehg(Context context, eosc eoscVar, eosc eoscVar2, cphu cphuVar, cqsu cqsuVar, eygg eyggVar, eygg eyggVar2, eygg eyggVar3, bbhi bbhiVar, Optional optional, cogw cogwVar, fcsu fcsuVar, bafp bafpVar, cqbm cqbmVar, cqmz cqmzVar, crqv crqvVar, chwq chwqVar, fcsu fcsuVar2, fcsu fcsuVar3, crny crnyVar, cqbm cqbmVar2, bvkr bvkrVar, ajnf ajnfVar, cmuq cmuqVar, ceox ceoxVar, crtn crtnVar, Optional optional2, aofc aofcVar, afhk afhkVar, Optional optional3, eygg eyggVar4, bvur bvurVar, fcsu fcsuVar4, awhr awhrVar, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, apri apriVar, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, aqoy aqoyVar, fcsu fcsuVar14, fcsu fcsuVar15, fcsu fcsuVar16, fcsu fcsuVar17, fcsu fcsuVar18, arta artaVar, aqad aqadVar, apvf apvfVar, aqac aqacVar, fcsu fcsuVar19) {
        this.h = context;
        this.K = eoscVar;
        this.i = eoscVar2;
        this.L = cphuVar;
        this.M = cqsuVar;
        this.j = eyggVar;
        this.k = eyggVar2;
        this.l = eyggVar3;
        this.N = bbhiVar;
        this.O = optional;
        this.m = cogwVar;
        this.n = fcsuVar;
        this.P = bafpVar;
        this.Q = cqbmVar;
        this.R = cqmzVar;
        this.o = crqvVar;
        this.p = chwqVar;
        this.S = fcsuVar2;
        this.T = fcsuVar3;
        this.q = crnyVar;
        this.r = cqbmVar2;
        this.U = bvkrVar;
        this.V = ajnfVar;
        this.W = cmuqVar;
        this.s = ceoxVar;
        this.t = crtnVar;
        this.u = optional2;
        this.X = aofcVar;
        this.Y = afhkVar;
        this.Z = optional3;
        this.ac = eyggVar4;
        this.af = fcsuVar5;
        this.ah = fcsuVar10;
        this.E = fcsuVar11;
        this.ao = fcsuVar15;
        this.ap = artaVar;
        this.I = apvfVar;
        this.w = bvurVar;
        this.ab = fcsuVar4;
        this.A = fcsuVar7;
        this.B = fcsuVar8;
        this.C = fcsuVar12;
        this.F = fcsuVar14;
        this.ak = fcsuVar18;
        this.al = fcsuVar17;
        this.am = aqadVar;
        this.G = aqacVar;
        this.ad = context.getResources().getDimensionPixelSize(R.dimen.ditto_icon_size);
        this.y = awhrVar;
        this.z = fcsuVar6;
        this.D = apriVar;
        this.ag = fcsuVar9;
        this.ai = fcsuVar13;
        this.aj = aqoyVar;
        this.H = fcsuVar16;
        this.an = fcsuVar19;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[LOOP:1: B:15:0x004d->B:65:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void J(android.net.Uri r16, defpackage.bafo r17, defpackage.eowi r18) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cehg.J(android.net.Uri, bafo, eowi):void");
    }

    private static Uri K(MessagePartCoreData messagePartCoreData) {
        Uri uriT = messagePartCoreData.t();
        return uriT == null ? messagePartCoreData.x() : uriT;
    }

    private final ehqu L(Uri uri) {
        return ehqs.a(this.h).b().D(rha.c).ai().q((rtj) new rtj().F(rok.b)).i(uri);
    }

    private final epbe M(baea baeaVar, MessagePartCoreData messagePartCoreData, epbd epbdVar) {
        epbc epbcVar = (epbc) epbe.a.createBuilder();
        epbcVar.copyOnWrite();
        ((epbe) epbcVar.instance).c = epbdVar.a();
        String strN = messagePartCoreData.N();
        if (!TextUtils.isEmpty(strN) && !messagePartCoreData.ba()) {
            epbcVar.copyOnWrite();
            epbe epbeVar = (epbe) epbcVar.instance;
            strN.getClass();
            epbeVar.d = strN;
        }
        boolean zAT = messagePartCoreData.aT();
        epbcVar.copyOnWrite();
        ((epbe) epbcVar.instance).i = zAT;
        String strQ = messagePartCoreData.Q();
        if (!TextUtils.isEmpty(strQ) && !messagePartCoreData.bb()) {
            epbcVar.copyOnWrite();
            epbe epbeVar2 = (epbe) epbcVar.instance;
            strQ.getClass();
            epbeVar2.j = strQ;
        }
        boolean zAU = messagePartCoreData.aU();
        epbcVar.copyOnWrite();
        ((epbe) epbcVar.instance).k = zAU;
        if (TextUtils.isEmpty(messagePartCoreData.U())) {
            Uri uriV = messagePartCoreData.v();
            String lastPathSegment = uriV == null ? "" : uriV.getLastPathSegment();
            if (TextUtils.isEmpty(lastPathSegment)) {
                Uri uriT = messagePartCoreData.t();
                String lastPathSegment2 = uriT != null ? uriT.getLastPathSegment() : "";
                if (!TextUtils.isEmpty(lastPathSegment2)) {
                    epbcVar.copyOnWrite();
                    epbe epbeVar3 = (epbe) epbcVar.instance;
                    lastPathSegment2.getClass();
                    epbeVar3.e = lastPathSegment2;
                }
            } else {
                epbcVar.copyOnWrite();
                epbe epbeVar4 = (epbe) epbcVar.instance;
                lastPathSegment.getClass();
                epbeVar4.e = lastPathSegment;
            }
        } else {
            String strU = messagePartCoreData.U();
            epbcVar.copyOnWrite();
            epbe epbeVar5 = (epbe) epbcVar.instance;
            strU.getClass();
            epbeVar5.e = strU;
        }
        if (baja.c(messagePartCoreData.bF())) {
            byte[] bArrBF = messagePartCoreData.bF();
            bArrBF.getClass();
            evqs evqsVarX = evqs.x(bArrBF);
            epbcVar.copyOnWrite();
            ((epbe) epbcVar.instance).l = evqsVarX;
        }
        if (baja.c(messagePartCoreData.bE())) {
            byte[] bArrBE = messagePartCoreData.bE();
            bArrBE.getClass();
            evqs evqsVarX2 = evqs.x(bArrBE);
            epbcVar.copyOnWrite();
            ((epbe) epbcVar.instance).m = evqsVarX2;
        }
        if (messagePartCoreData.bj() || messagePartCoreData.bx()) {
            int iC = messagePartCoreData.c();
            int iB = messagePartCoreData.b();
            Uri uriT2 = messagePartCoreData.t();
            if (messagePartCoreData.bj() && ((iC < 0 || iB < 0) && uriT2 != null)) {
                Rect rectG = this.M.g(uriT2, messagePartCoreData.R());
                int iWidth = rectG.width();
                iB = rectG.height();
                iC = iWidth;
            }
            if (iC >= 0 && iB >= 0) {
                epdn epdnVar = (epdn) epdo.a.createBuilder();
                epdnVar.copyOnWrite();
                ((epdo) epdnVar.instance).b = iC;
                epdnVar.copyOnWrite();
                ((epdo) epdnVar.instance).c = iB;
                epbcVar.copyOnWrite();
                epbe epbeVar6 = (epbe) epbcVar.instance;
                epdo epdoVar = (epdo) epdnVar.build();
                epdoVar.getClass();
                epbeVar6.g = epdoVar;
                epbeVar6.b |= 1;
            }
            evqs evqsVarW = w(messagePartCoreData);
            if (evqsVarW != null && evqsVarW.d() > 0) {
                epbcVar.copyOnWrite();
                ((epbe) epbcVar.instance).h = evqsVarW;
            }
        }
        if (messagePartCoreData.k() > -1) {
            long jK = messagePartCoreData.k();
            epbcVar.copyOnWrite();
            ((epbe) epbcVar.instance).n = jK;
        }
        if (messagePartCoreData.l() > 0) {
            long jL = messagePartCoreData.l();
            epbcVar.copyOnWrite();
            ((epbe) epbcVar.instance).f = jL;
        } else if (messagePartCoreData.p() > 0) {
            long jP = messagePartCoreData.p();
            epbcVar.copyOnWrite();
            ((epbe) epbcVar.instance).f = jP;
        } else if (baeaVar.g.size() == 1) {
            long j = baeaVar.j();
            epbcVar.copyOnWrite();
            ((epbe) epbcVar.instance).f = j;
        }
        String strR = messagePartCoreData.R();
        if (strR != null) {
            epbcVar.copyOnWrite();
            ((epbe) epbcVar.instance).o = strR;
        }
        return (epbe) epbcVar.build();
    }

    private final void N(cehf cehfVar) throws GeneralSecurityException {
        if (cehfVar.ordinal() != 0) {
            throw new GeneralSecurityException("Attachment encryption strategy not recognized.");
        }
    }

    static evqs x(evqs evqsVar, bajj bajjVar) throws IllegalStateException, GeneralSecurityException {
        ejwl.b(!evqsVar.H(), "unencryptedData should not be null or empty");
        ejwl.b(true, "keys should not be null");
        try {
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            byte[] bArr2 = bajjVar.d;
            bArr2.getClass();
            cipher.init(1, new SecretKeySpec(bArr2, "AES"), new IvParameterSpec(bArr));
            byte[] bArrDoFinal = cipher.doFinal(evqsVar.I());
            Mac mac = Mac.getInstance("HmacSHA256");
            byte[] bArr3 = bajjVar.e;
            bArr3.getClass();
            mac.init(new SecretKeySpec(bArr3, "HmacSHA256"));
            byte[] bArrDoFinal2 = mac.doFinal(bajj.d(bArrDoFinal, bArr));
            int length = bArrDoFinal2.length;
            cqaz.a(length, 32);
            int length2 = bArrDoFinal.length;
            int i = length2 + 16;
            byte[] bArrCopyOf = Arrays.copyOf(bArrDoFinal, i + length);
            System.arraycopy(bArr, 0, bArrCopyOf, length2, 16);
            System.arraycopy(bArrDoFinal2, 0, bArrCopyOf, i, length);
            return evqs.x(bArrCopyOf);
        } catch (GeneralSecurityException e2) {
            a.o("Failed to encrypt request data", e2);
            throw e2;
        }
    }

    public final String A(String str, String str2, ezol ezolVar) {
        return String.format("[dcrId=%s, tachyonId=%s, browserId=%s]", str, str2, ezolVar.c);
    }

    public final String B(String str, ezol ezolVar) {
        return String.format("[requestId=%s, browserId=%s]", str, ezolVar.c);
    }

    public final void C(InputStream inputStream, OutputStream outputStream, baja bajaVar) throws GeneralSecurityException, IOException {
        if (!bajaVar.b()) {
            throw new GeneralSecurityException("Decryption key is invalid");
        }
        int i = inputStream.read();
        ekgp ekgpVar = cehf.b;
        Integer numValueOf = Integer.valueOf(i);
        if (!ekgpVar.containsKey(numValueOf)) {
            throw new GeneralSecurityException("Attachment encryption strategy not recognized.");
        }
        cehf cehfVar = (cehf) ekgpVar.get(numValueOf);
        cehfVar.getClass();
        N(cehfVar);
        int iPow = (int) Math.pow(2.0d, inputStream.read());
        bbhi.b(iPow);
        byte[] bArr = new byte[iPow];
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        int i2 = 0;
        while (true) {
            int i3 = inputStream.read(bArr);
            if (i3 < 0) {
                return;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
            byte[] bArrC = bbhi.c(inputStream, i2);
            cipher.init(2, new SecretKeySpec(bajaVar.d(), "AES"), new GCMParameterSpec(128, bArrCopyOf));
            cipher.updateAAD(bArrC);
            byte[] bArrDoFinal = cipher.doFinal(Arrays.copyOfRange(bArr, 12, i3));
            outputStream.write(bArrDoFinal, 0, bArrDoFinal.length);
            i2++;
        }
    }

    public final void D(InputStream inputStream, OutputStream outputStream, baja bajaVar) throws GeneralSecurityException, IOException {
        if (!bajaVar.b()) {
            throw new GeneralSecurityException("Encryption key is invalid");
        }
        cehf cehfVar = cehf.a;
        int i = cehfVar.c;
        int i2 = 0;
        outputStream.write(0);
        N(cehfVar);
        int iPow = (int) Math.pow(2.0d, bbhi.a());
        bbhi.b(iPow);
        int i3 = iPow - 28;
        byte[] bArr = new byte[i3];
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        outputStream.write((byte) bbhi.a());
        while (true) {
            int i4 = inputStream.read(bArr);
            if (i4 < 0) {
                return;
            }
            byte[] bArr2 = new byte[12];
            ejwx.a.nextBytes(bArr2);
            byte[] bArrC = bbhi.c(inputStream, i2);
            cipher.init(1, new SecretKeySpec(bajaVar.d(), "AES"), new GCMParameterSpec(128, bArr2));
            cipher.updateAAD(bArrC);
            int iMin = Math.min(i3, i4);
            byte[] bArrDoFinal = cipher.doFinal(iMin < i3 ? Arrays.copyOf(bArr, iMin) : bArr);
            outputStream.write(bArr2);
            outputStream.write(bArrDoFinal);
            i2++;
        }
    }

    public final void E(ConversationIdType conversationIdType) {
        cqbd cqbdVarA = a.a();
        cqbdVarA.I("Invalidating participants cache for");
        cqbdVarA.A("conversation", true != conversationIdType.b() ? conversationIdType : "all");
        cqbdVarA.r();
        if (conversationIdType.b()) {
            synchronized (this.ae) {
                cub cubVar = this.aq;
                if (cubVar != null) {
                    cubVar.f(-1);
                }
            }
            return;
        }
        synchronized (this.ae) {
            cub cubVar2 = this.aq;
            if (cubVar2 != null) {
            }
        }
    }

    public final boolean F() {
        return ((cqey) this.Q.a()).p();
    }

    public final boolean G(MessagePartCoreData messagePartCoreData) {
        cqsu cqsuVar = this.M;
        long jA = a(messagePartCoreData);
        cqss cqssVarJ = cqsuVar.j(messagePartCoreData.R(), messagePartCoreData.t(), messagePartCoreData.v());
        return cqssVarJ.b != null && jA > cqssVarJ.a.c;
    }

    public final int H(bajf bajfVar) {
        if (le.f(bajfVar.q())) {
            return 8;
        }
        if (le.j(bajfVar.q())) {
            return 6;
        }
        if (le.s(bajfVar.q())) {
            return 11;
        }
        if (le.m(bajfVar.q())) {
            return 4;
        }
        if (le.z(bajfVar.q())) {
            return 9;
        }
        if (le.y(bajfVar.q())) {
            return 10;
        }
        if (le.w(bajfVar.q())) {
            return 3;
        }
        return byed.g(bajfVar.b()) ? 12 : 2;
    }

    public final int I(bajf bajfVar) {
        if (bajfVar.d() == 1) {
            return 3;
        }
        return bajfVar.d() != 2 ? 2 : 4;
    }

    public final long a(MessagePartCoreData messagePartCoreData) {
        long jA;
        long jA2;
        Uri uriV = messagePartCoreData.v();
        if (uriV != null) {
            try {
                jA = this.R.a(uriV);
            } catch (Exception e2) {
                cqbd cqbdVarE = a.e();
                cqbdVarE.I("Unable to get content length");
                cqbdVarE.A("Uri", uriV);
                cqbdVarE.s(e2);
            }
        } else {
            jA = 0;
        }
        Uri uriT = messagePartCoreData.t();
        if (uriT != null) {
            try {
                jA2 = this.R.a(uriT);
            } catch (Exception e3) {
                cqbd cqbdVarE2 = a.e();
                cqbdVarE2.I("Unable to get content length");
                cqbdVarE2.A("Uri", uriT);
                cqbdVarE2.s(e3);
            }
        } else {
            jA2 = 0;
        }
        return jA == 0 ? jA2 : jA;
    }

    final bafo b(ConversationIdType conversationIdType) {
        bafo bafoVar;
        synchronized (this.ae) {
            cub cubVar = this.aq;
            bafoVar = cubVar != null ? (bafo) cubVar.c(conversationIdType) : null;
        }
        if (bafoVar != null) {
            return bafoVar;
        }
        bafo bafoVarA = this.P.a(ekgb.n(((baqm) this.ag.b()).f(conversationIdType, ((eoth) ((arsw) this.ap).a.b()).a("bugle.fix_profile_names_on_ditto"))));
        synchronized (this.ae) {
            if (this.aq == null) {
                this.aq = new cub(((Integer) bvfd.g.e()).intValue());
            }
        }
        return bafoVarA;
    }

    public final eiju c() {
        Callable callableL = eiid.l(new Callable() { // from class: cegj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cpge.e(this.a.h);
            }
        });
        eosc eoscVar = this.K;
        final ListenableFuture listenableFutureSubmit = eoscVar.submit(callableL);
        eiju eijuVarD = this.V.d();
        final eiju eijuVarD2 = d();
        final ListenableFuture listenableFutureJ = eika.j(eijuVarD, new ejvr() { // from class: cegk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ajnt ajntVar = (ajnt) obj;
                epcx epcxVar = (epcx) epcy.a.createBuilder();
                boolean zEquals = ajntVar.a().equals(ajnq.ENABLED);
                epcxVar.copyOnWrite();
                epcy epcyVar = (epcy) epcxVar.instance;
                boolean z = true;
                epcyVar.b |= 1;
                epcyVar.c = zEquals;
                boolean zEquals2 = ajntVar.b().equals(ajnr.SEND);
                epcxVar.copyOnWrite();
                epcy epcyVar2 = (epcy) epcxVar.instance;
                epcyVar2.b |= 2;
                epcyVar2.d = zEquals2;
                boolean zEquals3 = ajntVar.c().equals(ajns.SEND);
                epcxVar.copyOnWrite();
                epcy epcyVar3 = (epcy) epcxVar.instance;
                epcyVar3.b |= 4;
                epcyVar3.e = zEquals3;
                cqbm cqbmVar = this.a.r;
                if (!((chza) cqbmVar.a()).q() && !((chza) cqbmVar.a()).s() && !((chza) cqbmVar.a()).r()) {
                    z = false;
                }
                epcxVar.copyOnWrite();
                epcy epcyVar4 = (epcy) epcxVar.instance;
                epcyVar4.b |= 8;
                epcyVar4.f = z;
                return (epcy) epcxVar.build();
            }
        }, eoscVar);
        final eiju eijuVarH = ((aisn) this.ab.b()).a().h(new ejvr() { // from class: cegl
            @Override // defpackage.ejvr
            public final Object apply(Object obj) throws Resources.NotFoundException {
                cehg cehgVar = this.a;
                Resources resources = cehgVar.h.getResources();
                String string = resources.getString(R.string.link_preview_enabled_pref_key);
                boolean z = resources.getBoolean(R.bool.link_preview_enabled_pref_default);
                eovt eovtVar = (eovt) eovu.a.createBuilder();
                boolean zQ = cehgVar.o.q(string, z);
                eovtVar.copyOnWrite();
                ((eovu) eovtVar.instance).c = zQ;
                eovtVar.copyOnWrite();
                ((eovu) eovtVar.instance).d = true;
                epdb epdbVar = (epdb) epdc.a.createBuilder();
                epdbVar.copyOnWrite();
                ((epdc) epdbVar.instance).b = true;
                boolean zA = ckmx.a();
                epdbVar.copyOnWrite();
                ((epdc) epdbVar.instance).c = zA;
                epdbVar.copyOnWrite();
                ((epdc) epdbVar.instance).d = true;
                epdc epdcVar = (epdc) epdbVar.build();
                eovtVar.copyOnWrite();
                eovu eovuVar = (eovu) eovtVar.instance;
                epdcVar.getClass();
                eovuVar.e = epdcVar;
                eovuVar.b |= 1;
                eovv eovvVar = (eovv) cehgVar.u.orElse(eovv.DEFAULT);
                eovtVar.copyOnWrite();
                ((eovu) eovtVar.instance).f = eovvVar.a();
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                eovtVar.copyOnWrite();
                eovu eovuVar2 = (eovu) eovtVar.instance;
                eovuVar2.b |= 4;
                eovuVar2.h = zBooleanValue;
                epdf epdfVar = (epdf) epdg.a.createBuilder();
                epdfVar.copyOnWrite();
                ((epdg) epdfVar.instance).b = true;
                evsn evsnVarBuild = epdfVar.build();
                evsnVarBuild.getClass();
                eovtVar.copyOnWrite();
                eovu eovuVar3 = (eovu) eovtVar.instance;
                eovuVar3.g = (epdg) evsnVarBuild;
                eovuVar3.b |= 2;
                return (eovu) eovtVar.build();
            }
        }, eoscVar);
        final eiju eijuVarA = ((ceus) this.n.b()).a();
        final eiju eijuVarE = eijx.e(Optional.empty());
        eijw eijwVarM = eijx.m(eijuVarA, eijuVarE);
        Callable callable = new Callable() { // from class: cegm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cqce cqceVar = cehg.a;
                Long l = (Long) eork.q(eijuVarA);
                Optional optional = (Optional) eork.q(eijuVarE);
                eovr eovrVar = (eovr) eovs.a.createBuilder();
                long jLongValue = l != null ? l.longValue() : 0L;
                eovrVar.copyOnWrite();
                ((eovs) eovrVar.instance).c = jLongValue;
                if (optional.isPresent()) {
                    eowb eowbVar = (eowb) optional.get();
                    eovrVar.copyOnWrite();
                    eovs eovsVar = (eovs) eovrVar.instance;
                    eovsVar.d = eowbVar;
                    eovsVar.b |= 1;
                }
                return (eovs) eovrVar.build();
            }
        };
        eosc eoscVar2 = this.i;
        final eiju eijuVarA2 = eijwVarM.a(callable, eoscVar2);
        final eiju eijuVarH2 = eijx.g(new Callable() { // from class: cegn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.o.r("ditto_desktop_settings");
            }
        }, eoscVar).h(new ejvr() { // from class: cego
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                byte[] bArr = (byte[]) obj;
                if (bArr == null) {
                    return null;
                }
                try {
                    return (eoxc) evsn.parseFrom(eoxc.a, bArr);
                } catch (evtj e2) {
                    this.a.o.n("ditto_desktop_settings");
                    cqaz.p("Failed to parse stored desktop settings", e2);
                    return null;
                }
            }
        }, eoscVar2);
        if (!((Boolean) cbpz.c.e()).booleanValue()) {
            return eijx.m(listenableFutureSubmit, eijuVarD2, listenableFutureJ, eijuVarA2, eijuVarH, eijuVarH2).a(new Callable() { // from class: cegq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    eped epedVar = (eped) epee.a.createBuilder();
                    epedVar.copyOnWrite();
                    ((epee) epedVar.instance).l = true;
                    String str = (String) eork.q(listenableFutureSubmit);
                    epedVar.copyOnWrite();
                    epee epeeVar = (epee) epedVar.instance;
                    str.getClass();
                    epeeVar.c = str;
                    epedVar.a((Iterable) eork.q(eijuVarD2));
                    epcy epcyVar = (epcy) eork.q(listenableFutureJ);
                    epedVar.copyOnWrite();
                    epee epeeVar2 = (epee) epedVar.instance;
                    epcyVar.getClass();
                    epeeVar2.f = epcyVar;
                    epeeVar2.b |= 2;
                    eovs eovsVar = (eovs) eork.q(eijuVarA2);
                    epedVar.copyOnWrite();
                    epee epeeVar3 = (epee) epedVar.instance;
                    eovsVar.getClass();
                    epeeVar3.h = eovsVar;
                    epeeVar3.b |= 16;
                    eovu eovuVar = (eovu) eork.q(eijuVarH);
                    epedVar.copyOnWrite();
                    epee epeeVar4 = (epee) epedVar.instance;
                    eovuVar.getClass();
                    epeeVar4.g = eovuVar;
                    epeeVar4.b |= 8;
                    eoxc eoxcVar = (eoxc) eork.q(eijuVarH2);
                    if (eoxcVar != null) {
                        epedVar.copyOnWrite();
                        epee epeeVar5 = (epee) epedVar.instance;
                        epeeVar5.e = eoxcVar;
                        epeeVar5.b |= 1;
                    }
                    cehg cehgVar = this.a;
                    eovq eovqVarJ = cehgVar.j();
                    epedVar.copyOnWrite();
                    epee epeeVar6 = (epee) epedVar.instance;
                    eovqVarJ.getClass();
                    epeeVar6.i = eovqVarJ;
                    epeeVar6.b |= 32;
                    if (cehgVar.I.a()) {
                        int i = cqbe.a.x;
                        epedVar.copyOnWrite();
                        ((epee) epedVar.instance).j = i;
                    }
                    return (epee) epedVar.build();
                }
            }, eoscVar2);
        }
        fcsu fcsuVar = this.ah;
        final eiju eijuVarB = ((bvkx) fcsuVar.b()).b();
        final eiju eijuVarA3 = ((bvkx) fcsuVar.b()).a();
        return eijx.m(listenableFutureSubmit, eijuVarD2, eijuVarB, eijuVarA3, listenableFutureJ, eijuVarA2, eijuVarH, eijuVarH2).a(new Callable() { // from class: ceha
            @Override // java.util.concurrent.Callable
            public final Object call() {
                epcy epcyVar = (epcy) eork.q(listenableFutureJ);
                evqs evqsVar = (evqs) eork.q(eijuVarB);
                String str = (String) eork.q(eijuVarA3);
                epcx epcxVar = (epcx) epcyVar.toBuilder();
                epcxVar.copyOnWrite();
                ((epcy) epcxVar.instance).g = true;
                cehg cehgVar = this.a;
                String strG = ((aika) cehgVar.C.b()).g();
                epcxVar.copyOnWrite();
                epcy epcyVar2 = (epcy) epcxVar.instance;
                strG.getClass();
                epcyVar2.j = strG;
                if (evqsVar != null) {
                    epcxVar.copyOnWrite();
                    ((epcy) epcxVar.instance).h = evqsVar;
                }
                eiju eijuVar = eijuVarH2;
                eiju eijuVar2 = eijuVarH;
                ListenableFuture listenableFuture = eijuVarA2;
                ListenableFuture listenableFuture2 = eijuVarD2;
                ListenableFuture listenableFuture3 = listenableFutureSubmit;
                epcxVar.copyOnWrite();
                epcy epcyVar3 = (epcy) epcxVar.instance;
                str.getClass();
                epcyVar3.i = str;
                eped epedVar = (eped) epee.a.createBuilder();
                epedVar.copyOnWrite();
                ((epee) epedVar.instance).l = true;
                String str2 = (String) eork.q(listenableFuture3);
                epedVar.copyOnWrite();
                epee epeeVar = (epee) epedVar.instance;
                str2.getClass();
                epeeVar.c = str2;
                epedVar.a((Iterable) eork.q(listenableFuture2));
                epcy epcyVar4 = (epcy) epcxVar.build();
                epedVar.copyOnWrite();
                epee epeeVar2 = (epee) epedVar.instance;
                epcyVar4.getClass();
                epeeVar2.f = epcyVar4;
                epeeVar2.b |= 2;
                eovs eovsVar = (eovs) eork.q(listenableFuture);
                epedVar.copyOnWrite();
                epee epeeVar3 = (epee) epedVar.instance;
                eovsVar.getClass();
                epeeVar3.h = eovsVar;
                epeeVar3.b |= 16;
                eovu eovuVar = (eovu) eork.q(eijuVar2);
                epedVar.copyOnWrite();
                epee epeeVar4 = (epee) epedVar.instance;
                eovuVar.getClass();
                epeeVar4.g = eovuVar;
                epeeVar4.b |= 8;
                eoxc eoxcVar = (eoxc) eork.q(eijuVar);
                if (eoxcVar != null) {
                    epedVar.copyOnWrite();
                    epee epeeVar5 = (epee) epedVar.instance;
                    epeeVar5.e = eoxcVar;
                    epeeVar5.b |= 1;
                }
                if (cehgVar.I.a()) {
                    int i = cqbe.a.x;
                    epedVar.copyOnWrite();
                    ((epee) epedVar.instance).j = i;
                }
                eovq eovqVarJ = cehgVar.j();
                epedVar.copyOnWrite();
                epee epeeVar6 = (epee) epedVar.instance;
                eovqVarJ.getClass();
                epeeVar6.i = eovqVarJ;
                epeeVar6.b |= 32;
                return (epee) epedVar.build();
            }
        }, eoscVar2);
    }

    public final eiju d() {
        aofc aofcVar = this.X;
        final eiju eijuVarD = this.V.d();
        final eiju eijuVarB = aofcVar.a().b();
        return eijx.k(eijuVarD, eijuVarB).a(new Callable() { // from class: cegf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = ekgb.d;
                final ekfw ekfwVar = new ekfw();
                final ajnt ajntVar = (ajnt) eork.q(eijuVarD);
                ekgb ekgbVar = (ekgb) eork.q(eijuVarB);
                final cehg cehgVar = this.a;
                Iterable$EL.forEach(ekgbVar, new Consumer() { // from class: cega
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        aoer aoerVar = (aoer) obj;
                        int iB = aoerVar.b();
                        String strP = aoerVar.p();
                        String strT = aoerVar.t();
                        epdp epdpVar = (epdp) epdq.a.createBuilder();
                        String strB = aoerVar.h().b();
                        epdpVar.copyOnWrite();
                        ((epdq) epdpVar.instance).b = strB;
                        ekfwVar.h(cehgVar.u(ajntVar, iB, strP, strT, (epdq) epdpVar.build()));
                        ekrw ekrwVarE = cehg.b.e();
                        ekrwVarE.X(eksq.a, "BugleNetwork");
                        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/net/NetworkUtils", "buildSubscriptionSettingsList", 2185, "NetworkUtils.java")).B("add selfId into SubSettings, selfId= %s, subId= %s", aoerVar.h(), aoerVar.b());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return ekfwVar.g();
            }
        }, this.K);
    }

    public final eiju e(MessagePartCoreData messagePartCoreData) {
        Uri uriK = K(messagePartCoreData);
        if (uriK == null) {
            return eijx.e(null);
        }
        int iIntValue = ((Integer) J.e()).intValue();
        final AtomicReference atomicReference = new AtomicReference();
        ehqv ehqvVarA = ehqs.a(this.h);
        ehqu ehquVarQ = L(uriK).Q(iIntValue, iIntValue);
        cegt cegtVar = new cegt(this, atomicReference);
        eiju eijuVarG = eiju.g(eooq.f(eoqt.t(rdo.b(ehquVarQ)), new rdi(cegtVar, ehqvVarA), this.K));
        ejvr ejvrVar = new ejvr() { // from class: cegu
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = cehg.a;
                return (evqs) atomicReference.get();
            }
        };
        eosc eoscVar = this.i;
        return eijuVarG.h(ejvrVar, eoscVar).e(Exception.class, new ejvr() { // from class: cegv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cehg.a.s("exception getting thumbnail async", (Exception) obj);
                return null;
            }
        }, eoscVar);
    }

    public final eiju f(final bajf bajfVar, final ekgb ekgbVar) {
        final eiju eijuVarE = this.X.e(bajfVar.f());
        ajnf ajnfVar = this.V;
        final eiju eijuVarG = g(bajfVar);
        final eiju eijuVarD = ajnfVar.d();
        return eijx.m(eijuVarE, eijuVarG, eijuVarD).a(new Callable() { // from class: cegi
            /* JADX WARN: Removed duplicated region for block: B:17:0x0156  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x012b  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 2440
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cegi.call():java.lang.Object");
            }
        }, this.K);
    }

    public final eiju g(final bajf bajfVar) {
        if (bajfVar.P()) {
            return eijx.e(new cedq(eows.RCS, false));
        }
        if (bajfVar.E() == 2) {
            return eijx.e(new cedq(eows.RCS, false));
        }
        if (bajfVar.E() == 1) {
            return eijx.e(new cedq(eows.XMS, false));
        }
        if (bajfVar.E() != 0) {
            return eijx.e(new cedq(eows.XMS, false));
        }
        return ((cjpo) this.ai.b()).b(bajfVar.f()).i(new eooz() { // from class: cegw
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return eijx.e(new cedq(eows.XMS, false));
                }
                cehg cehgVar = this.a;
                if (cehgVar.p.z()) {
                    return eijx.e(new cedq(eows.XMS, false));
                }
                bajf bajfVar2 = bajfVar;
                Optional optionalK = bajfVar2.k();
                if (optionalK.isEmpty()) {
                    cqbd cqbdVarE = cehg.a.e();
                    cqbdVarE.I("Other participant normalized destination should not be empty for a 1-1 conversation.");
                    cqbdVarE.A("conversation ID", bajfVar2.J());
                    cqbdVarE.r();
                    return eijx.e(new cedq(eows.XMS, false));
                }
                eiju eijuVarC = cehgVar.y.c((alqm) optionalK.get());
                ejvr ejvrVar = new ejvr() { // from class: cefw
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return Boolean.valueOf(((awhp) obj2).g());
                    }
                };
                eosc eoscVar = cehgVar.i;
                return eijuVarC.h(ejvrVar, eoscVar).h(new ejvr() { // from class: cegc
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        cqce cqceVar = cehg.a;
                        return new cedq(((Boolean) obj2).booleanValue() ? eows.RCS : eows.XMS, true);
                    }
                }, eoscVar);
            }
        }, this.i);
    }

    public final ListenableFuture h(final MessagePartCoreData messagePartCoreData, cedp cedpVar, final Optional optional) {
        cqbd cqbdVarA = a.a();
        cqbdVarA.I("Uploading attachment for part with current status (before upload):");
        cqbdVarA.A("partId", messagePartCoreData.W());
        cqbdVarA.B("isBlobIdEmpty", TextUtils.isEmpty(messagePartCoreData.N()));
        cqbdVarA.B("isBlobExpired", messagePartCoreData.ba());
        cqbdVarA.z("BlobTimestamp", messagePartCoreData.d());
        cqbdVarA.B("isCompressedBlobIdEmpty", TextUtils.isEmpty(messagePartCoreData.Q()));
        cqbdVarA.B("isCompressedBlobExpired", messagePartCoreData.bb());
        cqbdVarA.z("compressedBlobTimestamp", messagePartCoreData.e());
        cqbdVarA.r();
        return cedpVar != null ? eika.k(cedpVar.l(), new eooz() { // from class: cehb
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return ((cedn) this.a.k.b()).c((ezns) obj, optional, messagePartCoreData);
            }
        }, (Executor) this.aa.get()) : eooq.g(((cedm) this.j.b()).w(), new eooz() { // from class: cehc
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return ((cedn) this.a.k.b()).c((ezns) obj, optional, messagePartCoreData);
            }
        }, (Executor) this.aa.get());
    }

    public final ListenableFuture i(final MessagePartCoreData messagePartCoreData, cedp cedpVar, final Optional optional) {
        return cedpVar != null ? eika.k(cedpVar.l(), new eooz() { // from class: cefu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return ((cedn) this.a.k.b()).d((ezns) obj, optional, messagePartCoreData);
            }
        }, (Executor) this.aa.get()) : eooq.g(((cedm) this.j.b()).w(), new eooz() { // from class: cefv
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return ((cedn) this.a.k.b()).d((ezns) obj, optional, messagePartCoreData);
            }
        }, (Executor) this.aa.get());
    }

    public final eovq j() {
        eovp eovpVar = (eovp) eovq.a.createBuilder();
        eovpVar.copyOnWrite();
        ((eovq) eovpVar.instance).c = true;
        if (((Boolean) ((cczi) bvfd.o.get()).e()).booleanValue()) {
            eovpVar.copyOnWrite();
            ((eovq) eovpVar.instance).j = true;
        }
        if (bwbv.g()) {
            eovpVar.copyOnWrite();
            ((eovq) eovpVar.instance).d = true;
        }
        bvur bvurVar = this.w;
        if (bvurVar.j()) {
            eovpVar.copyOnWrite();
            ((eovq) eovpVar.instance).e = true;
        }
        if (bvurVar.o()) {
            eovpVar.copyOnWrite();
            ((eovq) eovpVar.instance).f = true;
        }
        eovpVar.copyOnWrite();
        ((eovq) eovpVar.instance).k = true;
        eovpVar.copyOnWrite();
        ((eovq) eovpVar.instance).p = true;
        eovpVar.copyOnWrite();
        ((eovq) eovpVar.instance).q = true;
        if (((Boolean) cbpz.c.e()).booleanValue()) {
            eovpVar.copyOnWrite();
            ((eovq) eovpVar.instance).r = true;
            if (((Boolean) cbpz.f.e()).booleanValue()) {
                eovpVar.copyOnWrite();
                ((eovq) eovpVar.instance).s = true;
            }
        }
        eovpVar.copyOnWrite();
        ((eovq) eovpVar.instance).n = true;
        if (((aqoz) this.an.b()).a()) {
            eovpVar.copyOnWrite();
            ((eovq) eovpVar.instance).u = true;
        }
        eovpVar.copyOnWrite();
        ((eovq) eovpVar.instance).o = true;
        eovpVar.copyOnWrite();
        ((eovq) eovpVar.instance).l = true;
        eovpVar.copyOnWrite();
        ((eovq) eovpVar.instance).m = true;
        eovpVar.copyOnWrite();
        ((eovq) eovpVar.instance).g = true;
        eovpVar.copyOnWrite();
        ((eovq) eovpVar.instance).h = true;
        eovpVar.copyOnWrite();
        ((eovq) eovpVar.instance).i = true;
        boolean zA = ((aqcd) this.ao.b()).a();
        eovpVar.copyOnWrite();
        eovq eovqVar = (eovq) eovpVar.instance;
        eovqVar.b = 1 | eovqVar.b;
        eovqVar.t = zA;
        return (eovq) eovpVar.build();
    }

    public final eowd k(bacr bacrVar, boolean z) {
        eowc eowcVar = (eowc) eowd.a.createBuilder();
        String string = Long.toString(bacrVar.b);
        eowcVar.copyOnWrite();
        eowd eowdVar = (eowd) eowcVar.instance;
        string.getClass();
        eowdVar.c = string;
        String strValueOf = String.valueOf(bacrVar.j);
        eowcVar.copyOnWrite();
        eowd eowdVar2 = (eowd) eowcVar.instance;
        strValueOf.getClass();
        eowdVar2.e = strValueOf;
        String str = bacrVar.f;
        if (str == null) {
            str = "";
        }
        eowcVar.copyOnWrite();
        ((eowd) eowcVar.instance).f = str;
        boolean z2 = bacrVar.m;
        eowcVar.copyOnWrite();
        ((eowd) eowcVar.instance).h = z2;
        String str2 = bacrVar.c;
        if (str2 != null) {
            eowcVar.copyOnWrite();
            ((eowd) eowcVar.instance).d = str2;
        }
        if (bacrVar.g != null) {
            if (z) {
                eowcVar.copyOnWrite();
                ((eowd) eowcVar.instance).k = true;
            } else {
                eozk eozkVarM = m(bacrVar.f());
                if (eozkVarM != null) {
                    eowcVar.copyOnWrite();
                    eowd eowdVar3 = (eowd) eowcVar.instance;
                    eowdVar3.i = eozkVarM;
                    eowdVar3.b = 1 | eowdVar3.b;
                }
            }
        }
        String strZ = z(bacrVar.f());
        if (strZ == null && z) {
            ParticipantsTable.BindData bindDataR = bbbd.r(bacrVar.b(bacrVar.c(0)));
            strZ = cexp.b(((crlw) this.T.b()).h(bindDataR.S() != null ? bindDataR.S() : bindDataR.Q()).a);
        }
        if (strZ != null) {
            eowcVar.copyOnWrite();
            ((eowd) eowcVar.instance).j = strZ;
        }
        for (int i = 0; i < bacrVar.a(); i++) {
            bacq bacqVarC = bacrVar.c(i);
            alqm alqmVar = bacqVarC.a;
            String strJ = alqmVar.j();
            String strP = alqmVar.p(((Boolean) alrj.a.e()).booleanValue());
            strJ.getClass();
            strP.getClass();
            String strB = ejwk.b(alqmVar.F().a);
            eowe eoweVar = (eowe) eowf.a.createBuilder();
            eoweVar.copyOnWrite();
            ((eowf) eoweVar.instance).c = strJ;
            eoweVar.copyOnWrite();
            ((eowf) eoweVar.instance).d = strP;
            eoweVar.copyOnWrite();
            ((eowf) eoweVar.instance).e = strB;
            int i2 = 2;
            switch (bacqVarC.b) {
                case 1:
                    i2 = 3;
                    break;
                case 2:
                    i2 = 4;
                    break;
                case 3:
                    i2 = 5;
                    break;
                case 4:
                    i2 = 6;
                    break;
                case 5:
                    i2 = 7;
                    break;
                case 6:
                    i2 = 8;
                    break;
                case 7:
                    i2 = 9;
                    break;
                case 8:
                    i2 = 10;
                    break;
                case 9:
                    i2 = 11;
                    break;
                case 10:
                    i2 = 12;
                    break;
                case 11:
                    i2 = 13;
                    break;
                case 12:
                    i2 = 14;
                    break;
                case 13:
                    i2 = 15;
                    break;
                case 14:
                    i2 = 16;
                    break;
                case 15:
                    i2 = 17;
                    break;
                case 16:
                    i2 = 18;
                    break;
                case 17:
                    i2 = 19;
                    break;
                case 18:
                    i2 = 20;
                    break;
                case 19:
                    i2 = 21;
                    break;
                case 20:
                    i2 = 22;
                    break;
            }
            eoweVar.copyOnWrite();
            ((eowf) eoweVar.instance).b = i2 - 2;
            eowcVar.copyOnWrite();
            eowd eowdVar4 = (eowd) eowcVar.instance;
            eowf eowfVar = (eowf) eoweVar.build();
            eowfVar.getClass();
            evtg evtgVar = eowdVar4.g;
            if (!evtgVar.c()) {
                eowdVar4.g = evsn.mutableCopy(evtgVar);
            }
            eowdVar4.g.add(eowfVar);
        }
        return (eowd) eowcVar.build();
    }

    public final eowm l(ConversationIdType conversationIdType) {
        eowi eowiVar = (eowi) eowm.a.createBuilder();
        String strA = conversationIdType.a();
        eowiVar.copyOnWrite();
        eowm eowmVar = (eowm) eowiVar.instance;
        strA.getClass();
        eowmVar.c = strA;
        eowr eowrVar = eowr.DELETED;
        eowiVar.copyOnWrite();
        ((eowm) eowiVar.instance).k = eowrVar.a();
        return (eowm) eowiVar.build();
    }

    public final eozk m(Uri uri) {
        cphu cphuVar = this.L;
        Context context = this.h;
        int i = this.ad;
        Bitmap bitmapB = cphuVar.b(context, uri, i, i, 0, false);
        if (bitmapB == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (!bitmapB.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream)) {
            return null;
        }
        evqs evqsVarX = evqs.x(byteArrayOutputStream.toByteArray());
        eozj eozjVar = (eozj) eozk.a.createBuilder();
        eozjVar.copyOnWrite();
        ((eozk) eozjVar.instance).e = 1;
        eozjVar.copyOnWrite();
        ((eozk) eozjVar.instance).c = "image/png";
        eozjVar.copyOnWrite();
        ((eozk) eozjVar.instance).d = evqsVarX;
        if (bitmapB.getWidth() >= 0 && bitmapB.getHeight() >= 0) {
            epdn epdnVar = (epdn) epdo.a.createBuilder();
            long width = bitmapB.getWidth();
            epdnVar.copyOnWrite();
            ((epdo) epdnVar.instance).b = width;
            long height = bitmapB.getHeight();
            epdnVar.copyOnWrite();
            ((epdo) epdnVar.instance).c = height;
            eozjVar.copyOnWrite();
            eozk eozkVar = (eozk) eozjVar.instance;
            epdo epdoVar = (epdo) epdnVar.build();
            epdoVar.getClass();
            eozkVar.f = epdoVar;
            eozkVar.b |= 1;
        }
        return (eozk) eozjVar.build();
    }

    public final epbl n(ConversationIdType conversationIdType, MessageIdType messageIdType) {
        epbb epbbVar = (epbb) epbl.a.createBuilder();
        String strA = conversationIdType.a();
        epbbVar.copyOnWrite();
        epbl epblVar = (epbl) epbbVar.instance;
        strA.getClass();
        epblVar.j = strA;
        String strB = messageIdType.b();
        epbbVar.copyOnWrite();
        epbl epblVar2 = (epbl) epbbVar.instance;
        strB.getClass();
        epblVar2.c = strB;
        epbu epbuVar = (epbu) epbx.a.createBuilder();
        epbuVar.copyOnWrite();
        ((epbx) epbuVar.instance).c = 300;
        epbbVar.copyOnWrite();
        epbl epblVar3 = (epbl) epbbVar.instance;
        epbx epbxVar = (epbx) epbuVar.build();
        epbxVar.getClass();
        epblVar3.g = epbxVar;
        epblVar3.b |= 4;
        return (epbl) epbbVar.build();
    }

    public final epbl o(baea baeaVar) {
        return r(baeaVar, false, Optional.empty());
    }

    public final epbl p(baea baeaVar, Optional optional) {
        return r(baeaVar, false, optional);
    }

    public final epbl q(baea baeaVar, boolean z) {
        return r(baeaVar, z, Optional.empty());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:116:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0a8a  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x030e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.epbl r(final defpackage.baea r23, boolean r24, j$.util.Optional r25) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 3414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cehg.r(baea, boolean, j$.util.Optional):epbl");
    }

    public final epcj s(ParticipantsTable.BindData bindData, boolean z) {
        ejwl.b(!bbdl.k(bindData), "Use getParticipantProtoFromSelfIdentity() for building self-identities");
        epck epckVar = (epck) epcm.a.createBuilder();
        String strR = bindData.R();
        epckVar.copyOnWrite();
        epcm epcmVar = (epcm) epckVar.instance;
        strR.getClass();
        epcmVar.d = strR;
        String strT = bindData.T();
        if (!TextUtils.isEmpty(strT)) {
            int i = true != bbbe.c(bindData) ? 3 : 4;
            epckVar.copyOnWrite();
            ((epcm) epckVar.instance).b = epcl.a(i);
            epckVar.copyOnWrite();
            epcm epcmVar2 = (epcm) epckVar.instance;
            strT.getClass();
            epcmVar2.c = strT;
        }
        int iE = ((crlw) this.T.b()).e(cpbs.a(bindData.T()), false);
        epci epciVar = (epci) epcj.a.createBuilder();
        epciVar.copyOnWrite();
        epcj epcjVar = (epcj) epciVar.instance;
        epcm epcmVar3 = (epcm) epckVar.build();
        epcmVar3.getClass();
        epcjVar.c = epcmVar3;
        epcjVar.b |= 1;
        epciVar.copyOnWrite();
        ((epcj) epciVar.instance).g = false;
        String strB = cexp.b(iE);
        epciVar.copyOnWrite();
        epcj epcjVar2 = (epcj) epciVar.instance;
        strB.getClass();
        epcjVar2.f = strB;
        epes epesVarA = cexp.a(bindData.r());
        epciVar.copyOnWrite();
        epcj epcjVar3 = (epcj) epciVar.instance;
        epesVarA.getClass();
        epcjVar3.h = epesVarA;
        epcjVar3.b |= 4;
        int iB = epcb.b(bindData.D().ordinal());
        epciVar.copyOnWrite();
        ((epcj) epciVar.instance).n = epcb.a(iB);
        if (!TextUtils.isEmpty(bindData.O())) {
            String strO = bindData.O();
            epciVar.copyOnWrite();
            epcj epcjVar4 = (epcj) epciVar.instance;
            strO.getClass();
            epcjVar4.o = strO;
        }
        ProfilesTable.BindData bindData2 = !bindData.aF("profiles_table_join_tag") ? null : (ProfilesTable.BindData) bindData.ax("profiles_table_join_tag", ProfilesTable.BindData.class);
        if (bindData2 != null) {
            epcv epcvVar = (epcv) epcw.a.createBuilder();
            if (!TextUtils.isEmpty(bindData2.v())) {
                String strV = bindData2.v();
                epcvVar.copyOnWrite();
                epcw epcwVar = (epcw) epcvVar.instance;
                strV.getClass();
                epcwVar.b = strV;
            }
            if (!TextUtils.isEmpty(bindData2.w())) {
                String strW = bindData2.w();
                epcvVar.copyOnWrite();
                epcw epcwVar2 = (epcw) epcvVar.instance;
                strW.getClass();
                epcwVar2.c = strW;
            }
            if (!TextUtils.isEmpty(bindData2.x())) {
                String strX = bindData2.x();
                epcvVar.copyOnWrite();
                epcw epcwVar3 = (epcw) epcvVar.instance;
                strX.getClass();
                epcwVar3.d = strX;
            }
            epciVar.copyOnWrite();
            epcj epcjVar5 = (epcj) epciVar.instance;
            epcw epcwVar4 = (epcw) epcvVar.build();
            epcwVar4.getClass();
            epcjVar5.s = epcwVar4;
            epcjVar5.b |= 8;
        }
        Uri uriX = bindData.x();
        if (!TextUtils.isEmpty(bindData.S())) {
            String strS = bindData.S();
            epciVar.copyOnWrite();
            epcj epcjVar6 = (epcj) epciVar.instance;
            strS.getClass();
            epcjVar6.j = strS;
        }
        if (uriX != null) {
            epciVar.copyOnWrite();
            ((epcj) epciVar.instance).k = true;
        }
        if (!TextUtils.isEmpty(bindData.P())) {
            String strP = bindData.P();
            epciVar.copyOnWrite();
            epcj epcjVar7 = (epcj) epciVar.instance;
            strP.getClass();
            epcjVar7.d = strP;
        }
        if (!TextUtils.isEmpty(bindData.Q())) {
            String strQ = bindData.Q();
            epciVar.copyOnWrite();
            epcj epcjVar8 = (epcj) epciVar.instance;
            strQ.getClass();
            epcjVar8.e = strQ;
        }
        boolean zAa = bindData.aa();
        epciVar.copyOnWrite();
        ((epcj) epciVar.instance).l = zAa;
        int iO = bindData.o();
        epciVar.copyOnWrite();
        ((epcj) epciVar.instance).m = iO;
        boolean zX = bindData.X();
        epciVar.copyOnWrite();
        ((epcj) epciVar.instance).p = zX;
        epciVar.copyOnWrite();
        ((epcj) epciVar.instance).i = z;
        return (epcj) epciVar.build();
    }

    public final epep t(int i, String str, String str2) {
        crny crnyVar = this.q;
        crof crofVarH = crnyVar.h(i);
        epeo epeoVar = (epeo) epep.a.createBuilder();
        epes epesVarA = cexp.a(i);
        epeoVar.copyOnWrite();
        epep epepVar = (epep) epeoVar.instance;
        epesVarA.getClass();
        epepVar.c = epesVarA;
        epepVar.b |= 1;
        int iC = crnyVar.c();
        epeoVar.copyOnWrite();
        ((epep) epeoVar.instance).d = i == iC;
        String strB = cexp.b(crofVarH.b());
        epeoVar.copyOnWrite();
        epep epepVar2 = (epep) epeoVar.instance;
        strB.getClass();
        epepVar2.f = strB;
        int iD = crofVarH.d();
        epeoVar.copyOnWrite();
        ((epep) epeoVar.instance).g = iD;
        if (crofVarH.r() != null) {
            String strR = crofVarH.r();
            epeoVar.copyOnWrite();
            epep epepVar3 = (epep) epeoVar.instance;
            strR.getClass();
            epepVar3.e = strR;
        }
        epeo epeoVar2 = (epeo) ((epep) epeoVar.build()).toBuilder();
        if (str != null) {
            epeoVar2.copyOnWrite();
            epep epepVar4 = (epep) epeoVar2.instance;
            epepVar4.b |= 2;
            epepVar4.h = str;
        }
        if (str2 != null) {
            epeoVar2.copyOnWrite();
            epep epepVar5 = (epep) epeoVar2.instance;
            epepVar5.b |= 4;
            epepVar5.i = str2;
        }
        return (epep) epeoVar2.build();
    }

    public final epew u(ajnt ajntVar, int i, String str, String str2, epdq epdqVar) {
        eieu eieuVarK = eiiy.k("NetworkUtils#createSubscriptionSettings_dsdrGroupsFlag");
        try {
            epep epepVarT = t(i, str, str2);
            eieuVarK.close();
            epet epetVar = (epet) epew.a.createBuilder();
            epetVar.copyOnWrite();
            epew epewVar = (epew) epetVar.instance;
            epepVarT.getClass();
            epewVar.c = epepVarT;
            epewVar.b |= 1;
            if (((dggw) this.S.b()).w(i)) {
                epeu epeuVar = (epeu) epev.a.createBuilder();
                boolean zEquals = ajntVar.a().equals(ajnq.ENABLED);
                epeuVar.copyOnWrite();
                ((epev) epeuVar.instance).b = zEquals;
                epev epevVar = (epev) epeuVar.build();
                epetVar.copyOnWrite();
                epew epewVar2 = (epew) epetVar.instance;
                epevVar.getClass();
                epewVar2.d = epevVar;
                epewVar2.b |= 2;
                if (((Boolean) cbpz.c.e()).booleanValue() && ((Boolean) cbpz.d.e()).booleanValue() && !epepVarT.i.isEmpty()) {
                    try {
                        Optional optionalJ = ((dggz) this.al.b()).j(((dggl) this.ak.b()).a(epepVarT.i));
                        if (optionalJ.isPresent()) {
                            String str3 = ((dgiq) optionalJ.get()).o().mFtHttpContentServerUri;
                            String str4 = (String) ((dgiq) optionalJ.get()).v().orElse("");
                            epetVar.copyOnWrite();
                            epew epewVar3 = (epew) epetVar.instance;
                            str3.getClass();
                            epewVar3.g = str3;
                            epetVar.copyOnWrite();
                            epew epewVar4 = (epew) epetVar.instance;
                            str4.getClass();
                            epewVar4.h = str4;
                        }
                    } catch (IllegalArgumentException e2) {
                        ekrw ekrwVarJ = b.j();
                        ekrwVarJ.X(eksq.a, "BugleNetwork");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e2)).h("com/google/android/apps/messaging/shared/net/NetworkUtils", "createSubscriptionSettings", (char) 2805, "NetworkUtils.java")).q("Fail to get copper url and tachyon url");
                    }
                }
            }
            boolean z = !this.W.d(i);
            epetVar.copyOnWrite();
            ((epew) epetVar.instance).e = z;
            epetVar.copyOnWrite();
            epew epewVar5 = (epew) epetVar.instance;
            epdqVar.getClass();
            epewVar5.f = epdqVar;
            epewVar5.b |= 4;
            return (epew) epetVar.build();
        } finally {
        }
    }

    public final evqs v(evqs evqsVar, ezol ezolVar) {
        if (evqsVar != null && !evqsVar.H()) {
            bajj bajjVarA = bajj.a(ezolVar.c);
            if (bajjVarA == null && (bajjVarA = this.U.d(ezolVar)) != null) {
                bajj.b(ezolVar.c, bajjVarA);
            }
            if (bajjVarA != null && bajjVarA.c()) {
                return x(evqsVar, bajjVarA);
            }
            a.p("No Ditto encryption key in database");
        }
        return null;
    }

    public final evqs w(MessagePartCoreData messagePartCoreData) {
        Uri uriK = K(messagePartCoreData);
        evqs evqsVarX = null;
        if (uriK == null) {
            return null;
        }
        int iIntValue = ((Integer) J.e()).intValue();
        rtd rtdVarT = L(uriK).t(iIntValue, iIntValue);
        try {
            try {
                Bitmap bitmap = (Bitmap) dqle.a(rtdVarT);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (bitmap.compress(this.x, ((Integer) c.e()).intValue(), byteArrayOutputStream)) {
                    evqsVarX = evqs.x(byteArrayOutputStream.toByteArray());
                }
            } finally {
                ehqs.a(this.h).l(rtdVarT);
            }
        } catch (InterruptedException | ExecutionException e2) {
            a.s("exception getting thumbnail", e2);
        }
        return evqsVarX;
    }

    public final Optional y(evqs evqsVar, String str, ezol ezolVar) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArr;
        byte[] bArr2;
        if (evqsVar == null || evqsVar.H()) {
            return Optional.of(evqs.b);
        }
        bajj bajjVarA = bajj.a(ezolVar.c);
        if (bajjVarA == null && (bajjVarA = this.U.d(ezolVar)) != null) {
            bajj.b(ezolVar.c, bajjVarA);
        }
        if (bajjVarA == null || !bajjVarA.c()) {
            cqbd cqbdVarC = a.c();
            cqbdVarC.I("No Ditto encryption key in database");
            cqbdVarC.A("request ID", B(str, ezolVar));
            cqbdVarC.r();
            return Optional.empty();
        }
        int iD = evqsVar.d() - 48;
        byte[] bArr3 = null;
        if (iD <= 0) {
            bArr = null;
        } else {
            bArr = new byte[iD];
            evqsVar.G(bArr, 0, 0, iD);
        }
        int iD2 = evqsVar.d() - 48;
        if (iD2 <= 0) {
            bArr2 = null;
        } else {
            bArr2 = new byte[16];
            evqsVar.G(bArr2, iD2, 0, 16);
        }
        int iD3 = evqsVar.d();
        if (iD3 - 48 > 0) {
            byte[] bArr4 = new byte[32];
            evqsVar.G(bArr4, iD3 - 32, 0, 32);
            bArr3 = bArr4;
        }
        if (bArr == null || bArr2 == null || bArr3 == null) {
            cqbd cqbdVarE = a.e();
            cqbdVarE.I("Unable to parse cipher text");
            cqbdVarE.A("request ID", B(str, ezolVar));
            cqbdVarE.r();
            return Optional.empty();
        }
        byte[] bArrD = bajj.d(bArr, bArr2);
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            byte[] bArr5 = bajjVarA.e;
            bArr5.getClass();
            mac.init(new SecretKeySpec(bArr5, "HmacSHA256"));
            if (MessageDigest.isEqual(mac.doFinal(bArrD), bArr3)) {
                Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
                byte[] bArr6 = bajjVarA.d;
                bArr6.getClass();
                cipher.init(2, new SecretKeySpec(bArr6, "AES"), new IvParameterSpec(bArr2));
                return Optional.of(evqs.x(cipher.doFinal(bArr)));
            }
            cqbd cqbdVarE2 = a.e();
            cqbdVarE2.I("Mismatched signature");
            cqbdVarE2.A("request ID", B(str, ezolVar));
            cqbdVarE2.r();
            return Optional.empty();
        } catch (GeneralSecurityException e2) {
            cqbd cqbdVarE3 = a.e();
            cqbdVarE3.I("Failed to decrypt request data");
            cqbdVarE3.A("request ID", B(str, ezolVar));
            cqbdVarE3.s(e2);
            return Optional.empty();
        }
    }

    final String z(Uri uri) {
        String strU = cpbr.u(uri);
        if (strU == null) {
            return null;
        }
        return cexp.b(((crlw) this.T.b()).h(strU).a);
    }
}
