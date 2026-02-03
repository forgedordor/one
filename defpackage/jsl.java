package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jsl {
    public final icr a;
    public final jcr b;
    public final jsc c;
    public boolean d;
    public final int e;
    private final boolean f;
    private jsl g;

    public jsl(icr icrVar, boolean z, jcr jcrVar, jsc jscVar) {
        this.a = icrVar;
        this.f = z;
        this.b = jcrVar;
        this.c = jscVar;
        this.e = jcrVar.c;
    }

    public static /* synthetic */ List m(jsl jslVar, boolean z, int i) {
        return jslVar.l((i & 1) != 0 ? !jslVar.f : false, z & ((i & 2) == 0));
    }

    private final jsl p(jrw jrwVar, fdap fdapVar) {
        int i;
        int i2;
        jsc jscVar = new jsc();
        jscVar.b = false;
        jscVar.c = false;
        fdapVar.invoke(jscVar);
        jsk jskVar = new jsk(fdapVar);
        if (jrwVar != null) {
            i = this.e;
            i2 = 1000000000;
        } else {
            i = this.e;
            i2 = 2000000000;
        }
        jsl jslVar = new jsl(jskVar, false, new jcr(true, i + i2), jscVar);
        jslVar.d = true;
        jslVar.g = this;
        return jslVar;
    }

    private final void q(List list, jsc jscVar) {
        if (this.c.c) {
            return;
        }
        n(list, false);
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            jsl jslVar = (jsl) list.get(size2);
            if (!jslVar.r()) {
                jscVar.d(jslVar.c);
                jslVar.q(list, jscVar);
            }
        }
    }

    private final boolean r() {
        return this.f && this.c.b;
    }

    private final void s(jcr jcrVar, List list) {
        hum humVarP = jcrVar.p();
        Object[] objArr = humVarP.a;
        int i = humVarP.b;
        for (int i2 = 0; i2 < i; i2++) {
            jcr jcrVar2 = (jcr) objArr[i2];
            if (jcrVar2.d() && !jcrVar2.B) {
                if (jcrVar2.v.j(8)) {
                    list.add(jsm.b(jcrVar2, this.f));
                } else {
                    s(jcrVar2, list);
                }
            }
        }
    }

    private final void t(List list, List list2) {
        n(list, false);
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            jsl jslVar = (jsl) list.get(size2);
            if (jslVar.r()) {
                list2.add(jslVar);
            } else if (!jslVar.c.c) {
                jslVar.t(list, list2);
            }
        }
    }

    public final long a() {
        jer jerVarE = e();
        if (jerVarE == null) {
            return 0L;
        }
        if (true != jerVarE.u()) {
            jerVarE = null;
        }
        if (jerVarE != null) {
            return ivz.a(jerVarE);
        }
        return 0L;
    }

    public final long b() {
        jer jerVarE = e();
        if (jerVarE != null) {
            return jerVarE.c;
        }
        return 0L;
    }

    public final ihu c() {
        jer jerVarE = e();
        if (jerVarE != null) {
            if (true != jerVarE.u()) {
                jerVarE = null;
            }
            if (jerVarE != null) {
                return ivz.e(jerVarE);
            }
        }
        return ihu.a;
    }

    public final ihu d() {
        jer jerVarE = e();
        if (jerVarE != null) {
            if (true != jerVarE.u()) {
                jerVarE = null;
            }
            if (jerVarE != null) {
                return ivz.f(jerVarE);
            }
        }
        return ihu.a;
    }

    public final jer e() {
        if (this.d) {
            jsl jslVarH = h();
            if (jslVarH != null) {
                return jslVarH.e();
            }
            return null;
        }
        jbf jbfVarA = jsm.a(this.b);
        if (jbfVarA == null) {
            jbfVarA = this.a;
        }
        return jbg.e(jbfVarA, 8);
    }

    public final jsc f() {
        if (!r()) {
            return this.c;
        }
        jsc jscVarA = this.c.a();
        q(new ArrayList(), jscVarA);
        return jscVarA;
    }

    public final jsl g() {
        return new jsl(this.a, true, this.b, this.c);
    }

    public final jsl h() {
        jcr jcrVarS;
        jsl jslVar = this.g;
        if (jslVar != null) {
            return jslVar;
        }
        boolean z = this.f;
        if (z) {
            jcrVarS = this.b.s();
            while (jcrVarS != null) {
                jsc jscVarY = jcrVarS.y();
                if (jscVarY != null && jscVarY.b) {
                    break;
                }
                jcrVarS = jcrVarS.s();
            }
            jcrVarS = null;
        } else {
            jcrVarS = null;
        }
        if (jcrVarS == null) {
            jcrVarS = this.b.s();
            while (true) {
                if (jcrVarS == null) {
                    jcrVarS = null;
                    break;
                }
                if (jcrVarS.v.j(8)) {
                    break;
                }
                jcrVarS = jcrVarS.s();
            }
        }
        if (jcrVarS == null) {
            return null;
        }
        return jsm.b(jcrVarS, z);
    }

    public final List i() {
        return m(this, false, 7);
    }

    public final List j() {
        return m(this, true, 4);
    }

    public final boolean k() {
        if (this.d || !j().isEmpty()) {
            return false;
        }
        jcr jcrVarS = this.b.s();
        while (true) {
            if (jcrVarS == null) {
                jcrVarS = null;
                break;
            }
            jsc jscVarY = jcrVarS.y();
            if (jscVarY != null && jscVarY.b) {
                break;
            }
            jcrVarS = jcrVarS.s();
        }
        return jcrVarS == null;
    }

    public final List l(boolean z, boolean z2) {
        if (!z && this.c.c) {
            return fcvo.a;
        }
        ArrayList arrayList = new ArrayList();
        if (!r()) {
            return n(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        t(arrayList, arrayList2);
        return arrayList2;
    }

    public final List n(List list, boolean z) {
        if (this.d) {
            return fcvo.a;
        }
        s(this.b, list);
        if (z) {
            jsc jscVar = this.c;
            jrw jrwVar = (jrw) jsd.a(jscVar, jte.x);
            if (jrwVar != null && jscVar.b && !list.isEmpty()) {
                list.add(p(jrwVar, new jsi(jrwVar)));
            }
            jtn jtnVar = jte.a;
            if (jscVar.f(jtnVar) && !list.isEmpty() && jscVar.b) {
                List list2 = (List) jsd.a(jscVar, jtnVar);
                String str = list2 != null ? (String) fcva.P(list2) : null;
                if (str != null) {
                    list.add(0, p(null, new jsj(str)));
                }
            }
        }
        return list;
    }
}
