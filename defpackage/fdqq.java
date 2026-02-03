package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class fdqq {
    public static final fdap a = new fdap() { // from class: fdqo
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            return obj;
        }
    };
    private static final fdat b = new fdat() { // from class: fdqp
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            return Boolean.valueOf(fdbq.f(obj, obj2));
        }
    };

    public static final fdpl a(fdpl fdplVar) {
        return fdplVar instanceof fdvc ? fdplVar : c(fdplVar, a, b);
    }

    public static final fdpl b(fdpl fdplVar, fdap fdapVar) {
        return c(fdplVar, fdapVar, b);
    }

    public static final fdpl c(fdpl fdplVar, fdap fdapVar, fdat fdatVar) {
        if (fdplVar instanceof fdpj) {
            fdpj fdpjVar = (fdpj) fdplVar;
            if (fdpjVar.a == fdapVar && fdpjVar.b == fdatVar) {
                return fdplVar;
            }
        }
        return new fdpj(fdplVar, fdapVar, fdatVar);
    }
}
