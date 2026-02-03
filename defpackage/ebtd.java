package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebtd {
    public static final ebtd a;
    public static final ebtd b;
    public static final ebtd c;
    private static final /* synthetic */ ebtd[] d;

    static {
        ebtd ebtdVar = new ebtd("PENCIL", 0);
        a = ebtdVar;
        ebtd ebtdVar2 = new ebtd("CALLIGRAPHY", 1);
        b = ebtdVar2;
        ebtd ebtdVar3 = new ebtd("HIGHLIGHTER", 2);
        c = ebtdVar3;
        ebtd[] ebtdVarArr = {ebtdVar, ebtdVar2, ebtdVar3};
        d = ebtdVarArr;
        fczb.a(ebtdVarArr);
    }

    private ebtd(String str, int i) {
    }

    public static ebtd[] values() {
        return (ebtd[]) d.clone();
    }
}
