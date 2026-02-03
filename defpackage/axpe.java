package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.HandleLowStorageAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axpe implements ayms {
    private final fcsu a;

    public axpe(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
    }

    @Override // defpackage.ayms
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final HandleLowStorageAction c(Parcel parcel) {
        cmqa cmqaVar = (cmqa) this.a.b();
        cmqaVar.getClass();
        parcel.getClass();
        return new HandleLowStorageAction(cmqaVar, parcel);
    }

    public final HandleLowStorageAction b(int i, long j) {
        cmqa cmqaVar = (cmqa) this.a.b();
        cmqaVar.getClass();
        return new HandleLowStorageAction(cmqaVar, i, j);
    }
}
