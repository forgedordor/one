package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvml implements eind {
    final /* synthetic */ cvlk a;

    public cvml(cvlk cvlkVar) {
        this.a = cvlkVar;
    }

    @Override // defpackage.eind
    public final /* synthetic */ eine a(einb einbVar) {
        cvlk cvlkVar = this.a;
        ((ajfo) cvlkVar.b.b()).d(ajfo.b);
        boolean zBooleanValue = ((Boolean) cmxn.m.e()).booleanValue();
        cvmj cvmjVar = cvlkVar.c;
        if (zBooleanValue) {
            ((cmxn) cvmjVar.Y.b()).i(cmxm.SEND_BUTTON_ACCURATE);
        }
        cvmjVar.A = false;
        if (cvmjVar.A()) {
            return eine.b;
        }
        cvmjVar.C = true;
        if (!cvmjVar.z) {
            cvmjVar.B(true == cvmjVar.x() ? 2 : 1);
        }
        return eine.a;
    }
}
