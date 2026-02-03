package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbvr {
    public final int a;
    public final ConcurrentHashMap b = new ConcurrentHashMap(8);
    public final Executor c;
    public final fbue d;

    public fbvr(int i, fbue fbueVar, Executor executor) {
        this.a = i;
        this.d = fbueVar;
        this.c = executor;
    }
}
