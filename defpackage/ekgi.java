package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ekgi {
    Object[] a;
    int b;
    ekgh c;

    public ekgi() {
        this(4);
    }

    private final ekgp a(boolean z) {
        ekgh ekghVar;
        ekgh ekghVar2;
        if (z && (ekghVar2 = this.c) != null) {
            throw ekghVar2.a();
        }
        ekoj ekojVarW = ekoj.w(this.b, this.a, this);
        if (!z || (ekghVar = this.c) == null) {
            return ekojVarW;
        }
        throw ekghVar.a();
    }

    private final void d(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.a = Arrays.copyOf(objArr, ekfm.f(length, i2));
        }
    }

    public ekgp b() {
        return a(false);
    }

    public ekgp c() {
        return a(true);
    }

    public void g(Map map) {
        l(map.entrySet());
    }

    @Deprecated
    public final ekgp h() {
        return c();
    }

    public void i(Object obj, Object obj2) {
        d(this.b + 1);
        ekcw.a(obj, obj2);
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.b = i + 1;
    }

    public final void j(Map.Entry entry) {
        i(entry.getKey(), entry.getValue());
    }

    public final void k(ekgi ekgiVar) {
        ekgiVar.getClass();
        d(this.b + ekgiVar.b);
        Object[] objArr = ekgiVar.a;
        Object[] objArr2 = this.a;
        int i = this.b;
        int i2 = ekgiVar.b;
        System.arraycopy(objArr, 0, objArr2, i + i, i2 + i2);
        this.b += ekgiVar.b;
    }

    public final void l(Iterable iterable) {
        if (iterable instanceof Collection) {
            d(this.b + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            j((Map.Entry) it.next());
        }
    }

    public ekgi(int i) {
        this.a = new Object[i + i];
        this.b = 0;
    }
}
