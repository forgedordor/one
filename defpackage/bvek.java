package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvek implements lun {
    final /* synthetic */ anpj a;
    final /* synthetic */ egzh b;
    final /* synthetic */ Object c;
    private anpj d;
    private cquc e;

    public bvek(anpj anpjVar, egzh egzhVar, Object obj) {
        this.a = anpjVar;
        this.b = egzhVar;
        this.c = obj;
    }

    @Override // defpackage.lun
    public final void f(lvj lvjVar) {
        this.d = null;
        cquc cqucVar = this.e;
        if (cqucVar != null) {
            cqucVar.a();
            this.e = null;
        }
    }

    @Override // defpackage.lun
    public final void gG(lvj lvjVar) {
        anpj anpjVar = this.a;
        this.d = anpjVar;
        final egzh egzhVar = this.b;
        final Object obj = this.c;
        cquc cqucVarA = anpjVar.a(new anpi() { // from class: bvej
            @Override // defpackage.anpi
            public final eiju a() {
                egzhVar.a(eijx.e(null), obj);
                return eijx.e(null);
            }
        });
        this.e = cqucVarA;
        if (cqucVarA != null) {
            egzhVar.a(eijx.e(null), obj);
        }
    }

    @Override // defpackage.lun
    public final /* synthetic */ void c(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void d(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void fh(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gF(lvj lvjVar) {
    }
}
