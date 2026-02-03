package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessPendingMessagesAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axxx extends aypv {
    private final fcsu a;

    public axxx(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    @Override // defpackage.aypv
    public final /* synthetic */ Action a() {
        return new ProcessPendingMessagesAction();
    }

    @Override // defpackage.aypv
    public final /* bridge */ /* synthetic */ Action b(int i) {
        ((cogw) this.a.b()).getClass();
        return new ProcessPendingMessagesAction(i);
    }

    @Override // defpackage.ayms
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        parcel.getClass();
        return new ProcessPendingMessagesAction(parcel);
    }
}
