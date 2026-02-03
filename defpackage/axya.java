package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.ProcessPendingRevocationsAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axya implements ejvr {
    final /* synthetic */ ProcessPendingRevocationsAction a;

    public axya(ProcessPendingRevocationsAction processPendingRevocationsAction) {
        this.a = processPendingRevocationsAction;
    }

    @Override // defpackage.ejvr
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            return null;
        }
        this.a.a.b();
        return null;
    }
}
