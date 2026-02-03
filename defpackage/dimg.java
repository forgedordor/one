package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dimg extends fdbo implements fdat {
    public static final dimg a = new dimg();

    public dimg() {
        super(2, dimx.class, "getAnimatedEmojiModifierForPosition", "getAnimatedEmojiModifierForPosition(Landroidx/compose/foundation/layout/BoxScope;Lcom/google/android/libraries/communications/ux/components/voicemood/Position;)Landroidx/compose/ui/Modifier;", 1);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ede edeVar = (ede) obj;
        dlrg dlrgVar = (dlrg) obj2;
        edeVar.getClass();
        dlrgVar.getClass();
        int iOrdinal = dlrgVar.ordinal();
        if (iOrdinal == 0) {
            return efs.b(edeVar.a(egq.k(ics.e, 24.0f), ibw.g), 64.0f, -4.0f);
        }
        if (iOrdinal == 1) {
            return ifi.a(efs.b(edeVar.a(egq.k(ics.e, 20.0f), ibw.i), -72.0f, -48.0f), -30.0f);
        }
        if (iOrdinal == 2) {
            return efs.b(edeVar.a(egq.k(ics.e, 40.0f), ibw.c), -16.0f, -10.0f);
        }
        throw new fctg();
    }
}
