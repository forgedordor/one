package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dar {
    public static final dar a = new das(new ddk(null, null, null, null, false, null, 63));
    private static final dar b = new das(new ddk(null, null, null, null, true, null, 47));

    public final dar a(dar darVar) {
        dat datVar = darVar.b().a;
        if (datVar == null) {
            datVar = b().a;
        }
        ddf ddfVar = darVar.b().b;
        if (ddfVar == null) {
            ddfVar = b().b;
        }
        cyo cyoVar = darVar.b().c;
        if (cyoVar == null) {
            cyoVar = b().c;
        }
        daz dazVar = darVar.b().d;
        if (dazVar == null) {
            dazVar = b().d;
        }
        boolean z = true;
        if (!darVar.b().e && !b().e) {
            z = false;
        }
        return new das(new ddk(datVar, ddfVar, cyoVar, dazVar, z, fcwa.j(b().f, darVar.b().f)));
    }

    public abstract ddk b();

    public final boolean equals(Object obj) {
        return (obj instanceof dar) && fdbq.f(((dar) obj).b(), b());
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        if (fdbq.f(this, a)) {
            return "ExitTransition.None";
        }
        if (fdbq.f(this, b)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        ddk ddkVarB = b();
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
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
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(ddkVarB.e);
        return sb.toString();
    }
}
