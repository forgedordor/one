package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.WaitForRcsServiceConnectionAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aylf implements ayms {
    public final fcsu a;
    public final fcsu b;
    private final fcsu c;
    private final fcsu d;

    public aylf(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
        fcsuVar3.getClass();
        this.c = fcsuVar3;
        fcsuVar4.getClass();
        this.d = fcsuVar4;
    }

    @Override // defpackage.ayms
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        aylm aylmVar = (aylm) this.c.b();
        aylmVar.getClass();
        aylp aylpVar = (aylp) this.d.b();
        aylpVar.getClass();
        parcel.getClass();
        return new WaitForRcsServiceConnectionAction(aylmVar, aylpVar, parcel);
    }
}
