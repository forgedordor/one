package androidx.appsearch.builtintypes;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ContactPoint extends Thing {
    public final String a;
    public final List b;
    public final List c;
    public final List d;

    public ContactPoint(String str, String str2, int i, long j, long j2, String str3, List list, String str4, String str5, String str6, List list2, String str7, List list3, List list4, List list5) {
        super(str, str2, i, j, j2, str3, list, str4, str5, str6, list2);
        this.a = str7;
        this.b = DesugarCollections.unmodifiableList(list3);
        this.c = DesugarCollections.unmodifiableList(list4);
        this.d = DesugarCollections.unmodifiableList(list5);
    }
}
