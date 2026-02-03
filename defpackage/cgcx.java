package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.receiver.NotificationReceiver;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cgcx extends cgan implements cgcr {
    public static final /* synthetic */ int c = 0;
    private static final eksp d = eksp.c("BugleNotifications");
    ConversationId b;
    private final Context e;
    private final bael f;
    private final cgbn g;
    private final fcsu h;
    private final fcsu i;
    private final ains j;
    private final cogw k;
    private final avmp l;
    private final cgcz m;
    private final ajsn n;
    private final fcsu o;
    private final aqmq r;
    private int s;
    private cqbf t;
    private final ArrayList u;
    private String v;
    private String w;
    private boolean x;
    private int y;
    private int z;

    public cgcx(Context context, cgaz cgazVar, fcsu fcsuVar, fcsu fcsuVar2, ains ainsVar, cogw cogwVar, avmp avmpVar, cgcz cgczVar, bael baelVar, cgbn cgbnVar, ajsn ajsnVar, fcsu fcsuVar3, aqmq aqmqVar) {
        super(cgazVar.a(cgbe.MESSAGE_FAILURE));
        this.y = 1;
        this.t = new cqbf();
        this.u = new ArrayList();
        this.b = InvalidConversationId.a;
        this.e = context;
        this.h = fcsuVar2;
        this.i = fcsuVar;
        this.j = ainsVar;
        this.k = cogwVar;
        this.f = baelVar;
        this.g = cgbnVar;
        this.l = avmpVar;
        this.m = cgczVar;
        this.n = ajsnVar;
        this.o = fcsuVar3;
        this.r = aqmqVar;
    }

    private final void f() {
        int size = this.u.size();
        if (size > 0 || this.s > 0) {
            eksl ekslVar = (eksl) d.h();
            ekslVar.X(cgey.a, Integer.valueOf(size));
            ekslVar.X(cgey.b, Integer.valueOf(this.s));
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/notification/MessageFailureNotificationImpl", "logFailedMessageCounts", 585, "MessageFailureNotificationImpl.java")).q("Found failed messages.");
        }
    }

    private static int g(int i) {
        if (((Boolean) a.e()).booleanValue() && i == 17) {
            return 3;
        }
        return (i == 106 || i == 107 || i == 111 || i == 112) ? 2 : 1;
    }

    @Override // defpackage.cgan, defpackage.cgbf
    public final Notification b() throws Resources.NotFoundException {
        PendingIntent pendingIntentC;
        emgm emgmVar;
        Context context = this.e;
        cgcs cgcsVarC = cgcs.c(context.getResources(), this.w, this.v, this.t.size(), this.s, this.y);
        cqbf cqbfVar = this.t;
        if (cqbfVar.size() == 1) {
            bojh bojhVarR = ((bakt) this.o.b()).r(cqbfVar.a());
            ConversationId conversationIdA = this.n.a(cqbfVar.a(), bojhVarR == null ? null : bojhVarR.ab(), this.x);
            this.b = conversationIdA;
            pendingIntentC = this.l.r(context, conversationIdA);
        } else {
            pendingIntentC = this.l.c(context);
        }
        kvq kvqVar = new kvq(context, o());
        cgas cgasVar = (cgas) cgcsVarC;
        String str = cgasVar.a;
        kvqVar.i(str);
        kvqVar.w(str);
        kvqVar.h(cgasVar.b);
        kvqVar.y(this.k.f().toEpochMilli());
        kvqVar.r(R.drawable.notification_icon);
        kvqVar.g = pendingIntentC;
        kvqVar.t(cqmz.x(context));
        kvqVar.l = 4;
        if (((Boolean) clgw.a.e()).booleanValue()) {
            cgcz cgczVar = this.m;
            int i = this.y;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                emgmVar = emgm.MESSAGE_SENDING_FAILURE;
            } else if (i2 == 1) {
                emgmVar = emgm.MESSAGE_DOWNLOAD_FAILURE;
            } else {
                if (i2 != 2) {
                    throw new AssertionError("Unexpected failure type: ".concat(cgcq.a(i)));
                }
                emgmVar = emgm.MESSAGE_DELIVERY_FAILURE_RECIPIENT_LOST_RCS;
            }
            kvqVar.e(cgczVar.a(emgmVar));
        }
        aiiw aiiwVarC = aiiw.c(context, NotificationReceiver.class, "android.intent.action.VIEW");
        aiiwVarC.f(context.getPackageName());
        Intent intentA = aiiwVarC.a();
        intentA.setAction("com.google.android.apps.messaging.reset_failed_message_notification");
        intentA.putParcelableArrayListExtra("failed_messages", (ArrayList) Collection.EL.stream(this.u).map(new Function() { // from class: cgcv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cgcp cgcpVar = (cgcp) obj;
                int i3 = cgcx.c;
                ContentValues contentValues = new ContentValues();
                contentValues.put("conv_id", cgcpVar.b().toString());
                contentValues.put("message_id", cgcpVar.c().b());
                return contentValues;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: cgcw
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        })));
        PendingIntent pendingIntentD = ebsn.d(context, 1, intentA, crag.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
        pendingIntentD.getClass();
        kvqVar.k(pendingIntentD);
        return kvqVar.a();
    }

    @Override // defpackage.cgcr
    public final void e(boolean z) throws Throwable {
        Throwable th;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str = z ? "null_debug" : null;
        if (z) {
            i4 = this.z;
            th = null;
            i = 0;
            i2 = 3;
            i3 = 2;
        } else {
            th = null;
            i = 0;
            int position = -1;
            if (this.r.a()) {
                bwwe bwweVar = (bwwe) this.i.b();
                ekhv ekhvVar = new ekhv();
                i2 = 3;
                i3 = 2;
                ekhvVar.h(8, 18, 19, 106, 112, 21);
                if (((Boolean) cgcr.a.e()).booleanValue()) {
                    ekhvVar.c(17);
                }
                final ekhx ekhxVarG = ekhvVar.g();
                brdr brdrVarD = MessagesTable.d();
                brdrVarD.A("buildMessageFailuresQuery");
                bran branVar = MessagesTable.c;
                brao braoVar = branVar.b;
                brdrVarD.c(branVar.a, braoVar, branVar.x, branVar.k, branVar.j, branVar.w);
                botb botbVarE = botm.e();
                bopp boppVar = botm.c;
                botbVarE.c(boppVar.R);
                brdrVarD.G(dqts.i(botbVarE.b(), boppVar.a, braoVar));
                brdrVarD.h(new Function() { // from class: cgcu
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        brec brecVar = (brec) obj;
                        int i6 = cgcx.c;
                        brecVar.ah(ekhxVarG);
                        brecVar.E();
                        return brecVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                brdrVarD.d(new brdo(branVar.g, true));
                brap brapVar = (brap) brdrVarD.b().p();
                try {
                    brapVar.moveToPosition(-1);
                    while (brapVar.moveToNext()) {
                        ConversationIdType conversationIdTypeP = brapVar.p();
                        MessageIdType messageIdTypeQ = brapVar.q();
                        int iE = brapVar.e();
                        int iG = g(brapVar.i());
                        this.u.add(new cgat(conversationIdTypeP, messageIdTypeQ, iE, iG));
                        if (!bwweVar.g(conversationIdTypeP)) {
                            position = brapVar.getPosition();
                            this.s++;
                            this.t.add(conversationIdTypeP);
                            bojh bojhVar = (bojh) ((MessagesTable.BindData) brapVar.cQ()).aw("conversations", bojh.class);
                            bojhVar.getClass();
                            this.x = bojhVar.an();
                            this.y = iG;
                        }
                    }
                    f();
                    if (this.s == 0) {
                        brapVar.close();
                        i4 = 1;
                    } else {
                        brapVar.moveToPosition(position);
                        brapVar.c();
                        this.w = brapVar.G();
                        bajf bajfVarA = ((axgh) this.h.b()).a(brapVar.p());
                        this.v = bajfVarA != null ? bajfVarA.o() : "";
                        brapVar.close();
                        i4 = i3;
                    }
                } finally {
                }
            } else {
                i2 = 3;
                i3 = 2;
                bwwe bwweVar2 = (bwwe) this.i.b();
                bael baelVar = this.f;
                final ArrayList arrayListC = ekjz.c(8, 18, 19, 106, 112);
                if (((Boolean) cgcr.a.e()).booleanValue()) {
                    arrayListC.add(17);
                }
                arrayListC.add(21);
                bgvg bgvgVarA = baelVar.a.a();
                bgvgVarA.d(new Function() { // from class: baek
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bguz bguzVar = (bguz) obj;
                        return new bgva[]{bguzVar.a, bguzVar.b, bguzVar.e, bguzVar.h, bguzVar.f, bguzVar.i, bguzVar.l};
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bgvgVarA.f(new Function() { // from class: baed
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bgvk bgvkVar = (bgvk) obj;
                        bgvkVar.f(arrayListC);
                        bgvkVar.ap(new dqty("messages.seen", 1, 0));
                        return bgvkVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bguz bguzVar = bgvl.c;
                bgvgVarA.w(bguzVar.a);
                bgvgVarA.c(new bgvd(bguzVar.c, true));
                bgvb bgvbVar = (bgvb) bgvgVarA.b().p();
                try {
                    bgvbVar.moveToPosition(-1);
                    while (bgvbVar.moveToNext()) {
                        ConversationIdType conversationIdTypeI = bgvbVar.i();
                        MessageIdType messageIdTypeJ = bgvbVar.j();
                        int iD = bgvbVar.d();
                        int iG2 = g(bgvbVar.e());
                        this.u.add(new cgat(conversationIdTypeI, messageIdTypeJ, iD, iG2));
                        if (!bwweVar2.g(conversationIdTypeI)) {
                            position = bgvbVar.getPosition();
                            this.s++;
                            this.t.add(conversationIdTypeI);
                            this.x = bgvbVar.s();
                            this.y = iG2;
                        }
                    }
                    f();
                    if (this.s == 0) {
                        bgvbVar.close();
                        i4 = 1;
                    } else {
                        bgvbVar.moveToPosition(position);
                        bgvbVar.c();
                        this.w = bgvbVar.o();
                        bajf bajfVarA2 = ((axgh) this.h.b()).a(bgvbVar.i());
                        this.v = bajfVarA2 != null ? bajfVarA2.o() : "";
                        bgvbVar.close();
                        i4 = i3;
                    }
                } finally {
                }
            }
        }
        int i6 = i4 - 1;
        if (i4 == 0) {
            throw th;
        }
        if (i6 != 0) {
            if (i6 == 1) {
                this.g.H(this);
                int i7 = this.y;
                if (i7 == 0) {
                    throw th;
                }
                if (i7 == 1) {
                    this.j.e("Bugle.Connectivity.ZeroConnectivity.Timeout.Notification.Sent", this.s);
                } else if (i7 == i3) {
                    this.j.e("Bugle.Notification.Mms.DownloadFailure.Count", cqbe.a.x);
                }
            }
        } else if (str != null) {
            this.g.k(str, c());
        } else {
            this.g.j(c());
        }
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        int i8 = i;
        while (i8 < size) {
            cgcp cgcpVar = (cgcp) arrayList.get(i8);
            if (cgcpVar.d() == 1) {
                this.j.c(cgcpVar.a() == 10004 ? "Bugle.Message.Fallback.Send.Timeout.Notification.Count" : "Bugle.Message.Fallback.Send.Failed.Notification.Count");
                i5 = i2;
            } else {
                i5 = i2;
                if (cgcpVar.d() == i5) {
                    this.j.c("Bugle.Rcs.Delivery.Failure.Notification.Count");
                }
            }
            i8++;
            i2 = i5;
        }
    }

    @Override // defpackage.cgdu
    public final void m() throws Throwable {
        e(false);
    }

    public cgcx(Context context, cgaz cgazVar, fcsu fcsuVar, fcsu fcsuVar2, ains ainsVar, cogw cogwVar, avmp avmpVar, cgcz cgczVar, bael baelVar, cgbn cgbnVar, int i, int i2, int i3, ArrayList arrayList, cqbf cqbfVar, ajsn ajsnVar, fcsu fcsuVar3, aqmq aqmqVar) {
        super(cgazVar.a(cgbe.MESSAGE_FAILURE));
        this.y = 1;
        this.t = new cqbf();
        new ArrayList();
        this.b = InvalidConversationId.a;
        this.e = context;
        this.h = fcsuVar2;
        this.i = fcsuVar;
        this.j = ainsVar;
        this.k = cogwVar;
        this.f = baelVar;
        this.g = cgbnVar;
        this.l = avmpVar;
        this.m = cgczVar;
        this.z = i;
        this.y = i2;
        this.s = i3;
        this.u = arrayList;
        this.t = cqbfVar;
        this.v = "My Conversation Name";
        this.w = "My MMS Failure Text";
        this.n = ajsnVar;
        this.o = fcsuVar3;
        this.r = aqmqVar;
    }
}
