package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.cloudstore.accounts.FiAccountActivity;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tmd implements efzm {
    public final FiAccountActivity a;
    public final egld b;
    public final efxf c;
    public final aukz d;
    public final czqg e;
    public final appb f;
    private final aoot i;
    public int h = 2;
    public boolean g = false;

    public tmd(FiAccountActivity fiAccountActivity, egld egldVar, efxf efxfVar, czqg czqgVar, appb appbVar, aukz aukzVar, aoot aootVar) {
        this.a = fiAccountActivity;
        this.b = egldVar;
        this.c = efxfVar;
        this.d = aukzVar;
        this.e = czqgVar;
        this.f = appbVar;
        this.i = aootVar;
        egap egapVarE = egaq.e(fiAccountActivity);
        if (appbVar.a()) {
            ((egam) egapVarE).a = ekgb.r(tmk.class);
        }
        efxfVar.g(egapVarE.a());
        efxfVar.e(this);
    }

    @Override // defpackage.efzm
    public final void a(efzk efzkVar) throws IOException {
        FiAccountActivity fiAccountActivity = this.a;
        boolean booleanExtra = fiAccountActivity.getIntent().getBooleanExtra("RCS_IS_ON", false);
        if (this.f.a() && (!booleanExtra || this.i.a())) {
            efwo efwoVarA = efzkVar.a();
            int i = this.h;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            Intent intentB = tlz.b(fiAccountActivity);
            if (((Boolean) cpyl.a.e()).booleanValue()) {
                intentB.putExtra("entry_point", i2);
            }
            efyp.c(intentB, efwoVarA);
            eiid.o(fiAccountActivity, intentB);
            fiAccountActivity.finish();
            return;
        }
        efwo efwoVarA2 = efzkVar.a();
        int i3 = this.h;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        ekrg ekrgVar = tpx.a;
        evsp evspVarA = evsp.a(i4);
        tpq tpqVar = new tpq();
        eyhj.e(tpqVar);
        ehok.b(tpqVar, efwoVarA2);
        ehog.a(tpqVar, evspVarA);
        cg cgVar = new cg(fiAccountActivity.a());
        cgVar.D(R.id.fragment_container, tpqVar);
        cgVar.c();
    }

    @Override // defpackage.efzm
    public final void c(efyg efygVar) {
        boolean z = false;
        if (this.f.a() && (efygVar.getCause() instanceof tmj)) {
            z = true;
        }
        if (!(efygVar instanceof efyn) && !(efygVar instanceof efym) && !z) {
            throw new IllegalStateException("Unexpected account selection error", efygVar);
        }
        int i = this.h;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        ekrg ekrgVar = tpx.a;
        evsp evspVarA = evsp.a(i2);
        tpq tpqVar = new tpq();
        eyhj.e(tpqVar);
        ehok.c(tpqVar, -1);
        ehog.a(tpqVar, evspVarA);
        cg cgVar = new cg(this.a.a());
        cgVar.D(R.id.fragment_container, tpqVar);
        cgVar.c();
        if (z) {
            Throwable cause = efygVar.getCause();
            cause.getClass();
            tmj tmjVar = (tmj) cause;
            tpx tpxVarH = tpqVar.H();
            int i3 = tmjVar.b;
            Throwable th = tmjVar.a;
            if (i3 == 0) {
                throw null;
            }
            if (i3 == 2) {
                tpxVarH.b();
            } else if (i3 == 3) {
                tpxVarH.c(th);
            }
        }
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void d() {
    }
}
