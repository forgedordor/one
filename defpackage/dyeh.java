package defpackage;

import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyeh {
    public final ea a;
    public final dydh b;
    public final SelectedAccountDisc c;
    public final dyco d;

    public dyeh(ea eaVar, dydh dydhVar, SelectedAccountDisc selectedAccountDisc) {
        ejwl.b(true, "Activity or Fragment should be non-null but not both");
        this.a = eaVar;
        dydhVar.getClass();
        this.b = dydhVar;
        selectedAccountDisc.getClass();
        this.c = selectedAccountDisc;
        this.d = new dyco(selectedAccountDisc, dydhVar);
    }
}
