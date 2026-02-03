package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yji {
    public static final boolean a(ajlt ajltVar) {
        if (ajltVar.z()) {
            return true;
        }
        angr angrVarI = ajltVar.i();
        return angrVarI != null && angrVarI.d().size() > 0;
    }

    public static final boolean b(ajlt ajltVar) {
        ajmc ajmcVarD = ajltVar.d();
        ajlr ajlrVar = ajmcVarD instanceof ajlr ? (ajlr) ajmcVarD : null;
        if (ajlrVar == null) {
            return false;
        }
        return ajlrVar.a().g().z();
    }

    public static final boolean c(ajlt ajltVar, ajlt ajltVar2) {
        ajmc ajmcVarD = ajltVar.d();
        boolean z = ajmcVarD instanceof ajlr;
        ajmc ajmcVarD2 = ajltVar2.d();
        if (z && (ajmcVarD2 instanceof ajlr) && ((ajlr) ajmcVarD).a().equals(((ajlr) ajmcVarD2).a())) {
            return true;
        }
        return (ajmcVarD instanceof ajmq) && (ajmcVarD2 instanceof ajmq) && ((ajmq) ajmcVarD).c().equals(((ajmq) ajmcVarD2).c());
    }
}
