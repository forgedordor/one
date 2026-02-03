package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zvl {
    public final zvo a;
    private final ahax b;

    public zvl(zvo zvoVar, ahax ahaxVar) {
        zvoVar.getClass();
        ahaxVar.getClass();
        this.a = zvoVar;
        this.b = ahaxVar;
    }

    public static /* synthetic */ void a(final zvl zvlVar, final Long l, final anhj anhjVar, final int i, String str, fdap fdapVar, fdap fdapVar2, int i2) {
        if ((i2 & 16) != 0) {
            fdapVar = new fdap() { // from class: zvd
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ((anhj) obj).getClass();
                    return fctx.a;
                }
            };
        }
        final fdap fdapVar3 = fdapVar;
        if ((i2 & 32) != 0) {
            fdapVar2 = new fdap() { // from class: zve
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ((String) obj).getClass();
                    return fctx.a;
                }
            };
        }
        final fdap fdapVar4 = fdapVar2;
        if ((i2 & 8) != 0) {
            str = null;
        }
        final String str2 = str;
        fdapVar3.getClass();
        fdapVar4.getClass();
        zvlVar.a.b(l);
        zvlVar.b.e(new fdap() { // from class: zvf
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ahat ahatVar = (ahat) obj;
                ahatVar.getClass();
                return new aaam(new hxd(1259934815, true, new zvk(fdapVar3, ahatVar, zvlVar, l, fdapVar4, i, str2, anhjVar)));
            }
        });
    }
}
