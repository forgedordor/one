package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpuy {
    public static final void a(dpux dpuxVar, fr frVar, boolean z, fdap fdapVar) {
        dpuxVar.getClass();
        if (dpuxVar.f) {
            cg cgVar = new cg(frVar);
            fdapVar.invoke(cgVar);
            if (z) {
                cgVar.d();
                return;
            } else {
                cgVar.c();
                return;
            }
        }
        cg cgVar2 = new cg(frVar);
        fdapVar.invoke(cgVar2);
        if (z) {
            cgVar2.k();
        } else {
            cgVar2.j();
        }
    }
}
