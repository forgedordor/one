package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dqhx extends fdbo implements fdat {
    public static final dqhx a = new dqhx();

    public dqhx() {
        super(2, dqid.class, "getAnimatedEmojiModifierForPosition", "getAnimatedEmojiModifierForPosition(Landroidx/compose/foundation/layout/BoxScope;Lcom/google/android/libraries/communications/ux/components/voicemood/Position;)Landroidx/compose/ui/Modifier;", 1);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ede edeVar = (ede) obj;
        dlrg dlrgVar = (dlrg) obj2;
        edeVar.getClass();
        dlrgVar.getClass();
        int iOrdinal = dlrgVar.ordinal();
        if (iOrdinal == 0) {
            return ifi.a(efs.b(edeVar.a(egq.k(ics.e, 24.0f), ibw.g), 105.0f, -14.0f), 10.0f);
        }
        if (iOrdinal == 1) {
            return ifi.a(efs.b(edeVar.a(egq.k(ics.e, 20.0f), ibw.c), -122.0f, 25.0f), -24.0f);
        }
        if (iOrdinal == 2) {
            return efs.b(edeVar.a(egq.k(ics.e, 40.0f), ibw.c), -22.0f, 2.0f);
        }
        throw new fctg();
    }
}
