package defpackage;

import j$.util.DesugarCollections;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbnc {
    public static final fbnc a;
    public final fbol b;
    public final Executor c;
    public final String d = null;
    public final fbmz e;
    public final String f;
    public final List g;
    public final Integer h;
    public final Integer i;
    private final Object[][] j;
    private final Boolean k;

    static {
        fbna fbnaVar = new fbna();
        fbnaVar.e = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        fbnaVar.f = Collections.EMPTY_LIST;
        a = new fbnc(fbnaVar);
    }

    public fbnc(fbna fbnaVar) {
        this.b = fbnaVar.a;
        this.c = fbnaVar.b;
        this.e = fbnaVar.c;
        this.f = fbnaVar.d;
        this.j = fbnaVar.e;
        this.g = fbnaVar.f;
        this.k = fbnaVar.g;
        this.h = fbnaVar.h;
        this.i = fbnaVar.i;
    }

    public static fbna a(fbnc fbncVar) {
        fbna fbnaVar = new fbna();
        fbnaVar.a = fbncVar.b;
        fbnaVar.b = fbncVar.c;
        fbnaVar.c = fbncVar.e;
        fbnaVar.d = fbncVar.f;
        fbnaVar.e = fbncVar.j;
        fbnaVar.f = fbncVar.g;
        fbnaVar.g = fbncVar.k;
        fbnaVar.h = fbncVar.h;
        fbnaVar.i = fbncVar.i;
        return fbnaVar;
    }

    public final fbnc b(fbol fbolVar) {
        fbna fbnaVarA = a(this);
        fbnaVarA.a = fbolVar;
        return new fbnc(fbnaVarA);
    }

    public final fbnc c(Executor executor) {
        fbna fbnaVarA = a(this);
        fbnaVarA.b = executor;
        return new fbnc(fbnaVarA);
    }

    public final fbnc d(int i) {
        ejwl.d(i >= 0, "invalid maxsize %s", i);
        fbna fbnaVarA = a(this);
        fbnaVarA.h = Integer.valueOf(i);
        return new fbnc(fbnaVarA);
    }

    public final fbnc e(int i) {
        ejwl.d(i >= 0, "invalid maxsize %s", i);
        fbna fbnaVarA = a(this);
        fbnaVarA.i = Integer.valueOf(i);
        return new fbnc(fbnaVarA);
    }

    public final fbnc f(fbnb fbnbVar, Object obj) {
        Object[][] objArr;
        int length;
        fbnbVar.getClass();
        obj.getClass();
        fbna fbnaVarA = a(this);
        int i = 0;
        while (true) {
            objArr = this.j;
            length = objArr.length;
            if (i >= length) {
                i = -1;
                break;
            }
            if (fbnbVar.equals(objArr[i][0])) {
                break;
            }
            i++;
        }
        fbnaVarA.e = (Object[][]) Array.newInstance((Class<?>) Object.class, (i == -1 ? 1 : 0) + length, 2);
        System.arraycopy(objArr, 0, fbnaVarA.e, 0, length);
        if (i == -1) {
            fbnaVarA.e[length] = new Object[]{fbnbVar, obj};
        } else {
            fbnaVarA.e[i] = new Object[]{fbnbVar, obj};
        }
        return new fbnc(fbnaVarA);
    }

    public final fbnc g(fbnl fbnlVar) {
        List list = this.g;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(fbnlVar);
        fbna fbnaVarA = a(this);
        fbnaVarA.f = DesugarCollections.unmodifiableList(arrayList);
        return new fbnc(fbnaVarA);
    }

    public final Object h(fbnb fbnbVar) {
        fbnbVar.getClass();
        int i = 0;
        while (true) {
            Object[][] objArr = this.j;
            if (i >= objArr.length) {
                return fbnbVar.a;
            }
            if (fbnbVar.equals(objArr[i][0])) {
                return objArr[i][1];
            }
            i++;
        }
    }

    public final boolean i() {
        return Boolean.TRUE.equals(this.k);
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("deadline", this.b);
        ejwfVarB.b("authority", null);
        ejwfVarB.b("callCredentials", this.e);
        Executor executor = this.c;
        ejwfVarB.b("executor", executor != null ? executor.getClass() : null);
        ejwfVarB.b("compressorName", this.f);
        ejwfVarB.b("customOptions", Arrays.deepToString(this.j));
        ejwfVarB.h("waitForReady", i());
        ejwfVarB.b("maxInboundMessageSize", this.h);
        ejwfVarB.b("maxOutboundMessageSize", this.i);
        ejwfVarB.b("onReadyThreshold", null);
        ejwfVarB.b("streamTracerFactories", this.g);
        return ejwfVarB.toString();
    }
}
