package defpackage;

import java.security.InvalidParameterException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ancx implements ajly {
    public abstract int a();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ajly ajlyVar = (ajly) obj;
        if (ajlyVar instanceof ancx) {
            return Integer.compare(a(), ((ancx) ajlyVar).a());
        }
        throw new InvalidParameterException("wrong PagingKey type, expected PositionalPagingKey");
    }
}
