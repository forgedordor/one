package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyom {
    public final dydh a;
    public final Context b;
    public final lvj c;
    public ekgb d;
    public ekgb e;
    public boolean f;
    private boolean g;
    private boolean h;

    public dyom(dydh dydhVar, Context context, lvj lvjVar) {
        int i = ekgb.d;
        ekgb ekgbVar = ekoe.a;
        this.d = ekgbVar;
        this.e = ekgbVar;
        this.a = dydhVar;
        this.b = context;
        this.c = lvjVar;
    }

    private final void d() {
        dyif dyifVar = ((dydm) this.a).e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final dyol a() {
        ekgb ekgbVarD;
        final lvx lvxVar;
        dyii dyiiVar = (dyii) ((dydm) this.a).e;
        dyix dyixVar = dyiiVar.g;
        if (this.g) {
            ekgbVarD = dyixVar.d();
        } else {
            int i = ekgb.d;
            ekgbVarD = ekoe.a;
        }
        int i2 = ekgb.d;
        ekgb ekgbVar = ekoe.a;
        ekgbVar.getClass();
        ekfw ekfwVar = new ekfw();
        ekfw ekfwVar2 = new ekfw();
        ekfwVar.j(this.e);
        if (this.h) {
            if (ekgbVarD.isEmpty()) {
                d();
            } else {
                d();
            }
        }
        ejwi ejwiVar = dyiiVar.i;
        if (this.f && ejwiVar.g()) {
            Object objC = ejwiVar.c();
            Context context = this.b;
            final lvj lvjVar = this.c;
            final ejud ejudVar = ejud.a;
            ejxr ejxrVar = new ejxr() { // from class: dyok
                @Override // defpackage.ejxr
                public final Object get() {
                    dydm dydmVar = (dydm) this.a.a;
                    return new dyir(dydmVar.e, dydmVar.b);
                }
            };
            String string = context.getString(R.string.og_recommended_actions_entry_point);
            if (string == null) {
                throw new NullPointerException("Null recommendedActions");
            }
            dyhj dyhjVarF = dyhk.f(ku.a(context, true != ((dypx) dyqv.e(context)).a ? R.drawable.yellow_alert_dark_vd : R.drawable.yellow_alert_vd));
            ((dyfa) dyhjVarF).b = ejwi.j(context.getString(R.string.og_important_account_alert_badge_a11y_label));
            dyhk dyhkVarD = dyhjVarF.d();
            dyhk dyhkVarG = dyhk.g(ku.a(context, R.drawable.safer_gshield_ic_outline_hero));
            String packageName = context.getPackageName();
            if (packageName == null) {
                throw new NullPointerException("Null appPackageName");
            }
            final dyjv dyjvVar = new dyjv(string, dyhkVarD, dyhkVarG, packageName);
            final dyjs dyjsVar = (dyjs) objC;
            ((lvv) ejxrVar.get()).f(lvjVar, new lvz() { // from class: dyjo
                @Override // defpackage.lvz
                public final void a(Object obj) {
                    Boolean bool = (Boolean) obj;
                    boolean zBooleanValue = bool.booleanValue();
                    dyjs dyjsVar2 = dyjsVar;
                    dyjsVar2.m = zBooleanValue;
                    dyjsVar2.a(dyjsVar2.i, dyjsVar2.l, dyjsVar2.h, bool.booleanValue());
                }
            });
            lvjVar.P().c(dyjsVar.g);
            ekfwVar.h(new dyes(new dyfc() { // from class: dyjp
                @Override // defpackage.dyfc
                public final dyfk a(Object obj) {
                    dyjs dyjsVar2 = dyjsVar;
                    dyjsVar2.i = obj;
                    Object obj2 = dyjsVar2.i;
                    if (obj2 != null) {
                        ejwi ejwiVar2 = ejudVar;
                        dyjsVar2.h = new dyjg(dyjvVar, lvjVar, dyjsVar2.c, dyjsVar2.d, dymu.b(dyjsVar2.a, obj2), ejwiVar2);
                        dyjsVar2.a(dyjsVar2.i, dyjsVar2.l, dyjsVar2.h, dyjsVar2.m);
                    } else {
                        dyjsVar2.h = null;
                    }
                    return dyjsVar2.h;
                }
            }));
        }
        ekgb ekgbVarG = ekfwVar.g();
        ekfwVar2.j(this.d);
        ekgb ekgbVarG2 = ekfwVar2.g();
        if (ekgbVarD.isEmpty() && ekgbVar.isEmpty() && ekgbVarG.isEmpty()) {
            lvxVar = null;
        } else {
            final dygc dygcVar = new dygc();
            dygcVar.a = ekgbVarG;
            ekfw ekfwVar3 = new ekfw();
            ekfwVar3.j(ekgbVar);
            ekfwVar3.j(ekgbVar);
            int i3 = ((ekoe) ekgbVarD).c;
            for (int i4 = 0; i4 < i3; i4++) {
                final dyit dyitVar = (dyit) ekgbVarD.get(i4);
                ekfwVar3.h(new dyes(new dyfc() { // from class: dyoj
                    @Override // defpackage.dyfc
                    public final dyfk a(Object obj) {
                        dyit dyitVar2 = dyitVar;
                        dyhs dyhsVarH = dyhu.h();
                        dyhsVarH.f(dyitVar2.b());
                        dyhw dyhwVar = (dyhw) dyhsVarH;
                        dyhwVar.a = dyitVar2.d();
                        dyhsVarH.e(dyitVar2.a());
                        dyhsVarH.g(dyitVar2.i());
                        dyhsVarH.h(dyitVar2.c());
                        dyhwVar.b = dyitVar2.e();
                        dyhwVar.c = dyitVar2.g();
                        dyhwVar.d = dyitVar2.f();
                        dyhsVarH.d(dyitVar2.h());
                        return new dyer(dyhsVarH.b());
                    }
                }));
            }
            dygcVar.b = ekfwVar3.g();
            lvxVar = new lvx();
            lvxVar.p(new lvy(ekgbVar), new lvz() { // from class: dygb
                @Override // defpackage.lvz
                public final void a(Object obj) {
                    int i5 = ekgb.d;
                    ekfw ekfwVar4 = new ekfw();
                    dygc dygcVar2 = dygcVar;
                    ekfwVar4.j(dygcVar2.a);
                    ekfwVar4.j((ekgb) obj);
                    ekfwVar4.j(dygcVar2.b);
                    lvxVar.m(ekfwVar4.g());
                }
            });
        }
        return new dyoi(lvxVar, ekgbVarG2.isEmpty() ? null : new lvy(ekgbVarG2));
    }

    final void b() {
        this.g = true;
    }

    final void c() {
        this.h = true;
    }
}
