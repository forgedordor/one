package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjya {
    public final fdjx a;
    public final fcsu b;
    private final fcyh c;
    private final fcsu d;
    private final Context e;
    private final fcsu f;
    private final fcsu g;
    private final eygg h;
    private final fcsu i;

    public cjya(fcyh fcyhVar, fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, Context context, fcsu fcsuVar3, fcsu fcsuVar4, eygg eyggVar, fcsu fcsuVar5) {
        fcyhVar.getClass();
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        context.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        eyggVar.getClass();
        fcsuVar5.getClass();
        this.c = fcyhVar;
        this.a = fdjxVar;
        this.d = fcsuVar;
        this.b = fcsuVar2;
        this.e = context;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.h = eyggVar;
        this.i = fcsuVar5;
    }

    public final int a(emfc emfcVar) {
        return emfcVar == emfc.RCS_PROVISIONING_PROMPT_SEEN ? ((cpdm) this.g.b()).a() + 1 : ((cpdm) this.g.b()).a();
    }

    public final Object b(emfe emfeVar, emfc emfcVar, Integer num, elzz elzzVar, fcxy fcxyVar) {
        Object objA = fdin.a(eicg.a(this.c), new cjxw(null, emfeVar, emfcVar, num, elzzVar, this), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    public final void c(emff emffVar) {
        ailn ailnVarA = ((aimb) this.d.b()).a();
        ailnVarA.d(emxt.UMA_RCS_PROVISIONING_UI_INTERACTION);
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        elrw elrwVar = (elrw) elrx.a.createBuilder();
        elrwVar.getClass();
        emka.e(elrwVar);
        emka.d(emffVar, elrwVar);
        elvs elvsVarB = dhia.b(this.e);
        elvsVarB.getClass();
        emka.b(elvsVarB, elrwVar);
        String strB = ((crqx) this.f.b()).b();
        strB.getClass();
        emka.c(strB, elrwVar);
        elrx elrxVarA = emka.a(elrwVar);
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.t = elrxVarA;
        ellhVar.b |= 4096;
        ailnVarA.j(ellgVar, aioj.LOG_SPEC_RCS_PROVISIONING_UI_EVENTS);
    }

    public final void d(emfc emfcVar) {
        emfcVar.getClass();
        auvw.k(this.a, null, null, new cjxu(this, emfcVar, null), 3);
    }

    public final void e(emfc emfcVar, emfe emfeVar) {
        emfcVar.getClass();
        fcsu fcsuVar = this.i;
        if (!((ajjp) fcsuVar.b()).b()) {
            ((ajjp) fcsuVar.b()).a();
            return;
        }
        if (emfeVar == null) {
            emfeVar = emfe.b(((crqx) this.f.b()).a.d("provisioning_ui_type", 0));
        } else {
            ((crqx) this.f.b()).a.j("provisioning_ui_type", emfeVar.t);
        }
        emfa emfaVar = (emfa) emff.a.createBuilder();
        emfaVar.getClass();
        emmp.c(emfcVar, emfaVar);
        int iA = a(emfcVar);
        emfaVar.copyOnWrite();
        emff emffVar = (emff) emfaVar.instance;
        emffVar.b |= 8;
        emffVar.e = iA;
        if (emfeVar != null) {
            emmp.d(emfeVar, emfaVar);
        }
        emff emffVarA = emmp.a(emfaVar);
        elrw elrwVar = (elrw) elrx.a.createBuilder();
        elrwVar.getClass();
        emka.e(elrwVar);
        emka.d(emffVarA, elrwVar);
        elvs elvsVarB = dhia.b(this.e);
        elvsVarB.getClass();
        emka.b(elvsVarB, elrwVar);
        String strB = ((crqx) this.f.b()).b();
        strB.getClass();
        emka.c(strB, elrwVar);
        eygg eyggVar = this.h;
        elrx elrxVarA = emka.a(elrwVar);
        aivj aivjVar = (aivj) eyggVar.b();
        long jLongValue = dhkl.a().longValue();
        if (!aivjVar.e().isPresent()) {
            aivjVar.a.k("first_rcs_provisioning_ui_event_time", jLongValue);
        }
        if (emfcVar == emfc.RCS_PROVISIONING_PROMPT_DECLINED) {
            aivj aivjVar2 = (aivj) eyggVar.b();
            long jLongValue2 = dhkl.a().longValue();
            if (!aivjVar2.c().isPresent()) {
                aivjVar2.a.k("first_time_rcs_declined_millis", jLongValue2);
            }
        }
        if (emfcVar == emfc.RCS_PROVISIONING_PROMPT_ACCEPTED) {
            aivj aivjVar3 = (aivj) eyggVar.b();
            long jLongValue3 = dhkl.a().longValue();
            if (!aivjVar3.b().isPresent()) {
                aivjVar3.a.k("first_time_rcs_accepted_millis", jLongValue3);
            }
        }
        if (emfeVar != null) {
            aivj aivjVar4 = (aivj) eyggVar.b();
            if (!aivjVar4.a().isPresent()) {
                aivjVar4.a.j("first_provisioning_ui_event_ui_type", emfeVar.t);
            }
        }
        ailn ailnVarA = ((aimb) this.d.b()).a();
        ailnVarA.d(emxt.UMA_RCS_PROVISIONING_UI_INTERACTION);
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.t = elrxVarA;
        ellhVar.b |= 4096;
        ailnVarA.j(ellgVar, aioj.LOG_SPEC_RCS_PROVISIONING_UI_EVENTS);
    }

    public final void f(boolean z, emfc emfcVar, String str) {
        emfcVar.getClass();
        str.getClass();
        auvw.k(this.a, null, null, new cjxx(this, z, emfcVar, str, null), 3);
    }

    public final void g(String str, emfc emfcVar) {
        str.getClass();
        emfcVar.getClass();
        auvw.k(this.a, null, null, new cjxy(this, emfcVar, str, null), 3);
    }

    public final void h(String str, emfc emfcVar) {
        emfcVar.getClass();
        auvw.k(this.a, null, null, new cjxz(this, emfcVar, str, null), 3);
    }

    public final void i(emfe emfeVar, emfc emfcVar, int i, emeu emeuVar, int i2, String str) {
        emfeVar.getClass();
        emfcVar.getClass();
        if (i == 0) {
            throw null;
        }
        emeuVar.getClass();
        str.getClass();
        auvw.k(this.a, null, null, new cjxv(this, emfeVar, emfcVar, i, emeuVar, i2, str, null), 3);
    }
}
