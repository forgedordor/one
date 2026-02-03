package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feaf extends fdjq {
    public static final feaf a = new feaf();

    private feaf() {
    }

    @Override // defpackage.fdjq
    public final void a(fcyh fcyhVar, Runnable runnable) {
        fdzz.a.c(runnable, false);
    }

    @Override // defpackage.fdjq
    public final void h(fcyh fcyhVar, Runnable runnable) {
        fdzz.a.c(runnable, true);
    }

    @Override // defpackage.fdjq
    public final fdjq i(int i) {
        fdys.a(i);
        return i >= feae.d ? this : super.i(i);
    }

    @Override // defpackage.fdjq
    public final String toString() {
        return "Dispatchers.IO";
    }
}
