package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwco {
    private static dwco a;

    public static synchronized void a() {
        if (a == null) {
            a = new dwco();
        }
    }
}
