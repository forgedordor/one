package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyjj extends dxzd {
    public boolean b;
    public Object c;
    private final dxxk d;
    private final dxzc e;
    private ekgp f = ekoj.a;

    public dyjj(Context context, dxxk dxxkVar, ejxr ejxrVar, lvj lvjVar, ejwi ejwiVar) {
        this.d = dxxkVar;
        dxyg dxygVar = new dxyg();
        dxygVar.a = ejwi.j(new dxyf(dyic.a(context, context.getResources().getColor(R.color.google_grey900), dyqv.f(context, ejwiVar).d(dyqt.DARK_YELLOW)), context.getString(R.string.og_important_account_alert_badge_a11y_label), dxza.YELLOW_ALERT));
        this.e = dxygVar.a();
        ((lvv) ejxrVar.get()).f(lvjVar, new lvz() { // from class: dyjh
            @Override // defpackage.lvz
            public final void a(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                dyjj dyjjVar = this.a;
                dyjjVar.b = zBooleanValue;
                dyjjVar.a(dyjjVar.c);
            }
        });
    }

    @Override // defpackage.dxzd
    protected final void a(Object obj) {
        ecem.c();
        this.c = obj;
        Object objJ = ejud.a;
        if (obj != null) {
            ddfh ddfhVar = (ddfh) dymu.a(this.d, obj, this.f, ddfh.a);
            if (ddfhVar != null && !this.b) {
                euab euabVar = ddfhVar.b;
                if (euabVar == null) {
                    euabVar = euab.a;
                }
                euaf euafVar = euabVar.b;
                if (euafVar == null) {
                    euafVar = euaf.a;
                }
                int iA = euad.a(euafVar.b);
                if (iA != 0 && iA == 3) {
                    objJ = ejwi.j(this.e);
                }
            }
        }
        this.a.m(objJ);
    }

    public final void b(ekgp ekgpVar) {
        this.f = ekgpVar;
        dyrf.a(new Runnable() { // from class: dyji
            @Override // java.lang.Runnable
            public final void run() {
                dyjj dyjjVar = this.a;
                dyjjVar.a(dyjjVar.c);
            }
        });
    }
}
