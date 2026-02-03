package defpackage;

import android.os.Message;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgbl extends dgbb {
    final /* synthetic */ dgbn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgbl(dgbn dgbnVar) {
        super(dgbnVar);
        this.b = dgbnVar;
    }

    @Override // defpackage.dfna, defpackage.dfmy
    public final String a() {
        return "RetryState";
    }

    @Override // defpackage.dgbb, defpackage.dfna, defpackage.dfmy
    public final void b() {
        super.b();
        dgbn dgbnVar = this.b;
        dgbnVar.I(dgba.RESET_FROM_STATE_RETRY);
        dhja.l(dgbnVar.i, "Retrying in %ds.", 3L);
        dgbnVar.t(15, TimeUnit.SECONDS.toMillis(3L));
    }

    @Override // defpackage.dgbb, defpackage.dfna, defpackage.dfmy
    public final void c() {
        super.c();
        this.b.p(15);
    }

    @Override // defpackage.dgbb, defpackage.dfna, defpackage.dfmy
    public final boolean e(Message message) {
        int i = message.what;
        if (i == 4) {
            dgbn dgbnVar = this.b;
            dhja.d(dgbnVar.i, "Triggering registration retry.", new Object[0]);
            dgbnVar.w(dgbnVar.t);
            return true;
        }
        if (i != 15) {
            return super.e(message);
        }
        dgbn dgbnVar2 = this.b;
        dhja.d(dgbnVar2.i, "Triggering registration retry.", new Object[0]);
        dgbnVar2.w(dgbnVar2.k);
        return true;
    }
}
