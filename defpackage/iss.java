package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iss implements icq {
    public fdap a;
    public boolean b;
    public final isl c = new isr(this);
    private itc d;

    @Override // defpackage.ics
    public final /* synthetic */ ics a(ics icsVar) {
        return icn.a(this, icsVar);
    }

    @Override // defpackage.ics
    public final /* synthetic */ Object b(Object obj, fdat fdatVar) {
        return icp.a(this, obj, fdatVar);
    }

    @Override // defpackage.ics
    public final /* synthetic */ boolean c(fdap fdapVar) {
        return icp.b(this, fdapVar);
    }

    public final fdap d() {
        fdap fdapVar = this.a;
        if (fdapVar != null) {
            return fdapVar;
        }
        fdbq.c("onTouchEvent");
        return null;
    }

    public final void e(itc itcVar) {
        itc itcVar2 = this.d;
        if (itcVar2 != null) {
            itcVar2.a = null;
        }
        this.d = itcVar;
        if (itcVar != null) {
            itcVar.a = this;
        }
    }
}
