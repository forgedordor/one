package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dqsr {
    public static void a(dqsy dqsyVar, String str, Runnable runnable) {
        dqsyVar.W(str, runnable, dqss.NO_TXN);
    }

    @Deprecated
    public static boolean b(dqsy dqsyVar) {
        return ((bwzy) dqsyVar).i().inTransaction();
    }
}
