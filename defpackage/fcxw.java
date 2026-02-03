package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcxw implements Serializable {
    private static final long serialVersionUID = 0;
    private final fcyh[] a;

    public fcxw(fcyh[] fcyhVarArr) {
        this.a = fcyhVarArr;
    }

    private final Object readResolve() {
        fcyh fcyhVarPlus = fcyi.a;
        int i = 0;
        while (true) {
            fcyh[] fcyhVarArr = this.a;
            if (i >= fcyhVarArr.length) {
                return fcyhVarPlus;
            }
            fcyhVarPlus = fcyhVarPlus.plus(fcyhVarArr[i]);
            i++;
        }
    }
}
