package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcik {
    public final fbqf a;
    public fbnv b;
    public boolean c = false;
    public fbnw d = fbnw.a(fbnv.IDLE);

    public fcik(fbqf fbqfVar, fbnv fbnvVar) {
        this.a = fbqfVar;
        this.b = fbnvVar;
    }

    public final fbnv a() {
        return this.d.a;
    }

    public final void b(fbnv fbnvVar) {
        boolean z;
        this.b = fbnvVar;
        if (fbnvVar == fbnv.READY || fbnvVar == fbnv.TRANSIENT_FAILURE) {
            z = true;
        } else if (fbnvVar != fbnv.IDLE) {
            return;
        } else {
            z = false;
        }
        this.c = z;
    }
}
