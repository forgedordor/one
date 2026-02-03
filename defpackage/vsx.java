package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vsx implements vsl {
    public final fcsu a;
    public final fcsu b;
    public final zuh c;
    public final aqiy d;
    public final dnuy e;
    public final xux f;
    public final diii g;
    private final fdjx h;
    private final wgu i;
    private final xmx j;
    private final xeg k;
    private final wfo l;
    private final fduj m;
    private final asgk n;
    private final fdvc o;
    private final fdvc p;

    public vsx(fdjx fdjxVar, wgu wguVar, xmx xmxVar, xeg xegVar, wfo wfoVar, fduj fdujVar, xux xuxVar, ccyf ccyfVar, Optional optional, asgk asgkVar, fcsu fcsuVar, fcsu fcsuVar2, zuh zuhVar, aqiy aqiyVar, diii diiiVar) {
        fdvc fdvcVarA;
        fdjxVar.getClass();
        wguVar.getClass();
        xmxVar.getClass();
        xegVar.getClass();
        wfoVar.getClass();
        fdujVar.getClass();
        xuxVar.getClass();
        asgkVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        zuhVar.getClass();
        diiiVar.getClass();
        this.h = fdjxVar;
        this.i = wguVar;
        this.j = xmxVar;
        this.k = xegVar;
        this.l = wfoVar;
        this.m = fdujVar;
        this.f = xuxVar;
        this.n = asgkVar;
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = zuhVar;
        this.d = aqiyVar;
        this.g = diiiVar;
        this.o = asgkVar.a() ? new auxs(new fdae() { // from class: vsm
            @Override // defpackage.fdae
            public final Object invoke() {
                return false;
            }
        }) : fdtg.b(new vsw(new vst(fdujVar)), fdjxVar, fdur.b, false);
        dnuy dnuyVar = (dnuy) fdct.b(optional);
        this.e = dnuyVar;
        if (!crbf.e() || dnuyVar == null) {
            fdvcVarA = fdvf.a(false);
        } else {
            fdui fduiVar = new fdui(new vsp(this, null));
            ccyc ccycVar = new ccyc(ccyfVar.c.b());
            fdjx fdjxVar2 = ccyfVar.a;
            fdus fdusVar = fdur.b;
            fdvcVarA = fdtg.b(new fdua(fduiVar, fdtg.b(ccycVar, fdjxVar2, fdusVar, false), new vsq(null)), fdjxVar, fdusVar, false);
        }
        this.p = fdvcVarA;
    }

    @Override // defpackage.vsl
    public final fdvc a() {
        fdus fdusVar = fdur.b;
        fdvc fdvcVarA = this.i.a();
        fdvc fdvcVarA2 = this.j.a();
        fdvc fdvcVarD = this.k.d();
        fdvc fdvcVarA3 = this.l.a();
        fdax fdaxVar = new fdax() { // from class: vsn
            @Override // defpackage.fdax
            public final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                djcy djcyVar = (djcy) obj;
                djfn djfnVar = (djfn) obj2;
                xef xefVar = (xef) obj3;
                wgl wglVar = (wgl) obj4;
                boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                djcyVar.getClass();
                djfnVar.getClass();
                xefVar.getClass();
                boolean zA = crtr.a();
                Object objE = ((cczi) crbf.ah.get()).e();
                objE.getClass();
                boolean zBooleanValue3 = ((Boolean) objE).booleanValue();
                vsx vsxVar = this.a;
                return new vsk(new djgb(djcyVar, djfnVar, xefVar.b, true == zBooleanValue ? 2 : 1, 0.0f, zBooleanValue2, new djga(true, zBooleanValue3, true, ((aqgu) vsxVar.a.b()).a() && ((aqgw) vsxVar.b.b()).a(), zA, false, 32), 16), xefVar.a, new vso(vsxVar), vsxVar.f.b, wglVar);
            }
        };
        return avba.b(this.h, fdusVar, fdvcVarA, fdvcVarA2, fdvcVarD, fdvcVarA3, this.o, this.p, fdaxVar);
    }
}
