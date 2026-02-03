package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckay implements lun {
    final /* synthetic */ ckbk a;
    final /* synthetic */ cqew b;
    final /* synthetic */ chyy c;
    final /* synthetic */ cjpn d;

    public ckay(ckbk ckbkVar, cqew cqewVar, chyy chyyVar, cjpn cjpnVar) {
        this.a = ckbkVar;
        this.b = cqewVar;
        this.c = chyyVar;
        this.d = cjpnVar;
    }

    @Override // defpackage.lun
    public final void f(lvj lvjVar) {
        ckbk ckbkVar = this.a;
        cqey cqeyVar = (cqey) ((cqbm) ckbkVar.l.b()).a();
        cqer cqerVar = (cqer) cqeu.a.createBuilder();
        cqet cqetVar = cqet.ALL_ACTIVE_SUBSCRIPTIONS;
        cqerVar.copyOnWrite();
        cqeu cqeuVar = (cqeu) cqerVar.instance;
        cqeuVar.c = cqetVar.e;
        cqeuVar.b |= 1;
        cqeyVar.n(this.b, (cqeu) cqerVar.build());
        ((chza) ((cqbm) ckbkVar.i.b()).a()).l(this.c);
        if (((arwx) ckbkVar.p.b()).a()) {
            ((cjpo) ckbkVar.o.b()).k(this.d);
        }
    }

    @Override // defpackage.lun
    public final void gG(lvj lvjVar) {
        ckbk ckbkVar = this.a;
        cqey cqeyVar = (cqey) ((cqbm) ckbkVar.l.b()).a();
        cqer cqerVar = (cqer) cqeu.a.createBuilder();
        cqet cqetVar = cqet.ALL_ACTIVE_SUBSCRIPTIONS;
        cqerVar.copyOnWrite();
        cqeu cqeuVar = (cqeu) cqerVar.instance;
        cqeuVar.c = cqetVar.e;
        cqeuVar.b |= 1;
        cqeyVar.m(this.b, (cqeu) cqerVar.build());
        ((chza) ((cqbm) ckbkVar.i.b()).a()).i(this.c, ckbkVar.e);
        if (((arwx) ckbkVar.p.b()).a()) {
            ((cjpo) ckbkVar.o.b()).j(this.d);
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
