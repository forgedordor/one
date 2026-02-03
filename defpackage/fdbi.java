package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdbi implements fddy, fdbh {
    public static final Map a;
    public static final HashMap b;
    public static final Map c;
    private static final HashMap d;
    private static final HashMap e;
    private final Class f;

    static {
        int i = 0;
        List listG = fcva.g(fdae.class, fdap.class, fdat.class, fdau.class, fdav.class, fdaw.class, fdax.class, fday.class, fdaz.class, fdba.class, fdaf.class, fdag.class, fdah.class, fdai.class, fdaj.class, fdak.class, fdal.class, fdam.class, fdan.class, fdao.class, fdaq.class, fdar.class, fdas.class);
        ArrayList arrayList = new ArrayList(fcva.p(listG, 10));
        for (Object obj : listG) {
            int i2 = i + 1;
            if (i < 0) {
                fcva.m();
            }
            arrayList.add(new fcti((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        a = fcwa.k(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG, "kotlin.Long");
        map.put("double", "kotlin.Double");
        d = map;
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        e = map2;
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        collectionValues.getClass();
        for (String str : collectionValues) {
            str.getClass();
            fcti fctiVar = new fcti("kotlin.jvm.internal." + fdgn.E(str, '.', str) + "CompanionObject", str.concat(".Companion"));
            map3.put(fctiVar.a, fctiVar.b);
        }
        for (Map.Entry entry : a.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        b = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(fcwa.a(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, fdgn.E(str2, '.', str2));
        }
        c = linkedHashMap;
    }

    public fdbi(Class cls) {
        cls.getClass();
        this.f = cls;
    }

    @Override // defpackage.fdbh
    public final Class a() {
        return this.f;
    }

    @Override // defpackage.fddy
    public final String b() {
        String str;
        Class cls = this.f;
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String str2 = (String) b.get(cls.getName());
            return str2 == null ? cls.getCanonicalName() : str2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (str = (String) b.get(componentType.getName())) != null) {
            strConcat = str.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    @Override // defpackage.fddy
    public final String c() {
        String str;
        Class cls = this.f;
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String str2 = (String) c.get(cls.getName());
                return str2 == null ? cls.getSimpleName() : str2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) c.get(componentType.getName())) != null) {
                strConcat = str.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            simpleName.getClass();
            return fdgn.D(simpleName, String.valueOf(enclosingMethod.getName()).concat("$"), simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            simpleName.getClass();
            return fdgn.D(simpleName, String.valueOf(enclosingConstructor.getName()).concat("$"), simpleName);
        }
        simpleName.getClass();
        return fdgn.C(simpleName, '$', simpleName);
    }

    @Override // defpackage.fddy
    public final boolean d(Object obj) {
        Map map = a;
        map.getClass();
        Class clsB = this.f;
        Integer num = (Integer) map.get(clsB);
        if (num != null) {
            return fdcm.b(obj, num.intValue());
        }
        if (clsB.isPrimitive()) {
            clsB = fdab.b(fdab.c(clsB));
        }
        return clsB.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fdbi) && fdbq.f(fdab.b(this), fdab.b((fddy) obj));
    }

    @Override // defpackage.fddy
    public final int hashCode() {
        return fdab.b(this).hashCode();
    }

    public final String toString() {
        Class cls = this.f;
        Objects.toString(cls);
        return cls.toString().concat(" (Kotlin reflection is not available)");
    }
}
