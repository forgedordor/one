package defpackage;

import android.view.KeyEvent;
import androidx.compose.foundation.ClickableElement;
import androidx.compose.foundation.CombinedClickableElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dli {
    public static final boolean a(KeyEvent keyEvent) {
        long jB = iqj.b(keyEvent);
        return iqg.a(jB, iqg.h) || iqg.a(jB, iqg.m) || iqg.a(jB, iqg.t) || iqg.a(jB, iqg.l);
    }

    public static final ics b(ics icsVar, ebk ebkVar, dne dneVar, boolean z, String str, jrw jrwVar, fdae fdaeVar) {
        return icsVar.a(dneVar instanceof dnk ? new ClickableElement(ebkVar, (dnk) dneVar, false, z, str, jrwVar, fdaeVar) : dneVar == null ? new ClickableElement(ebkVar, null, false, z, str, jrwVar, fdaeVar) : ebkVar != null ? dnh.a(ics.e, ebkVar, dneVar).a(new ClickableElement(ebkVar, null, false, z, str, jrwVar, fdaeVar)) : icj.g(ics.e, new dlg(dneVar, z, str, jrwVar, fdaeVar)));
    }

    public static /* synthetic */ ics c(ics icsVar, ebk ebkVar, dne dneVar, boolean z, String str, jrw jrwVar, fdae fdaeVar, int i) {
        boolean z2 = z | (!((i & 4) == 0));
        if ((i & 8) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            jrwVar = null;
        }
        return b(icsVar, ebkVar, dneVar, z2, str, jrwVar, fdaeVar);
    }

    public static /* synthetic */ ics e(ics icsVar, boolean z, String str, fdae fdaeVar, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        return icsVar.a(new ClickableElement(null, null, true, 1 == ((z ? 1 : 0) | (i & 1)), str, null, fdaeVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ics f(ics icsVar, ebk ebkVar, dne dneVar, boolean z, jrw jrwVar, fdae fdaeVar, fdae fdaeVar2, int i) {
        boolean z2 = (!((i & 4) == 0)) | z;
        jrw jrwVar2 = (i & 16) != 0 ? null : jrwVar;
        fdae fdaeVar3 = (i & 64) != 0 ? null : fdaeVar;
        return icsVar.a(dneVar instanceof dnk ? new CombinedClickableElement(ebkVar, dneVar, false, z2, jrwVar2, fdaeVar2, fdaeVar3) : dneVar == 0 ? new CombinedClickableElement(ebkVar, null, false, z2, jrwVar2, fdaeVar2, fdaeVar3) : ebkVar != null ? dnh.a(ics.e, ebkVar, dneVar).a(new CombinedClickableElement(ebkVar, null, false, z2, jrwVar2, fdaeVar2, fdaeVar3)) : icj.g(ics.e, new dlh(dneVar, z2, jrwVar2, fdaeVar2, fdaeVar3)));
    }

    public static /* synthetic */ ics g(ics icsVar, boolean z, fdae fdaeVar, fdae fdaeVar2, int i) {
        if ((i & 16) != 0) {
            fdaeVar = null;
        }
        return icsVar.a(new CombinedClickableElement(null, null, true, 1 == ((z ? 1 : 0) | (i & 1)), null, fdaeVar2, fdaeVar));
    }
}
