package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atol {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/chatapi/groups/UpdateGroupChatHandler");
    public final long b;
    public final fdjx c;
    public final asre d;
    public final atoi e;

    public atol(long j, fdjx fdjxVar, asre asreVar) {
        fdjxVar.getClass();
        asreVar.getClass();
        this.b = j;
        this.c = fdjxVar;
        this.d = asreVar;
        this.e = new atoi();
    }

    public final boolean a(String str, aubl aublVar) {
        fdis fdisVar = (fdis) this.e.remove(str);
        if (fdisVar == null) {
            return false;
        }
        fdisVar.w(aublVar);
        return true;
    }
}
