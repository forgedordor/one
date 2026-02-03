package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.GenericWorkerQueueAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axoy implements eora {
    final /* synthetic */ String a;

    public axoy(String str) {
        this.a = str;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        synchronized (GenericWorkerQueueAction.a) {
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        synchronized (GenericWorkerQueueAction.a) {
        }
    }
}
