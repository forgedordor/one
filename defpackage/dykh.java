package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dykh extends dxzd {
    public final dyks b;
    public Object c;
    public ekgb d;
    public boolean e;
    private final dyaj f;
    private final Context g;

    public dykh(Context context, lvj lvjVar, dyaj dyajVar) {
        int i = ekgb.d;
        this.d = ekoe.a;
        this.g = context;
        this.f = dyajVar;
        this.b = new dyks(context);
        dyajVar.f(lvjVar, new lvz() { // from class: dykg
            @Override // defpackage.lvz
            public final void a(Object obj) {
                final dykh dykhVar = this.a;
                ecem.e(new Runnable() { // from class: dyke
                    @Override // java.lang.Runnable
                    public final void run() {
                        dykh dykhVar2 = dykhVar;
                        dykhVar2.a(dykhVar2.c);
                    }
                });
            }
        });
    }

    @Override // defpackage.dxzd
    protected final void a(Object obj) {
        Object objJ;
        ecem.c();
        this.c = obj;
        if (obj == null) {
            objJ = ejud.a;
        } else {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            ekfwVar.j(this.d);
            ekfwVar.h(this.c);
            ekgb ekgbVarG = ekfwVar.g();
            final dyaj dyajVar = this.f;
            if (dyajVar.c(ekgbVarG)) {
                Context context = this.g;
                dxyg dxygVar = new dxyg();
                dxygVar.a = ejwi.j(new dxyf(dyic.a(context, context.getColor(true != ((dypx) dyqv.e(context)).a ? R.color.google_grey900 : R.color.google_white), dypw.b(context, R.attr.ogRedColorOnSurface)), context.getString(R.string.og_critical_security_alert_badge_label_a11y), dxza.RED_ALERT));
                dxygVar.b = (this.e && ekis.q(ekgbVarG, new ejwm() { // from class: dykd
                    @Override // defpackage.ejwm
                    public final boolean a(Object obj2) {
                        return ekis.q(((dyko) dyajVar).r(obj2), new ejwm() { // from class: dykn
                            @Override // defpackage.ejwm
                            public final boolean a(Object obj3) {
                                dyal dyalVar = (dyal) obj3;
                                return dyalVar.a().g && !dyalVar.a().h;
                            }
                        });
                    }
                })) ? ejwi.j(new dxyi(null, this.b, null, 3)) : ejud.a;
                objJ = ejwi.j(dxygVar.a());
            } else {
                objJ = ejud.a;
            }
        }
        this.a.m(objJ);
    }
}
