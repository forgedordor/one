package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amqa implements cqto {
    final /* synthetic */ amqh a;

    public amqa(amqh amqhVar) {
        this.a = amqhVar;
    }

    @Override // defpackage.cqto
    public final void fJ() {
        final amqh amqhVar = this.a;
        amqhVar.m = amqhVar.e.a(new anpi() { // from class: ampz
            @Override // defpackage.anpi
            public final eiju a() {
                amqh amqhVar2 = amqhVar;
                return auvw.c(amqhVar2.c, fcyi.a, fdjz.a, new amqf(amqhVar2, null));
            }
        });
    }

    @Override // defpackage.cqto
    public final void fK() {
        amqh amqhVar = this.a;
        amqhVar.d.d(amqhVar.l);
        cquc cqucVar = amqhVar.m;
        if (cqucVar != null) {
            cqucVar.a();
        }
        amqhVar.m = null;
    }
}
