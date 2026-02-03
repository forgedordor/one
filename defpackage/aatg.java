package defpackage;

import com.google.android.apps.messaging.datadonation.ui.DataDonationActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aatg extends abs {
    final /* synthetic */ aath a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aatg(aath aathVar) {
        super(true);
        this.a = aathVar;
    }

    @Override // defpackage.abs
    public final void b() {
        aath aathVar = this.a;
        aathVar.e = 2;
        h(false);
        ((DataDonationActivity) aathVar.a.b()).c().d();
    }
}
