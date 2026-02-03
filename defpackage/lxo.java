package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lxo {
    public static final lyo a = new lxn();
    public final lyu b;

    public lxo(lxp lxpVar, lxk lxkVar) {
        this(lxpVar, lxkVar, lyn.a);
    }

    public final lxd a(Class cls) {
        return b(fdab.c(cls));
    }

    public final lxd b(fddy fddyVar) {
        String strA = lze.a(fddyVar);
        if (strA != null) {
            return this.b.a(fddyVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strA));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public lxo(lxp lxpVar, lxk lxkVar, lyp lypVar) {
        lxkVar.getClass();
        lypVar.getClass();
        this.b = new lyu(lxpVar, lxkVar, lypVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lxo(lxq lxqVar) {
        this(lxqVar.S(), lzd.b(lxqVar), lzd.a(lxqVar));
        lxqVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lxo(lxq lxqVar, lxk lxkVar) {
        this(lxqVar.S(), lxkVar, lzd.a(lxqVar));
        lxqVar.getClass();
    }
}
