package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eibp {
    public eifn a;
    public boolean b;
    public eifn c;
    public boolean d;
    public eifp e;
    private final eg f;
    private final Context g;
    private eifn h;
    private boolean i;
    private boolean j;
    private eifp k;
    private eifp l;

    public eibp(eg egVar, Context context) {
        this.f = egVar;
        this.g = context;
    }

    static /* synthetic */ eifp B(eibp eibpVar, String str) {
        return eibpVar.D(str, null);
    }

    private final eiez C(eiez eiezVar) {
        eiez eiezVarE = eiez.e(eiezVar, eiez.d(((eigu) eygm.a(this.g, eigu.class)).aH()));
        eiezVarE.getClass();
        return eiezVarE;
    }

    private final eifp D(String str, eiez eiezVar) {
        if (!eidc.v()) {
            eigp eigpVarA = eigt.a(this.g);
            eigpVarA.getClass();
            return eiezVar != null ? eigpVarA.a.b(str, eiez.e((eiez) eigpVarA.b.b(), eiezVar), eigpVarA.d, "", "") : eigpVarA.a(str);
        }
        if (eiezVar == null) {
            eiezVar = eiey.a;
        }
        eiezVar.getClass();
        return eiiy.j(str, C(eiezVar));
    }

    private final String E(String str) {
        return str + " " + this.g.getClass().getSimpleName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void F(String str, String str2, Intent intent) {
        eiez eiezVarC;
        this.c = eidc.c();
        long j = eiid.a;
        eifn eifnVarS = eiid.s(intent);
        eiez eiezVarC2 = eifh.b;
        eiex eiexVarB = eiez.b();
        eiexVarB.a(eifh.c, new eidh() { // from class: eibi
            @Override // defpackage.eidh
            public final void a() {
            }
        });
        eiez eiezVarF = ((eiez) eiexVarB).f();
        if (eifnVarS != null) {
            eidc.g(eifnVarS);
            this.a = eifnVarS;
            eiezVarC2.getClass();
            eiezVarC = C(eiezVarC2);
        } else {
            eifn eifnVar = this.a;
            if (eifnVar != null) {
                eidc.g(eifnVar);
                eiezVarC2.getClass();
                eiezVarC = C(eiezVarC2);
            } else {
                this.j = eidc.w();
                eifn eifnVarC = eidc.c();
                boolean z = false;
                if ((eifnVarC instanceof eimt) && ((eimt) eifnVarC).a()) {
                    z = true;
                }
                if (!eidc.v() || z) {
                    eifn eifnVarF = eidc.f();
                    if (eifnVarF != null) {
                        this.k = eifnVarF;
                        eidc.g(eifnVarF);
                        this.l = eiiy.j(E(str), eiez.e(eiezVarF, eifh.a(eifg.INTENT_TO_ACTIVITY)));
                    } else {
                        this.k = eigt.a(this.g).f("", "", 0, E(str), eiez.e(eiezVarC2, eifh.a(eifg.INTENT_TO_ACTIVITY)));
                    }
                } else {
                    eiezVarC2.getClass();
                    eiezVarC2 = C(eiezVarC2);
                }
                this.a = eidc.c();
                eiezVarC = eiezVarC2;
            }
        }
        this.e = eiiy.j(E(str2), eiez.e(eiezVarC, eifh.a(eifg.ACTIVITY_CREATE)));
        ecem.e(new Runnable() { // from class: eibj
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a = null;
            }
        });
    }

    private final void G() {
        if (this.i) {
            this.a = null;
            this.i = false;
        }
    }

    private final void H() {
        eifn eifnVar = this.h;
        if (eifnVar != null) {
            this.a = eifnVar;
            this.h = null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [eifn, eifp] */
    private final void I() {
        ?? r1;
        if (this.b) {
            return;
        }
        synchronized (eiid.c) {
            r1 = eiid.d;
            eiid.d = null;
        }
        if (r1 != 0) {
            this.b = true;
            this.a = r1;
        }
    }

    private final void J() {
        eifp eifpVar = this.e;
        if (eifpVar == null) {
            return;
        }
        Objects.toString(eifpVar);
        throw new IllegalStateException("Expected lifecycleStepSpan to be null but was: ".concat(eifpVar.toString()));
    }

    public final eifp A() {
        eiez eiezVar = eiey.a;
        eiezVar.getClass();
        p("onSaveInstanceState", eiezVar);
        return new eibl(this);
    }

    public final eifp a() {
        eiez eiezVar = eicf.a;
        final eifp eifpVarD = D("finish", eicf.a);
        eifn eifnVarC = eidc.c();
        this.h = eifnVarC;
        eifnVarC.getClass();
        synchronized (eiid.c) {
            eiid.d = eifnVarC;
        }
        final eihz eihzVar = new eihz(eifnVarC);
        return new eifp() { // from class: eibf
            @Override // defpackage.eifp, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                eifpVarD.close();
                eihzVar.close();
            }
        };
    }

    public final eifp b() {
        J();
        return B(this, "onAttachedToWindow");
    }

    public final eifp c() {
        J();
        final eifp eifpVarB = B(this, "Back pressed");
        final eifp eifpVarK = eidc.k();
        return new eifp() { // from class: eibh
            @Override // defpackage.eifp, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                eifpVarB.close();
                eifpVarK.close();
            }
        };
    }

    public final eifp d() {
        H();
        p("onDestroy", eifh.a(eifg.ACTIVITY_DESTROY));
        return new eifp() { // from class: eibm
            @Override // defpackage.eifp, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                eibp eibpVar = this.a;
                eibpVar.q();
                eibpVar.o();
                eibpVar.a = null;
            }
        };
    }

    public final eifp e(Intent intent) {
        intent.getClass();
        F("Reintenting into", "onNewIntent", intent);
        return new eibn(this);
    }

    public final eifp f() {
        H();
        p("onPause", eifh.a(eifg.ACTIVITY_PAUSE));
        return new eibl(this);
    }

    public final eifp g() {
        this.c = eidc.c();
        eidc.g(this.a);
        final eifp eifpVarB = B(this, "onPostResume");
        return new eifp() { // from class: eibk
            @Override // defpackage.eifp, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                eifpVarB.close();
                eibp eibpVar = this;
                eibpVar.a = null;
                eibpVar.b = false;
                eidc.g(eibpVar.c);
                eibpVar.c = null;
            }
        };
    }

    public final eifp h() {
        G();
        I();
        p("onResume", eifh.a(eifg.ACTIVITY_RESUME));
        return new eibn(this);
    }

    public final eifp i() {
        G();
        I();
        p("onStart", eifh.a(eifg.ACTIVITY_START));
        return new eibn(this);
    }

    public final eifp j() {
        H();
        p("onStop", eifh.a(eifg.ACTIVITY_STOP));
        return new eibl(this);
    }

    public final eifp k() {
        J();
        return B(this, "onSupportNavigateUp");
    }

    public final eifp l() {
        J();
        return B(this, "onUserInteraction");
    }

    public final void m() {
        this.f.a().r(new eigm(eigt.a(this.g)));
    }

    public final void n(lva lvaVar) {
        int iOrdinal = lvaVar.ordinal();
        if (iOrdinal == 0) {
            if (this.d) {
                q();
                this.d = false;
                return;
            }
            return;
        }
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) {
            q();
        } else {
            Objects.toString(lvaVar);
            throw new UnsupportedOperationException("Unknown lifecycle: ".concat(lvaVar.toString()));
        }
    }

    public final void o() {
        this.i = true;
        eg egVar = this.f;
        if (egVar.isChangingConfigurations() || egVar.isFinishing()) {
            return;
        }
        this.a = null;
    }

    public final void p(String str, eiez eiezVar) {
        this.c = eidc.c();
        eiez eiezVarE = eiez.e(eifh.b, eiezVar);
        eifn eifnVar = this.a;
        if (eifnVar != null) {
            eidc.g(eifnVar);
            eiezVarE.getClass();
            eiezVarE = C(eiezVarE);
        } else {
            this.j = eidc.w();
            if (eidc.v()) {
                eiezVarE.getClass();
                eiezVarE = C(eiezVarE);
            } else {
                Context context = this.g;
                eigp eigpVarA = eigt.a(context);
                this.k = eigpVarA.a.b(context.getClass().getSimpleName() + ": " + str, eiez.e((eiez) eigpVarA.b.b(), eiezVarE), eigpVarA.d, "", "");
            }
            this.a = eidc.c();
        }
        this.e = eiiy.j(E(str), eiezVarE);
    }

    public final void q() {
        eifp eifpVar = this.e;
        if (eifpVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        eifpVar.close();
        this.e = null;
        if (this.j) {
            this.j = false;
            eidc.q();
        }
        eifp eifpVar2 = this.l;
        if (eifpVar2 != null) {
            eifpVar2.close();
        }
        this.l = null;
        eifp eifpVar3 = this.k;
        if (eifpVar3 != null) {
            eifpVar3.close();
        }
        this.k = null;
        eidc.g(this.c);
        this.c = null;
    }

    public final eifp r() {
        J();
        G();
        I();
        if (this.a == null) {
            return B(this, "onActivityResult");
        }
        final eifn eifnVarC = eidc.c();
        eidc.g(this.a);
        final eifp eifpVarB = B(this, "onActivityResult");
        return new eifp() { // from class: eibg
            @Override // defpackage.eifp, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                eifpVarB.close();
                eidc.g(eifnVarC);
            }
        };
    }

    public final eifp s() {
        return B(this, "onConfigurationChanged");
    }

    public final eifp t() {
        I();
        Intent intent = this.f.getIntent();
        intent.getClass();
        F("Intenting into", "onCreate", intent);
        return new eibn(this);
    }

    public final eifp u() {
        eifp eifpVarJ = eidc.j();
        if (eidc.v()) {
            return eifpVarJ;
        }
        Context context = this.g;
        final eieh eiehVarB = eigt.a(context).b("", "", 0, context.getClass(), "onCreatePanelMenu");
        return new eifp() { // from class: eibo
            @Override // defpackage.eifp, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                eiehVarB.close();
                eidc.q();
            }
        };
    }

    public final eifp v() {
        J();
        return B(this, "onMenuItemSelected");
    }

    public final eifp w() {
        J();
        return B(this, "onOptionsItemSelected");
    }

    public final eifp x() {
        J();
        return B(this, "onPictureInPictureModeChanged");
    }

    public final eifp y() {
        G();
        eiez eiezVar = eiey.a;
        eiezVar.getClass();
        p("onPostCreate", eiezVar);
        return new eibn(this);
    }

    public final eifp z() {
        return B(this, "onRequestPermissionsResult");
    }
}
