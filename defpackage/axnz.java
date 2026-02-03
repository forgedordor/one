package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.FillPartSizeAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axnz implements ayms {
    public final fcsu a;
    public final fcsu b;

    public axnz(fcsu fcsuVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
    }

    @Override // defpackage.ayms
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        dqsn dqsnVar = (dqsn) this.b.b();
        dqsnVar.getClass();
        parcel.getClass();
        return new FillPartSizeAction(this.a, dqsnVar, parcel);
    }
}
