package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.CheckActiveDesktopIsAliveAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.ains;
import defpackage.axmk;
import defpackage.ayov;
import defpackage.boyp;
import defpackage.bozw;
import defpackage.bpab;
import defpackage.bvfd;
import defpackage.bvfk;
import defpackage.bvio;
import defpackage.bvis;
import defpackage.bvit;
import defpackage.bvix;
import defpackage.bvkr;
import defpackage.cdio;
import defpackage.cema;
import defpackage.cemk;
import defpackage.cfef;
import defpackage.cfeg;
import defpackage.cfeh;
import defpackage.cogw;
import defpackage.cqce;
import defpackage.cqob;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ejvr;
import defpackage.elgm;
import defpackage.eoqg;
import defpackage.eosc;
import defpackage.eovo;
import defpackage.eozc;
import defpackage.eoze;
import defpackage.epby;
import defpackage.evrr;
import defpackage.evsn;
import defpackage.evtj;
import defpackage.eygg;
import defpackage.ezjh;
import defpackage.ezol;
import defpackage.fcsu;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class CheckActiveDesktopIsAliveAsyncAction extends Action<Void> {
    public final ayov d;
    public final bvkr e;
    public final ains f;
    public final fcsu g;
    private final eygg h;
    private final fcsu i;
    private final fcsu j;
    private final fcsu k;
    private final eosc l;
    private final eosc m;
    private final cogw n;
    private final cfeh o;
    public static final cqce a = cqce.g("BugleAction", "CheckActiveDesktopIsAliveAsyncAction");
    public static final long b = TimeUnit.MINUTES.toMillis(((Integer) bvfd.l.e()).intValue());
    static final long c = TimeUnit.HOURS.toMillis(((Integer) bvfd.k.e()).intValue());
    public static final Parcelable.Creator<Action<Void>> CREATOR = new axmk();

    /* compiled from: PG */
    public interface a {
        ayov aP();
    }

    public CheckActiveDesktopIsAliveAsyncAction(ayov ayovVar, bvkr bvkrVar, eygg eyggVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, eosc eoscVar, eosc eoscVar2, cogw cogwVar, ains ainsVar, cfeh cfehVar, fcsu fcsuVar4, Parcel parcel) {
        super(parcel, elgm.CHECK_ACTIVE_DESKTOP_IS_ALIVE_ACTION);
        this.d = ayovVar;
        this.e = bvkrVar;
        this.h = eyggVar;
        this.i = fcsuVar;
        this.j = fcsuVar2;
        this.k = fcsuVar3;
        this.l = eoscVar;
        this.m = eoscVar2;
        this.n = cogwVar;
        this.f = ainsVar;
        this.o = cfehVar;
        this.g = fcsuVar4;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("CheckActiveDesktopIsAliveAsyncAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.CheckActiveDesktopIsAlive.ExecuteAction.Latency";
    }

    public final eiju d(byte[] bArr, String str, bvix bvixVar) {
        final ezol ezolVar;
        String strE;
        bvkr bvkrVar;
        long epochMilli;
        cfef cfefVarC;
        try {
            if (((cdio) this.g.b()).a()) {
                ezolVar = bvixVar.c().d;
                strE = bvixVar.e();
            } else {
                ezolVar = (ezol) evsn.parseFrom(ezol.a, bArr, evrr.a());
                strE = str;
            }
            bvkrVar = this.e;
        } catch (evtj unused) {
        }
        if (!bvkrVar.y(ezolVar)) {
            ((bvit) this.h.b()).o(ezolVar, bvis.SESSION_TERMINATED);
            return eijx.e(null);
        }
        eieu eieuVarK = eiiy.k("DittoDesktops#getMillisSinceLastDesktopConnection");
        try {
            bozw bozwVarA = bpab.a();
            bozwVarA.A("getMillisSinceLastDesktopConnection");
            bozwVarA.f(new Function() { // from class: bvjw
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bpaa bpaaVar = (bpaa) obj;
                    cqce cqceVar = bvkr.a;
                    bpaaVar.b(ezolVar.c);
                    return bpaaVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bozwVarA.e(new Function() { // from class: bvjx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cqce cqceVar = bvkr.a;
                    return ((boyn) obj).c;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bozwVarA.y(1);
            boyp boypVar = (boyp) bozwVarA.b().p();
            try {
                if (boypVar.moveToFirst()) {
                    epochMilli = bvkrVar.e.f().toEpochMilli() - boypVar.e();
                    boypVar.close();
                    eieuVarK.close();
                } else {
                    boypVar.close();
                    eieuVarK.close();
                    epochMilli = -1;
                }
                bozw bozwVarA2 = bpab.a();
                bozwVarA2.A("getDesktopChallengeTime");
                bozwVarA2.f(new Function() { // from class: bvjk
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bpaa bpaaVar = (bpaa) obj;
                        cqce cqceVar = bvkr.a;
                        bpaaVar.b(ezolVar.c);
                        return bpaaVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bozwVarA2.e(new Function() { // from class: bvjv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        cqce cqceVar = bvkr.a;
                        return ((boyn) obj).d;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bozwVarA2.y(1);
                boyp boypVar2 = (boyp) bozwVarA2.b().p();
                try {
                    long jF = boypVar2.moveToFirst() ? boypVar2.f() : -1L;
                    boypVar2.close();
                    if (epochMilli > c) {
                        if (jF < 0) {
                            fcsu fcsuVar = this.g;
                            if (((cdio) fcsuVar.b()).a()) {
                                cfefVarC = this.o.a(bvixVar.c(), epby.GET_UPDATES);
                                cfefVarC.c = strE;
                                eozc eozcVar = (eozc) eoze.a.createBuilder();
                                eovo eovoVar = eovo.a;
                                eozcVar.copyOnWrite();
                                eoze eozeVar = (eoze) eozcVar.instance;
                                eovoVar.getClass();
                                eozeVar.c = eovoVar;
                                eozeVar.b = 7;
                                cfefVarC.b(eozcVar.build());
                            } else {
                                cfefVarC = this.o.c(ezolVar, Optional.empty(), epby.GET_UPDATES);
                                cfefVarC.c = str;
                                eozc eozcVar2 = (eozc) eoze.a.createBuilder();
                                eovo eovoVar2 = eovo.a;
                                eozcVar2.copyOnWrite();
                                eoze eozeVar2 = (eoze) eozcVar2.instance;
                                eovoVar2.getClass();
                                eozeVar2.c = eovoVar2;
                                eozeVar2.b = 7;
                                cfefVarC.b(eozcVar2.build());
                            }
                            cfefVarC.i = ezjh.USER;
                            cfeg cfegVarA = cfefVarC.a();
                            ((bvio) this.i.b()).f(strE, ezolVar.c, epby.GET_UPDATES.a(), 7, cfegVarA.c);
                            eiju eijuVarA = ((cdio) fcsuVar.b()).a() ? ((cemk) this.k.b()).a(cfegVarA) : ((cema) this.j.b()).a(cfegVarA);
                            cfegVarA.q(eijuVarA);
                            eijuVarA.k(new cqob(new Consumer() { // from class: axmd
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj) {
                                    CheckActiveDesktopIsAliveAsyncAction checkActiveDesktopIsAliveAsyncAction = this.a;
                                    checkActiveDesktopIsAliveAsyncAction.f.e("Bugle.Ditto.BrowserChallenge.Outcome", 1);
                                    String[] strArr = bpab.a;
                                    bozy bozyVar = new bozy();
                                    bozyVar.ap("updateDesktopChallengeTime");
                                    bozyVar.d(checkActiveDesktopIsAliveAsyncAction.e.e.f().toEpochMilli());
                                    final ezol ezolVar2 = ezolVar;
                                    bozyVar.f(new Function() { // from class: bvjh
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo536andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj2) {
                                            bpaa bpaaVar = (bpaa) obj2;
                                            cqce cqceVar = bvkr.a;
                                            bpaaVar.b(ezolVar2.c);
                                            return bpaaVar;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    bozyVar.a().e();
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            }, new Consumer() { // from class: axme
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj) {
                                    this.a.f.e("Bugle.Ditto.BrowserChallenge.Outcome", 2);
                                    CheckActiveDesktopIsAliveAsyncAction.a.s("Error sending a browser challenge.", (Throwable) obj);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            }), this.l);
                            return eijuVarA.h(new ejvr() { // from class: axmf
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj) {
                                    cqce cqceVar = CheckActiveDesktopIsAliveAsyncAction.a;
                                    return null;
                                }
                            }, eoqg.a);
                        }
                        if (this.n.f().toEpochMilli() - jF > b) {
                            ((bvit) this.h.b()).o(ezolVar, bvis.SESSION_TIMEOUT);
                        }
                    }
                    return eijx.e(null);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eiju e() {
        ezol ezolVar;
        Boolean bool = (Boolean) bvfk.a.e();
        if (bool.booleanValue()) {
            this.f.e("Bugle.Ditto.Action.Success.Metrics.Counts", 11);
        }
        byte[] bArrA = this.v.A("desktop_id_key");
        if (bArrA != null) {
            try {
                ezolVar = (ezol) evsn.parseFrom(ezol.a, bArrA, evrr.a());
            } catch (evtj unused) {
                ezolVar = null;
            }
            if (ezolVar != null && !this.e.y(ezolVar)) {
                ((bvit) this.h.b()).o(ezolVar, bvis.SESSION_TERMINATED);
            }
        }
        eiju eijuVarJ = this.e.j(new Function() { // from class: axmi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvix bvixVar = (bvix) obj;
                if (bvixVar.f() || bvixVar.b() == bvdm.SATELLITE) {
                    return eijx.e(null);
                }
                CheckActiveDesktopIsAliveAsyncAction checkActiveDesktopIsAliveAsyncAction = this.a;
                return ((cdio) checkActiveDesktopIsAliveAsyncAction.g.b()).a() ? checkActiveDesktopIsAliveAsyncAction.d(bvixVar.c().d.toByteArray(), bvixVar.e(), bvixVar) : checkActiveDesktopIsAliveAsyncAction.d(bvixVar.d().toByteArray(), bvixVar.e(), bvixVar);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ejvr ejvrVar = new ejvr() { // from class: axmj
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                List list = (List) obj;
                if (list != null && !list.isEmpty()) {
                    this.a.d.a(null, null).x(117, CheckActiveDesktopIsAliveAsyncAction.b);
                }
                return null;
            }
        };
        eosc eoscVar = this.m;
        eiju eijuVarE = eijuVarJ.h(ejvrVar, eoscVar).e(Throwable.class, new ejvr() { // from class: axmg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                CheckActiveDesktopIsAliveAsyncAction.a.s("Action failed.", (Throwable) obj);
                return null;
            }
        }, eoqg.a);
        return bool.booleanValue() ? eijuVarE.h(new ejvr() { // from class: axmh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                this.a.f.e("Bugle.Ditto.Action.Success.Metrics.Counts", 12);
                return null;
            }
        }, eoscVar) : eijuVarE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public CheckActiveDesktopIsAliveAsyncAction(ayov ayovVar, bvkr bvkrVar, eygg eyggVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, eosc eoscVar, eosc eoscVar2, cogw cogwVar, ains ainsVar, cfeh cfehVar, fcsu fcsuVar4, ezol ezolVar, String str) {
        super(elgm.CHECK_ACTIVE_DESKTOP_IS_ALIVE_ACTION);
        this.d = ayovVar;
        this.e = bvkrVar;
        this.h = eyggVar;
        this.i = fcsuVar;
        this.j = fcsuVar2;
        this.k = fcsuVar3;
        this.l = eoscVar;
        this.m = eoscVar2;
        this.n = cogwVar;
        this.f = ainsVar;
        this.o = cfehVar;
        this.g = fcsuVar4;
        if (ezolVar != null) {
            this.v.q("desktop_id_key", ezolVar.toByteArray());
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.v.v("request_id_key", str);
    }
}
