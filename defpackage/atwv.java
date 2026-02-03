package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atwv extends fcyz implements fdat {
    int a;
    final /* synthetic */ atww b;
    final /* synthetic */ aufr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atwv(atww atwwVar, aufr aufrVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = atwwVar;
        this.c = aufrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((atwv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        atww atwwVar = this.b;
        aufr aufrVar = this.c;
        auee aueeVar = aufrVar.c;
        if (aueeVar == null) {
            aueeVar = auee.a;
        }
        evtg evtgVar = aueeVar.b;
        evtgVar.getClass();
        auee aueeVar2 = aufrVar.c;
        if (aueeVar2 == null) {
            aueeVar2 = auee.a;
        }
        evtg evtgVar2 = aueeVar2.c;
        evtgVar2.getClass();
        this.a = 1;
        Object objL = atwwVar.l(evtgVar, evtgVar2, this);
        return objL == fcylVar ? fcylVar : objL;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new atwv(this.b, this.c, fcxyVar);
    }
}
