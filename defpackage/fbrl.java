package defpackage;

import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbrl {
    private static fbrl a;

    public fbrl() {
        new HashSet();
    }

    public static synchronized void a() {
        if (a == null) {
            a = new fbrl();
        }
    }
}
