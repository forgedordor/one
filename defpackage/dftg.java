package defpackage;

import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.data.Conversation;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dftg extends eooi implements dgvo {
    private final Conversation a;

    public dftg(Conversation conversation) {
        this.a = conversation;
    }

    @Override // defpackage.dgvo
    public final void a(dgvm dgvmVar) {
        dgvmVar.e(this);
        efcb efcbVar = new efcb();
        efcbVar.b(this.a);
        efcbVar.c(MessagingResult.d);
        set(efcbVar.a());
    }

    @Override // defpackage.dgvo
    public final void c(dgvm dgvmVar, dgvn dgvnVar) {
        dgvmVar.e(this);
        efcb efcbVar = new efcb();
        efcbVar.b(this.a);
        effe effeVarD = MessagingResult.d();
        effeVarD.c(15);
        efcbVar.c(effeVarD.e());
        set(efcbVar.a());
    }

    @Override // defpackage.dgvo
    public final void d(dgvm dgvmVar, int i, String str) {
        dgvmVar.e(this);
        efcb efcbVar = new efcb();
        efcbVar.b(this.a);
        efcbVar.c(dfwf.a(i));
        set(efcbVar.a());
    }

    @Override // defpackage.dgvo
    public final void e() {
    }

    @Override // defpackage.dgvo
    public final void f() {
    }
}
