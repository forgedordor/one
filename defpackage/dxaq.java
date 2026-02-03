package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxaq implements eora {
    final /* synthetic */ dwqw a;
    final /* synthetic */ dxaw b;

    public dxaq(dxaw dxawVar, dwqw dwqwVar) {
        this.a = dwqwVar;
        this.b = dxawVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        dxaw dxawVar = this.b;
        dxawVar.k.a(dxawVar.d, this.a);
        dxawVar.g.post(new Runnable() { // from class: dxap
            @Override // java.lang.Runnable
            public final void run() {
                dvhi.a(this.a.b.a.getContext(), R.string.message_sent_text);
            }
        });
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        dwqw dwqwVar = this.a;
        dvhv.c("ConvPresenter", "error send in conv: " + dwqwVar.f().toString() + ", error: " + th.getMessage());
        dxaw dxawVar = this.b;
        dxawVar.k.a(dxawVar.d, dwqwVar);
        dxawVar.g.post(new Runnable() { // from class: dxao
            @Override // java.lang.Runnable
            public final void run() {
                dvhi.a(this.a.b.a.getContext(), R.string.message_send_failure_text);
            }
        });
    }
}
