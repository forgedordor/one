package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duvc implements dutu {
    final /* synthetic */ ejwi a;
    final /* synthetic */ Context b;

    public duvc(ejwi ejwiVar, Context context) {
        this.a = ejwiVar;
        this.b = context;
    }

    @Override // defpackage.dutu
    public final void a(String str, int i) {
        if (i == 1) {
            ejwi ejwiVar = this.a;
            if (ejwiVar.g()) {
                duac.d(this.b, (Class) ejwiVar.c(), str);
            }
        }
    }

    @Override // defpackage.dutu
    public final void b(String str, int i) {
        if (i == 0) {
            ejwi ejwiVar = this.a;
            if (ejwiVar.g()) {
                duac.e(this.b, (Class) ejwiVar.c(), str);
            }
        }
    }
}
