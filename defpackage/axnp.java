package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ExpireWapPushSiMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axnp implements ayms {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;

    public axnp(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
        fcsuVar3.getClass();
        this.c = fcsuVar3;
    }

    public final /* bridge */ /* synthetic */ Action a() {
        cogw cogwVar = (cogw) this.a.b();
        cogwVar.getClass();
        axnp axnpVar = (axnp) this.b.b();
        axnpVar.getClass();
        axno axnoVar = (axno) this.c.b();
        axnoVar.getClass();
        return new ExpireWapPushSiMessageAction(cogwVar, axnpVar, axnoVar);
    }

    @Override // defpackage.ayms
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        cogw cogwVar = (cogw) this.a.b();
        cogwVar.getClass();
        axnp axnpVar = (axnp) this.b.b();
        axnpVar.getClass();
        axno axnoVar = (axno) this.c.b();
        axnoVar.getClass();
        parcel.getClass();
        return new ExpireWapPushSiMessageAction(cogwVar, axnpVar, axnoVar, parcel);
    }
}
