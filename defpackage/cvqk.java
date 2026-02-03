package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvqk extends fcyz implements fdat {
    final /* synthetic */ cvqp a;
    final /* synthetic */ ekgb b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvqk(fcxy fcxyVar, cvqp cvqpVar, ekgb ekgbVar) {
        super(2, fcxyVar);
        this.a = cvqpVar;
        this.b = ekgbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvqk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        cvqu cvquVar;
        crnc crncVar;
        alqm alqmVarG;
        Optional optionalF;
        fctl.b(obj);
        ekgb ekgbVar = this.b;
        ekgbVar.getClass();
        if (((Boolean) ((cczi) cvqr.a.get()).e()).booleanValue() && ekgbVar.size() == 1) {
            ResolvedRecipient resolvedRecipient = (ResolvedRecipient) ekgbVar.get(0);
            cvquVar = (resolvedRecipient.g().q() && resolvedRecipient.h() == alwm.MODIFIED_COUNTRY_CODE && resolvedRecipient.e() != null) ? new cvqu(true, resolvedRecipient) : cvqs.a;
        } else {
            cvquVar = cvqs.a;
        }
        ResolvedRecipient resolvedRecipient2 = cvquVar.b;
        if (resolvedRecipient2 == null || (alqmVarG = resolvedRecipient2.g()) == null || (optionalF = alqmVarG.f()) == null || (crncVar = (crnc) optionalF.orElse(new crnc(0))) == null) {
            crncVar = new crnc(0);
        }
        if (!cvquVar.a) {
            return null;
        }
        cvqp cvqpVar = this.a;
        Context context = cvqpVar.b;
        String string = context.getResources().getString(R.string.conversation_country_code_popup_paragraph_2, crncVar, !crncVar.b() ? cvqpVar.f.z(crncVar) : "");
        tdq tdqVar = new tdq(djrr.bT);
        String string2 = context.getResources().getString(R.string.add_country_code_banner_button);
        string2.getClass();
        return new tdo("add_country_code", null, string, tdqVar, new tdk(string2, new cvql(cvqpVar, cvquVar)), null, false, null, new cvqm(cvqpVar, cvquVar), 992);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cvqk cvqkVar = new cvqk(fcxyVar, this.a, this.b);
        cvqkVar.c = obj;
        return cvqkVar;
    }
}
