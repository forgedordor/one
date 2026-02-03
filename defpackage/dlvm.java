package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlvm {
    public static final dlvm a;
    public static final dlvm b;
    public static final dlvm c;
    public static final dlvm d;
    public static final dlvm e;
    public static final dlvm f;
    public static final dlvm g;
    public static final /* synthetic */ fcza h;
    private static final /* synthetic */ dlvm[] k;
    public final ekhx i;
    public final ekhx j;

    static {
        ekph ekphVar = new ekph(dlvc.a);
        dlvm dlvmVar = new dlvm("ID", 0, ekphVar, ekphVar);
        a = dlvmVar;
        ekph ekphVar2 = new ekph(dlvc.b);
        dlvm dlvmVar2 = new dlvm("MIME_TYPE", 1, ekphVar2, ekphVar2);
        b = dlvmVar2;
        ekph ekphVar3 = new ekph(dlvc.c);
        dlvm dlvmVar3 = new dlvm("SIZE_BYTES", 2, ekphVar3, ekphVar3);
        c = dlvmVar3;
        ekph ekphVar4 = new ekph(dlvc.d);
        dlvm dlvmVar4 = new dlvm("DISPLAY_NAME", 3, ekphVar4, ekphVar4);
        d = dlvmVar4;
        ekph ekphVar5 = new ekph(dlvc.e);
        ekhx ekhxVarR = ekhx.r(dlvc.e, dlvc.f);
        ekhxVarR.getClass();
        dlvm dlvmVar5 = new dlvm("DATE_MODIFIED", 4, ekphVar5, ekhxVarR);
        e = dlvmVar5;
        ekhx ekhxVarS = ekhx.s(dlvc.g, dlvc.h, dlvc.j);
        ekhxVarS.getClass();
        dlvm dlvmVar6 = new dlvm("DIMENSIONS", 5, ekhxVarS, ekhxVarS);
        f = dlvmVar6;
        ekph ekphVar6 = new ekph(dlvc.i);
        dlvm dlvmVar7 = new dlvm("DURATION", 6, ekphVar6, ekphVar6);
        g = dlvmVar7;
        dlvm[] dlvmVarArr = {dlvmVar, dlvmVar2, dlvmVar3, dlvmVar4, dlvmVar5, dlvmVar6, dlvmVar7};
        k = dlvmVarArr;
        h = fczb.a(dlvmVarArr);
    }

    private dlvm(String str, int i, ekhx ekhxVar, ekhx ekhxVar2) {
        this.i = ekhxVar;
        this.j = ekhxVar2;
        if (!ekhxVar2.containsAll(ekhxVar)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public static dlvm[] values() {
        return (dlvm[]) k.clone();
    }
}
