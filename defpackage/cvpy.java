package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvpy extends fcyz implements fdat {
    final /* synthetic */ cvqd a;
    final /* synthetic */ ekgb b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvpy(fcxy fcxyVar, cvqd cvqdVar, ekgb ekgbVar) {
        super(2, fcxyVar);
        this.a = cvqdVar;
        this.b = ekgbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvpy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        cvqi cvqiVar;
        alqm alqmVarG;
        fctl.b(obj);
        ekgb ekgbVar = this.b;
        ekgbVar.getClass();
        if (((Boolean) ((cczi) cvqf.a.get()).e()).booleanValue() && ekgbVar.size() == 1) {
            ResolvedRecipient resolvedRecipient = (ResolvedRecipient) ekgbVar.get(0);
            cvqiVar = (resolvedRecipient.g().q() && resolvedRecipient.h() == alwm.MODIFIED_AREA_CODE && resolvedRecipient.e() != null) ? new cvqi(true, resolvedRecipient) : cvqg.a;
        } else {
            cvqiVar = cvqg.a;
        }
        alqj alqjVarG = null;
        if (!cvqiVar.a) {
            return null;
        }
        cvqd cvqdVar = this.a;
        Context context = cvqdVar.b;
        Resources resources = context.getResources();
        ResolvedRecipient resolvedRecipient2 = cvqiVar.b;
        if (resolvedRecipient2 != null && (alqmVarG = resolvedRecipient2.g()) != null) {
            alqjVarG = alqmVarG.G(true);
        }
        String string = resources.getString(R.string.conversation_area_code_popup_paragraph_2, alqjVarG);
        tdq tdqVar = new tdq(djrr.bT);
        String string2 = context.getResources().getString(R.string.add_area_code_banner_button);
        string2.getClass();
        return new tdo("add_area_code", null, string, tdqVar, new tdk(string2, new cvpz(cvqdVar, cvqiVar)), null, false, null, new cvqa(cvqdVar, cvqiVar), 992);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cvpy cvpyVar = new cvpy(fcxyVar, this.a, this.b);
        cvpyVar.c = obj;
        return cvpyVar;
    }
}
