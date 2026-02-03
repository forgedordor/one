package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhnx extends dhny {
    private final fctc b;

    public dhnx(final Context context) {
        context.getClass();
        this.b = fctd.a(new fdae() { // from class: dhnw
            @Override // defpackage.fdae
            public final Object invoke() {
                erde erdeVar = new erde();
                erdeVar.c(context, "moirai_keyset", "moirai_pref");
                erdeVar.b("android-keystore://hades_moirai");
                erdeVar.d = this.a;
                return erdeVar.a().a();
            }
        });
    }

    @Override // defpackage.dhny
    protected final eqso a() {
        Object objA = this.b.a();
        objA.getClass();
        return (eqso) objA;
    }
}
