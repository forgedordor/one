package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsvc {
    public final eohw a;

    private dsvc(eohw eohwVar) {
        ejwl.b(((eohx) eohwVar.instance).d != 0, "VeIdentifier must be non-zero");
        this.a = eohwVar;
    }

    public static dsvc a(int i) {
        eohw eohwVar = (eohw) eohx.a.createBuilder();
        eohwVar.copyOnWrite();
        eohx eohxVar = (eohx) eohwVar.instance;
        eohxVar.b |= 8;
        eohxVar.d = i;
        return new dsvc(eohwVar);
    }
}
