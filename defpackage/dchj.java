package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dchj implements Runnable {
    final /* synthetic */ dchk a;

    public dchj(dchk dchkVar) {
        this.a = dchkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dcfc dcfcVar = this.a.a.b;
        dcfcVar.n(String.valueOf(dcfcVar.getClass().getName()).concat(" disconnecting because it was signed out."));
    }
}
