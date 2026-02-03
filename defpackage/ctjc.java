package defpackage;

import com.google.android.apps.messaging.startchat.chip.ChipData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctjc {
    /* JADX WARN: Multi-variable type inference failed */
    public static final ChipData a(ajou ajouVar, alqm alqmVar) {
        ekgb ekgbVarB = ajouVar.b();
        if (!ekgbVarB.isEmpty()) {
            ekqh it = ekgbVarB.iterator();
            while (it.hasNext()) {
                if (((ajpk) it.next()).a.equals(alqmVar)) {
                    return new ChipData(alqmVar, ajouVar.d(), ajouVar.f(), ajouVar.a(), false, 16, null);
                }
            }
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
