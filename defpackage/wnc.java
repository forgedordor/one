package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wnc extends fcyz implements fdat {
    final /* synthetic */ wnd a;
    final /* synthetic */ String b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wnc(fcxy fcxyVar, wnd wndVar, String str) {
        super(2, fcxyVar);
        this.a = wndVar;
        this.b = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wnc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.a.b(this.b);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        wnc wncVar = new wnc(fcxyVar, this.a, this.b);
        wncVar.c = obj;
        return wncVar;
    }
}
