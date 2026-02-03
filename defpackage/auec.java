package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auec {
    public static final /* synthetic */ aueb a(auea aueaVar) {
        evsn evsnVarBuild = aueaVar.build();
        evsnVarBuild.getClass();
        return (aueb) evsnVarBuild;
    }

    public static final void b(boolean z, auea aueaVar) {
        aueaVar.copyOnWrite();
        aueb auebVar = (aueb) aueaVar.instance;
        aueb auebVar2 = aueb.a;
        auebVar.b |= 1;
        auebVar.c = z;
    }
}
