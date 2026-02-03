package defpackage;

import android.os.Handler;
import android.os.Trace;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iwy implements hmh {
    public final jcr a;
    public hnb b;
    public izo c;
    public int d;
    public int e;
    public final cuz f;
    public final cuz g;
    public final iwq h;
    public final iwn i;
    public final cuz j;
    public final cuz k;
    public final hum l;
    public int m;
    public int n;
    public final String o;
    private final izn p;

    public iwy(jcr jcrVar, izo izoVar) {
        this.a = jcrVar;
        this.c = izoVar;
        long[] jArr = cvp.a;
        this.f = new cuz((byte[]) null);
        this.g = new cuz((byte[]) null);
        this.h = new iwq(this);
        this.i = new iwn(this);
        this.j = new cuz((byte[]) null);
        this.p = new izn(null);
        this.k = new cuz((byte[]) null);
        this.l = new hum(new Object[16]);
        this.o = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [jfd, jfh] */
    private final jfd l() {
        ?? A = jcv.a(this.a);
        if (((AndroidComposeView) A).isAttachedToWindow()) {
            return A;
        }
        return null;
    }

    private final Object m(List list, int i) {
        Object objF = this.f.f((jcr) list.get(i));
        objF.getClass();
        return ((iwo) objF).a;
    }

    private static final void n(iwo iwoVar, jfd jfdVar) {
        iwoVar.b();
        final iww iwwVar = new iww(iwoVar);
        Handler handler = ((AndroidComposeView) jfdVar).getHandler();
        if (handler == null) {
            throw new IllegalArgumentException("schedule is called when outOfFrameExecutor is not available (view is detached)");
        }
        handler.postAtFrontOfQueue(new Runnable() { // from class: jha
            @Override // java.lang.Runnable
            public final void run() {
                Class cls = AndroidComposeView.a;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                try {
                    iwwVar.invoke();
                } finally {
                    Trace.endSection();
                }
            }
        });
    }

    private static final void o(jcr jcrVar) {
        jcrVar.v().G = 3;
        jdm jdmVarU = jcrVar.u();
        if (jdmVarU != null) {
            jdmVarU.w = 3;
        }
    }

    public final izh a(Object obj, fdat fdatVar) {
        jcr jcrVar = this.a;
        if (jcrVar.d()) {
            h();
            if (!this.g.h(obj)) {
                this.k.b(obj);
                cuz cuzVar = this.j;
                Object objF = cuzVar.f(obj);
                if (objF == null) {
                    objF = e(obj);
                    if (objF != null) {
                        j(jcrVar.G().indexOf(objF), jcrVar.G().size());
                        this.n++;
                    } else {
                        objF = d(jcrVar.G().size());
                        this.n++;
                    }
                    cuzVar.e(obj, objF);
                }
                k((jcr) objF, obj, fdatVar);
            }
        }
        return !jcrVar.d() ? new iwu() : new iwv(this, obj);
    }

    @Override // defpackage.hmh
    public final void b() {
        i(true);
    }

    @Override // defpackage.hmh
    public final void c() {
        f();
    }

    public final jcr d(int i) {
        jcr jcrVar = new jcr(true, 2, null);
        jcr jcrVar2 = this.a;
        jcrVar2.n = true;
        jcrVar2.N(i, jcrVar);
        jcrVar2.n = false;
        return jcrVar;
    }

    public final jcr e(Object obj) {
        int i;
        if (this.m == 0) {
            return null;
        }
        List listG = this.a.G();
        int size = listG.size() - this.n;
        int i2 = size - this.m;
        int i3 = size - 1;
        int i4 = i3;
        while (true) {
            if (i4 < i2) {
                i = -1;
                break;
            }
            if (fdbq.f(m(listG, i4), obj)) {
                i = i4;
                break;
            }
            i4--;
        }
        if (i == -1) {
            while (i3 >= i2) {
                Object objF = this.f.f((jcr) listG.get(i3));
                objF.getClass();
                iwo iwoVar = (iwo) objF;
                Object obj2 = iwoVar.a;
                if (obj2 == izg.a || this.c.b(obj, obj2)) {
                    iwoVar.a = obj;
                    i4 = i3;
                    i = i4;
                    break;
                }
                i3--;
            }
            i4 = i3;
            i = -1;
        }
        if (i == -1) {
            return null;
        }
        if (i4 != i2) {
            j(i4, i2);
        }
        this.m--;
        jcr jcrVar = (jcr) listG.get(i2);
        Object objF2 = this.f.f(jcrVar);
        objF2.getClass();
        iwo iwoVar2 = (iwo) objF2;
        iwoVar2.f = new hpl(true, hsi.a);
        iwoVar2.e = true;
        iwoVar2.d = true;
        return jcrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r18 = this;
            r0 = r18
            jcr r1 = r0.a
            r2 = 1
            r1.n = r2
            cuz r2 = r0.f
            java.lang.Object[] r3 = r2.c
            long[] r4 = r2.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L52
            r7 = r6
        L14:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4d
            int r10 = r7 - r5
            r11 = r6
        L27:
            int r12 = ~r10
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            if (r11 >= r12) goto L4b
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r8
            r16 = 128(0x80, double:6.32E-322)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 >= 0) goto L47
            int r12 = r7 << 3
            int r12 = r12 + r11
            r12 = r3[r12]
            iwo r12 = (defpackage.iwo) r12
            hqx r12 = r12.c
            if (r12 == 0) goto L47
            r12.d()
        L47:
            long r8 = r8 >> r13
            int r11 = r11 + 1
            goto L27
        L4b:
            if (r12 != r13) goto L52
        L4d:
            if (r7 == r5) goto L52
            int r7 = r7 + 1
            goto L14
        L52:
            r1.Y()
            r1.n = r6
            r2.d()
            cuz r1 = r0.g
            r1.d()
            r0.n = r6
            r0.m = r6
            cuz r1 = r0.j
            r1.d()
            r0.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iwy.f():void");
    }

    public final void g(int i) {
        this.m = 0;
        jcr jcrVar = this.a;
        List listG = jcrVar.G();
        int size = (listG.size() - this.n) - 1;
        if (i <= size) {
            izn iznVar = this.p;
            iznVar.clear();
            if (i <= size) {
                int i2 = i;
                while (true) {
                    iznVar.add(m(listG, i2));
                    if (i2 == size) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.c.a(iznVar);
            jfd jfdVarL = l();
            hzg hzgVarA = hzf.a();
            fdap fdapVarK = hzgVarA != null ? hzgVarA.k() : null;
            hzg hzgVarB = hzf.b(hzgVarA);
            boolean z = false;
            while (size >= i) {
                try {
                    jcr jcrVar2 = (jcr) listG.get(size);
                    cuz cuzVar = this.f;
                    Object objF = cuzVar.f(jcrVar2);
                    objF.getClass();
                    iwo iwoVar = (iwo) objF;
                    Object obj = iwoVar.a;
                    if (iznVar.contains(obj)) {
                        this.m++;
                        if (iwoVar.a()) {
                            o(jcrVar2);
                            if (jfdVarL != null) {
                                n(iwoVar, jfdVarL);
                            } else {
                                iwoVar.b();
                                if (iwoVar.g) {
                                    z = true;
                                } else {
                                    hqx hqxVar = iwoVar.c;
                                    if (hqxVar != null) {
                                        hqxVar.m();
                                    }
                                }
                            }
                        }
                    } else {
                        jcrVar.n = true;
                        cuzVar.b(jcrVar2);
                        hqx hqxVar2 = iwoVar.c;
                        if (hqxVar2 != null) {
                            hqxVar2.d();
                        }
                        jcrVar.Z(size, 1);
                        jcrVar.n = false;
                    }
                    this.g.b(obj);
                    size--;
                } finally {
                    hzf.e(hzgVarA, hzgVarB, fdapVarK);
                }
            }
            if (z) {
                hzf.f();
            }
        }
        h();
    }

    public final void h() {
        int size = this.a.G().size();
        cuz cuzVar = this.f;
        if (cuzVar.e != size) {
            itw.c("Inconsistency between the count of nodes tracked by the state (" + cuzVar.e + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((size - this.m) - this.n < 0) {
            itw.c("Incorrect state. Total children " + size + ". Reusable children " + this.m + ". Precomposed children " + this.n);
        }
        cuz cuzVar2 = this.j;
        if (cuzVar2.e == this.n) {
            return;
        }
        itw.c("Incorrect state. Precomposed children " + this.n + ". Map size " + cuzVar2.e);
    }

    public final void i(boolean z) {
        hqx hqxVar;
        this.n = 0;
        this.j.d();
        List listG = this.a.G();
        int size = listG.size();
        if (this.m != size) {
            this.m = size;
            jfd jfdVarL = l();
            hzg hzgVarA = hzf.a();
            fdap fdapVarK = hzgVarA != null ? hzgVarA.k() : null;
            hzg hzgVarB = hzf.b(hzgVarA);
            for (int i = 0; i < size; i++) {
                try {
                    jcr jcrVar = (jcr) listG.get(i);
                    iwo iwoVar = (iwo) this.f.f(jcrVar);
                    if (iwoVar != null && iwoVar.a()) {
                        o(jcrVar);
                        if (z) {
                            hqx hqxVar2 = iwoVar.c;
                            if (hqxVar2 != null) {
                                hqxVar2.m();
                            }
                            iwoVar.f = new hpl(false, hsi.a);
                        } else if (jfdVarL != null) {
                            n(iwoVar, jfdVarL);
                        } else {
                            iwoVar.b();
                            if (!iwoVar.g && (hqxVar = iwoVar.c) != null) {
                                hqxVar.m();
                            }
                        }
                        iwoVar.a = izg.a;
                    }
                } catch (Throwable th) {
                    hzf.e(hzgVarA, hzgVarB, fdapVarK);
                    throw th;
                }
            }
            hzf.e(hzgVarA, hzgVarB, fdapVarK);
            this.g.d();
        }
        h();
    }

    public final void j(int i, int i2) {
        jcr jcrVar = this.a;
        jcrVar.n = true;
        jcrVar.W(i, i2, 1);
        jcrVar.n = false;
    }

    public final void k(jcr jcrVar, Object obj, fdat fdatVar) {
        boolean z;
        cuz cuzVar = this.f;
        Object objF = cuzVar.f(jcrVar);
        if (objF == null) {
            objF = new iwo(obj, ius.a);
            cuzVar.e(jcrVar, objF);
        }
        iwo iwoVar = (iwo) objF;
        fdat fdatVar2 = iwoVar.b;
        hqx hqxVar = iwoVar.c;
        if (hqxVar != null) {
            synchronized (((hne) hqxVar).b) {
                z = ((hne) hqxVar).g.e > 0;
            }
        } else {
            z = true;
        }
        if (fdatVar2 != fdatVar || z || iwoVar.d) {
            iwoVar.b = fdatVar;
            hzg hzgVarA = hzf.a();
            fdap fdapVarK = hzgVarA != null ? hzgVarA.k() : null;
            hzg hzgVarB = hzf.b(hzgVarA);
            try {
                jcr jcrVar2 = this.a;
                jcrVar2.n = true;
                hqx hneVar = iwoVar.c;
                hnb hnbVar = this.b;
                if (hnbVar == null) {
                    itw.b("parent composition reference not set");
                    throw new fcta();
                }
                if (hneVar == null || ((hne) hneVar).l) {
                    ViewGroup.LayoutParams layoutParams = jpy.a;
                    hneVar = new hne(hnbVar, new jgi(jcrVar));
                }
                iwoVar.c = hneVar;
                fdat hxdVar = iwoVar.b;
                if (l() != null) {
                    iwoVar.g = false;
                } else {
                    iwoVar.g = true;
                    hxdVar = new hxd(1524156494, true, new iwx(iwoVar, hxdVar));
                }
                if (iwoVar.e) {
                    hmw hmwVar = ((hne) hneVar).k;
                    hmwVar.o = 100;
                    hmwVar.n = true;
                    ((hne) hneVar).l(hxdVar);
                    if (hmwVar.r || hmwVar.o != 100) {
                        hpq.a("Cannot disable reuse from root if it was caused by other groups");
                    }
                    hmwVar.o = -1;
                    hmwVar.n = false;
                } else {
                    ((hne) hneVar).l(hxdVar);
                }
                iwoVar.e = false;
                jcrVar2.n = false;
                hzf.e(hzgVarA, hzgVarB, fdapVarK);
                iwoVar.d = false;
            } catch (Throwable th) {
                hzf.e(hzgVarA, hzgVarB, fdapVarK);
                throw th;
            }
        }
    }
}
