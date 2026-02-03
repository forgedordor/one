package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doem extends dodl {
    private static final ekrg ag = ekrg.c("com/google/android/libraries/compose/magiccompose/ui/screen/MagicComposeScreen");
    public Optional a;
    private final dpxe ah;
    public dner b;
    public dneq c;
    public ComposeView d;
    public epiv e;

    public doem() {
        super(Integer.valueOf(R.layout.magic_compose_screen), new dodm((fduf) null, 3));
        this.ah = dpxe.h;
    }

    public static final /* synthetic */ dodm f(doem doemVar) {
        return (dodm) doemVar.bC();
    }

    @Override // defpackage.ea
    public final void ap(View view, Bundle bundle) {
        view.getClass();
        this.d = (ComposeView) view.findViewById(R.id.screen_content_compose_view);
        bA().d("MagicComposeScreen#onViewCreated", new fdae() { // from class: doee
            @Override // defpackage.fdae
            public final Object invoke() {
                doem doemVar = this.a;
                return fdil.d(doemVar.bH(), null, null, new doeh(doemVar, null), 3);
            }
        });
    }

    @Override // defpackage.dpxo
    public final void bf() {
        Object objC;
        ((dofj) ((dodm) bC()).a.c()).f.invoke();
        fduf fdufVar = ((dodm) bC()).a;
        do {
            objC = fdufVar.c();
        } while (!fdufVar.g(objC, dofj.a((dofj) objC, fcvo.a, 0, null, null, null, null, null, null, null, null, null, false, null, null, 0, null, 65534)));
    }

    @Override // defpackage.dpxo
    public final void bg() {
        fdil.d(bH(), null, null, new doef(this, null), 3);
    }

    public final dneq e() {
        dneq dneqVar = this.c;
        if (dneqVar != null) {
            return dneqVar;
        }
        fdbq.c("styleUsageProcessor");
        return null;
    }

    @Override // defpackage.dodl, defpackage.dpil, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        dner dnerVar = this.b;
        if (dnerVar == null) {
            fdbq.c("styleUsageProcessorFactory");
            dnerVar = null;
        }
        this.c = dnerVar.a(new dnfv(31));
        bA().d("MagicComposeScreen#onAttach", new fdae() { // from class: doed
            @Override // defpackage.fdae
            public final Object invoke() {
                return Boolean.valueOf(this.a.e().d());
            }
        });
    }

    @Override // defpackage.ea
    public final void m() {
        super.m();
        ((dofj) ((dodm) bC()).a.c()).g.invoke();
    }

    public final Optional p() {
        Optional optional = this.a;
        if (optional != null) {
            return optional;
        }
        fdbq.c("magicComposeViewFactory");
        return null;
    }

    public final void q(epiv epivVar) {
        Object objC;
        int iG = fcva.G(((dofj) ((dodm) bC()).a.c()).o, epivVar);
        if (iG < 0) {
            ekrw ekrwVarJ = ag.j();
            ekrwVarJ.X(eksq.a, "BuglePenpal");
            ((ekrd) ekrwVarJ.h("com/google/android/libraries/compose/magiccompose/ui/screen/MagicComposeScreen", "setInitialStyle", 97, "MagicComposeScreen.kt")).t("MagicRewriteStyle '%s' not found", epivVar);
        }
        fduf fdufVar = ((dodm) bC()).a;
        do {
            objC = fdufVar.c();
        } while (!fdufVar.g(objC, dofj.a((dofj) objC, null, 0, null, null, null, null, null, null, null, null, null, false, null, null, Math.max(iG, 0), null, 49151)));
    }

    @Override // defpackage.dpvx
    public final dpvw s() {
        return null;
    }

    @Override // defpackage.dpxo
    public final dpxe t() {
        return this.ah;
    }
}
