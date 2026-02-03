package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class svp extends fcyz implements fdat {
    int a;
    final /* synthetic */ svu b;
    final /* synthetic */ aoog c;
    final /* synthetic */ aonx d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public svp(fcxy fcxyVar, svu svuVar, aoog aoogVar, aonx aonxVar) {
        super(2, fcxyVar);
        this.b = svuVar;
        this.c = aoogVar;
        this.d = aonxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((svp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            svu svuVar = this.b;
            aoog aoogVar = this.c;
            aonx aonxVar = this.d;
            aonp aonpVar = aonp.VMT_STATUS_QUEUED;
            this.a = 1;
            if (svuVar.d(aonpVar, aoogVar, aonxVar.a, this) == fcylVar) {
                return fcylVar;
            }
        }
        svu svuVar2 = this.b;
        sxn sxnVar = (sxn) sxp.a.createBuilder();
        sxnVar.getClass();
        aoog aoogVar2 = this.c;
        String strA = aoogVar2.a.a();
        strA.getClass();
        sxnVar.copyOnWrite();
        ((sxp) sxnVar.instance).e = strA;
        String strB = aoogVar2.b.b();
        strB.getClass();
        sxnVar.copyOnWrite();
        ((sxp) sxnVar.instance).f = strB;
        sxnVar.copyOnWrite();
        ((sxp) sxnVar.instance).b = aoogVar2.c;
        String string = aoogVar2.d.toString();
        string.getClass();
        sxnVar.copyOnWrite();
        ((sxp) sxnVar.instance).c = string;
        String languageTag = this.d.a.toLanguageTag();
        languageTag.getClass();
        sxnVar.copyOnWrite();
        ((sxp) sxnVar.instance).d = languageTag;
        int i2 = true != aoogVar2.e ? 4 : 3;
        sxnVar.copyOnWrite();
        ((sxp) sxnVar.instance).g = i2 - 2;
        evsn evsnVarBuild = sxnVar.build();
        evsnVarBuild.getClass();
        return ((cazj) svuVar2.d.a.b()).a(cbcu.f("soda_file_transcription", (sxp) evsnVarBuild));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        svp svpVar = new svp(fcxyVar, this.b, this.c, this.d);
        svpVar.e = obj;
        return svpVar;
    }
}
