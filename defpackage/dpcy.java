package defpackage;

import com.google.android.libraries.compose.ui.composable.HugoHostFragment;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpcy implements fdpm {
    final /* synthetic */ HugoHostFragment a;

    public dpcy(HugoHostFragment hugoHostFragment) {
        this.a = hugoHostFragment;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            ((ekrd) HugoHostFragment.a.e().h("com/google/android/libraries/compose/ui/composable/HugoHostFragment$onCreateView$1$6$2", "emit", 185, "HugoHostFragment.kt")).q("Enabling back navigation handling since Hugo is open.");
        } else {
            ((ekrd) HugoHostFragment.a.e().h("com/google/android/libraries/compose/ui/composable/HugoHostFragment$onCreateView$1$6$2", "emit", 187, "HugoHostFragment.kt")).q("Disabling back navigation handling since Hugo is not open.");
        }
        abs absVar = this.a.am;
        if (absVar == null) {
            fdbq.c("onBackPressedCallback");
            absVar = null;
        }
        absVar.h(zBooleanValue);
        return fctx.a;
    }
}
