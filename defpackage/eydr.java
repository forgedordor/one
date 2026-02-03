package defpackage;

import java.util.LinkedHashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eydr {
    public static final eydr a;
    public static final eydr b;
    public static final eydr c;
    public static final eydr d;
    public static final eydr e;
    public static final eydr f;
    private static final /* synthetic */ eydr[] h;
    public final String g;

    static {
        eydr eydrVar = new eydr("Stroke", 0, "st");
        a = eydrVar;
        eydr eydrVar2 = new eydr("Fill", 1, "fl");
        b = eydrVar2;
        eydr eydrVar3 = new eydr("Solid", 2, "1");
        c = eydrVar3;
        eydr eydrVar4 = new eydr("Shape", 3, "sh");
        d = eydrVar4;
        eydr eydrVar5 = new eydr("Group", 4, "gr");
        e = eydrVar5;
        eydr eydrVar6 = new eydr("Transform", 5, "tr");
        f = eydrVar6;
        eydr[] eydrVarArr = {eydrVar, eydrVar2, eydrVar3, eydrVar4, eydrVar5, eydrVar6};
        h = eydrVarArr;
        fczb.a(eydrVarArr);
        eydr[] eydrVarArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(eydrVarArrValues.length), 16));
        for (eydr eydrVar7 : eydrVarArrValues) {
            linkedHashMap.put(eydrVar7.g, eydrVar7);
        }
    }

    private eydr(String str, int i, String str2) {
        this.g = str2;
    }

    public static eydr[] values() {
        return (eydr[]) h.clone();
    }
}
