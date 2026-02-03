package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bvru extends fcyz implements fdat {
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ bvsb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvru(long j, bvsb bvsbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = j;
        this.c = bvsbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bvru) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            long j = this.b;
            this.a = 1;
            if (fdkj.c(j, this) == fcylVar) {
                return fcylVar;
            }
        }
        bvsb bvsbVar = this.c;
        bvsbVar.o.set(false);
        bvsb.a.n().q("Trigger DownloadEmojiTimer, notify.");
        bvsbVar.h.a(auvw.c(bvsbVar.c, fcyi.a, fdjz.a, new bvry(bvsbVar, null)), bvqt.a);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bvru(this.b, this.c, fcxyVar);
    }
}
