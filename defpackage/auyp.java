package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auyp {
    public static final auyl a(final fdvc fdvcVar) {
        fdvcVar.getClass();
        return fdvcVar instanceof auxs ? new auxq(new fdae() { // from class: auyo
            @Override // defpackage.fdae
            public final Object invoke() {
                return ((auxs) fdvcVar).b();
            }
        }) : new auyr(fdvcVar);
    }

    public static final auyl b(fdpl fdplVar, Object obj) {
        fdplVar.getClass();
        return new auyn(fdplVar, obj);
    }
}
