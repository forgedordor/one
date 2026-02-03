package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ubh implements ual {
    public static final cqce a = cqce.g("BugleCms", "ObjectEventHandler");
    public static final ekrz b = new ekrz("message_type", eplh.class, false, false);
    public static final ekrz c = new ekrz("blob_count", Integer.class, false, false);
    static final cczi d = cdag.h(cdag.b, "cms_use_block_list", false);
    public final cptv e;
    public final eosc f;
    public final eosc g;
    public final cpmc h;
    public final cdys i;
    public final uad j;
    public final fcsu k;
    public final dqsn l;
    public final fcsu m;
    public final fcsu n;
    public final appk o;
    public final byqa p;
    private final capx q;
    private final aoot r;

    public ubh(cptv cptvVar, cpmc cpmcVar, cdys cdysVar, uad uadVar, fcsu fcsuVar, dqsn dqsnVar, fcsu fcsuVar2, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar3, appk appkVar, capx capxVar, byqa byqaVar, aoot aootVar) {
        this.e = cptvVar;
        this.h = cpmcVar;
        this.i = cdysVar;
        this.j = uadVar;
        this.k = fcsuVar;
        this.l = dqsnVar;
        this.m = fcsuVar2;
        this.f = eoscVar;
        this.g = eoscVar2;
        this.n = fcsuVar3;
        this.o = appkVar;
        this.q = capxVar;
        this.p = byqaVar;
        this.r = aootVar;
    }

    public static bmue b(String str, String str2, cpya cpyaVar) {
        String[] strArr = bmvh.a;
        bmuh bmuhVar = new bmuh();
        bmuhVar.b(str);
        bmuhVar.c(cpyaVar);
        bmuhVar.d(str2);
        return bmuhVar.a();
    }

    @Override // defpackage.ual
    public final /* bridge */ /* synthetic */ ListenableFuture a(eqmo eqmoVar) {
        if (eqmoVar.b != 1) {
            cqbd cqbdVarE = a.e();
            cqbdVarE.A(bzmz.u.a, eqmn.a(eqmoVar.b));
            cqbdVarE.I("Cannot handle event");
            cqbdVarE.r();
            return eijx.e(null);
        }
        final eqng eqngVar = (eqng) eqmoVar.c;
        int i = eqngVar.b;
        int iB = eqnf.b(i);
        if (iB == 0) {
            iB = 1;
        }
        int i2 = iB - 2;
        if (i2 != 3) {
            if (i2 == 4) {
                Callable callable = new Callable() { // from class: uat
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        cqce cqceVar = ubh.a;
                        return Optional.ofNullable(MessagesTable.a(eqngVar.c));
                    }
                };
                eosc eoscVar = this.f;
                return eijx.g(callable, eoscVar).i(new eooz() { // from class: uau
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        Optional optional = (Optional) obj;
                        boolean zIsEmpty = optional.isEmpty();
                        final ubh ubhVar = this.a;
                        final eqng eqngVar2 = eqngVar;
                        if (!zIsEmpty) {
                            final MessageIdType messageIdTypeE = ((MessagesTable.BindData) optional.get()).E();
                            return eiju.g(ubhVar.o.a() ? ubhVar.i.b(messageIdTypeE, cdyt.OBJECT_EVENT_TACHYON_DELETION) : ubhVar.i.a(messageIdTypeE)).h(new ejvr() { // from class: uas
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    int iA = cdyu.a((cbcw) obj2);
                                    ubh ubhVar2 = ubhVar;
                                    eqng eqngVar3 = eqngVar2;
                                    MessageIdType messageIdType = messageIdTypeE;
                                    if (iA > 0) {
                                        cqbd cqbdVarC = ubh.a.c();
                                        String str = bzmz.t.a;
                                        int iB2 = eqnf.b(eqngVar3.b);
                                        cqbdVarC.A(str, eqnf.a(iB2 != 0 ? iB2 : 1));
                                        cqbdVarC.A(bzmz.v.a, "Delete message from db");
                                        cqbdVarC.A(bzmz.w.a, eqngVar3.c);
                                        cqbdVarC.A(bzmz.c.a, messageIdType);
                                        cqbdVarC.I("ObjectEvent received");
                                        cqbdVarC.r();
                                        ((cpqk) ubhVar2.k.b()).f(messageIdType.b(), eqngVar3.c, avbk.CMS_EVENT_TYPE_DELETE_EVENT_RECEIVED, "success");
                                        return null;
                                    }
                                    cqbd cqbdVarE2 = ubh.a.e();
                                    String str2 = bzmz.t.a;
                                    int iB3 = eqnf.b(eqngVar3.b);
                                    cqbdVarE2.A(str2, eqnf.a(iB3 != 0 ? iB3 : 1));
                                    cqbdVarE2.A(bzmz.v.a, "Failed to delete message from db");
                                    cqbdVarE2.A(bzmz.w.a, eqngVar3.c);
                                    cqbdVarE2.A(bzmz.c.a, messageIdType);
                                    cqbdVarE2.I("ObjectEvent received");
                                    cqbdVarE2.r();
                                    ((cpqk) ubhVar2.k.b()).f(messageIdType.b(), eqngVar3.c, avbk.CMS_EVENT_TYPE_DELETE_EVENT_RECEIVED, "Failed to delete message");
                                    throw new IllegalStateException("Failed to delete message. CmsId: ".concat(String.valueOf(eqngVar3.c)));
                                }
                            }, ubhVar.f);
                        }
                        if (((Boolean) ubhVar.l.c("CmsDeletObjectFromNotificationsTable", new ejxr() { // from class: uba
                            @Override // defpackage.ejxr
                            public final Object get() {
                                eqng eqngVar3 = eqngVar2;
                                final String str = eqngVar3.c;
                                String[] strArr = bmxa.a;
                                bmws bmwsVar = new bmws();
                                bmwsVar.f("deleteObjectFromNotificationsTableIfExists#cmsNotificationsTable");
                                bmwsVar.a(new Function() { // from class: uam
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        bmwz bmwzVar = (bmwz) obj2;
                                        cqce cqceVar = ubh.a;
                                        bmwzVar.b(str);
                                        return bmwzVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                int iD = bmwsVar.d();
                                String[] strArr2 = bmvh.a;
                                bmuz bmuzVar = new bmuz();
                                bmuzVar.f("deleteObjectFromNotificationsTableIfExists#cmsMediaNotificationsTable");
                                bmuzVar.a(new Function() { // from class: uax
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        bmvg bmvgVar = (bmvg) obj2;
                                        cqce cqceVar = ubh.a;
                                        bmvgVar.b(str);
                                        return bmvgVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                if (iD + bmuzVar.d() <= 0) {
                                    return false;
                                }
                                cqbd cqbdVarC = ubh.a.c();
                                String str2 = bzmz.t.a;
                                int iB2 = eqnf.b(eqngVar3.b);
                                if (iB2 == 0) {
                                    iB2 = 1;
                                }
                                ubh ubhVar2 = ubhVar;
                                cqbdVarC.A(str2, eqnf.a(iB2));
                                cqbdVarC.A(bzmz.v.a, "DeleteObjectNotifications");
                                cqbdVarC.A(bzmz.w.a, str);
                                cqbdVarC.A(bzmz.x.a, "Delete unassociated message notifications");
                                cqbdVarC.I("ObjectEvent received");
                                cqbdVarC.r();
                                ((cpqk) ubhVar2.k.b()).f("", eqngVar3.c, avbk.CMS_EVENT_TYPE_DELETE_EVENT_RECEIVED, "CmsId found in notifications table");
                                return true;
                            }
                        })).booleanValue()) {
                            return eijx.e(null);
                        }
                        ((cpqk) ubhVar.k.b()).f("", eqngVar2.c, avbk.CMS_EVENT_TYPE_DELETE_EVENT_RECEIVED, "CmsId not found in Db");
                        cqbd cqbdVarC = ubh.a.c();
                        String str = bzmz.t.a;
                        int iB2 = eqnf.b(eqngVar2.b);
                        if (iB2 == 0) {
                            iB2 = 1;
                        }
                        cqbdVarC.A(str, eqnf.a(iB2));
                        cqbdVarC.A(bzmz.v.a, "Ignore");
                        cqbdVarC.A(bzmz.w.a, eqngVar2.c);
                        cqbdVarC.A(bzmz.x.a, "CmsId not found in DB");
                        cqbdVarC.I("ObjectEvent received");
                        cqbdVarC.r();
                        return eijx.e(null);
                    }
                }, eoscVar);
            }
            cqbd cqbdVarA = a.a();
            String str = bzmz.t.a;
            int iB2 = eqnf.b(eqngVar.b);
            cqbdVarA.A(str, eqnf.a(iB2 != 0 ? iB2 : 1));
            cqbdVarA.A(bzmz.v.a, "Ignore");
            cqbdVarA.A(bzmz.w.a, eqngVar.c);
            cqbdVarA.A(bzmz.x.a, "Not implemented");
            cqbdVarA.I("ObjectEvent received");
            cqbdVarA.r();
            return eijx.e(null);
        }
        int iB3 = eqnf.b(i);
        int i3 = iB3 != 0 ? iB3 : 1;
        boolean zContains = eqngVar.g.contains("key_content@message.cms.google");
        final String strA = eqnf.a(i3);
        if (zContains) {
            cqbd cqbdVarA2 = a.a();
            cqbdVarA2.A(bzmz.t.a, strA);
            cqbdVarA2.A(bzmz.v.a, "Ignore key_content event");
            cqbdVarA2.A(bzmz.w.a, eqngVar.c);
            cqbdVarA2.I("ObjectEvent received");
            cqbdVarA2.r();
            return eijx.e(null);
        }
        if (!this.r.a() || !eqngVar.f.contains("TBDBSD")) {
            final String str2 = eqngVar.c;
            final String str3 = eqngVar.e;
            Callable callable2 = new Callable() { // from class: uay
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    cqce cqceVar = ubh.a;
                    brdr brdrVarD = MessagesTable.d();
                    brdrVarD.A("findMessageInDatabase");
                    final String str4 = str2;
                    final String str5 = str3;
                    brdrVarD.h(new Function() { // from class: uaz
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            brec brecVar = (brec) obj;
                            cqce cqceVar2 = ubh.a;
                            final String str6 = str4;
                            final String str7 = str5;
                            brecVar.b(new Function() { // from class: uav
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    brec brecVar2 = (brec) obj2;
                                    cqce cqceVar3 = ubh.a;
                                    brecVar2.f(str6);
                                    return brecVar2;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }, new Function() { // from class: uaw
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    brec brecVar2 = (brec) obj2;
                                    cqce cqceVar3 = ubh.a;
                                    int iIntValue = MessagesTable.g().intValue();
                                    if (iIntValue < 46010) {
                                        dqru.x("cms_correlation_id", iIntValue);
                                    }
                                    brecVar2.ap(new dqpj("messages.cms_correlation_id", 1, String.valueOf(str7)));
                                    return brecVar2;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            return brecVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    brap brapVar = (brap) brdrVarD.b().p();
                    try {
                        if (brapVar.getCount() <= 1) {
                            if (!brapVar.moveToFirst()) {
                                brapVar.close();
                                return bary.a;
                            }
                            MessageIdType messageIdTypeQ = brapVar.q();
                            brapVar.close();
                            return messageIdTypeQ;
                        }
                        cqbd cqbdVarE2 = ubh.a.e();
                        cqbdVarE2.A(bzmz.w.a, str4);
                        cqbdVarE2.A(bzmz.l.a, str5);
                        cqbdVarE2.I("Find more than one message in Bugle db based on unique ids");
                        cqbdVarE2.r();
                        throw new IllegalStateException();
                    } catch (Throwable th) {
                        try {
                            brapVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            };
            eosc eoscVar2 = this.f;
            return eijx.g(callable2, eoscVar2).i(new eooz() { // from class: ubb
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    MessageIdType messageIdType = (MessageIdType) obj;
                    boolean zC = messageIdType.c();
                    ubh ubhVar = this.a;
                    String str4 = str2;
                    if (zC) {
                        return ubhVar.h.q(str4).h(new ejvr() { // from class: uao
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                return Optional.ofNullable((eqnd) obj2);
                            }
                        }, ubhVar.g);
                    }
                    eqng eqngVar2 = eqngVar;
                    String str5 = strA;
                    cqbd cqbdVarC = ubh.a.c();
                    cqbdVarC.A(bzmz.t.a, str5);
                    cqbdVarC.A(bzmz.v.a, "Ignore");
                    cqbdVarC.A(bzmz.w.a, str4);
                    cqbdVarC.A(bzmz.x.a, "CmsId is in DB");
                    cqbdVarC.I("ObjectEvent received");
                    cqbdVarC.r();
                    ((cpqk) ubhVar.k.b()).f(messageIdType.b(), eqngVar2.c, avbk.CMS_EVENT_TYPE_CREATE_EVENT_RECEIVED, "CmsId is in DB");
                    return eijx.e(Optional.empty());
                }
            }, eoscVar2).i(new eooz() { // from class: ubc
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    String str4;
                    Optional optional = (Optional) obj;
                    if (optional.isEmpty()) {
                        return eijx.e(null);
                    }
                    String str5 = str2;
                    String str6 = strA;
                    final ubh ubhVar = this.a;
                    final eqnd eqndVar = (eqnd) optional.get();
                    if (((Boolean) ubh.d.e()).booleanValue()) {
                        eqml eqmlVar = eqndVar.f;
                        if (eqmlVar == null) {
                            eqmlVar = eqml.a;
                        }
                        eqmw eqmwVar = eqmlVar.f;
                        if (eqmwVar == null) {
                            eqmwVar = eqmw.a;
                        }
                        String str7 = eqmwVar.b;
                        if (!bbcf.c(str7) && ((cpjp) ubhVar.m.b()).e(str7)) {
                            cqbd cqbdVarC = ubh.a.c();
                            cqbdVarC.A(bzmz.t.a, str6);
                            cqbdVarC.A(bzmz.w.a, str5);
                            cqbdVarC.I("Deleting message due to blocked contact");
                            cqbdVarC.r();
                            return ubhVar.h.g(str5, false).h(new ejvr() { // from class: ubg
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    cqce cqceVar = ubh.a;
                                    return null;
                                }
                            }, ubhVar.g);
                        }
                    }
                    eqng eqngVar2 = eqngVar;
                    if (!ejuf.e(eqndVar.d, "inbox")) {
                        cqbd cqbdVarA3 = ubh.a.a();
                        cqbdVarA3.A(bzmz.t.a, str6);
                        cqbdVarA3.A(bzmz.v.a, "Ignore");
                        cqbdVarA3.A(bzmz.w.a, eqngVar2.c);
                        cqbdVarA3.A(bzmz.x.a, "Object outside desired folder");
                        cqbdVarA3.A(bzmz.y.a, eqndVar.d);
                        cqbdVarA3.I("ObjectEvent received");
                        cqbdVarA3.r();
                        ((cpqk) ubhVar.k.b()).f("", eqngVar2.c, avbk.CMS_EVENT_TYPE_CREATE_EVENT_RECEIVED, "Object outside desired folder");
                        return eijx.e(null);
                    }
                    if (!toc.a(eqndVar)) {
                        cqbd cqbdVarC2 = ubh.a.c();
                        cqbdVarC2.A(bzmz.t.a, str6);
                        cqbdVarC2.A(bzmz.v.a, "Create object in db");
                        cqbdVarC2.A(bzmz.w.a, str5);
                        cqbdVarC2.I("ObjectEvent received");
                        cqbdVarC2.r();
                        ejwl.b(!eqndVar.m.isEmpty(), "Conversation id not expected to be empty");
                        return ubhVar.j.a(eqndVar.m, str6).i(new eooz() { // from class: uan
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                return ubhVar.p.a(eqndVar);
                            }
                        }, ubhVar.f);
                    }
                    cqbd cqbdVarC3 = ubh.a.c();
                    cqbdVarC3.A(bzmz.t.a, str6);
                    cqbdVarC3.A(bzmz.v.a, "Inbound message: Store notification in db");
                    cqbdVarC3.A(bzmz.w.a, str5);
                    cqbdVarC3.I("ObjectEvent received");
                    cqbdVarC3.r();
                    final String str8 = eqndVar.c;
                    int iB4 = eqnf.b(eqngVar2.b);
                    if (iB4 == 0) {
                        iB4 = 1;
                    }
                    final String strA2 = eqnf.a(iB4);
                    try {
                        final eplf eplfVarA = ubhVar.e.a(eqndVar);
                        eplh eplhVarB = eplh.b(eplfVarA.j);
                        if (eplhVarB == null) {
                            eplhVarB = eplh.UNRECOGNIZED;
                        }
                        int iOrdinal = eplhVarB.ordinal();
                        if (iOrdinal == 1) {
                            Optional optionalFindFirst = Collection.EL.stream(eplfVarA.p).filter(new Predicate() { // from class: uaq
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
                                public final boolean test(Object obj2) {
                                    return ((eplj) obj2).b == 3;
                                }
                            }).findFirst();
                            if (optionalFindFirst.isEmpty()) {
                                cqbd cqbdVarE2 = ubh.a.e();
                                cqbdVarE2.A(bzmz.t.a, strA2);
                                cqbdVarE2.A(bzmz.w.a, str8);
                                cqbdVarE2.I("Ignoring ObjectEvent - SMS is missing TextMessagePartModel");
                                cqbdVarE2.r();
                                ((cpqk) ubhVar.k.b()).f("", str8, avbk.CMS_EVENT_TYPE_CREATE_EVENT_RECEIVED, "SMS is missing TextMessagePartModel");
                            } else {
                                eplj epljVar = (eplj) optionalFindFirst.get();
                                str4 = (epljVar.b == 3 ? (eplr) epljVar.c : eplr.a).c;
                                final String str9 = str4;
                                ubhVar.l.d("ObjectEventHandler#storeNotificationInDb", new Runnable() { // from class: uar
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        cqce cqceVar = ubh.a;
                                        String[] strArr = bmxa.a;
                                        bmvo bmvoVar = new bmvo();
                                        eqnd eqndVar2 = eqndVar;
                                        bmvoVar.c(eqndVar2.c);
                                        bmvoVar.b(eqndVar2.k);
                                        bmvoVar.d(eqndVar2.j);
                                        eqml eqmlVar2 = eqndVar2.f;
                                        if (eqmlVar2 == null) {
                                            eqmlVar2 = eqml.a;
                                        }
                                        eqmw eqmwVar2 = eqmlVar2.f;
                                        if (eqmwVar2 == null) {
                                            eqmwVar2 = eqmw.a;
                                        }
                                        bmvoVar.f(eqmwVar2.b);
                                        eqml eqmlVar3 = eqndVar2.f;
                                        if (eqmlVar3 == null) {
                                            eqmlVar3 = eqml.a;
                                        }
                                        String str10 = strA2;
                                        final String str11 = str8;
                                        eplf eplfVar = eplfVarA;
                                        String str12 = str9;
                                        bmvoVar.i(((eqmw) eqmlVar3.g.get(0)).b);
                                        bmvoVar.e(str12);
                                        bmvoVar.h(eplfVar.h);
                                        bmvoVar.g(eplfVar.h);
                                        bmvl bmvlVarA = bmvoVar.a();
                                        final dqsy dqsyVarB = bmxa.b();
                                        dqru.b(bmxa.b(), "cms_notifications", bmvlVarA, new Function() { // from class: bmvj
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo536andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj2) {
                                                return Long.valueOf(dqsyVarB.O("cms_notifications", (dqst) obj2));
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        }, new Consumer() { // from class: bmvk
                                            @Override // java.util.function.Consumer
                                            /* renamed from: accept */
                                            public final void z(Object obj2) {
                                            }

                                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                return Consumer$CC.$default$andThen(this, consumer);
                                            }
                                        });
                                        evtg evtgVar = eplfVar.p;
                                        final ArrayList arrayList = new ArrayList();
                                        if (evtgVar.isEmpty()) {
                                            cqbd cqbdVarE3 = ubh.a.e();
                                            cqbdVarE3.A(bzmz.t.a, str10);
                                            cqbdVarE3.A(bzmz.v.a, "Inbound message: investigate parts");
                                            cqbdVarE3.A(bzmz.w.a, str11);
                                            cqbdVarE3.I("Message does not have parts");
                                            cqbdVarE3.r();
                                        } else {
                                            Collection.EL.stream(evtgVar).filter(new Predicate() { // from class: ube
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
                                                public final boolean test(Object obj2) {
                                                    cqce cqceVar2 = ubh.a;
                                                    eplk eplkVarB = eplk.b(((eplj) obj2).e);
                                                    if (eplkVarB == null) {
                                                        eplkVarB = eplk.UNRECOGNIZED;
                                                    }
                                                    return eplkVarB == eplk.ATTACHMENT || eplkVarB == eplk.AUDIO || eplkVarB == eplk.IMAGE || eplkVarB == eplk.VIDEO || eplkVarB == eplk.RICH_CARD;
                                                }
                                            }).forEach(new Consumer() { // from class: ubf
                                                @Override // java.util.function.Consumer
                                                /* renamed from: accept */
                                                public final void z(Object obj2) {
                                                    eplj epljVar2 = (eplj) obj2;
                                                    cqce cqceVar2 = ubh.a;
                                                    epkm epkmVar = epljVar2.b == 4 ? (epkm) epljVar2.c : epkm.a;
                                                    String str13 = str11;
                                                    List list = arrayList;
                                                    String str14 = epkmVar.d;
                                                    if (!TextUtils.isEmpty(str14)) {
                                                        list.add(ubh.b(str14, str13, cpya.FULL_SIZE));
                                                    }
                                                    String str15 = epkmVar.g;
                                                    if (TextUtils.isEmpty(str15)) {
                                                        return;
                                                    }
                                                    list.add(ubh.b(str15, str13, cpya.COMPRESSED));
                                                }

                                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                    return Consumer$CC.$default$andThen(this, consumer);
                                                }
                                            });
                                            if (!arrayList.isEmpty()) {
                                                cqbd cqbdVarC4 = ubh.a.c();
                                                cqbdVarC4.A(bzmz.t.a, str10);
                                                cqbdVarC4.A(bzmz.v.a, "Store media notifications in db");
                                                cqbdVarC4.A(bzmz.w.a, str11);
                                                cqbdVarC4.y(ubh.c.a, arrayList.size());
                                                cqbdVarC4.r();
                                            }
                                        }
                                        Collection.EL.stream(arrayList).forEach(new Consumer() { // from class: uap
                                            @Override // java.util.function.Consumer
                                            /* renamed from: accept */
                                            public final void z(Object obj2) {
                                                final bmue bmueVar = (bmue) obj2;
                                                final dqsy dqsyVarA = bmvh.a();
                                                dqru.b(bmvh.a(), "cms_media_notifications", bmueVar, new Function() { // from class: bmuc
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj3) {
                                                        return Long.valueOf(dqsyVarA.O("cms_media_notifications", (dqst) obj3));
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                }, new Consumer() { // from class: bmud
                                                    @Override // java.util.function.Consumer
                                                    /* renamed from: accept */
                                                    public final void z(Object obj3) {
                                                        Long l = (Long) obj3;
                                                        if (l.longValue() >= 0) {
                                                            bmue bmueVar2 = bmueVar;
                                                            bmueVar2.a = l.longValue();
                                                            bmueVar2.fN(0);
                                                        }
                                                    }

                                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                        return Consumer$CC.$default$andThen(this, consumer);
                                                    }
                                                });
                                            }

                                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                return Consumer$CC.$default$andThen(this, consumer);
                                            }
                                        });
                                    }
                                });
                                ((cpqk) ubhVar.k.b()).f("", eqngVar2.c, avbk.CMS_EVENT_TYPE_CREATE_EVENT_RECEIVED, "Stored notification in DB");
                            }
                        } else if (iOrdinal != 2) {
                            cqbd cqbdVarC4 = ubh.a.c();
                            cqbdVarC4.A(bzmz.t.a, strA2);
                            cqbdVarC4.A(bzmz.v.a, "Ignore");
                            cqbdVarC4.A(bzmz.w.a, str8);
                            cqbdVarC4.A(bzmz.x.a, "Unknown MessageType");
                            String str10 = ubh.b.a;
                            eplh eplhVarB2 = eplh.b(eplfVarA.j);
                            if (eplhVarB2 == null) {
                                eplhVarB2 = eplh.UNRECOGNIZED;
                            }
                            cqbdVarC4.A(str10, eplhVarB2);
                            cqbdVarC4.I("ObjectEvent received");
                            cqbdVarC4.r();
                            ((cpqk) ubhVar.k.b()).f("", str8, avbk.CMS_EVENT_TYPE_CREATE_EVENT_RECEIVED, "Unknown message type");
                        } else {
                            eplp eplpVar = eplfVarA.s;
                            if (eplpVar == null) {
                                eplpVar = eplp.a;
                            }
                            if (eplpVar.b.isEmpty()) {
                                str4 = eqndVar.l;
                            } else {
                                eplp eplpVar2 = eplfVarA.s;
                                if (eplpVar2 == null) {
                                    eplpVar2 = eplp.a;
                                }
                                str4 = eplpVar2.b;
                            }
                            final String str92 = str4;
                            ubhVar.l.d("ObjectEventHandler#storeNotificationInDb", new Runnable() { // from class: uar
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    cqce cqceVar = ubh.a;
                                    String[] strArr = bmxa.a;
                                    bmvo bmvoVar = new bmvo();
                                    eqnd eqndVar2 = eqndVar;
                                    bmvoVar.c(eqndVar2.c);
                                    bmvoVar.b(eqndVar2.k);
                                    bmvoVar.d(eqndVar2.j);
                                    eqml eqmlVar2 = eqndVar2.f;
                                    if (eqmlVar2 == null) {
                                        eqmlVar2 = eqml.a;
                                    }
                                    eqmw eqmwVar2 = eqmlVar2.f;
                                    if (eqmwVar2 == null) {
                                        eqmwVar2 = eqmw.a;
                                    }
                                    bmvoVar.f(eqmwVar2.b);
                                    eqml eqmlVar3 = eqndVar2.f;
                                    if (eqmlVar3 == null) {
                                        eqmlVar3 = eqml.a;
                                    }
                                    String str102 = strA2;
                                    final String str11 = str8;
                                    eplf eplfVar = eplfVarA;
                                    String str12 = str92;
                                    bmvoVar.i(((eqmw) eqmlVar3.g.get(0)).b);
                                    bmvoVar.e(str12);
                                    bmvoVar.h(eplfVar.h);
                                    bmvoVar.g(eplfVar.h);
                                    bmvl bmvlVarA = bmvoVar.a();
                                    final dqsy dqsyVarB = bmxa.b();
                                    dqru.b(bmxa.b(), "cms_notifications", bmvlVarA, new Function() { // from class: bmvj
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo536andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj2) {
                                            return Long.valueOf(dqsyVarB.O("cms_notifications", (dqst) obj2));
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    }, new Consumer() { // from class: bmvk
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void z(Object obj2) {
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                    evtg evtgVar = eplfVar.p;
                                    final List arrayList = new ArrayList();
                                    if (evtgVar.isEmpty()) {
                                        cqbd cqbdVarE3 = ubh.a.e();
                                        cqbdVarE3.A(bzmz.t.a, str102);
                                        cqbdVarE3.A(bzmz.v.a, "Inbound message: investigate parts");
                                        cqbdVarE3.A(bzmz.w.a, str11);
                                        cqbdVarE3.I("Message does not have parts");
                                        cqbdVarE3.r();
                                    } else {
                                        Collection.EL.stream(evtgVar).filter(new Predicate() { // from class: ube
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
                                            public final boolean test(Object obj2) {
                                                cqce cqceVar2 = ubh.a;
                                                eplk eplkVarB = eplk.b(((eplj) obj2).e);
                                                if (eplkVarB == null) {
                                                    eplkVarB = eplk.UNRECOGNIZED;
                                                }
                                                return eplkVarB == eplk.ATTACHMENT || eplkVarB == eplk.AUDIO || eplkVarB == eplk.IMAGE || eplkVarB == eplk.VIDEO || eplkVarB == eplk.RICH_CARD;
                                            }
                                        }).forEach(new Consumer() { // from class: ubf
                                            @Override // java.util.function.Consumer
                                            /* renamed from: accept */
                                            public final void z(Object obj2) {
                                                eplj epljVar2 = (eplj) obj2;
                                                cqce cqceVar2 = ubh.a;
                                                epkm epkmVar = epljVar2.b == 4 ? (epkm) epljVar2.c : epkm.a;
                                                String str13 = str11;
                                                List list = arrayList;
                                                String str14 = epkmVar.d;
                                                if (!TextUtils.isEmpty(str14)) {
                                                    list.add(ubh.b(str14, str13, cpya.FULL_SIZE));
                                                }
                                                String str15 = epkmVar.g;
                                                if (TextUtils.isEmpty(str15)) {
                                                    return;
                                                }
                                                list.add(ubh.b(str15, str13, cpya.COMPRESSED));
                                            }

                                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                return Consumer$CC.$default$andThen(this, consumer);
                                            }
                                        });
                                        if (!arrayList.isEmpty()) {
                                            cqbd cqbdVarC42 = ubh.a.c();
                                            cqbdVarC42.A(bzmz.t.a, str102);
                                            cqbdVarC42.A(bzmz.v.a, "Store media notifications in db");
                                            cqbdVarC42.A(bzmz.w.a, str11);
                                            cqbdVarC42.y(ubh.c.a, arrayList.size());
                                            cqbdVarC42.r();
                                        }
                                    }
                                    Collection.EL.stream(arrayList).forEach(new Consumer() { // from class: uap
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void z(Object obj2) {
                                            final bmue bmueVar = (bmue) obj2;
                                            final dqsy dqsyVarA = bmvh.a();
                                            dqru.b(bmvh.a(), "cms_media_notifications", bmueVar, new Function() { // from class: bmuc
                                                @Override // java.util.function.Function
                                                /* renamed from: andThen */
                                                public final /* synthetic */ Function mo536andThen(Function function) {
                                                    return Function$CC.$default$andThen(this, function);
                                                }

                                                @Override // java.util.function.Function
                                                public final Object apply(Object obj3) {
                                                    return Long.valueOf(dqsyVarA.O("cms_media_notifications", (dqst) obj3));
                                                }

                                                public final /* synthetic */ Function compose(Function function) {
                                                    return Function$CC.$default$compose(this, function);
                                                }
                                            }, new Consumer() { // from class: bmud
                                                @Override // java.util.function.Consumer
                                                /* renamed from: accept */
                                                public final void z(Object obj3) {
                                                    Long l = (Long) obj3;
                                                    if (l.longValue() >= 0) {
                                                        bmue bmueVar2 = bmueVar;
                                                        bmueVar2.a = l.longValue();
                                                        bmueVar2.fN(0);
                                                    }
                                                }

                                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                    return Consumer$CC.$default$andThen(this, consumer);
                                                }
                                            });
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                }
                            });
                            ((cpqk) ubhVar.k.b()).f("", eqngVar2.c, avbk.CMS_EVENT_TYPE_CREATE_EVENT_RECEIVED, "Stored notification in DB");
                        }
                    } catch (evtj e) {
                        cqbd cqbdVarE3 = ubh.a.e();
                        cqbdVarE3.A(bzmz.t.a, strA2);
                        cqbdVarE3.A(bzmz.w.a, str8);
                        cqbdVarE3.I("Error parsing Cms Object payload");
                        cqbdVarE3.s(e);
                        ((cpqk) ubhVar.k.b()).f("", str8, avbk.CMS_EVENT_TYPE_CREATE_EVENT_RECEIVED, "Error parsing Cms Object payload");
                    }
                    return eijx.e(null);
                }
            }, eoscVar2).f(Throwable.class, new eooz() { // from class: ubd
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    Throwable th = (Throwable) obj;
                    boolean zEquals = Status.c(th).getCode().equals(Status.Code.NOT_FOUND);
                    ubh ubhVar = this.a;
                    String str4 = strA;
                    String str5 = str2;
                    if (zEquals) {
                        cqbd cqbdVarC = ubh.a.c();
                        cqbdVarC.A(bzmz.t.a, str4);
                        cqbdVarC.A(bzmz.v.a, "Ignore: Object not found in CMS");
                        cqbdVarC.A(bzmz.w.a, str5);
                        cqbdVarC.I("ObjectEvent received");
                        cqbdVarC.r();
                        ((cpqk) ubhVar.k.b()).f("", str5, avbk.CMS_EVENT_TYPE_CREATE_EVENT_RECEIVED, "Object not found in CMS");
                        return eijx.e(null);
                    }
                    cqbd cqbdVarE2 = ubh.a.e();
                    cqbdVarE2.A(bzmz.t.a, str4);
                    cqbdVarE2.A(bzmz.v.a, "Exception while processing event");
                    cqbdVarE2.A(bzmz.w.a, str5);
                    cqbdVarE2.I("ObjectEvent received");
                    cqbdVarE2.s(th);
                    ((cpqk) ubhVar.k.b()).f("", str5, avbk.CMS_EVENT_TYPE_CREATE_EVENT_RECEIVED, th.toString());
                    return eijx.d(th);
                }
            }, eoqg.a);
        }
        cqbd cqbdVarA3 = a.a();
        cqbdVarA3.A(bzmz.w.a, eqngVar.c);
        cqbdVarA3.I("Delivering message labeled with TO_BE_DELIVERED_BY_SIM_DEVICE_LABEL");
        cqbdVarA3.r();
        capx capxVar = this.q;
        eqngVar.getClass();
        return auvw.c(capxVar.c, fcyi.a, fdjz.a, new capw(capxVar, eqngVar, null));
    }
}
