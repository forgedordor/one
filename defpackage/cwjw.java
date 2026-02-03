package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwjw {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public final Set b = new LinkedHashSet();
    public final crqv c;
    public final String d;

    public cwjw(Executor executor, crqv crqvVar) {
        new eoss(executor);
        this.c = crqvVar;
        this.d = "recent_emoji";
        new cwju(this).e(new Void[0]);
    }
}
