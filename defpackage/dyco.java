package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyco {
    private static final String e = "dyco";
    public final dydh a;
    public final SelectedAccountDisc b;
    public final dyay c = new dycn(this);
    public final dxye d = new dxye() { // from class: dycj
        @Override // defpackage.dxye
        public final void a() {
            this.a.b();
        }
    };

    public dyco(SelectedAccountDisc selectedAccountDisc, dydh dydhVar) {
        this.a = dydhVar;
        this.b = selectedAccountDisc;
        dycv dycvVar = new dycv(dydhVar, selectedAccountDisc);
        ekfw ekfwVar = new ekfw();
        ekfwVar.h(dycvVar);
        dyif dyifVar = ((dydm) dydhVar).e;
        final ekgb ekgbVarG = ekfwVar.g();
        selectedAccountDisc.f = new View.OnTouchListener() { // from class: dyce
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i = 0;
                boolean zOnTouch = false;
                while (true) {
                    ekgb ekgbVar = ekgbVarG;
                    if (i >= ((ekoe) ekgbVar).c) {
                        break;
                    }
                    zOnTouch |= ((View.OnTouchListener) ekgbVar.get(i)).onTouch(view, motionEvent);
                    i++;
                }
                if (zOnTouch) {
                    ejwl.m(motionEvent.getAction() != 0, "Internal onTouchListeners may not consume ACTION_DOWN.");
                }
                return zOnTouch;
            }
        };
    }

    public final void a(Object obj) {
        exbf exbfVar = (exbf) exbg.a.createBuilder();
        exbfVar.copyOnWrite();
        exbg exbgVar = (exbg) exbfVar.instance;
        exbgVar.d = 8;
        exbgVar.b |= 2;
        exbfVar.copyOnWrite();
        exbg exbgVar2 = (exbg) exbfVar.instance;
        exbgVar2.f = 8;
        exbgVar2.b |= 32;
        exbfVar.copyOnWrite();
        exbg exbgVar3 = (exbg) exbfVar.instance;
        exbgVar3.e = 3;
        exbgVar3.b = 8 | exbgVar3.b;
        exbfVar.copyOnWrite();
        exbg exbgVar4 = (exbg) exbfVar.instance;
        exbgVar4.c = 36;
        exbgVar4.b |= 1;
        ((dydm) this.a).f.a(obj, (exbg) exbfVar.build());
    }

    public final void b() {
        final String string;
        dxzc dxzcVar;
        dydm dydmVar = (dydm) this.a;
        dydi dydiVar = dydmVar.b;
        if (!dydiVar.e()) {
            dyrf.a(new Runnable() { // from class: dycg
                @Override // java.lang.Runnable
                public final void run() {
                    SelectedAccountDisc selectedAccountDisc = this.a.b;
                    selectedAccountDisc.setContentDescription(null);
                    int[] iArr = ley.a;
                    selectedAccountDisc.setImportantForAccessibility(4);
                }
            });
            return;
        }
        SelectedAccountDisc selectedAccountDisc = this.b;
        ejwi ejwiVar = dydmVar.h;
        Context context = selectedAccountDisc.getContext();
        if (dydiVar.b().isEmpty()) {
            string = context.getString(R.string.og_account_particle_disc_no_accounts_available_a11y);
        } else {
            Object objA = dydiVar.a();
            if (objA == null) {
                string = context.getString(R.string.og_account_and_settings) + "\n" + context.getString(R.string.og_choose_an_account_title);
            } else {
                AccountParticleDisc accountParticleDisc = selectedAccountDisc.c;
                Object obj = accountParticleDisc.l;
                String strQ = "";
                if (!objA.equals(obj)) {
                    Log.w(e, String.format("Disc account not the same as selected account.%s", obj == null ? " Disc account null" : ""));
                }
                dxxk dxxkVar = dydmVar.c;
                Object obj2 = accountParticleDisc.l;
                if (obj2 != null) {
                    String strB = dxxt.b(obj2, dxxkVar);
                    dxzf dxzfVar = accountParticleDisc.m;
                    String strConcat = null;
                    dxyz dxyzVar = (dxzfVar == null || (dxzcVar = dxzfVar.a) == null) ? null : (dxyz) dxzcVar.a().f();
                    String strC = dxyzVar == null ? null : dxyzVar.c();
                    if (strC != null) {
                        String strTrim = strC.trim();
                        if (!strTrim.isEmpty()) {
                            strConcat = !strTrim.endsWith(".") ? String.valueOf(strTrim).concat(".") : strTrim;
                        }
                    }
                    String strE = accountParticleDisc.e();
                    if (strConcat != null && strE != null) {
                        strQ = a.q(strConcat, strE, " ");
                    } else if (strConcat != null) {
                        strQ = strConcat;
                    } else if (strE != null) {
                        strQ = strE;
                    }
                    strQ = !strQ.isEmpty() ? a.q(strQ, strB, "\n") : strB;
                }
                string = context.getString(R.string.og_account_and_settings);
                if (!strQ.isEmpty()) {
                    string = context.getString(R.string.og_signed_in_as_account, strQ) + "\n" + string;
                }
            }
        }
        dyrf.a(new Runnable() { // from class: dych
            @Override // java.lang.Runnable
            public final void run() {
                SelectedAccountDisc selectedAccountDisc2 = this.a.b;
                selectedAccountDisc2.setContentDescription(string);
                int[] iArr = ley.a;
                selectedAccountDisc2.setImportantForAccessibility(1);
            }
        });
    }

    public final void c() {
        final dydi dydiVar = ((dydm) this.a).b;
        if (dydiVar.e()) {
            dyrf.a(new Runnable() { // from class: dyci
                @Override // java.lang.Runnable
                public final void run() {
                    dyco dycoVar = this.a;
                    dycoVar.b.c.l(dydiVar.a());
                    dycoVar.b();
                }
            });
        }
    }
}
