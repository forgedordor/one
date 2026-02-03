package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aabj {
    public static final dnce a = new dnce(-1000000001);
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/conversation2/screen/bottomsheets/reactionpicker/fragment/ReactionPickerFragmentPeer");
    public final aaao c;
    public final dpbr d;
    public final dpir e;
    public final fcsu f;
    public final fcsu g;
    public final aaar h;
    public final dnjh i;
    public final fctc j;
    public final fctc k;
    public final fctc l;
    public fdae m;
    public fdae n;
    public fdap o;
    public aaag p;
    public fdap q;
    public dpgl r;
    public final dnhq s;
    public final aabe t;
    public dpbq u;

    public aabj(aaao aaaoVar, dpbr dpbrVar, dpir dpirVar, fcsu fcsuVar, fcsu fcsuVar2, final Optional optional, final Optional optional2, final Optional optional3, dnga dngaVar, dnji dnjiVar, aaar aaarVar) {
        dpirVar.getClass();
        fcsuVar.getClass();
        dngaVar.getClass();
        this.c = aaaoVar;
        this.d = dpbrVar;
        this.e = dpirVar;
        this.f = fcsuVar;
        this.g = fcsuVar2;
        this.h = aaarVar;
        this.i = dnjiVar.a(dngaVar, a);
        this.j = fctd.a(new fdae() { // from class: aaaz
            @Override // defpackage.fdae
            public final Object invoke() {
                return (dnov) ((fcsu) optional.orElse(new fcsu() { // from class: aaaw
                    @Override // defpackage.fcsu
                    public final Object b() {
                        return new dnov(null, null, 255);
                    }
                })).b();
            }
        });
        this.k = fctd.a(new fdae() { // from class: aaba
            @Override // defpackage.fdae
            public final Object invoke() {
                return (dmyw) ((fcsu) optional3.orElse(new fcsu() { // from class: aaav
                    @Override // defpackage.fcsu
                    public final Object b() {
                        return new dmyw((dnbx) null, (dmiv) null, (fctc) null, false, false, false, false, 1023);
                    }
                })).b();
            }
        });
        this.l = fctd.a(new fdae() { // from class: aabb
            @Override // defpackage.fdae
            public final Object invoke() {
                return (dote) ((fcsu) optional2.orElse(new fcsu() { // from class: aaat
                    @Override // defpackage.fcsu
                    public final Object b() {
                        return new dote(false, false, false, false, 0.0f, false, 2047);
                    }
                })).b();
            }
        });
        this.s = new aabd(this);
        this.t = new aabe(this);
    }

    public static final void a(View view, dpgl dpglVar) {
        view.getBackground().setColorFilter(new PorterDuffColorFilter(dpglVar.d, PorterDuff.Mode.SRC_IN));
    }
}
