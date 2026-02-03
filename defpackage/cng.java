package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cng {
    public static final int a(kxa kxaVar) {
        if (kxaVar == null) {
            return 0;
        }
        String str = kxaVar.d;
        return str != null ? str.hashCode() : Objects.hash(kxaVar.a, kxaVar.c, Boolean.valueOf(kxaVar.e), Boolean.valueOf(kxaVar.f));
    }

    public static final boolean b(kxa kxaVar, kxa kxaVar2) {
        if (kxaVar == null && kxaVar2 == null) {
            return true;
        }
        if (kxaVar == null || kxaVar2 == null) {
            return false;
        }
        String str = kxaVar.d;
        String str2 = kxaVar2.d;
        if (str == null && str2 == null) {
            return fdbq.f(Objects.toString(kxaVar.a), Objects.toString(kxaVar2.a)) && fdbq.f(kxaVar.c, kxaVar2.c) && kxaVar.e == kxaVar2.e && kxaVar.f == kxaVar2.f;
        }
        return fdbq.f(str, str2);
    }
}
