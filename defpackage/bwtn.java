package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwtn {
    public static final fctc a;
    public static final bwtn b;
    public static final bwtn c;
    public static final bwtn d;
    public static final bwtn e;
    public static final bwtn f;
    public static final bwtn g;
    private static final /* synthetic */ bwtn[] k;
    public final bwss h;
    public final bwss i;
    public final int j;

    static {
        bwtn bwtnVar = new bwtn("ONE_ON_ONE_TEXT_TO_RCS", 0, bwss.a, bwss.b, 215);
        b = bwtnVar;
        bwtn bwtnVar2 = new bwtn("ONE_ON_ONE_TEXT_TO_E2EE", 1, bwss.a, bwss.c, 235);
        c = bwtnVar2;
        bwtn bwtnVar3 = new bwtn("ONE_ON_ONE_RCS_TO_E2EE", 2, bwss.b, bwss.c, 237);
        d = bwtnVar3;
        bwtn bwtnVar4 = new bwtn("ONE_ON_ONE_E2EE_TO_RCS", 3, bwss.c, bwss.b, 238);
        e = bwtnVar4;
        bwtn bwtnVar5 = new bwtn("ONE_ON_ONE_E2EE_TO_TEXT", 4, bwss.c, bwss.a, 236);
        f = bwtnVar5;
        bwtn bwtnVar6 = new bwtn("ONE_ON_ONE_RCS_TO_TEXT", 5, bwss.b, bwss.a, 214);
        g = bwtnVar6;
        bwtn[] bwtnVarArr = {bwtnVar, bwtnVar2, bwtnVar3, bwtnVar4, bwtnVar5, bwtnVar6};
        k = bwtnVarArr;
        fczb.a(bwtnVarArr);
        a = fctd.a(new fdae() { // from class: bwtm
            @Override // defpackage.fdae
            public final Object invoke() {
                bwtn[] bwtnVarArrValues = bwtn.values();
                LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(bwtnVarArrValues.length), 16));
                for (bwtn bwtnVar7 : bwtnVarArrValues) {
                    linkedHashMap.put(new fcti(bwtnVar7.h, bwtnVar7.i), bwtnVar7);
                }
                return linkedHashMap;
            }
        });
    }

    private bwtn(String str, int i, bwss bwssVar, bwss bwssVar2, int i2) {
        this.h = bwssVar;
        this.i = bwssVar2;
        this.j = i2;
    }

    public static final bwtn a(bwss bwssVar, bwss bwssVar2) {
        bwssVar.getClass();
        bwssVar2.getClass();
        bwtn bwtnVar = (bwtn) ((Map) a.a()).get(new fcti(bwssVar, bwssVar2));
        if (bwtnVar != null) {
            return bwtnVar;
        }
        throw new IllegalArgumentException(a.j(bwssVar2, bwssVar, "Invalid input protocols (from = ", ", to = ", "."));
    }

    public static bwtn[] values() {
        return (bwtn[]) k.clone();
    }
}
