package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class danm implements ddix {
    public static final cqce a = cqce.g("Bugle", "MessagesExampleStoreIterator");
    static final cczv b = cdag.e(cdag.b, "messages_example_store_iterator_page_size", 100);
    public final fcsu c;
    public final ArrayList d;
    public final faez e;
    public final Calendar f;
    public final Locale g;
    public final crbb h;
    public ConversationIdType i;
    public int j;
    public int k;
    public int l;
    private final fcsu m;
    private final fcsu n;
    private final fcsu o;
    private final eosc p;
    private final eygg q;
    private final cogw r;
    private final long s;
    private final long t;
    private final Deque u;
    private final fcsu v;
    private final eigp w;
    private final eosc x;
    private int y;
    private boolean z;

    public danm(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, eosc eoscVar, eosc eoscVar2, eygg eyggVar, cogw cogwVar, crbb crbbVar, fcsu fcsuVar5, eigp eigpVar, faez faezVar) {
        TimeZone timeZone = TimeZone.getDefault();
        this.i = barn.a;
        this.j = 0;
        this.y = 0;
        this.k = 0;
        this.l = 0;
        this.z = false;
        this.m = fcsuVar;
        this.n = fcsuVar2;
        this.o = fcsuVar3;
        this.c = fcsuVar4;
        this.p = eoscVar;
        this.x = eoscVar2;
        this.q = eyggVar;
        this.r = cogwVar;
        this.h = crbbVar;
        this.v = fcsuVar5;
        this.w = eigpVar;
        this.e = faezVar;
        long epochMilli = cogwVar.f().toEpochMilli();
        this.s = epochMilli;
        long j = faezVar.e;
        this.t = j > 0 ? epochMilli - TimeUnit.SECONDS.toMillis(j) : 0L;
        this.u = new ArrayDeque();
        this.d = new ArrayList();
        this.f = Calendar.getInstance(timeZone);
        this.g = craf.c(context);
    }

    public static List c(euod euodVar) {
        ArrayList arrayList = new ArrayList();
        List list = euodVar.d;
        if (list != null) {
            arrayList.addAll((Collection) Collection.EL.stream(list).map(new Function() { // from class: damz
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cqce cqceVar = danm.a;
                    eyzy eyzyVarB = eyzy.b(((ezds) obj).e);
                    return eyzyVarB == null ? eyzy.UNRECOGNIZED : eyzyVarB;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new dand())));
        }
        String str = euodVar.a;
        String strConcat = ((Boolean) ((cczi) crao.k.get()).e()).booleanValue() ? ".*".concat(String.valueOf((String) crao.l.e())) : (String) crao.l.e();
        if (!TextUtils.isEmpty(str) && Pattern.matches(strConcat, str)) {
            arrayList.add(eyzy.MAP_LINK_ANNOTATION);
        }
        return arrayList;
    }

    public static void e(Exception exc) {
        cqbd cqbdVarB = a.b();
        cqbdVarB.I("Not creating training example because we could not detect language due to error.");
        cqbdVarB.s(exc);
    }

    private final void f() {
        ConversationIdType conversationIdTypeH;
        final ConversationIdType conversationIdType = this.i;
        eieu eieuVarK = eiiy.k("MessageExampleStoreIterator#getNextConversation");
        try {
            cqaz.h();
            botb botbVarE = botm.e();
            botbVarE.A("getNextConversation");
            botbVarE.g(new Function() { // from class: dane
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cqce cqceVar = danm.a;
                    return ((bopp) obj).a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            botbVarE.e(new bosy(botm.c.a, true));
            botbVarE.y(1);
            if (conversationIdType.b()) {
                botbVarE.i(new Function() { // from class: dang
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        botl botlVar = (botl) obj;
                        cqce cqceVar = danm.a;
                        botlVar.s(-1L);
                        return botlVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            } else {
                botbVarE.i(new Function() { // from class: danf
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        botl botlVar = (botl) obj;
                        cqce cqceVar = danm.a;
                        botlVar.s(conversationIdType.a);
                        return botlVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
            bopr boprVar = (bopr) botbVarE.b().p();
            try {
                if (boprVar.moveToNext()) {
                    conversationIdTypeH = boprVar.h();
                    boprVar.close();
                } else {
                    boprVar.close();
                    conversationIdTypeH = barn.a;
                }
                eieuVarK.close();
                this.i = conversationIdTypeH;
                this.y = 0;
                this.d.clear();
                this.u.clear();
                this.j = 0;
            } finally {
            }
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ddix
    public final void a(final ddkb ddkbVar) {
        eieh eiehVarC = this.w.c("MessagesExampleStoreIterator::next", "com/google/android/apps/messaging/util/examplestore/MessagesExampleStoreIterator", "next", 233);
        try {
            a.m("next() called");
            eika.l(d(ddkbVar), new cqob(new Consumer() { // from class: dank
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    cqce cqceVar = danm.a;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, new Consumer() { // from class: danl
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    danm.a.s("Error creating Brella training example.", (Throwable) obj);
                    this.a.l++;
                    ddkbVar.a(13, null);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }), this.p);
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ddix
    public final void b() {
        eieh eiehVarC = this.w.c("MessagesExampleStoreIterator::request", "com/google/android/apps/messaging/util/examplestore/MessagesExampleStoreIterator", GroupManagementRequest.XML_TAG, 255);
        try {
            a.m("request() called");
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ddix, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        eieh eiehVarC = this.w.c("MessagesExampleStoreIterator::close", "com/google/android/apps/messaging/util/examplestore/MessagesExampleStoreIterator", "close", 263);
        try {
            a.m("close() called");
            damw damwVar = (damw) this.v.b();
            final int i = this.l;
            final long epochMilli = this.r.f().toEpochMilli() - this.s;
            final boolean z = !this.z;
            damwVar.b(new fdap() { // from class: dams
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    elgs elgsVar = (elgs) obj;
                    int i2 = damw.a;
                    elgsVar.getClass();
                    elzc elzcVar = (elzc) elzd.a.createBuilder();
                    elzcVar.getClass();
                    elzcVar.copyOnWrite();
                    elzd elzdVar = (elzd) elzcVar.instance;
                    elzdVar.b |= 2;
                    elzdVar.d = i;
                    elzcVar.copyOnWrite();
                    elzd elzdVar2 = (elzd) elzcVar.instance;
                    elzdVar2.b |= 1;
                    elzdVar2.c = epochMilli;
                    elzcVar.copyOnWrite();
                    elzd elzdVar3 = (elzd) elzcVar.instance;
                    elzdVar3.b |= 4;
                    elzdVar3.e = z;
                    evsn evsnVarBuild = elzcVar.build();
                    evsnVarBuild.getClass();
                    elli elliVar = elgsVar.a;
                    elliVar.copyOnWrite();
                    ellj elljVar = (ellj) elliVar.instance;
                    ellj elljVar2 = ellj.a;
                    elljVar.d = (elzd) evsnVarBuild;
                    elljVar.b |= 2;
                    return fctx.a;
                }
            });
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final eiju d(final ddkb ddkbVar) {
        int i;
        faez faezVar = this.e;
        int i2 = faezVar.b;
        if (i2 <= 0 || this.k < i2) {
            if (this.i.b() || ((i = faezVar.c) > 0 && this.j >= i)) {
                f();
            }
            while (true) {
                Deque deque = this.u;
                if (deque.isEmpty()) {
                    ConversationIdType conversationIdType = this.i;
                    if (conversationIdType.b()) {
                        break;
                    }
                    cqce cqceVar = a;
                    cqbd cqbdVarA = cqceVar.a();
                    cqbdVarA.I("Fetching new page of messages");
                    cqbdVarA.A("conversationId", conversationIdType);
                    cqbdVarA.r();
                    int iIntValue = ((Integer) b.e()).intValue();
                    int i3 = this.y;
                    long j = this.t;
                    eieu eieuVarK = eiiy.k("MessageExampleStoreIterator#getNextMessagesForConversation");
                    try {
                        cqaz.h();
                        ArrayList arrayList = new ArrayList();
                        if (iIntValue <= 0 || i3 < 0) {
                            cqbd cqbdVarE = cqceVar.e();
                            cqbdVarE.I("Unexpected conversation message limit/offset.");
                            cqbdVarE.y("limit", iIntValue);
                            cqbdVarE.y("offset", i3);
                            cqbdVarE.r();
                        } else {
                            brec brecVarE = baxe.E(conversationIdType);
                            if (j > 0) {
                                brecVarE.R(j);
                            }
                            brdr brdrVarD = MessagesTable.d();
                            brdrVarD.A("+getNextMessagesForConversation");
                            brdrVarD.g(brecVarE);
                            bran branVar = MessagesTable.c;
                            brdrVarD.d(new brdo(branVar.i, true), new brdo(branVar.a, true));
                            brdrVarD.y(iIntValue);
                            brdrVarD.B(i3);
                            brap brapVar = (brap) brdrVarD.b().p();
                            while (brapVar.moveToNext()) {
                                try {
                                    MessageCoreData messageCoreDataA = ((bveg) this.o.b()).a();
                                    messageCoreDataA.aO(brapVar);
                                    ((bbae) this.m.b()).c(messageCoreDataA, false);
                                    ((baxe) this.n.b()).O(messageCoreDataA);
                                    arrayList.add(messageCoreDataA);
                                } finally {
                                }
                            }
                            brapVar.close();
                        }
                        eieuVarK.close();
                        if (arrayList.isEmpty()) {
                            f();
                        } else {
                            this.y += arrayList.size();
                            deque.addAll(arrayList);
                        }
                    } catch (Throwable th) {
                        try {
                            eieuVarK.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    MessageCoreData messageCoreData = (MessageCoreData) this.u.pollFirst();
                    if (messageCoreData != null) {
                        ArrayList arrayList2 = this.d;
                        synchronized (arrayList2) {
                            arrayList2.add(0, messageCoreData);
                            if (arrayList2.size() > ((Integer) crbf.c.e()).intValue() + 1) {
                                arrayList2.remove(arrayList2.size() - 1);
                            }
                        }
                        crbb crbbVar = this.h;
                        ArrayList arrayList3 = this.d;
                        if (!crbbVar.d(arrayList3, 2, "MessagesExampleStoreIterator: %s. Do not create training example.")) {
                            return d(ddkbVar);
                        }
                        eiju eijuVarB = ((crav) this.q.b()).b(arrayList3);
                        ejvr ejvrVar = new ejvr() { // from class: dana
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                boolean z;
                                cqce cqceVar2 = danm.a;
                                String language = ((Locale) obj).getLanguage();
                                if (language.equals("en")) {
                                    z = true;
                                } else {
                                    cqbd cqbdVarA2 = danm.a.a();
                                    cqbdVarA2.I("Not creating a training example because detected language did not match required");
                                    cqbdVarA2.A("detectedLanguage", language);
                                    cqbdVarA2.A("requiredLanguage", "en");
                                    cqbdVarA2.r();
                                    z = false;
                                }
                                return Boolean.valueOf(z);
                            }
                        };
                        eosc eoscVar = this.x;
                        return eijuVarB.h(ejvrVar, eoscVar).e(IllegalStateException.class, new ejvr() { // from class: danb
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                danm.e((IllegalStateException) obj);
                                return false;
                            }
                        }, eoscVar).e(IllegalArgumentException.class, new ejvr() { // from class: danc
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                danm.e((IllegalArgumentException) obj);
                                return false;
                            }
                        }, eoscVar).i(new eooz() { // from class: danh
                            /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
                            
                                if (r9 <= r10.h) goto L17;
                             */
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.eooz
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r22) {
                                /*
                                    Method dump skipped, instructions count: 791
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.danh.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
                            }
                        }, this.p);
                    }
                }
            }
        }
        this.z = true;
        ddkbVar.b(null, null);
        return eijx.e(null);
    }
}
