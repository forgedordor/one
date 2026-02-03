package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvmm implements eind {
    final /* synthetic */ cvlk a;

    public cvmm(cvlk cvlkVar) {
        this.a = cvlkVar;
    }

    @Override // defpackage.eind
    public final /* synthetic */ eine a(einb einbVar) {
        boolean zBooleanValue = ((Boolean) clpp.a.e()).booleanValue();
        cvmj cvmjVar = this.a.c;
        if (zBooleanValue) {
            if (cvmjVar.z) {
                return eine.a;
            }
            ((acgu) cvmjVar.T.b()).a(21);
            cvmjVar.k();
            return new eine(new aihy());
        }
        if (cvmjVar.u()) {
            cvmjVar.A = true;
        }
        cvmjVar.s(true);
        boolean z = cvmjVar.z;
        return eine.b;
    }
}
