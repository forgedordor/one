package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.axnm;
import defpackage.axno;
import defpackage.axnp;
import defpackage.cogw;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.elgm;
import java.text.SimpleDateFormat;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ExpireWapPushSiMessageAction extends Action<Void> {
    private final cogw b;
    private final axno c;
    private final axnp d;
    public static final cqce a = cqce.g("BugleDataModel", "ExpireWapPushSiMessageAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new axnm();

    /* compiled from: PG */
    public interface a {
        axnp hF();
    }

    public ExpireWapPushSiMessageAction(cogw cogwVar, axnp axnpVar, axno axnoVar) {
        super(elgm.EXPIRE_WAP_PUSH_SI_MESSAGE_ACTION);
        this.b = cogwVar;
        this.d = axnpVar;
        this.c = axnoVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("ExpireWapPushSiMessageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        cqce cqceVar = a;
        cqceVar.p("executeAction.");
        long jA = this.c.a();
        if (jA <= 0) {
            return null;
        }
        axnp axnpVar = this.d;
        cogw cogwVar = this.b;
        Action actionA = axnpVar.a();
        long epochMilli = jA - cogwVar.f().toEpochMilli();
        actionA.x(111, epochMilli >= 0 ? epochMilli : 0L);
        if (!cqceVar.t(4)) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd,yyyy HH:mm");
        cqbd cqbdVarC = cqceVar.c();
        cqbdVarC.I("scheduled next expiring action at");
        cqbdVarC.I(simpleDateFormat.format(Long.valueOf(jA)));
        cqbdVarC.r();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ExpireWapPushSiMessage.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ExpireWapPushSiMessageAction(cogw cogwVar, axnp axnpVar, axno axnoVar, Parcel parcel) {
        super(parcel, elgm.EXPIRE_WAP_PUSH_SI_MESSAGE_ACTION);
        this.b = cogwVar;
        this.d = axnpVar;
        this.c = axnoVar;
    }
}
