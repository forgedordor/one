package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import defpackage.aydy;
import defpackage.aymo;
import defpackage.ayqe;
import defpackage.baca;
import defpackage.bacb;
import defpackage.bakt;
import defpackage.bbbd;
import defpackage.brvp;
import defpackage.bwwe;
import defpackage.bxkp;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.elgm;
import defpackage.fcsu;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ReloadCequintParticipantAction extends Action<Void> implements Parcelable {
    private final Context b;
    private final bacb c;
    private final ayqe d;
    private final fcsu e;
    private final bxkp f;
    private static final cqce a = cqce.g("Bugle", "ReloadCequintParticipantAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new aydy();

    /* compiled from: PG */
    public interface a {
        ayqe bm();
    }

    public ReloadCequintParticipantAction(Context context, bacb bacbVar, ayqe ayqeVar, fcsu fcsuVar, bxkp bxkpVar, Parcel parcel) {
        super(parcel, elgm.RELOAD_CEQUINT_PARTICIPANT_ACTION);
        this.b = context;
        this.c = bacbVar;
        this.d = ayqeVar;
        this.e = fcsuVar;
        this.f = bxkpVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("ReloadCequintParticipantAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        String strV;
        baca bacaVarA;
        aymo aymoVar = this.v;
        String strL = aymoVar.l("participant_id");
        if (strL == null) {
            a.p("Empty id.");
            return null;
        }
        int i = bbbd.a;
        ParticipantsTable.BindData bindDataB = ParticipantsTable.b(strL);
        if (bindDataB == null) {
            a.p("Empty participant.");
            return null;
        }
        bacb bacbVar = this.c;
        Context context = this.b;
        if (!bacbVar.b(context) || (bacaVarA = bacbVar.a(context, (strV = bindDataB.V()))) == null) {
            return null;
        }
        if (!bacaVarA.d) {
            if (TextUtils.isEmpty(bacaVarA.a)) {
                return null;
            }
            brvp brvpVarC = bindDataB.C();
            brvpVarC.u(bacaVarA.a);
            brvpVarC.t(bacaVarA.a);
            brvpVarC.R(bacaVarA.c);
            brvpVarC.N(bacaVarA.b);
            brvpVarC.l(-4L);
            this.f.b(brvpVarC.a());
            ((bakt) this.e.b()).R(strL);
            return null;
        }
        int iA = aymoVar.a("try_count");
        if (iA <= 0) {
            aymoVar.v("participant_id", bindDataB.R());
            aymoVar.r("try_count", 1);
            this.d.a(bindDataB).x(115, TimeUnit.SECONDS.toMillis(10L));
            return null;
        }
        cqbd cqbdVarC = a.c();
        cqbdVarC.I("Can't get info from Cequint after");
        cqbdVarC.G(iA + 1);
        cqbdVarC.I("tries for");
        cqbdVarC.D("address", strV);
        cqbdVarC.r();
        brvp brvpVarC2 = bindDataB.C();
        brvpVarC2.l(-2L);
        this.f.b(brvpVarC2.a());
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ReloadCequintParticipant.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ReloadCequintParticipantAction(Context context, fcsu<bwwe> fcsuVar, bacb bacbVar, ayqe ayqeVar, fcsu<bakt> fcsuVar2, bxkp bxkpVar, ParticipantsTable.BindData bindData) {
        super(elgm.RELOAD_CEQUINT_PARTICIPANT_ACTION);
        this.b = context;
        this.c = bacbVar;
        this.d = ayqeVar;
        this.e = fcsuVar2;
        this.f = bxkpVar;
        this.v.v("participant_id", bindData.R());
    }
}
