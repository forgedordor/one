package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxha {
    public static final dxha a;
    public static final dxha b;
    public static final dxha c;
    private static final /* synthetic */ dxha[] d;

    static {
        dxha dxhaVar = new dxha("FCM", 0);
        a = dxhaVar;
        dxha dxhaVar2 = new dxha("FCM_AND_FETCH", 1);
        b = dxhaVar2;
        dxha dxhaVar3 = new dxha("FETCH_ONLY", 2);
        c = dxhaVar3;
        dxha[] dxhaVarArr = {dxhaVar, dxhaVar2, dxhaVar3};
        d = dxhaVarArr;
        fczb.a(dxhaVarArr);
    }

    private dxha(String str, int i) {
    }

    public static dxha[] values() {
        return (dxha[]) d.clone();
    }

    public final boolean a() {
        return this == a || this == b;
    }

    public final boolean b() {
        return this == c || this == b;
    }
}
