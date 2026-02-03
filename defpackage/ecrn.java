package defpackage;

import android.os.CountDownTimer;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ecrn extends CountDownTimer {
    final /* synthetic */ exng a;
    final /* synthetic */ ecro b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecrn(ecro ecroVar, long j, exng exngVar) {
        super(j, 100L);
        this.a = exngVar;
        this.b = ecroVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        ecro ecroVar = this.b;
        ecroVar.e.b(ecroVar.j(this.a));
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }
}
