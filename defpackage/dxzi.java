package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.onegoogle.account.disc.BadgeFrameLayout;
import com.google.android.libraries.onegoogle.account.disc.DrawableBadgeViewHolder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxzi extends AnimatorListenerAdapter {
    final /* synthetic */ dxyz a;
    final /* synthetic */ DrawableBadgeViewHolder b;

    public dxzi(DrawableBadgeViewHolder drawableBadgeViewHolder, dxyz dxyzVar) {
        this.a = dxyzVar;
        this.b = drawableBadgeViewHolder;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i;
        DrawableBadgeViewHolder drawableBadgeViewHolder = this.b;
        dsva dsvaVar = null;
        drawableBadgeViewHolder.d = null;
        if (this.a != null) {
            switch (r1.b()) {
                case APP_CUSTOM:
                    i = 8;
                    break;
                case YELLOW_ALERT:
                    i = 5;
                    break;
                case RED_ALERT:
                    i = 6;
                    break;
                case UPLOAD_ARROW:
                    i = 9;
                    break;
                case PAUSED_UPLOAD_ARROW:
                    i = 10;
                    break;
                case COMPLETED_CHECKMARK:
                    i = 11;
                    break;
                case SYNCING_OFF:
                    i = 12;
                    break;
                case OBAKE:
                    i = 7;
                    break;
                default:
                    i = 1;
                    break;
            }
            evsl evslVar = dyxw.a;
            dyxz dyxzVar = (dyxz) dyya.a.createBuilder();
            emmn emmnVar = (emmn) emmo.a.createBuilder();
            emmi emmiVar = (emmi) emmj.a.createBuilder();
            emmiVar.copyOnWrite();
            emmj emmjVar = (emmj) emmiVar.instance;
            emmjVar.c = i - 1;
            emmjVar.b |= 1;
            emmj emmjVar2 = (emmj) emmiVar.build();
            emmnVar.copyOnWrite();
            emmo emmoVar = (emmo) emmnVar.instance;
            emmjVar2.getClass();
            emmoVar.d = emmjVar2;
            emmoVar.c |= 2;
            emmo emmoVar2 = (emmo) emmnVar.build();
            dyxzVar.copyOnWrite();
            dyya dyyaVar = (dyya) dyxzVar.instance;
            emmoVar2.getClass();
            dyyaVar.c = emmoVar2;
            dyyaVar.b |= 1;
            dsvaVar = new dsva(evslVar, (dyya) dyxzVar.build());
        }
        drawableBadgeViewHolder.e = dsvaVar;
        dyyb dyybVar = drawableBadgeViewHolder.c;
        if (dyybVar == null) {
            return;
        }
        BadgeFrameLayout badgeFrameLayout = drawableBadgeViewHolder.a;
        badgeFrameLayout.gW(dyybVar);
        dsva dsvaVar2 = drawableBadgeViewHolder.e;
        if (dsvaVar2 != null) {
            badgeFrameLayout.c(drawableBadgeViewHolder.c, dsvaVar2);
        } else {
            badgeFrameLayout.b(drawableBadgeViewHolder.c);
        }
    }
}
