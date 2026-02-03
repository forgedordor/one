package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wbu implements dnjk {
    final /* synthetic */ wbv a;

    public wbu(wbv wbvVar) {
        this.a = wbvVar;
    }

    @Override // defpackage.dnjk
    public final void a(final String str) {
        str.getClass();
        if (str.length() == 0) {
            str = null;
        }
        this.a.b.c(new fdap() { // from class: wbt
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                vvw vvwVar = (vvw) obj;
                vvwVar.getClass();
                String str2 = vvwVar.a;
                String str3 = str;
                return !fdbq.f(str2, str3) ? vvw.c(vvwVar, str3, null, null, false, null, null, false, 1, null, 1790) : vvwVar;
            }
        });
    }
}
