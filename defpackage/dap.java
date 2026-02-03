package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dap {
    public static final dap a = new daq(new ddk(null, null, null, null, false, null, 63));

    public final dap a(dap dapVar) {
        dat datVar = dapVar.b().a;
        if (datVar == null) {
            datVar = b().a;
        }
        ddf ddfVar = dapVar.b().b;
        if (ddfVar == null) {
            ddfVar = b().b;
        }
        cyo cyoVar = dapVar.b().c;
        if (cyoVar == null) {
            cyoVar = b().c;
        }
        daz dazVar = dapVar.b().d;
        if (dazVar == null) {
            dazVar = b().d;
        }
        return new daq(new ddk(datVar, ddfVar, cyoVar, dazVar, false, fcwa.j(b().f, dapVar.b().f), 16));
    }

    public abstract ddk b();

    public final boolean equals(Object obj) {
        return (obj instanceof dap) && fdbq.f(((dap) obj).b(), b());
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        if (fdbq.f(this, a)) {
            return "EnterTransition.None";
        }
        ddk ddkVarB = b();
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        dat datVar = ddkVarB.a;
        sb.append(datVar != null ? datVar.toString() : null);
        sb.append(",\nSlide - ");
        ddf ddfVar = ddkVarB.b;
        sb.append(ddfVar != null ? ddfVar.toString() : null);
        sb.append(",\nShrink - ");
        cyo cyoVar = ddkVarB.c;
        sb.append(cyoVar != null ? cyoVar.toString() : null);
        sb.append(",\nScale - ");
        daz dazVar = ddkVarB.d;
        sb.append(dazVar != null ? dazVar.toString() : null);
        return sb.toString();
    }
}
