package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.axwt;
import defpackage.axwu;
import defpackage.aymo;
import defpackage.bvio;
import defpackage.bviv;
import defpackage.bvix;
import defpackage.bvkr;
import defpackage.cczi;
import defpackage.cdip;
import defpackage.cema;
import defpackage.cemk;
import defpackage.cfef;
import defpackage.cfeg;
import defpackage.cfeh;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.eiju;
import defpackage.elgm;
import defpackage.eork;
import defpackage.eoxq;
import defpackage.eoxr;
import defpackage.eozc;
import defpackage.eoze;
import defpackage.epby;
import defpackage.evsn;
import defpackage.evtj;
import defpackage.ezjn;
import defpackage.ezol;
import defpackage.fcsu;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ProcessExpressiveStickerFavoriteAction extends Action<ListenableFuture<ezjn>> {
    private final fcsu b;
    private final cema c;
    private final cemk d;
    private final fcsu e;
    private final cfeh f;
    private static final cqce a = cqce.g("BugleNetwork", "ProcessExpressiveStickerFavoriteAction");
    public static final Parcelable.Creator<Action<ListenableFuture<ezjn>>> CREATOR = new axwt();

    /* compiled from: PG */
    public interface a {
        axwu hW();
    }

    public ProcessExpressiveStickerFavoriteAction(fcsu fcsuVar, cema cemaVar, cemk cemkVar, cfeh cfehVar, fcsu fcsuVar2, Parcel parcel) {
        super(parcel, elgm.PROCESS_EXPRESSIVE_STICKER_FAVORITE_ACTION);
        this.b = fcsuVar;
        this.c = cemaVar;
        this.f = cfehVar;
        this.e = fcsuVar2;
        this.d = cemkVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("ProcessExpressiveStickerFavoriteAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        cfeg cfegVarA;
        aymo aymoVar = this.v;
        byte[] bArrA = aymoVar.A("desktop_id_key");
        String strL = aymoVar.l("request_id_key");
        if (bArrA == null || strL == null) {
            a.n("Desktop ID or request ID null, skipping StickerFavorite.");
            return eork.i(null);
        }
        try {
            ezol ezolVar = (ezol) evsn.parseFrom(ezol.a, bArrA);
            eoxq eoxqVar = (eoxq) eoxr.a.createBuilder();
            aymo aymoVar2 = this.v;
            boolean zY = aymoVar2.y("is_favorite_key");
            eoxqVar.copyOnWrite();
            ((eoxr) eoxqVar.instance).c = zY;
            String strL2 = aymoVar2.l("pack_id_key");
            eoxqVar.copyOnWrite();
            eoxr eoxrVar = (eoxr) eoxqVar.instance;
            strL2.getClass();
            eoxrVar.b = strL2;
            eoxr eoxrVar2 = (eoxr) eoxqVar.build();
            cczi ccziVar = cdip.a;
            if (((Boolean) ccziVar.e()).booleanValue()) {
                bvix bvixVarF = ((bvkr) this.e.b()).f(ezolVar.c);
                if (bvixVarF == null) {
                    cqbd cqbdVarE = a.e();
                    cqbdVarE.A("desktopId", ezolVar.c);
                    cqbdVarE.I("Desktop not found. Skipping favorite sticker sync.");
                    cqbdVarE.r();
                    return eork.i(null);
                }
                cfef cfefVarA = this.f.a(((bviv) bvixVarF).b, epby.GET_UPDATES);
                cfefVarA.c = strL;
                eozc eozcVar = (eozc) eoze.a.createBuilder();
                eozcVar.copyOnWrite();
                eoze eozeVar = (eoze) eozcVar.instance;
                eoxrVar2.getClass();
                eozeVar.c = eoxrVar2;
                eozeVar.b = 10;
                cfefVarA.b(eozcVar.build());
                cfegVarA = cfefVarA.a();
            } else {
                cfef cfefVarC = this.f.c(ezolVar, Optional.empty(), epby.GET_UPDATES);
                cfefVarC.c = strL;
                eozc eozcVar2 = (eozc) eoze.a.createBuilder();
                eozcVar2.copyOnWrite();
                eoze eozeVar2 = (eoze) eozcVar2.instance;
                eoxrVar2.getClass();
                eozeVar2.c = eoxrVar2;
                eozeVar2.b = 10;
                cfefVarC.b(eozcVar2.build());
                cfegVarA = cfefVarC.a();
            }
            ((bvio) this.b.b()).f(strL, ezolVar.c, epby.GET_UPDATES.a(), 10, cfegVarA.c);
            eiju eijuVarA = ((Boolean) ccziVar.e()).booleanValue() ? this.d.a(cfegVarA) : this.c.a(cfegVarA);
            cfegVarA.q(eijuVarA);
            return eijuVarA;
        } catch (evtj e) {
            a.o("Desktop ID invalid.", e);
            return eork.i(null);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.FavoriteStickersUpdate.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ProcessExpressiveStickerFavoriteAction(fcsu fcsuVar, cema cemaVar, cemk cemkVar, cfeh cfehVar, fcsu fcsuVar2, ezol ezolVar, String str, String str2, boolean z) {
        super(elgm.PROCESS_EXPRESSIVE_STICKER_FAVORITE_ACTION);
        this.b = fcsuVar;
        this.c = cemaVar;
        this.d = cemkVar;
        this.f = cfehVar;
        this.e = fcsuVar2;
        this.v.q("desktop_id_key", ezolVar.toByteArray());
        this.v.v("request_id_key", str);
        this.v.v("pack_id_key", str2);
        this.v.p("is_favorite_key", z);
    }
}
