package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjaj {
    private final asrf a;

    public cjaj(asrf asrfVar) {
        this.a = asrfVar;
    }

    public final elpg a() {
        elof elofVar = (elof) elpg.b.createBuilder();
        enyw enywVarA = this.a.a();
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        elpgVar.Y = enywVarA.h;
        elpgVar.d |= 2097152;
        return (elpg) elofVar.build();
    }
}
