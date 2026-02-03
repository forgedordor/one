package defpackage;

import androidx.preference.Preference;

/* compiled from: PG */
/* loaded from: classes3.dex */
class cunk implements egzv<egbs> {
    final /* synthetic */ Preference a;
    final /* synthetic */ cunu b;

    public cunk(cunu cunuVar, Preference preference) {
        this.a = preference;
        this.b = cunuVar;
    }

    @Override // defpackage.egzv
    public final void a(Throwable th) {
        cunu.a.s("Error retrieving account", th);
        this.b.f.e().af(this.a);
    }

    @Override // defpackage.egzv
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b.f.e().af(this.a);
    }

    @Override // defpackage.egzv
    public final /* synthetic */ void hn() {
    }
}
