package androidx.appsearch.builtintypes;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Thing {
    public final String A;
    public final List B;
    public final String C;
    public final String D;
    public final String E;
    public final List F;
    public final String v;
    public final String w;
    public final int x;
    public final long y;
    public final long z;

    public Thing(String str, String str2, int i, long j, long j2, String str3, List list, String str4, String str5, String str6, List list2) {
        this.v = str;
        this.w = str2;
        this.x = i;
        this.y = j;
        this.z = j2;
        this.A = str3;
        if (list == null) {
            this.B = Collections.EMPTY_LIST;
        } else {
            this.B = DesugarCollections.unmodifiableList(list);
        }
        this.C = str4;
        this.D = str5;
        this.E = str6;
        if (list2 == null) {
            this.F = Collections.EMPTY_LIST;
        } else {
            this.F = DesugarCollections.unmodifiableList(list2);
        }
    }

    public List a() {
        return this.B;
    }
}
