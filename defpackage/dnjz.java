package defpackage;

import java.util.EnumSet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnjz {
    public static final fctc a;
    public static final dnjz b;
    public static final dnjz c;
    public static final dnjz d;
    public static final dnjz e;
    public static final dnjz f;
    public static final dnjz g;
    private static final /* synthetic */ dnjz[] i;
    public final dnml h;

    static {
        dnjz dnjzVar = new dnjz("NEUTRAL", 0, null);
        b = dnjzVar;
        dnjz dnjzVar2 = new dnjz("LIGHT", 1, new dnml(127995));
        c = dnjzVar2;
        dnjz dnjzVar3 = new dnjz("MEDIUM_LIGHT", 2, new dnml(127996));
        d = dnjzVar3;
        dnjz dnjzVar4 = new dnjz("MEDIUM", 3, new dnml(127997));
        e = dnjzVar4;
        dnjz dnjzVar5 = new dnjz("MEDIUM_DARK", 4, new dnml(127998));
        f = dnjzVar5;
        dnjz dnjzVar6 = new dnjz("DARK", 5, new dnml(127999));
        g = dnjzVar6;
        dnjz[] dnjzVarArr = {dnjzVar, dnjzVar2, dnjzVar3, dnjzVar4, dnjzVar5, dnjzVar6};
        i = dnjzVarArr;
        fczb.a(dnjzVarArr);
        a = fctd.a(new fdae() { // from class: dnjx
            @Override // defpackage.fdae
            public final Object invoke() {
                fctc fctcVar = dnjz.a;
                EnumSet enumSetAllOf = EnumSet.allOf(dnjz.class);
                enumSetAllOf.getClass();
                return enumSetAllOf;
            }
        });
    }

    private dnjz(String str, int i2, dnml dnmlVar) {
        this.h = dnmlVar;
    }

    public static dnjz[] values() {
        return (dnjz[]) i.clone();
    }
}
