package defpackage;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ervg {
    public static final ervg a = new ervg(new ervh());
    public static final ervg b = new ervg(new ervl());
    public static final ervg c = new ervg(new ervn());
    public static final ervg d = new ervg(new ervm());
    public static final ervg e = new ervg(new ervi());
    public static final ervg f = new ervg(new ervk());
    public static final ervg g = new ervg(new ervj());
    private final ervf h;

    public ervg(ervo ervoVar) {
        if (eqzb.a()) {
            this.h = new erve(ervoVar);
        } else if (erwj.d()) {
            this.h = new ervc(ervoVar);
        } else {
            this.h = new ervd(ervoVar);
        }
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object a(String str) {
        return this.h.a(str);
    }
}
