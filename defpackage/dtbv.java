package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtbv extends dtbz {
    final /* synthetic */ dtbw a;

    public dtbv(dtbw dtbwVar) {
        this.a = dtbwVar;
    }

    @Override // defpackage.dtbz
    public final void a(long j) {
        dtbw dtbwVar = this.a;
        dtbwVar.c++;
        Animator animator = dtbwVar.a;
        if (dtbwVar.a(animator) || animator.isStarted()) {
            return;
        }
        if (dtbwVar.b != -1 && dtbwVar.c >= 0) {
            return;
        }
        animator.start();
    }
}
