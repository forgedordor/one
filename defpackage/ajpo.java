package defpackage;

import java.security.InvalidParameterException;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class ajpo implements ajow {
    public abstract int a();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ajow ajowVar = (ajow) obj;
        if (ajowVar instanceof ajpo) {
            return Integer.compare(a(), ((ajpo) ajowVar).a());
        }
        throw new InvalidParameterException("wrong PagingKey type, expected an OffsetPagingKey");
    }
}
