package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehuf {
    public static fbnd a(final fcsu fcsuVar, ehtz ehtzVar, esmm esmmVar, ejwi ejwiVar) {
        fbnd fbndVarD = fbnk.d(esmmVar.a(ehtzVar.a()), esrz.a(new fcsu() { // from class: ehua
            @Override // defpackage.fcsu
            public final Object b() {
                int i = ekgb.d;
                ekfw ekfwVar = new ekfw();
                ekfwVar.h(new ehue());
                ekfwVar.j((Iterable) fcsuVar.b());
                ekfwVar.h(new ehud());
                return ekfwVar.g();
            }
        }));
        return ehtzVar.c() != null ? fbnk.d(fbndVarD, new ehuc(ehtzVar)) : fbndVarD;
    }
}
