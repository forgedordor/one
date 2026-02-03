package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anui implements anuh {
    private final Context a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;

    public anui(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9) {
        this.a = context;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.g = fcsuVar5;
        this.f = fcsuVar6;
        this.h = fcsuVar7;
        this.i = fcsuVar8;
        this.j = fcsuVar9;
    }

    static boolean c(brvp brvpVar, boolean z) {
        return TextUtils.equals(brvpVar.g, true != z ? "EMERGENCY+SERVICE+PROVIDER" : "EMERGENCY+SERVICE+PROVIDER+DEMO");
    }

    private static brvp d(String str) {
        bbcf.d(str, 1);
        String[] strArr = ParticipantsTable.a;
        brvq brvqVar = new brvq();
        brvqVar.T(-2);
        brvqVar.S(-1);
        brvqVar.R(cssr.b(str));
        brvqVar.u(null);
        brvqVar.t(null);
        brvqVar.N(null);
        brvqVar.l(-1L);
        brvqVar.D(null);
        brvqVar.e(false);
        brvqVar.U(0);
        brvqVar.V(null);
        return brvqVar;
    }

    private final void e(brvp brvpVar) {
        Resources resources = this.a.getResources();
        if (TextUtils.equals(brvpVar.g, "ʼUNKNOWN_SENDER!ʼ")) {
            brvpVar.q(resources.getString(R.string.unknown_sender));
            brvpVar.u(brvpVar.h);
            brvpVar.l(-2L);
            return;
        }
        if (TextUtils.equals(brvpVar.g, "ʼWAP_PUSH_SI!ʼ")) {
            brvpVar.q(resources.getString(R.string.wap_push_from));
            brvpVar.u(brvpVar.h);
            brvpVar.l(-2L);
            return;
        }
        if (TextUtils.equals(brvpVar.g, ((cmum) this.c.b()).a(-1).i())) {
            brvpVar.q(resources.getString(R.string.spam_reporting_from));
            brvpVar.u(brvpVar.h);
            brvpVar.l(-2L);
            return;
        }
        fcsu fcsuVar = this.d;
        if (((aqbh) fcsuVar.b()).a() && c(brvpVar, false)) {
            brvpVar.q(resources.getString(R.string.recipient_title_satellite));
            brvpVar.u(brvpVar.h);
            brvpVar.l(-2L);
            return;
        }
        if (((aqbh) fcsuVar.b()).a() && c(brvpVar, true)) {
            brvpVar.q(resources.getString(R.string.recipient_title_satellite_demo));
            brvpVar.u(brvpVar.h);
            brvpVar.l(-2L);
            return;
        }
        fcsu fcsuVar2 = this.f;
        Optional optional = (Optional) fcsuVar2.b();
        if (optional.isPresent() && ((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue() && ((cgsa) optional.get()).r().equals(brvpVar.g)) {
            cgsa cgsaVar = (cgsa) ((Optional) fcsuVar2.b()).get();
            brvpVar.q(cgsaVar.s());
            brvpVar.u(cgsaVar.s());
            brvpVar.N(cgsaVar.c());
            brvpVar.l(-2L);
            brvpVar.J(3);
        }
    }

    private final void f(alqm alqmVar) {
        Optional optional = (Optional) ((eyig) this.e).a;
        Optional optional2 = (Optional) ((eyig) this.g).a;
        if (optional.isPresent() && optional2.isPresent()) {
            bxeu bxeuVar = (bxeu) optional2.get();
            alqmVar.n();
            if (bxeuVar.a()) {
                bxet bxetVar = (bxet) optional.get();
                alqmVar.n();
                bxetVar.d();
            }
        }
    }

    @Override // defpackage.anuh
    public final ParticipantsTable.BindData a(alqm alqmVar) {
        cczv cczvVar = alvx.a;
        if (((Boolean) new alvm().get()).booleanValue()) {
            String strN = alqmVar.n();
            strN.getClass();
            brvp brvpVarD = d(strN);
            String strL = alqmVar.l();
            strL.getClass();
            brvpVarD.I(strL);
            brvpVarD.q(ejwk.b(alqmVar.F().a));
            e(brvpVarD);
            if (alqmVar.A()) {
                brvpVarD.J(1);
            }
            if (((Boolean) this.i.b()).booleanValue()) {
                f(alqmVar);
            }
            return brvpVarD.a();
        }
        String strJ = alqmVar.j();
        strJ.getClass();
        fcsu fcsuVar = this.j;
        brvp brvpVarD2 = d(strJ);
        String strL2 = ((apzt) fcsuVar.b()).a() ? alqmVar.l() : alqmVar.o();
        strL2.getClass();
        brvpVarD2.I(strL2);
        brvpVarD2.q(ejwk.b(alqmVar.F().a));
        e(brvpVarD2);
        if (alqmVar.A()) {
            brvpVarD2.J(1);
        }
        if (alqmVar.z()) {
            fcsu fcsuVar2 = this.f;
            if (((Optional) fcsuVar2.b()).isPresent()) {
                brvpVarD2.J(3);
                brvpVarD2.N(((cgsa) ((Optional) fcsuVar2.b()).get()).c());
            }
        }
        if (((Boolean) this.i.b()).booleanValue()) {
            f(alqmVar);
        }
        return brvpVarD2.a();
    }

    @Override // defpackage.anuh
    public final ParticipantsTable.BindData b(qxf qxfVar) {
        brvp brvpVarC = a(((alrj) this.b.b()).s(qxfVar)).C();
        brvpVarC.l(qxfVar.f);
        brvpVarC.D(qxfVar.k);
        fcsu fcsuVar = this.h;
        chsl.b(brvpVarC, qxfVar.b, null);
        chsl chslVar = (chsl) fcsuVar.b();
        Uri uri = qxfVar.i;
        chslVar.a(brvpVarC, uri != null ? uri.toString() : null);
        if (brvpVarC.q < 0) {
            brvpVarC.l(-1L);
        }
        brvpVarC.p(qxfVar.g.longValue());
        e(brvpVarC);
        return brvpVarC.a();
    }
}
