package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddnb {
    public static Object a(Class cls, String str, ddna... ddnaVarArr) {
        int length = ddnaVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i = 0; i < ddnaVarArr.length; i++) {
            ddna ddnaVar = ddnaVarArr[i];
            ddnaVar.getClass();
            clsArr[i] = ddnaVar.a;
            objArr[i] = ddnaVarArr[i].b;
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }

    public static Object b(String str, ddna... ddnaVarArr) {
        return a(Class.forName("android.os.SystemProperties"), str, ddnaVarArr);
    }
}
