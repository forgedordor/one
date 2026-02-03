package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Size;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBuglePartialMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.ims.message.rbm.RbmSpecificMessage;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCard;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amvo implements amtw {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory");
    private final bahv b;
    private final amsw c;
    private final Context d;
    private final baui e;
    private final aqbh f;
    private final arvu g;
    private final arjo h;
    private final cogw i;
    private final amxy j;
    private final amyj k;

    public amvo(Context context, cogw cogwVar, bahv bahvVar, amxy amxyVar, amsw amswVar, baui bauiVar, aqbh aqbhVar, arvu arvuVar, amyj amyjVar, arjo arjoVar) {
        this.d = context;
        this.i = cogwVar;
        this.b = bahvVar;
        this.j = amxyVar;
        this.c = amswVar;
        this.e = bauiVar;
        this.f = aqbhVar;
        this.g = arvuVar;
        this.k = amyjVar;
        this.h = arjoVar;
    }

    private final amsv e(MessagesTable.BindData bindData, MessagePartData messagePartData, ancl anclVar) throws IOException {
        Rect rectS;
        String str;
        Uri uri;
        elha elhaVar;
        String str2;
        Uri uri2;
        elha elhaVar2;
        Size size;
        String str3;
        Uri uri3;
        dqbw dqbwVar;
        Duration duration;
        if (messagePartData.bm()) {
            Uri uriT = messagePartData.t();
            String authority = uriT == null ? null : uriT.getAuthority();
            if (!((eoth) ((arit) this.h).a.b()).a("bugle.skip_missing_from_telephony_check_for_rcs_location") ? authority == null || authority.startsWith("mms") : !messagePartData.bo() && (authority == null || authority.startsWith("mms"))) {
                return g(bindData, messagePartData);
            }
        }
        if (w(bindData, messagePartData)) {
            int iS = bindData.s();
            baui bauiVar = this.e;
            Context context = this.d;
            boolean z = !craf.i(context) && (iS == 106 || iS == 101 || iS == 110 || iS == 112 || iS == 115 || (baui.f(iS) && bauiVar.c.q())) && !craf.i(context);
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleMapi");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "createPendingMmsContent", 574, "CoreBugleContentFactory.java")).K("Attachment is PendingContent messageId=%s status=%x canRedownload=%b contentType=%s uri=%s", bindData.E().b(), Integer.valueOf(iS), Boolean.valueOf(z), messagePartData.R(), this.c.a(messagePartData.t(), messagePartData.v()));
            Uri uri4 = Uri.EMPTY;
            if (uri4 == null) {
                throw new NullPointerException("Null uri");
            }
            String strR = messagePartData.R();
            strR.getClass();
            return new amto(strR, uri4, messagePartData.p(), z, p(bindData, messagePartData));
        }
        if (messagePartData.aY()) {
            if (messagePartData.t() == null) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "BugleMapi");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "createAudioContent", 594, "CoreBugleContentFactory.java")).q("Null Uri on audio message part");
            }
            Uri uriA = this.c.a(messagePartData.t(), messagePartData.v());
            ekrw ekrwVarH2 = a.h();
            ekrwVarH2.X(eksq.a, "BugleMapi");
            ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "createAudioContent", 599, "CoreBugleContentFactory.java")).J("Attachment is Audio messageId=%s status=%x contentType=%s uri=%s", bindData.E().b(), Integer.valueOf(bindData.s()), messagePartData.R(), uriA);
            amta amtaVar = new amta();
            amtaVar.e = null;
            amtaVar.f = null;
            amtaVar.a(dqbw.a);
            amtaVar.f = (amji) ((anar) anclVar).h.getOrDefault(messagePartData.W(), null);
            amtaVar.a(messagePartData.J());
            String strR2 = messagePartData.R();
            strR2.getClass();
            amtaVar.a = strR2;
            Duration durationOfMillis = Duration.ofMillis(Math.max(0L, messagePartData.k()));
            if (durationOfMillis == null) {
                throw new NullPointerException("Null duration");
            }
            amtaVar.d = durationOfMillis;
            amtaVar.e = p(bindData, messagePartData);
            if (uriA == null) {
                throw new NullPointerException("Null uri");
            }
            amtaVar.b = uriA;
            String str4 = amtaVar.a;
            if (str4 != null && (uri3 = amtaVar.b) != null && (dqbwVar = amtaVar.c) != null && (duration = amtaVar.d) != null) {
                return new amtb(str4, uri3, dqbwVar, duration, amtaVar.e, amtaVar.f);
            }
            StringBuilder sb = new StringBuilder();
            if (amtaVar.a == null) {
                sb.append(" contentType");
            }
            if (amtaVar.b == null) {
                sb.append(" uri");
            }
            if (amtaVar.c == null) {
                sb.append(" voiceMetadata");
            }
            if (amtaVar.d == null) {
                sb.append(" duration");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        if (messagePartData.bo()) {
            uia uiaVar = new uia();
            uiaVar.a = "application/vnd.gsma.rcspushlocation+xml";
            elha elhaVarK = messagePartData.K();
            if (elhaVarK == null) {
                throw new NullPointerException("Null contentSource");
            }
            uiaVar.c = elhaVarK;
            uiaVar.d = new Size(messagePartData.c(), messagePartData.b());
            uiaVar.e = ejwk.b(messagePartData.ab());
            uiaVar.a(0.0d);
            uiaVar.b(0.0d);
            Uri uriA2 = this.c.a(messagePartData.t(), messagePartData.v());
            if (uriA2 == null) {
                throw new NullPointerException("Null uri");
            }
            uiaVar.b = uriA2;
            if (messagePartData.I() != null) {
                ekrw ekrwVarH3 = a.h();
                ekrwVarH3.X(eksq.a, "BugleMapi");
                ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarH3).h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "createRcsLocation", 552, "CoreBugleContentFactory.java");
                String strB = messagePartData.B().b();
                LocationInformation locationInformationI = messagePartData.I();
                locationInformationI.getClass();
                Double dValueOf = Double.valueOf(locationInformationI.d);
                LocationInformation locationInformationI2 = messagePartData.I();
                locationInformationI2.getClass();
                ekrdVar.I("Attachment is RcsLocation messageId=%s longitude=%f latitude=%f", strB, dValueOf, Double.valueOf(locationInformationI2.c));
                LocationInformation locationInformationI3 = messagePartData.I();
                locationInformationI3.getClass();
                uiaVar.a(locationInformationI3.d);
                LocationInformation locationInformationI4 = messagePartData.I();
                locationInformationI4.getClass();
                uiaVar.b(locationInformationI4.c);
            } else {
                ekrw ekrwVarJ2 = a.j();
                ekrwVarJ2.X(eksq.a, "BugleMapi");
                ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "createRcsLocation", 561, "CoreBugleContentFactory.java")).t("Null location information in message with id=%s", messagePartData.B().b());
            }
            if (uiaVar.h == 3 && (str2 = uiaVar.a) != null && (uri2 = uiaVar.b) != null && (elhaVar2 = uiaVar.c) != null && (size = uiaVar.d) != null && (str3 = uiaVar.e) != null) {
                return new uib(str2, uri2, elhaVar2, size, str3, uiaVar.f, uiaVar.g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (uiaVar.a == null) {
                sb2.append(" contentType");
            }
            if (uiaVar.b == null) {
                sb2.append(" uri");
            }
            if (uiaVar.c == null) {
                sb2.append(" contentSource");
            }
            if (uiaVar.d == null) {
                sb2.append(" size");
            }
            if (uiaVar.e == null) {
                sb2.append(" captionText");
            }
            if ((1 & uiaVar.h) == 0) {
                sb2.append(" longitude");
            }
            if ((uiaVar.h & 2) == 0) {
                sb2.append(" latitude");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
        }
        if (messagePartData.bj() || messagePartData.bf()) {
            return c(bindData, messagePartData, ((anar) anclVar).e);
        }
        if (messagePartData.bw()) {
            Uri uriA3 = this.c.a(messagePartData.t(), messagePartData.v());
            ekrw ekrwVarH4 = a.h();
            ekrwVarH4.X(eksq.a, "BugleMapi");
            ((ekrd) ((ekrd) ekrwVarH4).h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "createVCard", 440, "CoreBugleContentFactory.java")).I("Attachment is VCard messageId=%s source=%s uri=%s", bindData.E().b(), messagePartData.K(), uriA3);
            uic uicVar = new uic();
            uicVar.a = "text/x-vCard";
            uicVar.d = null;
            uicVar.a(0L);
            elha elhaVarK2 = messagePartData.K();
            if (elhaVarK2 == null) {
                throw new NullPointerException("Null contentSource");
            }
            uicVar.c = elhaVarK2;
            uicVar.d = p(bindData, messagePartData);
            if (uriA3 == null) {
                throw new NullPointerException("Null uri");
            }
            uicVar.b = uriA3;
            uicVar.a(messagePartData.l() <= 0 ? messagePartData.p() : messagePartData.l());
            if (uicVar.f == 1 && (str = uicVar.a) != null && (uri = uicVar.b) != null && (elhaVar = uicVar.c) != null) {
                return new uid(str, uri, elhaVar, uicVar.d, uicVar.e);
            }
            StringBuilder sb3 = new StringBuilder();
            if (uicVar.a == null) {
                sb3.append(" contentType");
            }
            if (uicVar.b == null) {
                sb3.append(" uri");
            }
            if (uicVar.c == null) {
                sb3.append(" contentSource");
            }
            if (uicVar.f == 0) {
                sb3.append(" fileSize");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb3.toString()));
        }
        if (!messagePartData.bx()) {
            if (!messagePartData.bg()) {
                return g(bindData, messagePartData);
            }
            Uri uriA4 = this.c.a(messagePartData.t(), messagePartData.v());
            ekrw ekrwVarH5 = a.h();
            ekrwVarH5.X(eksq.a, "BugleMapi");
            ((ekrd) ((ekrd) ekrwVarH5).h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "createFileContent", 619, "CoreBugleContentFactory.java")).K("Attachment is File messageId=%s status=%x contentType=%s uri=%s previewUri=%s", bindData.E().b(), Integer.valueOf(bindData.s()), messagePartData.R(), uriA4, messagePartData.x());
            String strR3 = messagePartData.R();
            strR3.getClass();
            amyb amybVarP = p(bindData, messagePartData);
            String strB2 = ejwk.b(messagePartData.U());
            long jP = messagePartData.l() <= 0 ? messagePartData.p() : messagePartData.l();
            if (uriA4 != null) {
                return new amtc(strR3, uriA4, strB2, jP, amybVarP);
            }
            throw new NullPointerException("Null uri");
        }
        if (messagePartData.t() == null) {
            ekrw ekrwVarJ3 = a.j();
            ekrwVarJ3.X(eksq.a, "BugleMapi");
            ((ekrd) ((ekrd) ekrwVarJ3).h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "createVideo", 397, "CoreBugleContentFactory.java")).q("Null Uri on photo/video message part");
        }
        amyb amybVarP2 = p(bindData, messagePartData);
        Uri uriA5 = this.c.a(messagePartData.t(), messagePartData.v());
        Uri uriX = messagePartData.x();
        uii uiiVarO = GalleryContent.o();
        String strR4 = messagePartData.R();
        strR4.getClass();
        uiiVarO.f(strR4);
        uiiVarO.e(messagePartData.K());
        uhu uhuVar = (uhu) uiiVarO;
        uhuVar.a = new Size(messagePartData.c(), messagePartData.b());
        uhuVar.d = messagePartData.v();
        uiiVarO.i(messagePartData.m());
        uiiVarO.h = amybVarP2;
        uiiVarO.j(messagePartData.G());
        uiiVarO.k(uriA5);
        uhuVar.c = uriX;
        if ((uriA5 == null || uriA5.equals(Uri.EMPTY)) && uriX != null && (rectS = messagePartData.s()) != null) {
            uhuVar.a = new Size(rectS.width(), rectS.height());
        }
        if (messagePartData.k() > 0) {
            uiiVarO.g(messagePartData.k());
        }
        ekrw ekrwVarH6 = a.h();
        ekrwVarH6.X(eksq.a, "BugleMapi");
        ((ekrd) ((ekrd) ekrwVarH6).h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "createVideo", 427, "CoreBugleContentFactory.java")).J("Attachment is Video messageId=%s uri=%s previewContentType=%s previewSize=%s", bindData.E().b(), uriA5, String.valueOf(messagePartData.X()), messagePartData.s());
        return uiiVarO.l();
    }

    private final amtr f() {
        String string = this.d.getString(R.string.deleted_breadcrumb);
        if (string != null) {
            return new amsz(string);
        }
        throw new NullPointerException("Null text");
    }

    private final amuv g(MessagesTable.BindData bindData, MessagePartData messagePartData) throws IOException {
        amsw amswVar = this.c;
        String strR = messagePartData.R();
        Uri uriA = amswVar.a(messagePartData.t(), messagePartData.v());
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleMapi");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "createUnsupportedContent", 671, "CoreBugleContentFactory.java")).J("Attachment is UnsupportedContent messageId=%s status=%x contentType=%s uri=%s", bindData.E().b(), Integer.valueOf(bindData.s()), strR, uriA);
        if (strR == null) {
            strR = "*/*";
        }
        amuu amuuVarA = amuv.a();
        amtp amtpVar = (amtp) amuuVarA;
        amtpVar.a = strR;
        amtpVar.b = p(bindData, messagePartData);
        amuuVarA.b(uriA);
        return amuuVarA.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.amvr h(final com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.BindData r21, defpackage.ekgb r22, final defpackage.ancl r23) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amvo.h(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData, ekgb, ancl):amvr");
    }

    private final amvr i(MessagesTable.BindData bindData, MessagePartData messagePartData, ancl anclVar) {
        String str;
        ekgb ekgbVar;
        ekrg ekrgVar = a;
        ekrw ekrwVarE = ekrgVar.e();
        ekrz ekrzVar = eksq.a;
        ekrwVarE.X(ekrzVar, "BugleMapi");
        ekrd ekrdVar = (ekrd) ekrwVarE;
        ekrz ekrzVar2 = cqnc.b;
        ekrdVar.X(ekrzVar2, bindData.E());
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "getSinglePart", 244, "CoreBugleContentFactory.java")).t("Message contentType=%s", String.valueOf(messagePartData.R()));
        if (!messagePartData.bv() || w(bindData, messagePartData)) {
            if (this.f.a() && messagePartData.be()) {
                try {
                    return l(messagePartData);
                } catch (IllegalStateException e) {
                    ekrw ekrwVarJ = a.j();
                    ekrwVarJ.X(eksq.a, "BugleMapi");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "getSinglePart", (char) 283, "CoreBugleContentFactory.java")).q("Failed to create end of emergency content");
                    return g(bindData, messagePartData);
                }
            }
            if (!messagePartData.bt()) {
                return e(bindData, messagePartData, anclVar);
            }
            String str2 = messagePartData.g;
            if (!ejwk.c(str2)) {
                amul amulVarD = amum.d();
                amulVarD.c(str2);
                return amulVarD.a();
            }
            ekrw ekrwVarJ2 = ekrgVar.j();
            ekrwVarJ2.X(ekrzVar, "BugleMapi");
            ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "getSinglePart", 291, "CoreBugleContentFactory.java")).q("Suggestion response part with null display text.");
            return g(bindData, messagePartData);
        }
        boolean z = bindData.r() == 130;
        String strS = s(messagePartData.ab());
        if (strS == null) {
            ekrw ekrwVarJ3 = ekrgVar.j();
            ekrwVarJ3.X(ekrzVar, "BugleMapi");
            ekrd ekrdVar2 = (ekrd) ekrwVarJ3;
            ekrdVar2.X(ekrzVar2, bindData.E());
            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "getSinglePart", 255, "CoreBugleContentFactory.java")).r("Message text part with null text. status=%x", bindData.s());
            strS = "";
        } else if (strS.isEmpty()) {
            ekrw ekrwVarJ4 = ekrgVar.j();
            ekrwVarJ4.X(ekrzVar, "BugleMapi");
            ekrd ekrdVar3 = (ekrd) ekrwVarJ4;
            ekrdVar3.X(ekrzVar2, bindData.E());
            ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "getSinglePart", 261, "CoreBugleContentFactory.java")).q("Message text part is empty.");
        }
        if (TextUtils.isEmpty(bindData.Y()) && !z) {
            return m(strS, anclVar);
        }
        ekrw ekrwVarE2 = ekrgVar.e();
        ekrwVarE2.X(ekrzVar, "BugleMapi");
        ekrd ekrdVar4 = (ekrd) ekrwVarE2;
        ekrdVar4.X(ekrzVar2, bindData.E());
        ((ekrd) ekrdVar4.h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "getSinglePart", 268, "CoreBugleContentFactory.java")).q("Message text part has subject or is urgent.");
        String strY = bindData.Y();
        amti amtiVar = new amti();
        int i = ekgb.d;
        amtiVar.a(ekoe.a);
        amtiVar.a = strS;
        amtiVar.c = strY;
        amtiVar.b = z;
        amtiVar.e = (byte) 1;
        amtiVar.a(((anar) anclVar).f);
        if (amtiVar.e == 1 && (str = amtiVar.a) != null && (ekgbVar = amtiVar.d) != null) {
            return new amtj(str, amtiVar.b, amtiVar.c, ekgbVar);
        }
        StringBuilder sb = new StringBuilder();
        if (amtiVar.a == null) {
            sb.append(" text");
        }
        if (amtiVar.e == 0) {
            sb.append(" isUrgent");
        }
        if (amtiVar.d == null) {
            sb.append(" annotations");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    private final amvy j(MessagesTable.BindData bindData, MessagePartData messagePartData) {
        return c(bindData, messagePartData, null);
    }

    private final amvy k(final MessagesTable.BindData bindData, ekgb ekgbVar, final int i) {
        return (amvy) Collection.EL.stream(ekgbVar).filter(new Predicate() { // from class: amvg
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
                MessagePartData messagePartData = (MessagePartData) obj;
                if (messagePartData.K() == elha.RICH_CARD_THUMBNAIL) {
                    return messagePartData.a() == i;
                }
                return false;
            }
        }).findFirst().map(new Function() { // from class: amvh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.c(bindData, (MessagePartData) obj, null);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(null);
    }

    private final amwf l(MessagePartData messagePartData) {
        String strS = s(messagePartData.ab());
        if (strS == null) {
            throw new IllegalStateException("Text in end of emergency content cannot be null.");
        }
        try {
            clmw clmwVarA = clhr.a(strS);
            Context context = this.d;
            amul amulVarD = amum.d();
            clmu clmuVar = clmwVarA.c;
            if (clmuVar == null) {
                clmuVar = clmu.a;
            }
            clmt clmtVarB = clmt.b(clmuVar.c);
            if (clmtVarB == null) {
                clmtVarB = clmt.UNRECOGNIZED;
            }
            amulVarD.c(context.getString(clmtVarB == clmt.HELP_NOT_LONGER_NEED ? R.string.end_of_emergency_help_not_needed : R.string.end_of_emergency_help_needed));
            return amulVarD.a();
        } catch (clhs e) {
            throw new IllegalStateException("Text in end of emergency content is malformed", e);
        }
    }

    private static amwf m(String str, ancl anclVar) {
        amul amulVarD = amum.d();
        amulVarD.c(str);
        amulVarD.b(((anar) anclVar).f);
        return amulVarD.a();
    }

    private static amwf n(GeneralPurposeRichCard generalPurposeRichCard, ancl anclVar) {
        if (ejwk.c(generalPurposeRichCard.content.description)) {
            return null;
        }
        return m(generalPurposeRichCard.content.description, anclVar);
    }

    private static amwf o(GeneralPurposeRichCard generalPurposeRichCard, ancl anclVar) {
        if (ejwk.c(generalPurposeRichCard.content.title)) {
            return null;
        }
        return m(generalPurposeRichCard.content.title, anclVar);
    }

    private final amyb p(MessagesTable.BindData bindData, MessagePartData messagePartData) {
        boolean z;
        boolean z2;
        bvdl bvdlVar = messagePartData.f.o;
        if (bvdlVar.f > 0 && bvdlVar != bvdl.CMS_MEDIA_DOWNLOADED) {
            amxp amxpVarH = amxq.h();
            amxpVarH.b(TextUtils.isEmpty(messagePartData.P()));
            amxpVarH.d(true);
            ((amxl) amxpVarH).a = this.j.a(bindData.E());
            amxpVarH.f(messagePartData.f.o == bvdl.CMS_MEDIA_DOWNLOADING);
            return amxpVarH.a();
        }
        if (messagePartData.K() == elha.RICH_CARD_MEDIA) {
            if (messagePartData.t() != null) {
                return null;
            }
            int iOrdinal = messagePartData.f.Y.ordinal();
            if (iOrdinal == 0) {
                amxp amxpVarH2 = amxq.h();
                amxpVarH2.f(true);
                ((amxl) amxpVarH2).a = this.k.a(new CoreBuglePartialMessageId(bindData.E(), Long.parseLong(messagePartData.W())));
                return amxpVarH2.a();
            }
            if (iOrdinal == 1) {
                return null;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3 || iOrdinal == 4) {
                    return null;
                }
                throw new IllegalStateException("Unhandled RichCardMediaDownloadFailureReason.");
            }
            amxp amxpVarH3 = amxq.h();
            amxpVarH3.b(true);
            amxpVarH3.f(false);
            ((amxl) amxpVarH3).a = this.k.a(new CoreBuglePartialMessageId(bindData.E(), Long.parseLong(messagePartData.W())));
            return amxpVarH3.a();
        }
        if (!t(bindData, messagePartData)) {
            return null;
        }
        int iS = bindData.s();
        if (!baui.m(iS)) {
            baui bauiVar = this.e;
            if (craf.i(this.d) || iS == 16 || baui.h(iS) || baui.p(iS)) {
                return null;
            }
            if (baui.m(iS) && !bauiVar.c.q()) {
                return null;
            }
        }
        if (iS == 110 || iS == 101) {
            z = true;
        } else if (iS == 115) {
            iS = 115;
            z = true;
        } else {
            z = false;
        }
        if (iS == 12 || z || iS == 106 || iS == 112 || iS == 111) {
            z2 = true;
        } else if (iS == 107) {
            iS = 107;
            z2 = true;
        } else {
            z2 = false;
        }
        amxy amxyVar = this.j;
        amxp amxpVarH4 = amxq.h();
        ((amxl) amxpVarH4).a = amxyVar.a(bindData.E());
        amxpVarH4.f(!z2);
        amxpVarH4.c(baui.i(iS));
        amxpVarH4.g(iS == 101);
        amxpVarH4.e(iS == 102 || iS == 103);
        amxpVarH4.b(baui.m(iS));
        return amxpVarH4.a();
    }

    private static ekgb q(MessagesTable.BindData bindData, GeneralPurposeRichCard generalPurposeRichCard) {
        ArrayList<ConversationSuggestion> arrayList = generalPurposeRichCard.content.suggestions;
        if (arrayList == null) {
            int i = ekgb.d;
            return ekoe.a;
        }
        Stream streamFilter = Collection.EL.stream(arrayList).map(new amvn(bindData)).filter(new Predicate() { // from class: amvl
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
                return Objects.nonNull((RbmSuggestionData) obj);
            }
        });
        int i2 = ekgb.d;
        return (ekgb) streamFilter.collect(ekcv.a);
    }

    private static Optional r(ekgb ekgbVar, final int i) {
        return Collection.EL.stream(ekgbVar).filter(new Predicate() { // from class: amvd
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
                MessagePartData messagePartData = (MessagePartData) obj;
                if (messagePartData.K() == elha.RICH_CARD_MEDIA) {
                    return messagePartData.a() == i;
                }
                return false;
            }
        }).findFirst();
    }

    private static String s(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("\u0000", "");
    }

    private static boolean t(MessagesTable.BindData bindData, MessagePartData messagePartData) {
        int iS = bindData.s();
        int iM = bindData.m();
        if (iM == 0) {
            if (bindData.v() != -1) {
                return v(iS) || bindData.u() <= 0;
            }
            return false;
        }
        if (iM == 2) {
            return true;
        }
        if (iM != 3) {
            return false;
        }
        return (v(iS) || bindData.u() <= 0) && messagePartData.aX();
    }

    private static boolean u(int i) {
        return i == 117 || i == 23;
    }

    private static boolean v(int i) {
        return baui.e(i) || baui.v(i);
    }

    private static boolean w(MessagesTable.BindData bindData, MessagePartData messagePartData) {
        return (bindData.m() == 3 || !t(bindData, messagePartData) || baui.h(bindData.s())) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.amtw
    public final amvr a(MessagesTable.BindData bindData, ekgb ekgbVar, ancl anclVar) {
        String str;
        String strS;
        if (this.g.a() && u(bindData.s())) {
            return f();
        }
        String str2 = "BugleMapi";
        if (ekgbVar.isEmpty()) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleMapi");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "create", 167, "CoreBugleContentFactory.java")).r("Message without any associated part. status=%x", bindData.s());
            amuu amuuVarA = amuv.a();
            ((amtp) amuuVarA).a = "*/*";
            amuuVarA.b(Uri.EMPTY);
            return amuuVarA.a();
        }
        if (ekgbVar.size() <= 1) {
            return i(bindData, this.b.e((PartsTable.BindData) ekgbVar.get(0)), anclVar);
        }
        if (Collection.EL.stream(ekgbVar).anyMatch(new Predicate() { // from class: amvf
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
                return Objects.equals(((PartsTable.BindData) obj).I(), RbmSpecificMessage.CONTENT_TYPE);
            }
        })) {
            return h(bindData, ekgbVar, anclVar);
        }
        ekfw ekfwVar = new ekfw();
        String str3 = null;
        int i = 0;
        while (i < ekgbVar.size()) {
            MessagePartData messagePartDataE = this.b.e((PartsTable.BindData) ekgbVar.get(i));
            if (messagePartDataE.bv()) {
                strS = s(messagePartDataE.ab());
            } else {
                if (this.f.a() && messagePartDataE.be()) {
                    try {
                        strS = ((amth) l(messagePartDataE)).a;
                    } catch (IllegalStateException e) {
                        ekrw ekrwVarJ2 = a.j();
                        ekrwVarJ2.X(eksq.a, str2);
                        str = str2;
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ2).g(e)).h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "create", (char) 192, "CoreBugleContentFactory.java")).q("Failed to create end of emergency content");
                        ekfwVar.h(g(bindData, messagePartDataE));
                    }
                } else {
                    str = str2;
                    ekfwVar.h(e(bindData, messagePartDataE, anclVar));
                }
                i++;
                str2 = str;
            }
            str3 = strS;
            str = str2;
            i++;
            str2 = str;
        }
        ekgb ekgbVarG = ekfwVar.g();
        if (ekgbVarG != null) {
            return new amtf(ekgbVarG, str3);
        }
        throw new NullPointerException("Null attachments");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.amtw
    public final ekgb b(MessagesTable.BindData bindData, ekgb ekgbVar, ancl anclVar) {
        if (this.g.a() && u(bindData.s())) {
            return ekgb.r(f());
        }
        if (ekgbVar.isEmpty()) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleMapi");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/api/messaging/message/content/CoreBugleContentFactory", "createFlatten", 217, "CoreBugleContentFactory.java")).r("Message without any associated part. status=%x", bindData.s());
            amuu amuuVarA = amuv.a();
            ((amtp) amuuVarA).a = "*/*";
            amuuVarA.b(Uri.EMPTY);
            return ekgb.r(amuuVarA.a());
        }
        if (Collection.EL.stream(ekgbVar).anyMatch(new Predicate() { // from class: amve
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
                return Objects.equals(((PartsTable.BindData) obj).I(), RbmSpecificMessage.CONTENT_TYPE);
            }
        })) {
            return ekgb.r(h(bindData, ekgbVar, anclVar));
        }
        ekfw ekfwVar = new ekfw();
        int size = ekgbVar.size();
        for (int i = 0; i < size; i++) {
            ekfwVar.h(i(bindData, this.b.e((PartsTable.BindData) ekgbVar.get(i)), anclVar));
        }
        return ekfwVar.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.amue c(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.BindData r21, com.google.android.apps.messaging.shared.datamodel.data.MessagePartData r22, java.lang.String r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amvo.c(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData, com.google.android.apps.messaging.shared.datamodel.data.MessagePartData, java.lang.String):amue");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.amux d(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.BindData r9, defpackage.ekgb r10, int r11, com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCard r12, defpackage.ancl r13) {
        /*
            r8 = this;
            amux r0 = new amux
            amwf r1 = o(r12, r13)
            amwf r13 = n(r12, r13)
            j$.util.Optional r2 = r(r10, r11)
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L17
            r10 = 0
            goto Lab
        L17:
            amvy r4 = r8.k(r9, r10, r11)
            java.lang.Object r10 = r2.get()
            com.google.android.apps.messaging.shared.datamodel.data.MessagePartData r10 = (com.google.android.apps.messaging.shared.datamodel.data.MessagePartData) r10
            amvy r5 = r8.j(r9, r10)
            amuw r10 = new amuw
            r11 = r2
            amuf r2 = new amuf
            java.lang.Object r3 = r11.get()
            com.google.android.apps.messaging.shared.datamodel.data.MessagePartData r3 = (com.google.android.apps.messaging.shared.datamodel.data.MessagePartData) r3
            long r6 = r3.p()
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            java.lang.Object r11 = r11.get()
            com.google.android.apps.messaging.shared.datamodel.data.MessagePartData r11 = (com.google.android.apps.messaging.shared.datamodel.data.MessagePartData) r11
            java.lang.String r11 = r11.W()
            long r6 = java.lang.Long.parseLong(r11)
            r2.<init>(r3, r4, r5, r6)
            com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardContent r11 = r12.content
            com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCardMediaInfo r11 = r11.media
            java.lang.String r11 = r11.height
            boolean r3 = defpackage.ejwk.c(r11)
            r4 = 1
            r3 = r3 ^ r4
            java.lang.String r5 = "Media height must be provided for a vertical rich card."
            defpackage.ejwl.b(r3, r5)
            int r3 = r11.hashCode()
            r5 = -1616240335(0xffffffff9faa2131, float:-7.205271E-20)
            r6 = 0
            r7 = 2
            if (r3 == r5) goto L84
            r5 = -585750279(0xffffffffdd1628f9, float:-6.7626074E17)
            if (r3 == r5) goto L7a
            r5 = 1973327466(0x759e966a, float:4.020672E32)
            if (r3 == r5) goto L70
            goto L8e
        L70:
            java.lang.String r3 = "SHORT_HEIGHT"
            boolean r3 = r11.equals(r3)
            if (r3 == 0) goto L8e
            r3 = r6
            goto L8f
        L7a:
            java.lang.String r3 = "TALL_HEIGHT"
            boolean r3 = r11.equals(r3)
            if (r3 == 0) goto L8e
            r3 = r7
            goto L8f
        L84:
            java.lang.String r3 = "MEDIUM_HEIGHT"
            boolean r3 = r11.equals(r3)
            if (r3 == 0) goto L8e
            r3 = r4
            goto L8f
        L8e:
            r3 = -1
        L8f:
            if (r3 == 0) goto La8
            if (r3 == r4) goto La7
            if (r3 != r7) goto L97
            r4 = 3
            goto La8
        L97:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.Object[] r10 = new java.lang.Object[r4]
            r10[r6] = r11
            java.lang.String r11 = "Vertical rich card has an unexpected media height value: %s"
            java.lang.String r10 = java.lang.String.format(r11, r10)
            r9.<init>(r10)
            throw r9
        La7:
            r4 = r7
        La8:
            r10.<init>(r2, r4)
        Lab:
            ekgb r9 = q(r9, r12)
            r0.<init>(r1, r13, r10, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amvo.d(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData, ekgb, int, com.google.android.ims.rcsservice.chatsession.message.GeneralPurposeRichCard, ancl):amux");
    }
}
