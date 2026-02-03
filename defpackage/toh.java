package defpackage;

import android.R;
import com.google.android.apps.messaging.cloudstore.fi.FiAccountConfirmationActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class toh implements efzm {
    public final FiAccountConfirmationActivity a;
    public final aukz b;
    public final czqg c;
    public int e = 2;
    public boolean d = false;

    public toh(FiAccountConfirmationActivity fiAccountConfirmationActivity, efxf efxfVar, aukz aukzVar, czqg czqgVar) {
        this.a = fiAccountConfirmationActivity;
        this.b = aukzVar;
        this.c = czqgVar;
        efxfVar.g(egaq.g(fiAccountConfirmationActivity));
        efxfVar.e(this);
    }

    @Override // defpackage.efzm
    public final void a(efzk efzkVar) {
        cg cgVar = new cg(this.a.a());
        efwo efwoVarA = efzkVar.a();
        tou touVar = (tou) tov.a.createBuilder();
        int i = this.e;
        touVar.copyOnWrite();
        tov tovVar = (tov) touVar.instance;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        tovVar.c = i2;
        tovVar.b |= 1;
        tov tovVar2 = (tov) touVar.build();
        toj tojVar = new toj();
        eyhj.e(tojVar);
        ehok.b(tojVar, efwoVarA);
        ehog.a(tojVar, tovVar2);
        cgVar.D(R.id.content, tojVar);
        cgVar.c();
    }

    @Override // defpackage.efzm
    public final void c(efyg efygVar) {
        throw new IllegalStateException("Unexpected account error in internal activity", efygVar);
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void d() {
    }
}
