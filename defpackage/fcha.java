package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcha extends fbru {
    final /* synthetic */ fchb a;

    public fcha(fchb fchbVar) {
        this.a = fchbVar;
    }

    @Override // defpackage.fbru
    public final String a() {
        return this.a.b;
    }

    @Override // defpackage.fbru
    public final void c(fbrq fbrqVar) {
        fbrr fbrrVar = new fbrr();
        fbrrVar.b(new fbte(null, Collections.singletonList(new fbop(this.a.a))));
        fbrrVar.a = fbmw.a;
        fbrqVar.a(fbrrVar.a());
    }

    @Override // defpackage.fbru
    public final void b() {
    }
}
