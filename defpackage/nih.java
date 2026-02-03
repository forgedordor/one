package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nih implements nif {
    public final nif a;

    public nih(nif nifVar) {
        this.a = nifVar;
    }

    @Override // defpackage.nik
    public mau a(int i) {
        return this.a.a(i);
    }

    @Override // defpackage.nif
    public mau b() {
        return this.a.b();
    }

    @Override // defpackage.nik
    public mcm c() {
        return this.a.c();
    }

    @Override // defpackage.nik
    public final int e(int i) {
        return this.a.e(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nih) {
            return this.a.equals(((nih) obj).a);
        }
        return false;
    }

    @Override // defpackage.nif
    public final int f() {
        return this.a.f();
    }

    @Override // defpackage.nik
    public final int g(int i) {
        return this.a.g(i);
    }

    @Override // defpackage.nik
    public final int h() {
        return this.a.h();
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
