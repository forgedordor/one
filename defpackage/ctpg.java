package defpackage;

import com.google.android.apps.messaging.startchat.chip.ChipData;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctpg implements fdae {
    final /* synthetic */ ctph a;
    final /* synthetic */ ajou b;
    final /* synthetic */ ajpk c;
    final /* synthetic */ cudx d;

    public ctpg(ctph ctphVar, ajou ajouVar, ajpk ajpkVar, cudx cudxVar) {
        this.a = ctphVar;
        this.b = ajouVar;
        this.c = ajpkVar;
        this.d = cudxVar;
    }

    @Override // defpackage.fdae
    public final /* synthetic */ Object invoke() {
        ajpk ajpkVar = this.c;
        ChipData chipDataA = ctjc.a(this.b, ajpkVar.a);
        ctph ctphVar = this.a;
        ctphVar.c.c(chipDataA);
        if (this.d.d == cueh.a) {
            auvw.k(ctphVar.a, null, null, new ctpf(ctphVar, ajpkVar, null), 3);
        }
        ctphVar.c();
        return fctx.a;
    }
}
