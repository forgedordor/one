package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avio extends fcyz implements fdat {
    final /* synthetic */ List a;
    final /* synthetic */ avit b;
    final /* synthetic */ avlb c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avio(fcxy fcxyVar, List list, avit avitVar, avlb avlbVar) {
        super(2, fcxyVar);
        this.a = list;
        this.b = avitVar;
        this.c = avlbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avio) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        for (Object obj2 : this.a) {
            obj2.getClass();
            this.b.f.a((avkw) obj2);
        }
        avlb avlbVar = this.c;
        if (avlbVar.c.size() > 0 || avlbVar.d.size() > 0) {
            this.b.g.a(avlbVar);
            ((eksl) avit.a.h()).q("Enqueued empty contacts for ContactRecipientDeletedSync");
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        avio avioVar = new avio(fcxyVar, this.a, this.b, this.c);
        avioVar.d = obj;
        return avioVar;
    }
}
