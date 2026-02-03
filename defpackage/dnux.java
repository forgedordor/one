package defpackage;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnux implements dpcl {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/emotify/controller/EmotifyButtonControllerImpl");
    public final fcsu b;
    private final dnwx c;
    private final fctc d = fctd.a(new fdae() { // from class: dnur
        @Override // defpackage.fdae
        public final Object invoke() {
            return (dnva) this.a.b.b();
        }
    });
    private final boolean e = true;
    private boolean f;
    private final abvh g;

    public dnux(fcsu fcsuVar, Optional optional, Optional optional2) {
        this.b = fcsuVar;
        this.c = (dnwx) fdct.b(optional2);
        this.g = (abvh) fdct.b(optional);
    }

    public final dnva a() {
        return (dnva) this.d.a();
    }

    @Override // defpackage.dpcl
    public final void b(View view, boolean z, fdae fdaeVar) {
        eebq.a.invoke(view);
        ((jgl) view).j();
        ComposeView composeView = (ComposeView) view;
        composeView.a(new hxd(592140713, true, new dnuw(composeView, z, fdaeVar, this)));
        ((ekrd) a.h().h("com/google/android/libraries/compose/emotify/controller/EmotifyButtonControllerImpl", "addView", 75, "EmotifyButtonControllerImpl.kt")).q("Create Emotify button is created and displayed.");
        dnwx dnwxVar = this.c;
        if (dnwxVar != null) {
            dnwxVar.c(dnwy.c);
        }
        abvh abvhVar = this.g;
        if (abvhVar != null) {
            abvhVar.a();
        }
        this.f = true;
    }

    @Override // defpackage.dpcl
    public final void c(Object obj, fdae fdaeVar) {
        a().a(fdaeVar, dnwy.c, obj instanceof Float ? new dnuz(((Number) obj).floatValue(), false, 2) : obj instanceof Boolean ? new dnuz(0.0f, ((Boolean) obj).booleanValue(), 1) : new dnuz(0.0f, false, 3));
    }

    @Override // defpackage.dpcl
    public final void d() {
        if (this.f) {
            ((ekrd) a.h().h("com/google/android/libraries/compose/emotify/controller/EmotifyButtonControllerImpl", "onDisplayed", 95, "EmotifyButtonControllerImpl.kt")).q("Create Emotify button is displayed without view recreation.");
            dnwx dnwxVar = this.c;
            if (dnwxVar != null) {
                dnwxVar.c(dnwy.c);
            }
            abvh abvhVar = this.g;
            if (abvhVar != null) {
                abvhVar.a();
            }
        }
    }

    @Override // defpackage.dpcl
    public final boolean e() {
        return this.e;
    }
}
