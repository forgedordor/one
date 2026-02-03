package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.PauseRcsFileTransferAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axsx implements ayms {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;

    public axsx(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
        fcsuVar3.getClass();
        this.c = fcsuVar3;
        fcsuVar4.getClass();
        this.d = fcsuVar4;
        fcsuVar5.getClass();
        this.e = fcsuVar5;
        fcsuVar6.getClass();
        this.f = fcsuVar6;
    }

    @Override // defpackage.ayms
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        eosc eoscVar = (eosc) this.b.b();
        eoscVar.getClass();
        cohh cohhVar = (cohh) this.d.b();
        cohhVar.getClass();
        atgy atgyVar = (atgy) this.f.b();
        atgyVar.getClass();
        parcel.getClass();
        return new PauseRcsFileTransferAction(context, eoscVar, this.c, cohhVar, this.e, atgyVar, parcel);
    }
}
