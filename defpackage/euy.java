package defpackage;

import androidx.compose.foundation.selection.ToggleableElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class euy {
    /* JADX WARN: Multi-variable type inference failed */
    public static final ics a(ics icsVar, boolean z, ebk ebkVar, dne dneVar, boolean z2, jrw jrwVar, fdap fdapVar) {
        return icsVar.a(dneVar instanceof dnk ? new ToggleableElement(z, ebkVar, dneVar, false, z2, jrwVar, fdapVar) : dneVar == 0 ? new ToggleableElement(z, ebkVar, null, false, z2, jrwVar, fdapVar) : ebkVar != null ? dnh.a(ics.e, ebkVar, dneVar).a(new ToggleableElement(z, ebkVar, null, false, z2, jrwVar, fdapVar)) : icj.g(ics.e, new euw(dneVar, z, z2, jrwVar, fdapVar)));
    }
}
