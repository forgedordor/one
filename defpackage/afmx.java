package defpackage;

import com.google.android.apps.messaging.multishare.chip.ChipData;
import com.google.android.apps.messaging.multishare.chip.ChipId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afmx {
    public static final ChipData a(ajlp ajlpVar) {
        return new ChipData(new ChipId.Conversation(ajlpVar.c()), ajlpVar.e(), null, ajlpVar.b(), !(eotp.a("bugle.crop_rcs_group_icon_in_multishare", "bugle") ? fdbq.f(cpbr.t(ajlpVar.b()), "g") : ajlpVar.a() > 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ChipData b(ajou ajouVar, alqm alqmVar) {
        ekgb ekgbVarB = ajouVar.b();
        if (!ekgbVarB.isEmpty()) {
            ekqh it = ekgbVarB.iterator();
            while (it.hasNext()) {
                if (((ajpk) it.next()).a.equals(alqmVar)) {
                    return new ChipData(new ChipId.Identity(alqmVar), ajouVar.d(), ajouVar.f(), ajouVar.a(), false, 16, null);
                }
            }
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
