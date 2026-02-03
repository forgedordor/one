package defpackage;

import android.R;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edve implements eduu {
    public final fr a;
    public final eg b;
    public final dsvh c;
    private final eduy d;
    private final edut e;
    private final fcsu f;

    public edve(eg egVar, eduy eduyVar, dsvh dsvhVar, edut edutVar, fcsu fcsuVar) {
        this.a = egVar.a();
        this.b = egVar;
        this.d = eduyVar;
        this.c = dsvhVar;
        this.e = edutVar;
        this.f = fcsuVar;
    }

    private final void p(edtm edtmVar) {
        if (!fbgv.q()) {
            this.d.b();
        }
        fr frVar = this.a;
        if (frVar.g(R.id.content) != null) {
            if (frVar.h("SuggestionTabsFragment") == null) {
                if (fbgv.q()) {
                    this.d.b();
                }
                q(edtn.a(edtmVar), "SuggestionTabsFragment");
                return;
            }
            return;
        }
        if (fbgv.q()) {
            this.d.b();
        }
        cg cgVar = new cg(frVar);
        cgVar.x(R.id.content, edtn.a(edtmVar), "SuggestionTabsFragment");
        cgVar.B();
        cgVar.c();
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
        throw new IllegalStateException("This state is invalid for Intent only PhotoPicker");
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
            q((ea) this.f.b(), "SuggestedPhotosFragment");
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
        this.b.c().b(eaVar.Q(), new edvd(this, eaVar));
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
        throw new IllegalStateException("This state is invalid for Intent only PhotoPicker");
    }

    @Override // defpackage.eduu
    public final void o() {
        throw new IllegalStateException("This state is invalid for Intent only PhotoPicker");
    }
}
