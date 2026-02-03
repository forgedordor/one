package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daib implements adaq {
    public final fcsu a;
    public String b;
    public String c;
    public String d;
    public String e;
    private final acyk f;

    public daib(acyk acykVar, fcsu fcsuVar) {
        fcsuVar.getClass();
        this.f = acykVar;
        this.a = fcsuVar;
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
    }

    @Override // defpackage.adaq
    public final void b(adao adaoVar, boolean z) {
        adaoVar.getClass();
        String strN = adaoVar.N();
        if (strN == null) {
            strN = "";
        }
        this.b = strN;
        String strO = adaoVar.O();
        if (strO == null) {
            strO = "";
        }
        this.c = strO;
        String strP = adaoVar.P();
        if (strP == null) {
            strP = "";
        }
        this.d = strP;
        String strJ = adaoVar.J();
        this.e = strJ != null ? strJ : "";
        this.f.b(adaoVar, z);
    }

    @Override // defpackage.adaq
    public final void c(View view) {
        daia daiaVar = new daia(this);
        acyk acykVar = this.f;
        acykVar.a = daiaVar;
        acykVar.c(view);
    }

    @Override // defpackage.adaq
    public final void d(adan adanVar, acyx acyxVar) {
        this.f.d(adanVar, acyxVar);
    }

    @Override // defpackage.adaq
    public final boolean e(adao adaoVar, adao adaoVar2) {
        adaoVar.getClass();
        adaoVar2.getClass();
        return (!this.f.e(adaoVar, adaoVar2) && fdbq.f(adaoVar2.P(), adaoVar.P()) && fdbq.f(adaoVar2.O(), adaoVar.O()) && fdbq.f(adaoVar2.J(), adaoVar.J())) ? false : true;
    }

    @Override // defpackage.adaq
    public final /* synthetic */ adao a(adao adaoVar) {
        return adaoVar;
    }
}
