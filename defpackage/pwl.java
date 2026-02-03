package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pwl {
    private final prj a;
    private final pwk b;
    private final pwj c;

    public pwl(prj prjVar, pwk pwkVar, pwj pwjVar) {
        this.a = prjVar;
        this.b = pwkVar;
        this.c = pwjVar;
        if (prjVar.b() == 0 && prjVar.a() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (prjVar.b != 0 && prjVar.c != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final Rect a() {
        return this.a.c();
    }

    public final pwi b() {
        prj prjVar = this.a;
        return prjVar.b() > prjVar.a() ? pwi.b : pwi.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!fdbq.f(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        pwl pwlVar = (pwl) obj;
        return fdbq.f(this.a, pwlVar.a) && fdbq.f(this.b, pwlVar.b) && fdbq.f(this.c, pwlVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "pwl { " + this.a + ", type=" + this.b + ", state=" + this.c + " }";
    }
}
