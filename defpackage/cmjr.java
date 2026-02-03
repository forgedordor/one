package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmjr extends fcyz implements fdat {
    int a;
    final /* synthetic */ cmjx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmjr(cmjx cmjxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cmjxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmjr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cmlb cmlbVar = (cmlb) this.b.f.b();
            cmla cmlaVar = cmla.a;
            this.a = 1;
            obj = cmlbVar.l(cmlaVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        cmmh cmmhVar = (cmmh) obj;
        if (cmmhVar == null) {
            cmmhVar = cmmh.a;
            cmmhVar.getClass();
        }
        cmjx cmjxVar = this.b;
        String str = cmmhVar.c;
        fcsu fcsuVar = cmjxVar.j;
        if (!fdbq.f(str, ((dhes) fcsuVar.b()).g().a)) {
            String str2 = cmmhVar.c;
            str2.getClass();
            cmlq cmlqVar = new cmlq(new dggp(str2), ((dhes) fcsuVar.b()).g(), cmmhVar.d, ((Integer) ((dhes) fcsuVar.b()).k.d()).intValue());
            cmls cmlsVar = (cmls) cmjxVar.g.b();
            dggn dggnVar = cmlqVar.b;
            enpl enplVarA = cmlsVar.a(cmlqVar.a);
            enpl enplVarA2 = cmlsVar.a(dggnVar);
            eoav eoavVar = (eoav) eoaw.a.createBuilder();
            eoavVar.getClass();
            eoavVar.copyOnWrite();
            eoaw eoawVar = (eoaw) eoavVar.instance;
            eoawVar.c = enplVarA;
            eoawVar.b |= 1;
            eoavVar.copyOnWrite();
            eoaw eoawVar2 = (eoaw) eoavVar.instance;
            eoawVar2.d = enplVarA2;
            eoawVar2.b |= 2;
            String strA = cmlq.a(cmlqVar.e);
            strA.getClass();
            eoavVar.copyOnWrite();
            eoaw eoawVar3 = (eoaw) eoavVar.instance;
            eoawVar3.b |= 4;
            eoawVar3.e = strA;
            String strA2 = cmlq.a(cmlqVar.f);
            strA2.getClass();
            eoavVar.copyOnWrite();
            eoaw eoawVar4 = (eoaw) eoavVar.instance;
            eoawVar4.b |= 8;
            eoawVar4.f = strA2;
            eoavVar.copyOnWrite();
            eoaw eoawVar5 = (eoaw) eoavVar.instance;
            eoawVar5.b |= 16;
            eoawVar5.g = cmlqVar.c;
            eoavVar.copyOnWrite();
            eoaw eoawVar6 = (eoaw) eoavVar.instance;
            eoawVar6.b |= 32;
            eoawVar6.h = cmlqVar.d;
            evsn evsnVarBuild = eoavVar.build();
            evsnVarBuild.getClass();
            eoas eoasVar = (eoas) eoat.a.createBuilder();
            eoasVar.getClass();
            eoau.b(6, eoasVar);
            eoasVar.copyOnWrite();
            eoat eoatVar = (eoat) eoasVar.instance;
            eoatVar.d = (eoaw) evsnVarBuild;
            eoatVar.b |= 64;
            eoat eoatVarA = eoau.a(eoasVar);
            ellg ellgVar = (ellg) ellh.a.createBuilder();
            ellf ellfVar = ellf.SIM_STATE_TRACKER_EVENT;
            ellgVar.copyOnWrite();
            ellh ellhVar = (ellh) ellgVar.instance;
            ellhVar.j = ellfVar.f11do;
            ellhVar.b = 1 | ellhVar.b;
            ellgVar.copyOnWrite();
            ellh ellhVar2 = (ellh) ellgVar.instance;
            ellhVar2.bB = eoatVarA;
            ellhVar2.g |= 8192;
            ((aimb) cmlsVar.a.b()).a().h(ellgVar, aioj.LOG_SPEC_SIM_SUBSCRIPTION_INFO_COMPARISON_LOGGING);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cmjr(this.b, fcxyVar);
    }
}
