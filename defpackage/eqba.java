package defpackage;

import com.sun.jna.Library;
import com.sun.jna.Native;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqba {
    public static final eqba a;
    public static final eqba b;
    public static final eqba c;
    public static final /* synthetic */ fcza d;
    private static final Class e;
    private static final /* synthetic */ eqba[] f;

    static {
        eqba eqbaVar = new eqba("Ok", 0);
        a = eqbaVar;
        eqba eqbaVar2 = new eqba("NotFound", 1);
        b = eqbaVar2;
        eqba eqbaVar3 = new eqba("Err", 2);
        c = eqbaVar3;
        eqba[] eqbaVarArr = {eqbaVar, eqbaVar2, eqbaVar3};
        f = eqbaVarArr;
        d = fczb.a(eqbaVarArr);
        e = eqbb.class;
        Library libraryLoad = Native.load("zinnia_jni", (Class<Library>) eqbb.class);
        libraryLoad.getClass();
    }

    private eqba(String str, int i) {
    }

    public static eqba[] values() {
        return (eqba[]) f.clone();
    }
}
