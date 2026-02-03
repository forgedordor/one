package defpackage;

import android.media.AudioManager;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqhd extends dqgi {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/voice/ui/screen/VoiceScreen");
    private ComposeView ag;
    private final fctc ah;
    private fdlr ai;
    public dnhb b;
    public AudioManager c;
    public dqir d;
    private final dpxe e;

    public dqhd() {
        super(Integer.valueOf(R.layout.voice_screen));
        this.e = dpxe.g;
        this.ah = fctd.a(new fdae() { // from class: dqgp
            @Override // defpackage.fdae
            public final Object invoke() {
                return new dpxm(this.a.N());
            }
        });
    }

    static /* synthetic */ void bj(dqhd dqhdVar, int i, int i2, View.OnClickListener onClickListener) {
        dpxm.c(dqhdVar.bk(), null, Integer.valueOf(i), null, Integer.valueOf(i2), onClickListener, 1);
        ComposeView composeView = dqhdVar.ag;
        if (composeView == null) {
            fdbq.c("contentComposeView");
            composeView = null;
        }
        composeView.setVisibility(8);
    }

    private final dpxm bk() {
        return (dpxm) this.ah.a();
    }

    public static final /* synthetic */ dqgm f(dqhd dqhdVar) {
        return (dqgm) dqhdVar.bC();
    }

    public final void aW() {
        bk().a();
        ComposeView composeView = this.ag;
        if (composeView == null) {
            fdbq.c("contentComposeView");
            composeView = null;
        }
        composeView.setVisibility(0);
    }

    @Override // defpackage.dpxo
    protected final void aZ(dpgl dpglVar) {
        bk().b(dpglVar.l, dpglVar.m);
    }

    @Override // defpackage.ea
    public final void ai() {
        super.ai();
        dqir dqirVarR = r();
        dqirVarR.b();
        dqbn dqbnVar = (dqbn) dqirVarR.b;
        dqbnVar.f();
        dqbnVar.e().release();
        dqbnVar.b.f(false);
        dqbnVar.c.f(false);
    }

    @Override // defpackage.ea
    public final void ap(View view, Bundle bundle) {
        view.getClass();
        this.ag = (ComposeView) view.findViewById(R.id.screen_content_compose_view);
        bS();
        bL();
    }

    @Override // defpackage.dpxo
    public final void bf() {
        dqfz dqfzVar = ((dqgm) bC()).c;
        Object objC = ((dqgm) bC()).a.c();
        dqgo dqgoVar = dqgn.b;
        dqfy.a(dqfzVar, objC != dqgoVar, false, (dqbw) r().g.c(), 2);
        boolean z = ((dqgm) bC()).i;
        dqir dqirVarR = r();
        dqirVarR.b();
        dqirVarR.b.c();
        fdlr fdlrVar = this.ai;
        if (fdlrVar != null) {
            fdlrVar.t(null);
        }
        ComposeView composeView = null;
        this.ai = null;
        ComposeView composeView2 = this.ag;
        if (composeView2 == null) {
            fdbq.c("contentComposeView");
        } else {
            composeView = composeView2;
        }
        composeView.f();
    }

    @Override // defpackage.dpxo
    public final void bg() {
        AudioManager audioManager = this.c;
        if (audioManager == null) {
            fdbq.c("audioManager");
            audioManager = null;
        }
        int mode = audioManager.getMode();
        if (mode != 2 && mode != 3) {
            fdil.d(bH(), null, null, new dqgt(this, null), 3);
        } else {
            ((ekrd) a.h().h("com/google/android/libraries/compose/voice/ui/screen/VoiceScreen", "onOpen", 70, "VoiceScreen.kt")).q("Cannot record audio while a call is in progress.");
            bj(this, R.string.voice_recording_call_in_progress_description, R.string.start_recording_when_call_end, new View.OnClickListener() { // from class: dqgq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.bg();
                }
            });
        }
    }

    public final void bh() {
        aW();
        dqgw dqgwVar = new dqgw(((dqgm) bC()).e);
        ComposeView composeView = this.ag;
        if (composeView == null) {
            fdbq.c("contentComposeView");
            composeView = null;
        }
        composeView.a(new hxd(-2005834357, true, new dqgz(this, dqgwVar)));
        if (this.ai == null) {
            this.ai = fdil.d(bH(), null, null, new dqhc(this, null), 3);
        }
    }

    public final dnhb e() {
        dnhb dnhbVar = this.b;
        if (dnhbVar != null) {
            return dnhbVar;
        }
        fdbq.c("permissionsManager");
        return null;
    }

    public final dqir r() {
        dqir dqirVar = this.d;
        if (dqirVar != null) {
            return dqirVar;
        }
        fdbq.c("uiAdapter");
        return null;
    }

    @Override // defpackage.dpvx
    public final dpvw s() {
        return null;
    }

    @Override // defpackage.dpxo
    public final dpxe t() {
        return this.e;
    }
}
