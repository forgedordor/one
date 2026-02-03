package defpackage;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.provider.Telephony;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.axtl;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aydh {
    public final fcsu A;
    public final fcsu B;
    public final fcsu C;
    public final fcsu D;
    public final awlc E;
    public final fcsu F;
    public final arrc G;
    private final fcsu I;
    private final fcsu J;
    private final fcsu K;
    private final fcsu L;
    private final fcsu M;
    private final fcsu N;
    private final fcsu O;
    private final fcsu P;
    private final fcsu Q;
    private final fcsu R;
    private final fcsu S;
    private final fcsu T;
    private final fcsu U;
    private final fcsu V;
    private final fcsu W;
    private final Optional X;
    private final fcsu Y;
    private final fcsu Z;
    private final fcsu aa;
    private final Optional ab;
    private final fcsu ac;
    private final fcsu ad;
    private final fcsu ae;
    private final fcsu af;
    private final apsl ag;
    private final fcsu ah;
    private final aptb ai;
    private final aqoe aj;
    private final fcsu ak;
    public final Context c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public final fcsu l;
    public final fcsu m;
    public final fcsu n;
    public final fcsu o;
    public final fcsu p;
    public final fcsu q;
    public final fcsu r;
    public final eosc s;
    public final fcsu t;
    public final eygg u;
    public final fcsu v;
    public final fcsu w;
    public final dzuc x;
    public final fcsu y;
    public final fcsu z;
    public static final cqce a = cqce.g("BugleDataModel", "ReceiveSmsMessageHelper");
    public static final eksp b = eksp.c("Bugle");
    private static final eksp H = eksp.c("BugleNotifications");

    public aydh(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, fcsu fcsuVar16, fcsu fcsuVar17, fcsu fcsuVar18, fcsu fcsuVar19, fcsu fcsuVar20, fcsu fcsuVar21, fcsu fcsuVar22, fcsu fcsuVar23, fcsu fcsuVar24, fcsu fcsuVar25, fcsu fcsuVar26, fcsu fcsuVar27, fcsu fcsuVar28, fcsu fcsuVar29, Optional optional, fcsu fcsuVar30, fcsu fcsuVar31, eosc eoscVar, fcsu fcsuVar32, eygg eyggVar, fcsu fcsuVar33, fcsu fcsuVar34, dzuc dzucVar, fcsu fcsuVar35, fcsu fcsuVar36, fcsu fcsuVar37, fcsu fcsuVar38, Optional optional2, fcsu fcsuVar39, fcsu fcsuVar40, fcsu fcsuVar41, fcsu fcsuVar42, fcsu fcsuVar43, fcsu fcsuVar44, fcsu fcsuVar45, awlc awlcVar, fcsu fcsuVar46, fcsu fcsuVar47, apsl apslVar, fcsu fcsuVar48, aptb aptbVar, arrc arrcVar, aqoe aqoeVar, fcsu fcsuVar49) {
        this.c = context;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.I = fcsuVar3;
        this.f = fcsuVar4;
        this.g = fcsuVar5;
        this.S = fcsuVar11;
        this.T = fcsuVar13;
        this.U = fcsuVar20;
        this.J = fcsuVar6;
        this.h = fcsuVar7;
        this.K = fcsuVar8;
        this.i = fcsuVar9;
        this.j = fcsuVar10;
        this.L = fcsuVar12;
        this.M = fcsuVar14;
        this.N = fcsuVar15;
        this.O = fcsuVar16;
        this.P = fcsuVar17;
        this.Q = fcsuVar18;
        this.R = fcsuVar19;
        this.V = fcsuVar21;
        this.k = fcsuVar22;
        this.l = fcsuVar23;
        this.m = fcsuVar24;
        this.W = fcsuVar25;
        this.n = fcsuVar26;
        this.o = fcsuVar27;
        this.p = fcsuVar28;
        this.q = fcsuVar29;
        this.X = optional;
        this.r = fcsuVar31;
        this.s = eoscVar;
        this.Y = fcsuVar30;
        this.t = fcsuVar32;
        this.u = eyggVar;
        this.v = fcsuVar33;
        this.w = fcsuVar34;
        this.x = dzucVar;
        this.y = fcsuVar36;
        this.z = fcsuVar37;
        this.aa = fcsuVar38;
        this.ab = optional2;
        this.A = fcsuVar39;
        this.ac = fcsuVar40;
        this.Z = fcsuVar35;
        this.B = fcsuVar41;
        this.D = fcsuVar42;
        this.ad = fcsuVar43;
        this.C = fcsuVar44;
        this.ae = fcsuVar45;
        this.E = awlcVar;
        this.F = fcsuVar46;
        this.af = fcsuVar47;
        this.ag = apslVar;
        this.ah = fcsuVar48;
        this.ai = aptbVar;
        this.G = arrcVar;
        this.aj = aqoeVar;
        this.ak = fcsuVar49;
    }

    public final Uri a(final ContentValues contentValues, boolean z, boolean z2, final UUID uuid) {
        Optional optionalA;
        eieu eieuVarK = eiiy.k("ReceiveSmsMessageHelper.saveToTelephony");
        try {
            contentValues.put("read", z ? 1 : 0);
            contentValues.put("seen", (Integer) 1);
            try {
                Integer asInteger = contentValues.getAsInteger("m_cls");
                num = asInteger != null ? asInteger : 0;
                contentValues.remove("m_cls");
                optionalA = ((cmro) this.ad.b()).a(new fdae() { // from class: aycm
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return this.a.c.getContentResolver().insert(Telephony.Sms.Inbox.CONTENT_URI, contentValues);
                    }
                });
            } catch (NullPointerException e) {
                a.s("Failed to insert SMS into telephony: got NPE from platform", e);
                contentValues.put("m_cls", num);
            }
            if (!optionalA.isPresent()) {
                ((eksl) ((eksl) b.j()).h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveSmsMessageHelper", "saveToTelephony", 1735, "ReceiveSmsMessageHelper.java")).q("Failed to save to telephony. Returning null URI");
                eieuVarK.close();
                return null;
            }
            Uri uri = (Uri) optionalA.get();
            contentValues.put("m_cls", num);
            final Uri uriWithAppendedId = ContentUris.withAppendedId(Telephony.Sms.CONTENT_URI, ContentUris.parseId(uri));
            cqbd cqbdVarA = a.a();
            cqbdVarA.I("Inserted SMS message into telephony.");
            cqbdVarA.A("inbox uri", uri);
            cqbdVarA.A("messageUri", uriWithAppendedId);
            cqbdVarA.B("read", z);
            cqbdVarA.B("notified", z2);
            cqbdVarA.A("threadId", contentValues.getAsString("thread_id"));
            cqbdVarA.r();
            if (this.ag.a()) {
                ((awlc) this.ah.b()).d(new Consumer() { // from class: aycn
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        cqce cqceVar = aydh.a;
                        ((cmvv) obj).j(uriWithAppendedId);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            } else {
                this.X.ifPresent(new Consumer() { // from class: ayco
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        cqce cqceVar = aydh.a;
                        ((cmvv) ((fcsu) obj).b()).j(uriWithAppendedId);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            if (this.ai.a()) {
                ((awlc) this.ah.b()).d(new Consumer() { // from class: aycp
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        cqce cqceVar = aydh.a;
                        ((cmvv) obj).a(uriWithAppendedId, uuid);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            ((Optional) ((eyig) this.Y).a).ifPresent(new Consumer() { // from class: aycq
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    cqce cqceVar = aydh.a;
                    ((cdzq) obj).a();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            eieuVarK.close();
            return uriWithAppendedId;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d4 A[Catch: all -> 0x0427, TryCatch #4 {all -> 0x0427, blocks: (B:3:0x000e, B:5:0x001f, B:6:0x0037, B:8:0x0082, B:10:0x0089, B:12:0x00b1, B:14:0x00b9, B:19:0x00c8, B:21:0x00d4, B:26:0x00e5, B:42:0x014f, B:44:0x018c, B:46:0x0193, B:48:0x01a7, B:50:0x01ae, B:52:0x01bc, B:68:0x01f5, B:70:0x01ff, B:71:0x022c, B:73:0x023e, B:75:0x0246, B:77:0x02c3, B:78:0x02ec, B:80:0x031c, B:81:0x0333, B:83:0x0347, B:84:0x034b, B:86:0x0351, B:88:0x0357, B:106:0x03c8, B:90:0x0365, B:92:0x0382, B:93:0x039d, B:95:0x03a3, B:97:0x03a9, B:103:0x03c3, B:104:0x03c6, B:49:0x01aa, B:45:0x018f, B:114:0x0423, B:115:0x0426, B:112:0x0421, B:101:0x03c1, B:53:0x01c8, B:54:0x01d4, B:56:0x01da, B:59:0x01e8, B:65:0x01f0, B:66:0x01f3, B:27:0x0114, B:28:0x0120, B:30:0x0126, B:33:0x013a, B:39:0x0146, B:40:0x0149), top: B:131:0x000e, inners: #0, #1, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0126 A[Catch: all -> 0x041f, TRY_LEAVE, TryCatch #9 {all -> 0x041f, blocks: (B:27:0x0114, B:28:0x0120, B:30:0x0126, B:33:0x013a, B:39:0x0146, B:40:0x0149, B:31:0x0136, B:37:0x0144), top: B:140:0x0114, outer: #4, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018c A[Catch: all -> 0x0427, TryCatch #4 {all -> 0x0427, blocks: (B:3:0x000e, B:5:0x001f, B:6:0x0037, B:8:0x0082, B:10:0x0089, B:12:0x00b1, B:14:0x00b9, B:19:0x00c8, B:21:0x00d4, B:26:0x00e5, B:42:0x014f, B:44:0x018c, B:46:0x0193, B:48:0x01a7, B:50:0x01ae, B:52:0x01bc, B:68:0x01f5, B:70:0x01ff, B:71:0x022c, B:73:0x023e, B:75:0x0246, B:77:0x02c3, B:78:0x02ec, B:80:0x031c, B:81:0x0333, B:83:0x0347, B:84:0x034b, B:86:0x0351, B:88:0x0357, B:106:0x03c8, B:90:0x0365, B:92:0x0382, B:93:0x039d, B:95:0x03a3, B:97:0x03a9, B:103:0x03c3, B:104:0x03c6, B:49:0x01aa, B:45:0x018f, B:114:0x0423, B:115:0x0426, B:112:0x0421, B:101:0x03c1, B:53:0x01c8, B:54:0x01d4, B:56:0x01da, B:59:0x01e8, B:65:0x01f0, B:66:0x01f3, B:27:0x0114, B:28:0x0120, B:30:0x0126, B:33:0x013a, B:39:0x0146, B:40:0x0149), top: B:131:0x000e, inners: #0, #1, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018f A[Catch: all -> 0x0427, TryCatch #4 {all -> 0x0427, blocks: (B:3:0x000e, B:5:0x001f, B:6:0x0037, B:8:0x0082, B:10:0x0089, B:12:0x00b1, B:14:0x00b9, B:19:0x00c8, B:21:0x00d4, B:26:0x00e5, B:42:0x014f, B:44:0x018c, B:46:0x0193, B:48:0x01a7, B:50:0x01ae, B:52:0x01bc, B:68:0x01f5, B:70:0x01ff, B:71:0x022c, B:73:0x023e, B:75:0x0246, B:77:0x02c3, B:78:0x02ec, B:80:0x031c, B:81:0x0333, B:83:0x0347, B:84:0x034b, B:86:0x0351, B:88:0x0357, B:106:0x03c8, B:90:0x0365, B:92:0x0382, B:93:0x039d, B:95:0x03a3, B:97:0x03a9, B:103:0x03c3, B:104:0x03c6, B:49:0x01aa, B:45:0x018f, B:114:0x0423, B:115:0x0426, B:112:0x0421, B:101:0x03c1, B:53:0x01c8, B:54:0x01d4, B:56:0x01da, B:59:0x01e8, B:65:0x01f0, B:66:0x01f3, B:27:0x0114, B:28:0x0120, B:30:0x0126, B:33:0x013a, B:39:0x0146, B:40:0x0149), top: B:131:0x000e, inners: #0, #1, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a7 A[Catch: all -> 0x0427, TryCatch #4 {all -> 0x0427, blocks: (B:3:0x000e, B:5:0x001f, B:6:0x0037, B:8:0x0082, B:10:0x0089, B:12:0x00b1, B:14:0x00b9, B:19:0x00c8, B:21:0x00d4, B:26:0x00e5, B:42:0x014f, B:44:0x018c, B:46:0x0193, B:48:0x01a7, B:50:0x01ae, B:52:0x01bc, B:68:0x01f5, B:70:0x01ff, B:71:0x022c, B:73:0x023e, B:75:0x0246, B:77:0x02c3, B:78:0x02ec, B:80:0x031c, B:81:0x0333, B:83:0x0347, B:84:0x034b, B:86:0x0351, B:88:0x0357, B:106:0x03c8, B:90:0x0365, B:92:0x0382, B:93:0x039d, B:95:0x03a3, B:97:0x03a9, B:103:0x03c3, B:104:0x03c6, B:49:0x01aa, B:45:0x018f, B:114:0x0423, B:115:0x0426, B:112:0x0421, B:101:0x03c1, B:53:0x01c8, B:54:0x01d4, B:56:0x01da, B:59:0x01e8, B:65:0x01f0, B:66:0x01f3, B:27:0x0114, B:28:0x0120, B:30:0x0126, B:33:0x013a, B:39:0x0146, B:40:0x0149), top: B:131:0x000e, inners: #0, #1, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01aa A[Catch: all -> 0x0427, TryCatch #4 {all -> 0x0427, blocks: (B:3:0x000e, B:5:0x001f, B:6:0x0037, B:8:0x0082, B:10:0x0089, B:12:0x00b1, B:14:0x00b9, B:19:0x00c8, B:21:0x00d4, B:26:0x00e5, B:42:0x014f, B:44:0x018c, B:46:0x0193, B:48:0x01a7, B:50:0x01ae, B:52:0x01bc, B:68:0x01f5, B:70:0x01ff, B:71:0x022c, B:73:0x023e, B:75:0x0246, B:77:0x02c3, B:78:0x02ec, B:80:0x031c, B:81:0x0333, B:83:0x0347, B:84:0x034b, B:86:0x0351, B:88:0x0357, B:106:0x03c8, B:90:0x0365, B:92:0x0382, B:93:0x039d, B:95:0x03a3, B:97:0x03a9, B:103:0x03c3, B:104:0x03c6, B:49:0x01aa, B:45:0x018f, B:114:0x0423, B:115:0x0426, B:112:0x0421, B:101:0x03c1, B:53:0x01c8, B:54:0x01d4, B:56:0x01da, B:59:0x01e8, B:65:0x01f0, B:66:0x01f3, B:27:0x0114, B:28:0x0120, B:30:0x0126, B:33:0x013a, B:39:0x0146, B:40:0x0149), top: B:131:0x000e, inners: #0, #1, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01bc A[Catch: all -> 0x0427, TRY_LEAVE, TryCatch #4 {all -> 0x0427, blocks: (B:3:0x000e, B:5:0x001f, B:6:0x0037, B:8:0x0082, B:10:0x0089, B:12:0x00b1, B:14:0x00b9, B:19:0x00c8, B:21:0x00d4, B:26:0x00e5, B:42:0x014f, B:44:0x018c, B:46:0x0193, B:48:0x01a7, B:50:0x01ae, B:52:0x01bc, B:68:0x01f5, B:70:0x01ff, B:71:0x022c, B:73:0x023e, B:75:0x0246, B:77:0x02c3, B:78:0x02ec, B:80:0x031c, B:81:0x0333, B:83:0x0347, B:84:0x034b, B:86:0x0351, B:88:0x0357, B:106:0x03c8, B:90:0x0365, B:92:0x0382, B:93:0x039d, B:95:0x03a3, B:97:0x03a9, B:103:0x03c3, B:104:0x03c6, B:49:0x01aa, B:45:0x018f, B:114:0x0423, B:115:0x0426, B:112:0x0421, B:101:0x03c1, B:53:0x01c8, B:54:0x01d4, B:56:0x01da, B:59:0x01e8, B:65:0x01f0, B:66:0x01f3, B:27:0x0114, B:28:0x0120, B:30:0x0126, B:33:0x013a, B:39:0x0146, B:40:0x0149), top: B:131:0x000e, inners: #0, #1, #8, #9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.aydd b(final defpackage.aydc r42) {
        /*
            Method dump skipped, instructions count: 1074
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aydh.b(aydc):aydd");
    }

    public final ayde c(aydd ayddVar, cldb cldbVar) throws Throwable {
        ConversationIdType conversationIdTypeE = ayddVar.e();
        ParticipantsTable.BindData bindDataG = ayddVar.g();
        if (!craf.i(this.c) && cldbVar != null) {
            ejwl.b(true, "ProcessPendingMessagesAction: empty processing receiver");
            axtl.a aVar = (axtl.a) cqtf.a(axtl.a.class);
            if (aVar.cO().G()) {
                long epochMilli = aVar.y().f().toEpochMilli();
                if (aVar.aM().d(2, epochMilli)) {
                    ekrw ekrwVarH = axtl.a.h();
                    ekrwVarH.X(eksq.a, "BugleDataModel");
                    ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/action/PendingMessagesProcessor", "processPendingMessagesFromReceiver", 344, "PendingMessagesProcessor.java")).q("PendingMessagesProcessor: skipped - too frequent");
                } else {
                    axtn axtnVarAL = aVar.aL();
                    fcsu fcsuVar = axtnVarAL.a;
                    ayqj ayqjVar = (ayqj) axtnVarAL.b.b();
                    ayqjVar.getClass();
                    cogw cogwVar = (cogw) axtnVarAL.c.b();
                    cogwVar.getClass();
                    fcsu fcsuVar2 = axtnVarAL.d;
                    cqbm cqbmVar = (cqbm) axtnVarAL.e.b();
                    cqbmVar.getClass();
                    fcsu fcsuVar3 = axtnVarAL.f;
                    ajhd ajhdVar = (ajhd) axtnVarAL.g.b();
                    ajhdVar.getClass();
                    axxy axxyVar = (axxy) axtnVarAL.h.b();
                    axxyVar.getClass();
                    ayqd ayqdVar = (ayqd) axtnVarAL.i.b();
                    ayqdVar.getClass();
                    ayqx ayqxVar = (ayqx) axtnVarAL.j.b();
                    ayqxVar.getClass();
                    axsj axsjVar = (axsj) axtnVarAL.k.b();
                    axsjVar.getClass();
                    bveg bvegVar = (bveg) axtnVarAL.l.b();
                    bvegVar.getClass();
                    aypv aypvVar = (aypv) axtnVarAL.m.b();
                    aypvVar.getClass();
                    ayrm ayrmVar = (ayrm) axtnVarAL.n.b();
                    ayrmVar.getClass();
                    Optional optional = (Optional) axtnVarAL.o.b();
                    optional.getClass();
                    cjpo cjpoVar = (cjpo) axtnVarAL.p.b();
                    cjpoVar.getClass();
                    bydb bydbVar = (bydb) axtnVarAL.q.b();
                    bydbVar.getClass();
                    ((cokd) axtnVarAL.r.b()).getClass();
                    fcsu fcsuVar4 = axtnVarAL.s;
                    fcsu fcsuVar5 = axtnVarAL.t;
                    axtk axtkVar = (axtk) axtnVarAL.u.b();
                    axtkVar.getClass();
                    fcsu fcsuVar6 = axtnVarAL.v;
                    cmxr cmxrVar = (cmxr) axtnVarAL.w.b();
                    cmxrVar.getClass();
                    eosc eoscVar = (eosc) axtnVarAL.x.b();
                    eoscVar.getClass();
                    ckfo ckfoVar = (ckfo) axtnVarAL.y.b();
                    ckfoVar.getClass();
                    Map map = (Map) axtnVarAL.z.b();
                    map.getClass();
                    aujz aujzVar = (aujz) axtnVarAL.A.b();
                    aujzVar.getClass();
                    axth axthVar = (axth) axtnVarAL.B.b();
                    axthVar.getClass();
                    fcsu fcsuVar7 = axtnVarAL.C;
                    fcsu fcsuVar8 = axtnVarAL.D;
                    fcsu fcsuVar9 = axtnVarAL.E;
                    fcsu fcsuVar10 = axtnVarAL.F;
                    fcsu fcsuVar11 = axtnVarAL.G;
                    fcsu fcsuVar12 = axtnVarAL.H;
                    fcsu fcsuVar13 = axtnVarAL.I;
                    fcsu fcsuVar14 = axtnVarAL.J;
                    new axtl(axtnVarAL.K, fcsuVar, ayqjVar, cogwVar, fcsuVar2, cqbmVar, fcsuVar3, ajhdVar, axxyVar, ayqdVar, ayqxVar, axsjVar, bvegVar, aypvVar, ayrmVar, optional, cjpoVar, bydbVar, fcsuVar4, fcsuVar5, axtkVar, fcsuVar6, cmxrVar, eoscVar, 2, Duration.ZERO, null, cldbVar, null, cldbVar.getClass().getSimpleName(), ckfoVar, map, aujzVar, axthVar, fcsuVar7, fcsuVar8, fcsuVar9, fcsuVar12, fcsuVar13, fcsuVar10, fcsuVar11, fcsuVar14, axtnVarAL.L).c();
                    axxy.d = epochMilli;
                }
            } else {
                ekrw ekrwVarJ = axtl.a.j();
                ekrwVarJ.X(eksq.a, "BugleDataModel");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/action/PendingMessagesProcessor", "processPendingMessagesFromReceiver", 336, "PendingMessagesProcessor.java")).q("PendingMessagesProcessor: skipped - not default SMS app");
            }
        }
        ((cggg) this.ae.b()).b();
        return new axlx(ayddVar.f(), conversationIdTypeE, bindDataG, ayddVar.h(), ayddVar.i(), ayddVar.b(), ayddVar.a(), ayddVar.c());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.aydf d(java.lang.String r6, int r7) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aydh.d(java.lang.String, int):aydf");
    }

    public final bvdk e(alqm alqmVar, boolean z) {
        String strO = alqmVar.o();
        cmum cmumVar = (cmum) this.V.b();
        css cssVar = new css();
        Iterator it = cmumVar.b().iterator();
        while (it.hasNext()) {
            String strI = ((cmuh) it.next()).i();
            if (!TextUtils.isEmpty(strI)) {
                cssVar.add(strI);
            }
        }
        return ekhx.o(cssVar).contains(strO) ? bvdk.SPAM_FOLDER : ((baxe) this.I.b()).G(barn.a, strO, z, false);
    }

    public final eiju f(int i, ContentValues contentValues, long j, axza axzaVar) {
        return g(i, contentValues, bvdz.VERIFICATION_NA, j, axzaVar);
    }

    public final eiju g(final int i, final ContentValues contentValues, final bvdz bvdzVar, final long j, final axza axzaVar) {
        eieu eieuVarK = eiiy.k("ReceiveSmsMessageHelper#insertMessageInTelephonyFuture");
        try {
            final dzub dzubVarD = this.x.d();
            final String asString = contentValues.getAsString("address");
            aydf aydfVarD = d(asString, i);
            final alqm alqmVarG = ((alrj) this.v.b()).g(((axly) aydfVarD).a, new aych(((axly) aydfVarD).b));
            final eiju eijuVarA = ((cldr) this.R.b()).a(contentValues.getAsString("body"), i);
            eooz eoozVar = new eooz() { // from class: aycs
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return this.a.h(asString, i, alqmVarG, ((Boolean) obj).booleanValue());
                }
            };
            eosc eoscVar = this.s;
            final eiju eijuVarI = eijuVarA.i(eoozVar, eoscVar);
            eiju eijuVarH = eijx.k(eijuVarA, eijuVarI).b(new eooy() { // from class: ayct
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    final boolean zBooleanValue = ((Boolean) eork.q(eijuVarA)).booleanValue();
                    final Optional optional = (Optional) eork.q(eijuVarI);
                    final aydh aydhVar = this.a;
                    final ContentValues contentValues2 = contentValues;
                    eieu eieuVarK2 = eiiy.k("ReceiveSmsMessageHelper.insertMessageInTelephony");
                    final bvdz bvdzVar2 = bvdzVar;
                    final long j2 = j;
                    final axza axzaVar2 = axzaVar;
                    final int i2 = i;
                    try {
                        aydh.a.m("insertMessageInTelephony");
                        eiju eijuVarG = eijx.g(new Callable() { // from class: aycz
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                long jA;
                                boolean z;
                                boolean z2;
                                cqca.b = true;
                                int i3 = i2;
                                aydh aydhVar2 = aydhVar;
                                ContentValues contentValues3 = contentValues2;
                                axly axlyVar = (axly) aydhVar2.d(contentValues3.getAsString("address"), i3);
                                alqm alqmVar = axlyVar.a;
                                ParticipantsTable.BindData bindData = axlyVar.b;
                                String strN = alqmVar.n();
                                Long asLong = contentValues3.getAsLong("date");
                                if (asLong == null) {
                                    aydh.a.r("Received an SMS without a received date/time.");
                                }
                                long jLongValue = asLong != null ? asLong.longValue() : 0L;
                                axza axzaVar3 = axzaVar2;
                                long j3 = j2;
                                bvdz bvdzVar3 = bvdzVar2;
                                boolean z3 = zBooleanValue;
                                ((cmqf) aydhVar2.q.b()).i(jLongValue);
                                if (z3) {
                                    long jF = ((cmot) aydhVar2.h.b()).f(cmmo.a, strN);
                                    if (jF == -1) {
                                        aydh.a.n("Resolved thread to an INVALID_THREAD_ID!");
                                        jF = -1;
                                    }
                                    contentValues3.put("thread_id", Long.valueOf(jF));
                                    return new axlv(i3, contentValues3, bindData, jF, barn.a, false, jLongValue, aydhVar2.a(contentValues3, true, true, null), true, true, bvdk.UNARCHIVED, true, bvdzVar3, j3, axzaVar3, true, null, null);
                                }
                                alqm alqmVarG2 = ((alrj) aydhVar2.v.b()).g(alqmVar, new aych(bindData));
                                boolean z4 = !alqmVarG2.w() && ((cpjp) aydhVar2.r.b()).d(alqmVarG2);
                                Optional optional2 = optional;
                                ejyb.a(optional2.isPresent());
                                bakc bakcVar = new bakc();
                                bakcVar.b(((aydb) optional2.get()).a().C());
                                bakcVar.c(((aydb) optional2.get()).b());
                                baqv baqvVarA = bakcVar.a();
                                bvdk bvdkVarE = aydhVar2.e(alqmVarG2, z4);
                                ConversationIdType conversationIdTypeC = ((aydb) optional2.get()).a().C();
                                cnqj cnqjVarA = ((avmr) aydhVar2.y.b()).a(conversationIdTypeC);
                                if (cnqjVarA.c()) {
                                    jA = cnqjVarA.a();
                                } else {
                                    aydh.a.r(a.I(conversationIdTypeC, "Unable to find threadId for conversation [", "]"));
                                    jA = -1;
                                }
                                bakd bakdVar = (bakd) baqvVarA;
                                ConversationIdType conversationIdType = bakdVar.a;
                                cqaz.l(conversationIdType);
                                fcsu fcsuVar = aydhVar2.g;
                                boolean zF = ((bwwe) fcsuVar.b()).f(conversationIdType);
                                boolean zG = ((bwwe) fcsuVar.b()).g(conversationIdType);
                                if (craf.i(aydhVar2.c)) {
                                    aydh.a.m("Not inserting received SMS message for secondary user.");
                                    return new axlv(i3, contentValues3, bindData, jA, conversationIdType, bakdVar.b, jLongValue, null, false, false, bvdkVarE, false, bvdzVar3, j3, axzaVar3, true, null, null);
                                }
                                long j4 = jA;
                                boolean z5 = zG || z4 || ((crtq) aydhVar2.i.b()).a(conversationIdType);
                                if (zF) {
                                    aydh.a.p("New SMS is in focus");
                                } else if (zG) {
                                    aydh.a.p("New SMS is notified because messageInObservable");
                                } else if (z4) {
                                    aydh.a.p("New SMS is notified because blocked");
                                }
                                akbs akbsVar = (akbs) aydhVar2.C.b();
                                ekgb ekgbVarR = ekgb.r(alqmVarG2);
                                boolean z6 = bakdVar.b;
                                boolean zG2 = akbsVar.g(conversationIdType, ekgbVarR, z6);
                                if (z5 || !zG2) {
                                    z = false;
                                    z2 = true;
                                } else {
                                    z = false;
                                    z2 = false;
                                }
                                return new axlv(i3, contentValues3, bindData, j4, conversationIdType, z6, jLongValue, aydhVar2.a(contentValues3, z, z2, null), z2, false, bvdkVarE, false, bvdzVar3, j3, axzaVar3, zG2, null, null);
                            }
                        }, aydhVar.s);
                        eieuVarK2.close();
                        return eijuVarG;
                    } finally {
                    }
                }
            }, eoscVar).h(new ejvr() { // from class: aycu
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    aydc aydcVar = (aydc) obj;
                    this.a.x.f(dzubVarD, new dzfh("ReceiveSmsMessageHelper#InsertMessageInTelephonyByBlockingExecutor"), null, dzua.SUCCESS);
                    return aydcVar;
                }
            }, eoscVar);
            eieuVarK.b(eijuVarH);
            eieuVarK.close();
            return eijuVarH;
        } finally {
        }
    }

    public final eiju h(final String str, final int i, final alqm alqmVar, boolean z) {
        if (z) {
            a.p("Skipping BCM conversation lookup for OTP message");
            return eijx.e(Optional.empty());
        }
        final aydf aydfVarD = d(str, i);
        Callable callable = new Callable() { // from class: ayda
            @Override // java.util.concurrent.Callable
            public final Object call() {
                alqm alqmVar2 = alqmVar;
                boolean z2 = false;
                if (!alqmVar2.w() && ((cpjp) this.a.r.b()).d(alqmVar2)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            }
        };
        eosc eoscVar = this.s;
        return eijx.g(callable, eoscVar).h(new ejvr() { // from class: ayci
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                final Boolean bool = (Boolean) obj;
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                final aydf aydfVar = aydfVarD;
                final int i2 = i;
                final String str2 = str;
                final aydh aydhVar = this.a;
                return Optional.of(new axlu(((avpc) aydhVar.t.b()).a(((axly) aydfVar).a, new fcsu() { // from class: aycl
                    @Override // defpackage.fcsu
                    public final Object b() {
                        atomicBoolean.set(true);
                        aydh aydhVar2 = aydhVar;
                        cnqt cnqtVar = (cnqt) aydhVar2.z.b();
                        alqm alqmVar2 = ((axly) aydfVar).a;
                        int i3 = i2;
                        baqz baqzVarD = cnqtVar.f(alqmVar2, i3).d();
                        boolean zBooleanValue = bool.booleanValue();
                        axly axlyVar = (axly) aydhVar2.d(str2, i3);
                        baqzVarD.f(aydhVar2.e(((alrj) aydhVar2.v.b()).g(axlyVar.a, new aych(axlyVar.b)), zBooleanValue));
                        return baqzVarD.y();
                    }
                }), atomicBoolean.get()));
            }
        }, eoscVar);
    }

    /* JADX WARN: Type inference failed for: r3v16, types: [alqm, java.lang.Object] */
    public final void i(ayde aydeVar) {
        axlx axlxVar = (axlx) aydeVar;
        MessageIdType messageIdType = axlxVar.a;
        if (messageIdType.c()) {
            cqbd cqbdVarE = a.e();
            cqbdVarE.I("Null messageId. Bailing out of launchNonCriticalActionsForReceivedMessage");
            cqbdVarE.r();
            return;
        }
        if (((crlk) this.S.b()).b()) {
            ((ayeo) this.W.b()).a(axlxVar.b, messageIdType, ((Integer) crbf.c.e()).intValue()).w(0L);
        }
        ((bbhh) this.M.b()).a(messageIdType);
        axls axlsVar = (axls) axlxVar.g;
        boolean z = axlsVar.c;
        UUID uuidRandomUUID = UUID.randomUUID();
        bvea bveaVar = z ? bvea.SMS_EMAIL : bvea.SMS_TELEPHONY;
        bbdl bbdlVar = (bbdl) this.J.b();
        int i = axlxVar.f;
        Optional optionalB = bbdlVar.f(i).b();
        String strN = optionalB.isPresent() ? optionalB.get().n() : "UNKNOWN_MI";
        int i2 = ekgb.d;
        ekfw ekfwVar = new ekfw();
        String str = axlsVar.a;
        ekfwVar.h(new batw(bvds.FROM_SMS_ORIGINATING, str));
        ekfwVar.h(new batw(bvds.SELF, ejwk.b(strN)));
        String str2 = axlsVar.b;
        if (!ejuf.e(str2, str)) {
            ekfwVar.h(new batw(bvds.FROM_SMS_DISPLAY_ORIGINATING, str2));
        }
        ((baxl) this.ac.b()).c(uuidRandomUUID, messageIdType, axlxVar.e, ekfwVar.g(), bveaVar, i);
        if (axlxVar.d.d()) {
            eksp ekspVar = b;
            eksl ekslVar = (eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveSmsMessageHelper", "launchNonCriticalActionsForReceivedMessage", 1509, "ReceiveSmsMessageHelper.java");
            ConversationIdType conversationIdType = axlxVar.b;
            ekslVar.t("second chance lookup for thread id for conversation [%s]", conversationIdType);
            cnqj cnqjVarA = ((avmr) this.y.b()).a(conversationIdType);
            if (cnqjVarA.c()) {
                ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveSmsMessageHelper", "launchNonCriticalActionsForReceivedMessage", 1516, "ReceiveSmsMessageHelper.java")).D("Found thread id [%s] for conversation [%s]", cnqjVarA, conversationIdType);
            } else {
                ((eksl) ((eksl) ekspVar.j()).h("com/google/android/apps/messaging/shared/datamodel/action/ReceiveSmsMessageHelper", "launchNonCriticalActionsForReceivedMessage", 1519, "ReceiveSmsMessageHelper.java")).t("Still unable to find thread id for conversation [%s]", conversationIdType);
            }
        }
        ((bbcw) this.aa.b()).b(axlxVar.c, axlxVar.b);
    }
}
