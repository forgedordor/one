package androidx.appsearch.builtintypes;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GlobalSearchApplicationInfo {
    public final String a;
    public final String b;
    public final int c;
    public final List d;

    public GlobalSearchApplicationInfo(String str, String str2, int i, List list) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = DesugarCollections.unmodifiableList(list);
    }
}
