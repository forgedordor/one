package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbnu {
    private static fbnu a;
    private final List b = Collections.EMPTY_LIST;
    private int c = 0;

    public static synchronized fbnu a() {
        if (a == null) {
            a = new fbnu();
        }
        return a;
    }

    public final synchronized List b() {
        this.c++;
        return this.b;
    }

    public final synchronized void c() {
    }
}
