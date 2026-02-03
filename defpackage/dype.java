package defpackage;

import com.google.android.libraries.onegoogle.accountmenu.viewproviders.MyAccountChip;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dype extends dyay {
    final /* synthetic */ dypf a;

    public dype(dypf dypfVar) {
        this.a = dypfVar;
    }

    @Override // defpackage.dyay
    public final void b(final Object obj) {
        dyrf.a(new Runnable() { // from class: dypd
            @Override // java.lang.Runnable
            public final void run() {
                dypf dypfVar = this.a.a;
                dypfVar.f.m(ekgb.n(dynq.a(dypfVar.getContext(), dypfVar.o, dypfVar.p)));
                Object obj2 = obj;
                if (obj2 == null) {
                    return;
                }
                MyAccountChip myAccountChip = dypfVar.a;
                dydm dydmVar = (dydm) myAccountChip.b;
                dydi dydiVar = dydmVar.b;
                int i = 8;
                if (dydiVar.a() != null && dydmVar.c.g(dydiVar.a())) {
                    i = 0;
                }
                myAccountChip.setVisibility(i);
                dypfVar.b.k(obj2);
                if (dypfVar.q.g()) {
                    dypfVar.g.a(ejud.a);
                }
            }
        });
    }
}
