package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessUserAlertAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ains;
import defpackage.axyy;
import defpackage.aymo;
import defpackage.aypz;
import defpackage.bvfk;
import defpackage.bvkr;
import defpackage.cema;
import defpackage.cfeh;
import defpackage.cffv;
import defpackage.cffw;
import defpackage.cqce;
import defpackage.crqv;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ejvr;
import defpackage.elgm;
import defpackage.eooz;
import defpackage.eoqg;
import defpackage.eosc;
import defpackage.epfy;
import defpackage.evrr;
import defpackage.evsn;
import defpackage.evtj;
import defpackage.ezjn;
import defpackage.ezmb;
import defpackage.ezol;
import defpackage.fcsu;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ProcessUserAlertAsyncAction extends Action<ezjn> {
    public final fcsu b;
    public final bvkr c;
    public final ains d;
    public final fcsu e;
    public final cfeh f;
    private final fcsu g;
    private final eosc h;
    private final eosc i;
    private final cffw j;
    public static final cqce a = cqce.g("BugleNetwork", "ProcessUserAlertAsyncAction");
    public static final Parcelable.Creator<ProcessUserAlertAsyncAction> CREATOR = new axyy();

    /* compiled from: PG */
    public interface a {
        aypz bi();
    }

    public ProcessUserAlertAsyncAction(fcsu fcsuVar, fcsu fcsuVar2, bvkr bvkrVar, ains ainsVar, eosc eoscVar, eosc eoscVar2, cffw cffwVar, cfeh cfehVar, fcsu fcsuVar3, int i, ezol ezolVar, String str) {
        super(elgm.PROCESS_USER_ALERT_ACTION);
        this.g = fcsuVar;
        this.b = fcsuVar2;
        this.c = bvkrVar;
        this.d = ainsVar;
        this.i = eoscVar;
        this.h = eoscVar2;
        this.j = cffwVar;
        this.f = cfehVar;
        this.e = fcsuVar3;
        this.v.r("alert_type_key", i);
        this.v.q("desktop_id_key", ezolVar.toByteArray());
        this.v.v("request_id_key", str);
        this.v.p("skip_revoke_key", false);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("ProcessUserAlertAsyncAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        v();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessUserAlert.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eiju e() {
        v();
        return eijx.e(null);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fP() {
        eiju eijuVarH;
        Boolean bool = (Boolean) bvfk.a.e();
        if (bool.booleanValue()) {
            this.d.e("Bugle.Ditto.Action.Success.Metrics.Counts", 19);
        }
        eieu eieuVarK = eiiy.k("ProcessUserAlertAsyncAction.executeAction");
        try {
            aymo aymoVar = this.v;
            final epfy epfyVarB = epfy.b(aymoVar.a("alert_type_key"));
            if (epfyVarB == epfy.BROWSER_ACTIVE || epfyVarB == epfy.BROWSER_INACTIVE || epfyVarB == epfy.BROWSER_INACTIVE_FROM_INACTIVITY || epfyVarB == epfy.BROWSER_INACTIVE_FROM_TIMEOUT) {
                byte[] bArrA = aymoVar.A("desktop_id_key");
                String strL = aymoVar.l("request_id_key");
                if (bArrA == null || strL == null) {
                    a.n("Desktop ID or request ID null, skipping UserAlert.");
                    eijx.e(null);
                } else {
                    try {
                        eijuVarH = h((ezol) evsn.parseFrom(ezol.a, bArrA, evrr.a()), strL, epfyVarB, Optional.empty()).h(new ejvr() { // from class: axys
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                cqce cqceVar = ProcessUserAlertAsyncAction.a;
                                return null;
                            }
                        }, eoqg.a);
                    } catch (evtj e) {
                        a.o("Desktop ID invalid.", e);
                        eijx.e(null);
                    }
                }
                eieuVarK.close();
                return null;
            }
            eijuVarH = this.c.j(new Function() { // from class: axyw
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bvix bvixVar = (bvix) obj;
                    return this.a.h(bvixVar.d(), bvixVar.e(), epfyVarB, Optional.of(bvixVar));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).h(new ejvr() { // from class: axyx
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    cqce cqceVar = ProcessUserAlertAsyncAction.a;
                    return null;
                }
            }, eoqg.a);
            eiju eijuVarE = eijuVarH.e(Throwable.class, new ejvr() { // from class: axyt
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    ProcessUserAlertAsyncAction.a.s("Action failed.", (Throwable) obj);
                    return null;
                }
            }, eoqg.a);
            if (bool.booleanValue()) {
                eijuVarE.h(new ejvr() { // from class: axyu
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ezjn ezjnVar = (ezjn) obj;
                        this.a.d.e("Bugle.Ditto.Action.Success.Metrics.Counts", 20);
                        return ezjnVar;
                    }
                }, this.i);
            }
            eieuVarK.close();
            return null;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final eiju h(final ezol ezolVar, final String str, final epfy epfyVar, final Optional optional) {
        eiju eijuVarE;
        aymo aymoVar = this.v;
        int iA = aymoVar.a("alert_type_key");
        if ((iA == 1 || iA == 7) && !aymoVar.y("skip_revoke_key")) {
            cqce cqceVar = a;
            cqceVar.q("Revoking messages by this sender.");
            cffw cffwVar = this.j;
            cema cemaVar = (cema) cffwVar.a.b();
            cemaVar.getClass();
            crqv crqvVar = (crqv) cffwVar.b.b();
            crqvVar.getClass();
            ezolVar.getClass();
            cffv cffvVar = new cffv(cemaVar, crqvVar, ezolVar);
            if (cffvVar.a > 0) {
                cqceVar.q("Revoking starts.");
                eijuVarE = ((cema) this.g.b()).a(cffvVar);
            } else {
                eijuVarE = eijx.e(ezmb.a);
            }
        } else {
            eijuVarE = eijx.e(ezmb.a);
        }
        return eijuVarE.i(new eooz() { // from class: axyv
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cfef cfefVarC;
                epfz epfzVar = (epfz) epga.a.createBuilder();
                epfzVar.copyOnWrite();
                epga epgaVar = (epga) epfzVar.instance;
                epfy epfyVar2 = epfyVar;
                epgaVar.b = epfyVar2.a();
                epga epgaVar2 = (epga) epfzVar.build();
                cqce cqceVar2 = ProcessUserAlertAsyncAction.a;
                cqbd cqbdVarC = cqceVar2.c();
                cqbdVarC.I("Sending user alert, type:");
                epfy epfyVarB = epfy.b(epgaVar2.b);
                if (epfyVarB == null) {
                    epfyVarB = epfy.UNRECOGNIZED;
                }
                String str2 = str;
                ezol ezolVar2 = ezolVar;
                ProcessUserAlertAsyncAction processUserAlertAsyncAction = this.a;
                cqbdVarC.I(epfyVarB);
                cqbdVarC.r();
                if (((cdio) processUserAlertAsyncAction.e.b()).a()) {
                    Optional optional2 = optional;
                    Object objF = optional2.isPresent() ? optional2.get() : processUserAlertAsyncAction.c.f(ezolVar2.c);
                    if (objF == null) {
                        cqceVar2.r("Paired desktop not found, skip send user alert");
                        return eijx.d(new UnsupportedOperationException("Paired desktop not found, skip send user alert"));
                    }
                    cfefVarC = processUserAlertAsyncAction.f.a(((bvix) objF).c(), epby.GET_UPDATES);
                    cfefVarC.c = str2;
                    eozc eozcVar = (eozc) eoze.a.createBuilder();
                    eozcVar.copyOnWrite();
                    eoze eozeVar = (eoze) eozcVar.instance;
                    epgaVar2.getClass();
                    eozeVar.c = epgaVar2;
                    eozeVar.b = 6;
                    cfefVarC.b(eozcVar.build());
                } else {
                    cfefVarC = processUserAlertAsyncAction.f.c(ezolVar2, Optional.empty(), epby.GET_UPDATES);
                    cfefVarC.c = str2;
                    eozc eozcVar2 = (eozc) eoze.a.createBuilder();
                    eozcVar2.copyOnWrite();
                    eoze eozeVar2 = (eoze) eozcVar2.instance;
                    epgaVar2.getClass();
                    eozeVar2.c = epgaVar2;
                    eozeVar2.b = 6;
                    cfefVarC.b(eozcVar2.build());
                }
                if (epfyVar2 == epfy.BROWSER_INACTIVE || epfyVar2 == epfy.BROWSER_INACTIVE_FROM_INACTIVITY || epfyVar2 == epfy.BROWSER_INACTIVE_FROM_TIMEOUT) {
                    cfefVarC.i = ezjh.USER;
                }
                cfeg cfegVarA = cfefVarC.a();
                fcsu fcsuVar = processUserAlertAsyncAction.b;
                if (((Optional) fcsuVar.b()).isEmpty()) {
                    cqceVar2.r("DittoRetryExecutor is not available on this device.");
                    return eijx.d(new UnsupportedOperationException("DittoRetryExecutor is not available on this device."));
                }
                eiju eijuVarA = ((cfya) ((Optional) fcsuVar.b()).get()).a(cfegVarA);
                cfegVarA.q(eijuVarA);
                return eijuVarA;
            }
        }, this.h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ProcessUserAlertAsyncAction(fcsu fcsuVar, fcsu fcsuVar2, bvkr bvkrVar, ains ainsVar, eosc eoscVar, eosc eoscVar2, cffw cffwVar, cfeh cfehVar, fcsu fcsuVar3, Parcel parcel) {
        super(parcel, elgm.PROCESS_USER_ALERT_ACTION);
        this.g = fcsuVar;
        this.b = fcsuVar2;
        this.c = bvkrVar;
        this.d = ainsVar;
        this.i = eoscVar;
        this.h = eoscVar2;
        this.j = cffwVar;
        this.f = cfehVar;
        this.e = fcsuVar3;
    }
}
