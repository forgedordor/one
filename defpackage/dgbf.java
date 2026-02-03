package defpackage;

import android.os.Message;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgbf extends dgbb {
    final /* synthetic */ dgbn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgbf(dgbn dgbnVar) {
        super(dgbnVar);
        this.b = dgbnVar;
    }

    @Override // defpackage.dfna, defpackage.dfmy
    public final String a() {
        return "InitialState";
    }

    @Override // defpackage.dgbb, defpackage.dfna, defpackage.dfmy
    public final boolean e(Message message) {
        int i = message.what;
        if (i == 3) {
            dgbn dgbnVar = this.b;
            dgbnVar.w(dgbnVar.k);
            return true;
        }
        if (i != 4) {
            return false;
        }
        dgbn dgbnVar2 = this.b;
        dgbnVar2.w(dgbnVar2.t);
        return true;
    }
}
