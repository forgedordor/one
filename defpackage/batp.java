package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final /* synthetic */ class batp {
    public static boolean a(batq batqVar) {
        return ((bato) batqVar).a != null;
    }

    public static void b(batq batqVar, fdap fdapVar, fdap fdapVar2) {
        if (batqVar instanceof bato) {
            fdapVar.invoke(((bato) batqVar).a);
        } else {
            if (!(batqVar instanceof batr)) {
                throw new fctg();
            }
            fdapVar2.invoke(((batr) batqVar).a);
        }
    }
}
