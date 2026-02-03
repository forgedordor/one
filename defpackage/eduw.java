package defpackage;

import android.R;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eduw implements eduu {
    public final fr a;
    public final eg b;
    public final dsvh c;
    private final eduy d;
    private final edut e;
    private final fcsu f;
    private final fcsu g;

    public eduw(eg egVar, eduy eduyVar, dsvh dsvhVar, edut edutVar, fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = egVar.a();
        this.b = egVar;
        this.d = eduyVar;
        this.c = dsvhVar;
        this.e = edutVar;
        this.f = fcsuVar;
        this.g = fcsuVar2;
    }

    private final void p(edtm edtmVar) {
        this.d.b();
        if (this.a.h("SuggestionTabsFragment") == null) {
            q(edtn.a(edtmVar), "SuggestionTabsFragment");
        }
    }

    private final void q(ea eaVar, String str) {
        fr frVar = this.a;
        int iB = frVar.b();
        cg cgVar = new cg(frVar);
        cgVar.x(R.id.content, eaVar, str);
        cgVar.B();
        cgVar.v(iB == 0 ? "BASE_STATE" : null);
        cgVar.j();
        frVar.al();
    }

    @Override // defpackage.eduu
    public final void a() {
        this.d.a();
        this.a.aq("BASE_STATE");
        n();
        o();
    }

    @Override // defpackage.eduu
    public final void b(etub etubVar) {
        if (this.a.h("ClusterPhotosFragment") == null) {
            q(edoj.a(etubVar), "ClusterPhotosFragment");
        }
    }

    @Override // defpackage.eduu
    public final void c() {
        if (this.a.h("ClustersFragment") == null) {
            q(new edop(), "ClustersFragment");
        }
    }

    @Override // defpackage.eduu
    public final void d() {
        if (this.a.h("MeClusterPhotosFragment") == null) {
            q(new edrf(), "MeClusterPhotosFragment");
        }
    }

    @Override // defpackage.eduu
    public final void e() {
        if (this.a.h("SuggestedPhotosFragment") == null) {
            q((ea) this.g.b(), "SuggestedPhotosFragment");
        }
    }

    @Override // defpackage.eduu
    public final void f() {
        p(edtm.START_IN_ART_TAB);
    }

    @Override // defpackage.eduu
    public final void g() {
        p(edtm.START_IN_DEVICE_PHOTOS_TAB);
    }

    @Override // defpackage.eduu
    public final void h() {
        p(edtm.START_IN_GOOGLE_PHOTOS_TAB);
    }

    @Override // defpackage.eduu
    public final void i() {
        p(edtm.START_IN_MONOGRAM_TAB);
    }

    @Override // defpackage.eduu
    public final void j() {
        p(edtm.ONLY_SHOW_DEVICE_PHOTOS);
    }

    @Override // defpackage.eduu
    public final void k(ea eaVar) {
        this.b.c().b(eaVar.Q(), new eduv(this, eaVar));
    }

    @Override // defpackage.eduu
    public final void l() {
        this.b.onBackPressed();
    }

    @Override // defpackage.eduu
    public final void m(Uri uri) {
        this.e.a(uri);
    }

    @Override // defpackage.eduu
    public final void n() {
        fr frVar = this.a;
        if (frVar.g(R.id.content) == null) {
            cg cgVar = new cg(frVar);
            cgVar.x(R.id.content, (ea) this.f.b(), "PreviewFragment");
            cgVar.B();
            cgVar.c();
        }
    }

    @Override // defpackage.eduu
    public final void o() {
        new edsu().t(this.a, "UpdateFragment");
    }
}
