package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aczq implements acyy {
    final /* synthetic */ aczr a;

    public aczq(aczr aczrVar) {
        this.a = aczrVar;
    }

    @Override // defpackage.acyy
    public final void a(adan adanVar, acyx acyxVar, aczf aczfVar) {
        adaj adajVar;
        String string;
        acyxVar.getClass();
        aczfVar.getClass();
        aoio aoioVar = aczfVar.c;
        if (aoioVar == null || aoioVar == aoio.a || ((acyxVar.d() != 3 || acyxVar.c() <= 1) && acyxVar.A() != cins.j)) {
            adajVar = (adaj) adanVar;
            string = null;
        } else {
            string = this.a.a.getString(R.string.conversation_not_available);
            adajVar = (adaj) adanVar;
        }
        adajVar.J = string;
    }
}
