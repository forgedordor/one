package defpackage;

import android.os.Message;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgbg extends dgbb {
    final /* synthetic */ dgbn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgbg(dgbn dgbnVar) {
        super(dgbnVar);
        this.b = dgbnVar;
    }

    @Override // defpackage.dfna, defpackage.dfmy
    public final String a() {
        return "PublishedState";
    }

    @Override // defpackage.dgbb, defpackage.dfna, defpackage.dfmy
    public final void b() {
        dfzi dfziVar;
        super.b();
        if (!dgbn.P() || (dfziVar = this.b.v) == null) {
            return;
        }
        dfziVar.h();
    }

    @Override // defpackage.dgbb, defpackage.dfna, defpackage.dfmy
    public final void c() {
        if (dgbn.P()) {
            this.b.G(dezf.ERROR_RESPONSE);
        }
        super.c();
    }

    @Override // defpackage.dgbb, defpackage.dfna, defpackage.dfmy
    public final boolean e(Message message) {
        int i = message.what;
        if (i != 9) {
            if (i != 10 && i != 17) {
                if (i != 18) {
                    return false;
                }
                this.b.J(message.arg1);
                return true;
            }
            dgbn dgbnVar = this.b;
            dhja.r(dgbnVar.i, "[%s] Publish failed.", "PublishedState");
            dgbnVar.w(dgbnVar.o);
        }
        return true;
    }
}
