package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class klh extends fdbr implements fdat {
    public static final klh a = new klh();

    public klh() {
        super(2);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        int i;
        klr klrVarA = kli.a((jcr) obj);
        int iOrdinal = ((kji) obj2).ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                throw new fctg();
            }
        } else {
            i = 0;
        }
        klrVarA.setLayoutDirection(i);
        return fctx.a;
    }
}
