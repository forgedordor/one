package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auyh extends auyj implements fduf {
    private final String b;
    private final fduf c;

    public auyh(String str, fduf fdufVar) {
        super(str);
        this.b = str;
        this.c = fdufVar;
    }

    @Override // defpackage.fduj, defpackage.fdpl
    public final Object a(fdpm fdpmVar, fcxy fcxyVar) {
        return this.c.a(fdpmVar, fcxyVar);
    }

    @Override // defpackage.fdue
    public final fdvc b() {
        return this.c.b();
    }

    @Override // defpackage.fduf, defpackage.fdvc
    public final Object c() {
        return this.c.c();
    }

    @Override // defpackage.fduj
    public final List d() {
        return this.c.d();
    }

    @Override // defpackage.fdue
    public final void e() {
        this.c.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof auyh)) {
            return false;
        }
        auyh auyhVar = (auyh) obj;
        return fdbq.f(this.b, auyhVar.b) && fdbq.f(this.c, auyhVar.c);
    }

    @Override // defpackage.fduf
    public final void f(Object obj) {
        this.c.f(obj);
    }

    @Override // defpackage.fdue, defpackage.fdpm
    public final Object fO(Object obj, fcxy fcxyVar) {
        return this.c.fO(obj, fcxyVar);
    }

    @Override // defpackage.fduf
    public final boolean g(Object obj, Object obj2) {
        return this.c.g(obj, obj2);
    }

    @Override // defpackage.fdue
    public final boolean h(Object obj) {
        this.c.h(obj);
        return true;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    @Override // defpackage.auyj
    public final String toString() {
        return "NamedMutableStateFlow(name=" + this.b + ", flow=" + this.c + ")";
    }
}
