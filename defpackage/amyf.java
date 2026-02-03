package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amyf implements cqto {
    final /* synthetic */ amyi a;

    public amyf(amyi amyiVar) {
        this.a = amyiVar;
    }

    @Override // defpackage.cqto
    public final void fJ() {
        final amyi amyiVar = this.a;
        amyiVar.d = amyiVar.b.f.a(new cqtk() { // from class: amye
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                amyi amyiVar2 = amyiVar;
                return auvw.c(amyiVar2.a, fcyi.a, fdjz.a, new amyh((MessageId) obj, amyiVar2, null));
            }
        }, "RichCardMediaTransferProgressManager::Register", "RichCardMediaTransferProgressManager::Callback", "RichCardMediaTransferProgressManager::Unregister");
    }

    @Override // defpackage.cqto
    public final void fK() {
        amyi amyiVar = this.a;
        cquc cqucVar = amyiVar.d;
        if (cqucVar != null) {
            cqucVar.a();
        }
        amyiVar.d = null;
    }
}
