package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayrm {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/actionhelpers/SendMessageActionQueuer");
    public final alrj b;
    private final Context c;
    private final cogw d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final ajhd j;
    private final eygg k;
    private final Optional l;
    private final ayql m;
    private final dqsn n;
    private final cqjy o;
    private final bydb p;
    private final Optional q;
    private final ckfo r;
    private final fcsu s;
    private final fcsu t;

    public ayrm(Context context, cogw cogwVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, ajhd ajhdVar, eygg eyggVar, Optional optional, ayql ayqlVar, dqsn dqsnVar, cqjy cqjyVar, alrj alrjVar, bydb bydbVar, Optional optional2, ckfo ckfoVar, fcsu fcsuVar6, fcsu fcsuVar7) {
        this.c = context;
        this.d = cogwVar;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
        this.j = ajhdVar;
        this.k = eyggVar;
        this.l = optional;
        this.m = ayqlVar;
        this.n = dqsnVar;
        this.o = cqjyVar;
        this.b = alrjVar;
        this.p = bydbVar;
        this.q = optional2;
        this.i = fcsuVar5;
        this.r = ckfoVar;
        this.s = fcsuVar6;
        this.t = fcsuVar7;
    }

    public static void a(Action action, long j, Optional optional, boolean z, boolean z2) {
        aymo aymoVar = action.v;
        aymoVar.s("rcs_session_id", j);
        if (j == -1) {
            aymoVar.v("conversation_name", (String) optional.orElse(null));
        }
        aymoVar.p("is_rcs_group", z);
        aymoVar.p("is_rbm_conversation", z2);
    }

    private final int f(MessageCoreData messageCoreData, long j, axcy axcyVar) {
        int iK = messageCoreData.k();
        if (!messageCoreData.dl()) {
            messageCoreData.bi(j);
            return iK;
        }
        this.j.Q(emxt.UMA_MESSAGE_SENDING_START, messageCoreData, axcyVar.e());
        messageCoreData.bk(j);
        return iK;
    }

    private final Action g(final MessageCoreData messageCoreData, final axcy axcyVar) {
        fcsu fcsuVar = this.f;
        ekgb ekgbVarN = ekgb.n(((bakt) fcsuVar.b()).K(messageCoreData.A()));
        if (messageCoreData.aq() != null) {
            ParticipantsTable.BindData bindDataB = ((bbca) this.e.b()).b(messageCoreData.aq());
            if (bindDataB == null || bindDataB.V() == null) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "BugleDataModel");
                ekrd ekrdVar = (ekrd) ekrwVarJ;
                ekrdVar.X(cqnc.f, messageCoreData.F());
                ekrdVar.X(cqnc.s, messageCoreData.A());
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/SendMessageActionQueuer", "createSendMessageAction", 351, "SendMessageActionQueuer.java")).t("Participant for the group private message does not exist, groupPrivateParticipant: %s", messageCoreData.aq());
                return null;
            }
            ekgbVarN = ekgb.r(bindDataB);
        }
        final Action actionA = this.m.a();
        if (messageCoreData.cX()) {
            Optional optionalOfNullable = Optional.ofNullable(((bakt) fcsuVar.b()).r(messageCoreData.A()));
            optionalOfNullable.ifPresentOrElse(new Consumer() { // from class: ayrb
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    bojh bojhVar = (bojh) obj;
                    ayrm.a(actionA, bojhVar.v(), Optional.ofNullable(bojhVar.ai()), bvdi.d(bojhVar.k()), bojhVar.an());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, new Runnable() { // from class: ayrc
                @Override // java.lang.Runnable
                public final void run() {
                    ayrm.a(actionA, -1L, Optional.empty(), false, false);
                }
            });
            final aubq aubqVarW = messageCoreData.w();
            if (!((Boolean) optionalOfNullable.map(new Function() { // from class: ayrk
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Boolean.valueOf(!bvdi.d(((bojh) obj).k()));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(true)).booleanValue()) {
                ekgbVarN = (ekgb) Collection.EL.stream(ekgbVarN).filter(new Predicate() { // from class: ayrl
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
                        return !Objects.equals(((ParticipantsTable.BindData) obj).T(), aubqVarW.d);
                    }
                }).collect(ekcv.a);
            }
        }
        eieu eieuVarK = eiiy.k("SendMessageActionQueuer::buildMessageIdentityProtos");
        try {
            ekgb ekgbVar = (ekgb) Collection.EL.stream(ekgbVarN).map(new Function() { // from class: ayrf
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ayrm ayrmVar = this.a;
                    ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                    return messageCoreData.cw() ? ayrmVar.b.q(bindData) : ayrmVar.b.t(bindData);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).map(new Function() { // from class: ayrg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return alre.d((alqm) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(ekcv.a);
            eieuVarK.close();
            aymo aymoVar = actionA.v;
            aymoVar.t("message", messageCoreData);
            aymoVar.r("sub_id", axcyVar.e());
            aymoVar.v("sub_phone_number", (String) axcyVar.b().map(new Function() { // from class: ayrh
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((alqm) obj).p(((Boolean) alvx.d.e()).booleanValue());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(null));
            aymoVar.u("remote_messaging_identities", new ArrayList(ekgbVar));
            if (messageCoreData.dg()) {
                if (ekgbVar.size() != 1) {
                    throw new IllegalStateException("Trying to resend a broadcast SMS - not allowed");
                }
                aymoVar.v("sms_service_center", (String) this.l.map(new Function() { // from class: ayra
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((cmut) obj).b(axcyVar.e(), messageCoreData.A());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(null));
                aymoVar.t("remote_messaging_identity", (Parcelable) ekgbVar.get(0));
            }
            ekrw ekrwVarE = a.e();
            ekrwVarE.X(eksq.a, "BugleDataModel");
            ekrd ekrdVar2 = (ekrd) ekrwVarE;
            ekrdVar2.X(cqnc.b, messageCoreData.C());
            ekrdVar2.X(cqnc.C, MessageData.ay(messageCoreData.d()));
            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/SendMessageActionQueuer", "populateSendMessageAction", 394, "SendMessageActionQueuer.java")).q("Queued for sending");
            return actionA;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final boolean h(final MessageCoreData messageCoreData, final Uri uri, final boolean z, final Optional optional) {
        boolean zD = d(messageCoreData, z);
        this.n.d("SendMessageActionQueuer#updateLocalDatabaseInTransaction", new Runnable() { // from class: ayqz
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b(messageCoreData, uri, z, optional);
            }
        });
        return zD;
    }

    public final void b(MessageCoreData messageCoreData, Uri uri, boolean z, Optional optional) {
        if (uri == null || messageCoreData.cw()) {
            String[] strArr = MessagesTable.a;
            brdu brduVar = new brdu();
            brduVar.ap("updateLocalDatabase");
            brduVar.X(new Function() { // from class: ayqy
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    brec brecVar = (brec) obj;
                    brecVar.an(2, 11);
                    return brecVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            brduVar.U(messageCoreData.k());
            if (z) {
                brduVar.v(false);
            }
            if (((asbt) this.t.b()).a()) {
                brduVar.O(messageCoreData.r());
            }
            brduVar.G(messageCoreData.o());
            brduVar.B(messageCoreData.f());
            brduVar.P(messageCoreData.j());
            brduVar.Q(messageCoreData.aC());
            brduVar.E(messageCoreData.F());
            brduVar.H(messageCoreData.i());
            brduVar.V(messageCoreData.P());
            if (messageCoreData.cw() && !TextUtils.isEmpty(messageCoreData.aj())) {
                brduVar.i(messageCoreData.aj());
            }
            if (this.p.n(messageCoreData, brduVar, optional)) {
            }
            ekrw ekrwVarG = a.g();
            ekrwVarG.X(eksq.a, "BugleDataModel");
            ekrd ekrdVar = (ekrd) ekrwVarG;
            ekrdVar.X(cqnc.C, messageCoreData.ax());
            ekrdVar.X(cqnc.b, messageCoreData.C());
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/SendMessageActionQueuer", "updateMessageInLocalDatabaseAndRefreshConvMetadata", 786, "SendMessageActionQueuer.java")).s("Updated message in local db. receivedTimeStamp: %s", messageCoreData.o());
        }
        this.p.i(messageCoreData);
        ((baqi) this.g.b()).b(messageCoreData.A(), false, bvdk.UNARCHIVED);
        ekrw ekrwVarG2 = a.g();
        ekrwVarG2.X(eksq.a, "BugleDataModel");
        ekrd ekrdVar2 = (ekrd) ekrwVarG2;
        ekrdVar2.X(cqnc.C, messageCoreData.ax());
        ekrdVar2.X(cqnc.b, messageCoreData.C());
        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/SendMessageActionQueuer", "updateMessageInLocalDatabaseAndRefreshConvMetadata", 786, "SendMessageActionQueuer.java")).s("Updated message in local db. receivedTimeStamp: %s", messageCoreData.o());
    }

    public final boolean c(MessageCoreData messageCoreData, Uri uri, boolean z, Optional optional) {
        eieu eieuVarK = eiiy.k("SendMessageActionQueuer::updateMessageAndStatusWithLogContent");
        try {
            boolean zH = h(messageCoreData, uri, z, optional);
            eieuVarK.close();
            return zH;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(final com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayrm.d(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045 A[Catch: all -> 0x01f7, TRY_ENTER, TryCatch #6 {all -> 0x01f7, blocks: (B:3:0x0008, B:5:0x0019, B:9:0x0028, B:11:0x0032, B:14:0x003b, B:78:0x018e, B:80:0x01d5, B:81:0x01e0, B:16:0x0045, B:18:0x004b, B:24:0x00b7, B:26:0x00cf, B:28:0x00d6, B:48:0x014c, B:63:0x0166, B:62:0x0163, B:64:0x0167, B:66:0x0178, B:69:0x017e, B:77:0x018d, B:76:0x018a, B:21:0x0053, B:23:0x0065, B:59:0x015e, B:65:0x0170, B:73:0x0185, B:29:0x00e1, B:31:0x0107, B:33:0x0110, B:41:0x011e, B:40:0x011b, B:42:0x011f, B:44:0x0139, B:56:0x015b, B:55:0x0158), top: B:104:0x0008, inners: #2, #3, #7, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018e A[Catch: all -> 0x01f7, TryCatch #6 {all -> 0x01f7, blocks: (B:3:0x0008, B:5:0x0019, B:9:0x0028, B:11:0x0032, B:14:0x003b, B:78:0x018e, B:80:0x01d5, B:81:0x01e0, B:16:0x0045, B:18:0x004b, B:24:0x00b7, B:26:0x00cf, B:28:0x00d6, B:48:0x014c, B:63:0x0166, B:62:0x0163, B:64:0x0167, B:66:0x0178, B:69:0x017e, B:77:0x018d, B:76:0x018a, B:21:0x0053, B:23:0x0065, B:59:0x015e, B:65:0x0170, B:73:0x0185, B:29:0x00e1, B:31:0x0107, B:33:0x0110, B:41:0x011e, B:40:0x011b, B:42:0x011f, B:44:0x0139, B:56:0x015b, B:55:0x0158), top: B:104:0x0008, inners: #2, #3, #7, #9 }] */
    /* JADX WARN: Type inference failed for: r8v5, types: [ayjm, com.google.android.apps.messaging.shared.datamodel.action.common.Action] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.apps.messaging.shared.datamodel.action.common.Action e(final com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r16, int r17) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayrm.e(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, int):com.google.android.apps.messaging.shared.datamodel.action.common.Action");
    }
}
