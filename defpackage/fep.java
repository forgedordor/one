package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class fep extends fdbo implements fdap {
    final /* synthetic */ ffv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fep(ffv ffvVar) {
        super(1, fdbp.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.a = ffvVar;
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        float[] fArr = ((iju) obj).a;
        ivy ivyVar = (ivy) this.a.d.a();
        if (ivyVar != null) {
            if (true != ivyVar.u()) {
                ivyVar = null;
            }
            if (ivyVar != null) {
                ivyVar.t(fArr);
            }
        }
        return fctx.a;
    }
}
