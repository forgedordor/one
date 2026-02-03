package defpackage;

import java.util.EnumSet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnjw {
    public static final fctc a;
    public static final dnjw b;
    public static final dnjw c;
    public static final dnjw d;
    private static final /* synthetic */ dnjw[] g;
    public final dnml e;
    public final dnml f;

    static {
        dnjw dnjwVar = new dnjw("NEUTRAL", 0, null, new dnml(129489));
        b = dnjwVar;
        dnjw dnjwVar2 = new dnjw("FEMALE", 1, new dnml(9792), new dnml(128105));
        c = dnjwVar2;
        dnjw dnjwVar3 = new dnjw("MALE", 2, new dnml(9794), new dnml(128104));
        d = dnjwVar3;
        dnjw[] dnjwVarArr = {dnjwVar, dnjwVar2, dnjwVar3};
        g = dnjwVarArr;
        fczb.a(dnjwVarArr);
        a = fctd.a(new fdae() { // from class: dnju
            @Override // defpackage.fdae
            public final Object invoke() {
                fctc fctcVar = dnjw.a;
                EnumSet enumSetAllOf = EnumSet.allOf(dnjw.class);
                enumSetAllOf.getClass();
                return enumSetAllOf;
            }
        });
    }

    private dnjw(String str, int i, dnml dnmlVar, dnml dnmlVar2) {
        this.e = dnmlVar;
        this.f = dnmlVar2;
    }

    public static dnjw[] values() {
        return (dnjw[]) g.clone();
    }
}
