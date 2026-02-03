package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dsmz {
    public evuh a;
    public long b;
    public long c;

    public static dsmz c(String str, String str2, evuh evuhVar, long j, long j2) {
        dsmx dsmxVar = new dsmx(str, str2);
        dsmxVar.a = evuhVar;
        dsmxVar.b = j;
        dsmxVar.c = j2;
        return dsmxVar;
    }

    public abstract String a();

    public abstract String b();
}
