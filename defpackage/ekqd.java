package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekqd {
    public static Collection a(Collection collection, Object obj) {
        return collection instanceof SortedSet ? new ekqc((SortedSet) collection, obj) : collection instanceof Set ? new ekqb((Set) collection, obj) : collection instanceof List ? b((List) collection, obj) : new ekpv(collection, obj);
    }

    public static List b(List list, Object obj) {
        return list instanceof RandomAccess ? new ekqa(list, obj) : new ekpw(list, obj);
    }
}
