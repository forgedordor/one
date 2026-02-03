package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aclc implements eind {
    final /* synthetic */ ackz a;

    public aclc(ackz ackzVar) {
        this.a = ackzVar;
    }

    @Override // defpackage.eind
    public final /* bridge */ /* synthetic */ eine a(einb einbVar) {
        acmr acmrVar = new acmr();
        eyhj.e(acmrVar);
        ackz ackzVar = this.a;
        cg cgVar = new cg(ackzVar.a.a());
        cgVar.E(R.anim.enter_right, R.anim.exit_left);
        cgVar.D(R.id.advanced_feedback_fragment_container, acmrVar);
        cgVar.c();
        ackzVar.d = 3;
        return eine.a;
    }
}
