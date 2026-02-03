package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vvy {
    public static final vvy a;
    public static final vvy b;
    public static final vvy c;
    public static final vvy d;
    private static final /* synthetic */ vvy[] e;

    static {
        vvy vvyVar = new vvy("EMOJI", 0);
        a = vvyVar;
        vvy vvyVar2 = new vvy("GIFS", 1);
        b = vvyVar2;
        vvy vvyVar3 = new vvy("STICKERS", 2);
        c = vvyVar3;
        vvy vvyVar4 = new vvy("EMOTIFY", 3);
        d = vvyVar4;
        vvy[] vvyVarArr = {vvyVar, vvyVar2, vvyVar3, vvyVar4};
        e = vvyVarArr;
        fczb.a(vvyVarArr);
    }

    private vvy(String str, int i) {
    }

    public static vvy[] values() {
        return (vvy[]) e.clone();
    }
}
