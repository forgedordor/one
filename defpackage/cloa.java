package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cloa {
    public static final /* synthetic */ clnz a(clnx clnxVar) {
        evsn evsnVarBuild = clnxVar.build();
        evsnVarBuild.getClass();
        return (clnz) evsnVarBuild;
    }

    public static final void b(int i, clnx clnxVar) {
        clnxVar.copyOnWrite();
        clnz clnzVar = (clnz) clnxVar.instance;
        clnz clnzVar2 = clnz.a;
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        clnzVar.c = i - 2;
        clnzVar.b |= 1;
    }
}
