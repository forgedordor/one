package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhct implements fhbk {
    public final fhbv a;
    private final fhdu b;
    private final Object[] c;
    private final fexj d;
    private volatile boolean e;
    private fexk f;
    private Throwable g;
    private boolean h;

    public fhct(fhdu fhduVar, Object[] objArr, fexj fexjVar, fhbv fhbvVar) {
        this.b = fhduVar;
        this.c = objArr;
        this.d = fexjVar;
        this.a = fhbvVar;
    }

    private final fexk g() {
        feyq feyqVarA;
        Object[] objArr = this.c;
        fhdu fhduVar = this.b;
        fhdn[] fhdnVarArr = fhduVar.j;
        int length = fhdnVarArr.length;
        int length2 = objArr.length;
        if (length2 != length) {
            throw new IllegalArgumentException(a.z(length, length2, "Argument count (", ") doesn't match expected count (", ")"));
        }
        fhds fhdsVar = new fhds(fhduVar.c, fhduVar.b, fhduVar.d, fhduVar.e, fhduVar.f, fhduVar.g, fhduVar.h, fhduVar.i);
        if (fhduVar.k) {
            length2--;
        }
        ArrayList arrayList = new ArrayList(length2);
        for (int i = 0; i < length2; i++) {
            arrayList.add(objArr[i]);
            fhdnVarArr[i].a(fhdsVar, objArr[i]);
        }
        feyo feyoVar = fhdsVar.f;
        if (feyoVar != null) {
            feyqVarA = feyoVar.a();
        } else {
            feyq feyqVar = fhdsVar.d;
            feyq feyqVarJ = feyqVar.j(fhdsVar.e);
            if (feyqVarJ == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + String.valueOf(feyqVar) + ", Relative: " + fhdsVar.e);
            }
            feyqVarA = feyqVarJ;
        }
        fezf fhdrVar = fhdsVar.m;
        if (fhdrVar == null) {
            feyf feyfVar = fhdsVar.l;
            if (feyfVar != null) {
                fhdrVar = new feyg(feyfVar.a, feyfVar.b);
            } else {
                feyu feyuVar = fhdsVar.k;
                if (feyuVar != null) {
                    List list = feyuVar.c;
                    if (list.isEmpty()) {
                        throw new IllegalStateException("Multipart body must have at least one part.");
                    }
                    fhdrVar = new feyw(feyuVar.a, feyuVar.b, fezr.p(list));
                } else if (fhdsVar.j) {
                    fhdrVar = feze.a(new byte[0]);
                }
            }
        }
        feyt feytVar = fhdsVar.i;
        if (feytVar != null) {
            if (fhdrVar != null) {
                fhdrVar = new fhdr(fhdrVar, feytVar);
            } else {
                fhdsVar.h.e(ffho.a, feytVar.c);
            }
        }
        fexj fexjVar = this.d;
        feza fezaVar = fhdsVar.g;
        fezaVar.h(feyqVarA);
        fezaVar.d(fhdsVar.h.b());
        fezaVar.e(fhdsVar.c, fhdrVar);
        fezaVar.g(fhch.class, new fhch(fhduVar.a, arrayList));
        return new ffaj((feyy) fexjVar, fezaVar.a());
    }

    private final fexk h() throws IOException {
        fexk fexkVar = this.f;
        if (fexkVar != null) {
            return fexkVar;
        }
        Throwable th = this.g;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            fexk fexkVarG = g();
            this.f = fexkVarG;
            return fexkVarG;
        } catch (IOException | Error | RuntimeException e) {
            fhef.m(e);
            this.g = e;
            throw e;
        }
    }

    @Override // defpackage.fhbk
    public final synchronized fezb a() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return ((ffaj) h()).b;
    }

    @Override // defpackage.fhbk
    public final void c() {
        fexk fexkVar;
        this.e = true;
        synchronized (this) {
            fexkVar = this.f;
        }
        if (fexkVar != null) {
            fexkVar.b();
        }
    }

    @Override // defpackage.fhbk
    public final void d(fhbn fhbnVar) {
        fexk fexkVar;
        Throwable th;
        synchronized (this) {
            if (this.h) {
                throw new IllegalStateException("Already executed.");
            }
            this.h = true;
            fexkVar = this.f;
            th = this.g;
            if (fexkVar == null && th == null) {
                try {
                    fexk fexkVarG = g();
                    this.f = fexkVarG;
                    fexkVar = fexkVarG;
                } catch (Throwable th2) {
                    th = th2;
                    fhef.m(th);
                    this.g = th;
                }
            }
        }
        if (th != null) {
            fhbnVar.onFailure(this, th);
            return;
        }
        if (this.e) {
            fexkVar.b();
        }
        fexkVar.c(new fhcp(this, fhbnVar));
    }

    @Override // defpackage.fhbk
    public final boolean e() {
        boolean z = true;
        if (this.e) {
            return true;
        }
        synchronized (this) {
            fexk fexkVar = this.f;
            if (fexkVar == null || !((ffaj) fexkVar).l) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.fhbk
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final fhct clone() {
        return new fhct(this.b, this.c, this.d, this.a);
    }
}
