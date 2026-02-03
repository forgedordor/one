package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afr {
    private static volatile afr a;
    private final Map b = new HashMap();

    private afr() {
    }

    public static afr b() {
        if (a == null) {
            synchronized (afr.class) {
                if (a == null) {
                    a = new afr();
                }
            }
        }
        return a;
    }

    private final afq c(Class cls) throws ahy {
        String strConcat;
        Package r0 = cls.getPackage();
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new ahy(2, a.h(cls, "Failed to find simple name for document class \"", "\". Perhaps it is anonymous?"));
        }
        if (r0 != null) {
            strConcat = String.valueOf(r0.getName()).concat(".");
            canonicalName = canonicalName.substring(strConcat.length()).replace(".", "$$__");
        } else {
            strConcat = "";
        }
        String strQ = a.q(canonicalName, strConcat, "$$__AppSearch__");
        try {
            try {
                return (afq) Class.forName(strQ).getDeclaredConstructor(null).newInstance(null);
            } catch (Exception e) {
                throw new ahy(2, a.a(strQ, "Failed to construct document class converter \"", "\""), e);
            }
        } catch (ClassNotFoundException e2) {
            Class superclass = cls.getSuperclass();
            Class<?>[] interfaces = cls.getInterfaces();
            Class cls2 = superclass != Object.class ? superclass : null;
            int length = interfaces.length;
            if (cls2 != null) {
                length++;
            }
            if (length == 1) {
                return cls2 != null ? c(cls2) : c(interfaces[0]);
            }
            String strA = a.a(strQ, "Failed to find document class converter \"", "\". Perhaps the annotation processor was not run or the class was proguarded out?");
            if (length > 1) {
                strA = strA.concat(" Or, this class may not have been annotated with @Document, and there is an ambiguity to determine a unique @Document annotated parent class/interface.");
            }
            throw new ahy(2, strA, e2);
        }
    }

    public final afq a(Class cls) throws ahy {
        afq afqVar;
        lcg.i(cls);
        synchronized (this) {
            afqVar = (afq) this.b.get(cls);
        }
        if (afqVar != null) {
            return afqVar;
        }
        afq afqVarC = c(cls);
        synchronized (this) {
            Map map = this.b;
            afq afqVar2 = (afq) map.get(cls);
            if (afqVar2 == null) {
                map.put(cls, afqVarC);
            } else {
                afqVarC = afqVar2;
            }
        }
        return afqVarC;
    }
}
