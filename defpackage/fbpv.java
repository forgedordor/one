package defpackage;

import j$.util.DesugarCollections;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbpv {
    private List a;
    private final fbmw b = fbmw.a;
    private Object[][] c = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);

    public final fbpx a() {
        return new fbpx(this.a, this.b, this.c);
    }

    public final void b(fbpw fbpwVar, Object obj) {
        int length = 0;
        while (true) {
            Object[][] objArr = this.c;
            if (length >= objArr.length) {
                length = -1;
                break;
            } else if (fbpwVar.equals(objArr[length][0])) {
                break;
            } else {
                length++;
            }
        }
        if (length == -1) {
            Object[][] objArr2 = this.c;
            int length2 = objArr2.length;
            Object[][] objArr3 = (Object[][]) Array.newInstance((Class<?>) Object.class, length2 + 1, 2);
            System.arraycopy(objArr2, 0, objArr3, 0, length2);
            this.c = objArr3;
            length = objArr3.length - 1;
        }
        this.c[length] = new Object[]{fbpwVar, obj};
    }

    public final void c(List list) {
        ejwl.b(!list.isEmpty(), "addrs is empty");
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
    }
}
