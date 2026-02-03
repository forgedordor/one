package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aypo implements aymj {
    final /* synthetic */ SettableFuture a;

    public aypo(SettableFuture settableFuture) {
        this.a = settableFuture;
    }

    @Override // defpackage.aymj
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        this.a.set(false);
    }

    @Override // defpackage.aymj
    public final /* bridge */ /* synthetic */ void b(Action action, Object obj) {
        this.a.set(true);
    }
}
