package defpackage;

import java.security.InvalidParameterException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class alzi implements ajly {
    public abstract long a();

    public abstract long b();

    public abstract long c();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ajly ajlyVar = (ajly) obj;
        if (!(ajlyVar instanceof alzi)) {
            throw new InvalidParameterException("wrong PagingKey type, expected BuglePagingKey");
        }
        alzi alziVar = (alzi) ajlyVar;
        if (c() != alziVar.c()) {
            return c() <= alziVar.c() ? -1 : 1;
        }
        if (a() != alziVar.a()) {
            return a() <= alziVar.a() ? -1 : 1;
        }
        if (b() != alziVar.b()) {
            return b() <= alziVar.b() ? -1 : 1;
        }
        return 0;
    }

    final boolean d() {
        return b() > 0;
    }
}
