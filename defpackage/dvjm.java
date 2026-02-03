package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvjm {
    private static dvjm a;

    private dvjm() {
    }

    public static synchronized void a() {
        if (a != null) {
            return;
        }
        a = new dvjm();
    }
}
