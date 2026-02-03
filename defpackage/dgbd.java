package defpackage;

import android.os.Message;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgbd extends dgbb {
    final /* synthetic */ dgbn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgbd(dgbn dgbnVar) {
        super(dgbnVar);
        this.b = dgbnVar;
    }

    @Override // defpackage.dfna, defpackage.dfmy
    public final String a() {
        return "DeregisteringState";
    }

    @Override // defpackage.dgbb, defpackage.dfna, defpackage.dfmy
    public final void b() {
        super.b();
        dgbn dgbnVar = this.b;
        dfzi dfziVar = dgbnVar.v;
        if (dfziVar != null) {
            dfziVar.i(dezf.DISABLED);
        }
        dgbnVar.w(dgbnVar.t);
    }

    @Override // defpackage.dgbb, defpackage.dfna, defpackage.dfmy
    public final boolean e(Message message) {
        return true;
    }
}
