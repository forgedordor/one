package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vcs implements eyif {
    public static vcu a(ea eaVar) {
        for (ea eaVar2 = eaVar; eaVar2 != null; eaVar2 = eaVar2.E) {
            if (vcr.a(eaVar2)) {
                return new vcu(eaVar2);
            }
        }
        eg egVarG = eaVar.G();
        if (egVarG == null || !vcr.a(egVarG)) {
            throw new dali();
        }
        return new vcu(egVarG);
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
