package defpackage;

import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.app.RemoteActionCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLib;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.List;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgob extends cgiw {
    public static final eksp a = eksp.c("BugleNotifications");
    public final Context b;
    public final eosc c;
    public final eosd d;
    public final cgqh e;
    public final avmp f;
    public final Optional g;
    public final fcsu h;
    public final cogw i;
    public final cgql j;
    public final Optional k;
    public final Optional l;
    public final cgoz m;
    public final Optional n;
    public final fcsu o;
    public final fcsu p;
    public final fcsu q;
    public final cgkj r;
    private final eosc s;
    private final cgml t;
    private final cgoq u;
    private final cgnc v;
    private final cgoh w;
    private final cgqk x;
    private final cgmz y;
    private final fcsu z;

    public cgob(Context context, eosc eoscVar, eosc eoscVar2, eosd eosdVar, cgoz cgozVar, cgml cgmlVar, cgqh cgqhVar, cgoq cgoqVar, cgnc cgncVar, avmp avmpVar, Optional optional, fcsu fcsuVar, cogw cogwVar, cgoh cgohVar, cgql cgqlVar, cgqk cgqkVar, cgmz cgmzVar, Optional optional2, fcsu fcsuVar2, Optional optional3, cgkj cgkjVar, Optional optional4, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        this.b = context;
        this.s = eoscVar;
        this.c = eoscVar2;
        this.d = eosdVar;
        this.t = cgmlVar;
        this.e = cgqhVar;
        this.u = cgoqVar;
        this.v = cgncVar;
        this.f = avmpVar;
        this.g = optional;
        this.h = fcsuVar;
        this.i = cogwVar;
        this.w = cgohVar;
        this.j = cgqlVar;
        this.x = cgqkVar;
        this.y = cgmzVar;
        this.k = optional2;
        this.z = fcsuVar2;
        this.l = optional3;
        this.r = cgkjVar;
        this.n = optional4;
        this.o = fcsuVar3;
        this.m = cgozVar;
        this.p = fcsuVar4;
        this.q = fcsuVar5;
    }

    @Override // defpackage.cgiw
    public final /* bridge */ /* synthetic */ eiju a(List list, Object obj) {
        eiju eijuVarH;
        final cgpd cgpdVar = (cgpd) obj;
        if (list.isEmpty() && DesugarCollections.unmodifiableMap(cgpdVar.c).isEmpty() && !cgpdVar.e) {
            ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageBlueprint", "createNotificationCreationPackage", 199, "IncomingMessageBlueprint.java")).q("No inputs, not creating incoming message notification");
            return eijx.e(null);
        }
        final cgog cgogVarA = this.w.a(list);
        cgml cgmlVar = this.t;
        boolean z = cgpdVar.e;
        Context context = (Context) cgmlVar.a.b();
        context.getClass();
        eosc eoscVar = (eosc) cgmlVar.b.b();
        eoscVar.getClass();
        eosc eoscVar2 = (eosc) cgmlVar.c.b();
        eoscVar2.getClass();
        cgpw cgpwVar = (cgpw) cgmlVar.d.b();
        cgpwVar.getClass();
        cgph cgphVar = (cgph) cgmlVar.e.b();
        cgphVar.getClass();
        cgoh cgohVar = (cgoh) cgmlVar.f.b();
        cgohVar.getClass();
        cgqd cgqdVar = (cgqd) cgmlVar.g.b();
        cgqdVar.getClass();
        arpr arprVar = (arpr) cgmlVar.h.b();
        arprVar.getClass();
        cgmj cgmjVar = (cgmj) cgmlVar.i.b();
        cgmjVar.getClass();
        cgpdVar.getClass();
        final cgmf cgmfVar = new cgmf(context, eoscVar, eoscVar2, cgpwVar, cgphVar, cgohVar, cgqdVar, arprVar, cgmjVar, cgpdVar, z);
        if (cgmfVar.g.a()) {
            cgmj cgmjVar2 = cgmfVar.h;
            eiju eijuVarA = cgmfVar.a(list);
            eijuVarA.getClass();
            eijuVarH = auvw.c(cgmjVar2.b, fcyi.a, fdjz.a, new cgmh(eijuVarA, cgmjVar2, null));
        } else {
            eijuVarH = cgmfVar.a(list).h(new ejvr() { // from class: cgmd
                @Override // defpackage.ejvr
                public final Object apply(Object obj2) {
                    int i = ekgb.d;
                    ekfw ekfwVar = new ekfw();
                    Iterator it = ((Map) obj2).entrySet().iterator();
                    while (it.hasNext()) {
                        cgmf cgmfVar2 = cgmfVar;
                        Map.Entry entry = (Map.Entry) it.next();
                        ConversationIdType conversationIdTypeB = barn.b((String) entry.getKey());
                        final long j = ((cgov) entry.getValue()).c;
                        final cgpw cgpwVar2 = cgmfVar2.d;
                        badt badtVarB = cgpwVar2.b(conversationIdTypeB);
                        if (badtVarB == null) {
                            eksl ekslVar = (eksl) cgmf.a.h();
                            ekslVar.X(cqnc.r, conversationIdTypeB.toString());
                            ekslVar.X(cgey.r, Long.valueOf(j));
                            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/ConversationAndMessagesDataCreator", "createConversationAndMessagesDataList", 115, "ConversationAndMessagesDataCreator.java")).q("conversationData is null, skipping");
                        } else {
                            ekgb ekgbVarA = ((ekgb) (cgpwVar2.f.a() ? Collection.EL.stream(((baua) cgpwVar2.b.b()).d(conversationIdTypeB)).map(new Function() { // from class: cgpo
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    return ((baeb) cgpwVar2.e.b()).b((bdxm) obj3);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }) : Collection.EL.stream(((baua) cgpwVar2.b.b()).c(conversationIdTypeB)).map(new Function() { // from class: cgpp
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    return ((baeb) cgpwVar2.e.b()).d((bfsb) obj3);
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            })).filter(new Predicate() { // from class: cgpq
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
                                public final boolean test(Object obj3) {
                                    baea baeaVar = (baea) obj3;
                                    eksp ekspVar = cgpw.a;
                                    boolean zAf = baeaVar.af();
                                    long j2 = j;
                                    return zAf ? baeaVar.i() >= j2 : baeaVar.h() >= j2;
                                }
                            }).collect(ekcv.a)).a();
                            if (ekgbVarA.isEmpty()) {
                                eksl ekslVar2 = (eksl) cgmf.a.h();
                                ekslVar2.X(cqnc.r, conversationIdTypeB.toString());
                                ekslVar2.X(cgey.r, Long.valueOf(j));
                                ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/ConversationAndMessagesDataCreator", "createConversationAndMessagesDataList", 128, "ConversationAndMessagesDataCreator.java")).q("messagesData is null or empty, skipping");
                            } else {
                                String strJoin = TextUtils.join(",", (Iterable) Collection.EL.stream(ekgbVarA).map(new Function() { // from class: cgmc
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj3) {
                                        return ((baea) obj3).r();
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).collect(Collectors.toCollection(new cgmb())));
                                eksl ekslVar3 = (eksl) cgmf.a.h();
                                Iterator it2 = it;
                                ekslVar3.X(cqnc.r, conversationIdTypeB.a());
                                ekslVar3.X(cgpl.e, strJoin);
                                ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/ConversationAndMessagesDataCreator", "createConversationAndMessagesDataList", 142, "ConversationAndMessagesDataCreator.java")).q("Queried message ids");
                                ekfwVar.h(cglz.h(conversationIdTypeB, cgrc.b, j, badtVarB, ekgbVarA, cgmfVar2.e.a(cgmfVar2.b, (baea) ekis.j(ekgbVarA), badtVarB.Q(), badtVarB.Q() ? badtVarB.o() : null), cgpwVar2.a(conversationIdTypeB, j)));
                                it = it2;
                            }
                        }
                    }
                    return ekfwVar.g();
                }
            }, cgmfVar.c);
        }
        final eiju eijuVarI = eijuVarH.i(new eooz() { // from class: cgnf
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:64:0x02ca  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x0310  */
            /* JADX WARN: Type inference failed for: r1v11 */
            /* JADX WARN: Type inference failed for: r1v12 */
            /* JADX WARN: Type inference failed for: r1v14, types: [boolean] */
            /* JADX WARN: Type inference failed for: r1v20 */
            /* JADX WARN: Type inference failed for: r1v21 */
            @Override // defpackage.eooz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r28) {
                /*
                    Method dump skipped, instructions count: 850
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cgnf.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
            }
        }, eoqg.a);
        ejvr ejvrVar = new ejvr() { // from class: cgnk
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                eksp ekspVar = cgob.a;
                if (!((ekgb) obj2).isEmpty()) {
                    return new cggz();
                }
                ((eksl) ((eksl) cgob.a.h()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageBlueprint", "createNotificationSummaryBuilderInfo", 914, "IncomingMessageBlueprint.java")).q("Conversation and messages data list is empty, not creating summary builder info");
                return null;
            }
        };
        eosc eoscVar3 = this.s;
        final eiju eijuVarH2 = eijuVarH.h(ejvrVar, eoscVar3);
        return eijx.m(eijuVarI, eijuVarH2).a(new Callable() { // from class: cgno
            @Override // java.util.concurrent.Callable
            public final Object call() {
                eksp ekspVar = cgob.a;
                List list2 = (List) eork.q(eijuVarI);
                list2.getClass();
                ekgb ekgbVarN = ekgb.n(list2);
                if (ekgbVarN.isEmpty()) {
                    ((eksl) ((eksl) cgob.a.h()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageBlueprint", "createNotificationCreationPackage", 225, "IncomingMessageBlueprint.java")).q("No builder infos, not creating notification creation package");
                    return null;
                }
                cglc cglcVar = (cglc) eork.q(eijuVarH2);
                if (cglcVar != null) {
                    return new cggr(ekgbVarN, Optional.of(cglcVar));
                }
                ((eksl) ((eksl) cgob.a.h()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageBlueprint", "createNotificationCreationPackage", 233, "IncomingMessageBlueprint.java")).q("summaryBuilderInfo is null, not creating notification creation package");
                return null;
            }
        }, eoscVar3);
    }

    public final eiju b(final cgpd cgpdVar, final cglz cglzVar, final Set set) {
        eiju eijuVarE;
        final eiju eijuVarE2;
        final eiju eijuVarE3;
        eiju eijuVar;
        eiju eijuVarE4;
        eiju eijuVarH;
        eiju eijuVarE5;
        final cgob cgobVar = this;
        if (((bwwe) cgobVar.z.b()).f(cglzVar.d())) {
            Optional optional = cgobVar.k;
            if (optional.isEmpty() || !((cqzo) optional.get()).f()) {
                ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageBlueprint", "createNotificationBuilderInfoFuture", 410, "IncomingMessageBlueprint.java")).q("Skipping notification creation because in focused conversation");
                cgnc cgncVar = cgobVar.v;
                if (cgncVar.f.getRingerMode() != 2) {
                    ((eksl) ((eksl) cgnc.a.h()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageAudioPlayer", "playInConversationNotificationSoundSync", 63, "IncomingMessageAudioPlayer.java")).q("Ringer mode silenced: notification sound not played");
                } else {
                    Context context = cgncVar.b;
                    if (cgncVar.d.q(context.getString(R.string.send_sound_pref_key), context.getResources().getBoolean(R.bool.send_sound_pref_default))) {
                        cqvd cqvdVar = cgncVar.e;
                        cquu cquuVar = new cquu();
                        cquuVar.a = cqum.b(R.raw.message_incoming);
                        cquuVar.d(0.25f);
                        cquuVar.b(new AudioAttributes.Builder().setUsage(5).build());
                        cquuVar.c(new cquw());
                        eiju eijuVarA = cqvdVar.a(cquuVar.a());
                        eosd eosdVar = cgncVar.c;
                        auvh.h(eijuVarA.j(5L, TimeUnit.SECONDS, eosdVar).e(TimeoutException.class, new ejvr() { // from class: cgna
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                ((eksl) ((eksl) ((eksl) cgnc.a.j()).g((TimeoutException) obj)).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageAudioPlayer", "playInConversationNotificationSoundSync", 94, "IncomingMessageAudioPlayer.java")).q("In-conversation notification sound timed out");
                                return cqup.c(2);
                            }
                        }, eoqg.a).e(cqve.class, new ejvr() { // from class: cgnb
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                ((eksl) ((eksl) ((eksl) cgnc.a.j()).g((cqve) obj)).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageAudioPlayer", "playInConversationNotificationSoundSync", 102, "IncomingMessageAudioPlayer.java")).q("Failed to play notification sound");
                                return cqup.c(2);
                            }
                        }, eosdVar));
                    } else {
                        ((eksl) ((eksl) cgnc.a.h()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageAudioPlayer", "playInConversationNotificationSoundSync", 71, "IncomingMessageAudioPlayer.java")).q("Sound setting disabled for in-conversation notifications");
                    }
                }
                return eijx.e(null);
            }
        }
        final badt badtVarC = cglzVar.c();
        final ekgb ekgbVarG = cglzVar.g();
        final baea baeaVar = (baea) ekis.j(ekgbVarG);
        final cgpe cgpeVarE = cglzVar.e();
        final cgqk cgqkVar = cgobVar.x;
        if (cgqk.a()) {
            ((eksl) ((eksl) cgqk.a.h()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageSuggestionCreator", "getSuggestions", 65, "IncomingMessageSuggestionCreator.java")).q("Using system text classifier suggestions, not creating custom suggestions");
            eijuVarE = eijx.e(Optional.empty());
        } else if (!((crlk) cgqkVar.e.b()).c()) {
            ((eksl) ((eksl) cgqk.a.h()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageSuggestionCreator", "getSuggestions", 71, "IncomingMessageSuggestionCreator.java")).q("Smart suggestions in notifications are disabled, not creating suggestions");
            eijuVarE = eijx.e(Optional.empty());
        } else if (TextUtils.isEmpty(badtVarC.J().toString()) || badtVarC.P() || baeaVar == null) {
            ((eksl) ((eksl) cgqk.a.h()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageSuggestionCreator", "getSuggestions", 82, "IncomingMessageSuggestionCreator.java")).q("Rbm bot or invalid input data, not creating suggestions");
            eijuVarE = eijx.e(Optional.empty());
        } else if (cgqk.b()) {
            Optional optional2 = cgqkVar.c;
            if (optional2.isEmpty()) {
                ((eksl) ((eksl) cgqk.a.h()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageSuggestionCreator", "getSuggestions", 88, "IncomingMessageSuggestionCreator.java")).q("Notification suggestions loader not present, not creating suggestions");
                eijuVarE = eijx.e(Optional.empty());
            } else {
                ConversationIdType conversationIdTypeJ = badtVarC.J();
                if (conversationIdTypeJ == null) {
                    throw new NullPointerException("Null conversationId");
                }
                boolean zV = badtVarC.v();
                boolean zP = badtVarC.P();
                MessageIdType messageIdTypeR = baeaVar.r();
                if (messageIdTypeR == null) {
                    throw new NullPointerException("Null latestMessageId");
                }
                boolean zAf = baeaVar.af();
                bbew bbewVar = (bbew) Objects.requireNonNullElseGet(cqyx.a(badtVarC.i()), new Supplier() { // from class: cgqi
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new bbew();
                    }
                });
                if (bbewVar == null) {
                    throw new NullPointerException("Null latestMessageAnnotationData");
                }
                ((eksl) ((eksl) cgqk.a.h()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageSuggestionCreator", "getSuggestions", 109, "IncomingMessageSuggestionCreator.java")).q("Creating suggestions using notificationSuggestionsLoader");
                Object obj = optional2.get();
                final cget cgetVar = new cget(conversationIdTypeJ, zP, zV, messageIdTypeR, zAf, bbewVar);
                final ConversationIdType conversationIdType = cgetVar.a;
                if (conversationIdType.b() || cgetVar.b || cgetVar.e) {
                    eijuVarE = eijx.e(Optional.empty());
                } else {
                    final MessageIdType messageIdType = cgetVar.d;
                    final cufj cufjVar = (cufj) obj;
                    Callable callable = new Callable() { // from class: cufg
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return ((crif) cufjVar.a.b()).b(messageIdType);
                        }
                    };
                    eosc eoscVar = cufjVar.b;
                    final eiju eijuVarG = eijx.g(callable, eoscVar);
                    final eiju eijuVarG2 = eijx.g(new Callable() { // from class: cufi
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Optional.ofNullable(cufjVar.d.a(baga.c(conversationIdType).z()).a());
                        }
                    }, eoscVar);
                    eijuVarE = eijx.m(eijuVarG, eijuVarG2).a(new Callable() { // from class: cufh
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            final List list = (List) eork.q(eijuVarG);
                            Optional optional3 = (Optional) eork.q(eijuVarG2);
                            final cufj cufjVar2 = cufjVar;
                            final cgeu cgeuVar = cgetVar;
                            return optional3.map(new Function() { // from class: cuff
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    cufj cufjVar3 = cufjVar2;
                                    cufjVar3.f.getClass();
                                    csyk csykVar = cufjVar3.g;
                                    csykVar.getClass();
                                    cufe cufeVar = new cufe(cgeuVar, (ParticipantsTable.BindData) obj2, csykVar);
                                    List list2 = list;
                                    list2.getClass();
                                    return (ekgb) fdim.a(fcyi.a, new cmyj(cufjVar3.e, list2, cufeVar, null));
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                        }
                    }, cufjVar.c);
                }
            }
        } else {
            eksl ekslVar = (eksl) cgqk.a.h();
            ekslVar.X(cqnc.a, baeaVar.r().b());
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageSuggestionCreator", "getSuggestions", 116, "IncomingMessageSuggestionCreator.java")).q("Loading suggestions from DB by message ID");
            eijuVarE = eijx.g(new Callable() { // from class: cgqj
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Optional.of(((crif) cgqkVar.d.b()).b(baeaVar.r()));
                }
            }, cgqkVar.b);
        }
        baeaVar.getClass();
        final Optional optionalOfNullable = Optional.ofNullable(baeaVar.p());
        final cgmz cgmzVar = cgobVar.y;
        boolean z = cgpdVar.d;
        final ConversationIdType conversationIdTypeJ2 = badtVarC.J();
        final baea baeaVar2 = (baea) ekis.j(ekgbVarG);
        Optional optional3 = cgmzVar.h;
        optional3.isPresent();
        if (((Boolean) cgpa.b.e()).booleanValue() && cgmz.c(badtVarC.w(), ekgbVarG) && cgqk.b() && z) {
            CharSequence charSequence = ((cglx) cgpeVarE).b;
            if (charSequence == null) {
                ((eksl) ((eksl) cgmz.a.h()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createTextClassifierSmartActions", 742, "IncomingMessageActionCreator.java")).q("Text is empty, not creating text classifier actions");
                eijuVarE2 = eijx.e(new ArrayList());
            } else {
                cuft cuftVar = (cuft) optional3.get();
                cugg cuggVar = cuftVar.a;
                final String string = charSequence.toString();
                eijuVarE2 = cuggVar.a().h(new ejvr() { // from class: cufs
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        RemoteActionCompat remoteActionCompat;
                        Optional optional4 = (Optional) obj2;
                        if (optional4.isEmpty()) {
                            int i = ekgb.d;
                            return ekoe.a;
                        }
                        String str = string;
                        List listSingletonList = Collections.singletonList(new euie(euie.b, str == null ? null : new SpannedString(str), Bundle.EMPTY));
                        ekgb ekgbVarR = ekgb.r("notification");
                        euke eukeVar = new euke();
                        eukeVar.a = ekgb.r("text_reply");
                        listSingletonList.getClass();
                        euih euihVarF = ((TextClassifierLib) optional4.get()).f(new euig(DesugarCollections.unmodifiableList(listSingletonList), eukeVar.a(), ekgbVarR == null ? ekoe.a : DesugarCollections.unmodifiableList(ekgbVarR), Bundle.EMPTY));
                        ArrayList arrayList = new ArrayList();
                        ekgb ekgbVar = ((eugu) euihVarF).a;
                        int size = ekgbVar.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            euib euibVar = (euib) ekgbVar.get(i2);
                            if (TextUtils.isEmpty(euibVar.a) && (remoteActionCompat = euibVar.b) != null && remoteActionCompat.f) {
                                kve kveVar = new kve(remoteActionCompat.a, remoteActionCompat.b, remoteActionCompat.d);
                                kveVar.e = true;
                                arrayList.add(kveVar.a());
                            }
                        }
                        return arrayList;
                    }
                }, cuftVar.b).h(new ejvr() { // from class: cgmn
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        eksp ekspVar = cgmz.a;
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((List) obj2).iterator();
                        while (it.hasNext()) {
                            arrayList.add(cgis.p(cgit.NAT_TEXT_CLASSIFIER_ACTION, (kvf) it.next(), Optional.empty()));
                        }
                        return arrayList;
                    }
                }, cgmzVar.e);
            }
        } else {
            eksp ekspVar = cgmz.a;
            ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createTextClassifierSmartActions", 730, "IncomingMessageActionCreator.java")).q("Conversation/message doesn't allow smart text actions, not creating text classifier actions");
            eksl ekslVar2 = (eksl) ekspVar.h();
            ekslVar2.X(cqnc.r, badtVarC.J().a());
            ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createTextClassifierSmartActions", 736, "IncomingMessageActionCreator.java")).q("Skipping text classifier smart actions");
            eijuVarE2 = eijx.e(new ArrayList());
        }
        final ConversationId conversationIdH = badtVarC.H();
        if (cgmz.c(badtVarC.w(), ekgbVarG) && cgqk.b()) {
            eijuVarE3 = eijuVarE.h(new ejvr() { // from class: cgmr
                @Override // defpackage.ejvr
                public final Object apply(Object obj2) {
                    cgmz cgmzVar2;
                    Optional optional4 = (Optional) obj2;
                    if (optional4.isEmpty()) {
                        return new ArrayList();
                    }
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ekgb ekgbVar = (ekgb) optional4.get();
                    int size = ekgbVar.size();
                    int i = 0;
                    while (true) {
                        cgmzVar2 = cgmzVar;
                        if (i >= size) {
                            break;
                        }
                        SuggestionData suggestionData = (SuggestionData) ekgbVar.get(i);
                        if (!bbfa.c(suggestionData)) {
                            ejwl.a(!bbfa.c(suggestionData));
                            cgis cgisVarP = null;
                            cgev cgevVar = suggestionData instanceof SmartSuggestionItemSuggestionData ? (cgev) cgmzVar2.j.get(((SmartSuggestionItemSuggestionData) suggestionData).l()) : null;
                            if (cgevVar != null) {
                                cgisVarP = cgis.p(cgit.NAT_NON_TEXT_SMART_ACTION, cgevVar.a(suggestionData, conversationIdH), Optional.empty());
                            } else {
                                eksl ekslVar3 = (eksl) cgmz.a.j();
                                ekslVar3.X(cgey.e, suggestionData.b());
                                ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "getNotificationSmartAction", 797, "IncomingMessageActionCreator.java")).q("Missing smart action provider for type");
                            }
                            String strB = suggestionData.b();
                            if (cgisVarP != null && !TextUtils.isEmpty(strB)) {
                                arrayList2.add(strB);
                                arrayList.add(cgisVarP);
                            }
                        }
                        i++;
                    }
                    cgqk cgqkVar2 = cgmzVar2.g;
                    if (arrayList2.isEmpty()) {
                        return arrayList;
                    }
                    ((crif) cgqkVar2.d.b()).p(arrayList2, ezai.SHOWN);
                    return arrayList;
                }
            }, cgmzVar.f);
        } else {
            eksl ekslVar3 = (eksl) cgmz.a.h();
            ekslVar3.X(cqnc.r, conversationIdH.b());
            ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createNonTextSmartActions", 601, "IncomingMessageActionCreator.java")).q("Skipping non-text smart actions");
            eijuVarE3 = eijx.e(new ArrayList());
        }
        final eiju eijuVar2 = eijuVarE;
        final eiju eijuVarH2 = eijx.h(new eooy() { // from class: cgmw
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                eiju eijuVarH3;
                eiju eijuVarH4;
                eiju eijuVarE6;
                final ArrayList arrayList = new ArrayList();
                final baea baeaVar3 = baeaVar2;
                bbew bbewVarA = cqyx.a(baeaVar3.r());
                boolean zBooleanValue = ((Boolean) czwc.e.e()).booleanValue();
                final cgmz cgmzVar2 = cgmzVar;
                if (zBooleanValue) {
                    Optional optional4 = cgmzVar2.q;
                    if (optional4.isEmpty()) {
                        ((eksl) ((eksl) cgmz.a.h()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createReminderAction", 643, "IncomingMessageActionCreator.java")).q("Reminder settings service not present, skipping reminder action");
                        eijuVarH3 = eijx.e(null);
                    } else {
                        eijuVarH3 = ((clfl) optional4.get()).b().h(new ejvr() { // from class: cgms
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                baea baeaVar4 = baeaVar3;
                                final MessageIdType messageIdTypeR2 = baeaVar4.r();
                                if (!((Boolean) obj2).booleanValue() || messageIdTypeR2.c() || baeaVar4.W()) {
                                    ((eksl) ((eksl) cgmz.a.h()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createReminderAction", 657, "IncomingMessageActionCreator.java")).q("Unable to create reminder action from message data");
                                    return null;
                                }
                                cgmz cgmzVar3 = cgmzVar2;
                                final ConversationIdType conversationIdTypeQ = baeaVar4.q();
                                Optional map = cgmzVar3.p.map(new Function() { // from class: cgmy
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj3) {
                                        eksp ekspVar2 = cgmz.a;
                                        return ((clfb) obj3).a(conversationIdTypeQ, messageIdTypeR2);
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                if (map.isPresent()) {
                                    return cgis.p(cgit.NAT_REMINDER, (kvf) map.get(), Optional.empty());
                                }
                                ((eksl) ((eksl) cgmz.a.j()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createReminderAction", 669, "IncomingMessageActionCreator.java")).q("Reminder action is not present, not creating reminder action");
                                return null;
                            }
                        }, cgmzVar2.e);
                    }
                } else {
                    eijuVarH3 = eijx.e(null);
                }
                ConversationIdType conversationIdType2 = conversationIdTypeJ2;
                arrayList.add(eijuVarH3);
                Context context2 = cgmzVar2.d;
                cldu clduVar = cgmzVar2.i;
                cgir cgirVarN = cgis.n(cgit.NAT_MARK_AS_READ, IconCompat.h(context2, R.drawable.ic_check_circle_gray), context2.getString(R.string.im_notification_mark_as_read), clduVar.f(conversationIdType2), Optional.empty());
                ((cggl) cgirVarN).e = Optional.of(2);
                arrayList.add(eijx.e(cgirVarN.a()));
                if (cgqk.a() || !bbewVarA.b().isPresent() || ((cmdd) cgmzVar2.r.b()).b()) {
                    ekgb ekgbVar = ekgbVarG;
                    Optional optional5 = optionalOfNullable;
                    if (optional5.isPresent()) {
                        final badt badtVar = badtVarC;
                        final SelfIdentityId selfIdentityId = (SelfIdentityId) optional5.get();
                        if (!cgmz.c(badtVar.w(), ekgbVar)) {
                            eksl ekslVar4 = (eksl) cgmz.a.h();
                            ekslVar4.X(cqnc.r, badtVar.J().a());
                            ((eksl) ekslVar4.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createQuickReplyAction", 522, "IncomingMessageActionCreator.java")).q("Conversation/message doesn't allow quick reply, not adding quick reply action");
                            eijuVarH4 = eijx.e(null);
                        } else if (badtVar.m().booleanValue()) {
                            eksl ekslVar5 = (eksl) cgmz.a.h();
                            ekslVar5.X(cqnc.s, badtVar.J());
                            ((eksl) ekslVar5.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createQuickReplyAction", 532, "IncomingMessageActionCreator.java")).q("eSOS Conversation doesn't allow quick reply, not adding quick reply action");
                            eijuVarH4 = eijx.e(null);
                        } else {
                            eijuVarH4 = eijuVar2.h(new ejvr() { // from class: cgmo
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    Bundle bundle = new Bundle();
                                    badt badtVar2 = badtVar;
                                    bundle.putString("conversation_id", badtVar2.J().a());
                                    bundle.putString("self_id", selfIdentityId.b());
                                    bundle.putBoolean("requires_mms", badtVar2.Q());
                                    bundle.putBoolean("has_rbm_bot_recipient", badtVar2.P());
                                    bundle.putBoolean("via_notification", true);
                                    bundle.putBoolean("via_quickreply", true);
                                    Context context3 = cgmzVar2.d;
                                    cgir cgirVarM = cgis.m(cgit.NAT_QUICK_REPLY, IconCompat.h(context3, R.drawable.ic_wear_reply), context3.getString(R.string.im_notification_reply), Optional.of(bundle));
                                    cggl cgglVar = (cggl) cgirVarM;
                                    cgglVar.f = Optional.of(new kxb[]{new kxb("android.intent.extra.TEXT", context3.getString(R.string.im_notification_reply_prompt), null, true, 0, new Bundle(), new HashSet())});
                                    cgglVar.d = Optional.of(true);
                                    cgglVar.e = Optional.of(1);
                                    return cgirVarM.a();
                                }
                            }, cgmzVar2.f);
                        }
                        arrayList.add(eijuVarH4);
                    } else {
                        ((eksl) ((eksl) cgmz.a.j()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createActions", 227, "IncomingMessageActionCreator.java")).q("Not creating quick reply, no self id to reply on");
                    }
                    arrayList.add(cgmzVar2.b(conversationIdType2, cgpeVarE, ekgbVar.size()));
                } else {
                    MessageIdType messageIdType2 = bbewVarA.c;
                    if (bbewVarA.b().isEmpty()) {
                        eksl ekslVar6 = (eksl) cgmz.a.h();
                        ekslVar6.X(cqnc.r, conversationIdType2.a());
                        ekslVar6.X(cqnc.a, messageIdType2.b());
                        ((eksl) ekslVar6.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createOtpAction", 481, "IncomingMessageActionCreator.java")).q("OTP annotation missing, not creating OTP Action");
                        eijuVarE6 = eijx.e(null);
                    } else {
                        ezds ezdsVar = (ezds) bbewVarA.b().get();
                        eijuVarE6 = eijx.e(cgis.n(cgit.NAT_COPY_OTP, IconCompat.h(context2, R.drawable.quantum_ic_content_copy_grey600_24), context2.getString(R.string.action_copy_otp, cpga.d((ezdsVar.c == 2 ? (ezei) ezdsVar.d : ezei.a).b)), clduVar.e((ezdsVar.c == 2 ? (ezei) ezdsVar.d : ezei.a).b, conversationIdType2, messageIdType2), Optional.empty()).a());
                    }
                    arrayList.add(eijuVarE6);
                }
                return eijx.l(arrayList).a(new Callable() { // from class: cgmq
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        eksp ekspVar2 = cgmz.a;
                        int i = ekgb.d;
                        ekfw ekfwVar = new ekfw();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            cgis cgisVar = (cgis) eork.q((eiju) it.next());
                            if (cgisVar != null) {
                                ekfwVar.h(cgisVar);
                            }
                        }
                        return ekfwVar.g();
                    }
                }, cgmzVar2.e);
            }
        }, cgmzVar.f);
        eijw eijwVarM = eijx.m(eijuVarH2, eijuVarE2, eijuVarE3);
        Callable callable2 = new Callable() { // from class: cgmx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                eksl ekslVar4 = (eksl) cgmz.a.h();
                ekslVar4.X(cqnc.r, conversationIdTypeJ2.a());
                ((eksl) ekslVar4.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createActions", 261, "IncomingMessageActionCreator.java")).q("Notification actions created");
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((java.util.Collection) Objects.requireNonNullElse((AbstractCollection) eork.q(eijuVarH2), new ArrayList()));
                arrayList.addAll((java.util.Collection) Objects.requireNonNullElse((List) eork.q(eijuVarE2), new ArrayList()));
                arrayList.addAll((java.util.Collection) Objects.requireNonNullElse((List) eork.q(eijuVarE3), new ArrayList()));
                List.EL.sort(arrayList, cgmz.c);
                return ekgb.n(arrayList);
            }
        };
        eosc eoscVar2 = cgmzVar.e;
        eiju eijuVarA2 = eijwVarM.a(callable2, eoscVar2);
        final ArrayList arrayList = new ArrayList();
        arrayList.add(cgmzVar.b(badtVarC.J(), cgpeVarE, ekgbVarG.size()));
        if (optionalOfNullable.isPresent()) {
            SelfIdentityId selfIdentityId = (SelfIdentityId) optionalOfNullable.get();
            if (badtVarC.w()) {
                boolean z2 = cgmzVar.n.a(badtVarC.O(), badtVarC.F(), 1) || (badtVarC.Q() && cgmzVar.o.d(badtVarC.F()));
                Bundle bundle = new Bundle();
                bundle.putString("conversation_id", badtVarC.J().a());
                bundle.putString("self_id", selfIdentityId.b());
                bundle.putBoolean("requires_mms", z2);
                bundle.putBoolean("has_rbm_bot_recipient", badtVarC.P());
                bundle.putBoolean("via_notification", true);
                bundle.putBoolean("via_quickreply", true);
                Context context2 = cgmzVar.d;
                cgir cgirVarM = cgis.m(cgit.NAT_WEARABLE_QUICK_REPLY, IconCompat.h(context2, R.drawable.ic_wear_reply), context2.getString(R.string.im_notification_reply_prompt), Optional.of(bundle));
                cggl cgglVar = (cggl) cgirVarM;
                cgglVar.f = Optional.of(new kxb[]{new kxb("android.intent.extra.TEXT", context2.getString(R.string.im_notification_reply_prompt), context2.getResources().getStringArray(R.array.notification_reply_choices), true, 0, new Bundle(), new HashSet())});
                cgglVar.d = Optional.of(true);
                cgglVar.e = Optional.of(1);
                eijuVarE5 = eijx.e(cgirVarM.a());
            } else {
                eijuVarE5 = eijx.e(null);
            }
            arrayList.add(eijuVarE5);
        } else {
            ((eksl) ((eksl) cgmz.a.j()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createWearableActions", 297, "IncomingMessageActionCreator.java")).q("Not creating wearable quick reply, no self id to reply on");
        }
        if (((cdni) cgmzVar.s.b()).b()) {
            eijuVar = eijuVarA2;
        } else {
            badtVarC.P();
            avmp avmpVar = cgmzVar.l;
            Context context3 = cgmzVar.d;
            Intent intentO = avmpVar.o(context3, badtVarC.H(), cgmzVar.k.a(badtVarC), true);
            intentO.setAction("com.google.android.apps.messaging.view_conversation");
            intentO.putExtra("conversation_id", badtVarC.J().a());
            intentO.putExtra("account", cgmzVar.a());
            intentO.putExtra("account_version", 2);
            intentO.putExtra("phone_number", (String) badtVarC.k().map(new Function() { // from class: cgmt
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    eksp ekspVar2 = cgmz.a;
                    cczv cczvVar = alvx.a;
                    return ((alqm) obj2).p(((Boolean) new alvp().get()).booleanValue());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(null));
            eijuVar = eijuVarA2;
            arrayList.add(eijx.e(cgis.q(cgit.NAT_WEARABLE_OPEN_CONVERSATION, IconCompat.h(context3, R.drawable.ic_full_sms_white), context3.getString(R.string.notification_view_conversation), intentO, true).a()));
        }
        if (badtVarC.Q() || badtVarC.O() || !badtVarC.w()) {
            eijuVarE4 = eijx.e(null);
        } else {
            cgdc cgdcVar = cgmzVar.m;
            Context context4 = cgmzVar.d;
            badtVarC.J();
            Optional optionalK = badtVarC.k();
            badtVarC.d.f();
            Intent intentB = cgdcVar.b(optionalK);
            intentB.setAction("com.google.android.apps.messaging.action_dial");
            Bundle bundle2 = new Bundle();
            bundle2.putString("conversation_id", badtVarC.J().a());
            bundle2.putInt("account", cgmzVar.a());
            bundle2.putInt("account_version", 2);
            bundle2.putString("phone_number", (String) badtVarC.k().map(new Function() { // from class: cgmm
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    eksp ekspVar2 = cgmz.a;
                    cczv cczvVar = alvx.a;
                    return ((alqm) obj2).p(((Boolean) new alvp().get()).booleanValue());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(null));
            intentB.putExtras(bundle2);
            eijuVarE4 = eijx.e(cgis.q(cgit.NAT_WEARABLE_CALL, IconCompat.h(context4, R.drawable.ic_full_call_white), context4.getString(R.string.im_notification_call), intentB, false).a());
        }
        arrayList.add(eijuVarE4);
        final eiju eijuVarA3 = eijx.l(arrayList).a(new Callable() { // from class: cgmp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                eksl ekslVar4 = (eksl) cgmz.a.h();
                ekslVar4.X(cqnc.r, badtVarC.J().a());
                ((eksl) ekslVar4.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createWearableActions", 311, "IncomingMessageActionCreator.java")).q("Wearable notification actions created");
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    cgis cgisVar = (cgis) eork.q((eiju) it.next());
                    if (cgisVar != null) {
                        arrayList2.add(cgisVar);
                    }
                }
                List.EL.sort(arrayList2, cgmz.c);
                return ekgb.n(arrayList2);
            }
        }, eoscVar2);
        final boolean z3 = cgpdVar.d;
        final ConversationIdType conversationIdTypeD = cglzVar.d();
        final ConversationId conversationIdH2 = cglzVar.c().H();
        final long jB = cglzVar.b();
        final badt badtVarC2 = cglzVar.c();
        final ekgb ekgbVarG2 = cglzVar.g();
        final baea baeaVar3 = (baea) ekis.j(ekgbVarG2);
        final cgpe cgpeVarE2 = cglzVar.e();
        final bajg bajgVarA = cgobVar.m.a(badtVarC2);
        Optional optional4 = cgobVar.g;
        if (optional4.isEmpty()) {
            eijuVarH = eijx.e(Optional.empty());
        } else {
            eiju eijuVarC = ((cqdn) optional4.get()).c(badtVarC2.n(), cgobVar.b, true, badtVarC2.c());
            cgobVar = this;
            conversationIdTypeD = conversationIdTypeD;
            eijuVarH = eijuVarC.h(new ejvr() { // from class: cgne
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.ejvr
                public final Object apply(Object obj2) {
                    ekgb ekgbVarG3;
                    String strO;
                    cgob cgobVar2 = this.a;
                    IconCompat iconCompat = (IconCompat) obj2;
                    cqdn cqdnVar = (cqdn) cgobVar2.g.get();
                    ConversationIdType conversationIdType2 = conversationIdTypeD;
                    String strE = cqdnVar.e(conversationIdType2);
                    cqdm cqdmVar = (cqdm) cgobVar2.h.b();
                    badt badtVar = badtVarC2;
                    int i = true != cqdmVar.a(badtVar) ? 2147483646 : 0;
                    ekgb ekgbVar = ekgbVarG2;
                    cgoz cgozVar = cgobVar2.m;
                    String strD = cgozVar.d(badtVar, ekgbVar);
                    cghm cghmVarL = cghn.l();
                    cggj cggjVar = (cggj) cghmVarL;
                    cggjVar.b = conversationIdType2;
                    ConversationId conversationId = conversationIdH2;
                    cghmVarL.f(conversationId);
                    cggjVar.a = strE;
                    cghmVarL.d(strD);
                    cghmVarL.e(badtVar.Q());
                    cghmVarL.g(badtVar.k());
                    cghmVarL.h(i);
                    if (ekgbVar.isEmpty()) {
                        ekgbVarG3 = ekoe.a;
                    } else {
                        HashSet hashSet = new HashSet();
                        ekfw ekfwVar = new ekfw();
                        int size = ekgbVar.size();
                        int i2 = 0;
                        while (i2 < size) {
                            baea baeaVar4 = (baea) ekgbVar.get(i2);
                            ParticipantsTable.BindData bindData = baeaVar4.d;
                            ekgb ekgbVar2 = ekgbVar;
                            long jU = bindData.u();
                            String strS = bindData.S();
                            Uri lookupUri = null;
                            if (jU > -1 && !TextUtils.isEmpty(strS)) {
                                lookupUri = ContactsContract.Contacts.getLookupUri(jU, strS);
                            }
                            Uri uri = lookupUri;
                            if (baeaVar4.Z() && uri != null && !hashSet.contains(uri)) {
                                hashSet.add(uri);
                                ParticipantsTable.BindData bindData2 = baeaVar4.d;
                                String strQ = bindData2.Q();
                                if (TextUtils.isEmpty(strQ)) {
                                    cczv cczvVar = alvx.a;
                                    if (((Boolean) new alvb().get()).booleanValue()) {
                                        strO = cgozVar.c.o(bindData2).F().a;
                                        strO.getClass();
                                    } else {
                                        strO = bindData2.O();
                                    }
                                    strQ = strO;
                                    if (TextUtils.isEmpty(strQ)) {
                                        strQ = cgozVar.a.getString(R.string.unknown_sender);
                                    }
                                }
                                ekfwVar.h(cglt.e(strQ, baeaVar4.m(), uri));
                            }
                            i2++;
                            ekgbVar = ekgbVar2;
                        }
                        ekgbVarG3 = ekfwVar.g();
                    }
                    bajg bajgVar = bajgVarA;
                    cggjVar.f = Optional.of(ekgbVarG3);
                    cggjVar.c = iconCompat;
                    cggjVar.d = Optional.of(cgkm.e(cgobVar2.f.n(cgobVar2.b, conversationId, null, bajgVar, null), false, Optional.empty(), Optional.empty()));
                    return Optional.of(cghmVarL.a());
                }
            }, cgobVar.s);
        }
        final eiju eijuVarH3 = eijuVarH.h(new ejvr() { // from class: cgnl
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:135:0x0468  */
            /* JADX WARN: Removed duplicated region for block: B:136:0x046d  */
            /* JADX WARN: Removed duplicated region for block: B:138:0x0470  */
            /* JADX WARN: Removed duplicated region for block: B:143:0x04a3  */
            /* JADX WARN: Removed duplicated region for block: B:202:0x0714  */
            /* JADX WARN: Removed duplicated region for block: B:203:0x072c  */
            /* JADX WARN: Removed duplicated region for block: B:206:0x074d  */
            /* JADX WARN: Removed duplicated region for block: B:216:0x07d9  */
            /* JADX WARN: Removed duplicated region for block: B:217:0x07de  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x0131  */
            /* JADX WARN: Removed duplicated region for block: B:64:0x0262  */
            /* JADX WARN: Type inference failed for: r6v29, types: [fcsu, java.lang.Object] */
            @Override // defpackage.ejvr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object apply(java.lang.Object r41) throws android.content.res.Resources.NotFoundException, java.io.IOException {
                /*
                    Method dump skipped, instructions count: 2083
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cgnl.apply(java.lang.Object):java.lang.Object");
            }
        }, cgobVar.c);
        final eiju eijuVar3 = eijuVar;
        return eijx.m(eijuVarH3, eijuVar, eijuVarA3).a(new Callable() { // from class: cgnn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                eksp ekspVar2 = cgob.a;
                cgjg cgjgVar = (cgjg) eork.q(eijuVarH3);
                cgjgVar.e(Optional.of((java.util.List) eork.q(eijuVar3)));
                ekgb ekgbVar = (ekgb) eork.q(eijuVarA3);
                Optional.empty();
                Optional.empty();
                Optional.empty();
                cgjgVar.l(Optional.of(new cghc(Optional.of(ekgbVar), Optional.empty())));
                eksl ekslVar4 = (eksl) cgob.a.h();
                ekslVar4.X(cqnc.s, cglzVar.d());
                ((eksl) ekslVar4.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageBlueprint", "createNotificationBuilderInfoFuture", 460, "IncomingMessageBlueprint.java")).q("Notification builder info created");
                return cgjgVar.a();
            }
        }, eoqg.a);
    }

    @Override // defpackage.cgiw
    public final cgkq c() {
        return new cgoa();
    }

    @Override // defpackage.cgiw
    public final cglf d() {
        return cglf.NT_INCOMING_MESSAGE;
    }

    @Override // defpackage.cgiw
    public final eiju e() {
        return eijx.e(true);
    }

    @Override // defpackage.cgiw
    public final Optional f() {
        return Optional.of(this.u.c());
    }

    @Override // defpackage.cgiw
    public final String g() {
        return "msg";
    }
}
