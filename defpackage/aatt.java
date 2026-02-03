package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aatt implements egzv<ekgb<aauu>> {
    final /* synthetic */ aatv a;

    public aatt(aatv aatvVar) {
        this.a = aatvVar;
    }

    @Override // defpackage.egzv
    public final void a(Throwable th) {
        aatv aatvVar = this.a;
        aatvVar.a();
        ((dakl) aatvVar.e.b()).i(R.string.donation_query_error);
        aatv.a.s("#messageListsCallback: failed to load conversations", th);
        einf.f(new aata(5), (ea) aatvVar.b.b());
        ((aasf) aatvVar.j.b()).c(3);
    }

    @Override // defpackage.egzv
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ekgb ekgbVar = (ekgb) obj;
        aatv aatvVar = this.a;
        aatvVar.a();
        ((aasf) aatvVar.j.b()).c(2);
        if (aatvVar.p != null) {
            return;
        }
        if (ekgbVar.isEmpty()) {
            ((dakl) aatvVar.e.b()).i(R.string.donation_no_messages_error);
            einf.f(new aata(3), (ea) aatvVar.b.b());
        }
        RecyclerView recyclerView = aatvVar.o;
        aauk aaukVar = (aauk) aatvVar.d.b();
        RecyclerView recyclerView2 = aatvVar.o;
        cqjk cqjkVar = (cqjk) aaukVar.a.b();
        cqjkVar.getClass();
        fcsu fcsuVar = aaukVar.b;
        fcsu fcsuVar2 = aaukVar.c;
        recyclerView2.getClass();
        ekgbVar.getClass();
        recyclerView.al(new aauj(cqjkVar, fcsuVar, fcsuVar2, recyclerView2, ekgbVar));
        aauj aaujVar = (aauj) aatvVar.o.n;
        aaujVar.getClass();
        aatvVar.p = aaujVar;
        aatvVar.p.G();
    }

    @Override // defpackage.egzv
    public final void hn() {
        this.a.b();
    }
}
