package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdjz {
    public static final fdjz a;
    public static final fdjz b;
    public static final fdjz c;
    public static final fdjz d;
    private static final /* synthetic */ fdjz[] e;

    static {
        fdjz fdjzVar = new fdjz("DEFAULT", 0);
        a = fdjzVar;
        fdjz fdjzVar2 = new fdjz("LAZY", 1);
        b = fdjzVar2;
        fdjz fdjzVar3 = new fdjz("ATOMIC", 2);
        c = fdjzVar3;
        fdjz fdjzVar4 = new fdjz("UNDISPATCHED", 3);
        d = fdjzVar4;
        fdjz[] fdjzVarArr = {fdjzVar, fdjzVar2, fdjzVar3, fdjzVar4};
        e = fdjzVarArr;
        fczb.a(fdjzVarArr);
    }

    private fdjz(String str, int i) {
    }

    public static fdjz[] values() {
        return (fdjz[]) e.clone();
    }

    public final void a(fdat fdatVar, Object obj, fcxy fcxyVar) {
        Object objA;
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            fdzu.b(fdatVar, obj, fcxyVar);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                fdatVar.getClass();
                fcym.c(fcym.b(fdatVar, obj, fcxyVar)).w(fctx.a);
                return;
            }
            if (iOrdinal != 3) {
                throw new fctg();
            }
            try {
                fcyh fcyhVarU = fcxyVar.u();
                Object objB = fdzp.b(fcyhVarU, null);
                try {
                    if (fdatVar instanceof fcyt) {
                        fdcm.e(fdatVar, 2);
                        objA = fdatVar.a(obj, fcxyVar);
                    } else {
                        objA = fcym.a(fdatVar, obj, fcxyVar);
                    }
                    if (objA != fcyl.a) {
                        fcxyVar.w(objA);
                    }
                } finally {
                    fdzp.c(fcyhVarU, objB);
                }
            } catch (Throwable th) {
                th = th;
                if (th instanceof fdkl) {
                    th = ((fdkl) th).a;
                }
                fcxyVar.w(fctl.a(th));
            }
        }
    }

    public final boolean b() {
        return this == b;
    }
}
