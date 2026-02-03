package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rqi extends rbw {
    public static rqi b() {
        rqi rqiVar = new rqi();
        rqiVar.d(new rue().a());
        return rqiVar;
    }

    public static rqi c(ruf rufVar) {
        rqi rqiVar = new rqi();
        rqiVar.d(rufVar);
        return rqiVar;
    }

    public final void d(ruf rufVar) {
        rvi.f(rufVar);
        this.a = rufVar;
    }

    @Override // defpackage.rbw
    public final boolean equals(Object obj) {
        return (obj instanceof rqi) && super.equals(obj);
    }
}
