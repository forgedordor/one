package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.SetupExpressiveStickersAction;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ayjc implements eora {
    final /* synthetic */ etyr a;
    final /* synthetic */ SetupExpressiveStickersAction b;

    public ayjc(SetupExpressiveStickersAction setupExpressiveStickersAction, etyr etyrVar) {
        this.a = etyrVar;
        this.b = setupExpressiveStickersAction;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        List list = (List) obj;
        if (list == null || list.isEmpty()) {
            etyr etyrVar = this.a;
            SetupExpressiveStickersAction setupExpressiveStickersAction = this.b;
            ((ebun) setupExpressiveStickersAction.e.b()).p(etyrVar.b);
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        SetupExpressiveStickersAction.a.o("Failed to get favorite sticker pack.", th);
    }
}
