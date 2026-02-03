package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feaq implements fdiq, feal, fear, fdne {
    public final fcyh a;
    public Object c;
    public final fdhz b = new fdhz(feat.b, fdia.a);
    private List e = new ArrayList(2);
    private int f = -1;
    public Object d = feat.e;

    public feaq(fcyh fcyhVar) {
        this.a = fcyhVar;
    }

    public static /* synthetic */ Object d(feaq feaqVar, fcxy fcxyVar) {
        return feaqVar.b.a instanceof fean ? feaqVar.l(fcxyVar) : feaqVar.e(fcxyVar);
    }

    private final Object l(fcxy fcxyVar) {
        boolean z = fdkb.a;
        fdhz fdhzVar = this.b;
        Object obj = fdhzVar.a;
        obj.getClass();
        fean feanVar = (fean) obj;
        Object obj2 = this.d;
        List<fean> list = this.e;
        if (list != null) {
            for (fean feanVar2 : list) {
                if (feanVar2 != feanVar) {
                    feanVar2.c();
                }
            }
            fdhzVar.c(feat.c);
            this.d = feat.e;
            this.e = null;
        }
        return !fdkb.b ? feanVar.a(feanVar.b(obj2), fcxyVar) : f(feanVar, obj2, fcxyVar);
    }

    private final fean m(Object obj) {
        List list = this.e;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((fean) next).a == obj) {
                obj2 = next;
                break;
            }
        }
        fean feanVar = (fean) obj2;
        if (feanVar != null) {
            return feanVar;
        }
        throw new IllegalStateException(a.h(obj, "Clause with object ", " is not found"));
    }

    @Override // defpackage.fdne
    public final void C(fdzf fdzfVar, int i) {
        this.c = fdzfVar;
        this.f = i;
    }

    @Override // defpackage.feal
    public final void a(feam feamVar, fdat fdatVar) {
        h(new fean(feamVar.a, feamVar.b, feamVar.c, null, fdatVar), false);
    }

    @Override // defpackage.fdiq
    public final void b(Throwable th) {
        fdhz fdhzVar;
        Object obj;
        do {
            fdhzVar = this.b;
            obj = fdhzVar.a;
            if (obj == feat.c) {
                return;
            }
        } while (!fdhzVar.d(obj, feat.d));
        List list = this.e;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((fean) it.next()).c();
            }
            this.d = feat.e;
            this.e = null;
        }
    }

    public final int c(Object obj, Object obj2) {
        while (true) {
            fdhz fdhzVar = this.b;
            Object obj3 = fdhzVar.a;
            if (obj3 instanceof fdis) {
                fean feanVarM = m(obj);
                if (feanVarM != null && fdhzVar.d(obj3, feanVarM)) {
                    fdis fdisVar = (fdis) obj3;
                    this.d = obj2;
                    Object objL = fdisVar.l(fctx.a, null);
                    if (objL == null) {
                        this.d = feat.e;
                        return 2;
                    }
                    fdisVar.c(objL);
                    return 0;
                }
            } else {
                if (fdbq.f(obj3, feat.c) || (obj3 instanceof fean)) {
                    return 3;
                }
                if (fdbq.f(obj3, feat.d)) {
                    return 2;
                }
                if (fdbq.f(obj3, feat.b)) {
                    if (fdhzVar.d(obj3, fcva.b(obj))) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        Objects.toString(obj3);
                        throw new IllegalStateException("Unexpected state: ".concat(String.valueOf(obj3)));
                    }
                    if (fdhzVar.d(obj3, fcva.ai((Collection) obj3, obj))) {
                        return 1;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.feao
            if (r0 == 0) goto L13
            r0 = r10
            feao r0 = (defpackage.feao) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            feao r0 = new feao
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r10)
            return r10
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L32:
            defpackage.fctl.b(r10)
            goto L9c
        L36:
            defpackage.fctl.b(r10)
            r0.c = r4
            fdiu r10 = new fdiu
            fcxy r2 = defpackage.fcym.c(r0)
            r10.<init>(r2, r4)
            r10.B()
            fdhz r2 = r9.b
        L49:
            java.lang.Object r5 = r2.a
            fdzi r6 = defpackage.feat.b
            if (r5 != r6) goto L59
            boolean r5 = r2.d(r5, r10)
            if (r5 == 0) goto L49
            r10.D(r9)
            goto L92
        L59:
            boolean r7 = r5 instanceof java.util.List
            r8 = 0
            if (r7 == 0) goto L87
            boolean r6 = r2.d(r5, r6)
            if (r6 == 0) goto L49
            r6 = r5
            java.util.List r6 = (java.util.List) r6
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L6d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L49
            java.lang.Object r6 = r5.next()
            fean r6 = r9.m(r6)
            r6.getClass()
            r6.d = r8
            r7 = -1
            r6.e = r7
            r9.h(r6, r4)
            goto L6d
        L87:
            boolean r2 = r5 instanceof defpackage.fean
            if (r2 == 0) goto La7
            fctx r2 = defpackage.fctx.a
            fean r5 = (defpackage.fean) r5
            r10.f(r2, r8)
        L92:
            java.lang.Object r10 = r10.m()
            if (r10 == r1) goto L9a
            fctx r10 = defpackage.fctx.a
        L9a:
            if (r10 == r1) goto La6
        L9c:
            r0.c = r3
            java.lang.Object r10 = r9.l(r0)
            if (r10 != r1) goto La5
            goto La6
        La5:
            return r10
        La6:
            return r1
        La7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.util.Objects.toString(r5)
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "unexpected state: "
            java.lang.String r0 = r1.concat(r0)
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.feaq.e(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.fean r5, java.lang.Object r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.feap
            if (r0 == 0) goto L13
            r0 = r7
            feap r0 = (defpackage.feap) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            feap r0 = new feap
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.fctl.b(r7)     // Catch: java.lang.Throwable -> L27
            return r7
        L27:
            r5 = move-exception
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r7)
            java.lang.Object r6 = r5.b(r6)     // Catch: java.lang.Throwable -> L27
            r0.c = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r5 = r5.a(r6, r0)     // Catch: java.lang.Throwable -> L27
            if (r5 != r1) goto L41
            return r1
        L41:
            return r5
        L42:
            boolean r6 = defpackage.fdkb.b
            if (r6 != 0) goto L47
            throw r5
        L47:
            java.lang.Throwable r5 = defpackage.fdzh.a(r5, r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.feaq.f(fean, java.lang.Object, fcxy):java.lang.Object");
    }

    @Override // defpackage.fear
    public final void g(fdks fdksVar) {
        this.c = fdksVar;
    }

    public final void h(fean feanVar, boolean z) {
        boolean z2 = fdkb.a;
        fdhz fdhzVar = this.b;
        if (fdhzVar.a instanceof fean) {
            return;
        }
        if (!z) {
            Object obj = feanVar.a;
            List list = this.e;
            list.getClass();
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((fean) it.next()).a == obj) {
                        Objects.toString(obj);
                        throw new IllegalStateException("Cannot use select clauses on the same object: ".concat(obj.toString()));
                    }
                }
            }
        }
        feanVar.b.a(feanVar.a, this, feanVar.c);
        if (this.d != feat.e) {
            fdhzVar.c(feanVar);
            return;
        }
        if (!z) {
            List list2 = this.e;
            list2.getClass();
            list2.add(feanVar);
        }
        feanVar.d = this.c;
        feanVar.e = this.f;
        this.c = null;
        this.f = -1;
    }

    @Override // defpackage.fear
    public final void i(Object obj) {
        this.d = obj;
    }

    @Override // defpackage.fear
    public final boolean j(Object obj, Object obj2) {
        return c(obj, obj2) == 0;
    }
}
