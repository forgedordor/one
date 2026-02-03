package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.provider.Telephony;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.ims.rcsservice.group.GroupInfo;
import j$.net.URLDecoder;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chwk implements chvp {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/rcs/RcsTelephonyAccessImpl");
    private final fcsu A;
    private final fcsu B;
    private final fcsu C;
    private final fcsu D;
    private final fcsu E;
    private final chwf F = new chwf(this);
    private final chwj G = new chwj(this);
    private final fcsu H;
    private final fcsu I;
    public final Context b;
    public final cqmr c;
    public final eosc d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final Optional h;
    public final eosc i;
    public final apsl j;
    public final fcsu k;
    private final fcsu l;
    private final fcsu m;
    private final dqsn n;
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;
    private final fcsu r;
    private final fcsu s;
    private final fcsu t;
    private final Optional u;
    private final fcsu v;
    private final chxp w;
    private final fcsu x;
    private final fcsu y;
    private final fcsu z;

    public chwk(Context context, dqsn dqsnVar, fcsu fcsuVar, fcsu fcsuVar2, cqmr cqmrVar, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, Optional optional, Optional optional2, eosc eoscVar, fcsu fcsuVar12, chxp chxpVar, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, fcsu fcsuVar16, fcsu fcsuVar17, fcsu fcsuVar18, fcsu fcsuVar19, fcsu fcsuVar20, eosc eoscVar2, apsl apslVar, fcsu fcsuVar21, fcsu fcsuVar22, fcsu fcsuVar23) {
        this.b = context;
        this.d = eoscVar;
        this.n = dqsnVar;
        this.l = fcsuVar;
        this.m = fcsuVar2;
        this.c = cqmrVar;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
        this.o = fcsuVar5;
        this.g = fcsuVar6;
        this.p = fcsuVar7;
        this.q = fcsuVar8;
        this.r = fcsuVar9;
        this.s = fcsuVar10;
        this.t = fcsuVar11;
        this.h = optional;
        this.u = optional2;
        this.v = fcsuVar12;
        this.w = chxpVar;
        this.x = fcsuVar13;
        this.y = fcsuVar14;
        this.z = fcsuVar15;
        this.A = fcsuVar16;
        this.B = fcsuVar17;
        this.C = fcsuVar18;
        this.D = fcsuVar19;
        this.E = fcsuVar20;
        this.i = eoscVar2;
        this.j = apslVar;
        this.k = fcsuVar21;
        this.H = fcsuVar22;
        this.I = fcsuVar23;
    }

    private final eiju A(MessageCoreData messageCoreData) {
        return ((bvuz) this.s.b()).c(messageCoreData.cB());
    }

    private static String B(MessageCoreData messageCoreData) {
        if (messageCoreData.da()) {
            return null;
        }
        return messageCoreData.w().d;
    }

    private final void C(ConversationIdType conversationIdType, MessageIdType messageIdType, Uri uri) {
        if (uri != null) {
            baxe baxeVar = (baxe) this.o.b();
            String[] strArr = MessagesTable.a;
            brdu brduVar = new brdu();
            brduVar.ap("updateMessageUri");
            brduVar.S(uri);
            baxeVar.V(conversationIdType, messageIdType, brduVar);
        }
    }

    private final eiju y(final MessageCoreData messageCoreData, final Uri uri, final String str, final chwg chwgVar) {
        return !u() ? eijx.e(null) : A(messageCoreData).h(new ejvr() { // from class: chvv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return null;
                }
                chwg chwgVar2 = chwgVar;
                String str2 = str;
                Uri uri2 = uri;
                if (this.a.r(messageCoreData, uri2, str2, chwgVar2) == null) {
                    return null;
                }
                chwgVar2.b();
                return null;
            }
        }, this.d);
    }

    private final eiju z(final MessageCoreData messageCoreData, final Uri uri, final String str, final chwg chwgVar) {
        return A(messageCoreData).h(new ejvr() { // from class: chvr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                chwk chwkVar = this.a;
                MessageCoreData messageCoreData2 = messageCoreData;
                Uri uri2 = uri;
                if (!zBooleanValue || chwkVar.u()) {
                    return chwkVar.s(messageCoreData2, uri2, null);
                }
                return chwkVar.r(messageCoreData2, uri2, str, chwgVar);
            }
        }, this.d);
    }

    @Override // defpackage.chvp
    public final long a(long j) {
        return w(j, null);
    }

    @Override // defpackage.chvp
    public final Uri b(MessageCoreData messageCoreData, ceah ceahVar, List list, long j, String str, int i) {
        ecem.b();
        ejwl.a(messageCoreData.u() == null);
        byte[] bytes = str != null ? str.getBytes() : null;
        if (((Boolean) avos.b.e()).booleanValue()) {
            bytes = chxq.c(messageCoreData, str, botm.c(messageCoreData.A()));
        }
        Uri uriM = ((cmqj) this.q.b()).m(this.b, list, messageCoreData, ceahVar, j, i, B(messageCoreData), messageCoreData.o(), bytes);
        if (uriM != null) {
            messageCoreData.bD(uriM);
        }
        return uriM;
    }

    @Override // defpackage.chvp
    public final Uri c(MessageCoreData messageCoreData, Uri uri, String str) {
        return r(messageCoreData, uri, str, this.F);
    }

    @Override // defpackage.chvp
    public final Uri d(MessageCoreData messageCoreData, long j, alqm alqmVar, String str, int i) {
        ecem.b();
        int iV = 1;
        ArrayList arrayListA = ((baqt) this.p.b()).a(messageCoreData.A(), true);
        String[] strArr = (String[]) arrayListA.toArray(new String[arrayListA.size()]);
        try {
            Uri uriU = messageCoreData.u();
            ln lnVarF = ((chwq) this.l.b()).f(messageCoreData);
            long jO = messageCoreData.o() / 1000;
            lx lxVar = new lx();
            String strP = alqmVar.p(true);
            strP.getClass();
            lxVar.b(new lg(strP));
            lxVar.g(new lg(""));
            lxVar.b = lnVarF;
            lxVar.f(jO);
            lxVar.e();
            String strAm = messageCoreData.am();
            if (strAm != null) {
                lxVar.a.j(ceae.f(strAm), 132);
            }
            lxVar.a.h(messageCoreData.s(), 142);
            lg[] lgVarArrF = lg.f(strArr);
            if (lgVarArrF != null) {
                lxVar.a.n(lgVarArrF);
            }
            if (str != null) {
                lxVar.i(str.getBytes(StandardCharsets.UTF_8));
            }
            if (((Boolean) avos.b.e()).booleanValue()) {
                lxVar.i(chxq.c(messageCoreData, str, botm.c(messageCoreData.A())));
            }
            MessagePartCoreData messagePartCoreDataH = messageCoreData.H();
            if (messagePartCoreDataH != null && !messageCoreData.cE()) {
                iV = v(messagePartCoreDataH);
            }
            String strB = B(messageCoreData);
            cmqj cmqjVar = (cmqj) this.q.b();
            Context context = this.b;
            Uri uriV = cmqjVar.V(context, lxVar, i, strB, j, jO, messageCoreData.F().b, iV);
            if (uriV == null) {
                return null;
            }
            Uri uriWithAppendedId = ContentUris.withAppendedId(Telephony.Mms.CONTENT_URI, ContentUris.parseId(uriV));
            messageCoreData.bD(uriWithAppendedId);
            C(messageCoreData.A(), messageCoreData.C(), uriWithAppendedId);
            messageCoreData.k();
            x();
            if (uriU != null) {
                ainv ainvVarB = ((aipo) this.r.b()).b("Bugle.Telephony.Delete.Rcs.Latency");
                cdzz.a(context.getContentResolver(), uriU, null, null);
                ainvVarB.c();
            }
            return uriWithAppendedId;
        } catch (li e) {
            ekrw ekrwVarI = a.i();
            ekrwVarI.X(eksq.a, "BugleTelephony");
            ekrd ekrdVar = (ekrd) ekrwVarI;
            ekrdVar.X(cqnc.f, messageCoreData.F());
            ekrdVar.X(cqnc.b, messageCoreData.C());
            ekrdVar.X(cqnc.s, messageCoreData.A());
            ((ekrd) ((ekrd) ekrdVar.g(e)).h("com/google/android/apps/messaging/shared/rcs/RcsTelephonyAccessImpl", "updateIncomingRcsInTelephony", 959, "RcsTelephonyAccessImpl.java")).q("updateIncomingRcsInTelephony: failed to create PDU");
            return null;
        }
    }

    @Override // defpackage.chvp
    public final cmtz e(cnqj cnqjVar, String str, String str2, Integer num) {
        String strK;
        String str3;
        String strB;
        String strA;
        ecem.b();
        if (str != null && ((chwl) this.m.b()).f(str)) {
            String strB2 = ejwk.b(((csrx) this.x.b()).c(str));
            int length = strB2.length();
            int i = length - 15;
            int i2 = length - 16;
            int iLastIndexOf = strB2.lastIndexOf(31, i2);
            int iLastIndexOf2 = strB2.lastIndexOf(31, iLastIndexOf - 1);
            if (iLastIndexOf == -1) {
                iLastIndexOf = strB2.lastIndexOf(45, i2);
                iLastIndexOf2 = strB2.lastIndexOf(45, iLastIndexOf - 1);
            }
            return cmtz.a(cnqjVar, ((cmqj) this.q.b()).ag(str2), URLDecoder.decode(strB2.substring(0, iLastIndexOf2)), strB2.substring(iLastIndexOf2 + 1, iLastIndexOf), strB2.substring(iLastIndexOf + 1, i));
        }
        if (str != null) {
            fcsu fcsuVar = this.m;
            if (((chwl) fcsuVar.b()).e(str)) {
                List listAg = ((cmqj) this.q.b()).ag(str2);
                cmtu cmtuVarA = ((chwl) fcsuVar.b()).a(str);
                if (cmtuVarA != null) {
                    strB = cmtuVarA.b;
                    if (TextUtils.isEmpty(strB)) {
                        strB = ((chvg) this.y.b()).b();
                    }
                    strA = cmtuVarA.c;
                    if (TextUtils.isEmpty(strA)) {
                        strA = bajp.a();
                    }
                    str3 = cmtuVarA.a;
                } else {
                    String strC = ((csrx) this.x.b()).c(str);
                    String str4 = String.format(Locale.US, "The RBM bot thread data in Telephony is invalid: encoded = %s, decoded = %s", cqcv.b(str), cqcv.b(strC));
                    ekrw ekrwVarJ = a.j();
                    ekrwVarJ.X(eksq.a, "BugleTelephony");
                    ekrd ekrdVar = (ekrd) ekrwVarJ;
                    ekrdVar.X(cqnc.u, cnqjVar);
                    ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/rcs/RcsTelephonyAccessImpl", "getRbmBotThreadData", 1080, "RcsTelephonyAccessImpl.java")).t("%s", str4);
                    Iterator it = listAg.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            strK = null;
                            break;
                        }
                        alqm alqmVar = (alqm) it.next();
                        if (alqmVar.t()) {
                            cczv cczvVar = alvx.a;
                            strK = alqmVar.k(((Boolean) new alvr().get()).booleanValue());
                            break;
                        }
                    }
                    if (strK != null) {
                        str = strK;
                    } else if (true != TextUtils.isEmpty(strC)) {
                        str = strC;
                    }
                    str3 = str;
                    strB = ((chvg) this.y.b()).b();
                    strA = bajp.a();
                }
                cmtu cmtuVar = new cmtu(str3, strB, strA);
                str3.getClass();
                return cmtz.b(cnqjVar, Collections.singletonList(((alrj) this.z.b()).n(str3)), cmtuVar);
            }
        }
        return ((cmqj) this.q.b()).v(cnqjVar, str2, num);
    }

    @Override // defpackage.chvp
    public final cnqj f(long j, GroupInfo groupInfo) {
        return cnqj.b(w(j, groupInfo));
    }

    @Override // defpackage.chvp
    public final cnqj g(cmtu cmtuVar) {
        if (cmtuVar == null) {
            return new cnqj();
        }
        ekrg ekrgVar = a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleTelephony");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/rcs/RcsTelephonyAccessImpl", "getOrCreateRbmBotThreadId", 1127, "RcsTelephonyAccessImpl.java")).t("Building encoded RBM telephony address for threadInfo: %s", String.format("id = %s, name = %s, color = %s", cmtuVar.a, cmtuVar.b, cmtuVar.c));
        long jF = ((cmot) this.A.b()).f(cmmo.a, ((chwl) this.m.b()).b(cmtuVar));
        ekrw ekrwVarH2 = ekrgVar.h();
        ekrwVarH2.X(ekrzVar, "BugleTelephony");
        ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/rcs/RcsTelephonyAccessImpl", "getOrCreateRbmBotThreadId", 1138, "RcsTelephonyAccessImpl.java")).s("RcsUtils.getOrCreateRbmBotThreadId returned thread id %d", jF);
        return cnqj.b(jF);
    }

    @Override // defpackage.chvp
    public final eiju h(final MessageCoreData messageCoreData, final ceah ceahVar, List list, final long j, final String str, final int i) {
        Stream map = Collection.EL.stream(list).map(new Function() { // from class: chvw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String strP = ((alqm) obj).p(true);
                strP.getClass();
                return strP;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i2 = ekgb.d;
        final ekgb ekgbVar = (ekgb) map.collect(ekcv.a);
        return A(messageCoreData).h(new ejvr() { // from class: chvx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) throws Throwable {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                chwk chwkVar = this.a;
                MessageCoreData messageCoreData2 = messageCoreData;
                long j2 = j;
                if (zBooleanValue) {
                    int i3 = i;
                    String str2 = str;
                    return chwkVar.b(messageCoreData2, ceahVar, ekgbVar, j2, str2, i3);
                }
                for (MessagePartCoreData messagePartCoreData : messageCoreData2.M()) {
                    Uri uriT = messagePartCoreData.t();
                    if (uriT != null) {
                        Context context = chwkVar.b;
                        ((bbae) chwkVar.f.b()).e(messageCoreData2, messagePartCoreData, uriT, cqmz.e(context, uriT, new File(context.getFilesDir(), "rcs_attachments"), messagePartCoreData.R(), null, chwkVar.c));
                    }
                }
                ((baqi) chwkVar.g.b()).b(messageCoreData2.A(), false, bvdk.UNARCHIVED);
                chwkVar.t(messageCoreData2, j2);
                return null;
            }
        }, this.d);
    }

    @Override // defpackage.chvp
    public final eiju i(MessageCoreData messageCoreData, Uri uri, String str) {
        return y(messageCoreData, uri, str, this.F);
    }

    @Override // defpackage.chvp
    public final eiju j(MessageCoreData messageCoreData, Uri uri, String str) {
        return y(messageCoreData, uri, str, this.G);
    }

    @Override // defpackage.chvp
    public final eiju k(final MessageCoreData messageCoreData, final Uri uri, final String str) {
        return eijx.g(new Callable() { // from class: chvu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.s(messageCoreData, uri, str);
            }
        }, this.d);
    }

    @Override // defpackage.chvp
    public final eiju l(final String str, final Uri uri, final String str2) {
        return eijx.g(new Callable() { // from class: chvz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                chwk chwkVar = this.a;
                Context context = chwkVar.b;
                return cqmz.e(context, uri, new File(context.getFilesDir(), "rcs_attachments"), str, str2, chwkVar.c);
            }
        }, this.d);
    }

    @Override // defpackage.chvp
    public final eiju m(MessageCoreData messageCoreData, Uri uri, String str) {
        return z(messageCoreData, uri, str, this.F);
    }

    @Override // defpackage.chvp
    public final eiju n(MessageCoreData messageCoreData, Uri uri, String str) {
        return z(messageCoreData, uri, str, this.G);
    }

    @Override // defpackage.chvp
    public final eiju o(final MessageCoreData messageCoreData, final long j, final alqm alqmVar, final String str, final int i) {
        return A(messageCoreData).h(new ejvr() { // from class: chvt
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                chwk chwkVar = this.a;
                MessageCoreData messageCoreData2 = messageCoreData;
                long j2 = j;
                if (!zBooleanValue) {
                    chwkVar.t(messageCoreData2, j2);
                    return null;
                }
                int i2 = i;
                return chwkVar.d(messageCoreData2, j2, alqmVar, str, i2);
            }
        }, this.d);
    }

    @Override // defpackage.chvp
    public final boolean p(ConversationIdType conversationIdType) {
        return baxe.c(conversationIdType) > 0;
    }

    @Override // defpackage.chvp
    public final boolean q() {
        boolean z = ((aqzd) this.H.b()).a() && !((ctce) this.E.b()).b();
        return z;
    }

    public final Uri r(final MessageCoreData messageCoreData, final Uri uri, final String str, final chwg chwgVar) {
        ejwl.a(!this.n.i());
        ejxr ejxrVar = new ejxr() { // from class: chwa
            @Override // defpackage.ejxr
            public final Object get() {
                MessageCoreData messageCoreData2 = messageCoreData;
                Uri uriU = messageCoreData2.u();
                uriU.getClass();
                Uri uri2 = uri;
                chwg chwgVar2 = chwgVar;
                MessagePartCoreData messagePartCoreDataH = messageCoreData2.H();
                String str2 = str;
                if (messagePartCoreDataH == null) {
                    ekrw ekrwVarI = chwk.a.i();
                    ekrwVarI.X(eksq.a, "BugleTelephony");
                    ekrd ekrdVar = (ekrd) ekrwVarI;
                    ekrdVar.X(cqnc.f, messageCoreData2.F());
                    ekrdVar.X(cqnc.b, messageCoreData2.C());
                    ekrdVar.X(cqnc.s, messageCoreData2.A());
                    ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/rcs/RcsTelephonyAccessImpl", "doStoreAttachmentInTelephonyDb", 390, "RcsTelephonyAccessImpl.java")).q("Missing message part, returning local directory copies");
                } else {
                    try {
                        return chwgVar2.a(uriU, uri2, messagePartCoreDataH, str2, messageCoreData2.aI());
                    } catch (lj e) {
                        ekrw ekrwVarI2 = chwk.a.i();
                        ekrwVarI2.X(eksq.a, "BugleTelephony");
                        ekrd ekrdVar2 = (ekrd) ekrwVarI2;
                        ekrdVar2.X(cqnc.f, messageCoreData2.F());
                        ekrdVar2.X(cqnc.b, messageCoreData2.C());
                        ekrdVar2.X(cqnc.s, messageCoreData2.A());
                        ((ekrd) ((ekrd) ekrdVar2.g(e)).h("com/google/android/apps/messaging/shared/rcs/RcsTelephonyAccessImpl", "doStoreAttachmentInTelephonyDb", 405, "RcsTelephonyAccessImpl.java")).q("IncomingRcs: persist attachment message failure");
                    }
                }
                return uri2;
            }
        };
        chxp chxpVar = this.w;
        chxpVar.a.lock();
        try {
            Object obj = ejxrVar.get();
            chxpVar.a.unlock();
            return (Uri) obj;
        } catch (Throwable th) {
            chxpVar.a.unlock();
            throw th;
        }
    }

    public final Uri s(MessageCoreData messageCoreData, Uri uri, String str) {
        Context context = this.b;
        return cqmz.e(context, uri, new File(context.getFilesDir(), "rcs_attachments"), messageCoreData.am(), str, this.c);
    }

    public final void t(MessageCoreData messageCoreData, long j) {
        ConversationIdType conversationIdTypeA = messageCoreData.A();
        if (baxe.c(conversationIdTypeA) > 0) {
            return;
        }
        MessageCoreData messageCoreDataE = ((bveg) this.t.b()).e(conversationIdTypeA, messageCoreData.v(), " ", null, false);
        messageCoreDataE.bx(true);
        messageCoreDataE.bU(1);
        ((bauh) this.v.b()).a(messageCoreDataE);
        ArrayList arrayListA = ((baqt) this.p.b()).a(conversationIdTypeA, true);
        String strB = B(messageCoreData);
        long jO = messageCoreDataE.o();
        ceah ceahVar = new ceah();
        ceahVar.b = ((chwq) this.l.b()).f(messageCoreDataE);
        ceahVar.a = 1L;
        Uri uriM = ((cmqj) this.q.b()).m(this.b, arrayListA, messageCoreDataE, ceahVar, j, -1, strB, jO, null);
        if (uriM != null) {
            messageCoreDataE.bD(uriM);
            C(messageCoreDataE.A(), messageCoreDataE.C(), uriM);
        }
    }

    public final boolean u() {
        boolean z = ((aqzb) this.C.b()).a() && !((ctce) this.E.b()).b();
        return z;
    }

    public final int v(MessagePartCoreData messagePartCoreData) {
        return ((cqmj) this.B.b()).a(messagePartCoreData.p()).c() ? 3 : 2;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0198 A[Catch: cgex -> 0x01da, efao -> 0x01dc, cgex | efao | SecurityException -> 0x01de, TryCatch #8 {cgex | efao | SecurityException -> 0x01de, blocks: (B:60:0x015d, B:62:0x0182, B:64:0x0186, B:67:0x0198, B:68:0x01b2), top: B:87:0x015d }] */
    /* JADX WARN: Type inference failed for: r19v0, types: [long] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long w(long r19, com.google.android.ims.rcsservice.group.GroupInfo r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chwk.w(long, com.google.android.ims.rcsservice.group.GroupInfo):long");
    }

    public final void x() {
        this.u.ifPresent(new Consumer() { // from class: chvy
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((cdzq) obj).a();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
