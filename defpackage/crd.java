package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.ArrayMap;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crd {
    public static final /* synthetic */ int a = 0;
    private static final Map b;
    private static final Map c;

    static {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(Boolean.class, "bool");
        arrayMap.put(Byte.class, "byte");
        arrayMap.put(Short.class, "short");
        arrayMap.put(Integer.class, "int");
        arrayMap.put(Long.class, ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG);
        arrayMap.put(Double.class, "double");
        arrayMap.put(Float.class, "float");
        arrayMap.put(String.class, "string");
        arrayMap.put(Parcelable.class, "parcelable");
        arrayMap.put(Map.class, "map");
        arrayMap.put(List.class, "list");
        arrayMap.put(IconCompat.class, "image");
        b = arrayMap;
        ArrayMap arrayMap2 = new ArrayMap();
        arrayMap2.put(0, "primitive");
        arrayMap2.put(1, "iInterface");
        arrayMap2.put(9, "iBinder");
        arrayMap2.put(2, "map");
        arrayMap2.put(3, "set");
        arrayMap2.put(4, "list");
        arrayMap2.put(5, "object");
        arrayMap2.put(6, "image");
        c = arrayMap2;
    }

    private crd() {
    }

    public static Bundle a(Object obj, String str, crb crbVar) throws cqz {
        Bundle bundleA;
        if (obj != null) {
            Iterator it = crbVar.a.iterator();
            while (it.hasNext()) {
                if (((cra) it.next()).a == obj) {
                    throw new cqz("Found cycle while bundling type ".concat(String.valueOf(obj.getClass().getSimpleName())), crbVar);
                }
            }
        }
        crb crbVarB = crb.b(obj, str, crbVar);
        try {
            if (obj == null) {
                throw new crc("Bundling of null object is not supported", crbVarB);
            }
            if (obj instanceof IconCompat) {
                bundleA = new Bundle(2);
                bundleA.putInt("tag_class_type", 6);
                bundleA.putBundle("tag_value", ((IconCompat) obj).e());
            } else {
                boolean z = obj instanceof Boolean;
                int i = 0;
                if (z || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof String) || (obj instanceof Parcelable)) {
                    Bundle bundle = new Bundle(2);
                    bundle.putInt("tag_class_type", 0);
                    if (z) {
                        bundle.putBoolean("tag_value", ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Byte) {
                        bundle.putByte("tag_value", ((Byte) obj).byteValue());
                    } else if (obj instanceof Character) {
                        bundle.putChar("tag_value", ((Character) obj).charValue());
                    } else if (obj instanceof Short) {
                        bundle.putShort("tag_value", ((Short) obj).shortValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt("tag_value", ((Integer) obj).intValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong("tag_value", ((Long) obj).longValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble("tag_value", ((Double) obj).doubleValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat("tag_value", ((Float) obj).floatValue());
                    } else if (obj instanceof String) {
                        bundle.putString("tag_value", (String) obj);
                    } else {
                        if (!(obj instanceof Parcelable)) {
                            throw new crc("Unsupported primitive type: ".concat(String.valueOf(obj.getClass().getName())), crbVarB);
                        }
                        bundle.putParcelable("tag_value", (Parcelable) obj);
                    }
                    bundleA = bundle;
                } else if (obj instanceof IInterface) {
                    IInterface iInterface = (IInterface) obj;
                    bundleA = new Bundle(3);
                    String name = iInterface.getClass().getName();
                    bundleA.putInt("tag_class_type", 1);
                    bundleA.putBinder("tag_value", iInterface.asBinder());
                    bundleA.putString("tag_class_name", name);
                } else if (obj instanceof IBinder) {
                    bundleA = new Bundle(2);
                    bundleA.putInt("tag_class_type", 9);
                    bundleA.putBinder("tag_value", (IBinder) obj);
                } else if (obj instanceof Map) {
                    bundleA = new Bundle(2);
                    ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        Bundle bundle2 = new Bundle(2);
                        bundle2.putBundle("tag_1", a(entry.getKey(), a.e(i, "<key ", ">"), crbVarB));
                        if (entry.getValue() != null) {
                            bundle2.putBundle("tag_2", a(entry.getValue(), a.e(i, "<value ", ">"), crbVarB));
                        }
                        i++;
                        arrayList.add(bundle2);
                    }
                    bundleA.putInt("tag_class_type", 2);
                    bundleA.putParcelableArrayList("tag_value", arrayList);
                } else if (obj instanceof List) {
                    bundleA = f((List) obj, crbVarB);
                    bundleA.putInt("tag_class_type", 4);
                } else if (obj instanceof Set) {
                    bundleA = f((Set) obj, crbVarB);
                    bundleA.putInt("tag_class_type", 3);
                } else if (obj.getClass().isEnum()) {
                    bundleA = g(obj, crbVarB);
                } else if (obj instanceof Class) {
                    bundleA = new Bundle(2);
                    bundleA.putInt("tag_class_type", 8);
                    bundleA.putString("tag_value", ((Class) obj).getName());
                } else {
                    if (obj.getClass().isArray()) {
                        throw new crc("Object serializing contains an array, use a list or a set instead", crbVarB);
                    }
                    if (obj instanceof kxa) {
                        bundleA = ((kxa) obj).a();
                        bundleA.putInt("tag_class_type", 10);
                    } else {
                        String name2 = obj.getClass().getName();
                        if (!obj.getClass().isAnnotationPresent(cmb.class)) {
                            throw new crc("Invalid class not marked as CarProtocol: ".concat(String.valueOf(name2)), crbVarB);
                        }
                        try {
                            obj.getClass().getDeclaredConstructor(null);
                            List<Field> listL = l(obj.getClass());
                            Bundle bundle3 = new Bundle(listL.size() + 2);
                            bundle3.putInt("tag_class_type", 5);
                            bundle3.putString("tag_class_name", name2);
                            for (Field field : listL) {
                                field.setAccessible(true);
                                String strD = d(field);
                                try {
                                    Object obj2 = field.get(obj);
                                    if (obj2 != null) {
                                        bundle3.putParcelable(strD, a(obj2, field.getName(), crbVarB));
                                    }
                                } catch (IllegalAccessException e) {
                                    throw new crc("Field is not accessible: ".concat(strD), crbVarB, e);
                                }
                            }
                            bundleA = bundle3;
                        } catch (NoSuchMethodException e2) {
                            throw new crc("Class to deserialize is missing a no args constructor: ".concat(String.valueOf(name2)), crbVarB, e2);
                        }
                    }
                }
            }
            crbVarB.close();
            return bundleA;
        } catch (Throwable th) {
            try {
                crbVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Collection, java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.HashMap, java.util.Map] */
    public static Object b(Bundle bundle, crb crbVar) {
        Object objI;
        ?? map;
        ClassLoader classLoader = crd.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        int i = bundle.getInt("tag_class_type");
        crb crbVarB = crb.b(bundle, c(bundle.getInt("tag_class_type")), crbVar);
        try {
            switch (i) {
                case 0:
                    Object obj = bundle.get("tag_value");
                    if (obj == null) {
                        throw new crc("Bundle is missing the primitive value", crbVarB);
                    }
                    crbVarB.close();
                    return obj;
                case 1:
                    objI = i(bundle, crbVarB);
                    crbVarB.close();
                    return objI;
                case 2:
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList("tag_value");
                    if (parcelableArrayList == null) {
                        throw new crc("Bundle is missing the map", crbVarB);
                    }
                    map = new HashMap();
                    int size = parcelableArrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Bundle bundle2 = (Bundle) ((Parcelable) parcelableArrayList.get(i2));
                        Bundle bundle3 = bundle2.getBundle("tag_1");
                        Bundle bundle4 = bundle2.getBundle("tag_2");
                        if (bundle3 == null) {
                            throw new crc("Bundle is missing key", crbVarB);
                        }
                        map.put(b(bundle3, crbVarB), bundle4 == null ? null : b(bundle4, crbVarB));
                    }
                    objI = map;
                    crbVarB.close();
                    return objI;
                case 3:
                    map = new HashSet();
                    m(bundle, map, crbVarB);
                    objI = map;
                    crbVarB.close();
                    return objI;
                case 4:
                    map = new ArrayList();
                    m(bundle, map, crbVarB);
                    objI = map;
                    crbVarB.close();
                    return objI;
                case 5:
                    objI = j(bundle, crbVarB);
                    crbVarB.close();
                    return objI;
                case 6:
                    Bundle bundle5 = bundle.getBundle("tag_value");
                    if (bundle5 == null) {
                        throw new crc("IconCompat bundle is null", crbVarB);
                    }
                    IconCompat iconCompatF = IconCompat.f(bundle5);
                    if (iconCompatF == null) {
                        throw new crc("Failed to create IconCompat from bundle", crbVarB);
                    }
                    crbVarB.close();
                    return iconCompatF;
                case 7:
                    objI = h(bundle, crbVarB);
                    crbVarB.close();
                    return objI;
                case 8:
                    String string = bundle.getString("tag_value");
                    if (string == null) {
                        throw new crc("Class is missing the class name", crbVarB);
                    }
                    try {
                        objI = Class.forName(string);
                        crbVarB.close();
                        return objI;
                    } catch (ClassNotFoundException e) {
                        throw new crc("Class name is unknown: ".concat(string), crbVarB, e);
                    }
                case 9:
                    IBinder binder = bundle.getBinder("tag_value");
                    if (binder == null) {
                        throw new crc("Bundle is missing the binder", crbVarB);
                    }
                    crbVarB.close();
                    return binder;
                case 10:
                    objI = kxa.b(bundle);
                    crbVarB.close();
                    return objI;
                default:
                    throw new crc(a.g(i, "Unsupported class type in bundle: "), crbVarB);
            }
        } catch (Throwable th) {
            try {
                crbVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static String c(int i) {
        String str = (String) c.get(Integer.valueOf(i));
        return str == null ? "unknown" : str;
    }

    static String d(Field field) {
        return String.valueOf(field.getDeclaringClass().getName()).concat(String.valueOf(field.getName()));
    }

    static String e(Class cls) {
        String str = (String) b.get(cls);
        if (str == null) {
            if (List.class.isAssignableFrom(cls)) {
                return "<List>";
            }
            if (Map.class.isAssignableFrom(cls)) {
                return "<Map>";
            }
            if (Set.class.isAssignableFrom(cls)) {
                return "<Set>";
            }
        }
        return str == null ? cls.getSimpleName() : str;
    }

    private static Bundle f(Collection collection, crb crbVar) {
        Bundle bundle = new Bundle(2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            arrayList.add(a(it.next(), a.e(i, "<item ", ">"), crbVar));
            i++;
        }
        bundle.putParcelableArrayList("tag_value", arrayList);
        return bundle;
    }

    private static Bundle g(Object obj, crb crbVar) throws crc {
        Bundle bundle = new Bundle(3);
        bundle.putInt("tag_class_type", 7);
        try {
            bundle.putString("tag_value", (String) k(obj.getClass(), "name", crbVar).invoke(obj, null));
            bundle.putString("tag_class_name", obj.getClass().getName());
            return bundle;
        } catch (ReflectiveOperationException e) {
            throw new crc("Enum missing name method", crbVar, e);
        }
    }

    private static Object h(Bundle bundle, crb crbVar) throws crc {
        String string = bundle.getString("tag_value");
        if (string == null) {
            throw new crc("Missing enum name [null]", crbVar);
        }
        String string2 = bundle.getString("tag_class_name");
        if (string2 == null) {
            throw new crc("Missing enum className [null]", crbVar);
        }
        try {
            return k(Class.forName(string2), "valueOf", crbVar).invoke(null, string);
        } catch (ClassNotFoundException e) {
            throw new crc(a.a(string2, "Enum class [", "] not found"), crbVar, e);
        } catch (IllegalArgumentException e2) {
            throw new crc(a.d(string2, string, "Enum value [", "] does not exist in enum class [", "]"), crbVar, e2);
        } catch (ReflectiveOperationException e3) {
            throw new crc(a.a(string2, "Enum of class [", "] missing valueOf method"), crbVar, e3);
        }
    }

    private static Object i(Bundle bundle, crb crbVar) throws IllegalAccessException, crc, IllegalArgumentException, InvocationTargetException {
        IBinder binder = bundle.getBinder("tag_value");
        if (binder == null) {
            throw new crc("Bundle is missing the binder", crbVar);
        }
        String string = bundle.getString("tag_class_name");
        if (string == null) {
            throw new crc("Bundle is missing IInterface class name", crbVar);
        }
        try {
            Object objInvoke = k(Class.forName(string), "asInterface", crbVar).invoke(null, binder);
            if (objInvoke != null) {
                return objInvoke;
            }
            throw new crc("Failed to get interface from binder", crbVar);
        } catch (ClassNotFoundException e) {
            throw new crc("Binder for unknown IInterface: ".concat(string), crbVar, e);
        } catch (ReflectiveOperationException e2) {
            throw new crc("Method to create IInterface from a Binder is not accessible for interface: ".concat(string), crbVar, e2);
        }
    }

    private static Object j(Bundle bundle, crb crbVar) throws IllegalAccessException, crc, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String string = bundle.getString("tag_class_name");
        if (string == null) {
            throw new crc("Bundle is missing the class name", crbVar);
        }
        try {
            Class<?> cls = Class.forName(string);
            if (!cls.isAnnotationPresent(cmb.class)) {
                throw new crc(a.v(string, "Invalid class not marked as CarProtocol: "), crbVar);
            }
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            Object objNewInstance = declaredConstructor.newInstance(null);
            for (Field field : l(cls)) {
                field.setAccessible(true);
                String strD = d(field);
                Object obj = bundle.get(strD);
                if (obj == null) {
                    obj = bundle.get(strD.replaceAll("androidx.core.graphics.drawable.IconCompat", "androidx.core.graphics.drawable.IconCompat"));
                }
                if (obj instanceof Bundle) {
                    field.set(objNewInstance, b((Bundle) obj, crbVar));
                } else if (obj == null && Log.isLoggable("CarApp.Bun", 3)) {
                    Log.d("CarApp.Bun", a.l(field, "Value is null for field: "));
                }
            }
            return objNewInstance;
        } catch (ClassNotFoundException e) {
            throw new crc("Object for unknown class: ".concat(string), crbVar, e);
        } catch (IllegalArgumentException e2) {
            throw new crc("Failed to deserialize class: ".concat(string), crbVar, e2);
        } catch (NoSuchMethodException e3) {
            throw new crc("Object missing no args constructor: ".concat(string), crbVar, e3);
        } catch (ReflectiveOperationException e4) {
            throw new crc("Constructor or field is not accessible: ".concat(string), crbVar, e4);
        }
    }

    private static Method k(Class cls, String str, crb crbVar) throws crc, SecurityException {
        if (cls == null || cls == Object.class) {
            throw new crc(a.m(cls, str, "No method ", " in class "), crbVar);
        }
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getName().equals(str)) {
                method.setAccessible(true);
                return method;
            }
        }
        return k(cls.getSuperclass(), str, crbVar);
    }

    private static List l(Class cls) {
        ArrayList arrayList = new ArrayList();
        if (cls != null && cls != Object.class) {
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    arrayList.add(field);
                }
            }
            arrayList.addAll(l(cls.getSuperclass()));
        }
        return arrayList;
    }

    private static void m(Bundle bundle, Collection collection, crb crbVar) throws crc {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("tag_value");
        if (parcelableArrayList == null) {
            throw new crc("Bundle is missing the collection", crbVar);
        }
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            collection.add(b((Bundle) ((Parcelable) parcelableArrayList.get(i)), crbVar));
        }
    }
}
