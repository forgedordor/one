package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaiw implements deeq {
    @Override // defpackage.deeq
    public final /* bridge */ /* synthetic */ Object a(defn defnVar) {
        defr defrVar = new defr();
        if (((defv) defnVar).d) {
            defrVar.c(new dcff(new Status(16, "Location request was cancelled. Please try again.")));
        } else if (defnVar.h() == null && defnVar.i() == null) {
            defrVar.c(new dcff(new Status(8, "Location unavailable.")));
        }
        defv defvVar = defrVar.a;
        return defvVar.h() != null ? defvVar : defnVar;
    }
}
