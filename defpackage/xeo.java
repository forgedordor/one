package defpackage;

import android.os.Bundle;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class xeo implements piw, fdbl {
    final /* synthetic */ xfi a;

    public xeo(xfi xfiVar) {
        this.a = xfiVar;
    }

    @Override // defpackage.piw
    public final Bundle a() {
        Bundle bundle = new Bundle();
        ekrw ekrwVarH = xfi.a.h();
        ekrwVarH.X(eksq.a, "BugleComposeRow2");
        ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/InputsUiAdapterImpl", "createInputStateBundle", 457, "InputsUiAdapterImpl.kt");
        xfi xfiVar = this.a;
        ekrdVar.t("Persisting input display %s", xfiVar.r.c());
        bundle.putParcelable("input_display_key", (Parcelable) xfiVar.r.c());
        return bundle;
    }

    @Override // defpackage.fdbl
    public final fcsy b() {
        return new fdbo(0, this.a, xfi.class, "createInputStateBundle", "createInputStateBundle()Landroid/os/Bundle;", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof piw) && (obj instanceof fdbl)) {
            return fdbq.f(b(), ((fdbl) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
