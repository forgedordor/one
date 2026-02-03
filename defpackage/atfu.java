package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atfu extends fcyz implements fdat {
    final /* synthetic */ atfx a;
    final /* synthetic */ bsjh b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atfu(fcxy fcxyVar, atfx atfxVar, bsjh bsjhVar) {
        super(2, fcxyVar);
        this.a = atfxVar;
        this.b = bsjhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((atfu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.g.c("FileTransferProcessor#updateProcessingId", new atfw(this.b));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        atfu atfuVar = new atfu(fcxyVar, this.a, this.b);
        atfuVar.c = obj;
        return atfuVar;
    }
}
