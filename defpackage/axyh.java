package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessRevocationSentAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axyh implements ayms {
    private final fcsu a;

    public axyh(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
    }

    @Override // defpackage.ayms
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ProcessRevocationSentAction c(Parcel parcel) {
        parcel.getClass();
        return new ProcessRevocationSentAction(this.a, parcel);
    }

    public final ProcessRevocationSentAction b(basd basdVar) {
        return new ProcessRevocationSentAction(this.a, basdVar);
    }
}
