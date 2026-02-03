package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvjz {
    private static dvjz a;

    public static synchronized dvjz a() {
        if (a == null) {
            a = new dvjz();
        }
        return a;
    }
}
