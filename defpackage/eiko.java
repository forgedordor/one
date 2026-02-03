package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiko {
    public static defe a(final defe defeVar) {
        final eiik eiikVarB = eiik.b();
        return new defe() { // from class: eikm
            @Override // defpackage.defe
            public final void d(Exception exc) {
                eiik eiikVar = eiikVarB;
                eiik eiikVarG = eiik.g();
                eiik.e(eiikVar);
                try {
                    defeVar.d(exc);
                } finally {
                    eiik.e(eiikVarG);
                }
            }
        };
    }

    public static defh b(final defh defhVar) {
        final eiik eiikVarB = eiik.b();
        return new defh() { // from class: eikn
            @Override // defpackage.defh
            public final void e(Object obj) {
                eiik eiikVar = eiikVarB;
                eiik eiikVarG = eiik.g();
                eiik.e(eiikVar);
                try {
                    defhVar.e(obj);
                } finally {
                    eiik.e(eiikVarG);
                }
            }
        };
    }
}
