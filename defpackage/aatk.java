package defpackage;

import com.google.android.apps.messaging.datadonation.ui.DataDonationActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aatk implements eind {
    final /* synthetic */ aath a;

    public aatk(aath aathVar) {
        this.a = aathVar;
    }

    @Override // defpackage.eind
    public final /* bridge */ /* synthetic */ eine a(einb einbVar) {
        int iA = ((aaum) einbVar).a();
        aath aathVar = this.a;
        aathVar.e = iA;
        ((DataDonationActivity) aathVar.a.b()).finish();
        return eine.a;
    }
}
