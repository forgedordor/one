package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsjl extends dshn {
    static final ejvr a = new dska();
    static final ejvr b = new dsjw();
    static final ejvr c = new dsjj();
    static final ejvr d = new dsje();
    static final ejvr e = new dsjo();
    static final ejvr f = new dsjf();

    @Override // defpackage.dshn
    public final void b(evmx evmxVar, etnb etnbVar) {
        int i = true != evmxVar.g ? 2 : 3;
        etnbVar.copyOnWrite();
        etnj etnjVar = (etnj) etnbVar.instance;
        etnj etnjVar2 = etnj.a;
        etnjVar.h = i - 1;
        etnjVar.b |= 16;
    }

    @Override // defpackage.dshn
    public final void c(evmx evmxVar, etnb etnbVar) {
        if (evmxVar.c == 13) {
            Object objApply = f.apply((evmh) evmxVar.d);
            etnbVar.copyOnWrite();
            etnj etnjVar = (etnj) etnbVar.instance;
            etnj etnjVar2 = etnj.a;
            objApply.getClass();
            etnjVar.d = objApply;
            etnjVar.c = 11;
        }
    }

    @Override // defpackage.dshn
    public final void d(evmx evmxVar, etnb etnbVar) {
        evmw evmwVarB = evmw.b(evmxVar.f);
        if (evmwVarB == null) {
            evmwVarB = evmw.UI_THEME_UNSPECIFIED;
        }
        evmw evmwVar = evmw.UI_THEME_GOOGLE_MATERIAL;
        int iA = evmu.a(evmxVar.c);
        if (iA == 0) {
            throw null;
        }
        switch (iA - 1) {
            case 0:
                etni etniVar = evmwVarB == evmwVar ? etni.UITYPE_GM_DIALOG : etni.UITYPE_DIALOG;
                etnbVar.copyOnWrite();
                etnj etnjVar = (etnj) etnbVar.instance;
                etnj etnjVar2 = etnj.a;
                etnjVar.e = etniVar.s;
                etnjVar.b |= 2;
                return;
            case 1:
                etni etniVar2 = evmwVarB == evmwVar ? etni.UITYPE_GM_TAP_TARGET : etni.UITYPE_TAP_TARGET;
                etnbVar.copyOnWrite();
                etnj etnjVar3 = (etnj) etnbVar.instance;
                etnj etnjVar4 = etnj.a;
                etnjVar3.e = etniVar2.s;
                etnjVar3.b |= 2;
                return;
            case 2:
                etni etniVar3 = evmwVarB == evmwVar ? etni.UITYPE_GM_TOOLTIP : etni.UITYPE_TOOLTIP;
                etnbVar.copyOnWrite();
                etnj etnjVar5 = (etnj) etnbVar.instance;
                etnj etnjVar6 = etnj.a;
                etnjVar5.e = etniVar3.s;
                etnjVar5.b |= 2;
                return;
            case 3:
                etni etniVar4 = etni.UITYPE_PERMISSION;
                etnbVar.copyOnWrite();
                etnj etnjVar7 = (etnj) etnbVar.instance;
                etnj etnjVar8 = etnj.a;
                etnjVar7.e = etniVar4.s;
                etnjVar7.b |= 2;
                return;
            case 4:
                etni etniVar5 = etni.UITYPE_RATING_NATIVE_STORE_REVIEW_DIALOG;
                etnbVar.copyOnWrite();
                etnj etnjVar9 = (etnj) etnbVar.instance;
                etnj etnjVar10 = etnj.a;
                etnjVar9.e = etniVar5.s;
                etnjVar9.b |= 2;
                return;
            case 5:
                etni etniVar6 = etni.UITYPE_GNP_CUSTOM_UI;
                etnbVar.copyOnWrite();
                etnj etnjVar11 = (etnj) etnbVar.instance;
                etnj etnjVar12 = etnj.a;
                etnjVar11.e = etniVar6.s;
                etnjVar11.b |= 2;
                return;
            case 6:
                etni etniVar7 = etni.UITYPE_NONE;
                etnbVar.copyOnWrite();
                etnj etnjVar13 = (etnj) etnbVar.instance;
                etnj etnjVar14 = etnj.a;
                etnjVar13.e = etniVar7.s;
                etnjVar13.b |= 2;
                return;
            default:
                return;
        }
    }

    @Override // defpackage.dshn
    public final void e(evmx evmxVar, etnb etnbVar) {
        if (evmxVar.c == 4) {
            Object objApply = e.apply((evng) evmxVar.d);
            etnbVar.copyOnWrite();
            etnj etnjVar = (etnj) etnbVar.instance;
            etnj etnjVar2 = etnj.a;
            objApply.getClass();
            etnjVar.d = objApply;
            etnjVar.c = 6;
        }
    }

    @Override // defpackage.dshn
    public final void f(evmx evmxVar, etnb etnbVar) {
        if (evmxVar.c == 1) {
            Object objApply = d.apply((evmf) evmxVar.d);
            etnbVar.copyOnWrite();
            etnj etnjVar = (etnj) etnbVar.instance;
            etnj etnjVar2 = etnj.a;
            objApply.getClass();
            etnjVar.d = objApply;
            etnjVar.c = 2;
        }
    }

    @Override // defpackage.dshn
    public final void g(evmx evmxVar, etnb etnbVar) {
        if (evmxVar.c == 2) {
            Object objApply = c.apply((evms) evmxVar.d);
            etnbVar.copyOnWrite();
            etnj etnjVar = (etnj) etnbVar.instance;
            etnj etnjVar2 = etnj.a;
            objApply.getClass();
            etnjVar.d = objApply;
            etnjVar.c = 3;
        }
    }

    @Override // defpackage.dshn
    public final void h(evmx evmxVar, etnb etnbVar) {
        if (evmxVar.c == 3) {
            Object objApply = b.apply((evnk) evmxVar.d);
            etnbVar.copyOnWrite();
            etnj etnjVar = (etnj) etnbVar.instance;
            etnj etnjVar2 = etnj.a;
            objApply.getClass();
            etnjVar.d = objApply;
            etnjVar.c = 5;
        }
    }
}
