package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.CountryCodeDetectorAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axms implements ayms {
    private final fcsu a;

    public axms(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
    }

    @Override // defpackage.ayms
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CountryCodeDetectorAction c(Parcel parcel) {
        crnf crnfVar = (crnf) this.a.b();
        crnfVar.getClass();
        parcel.getClass();
        return new CountryCodeDetectorAction(crnfVar, parcel);
    }

    public final /* bridge */ /* synthetic */ ThrottledAction b() {
        crnf crnfVar = (crnf) this.a.b();
        crnfVar.getClass();
        return new CountryCodeDetectorAction(crnfVar);
    }
}
