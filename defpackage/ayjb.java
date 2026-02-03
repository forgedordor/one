package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.SetupExpressiveStickersAction;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayjb implements eora {
    final /* synthetic */ SetupExpressiveStickersAction a;

    public ayjb(SetupExpressiveStickersAction setupExpressiveStickersAction) {
        this.a = setupExpressiveStickersAction;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        SetupExpressiveStickersAction.a.o("Failed to download sticker metadata.", th);
        if (th instanceof CancellationException) {
            this.a.f.e(8);
        } else {
            this.a.f.e(3);
        }
    }
}
