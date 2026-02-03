package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lwg {
    public static final Object a(lvc lvcVar, lvb lvbVar, fdat fdatVar, fcxy fcxyVar) {
        Object objA;
        if (lvbVar != lvb.b) {
            return (lvcVar.a() != lvb.a && (objA = fdjy.a(new lwf(lvcVar, lvbVar, fdatVar, null), fcxyVar)) == fcyl.a) ? objA : fctx.a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
    }
}
