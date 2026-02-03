package defpackage;

import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dysa extends abs {
    final /* synthetic */ dysc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dysa(dysc dyscVar) {
        super(false);
        this.a = dyscVar;
    }

    @Override // defpackage.abs
    public final void b() {
        dysc dyscVar = this.a;
        ExpressSignInLayout expressSignInLayout = dyscVar.ak;
        boolean z = false;
        if (expressSignInLayout != null && expressSignInLayout.b()) {
            z = true;
        }
        ejwl.b(z, "ExpressSignInLayout has to be initialized to handle back presses");
        dyscVar.ak.d(new dysm() { // from class: dysk
            @Override // defpackage.dysm
            public final void a(dytu dytuVar) {
                if (dytuVar.b) {
                    dytuVar.o.b();
                } else {
                    dytuVar.i();
                    dytuVar.c();
                }
            }
        });
    }
}
