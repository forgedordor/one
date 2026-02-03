package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdzp {
    public static final fdzi a = new fdzi("NO_THREAD_ELEMENTS");
    private static final fdat b = new fdat() { // from class: fdzm
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            fcyf fcyfVar = (fcyf) obj2;
            if (!(fcyfVar instanceof fdmv)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 1;
            return iIntValue == 0 ? fcyfVar : Integer.valueOf(iIntValue + 1);
        }
    };
    private static final fdat c = new fdat() { // from class: fdzn
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            fdmv fdmvVar = (fdmv) obj;
            fcyf fcyfVar = (fcyf) obj2;
            if (fdmvVar != null) {
                return fdmvVar;
            }
            if (fcyfVar instanceof fdmv) {
                return (fdmv) fcyfVar;
            }
            return null;
        }
    };
    private static final fdat d = new fdat() { // from class: fdzo
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            fdzs fdzsVar = (fdzs) obj;
            fcyf fcyfVar = (fcyf) obj2;
            if (fcyfVar instanceof fdmv) {
                fdmv fdmvVar = (fdmv) fcyfVar;
                Object objA = fdmvVar.a(fdzsVar.a);
                Object[] objArr = fdzsVar.b;
                int i = fdzsVar.d;
                objArr[i] = objA;
                fdmv[] fdmvVarArr = fdzsVar.c;
                fdzsVar.d = i + 1;
                fdmvVar.getClass();
                fdmvVarArr[i] = fdmvVar;
            }
            return fdzsVar;
        }
    };

    public static final Object a(fcyh fcyhVar) {
        Object objFold = fcyhVar.fold(0, b);
        objFold.getClass();
        return objFold;
    }

    public static final Object b(fcyh fcyhVar, Object obj) {
        if (obj == null) {
            obj = a(fcyhVar);
        }
        return obj == 0 ? a : obj instanceof Integer ? fcyhVar.fold(new fdzs(fcyhVar, ((Number) obj).intValue()), d) : ((fdmv) obj).a(fcyhVar);
    }

    public static final void c(fcyh fcyhVar, Object obj) {
        if (obj == a) {
            return;
        }
        if (!(obj instanceof fdzs)) {
            Object objFold = fcyhVar.fold(null, c);
            objFold.getClass();
            ((fdmv) objFold).b(fcyhVar, obj);
            return;
        }
        fdzs fdzsVar = (fdzs) obj;
        fdmv[] fdmvVarArr = fdzsVar.c;
        int length = fdmvVarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            fdmv fdmvVar = fdmvVarArr[length];
            fdmvVar.getClass();
            fdmvVar.b(fcyhVar, fdzsVar.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
