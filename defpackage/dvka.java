package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvka {
    private static dvka a;

    private dvka() {
    }

    public static synchronized void a() {
        if (a == null) {
            a = new dvka();
        }
    }
}
