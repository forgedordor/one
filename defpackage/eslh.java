package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eslh {
    public static esca a(String str, String str2) {
        return esca.d(new esla(str, str2), esle.class);
    }

    public static esca b(final String str, final eslg eslgVar) {
        esbz esbzVarC = esca.c(esle.class);
        esbzVarC.b(new escr(Context.class, 1, 0));
        esbzVarC.c = new escf() { // from class: eslf
            @Override // defpackage.escf
            public final Object a(escc esccVar) {
                return new esla(str, eslgVar.a((Context) esccVar.e(Context.class)));
            }
        };
        return esbzVarC.a();
    }
}
