package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aniw extends fcyz implements fdat {
    final /* synthetic */ anja a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aniw(anja anjaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = anjaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aniw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return new Integer(this.a.g.h());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aniw(this.a, fcxyVar);
    }
}
