package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class em {
    public static final /* synthetic */ int a = 0;
    private static final cvw b = new cvw();

    public static Class a(ClassLoader classLoader, String str) throws ClassNotFoundException {
        cvw cvwVar = b;
        cvw cvwVar2 = (cvw) cvwVar.get(classLoader);
        if (cvwVar2 == null) {
            cvwVar2 = new cvw();
            cvwVar.put(classLoader, cvwVar2);
        }
        Class cls = (Class) cvwVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        cvwVar2.put(str, cls2);
        return cls2;
    }

    public ea b(String str) {
        throw null;
    }
}
