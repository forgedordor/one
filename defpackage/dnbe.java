package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnbe extends vo implements lun {
    public final fdjx a;
    public final ea d;
    public final dmiv e;
    public dmiz f;
    private final dmix g;
    private final dmys h;
    private final fdap i;
    private final fdap j;

    public dnbe(fdjx fdjxVar, ea eaVar, dmix dmixVar, dmys dmysVar, dmiv dmivVar, fdap fdapVar, fdap fdapVar2) {
        this.a = fdjxVar;
        this.d = eaVar;
        this.g = dmixVar;
        this.h = dmysVar;
        this.e = dmivVar;
        this.i = fdapVar;
        this.j = fdapVar2;
        eaVar.P().c(this);
    }

    private final void F(dmiz dmizVar) {
        dmiu dmiuVar;
        dmys dmysVar = this.h;
        dmiv dmivVar = dmysVar.d.e;
        dmiu dmiuVar2 = null;
        if (dmivVar != null && (dmiuVar = dmivVar.a) != null) {
            dmyq dmyqVar = dmysVar.f;
            dmiuVar2 = (dmyqVar == null || !fdbq.f(dmyqVar, dmyo.a)) ? dmiuVar : dmis.a;
        }
        dmizVar.D(dmiuVar2);
        dmizVar.t.d(dmiz.s[0], dmysVar.a(2));
    }

    @Override // defpackage.vo
    public final int a() {
        return 1;
    }

    @Override // defpackage.lun
    public final void c(lvj lvjVar) {
        fdil.d(this.a, null, null, new dnbd(this, null), 3);
    }

    @Override // defpackage.lun
    public final void d(lvj lvjVar) {
        dmiz dmizVar = this.f;
        if (dmizVar != null) {
            l(dmizVar);
        }
    }

    @Override // defpackage.vo
    public final int dF(int i) {
        return 2;
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        return this.g.a(viewGroup, this.e, this.i);
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void g(wv wvVar, int i) {
        dmiz dmizVar = (dmiz) wvVar;
        dmizVar.getClass();
        F(dmizVar);
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void i(wv wvVar) {
        l((dmiz) wvVar);
        this.j.invoke(true);
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void j(wv wvVar) {
        this.j.invoke(false);
    }

    public final void l(dmiz dmizVar) {
        this.f = dmizVar;
        F(dmizVar);
        fdil.d(this.a, null, null, new dnbb(dmizVar, null), 3);
    }

    @Override // defpackage.lun
    public final /* synthetic */ void f(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void fh(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gF(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gG(lvj lvjVar) {
    }
}
