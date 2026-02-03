package com.google.android.apps.messaging.shared.datamodel.data;

import android.content.ContentValues;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import com.google.android.ims.message.rbm.RbmSpecificMessage;
import com.google.android.ims.message.rbm.RbmSuggestionResponse;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponse;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponseDeserializer;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import defpackage.apsl;
import defpackage.aqbx;
import defpackage.athh;
import defpackage.auvh;
import defpackage.awlc;
import defpackage.babu;
import defpackage.bacn;
import defpackage.bahu;
import defpackage.bahv;
import defpackage.bahy;
import defpackage.bayz;
import defpackage.baza;
import defpackage.bgzy;
import defpackage.bscl;
import defpackage.bscm;
import defpackage.bvdg;
import defpackage.bvdq;
import defpackage.bvdr;
import defpackage.bvdt;
import defpackage.bvfd;
import defpackage.bxfu;
import defpackage.cdsc;
import defpackage.cgwx;
import defpackage.cmqh;
import defpackage.cmtv;
import defpackage.cogw;
import defpackage.cqaz;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.cqcv;
import defpackage.cqmz;
import defpackage.cqok;
import defpackage.cqsu;
import defpackage.cqwn;
import defpackage.cqxp;
import defpackage.crqx;
import defpackage.crtr;
import defpackage.csss;
import defpackage.dqbw;
import defpackage.ecem;
import defpackage.eiid;
import defpackage.ejvr;
import defpackage.elha;
import defpackage.emop;
import defpackage.eosc;
import defpackage.evsn;
import defpackage.evtj;
import defpackage.fcsu;
import defpackage.le;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class MessagePartData extends babu implements MessagePartCoreData {
    public final Context b;
    public final Optional c;
    public final apsl d;
    public final fcsu e;
    public bscl f;
    public String g;
    public transient emop h;
    private final bxfu i;
    private final fcsu j;
    private final cmtv k;
    private final bahv l;
    private final cqsu m;
    private final cogw n;
    private final crqx o;
    private final cqmz p;
    private final cqok q;
    private final cqxp r;
    private final eosc s;
    private final aqbx t;
    private final boolean u;
    private final boolean v;
    private boolean w;
    private VmtTable.BindData x;
    private long y;
    public static final cqce a = cqce.g("BugleDataModel", "MessagePartData");
    public static final Parcelable.Creator<MessagePartCoreData> CREATOR = new bahu();

    /* compiled from: PG */
    public interface a {
        bahv by();
    }

    public MessagePartData(bxfu bxfuVar, fcsu fcsuVar, cmtv cmtvVar, bahv bahvVar, cqsu cqsuVar, cogw cogwVar, crqx crqxVar, Context context, cqmz cqmzVar, cqok cqokVar, Optional optional, cqxp cqxpVar, eosc eoscVar, apsl apslVar, fcsu fcsuVar2, Parcel parcel, aqbx aqbxVar) {
        this.i = bxfuVar;
        this.j = fcsuVar;
        this.k = cmtvVar;
        this.l = bahvVar;
        this.m = cqsuVar;
        this.n = cogwVar;
        this.o = crqxVar;
        this.b = context;
        this.p = cqmzVar;
        this.q = cqokVar;
        this.c = optional;
        this.r = cqxpVar;
        this.s = eoscVar;
        this.d = apslVar;
        this.e = fcsuVar2;
        this.t = aqbxVar;
        this.f = PartsTable.BindData.CREATOR.createFromParcel(parcel).w();
        this.g = parcel.readString();
        int i = parcel.readInt();
        if (i > 0) {
            byte[] bArr = new byte[i];
            parcel.readByteArray(bArr);
            try {
                this.h = (emop) evsn.parseFrom(emop.a, bArr);
            } catch (evtj e) {
                a.o("Unable to parse AttachmentInfo", e);
            }
        }
        if (parcel.readInt() > 0) {
            this.x = (VmtTable.BindData) parcel.readParcelable(VmtTable.BindData.class.getClassLoader());
        }
        if (parcel.dataAvail() > 0) {
            boolean z = parcel.readInt() == 1;
            this.u = z;
            if (aqbxVar.a()) {
                this.f.M(z);
            }
        } else {
            if (aqbxVar.a()) {
                this.f.M(false);
            }
            this.u = false;
        }
        if (parcel.dataAvail() > 0) {
            this.v = parcel.readInt() == 1;
        } else {
            this.v = false;
        }
        this.y = parcel.dataAvail() > 0 ? parcel.readLong() : 0L;
    }

    private final Rect bL(Uri uri, String str) {
        cqaz.h();
        if (str == null) {
            a.r("The content type is null");
            return null;
        }
        if (!le.m(str)) {
            a.r("The content type is not an image: ".concat(str));
            return null;
        }
        if (uri == null || uri == Uri.EMPTY) {
            a.r("The image uri is null");
            return null;
        }
        if (!cqmz.q(uri)) {
            a.r("The image uri is not local");
            return null;
        }
        Rect rectG = this.m.g(uri, str);
        if (rectG.width() == -1) {
            a.r("The image width is null");
            return null;
        }
        if (rectG.height() != -1) {
            return rectG;
        }
        a.r("The image height is null");
        return null;
    }

    private static String bM(bscl bsclVar) {
        if (!bP(bsclVar)) {
            if (bsclVar.t == 0.0d && bsclVar.u == 0.0d && bO(bsclVar)) {
                return null;
            }
            return bsclVar.c;
        }
        boolean zBP = bP(bsclVar);
        cqaz.k(zBP);
        String str = bsclVar.c;
        if (TextUtils.isEmpty(str) || !zBP) {
            return null;
        }
        ConversationSuggestionResponse conversationSuggestionResponseDeserializeFromJson = ConversationSuggestionResponseDeserializer.deserializeFromJson(str);
        if (conversationSuggestionResponseDeserializeFromJson != null && !TextUtils.isEmpty(conversationSuggestionResponseDeserializeFromJson.displayText)) {
            return conversationSuggestionResponseDeserializeFromJson.displayText;
        }
        cqbd cqbdVarE = a.e();
        cqbdVarE.I("Unable to extract display text from suggestion response:");
        cqbdVarE.I(str);
        cqbdVarE.r();
        return null;
    }

    private final void bN() {
        ecem.b();
        Uri uri = this.f.e;
        if (uri == null || !cqmz.q(uri)) {
            return;
        }
        at(cqmz.b(this.b, uri));
    }

    private static boolean bO(bscl bsclVar) {
        return (TextUtils.isEmpty(bsclVar.f) || le.w(bsclVar.f) || bP(bsclVar)) ? false : true;
    }

    private static boolean bP(bscl bsclVar) {
        return RbmSuggestionResponse.CONTENT_TYPE.equals(bsclVar.f);
    }

    private static boolean bQ(List list, elha elhaVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
            if (RbmSpecificMessage.CONTENT_TYPE.equals(messagePartCoreData.R()) && messagePartCoreData.K() == elhaVar) {
                return true;
            }
        }
        return false;
    }

    public static boolean by(List list) {
        return bQ(list, elha.RICH_CARD);
    }

    public static boolean bz(List list) {
        return bQ(list, elha.RICH_CARD_CAROUSEL);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final ConversationIdType A() {
        return this.f.p;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final MessageIdType B() {
        return this.f.b;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final baza C() {
        Uri uri;
        Uri uriX;
        String strX;
        String strR = R();
        if (t() != null) {
            uriX = t();
            strX = R();
        } else {
            if (x() == null) {
                uri = null;
                return new bayz(strR, uri);
            }
            uriX = x();
            strX = X();
        }
        String str = strX;
        uri = uriX;
        strR = str;
        return new bayz(strR, uri);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public MessagePartCoreData D() {
        MessagePartData messagePartDataB = this.l.b(this);
        ((Boolean) cgwx.a.e()).booleanValue();
        return messagePartDataB;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final PartsTable.BindData E() {
        return this.f.a();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final bvdq F() {
        return this.f.Z;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final bvdr G() {
        return this.f.U;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final bvdt H() {
        return this.f.n;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final LocationInformation I() {
        if (!bk()) {
            return null;
        }
        Location location = new Location("Bugler");
        location.setLongitude(this.f.t);
        location.setLatitude(this.f.u);
        LocationInformation locationInformation = new LocationInformation(location, null);
        String str = this.g;
        if (csss.b(str)) {
            locationInformation.a = str;
        }
        return locationInformation;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final dqbw J() {
        return (dqbw) Objects.requireNonNullElse(this.f.V, dqbw.a);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final elha K() {
        elha elhaVarB = elha.b(this.f.y);
        return elhaVarB == null ? elha.UNKNOWN : elhaVarB;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final emop L() {
        return this.h;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String M() {
        return this.f.B;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String N() {
        return this.f.A;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String O() {
        return this.f.L;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String P() {
        return this.f.C;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String Q() {
        return this.f.K;
    }

    @Override // defpackage.bazc
    public final String R() {
        return this.f.f;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String S() {
        return this.g;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String T() {
        return this.f.H;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String U() {
        return this.f.I;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String V() {
        return this.f.T;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String W() {
        return this.f.a;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String X() {
        return this.f.w;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String Y() {
        return this.f.d;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String Z() {
        return this.f.r.toString();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final int a() {
        return this.f.z;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aA(Uri uri) {
        this.f.L(uri);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aB(Uri uri) {
        this.f.Q(uri);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aC(long j) {
        this.y = j;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aD(athh athhVar) {
        this.f.P(athhVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aE(bvdt bvdtVar) {
        this.f.R(bvdtVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aF(String str) {
        this.f.S(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aG(String str) {
        this.f.V(new bvdg(str));
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aH(long j) {
        this.f.Y(j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aI(String str) {
        if (!TextUtils.isEmpty(str) && bo()) {
            str = str.trim();
        }
        this.f.Z(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aJ(dqbw dqbwVar) {
        this.f.ad(dqbwVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aK(VmtTable.BindData bindData) {
        this.x = bindData;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a2  */
    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aL(android.content.Context r13) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.data.MessagePartData.aL(android.content.Context):void");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aM(PartsTable.BindData bindData) {
        this.f.f(bindData.D());
        this.f.g(bindData.E());
        this.f.i(bindData.p());
        this.f.h(bindData.O());
        this.f.G(bindData.S());
        this.f.p(bindData.H());
        this.f.r(bindData.q());
        this.f.s(bindData.R());
        this.f.q(bindData.P());
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aN(ConversationIdType conversationIdType) {
        this.f.u(conversationIdType);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aO(MessageIdType messageIdType) {
        this.f.J(messageIdType);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aP(String str) {
        boolean z = false;
        if (!TextUtils.isEmpty(str) && TextUtils.isEmpty(W())) {
            z = true;
        }
        cqaz.k(z);
        this.f.B(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aQ(MessagePartCoreData messagePartCoreData) {
        this.f.ab(messagePartCoreData.t());
        this.f.Q(messagePartCoreData.w());
        this.f.Y(messagePartCoreData.p());
        this.f.R(messagePartCoreData.H());
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean aR() {
        if (this.v) {
            return bj() || bx();
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean aS() {
        if (bo() && this.o.h()) {
            Optional optionalA = cdsc.a(this.g);
            if (optionalA.isPresent() && csss.b((String) optionalA.get())) {
                return false;
            }
        }
        return aX();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean aT() {
        return this.f.F;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean aU() {
        return this.f.M;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean aV() {
        return (TextUtils.isEmpty(this.g) || bd()) ? false : true;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean aW() {
        return !TextUtils.isEmpty(U());
    }

    @Override // defpackage.bazc
    public final boolean aX() {
        return bO(this.f);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean aY() {
        return le.f(this.f.f);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean aZ() {
        return this.f.R;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String aa() {
        return this.f.q.toString();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final String ab() {
        return this.f.c;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void ac() {
        this.f = this.f.a().x();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void ad() {
        ecem.b();
        if (aY()) {
            bN();
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void ae() {
        ecem.b();
        if (bx()) {
            bN();
        }
    }

    @Override // defpackage.bazc
    public final void af() {
        cqaz.h();
        Rect rectBL = bL(this.f.e, R());
        if (rectBL != null) {
            this.f.ae(rectBL.width());
            this.f.A(rectBL.height());
        }
    }

    public final void ag() {
        cqaz.h();
        Uri uri = this.f.e;
        cqaz.h();
        Point point = null;
        if (R() == null) {
            a.r("The content type is null.");
        } else if (bx() && uri != null && cqmz.q(uri)) {
            cqxp cqxpVar = this.r;
            Point point2 = (Point) cqwn.c(cqxpVar.a, uri, new ejvr() { // from class: cqwu
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return cqwv.b((cqwn) obj);
                }
            }, new Point(-1, -1));
            if (point2.x != -1 && point2.y != -1) {
                point = point2;
            }
        }
        if (point != null) {
            this.f.ae(point.x);
            this.f.A(point.y);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void ah() {
        final Uri uriY = y();
        if (uriY != null) {
            auvh.h(this.s.submit(eiid.k(new Runnable() { // from class: baht
                @Override // java.lang.Runnable
                public final void run() {
                    MessagePartData messagePartData = this.a;
                    final Uri uri = uriY;
                    try {
                        messagePartData.b.getContentResolver().delete(uri, null, null);
                        if (messagePartData.d.a()) {
                            ((awlc) messagePartData.e.b()).d(new Consumer() { // from class: bahr
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj) {
                                    ((cmvv) obj).b(uri);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                        } else {
                            messagePartData.c.ifPresent(new Consumer() { // from class: bahs
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj) {
                                    ((cmvv) ((fcsu) obj).b()).b(uri);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                        }
                    } catch (SecurityException e) {
                        MessagePartData.a.o("Unable to remove message part data content.", e);
                    }
                }
            })));
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void ai() {
        final Uri uriY = y();
        if (uriY != null) {
            try {
                this.b.getContentResolver().delete(uriY, null, null);
                if (this.d.a()) {
                    ((awlc) this.e.b()).d(new Consumer() { // from class: bahp
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            ((cmvv) obj).b(uriY);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                } else {
                    this.c.ifPresent(new Consumer() { // from class: bahq
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            ((cmvv) ((fcsu) obj).b()).b(uriY);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
            } catch (SecurityException e) {
                a.o("Unable to remove message part data content.", e);
            }
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aj(String str) {
        bI();
        aG(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void ak(emop emopVar) {
        this.h = emopVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void al(String str) {
        this.f.g(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void am(long j) {
        this.f.i(j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void an(String str) {
        this.f.p(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void ao(long j) {
        this.f.r(j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void ap(byte[] bArr) {
        this.f.s(bArr);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aq(String str) {
        this.f.t(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void ar(Uri uri) {
        this.f.ab(uri);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void as(ConversationIdType conversationIdType) {
        this.f.u(conversationIdType);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void at(long j) {
        this.f.v(j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void au(String str) {
        this.f.w(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void av(Uri uri) {
        this.f.x(uri);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void aw(String str) {
        if (str != null) {
            this.f.y(str);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void ax(bvdq bvdqVar) {
        this.f.C(bvdqVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void ay(byte[] bArr) {
        this.f.G(bArr);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void az(bvdr bvdrVar) {
        this.f.I(bvdrVar);
    }

    @Override // defpackage.bazc
    public final int b() {
        return this.f.j;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bA(Uri uri) {
        Uri uriT = t();
        if (uriT != null && uriT.equals(uri)) {
            return true;
        }
        Uri uriV = v();
        return uriV != null && uriV.equals(uri);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bB(MessagePartCoreData messagePartCoreData) {
        return bA(messagePartCoreData.t()) || bA(messagePartCoreData.v());
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final byte[] bC() {
        return this.f.E;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final byte[] bD() {
        return this.f.D;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final byte[] bE() {
        return this.f.P;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final byte[] bF() {
        return this.f.O;
    }

    public final InputStream bG(Uri uri) {
        return this.p.f(uri);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void bH() {
        this.f.e(true);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void bI() {
        this.f.W(new bvdg("custom_sticker"));
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final long bJ() throws IOException {
        InputStream inputStreamBG;
        cqaz.h();
        long jL = l();
        if (jL > 0) {
            return jL;
        }
        Uri uriV = v();
        if (uriV != null) {
            try {
                inputStreamBG = bG(uriV);
                try {
                    long jAvailable = inputStreamBG.available();
                    inputStreamBG.close();
                    return jAvailable;
                } finally {
                }
            } catch (Exception e) {
                cqbd cqbdVarE = a.e();
                cqbdVarE.I("Unable to get original media file size with original uri:");
                cqbdVarE.I(uriV);
                cqbdVarE.s(e);
            }
        }
        Uri uriT = t();
        if (uriT != null) {
            try {
                inputStreamBG = bG(uriT);
                try {
                    long jAvailable2 = inputStreamBG.available();
                    inputStreamBG.close();
                    return jAvailable2;
                } finally {
                    try {
                        inputStreamBG.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            } catch (Exception e2) {
                cqbd cqbdVarE2 = a.e();
                cqbdVarE2.I("Unable to get original media file size with content uri:");
                cqbdVarE2.I(uriT);
                cqbdVarE2.s(e2);
            }
        }
        return 0L;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean ba() {
        return this.n.f().toEpochMilli() - this.f.G > TimeUnit.DAYS.toMillis((long) ((Integer) bvfd.h.e()).intValue());
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bb() {
        return this.n.f().toEpochMilli() - this.f.N > TimeUnit.DAYS.toMillis((long) ((Integer) bvfd.h.e()).intValue());
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bc() {
        return Objects.equals("custom_sticker", aa());
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bd() {
        return bq() || br();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean be() {
        return Objects.equals(this.f.f, "application/x-end-of-emergency-proto");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bf() {
        int i = this.f.y;
        return i == 11 || i == 26 || i == 34 || i == 35;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bg() {
        return le.i(this.f.f);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bh() {
        return le.j(this.f.f);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bi() {
        return G() == bvdr.GOOGLE_PHOTOS_LINK;
    }

    @Override // defpackage.bazc
    public final boolean bj() {
        return le.m(this.f.f);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bk() {
        bscl bsclVar = this.f;
        return (bsclVar.u == 0.0d && bsclVar.t == 0.0d) ? false : true;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bl() {
        return le.p(this.f.f);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bm() {
        return this.f.Q;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bn() {
        int i = this.f.y;
        return i == 16 || i == 17;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bo() {
        return le.s(this.f.f);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bp() {
        return this.t.a() ? !this.f.aa && ((bj() && !bk()) || bx()) : !this.u && ((bj() && !bk()) || bx());
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bq() {
        return RbmSpecificMessage.CONTENT_TYPE.equals(this.f.f) && this.f.y == 15;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean br() {
        return RbmSpecificMessage.CONTENT_TYPE.equals(this.f.f) && this.f.y == 22;
    }

    @Override // defpackage.bazc
    public final boolean bs() {
        return K() == elha.RICH_CARD_THUMBNAIL;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bt() {
        return bP(this.f);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bu() {
        return le.u(this.f.f);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bv() {
        return le.w(this.f.f);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final boolean bw() {
        return le.y(this.f.f);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, defpackage.bazc
    public final boolean bx() {
        return le.z(this.f.f);
    }

    @Override // defpackage.bazc
    public final int c() {
        return this.f.i;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final long d() {
        return this.f.G;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final long e() {
        return this.f.N;
    }

    public final boolean equals(Object obj) {
        Uri uri;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagePartData)) {
            return false;
        }
        MessagePartData messagePartData = (MessagePartData) obj;
        bscl bsclVar = this.f;
        Uri uri2 = bsclVar.v;
        int i = bsclVar.i;
        bscl bsclVar2 = messagePartData.f;
        return i == bsclVar2.i && bsclVar.j == bsclVar2.j && bsclVar.b.equals(bsclVar2.b) && TextUtils.equals(this.f.c, messagePartData.f.c) && TextUtils.equals(this.f.f, messagePartData.f.f) && ((uri = this.f.e) != null ? uri.equals(messagePartData.f.e) : messagePartData.f.e == null) && TextUtils.equals(String.valueOf(uri2), String.valueOf(messagePartData.f.v)) && (uri2 != null ? uri2.equals(messagePartData.f.v) : messagePartData.f.v == null) && this.f.Z == messagePartData.f.Z;
    }

    public final int hashCode() {
        bscl bsclVar = this.f;
        int i = ((bsclVar.i + 527) * 31) + bsclVar.j;
        String strB = bsclVar.b.b();
        int iHashCode = strB.isEmpty() ? 0 : strB.hashCode();
        String str = this.f.c;
        int iHashCode2 = (((i * 31) + iHashCode) * 31) + (str == null ? 0 : str.hashCode());
        String str2 = this.f.d;
        int iHashCode3 = (iHashCode2 * 31) + (str2 == null ? 0 : str2.hashCode());
        String str3 = this.f.f;
        int iHashCode4 = (iHashCode3 * 31) + (str3 == null ? 0 : str3.hashCode());
        Uri uri = this.f.e;
        int iHashCode5 = (iHashCode4 * 31) + (uri == null ? 0 : uri.hashCode());
        String str4 = this.f.w;
        int iHashCode6 = (iHashCode5 * 31) + (str4 == null ? 0 : str4.hashCode());
        Uri uri2 = this.f.v;
        return (iHashCode6 * 31) + (uri2 != null ? uri2.hashCode() : 0);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final long k() {
        return this.f.J;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final long l() {
        return this.f.S;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final long m() {
        return this.f.s;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final long n() {
        cqaz.h();
        if (aX() && (!((Boolean) cgwx.a.e()).booleanValue() || !bi())) {
            Uri uriT = t();
            long jA = uriT == null ? 0L : this.p.a(uriT);
            if (bj()) {
                if (!bh()) {
                    return 16384L;
                }
                af();
                if (this.q.a(c(), b())) {
                    return (long) (jA * 0.35f);
                }
            } else if (!aY()) {
                if (bx()) {
                    return ((k() != -1 ? k() : cqmz.b(this.b, t())) * 4096) / TimeUnit.SECONDS.toMillis(1L);
                }
                if (!bw()) {
                    cqbd cqbdVarE = a.e();
                    cqbdVarE.I("Unknown attachment type:");
                    cqbdVarE.I(R());
                    cqbdVarE.r();
                }
            }
            return jA;
        }
        return 0L;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final long o() {
        return this.y;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final long p() {
        return this.f.m;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final long q() {
        if (!((cmqh) this.j.b()).b()) {
            bscl bsclVar = this.f;
            if (bsclVar.i == -1 || bsclVar.j == -1) {
                if (bj()) {
                    af();
                } else if (bx()) {
                    ag();
                }
            }
        }
        return this.f.a().x().a().C().longValue();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final ContentValues r() {
        cqaz.k(!this.f.b.c());
        ContentValues contentValues = new ContentValues();
        this.f.a().b(contentValues);
        if (this.f.i == -1) {
            contentValues.remove("width");
        }
        if (this.f.j == -1) {
            contentValues.remove("height");
        }
        return contentValues;
    }

    public final Rect s() {
        return bL(x(), X());
    }

    @Override // defpackage.bazc
    public final Uri t() {
        Uri uri = this.f.e;
        if (uri == null || uri.toString().isEmpty()) {
            return null;
        }
        return this.f.e;
    }

    public final String toString() {
        String strAb = ab();
        if (aV() && !TextUtils.isEmpty(strAb)) {
            return cqcv.b(strAb).toString();
        }
        return R() + " (" + String.valueOf(t()) + ")";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final Uri u() {
        return this.f.x;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public Uri v() {
        return this.f.g;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final Uri w() {
        return this.f.l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        cqaz.k(!this.w);
        this.f.a().writeToParcel(parcel, i);
        parcel.writeString(this.g);
        emop emopVar = this.h;
        if (emopVar != null) {
            byte[] byteArray = emopVar.toByteArray();
            parcel.writeInt(byteArray.length);
            parcel.writeByteArray(byteArray);
        } else {
            parcel.writeInt(0);
        }
        if (this.x != null) {
            parcel.writeInt(1);
            parcel.writeParcelable(this.x, i);
        } else {
            parcel.writeInt(0);
        }
        if (this.t.a()) {
            parcel.writeInt(this.f.aa ? 1 : 0);
        } else {
            parcel.writeInt(this.u ? 1 : 0);
        }
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeLong(this.y);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final Uri x() {
        return this.f.v;
    }

    protected Uri y() {
        cqaz.k(!this.w);
        this.w = true;
        bscl bsclVar = this.f;
        Uri uri = bsclVar.e;
        bsclVar.ab(null);
        this.f.t(null);
        if (this.i.j(uri) || K() == elha.RICH_CARD_THUMBNAIL || K() == elha.RICH_CARD_MEDIA) {
            return uri;
        }
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final athh z() {
        return this.f.X;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData
    public final void bK() {
    }

    @Override // defpackage.babu
    protected final void h() {
    }

    public MessagePartData(bxfu bxfuVar, fcsu fcsuVar, cmtv cmtvVar, bahv bahvVar, cqsu cqsuVar, cogw cogwVar, crqx crqxVar, Context context, cqmz cqmzVar, cqok cqokVar, Optional optional, cqxp cqxpVar, eosc eoscVar, apsl apslVar, fcsu fcsuVar2, MessagePartData messagePartData, aqbx aqbxVar) {
        this.i = bxfuVar;
        this.j = fcsuVar;
        this.k = cmtvVar;
        this.l = bahvVar;
        this.m = cqsuVar;
        this.n = cogwVar;
        this.o = crqxVar;
        this.b = context;
        this.p = cqmzVar;
        this.q = cqokVar;
        this.c = optional;
        this.r = cqxpVar;
        this.d = apslVar;
        this.e = fcsuVar2;
        this.s = eoscVar;
        this.t = aqbxVar;
        this.f = messagePartData.f.a().x();
        this.h = messagePartData.h;
        this.v = messagePartData.v;
        this.u = messagePartData.u;
    }

    public MessagePartData(bxfu bxfuVar, fcsu fcsuVar, cmtv cmtvVar, bahv bahvVar, cqsu cqsuVar, cogw cogwVar, crqx crqxVar, Context context, cqmz cqmzVar, cqok cqokVar, Optional optional, cqxp cqxpVar, eosc eoscVar, apsl apslVar, fcsu fcsuVar2, bahy bahyVar, aqbx aqbxVar) {
        bvdq bvdqVar;
        this.i = bxfuVar;
        this.j = fcsuVar;
        this.k = cmtvVar;
        this.l = bahvVar;
        this.m = cqsuVar;
        this.n = cogwVar;
        this.o = crqxVar;
        this.b = context;
        this.p = cqmzVar;
        this.q = cqokVar;
        this.c = optional;
        this.r = cqxpVar;
        this.s = eoscVar;
        this.d = apslVar;
        this.e = fcsuVar2;
        this.t = aqbxVar;
        String[] strArr = PartsTable.a;
        bscm bscmVar = new bscm();
        this.f = bscmVar;
        bacn bacnVar = (bacn) bahyVar;
        bscmVar.J(bacnVar.a);
        bscmVar.Z(bacnVar.b);
        bscmVar.S(null);
        bscmVar.t(bacnVar.c);
        bscmVar.ab(bacnVar.d);
        bscmVar.L(bacnVar.e);
        bscmVar.x(null);
        bscmVar.ae(bacnVar.f);
        bscmVar.A(bacnVar.g);
        bscmVar.v(bacnVar.h);
        bscmVar.Q(null);
        bscmVar.Y(bacnVar.i);
        bscmVar.R(bvdt.SUCCEEDED);
        bscmVar.U(bacnVar.j.a());
        bscmVar.W(new bvdg(bacnVar.k));
        bscmVar.V(new bvdg(bacnVar.l));
        bscmVar.w(bacnVar.o);
        bscmVar.y(bacnVar.p);
        bscmVar.j(bacnVar.u);
        bscmVar.H(bacnVar.m);
        bscmVar.N(bacnVar.q);
        bscmVar.I(bacnVar.t);
        bscmVar.z(bacnVar.s);
        bscmVar.ad(bacnVar.r);
        bscmVar.T(bacnVar.z);
        if (aqbxVar.a()) {
            this.f.M(bacnVar.v);
        }
        this.u = bacnVar.v;
        athh athhVar = bacnVar.x;
        if (athhVar != null) {
            this.f.P(athhVar);
        }
        if (crtr.e() && (bvdqVar = bacnVar.y) != null) {
            this.f.C(bvdqVar);
        }
        LocationInformation locationInformation = bacnVar.n;
        if (locationInformation == null) {
            this.f.F(0.0d);
            this.f.D(0.0d);
        } else {
            this.f.F(locationInformation.c);
            this.f.D(locationInformation.d);
        }
        this.g = bM(this.f);
        this.v = bacnVar.w;
    }

    public MessagePartData(bxfu bxfuVar, fcsu fcsuVar, cmtv cmtvVar, bahv bahvVar, cqsu cqsuVar, cogw cogwVar, crqx crqxVar, Context context, cqmz cqmzVar, cqok cqokVar, Optional optional, cqxp cqxpVar, eosc eoscVar, apsl apslVar, fcsu fcsuVar2, bgzy bgzyVar, aqbx aqbxVar) {
        this.i = bxfuVar;
        this.j = fcsuVar;
        this.k = cmtvVar;
        this.l = bahvVar;
        this.m = cqsuVar;
        this.n = cogwVar;
        this.o = crqxVar;
        this.b = context;
        this.p = cqmzVar;
        this.q = cqokVar;
        this.c = optional;
        this.r = cqxpVar;
        this.d = apslVar;
        this.e = fcsuVar2;
        this.s = eoscVar;
        this.t = aqbxVar;
        String[] strArr = PartsTable.a;
        bscm bscmVar = new bscm();
        this.f = bscmVar;
        bgzyVar.aA(96, "blob_id");
        bscmVar.g(bgzyVar.x);
        bgzyVar.aA(97, "blob_gaia_email");
        bscmVar.f(bgzyVar.y);
        bgzyVar.aA(EnergyProfile.EVCONNECTOR_TYPE_OTHER, "blob_upload_permanent_failure");
        bscmVar.h(bgzyVar.z);
        bgzyVar.aA(102, "blob_upload_timestamp");
        bscmVar.i(bgzyVar.A);
        bgzyVar.aA(106, "compressed_blob_id");
        bscmVar.p(bgzyVar.E);
        bgzyVar.aA(108, "compressed_blob_upload_permanent_failure");
        bscmVar.q(bgzyVar.F);
        bgzyVar.aA(109, "compressed_blob_upload_timestamp");
        bscmVar.r(bgzyVar.G);
        bgzyVar.aA(111, "compressed_media_encryption_key");
        bscmVar.s(bgzyVar.I);
        bgzyVar.aA(75, "content_type");
        bscmVar.t(bgzyVar.f);
        bgzyVar.aA(85, "conversation_id");
        bscmVar.u(bgzyVar.n);
        bgzyVar.aA(105, "duration");
        bscmVar.v(bgzyVar.D);
        bgzyVar.aA(103, "expressive_sticker_name");
        bscmVar.w(bgzyVar.B);
        bgzyVar.aA(93, "fallback_uri");
        bscmVar.x(bgzyVar.v);
        bgzyVar.aA(104, "file_name");
        bscmVar.y(bgzyVar.C);
        bgzyVar.aA(79, "height");
        bscmVar.A(bgzyVar.i);
        bgzyVar.aA(70, "_id");
        bscmVar.B(bgzyVar.a);
        bgzyVar.aA(90, "latitude");
        bscmVar.D(bgzyVar.s);
        bgzyVar.aA(89, "longitude");
        bscmVar.F(bgzyVar.r);
        bgzyVar.aA(110, "media_encryption_key");
        bscmVar.G(bgzyVar.H);
        bgzyVar.aA(88, "media_modified_timestamp");
        bscmVar.H(bgzyVar.q);
        bgzyVar.aA(71, "message_id");
        bscmVar.J(bgzyVar.b);
        bgzyVar.aA(76, "original_uri");
        bscmVar.L(bgzyVar.g);
        bgzyVar.aA(81, "output_uri");
        bscmVar.Q(bgzyVar.k);
        bgzyVar.aA(92, "preview_content_type");
        bscmVar.N(bgzyVar.u);
        bgzyVar.aA(91, "preview_content_uri");
        bscmVar.O(bgzyVar.t);
        bgzyVar.aA(83, "processing_status");
        bscmVar.R(bgzyVar.m);
        bgzyVar.aA(94, "source");
        bscmVar.U(bgzyVar.w);
        bgzyVar.aA(87, "sticker_id");
        bscmVar.V(bgzyVar.p);
        bgzyVar.aA(86, "sticker_set_id");
        bscmVar.W(bgzyVar.o);
        bgzyVar.aA(82, "target_size");
        bscmVar.Y(bgzyVar.l);
        bgzyVar.aA(72, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        bscmVar.Z(bgzyVar.c);
        bgzyVar.aA(73, "raw_text");
        bscmVar.S(bgzyVar.d);
        bgzyVar.aA(80, "timestamp");
        bscmVar.aa(bgzyVar.j);
        bgzyVar.aA(74, ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
        bscmVar.ab(bgzyVar.e);
        bgzyVar.aA(78, "width");
        bscmVar.ae(bgzyVar.h);
        bgzyVar.aA(114, "file_size_bytes");
        bscmVar.z(bgzyVar.J);
        bgzyVar.aA(120, "rich_card_media_download_failure_reason");
        bscmVar.T(bgzyVar.K);
        if (aqbxVar.a()) {
            bscl bsclVar = this.f;
            bgzyVar.aA(122, "preserve_size");
            bsclVar.M(bgzyVar.L);
        }
        this.u = false;
        this.v = false;
    }

    public MessagePartData(bxfu bxfuVar, fcsu fcsuVar, cmtv cmtvVar, bahv bahvVar, cqsu cqsuVar, cogw cogwVar, crqx crqxVar, Context context, cqmz cqmzVar, cqok cqokVar, Optional optional, cqxp cqxpVar, eosc eoscVar, apsl apslVar, fcsu fcsuVar2, PartsTable.BindData bindData, aqbx aqbxVar) {
        this.i = bxfuVar;
        this.j = fcsuVar;
        this.k = cmtvVar;
        this.l = bahvVar;
        this.m = cqsuVar;
        this.n = cogwVar;
        this.o = crqxVar;
        this.b = context;
        this.p = cqmzVar;
        this.q = cqokVar;
        this.c = optional;
        this.r = cqxpVar;
        this.s = eoscVar;
        this.d = apslVar;
        this.e = fcsuVar2;
        this.t = aqbxVar;
        bscl bsclVarW = bindData.w();
        this.f = bsclVarW;
        this.g = bM(bsclVarW);
        this.v = false;
        this.u = false;
    }
}
