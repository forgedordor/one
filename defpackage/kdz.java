package defpackage;

import android.view.inputmethod.InputMethodManager;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kdz extends fdbr implements fdae {
    final /* synthetic */ kea a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kdz(kea keaVar) {
        super(0);
        this.a = keaVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        Object systemService = this.a.a.getContext().getSystemService("input_method");
        systemService.getClass();
        return (InputMethodManager) systemService;
    }
}
