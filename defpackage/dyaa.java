package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.libraries.onegoogle.account.disc.AvatarView;
import com.google.android.libraries.onegoogle.account.disc.RingFrameLayout;
import com.google.android.libraries.onegoogle.common.CirclePulseDrawable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyaa {
    public final AvatarView a;
    public final RingFrameLayout b;
    public dsva c;
    public dyyb d;
    public ejwi e;
    public ejwi f;
    private AnimatorSet g = new AnimatorSet();

    public dyaa(AvatarView avatarView, RingFrameLayout ringFrameLayout) {
        ejud ejudVar = ejud.a;
        this.e = ejudVar;
        this.f = ejudVar;
        this.a = avatarView;
        this.b = ringFrameLayout;
        avatarView.d();
        avatarView.g = new lbz() { // from class: dxzx
            @Override // defpackage.lbz
            public final void accept(Object obj) {
                ejwi ejwiVarJ = ejwi.j((Integer) obj);
                dyaa dyaaVar = this.a;
                dyaaVar.f = ejwiVarJ;
                dyaaVar.b(dyaaVar.e);
            }
        };
        avatarView.c(avatarView.d);
        ringFrameLayout.setVisibility(0);
    }

    public final void a(ejwi ejwiVar, boolean z) {
        Drawable dxzpVar;
        int i;
        if (this.g.isRunning()) {
            this.g.cancel();
        }
        if (!this.f.g()) {
            this.e = ejwiVar;
            return;
        }
        int iIntValue = ((Integer) this.f.c()).intValue();
        dsva dsvaVar = null;
        if (ejwiVar.g()) {
            dxyi dxyiVar = (dxyi) ejwiVar.c();
            if (dxyiVar.b != null) {
                dxzpVar = new dxzp(new dxzv(new dxzw(this.a.getResources())));
            } else {
                dyks dyksVar = dxyiVar.d;
                if (dyksVar == null) {
                    throw new IllegalStateException("RingContent must have a ring drawable factory.");
                }
                CirclePulseDrawable circlePulseDrawable = dyksVar.a;
                circlePulseDrawable.setAlpha(128);
                AnimatorSet animatorSet = dyksVar.b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    dyksVar.b.removeAllListeners();
                }
                int i2 = iIntValue + iIntValue;
                AnimatorSet animatorSetA = dyks.a(circlePulseDrawable, "firstPulseSize", i2, 950L, 900L);
                AnimatorSet animatorSetA2 = dyks.a(circlePulseDrawable, "secondPulseSize", i2, 900L, 834L);
                animatorSetA2.setStartDelay(400L);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(animatorSetA, animatorSetA2);
                dyksVar.b = animatorSet2;
                dyksVar.b.addListener(new dykr(dyksVar));
                dxzpVar = circlePulseDrawable;
                if (dyksVar.c) {
                    dyksVar.b.start();
                    dxzpVar = circlePulseDrawable;
                }
            }
        } else {
            dxzpVar = null;
        }
        int i3 = ekgb.d;
        ekfw ekfwVar = new ekfw();
        AvatarView avatarView = this.a;
        if (avatarView.e != null) {
            ObjectAnimator duration = ObjectAnimator.ofInt(avatarView, "currRingThickness", iIntValue, -1).setDuration(200L);
            duration.addListener(new dxzy(this));
            ekfwVar.h(duration);
        }
        if (dxzpVar != null) {
            ObjectAnimator duration2 = ObjectAnimator.ofInt(avatarView, "currRingThickness", -1, iIntValue).setDuration(200L);
            duration2.addListener(new dxzz(this, ejwiVar, dxzpVar));
            ekfwVar.h(duration2);
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(ekfwVar.g());
        this.g = animatorSet3;
        if (!z || avatarView.e == dxzpVar) {
            this.g.setDuration(0L);
        }
        this.g.start();
        if (ejwiVar.g() && (i = ((dxyi) ejwiVar.c()).c) != 0) {
            evsl evslVar = dyxw.a;
            dyxz dyxzVar = (dyxz) dyya.a.createBuilder();
            emmn emmnVar = (emmn) emmo.a.createBuilder();
            emmk emmkVar = (emmk) emmm.a.createBuilder();
            emmkVar.copyOnWrite();
            emmm emmmVar = (emmm) emmkVar.instance;
            emmmVar.c = i - 1;
            emmmVar.b |= 1;
            emmnVar.copyOnWrite();
            emmo emmoVar = (emmo) emmnVar.instance;
            emmm emmmVar2 = (emmm) emmkVar.build();
            emmmVar2.getClass();
            emmoVar.f = emmmVar2;
            emmoVar.c |= 8;
            dyxzVar.copyOnWrite();
            dyya dyyaVar = (dyya) dyxzVar.instance;
            emmo emmoVar2 = (emmo) emmnVar.build();
            emmoVar2.getClass();
            dyyaVar.c = emmoVar2;
            dyyaVar.b |= 1;
            dsvaVar = new dsva(evslVar, (dyya) dyxzVar.build());
        }
        this.c = dsvaVar;
        dyyb dyybVar = this.d;
        if (dyybVar == null) {
            return;
        }
        RingFrameLayout ringFrameLayout = this.b;
        ringFrameLayout.gW(dyybVar);
        dsva dsvaVar2 = this.c;
        if (dsvaVar2 != null) {
            ringFrameLayout.c(this.d, dsvaVar2);
        } else {
            ringFrameLayout.b(this.d);
        }
    }

    final void b(ejwi ejwiVar) {
        ecem.c();
        a(ejwiVar, false);
    }
}
