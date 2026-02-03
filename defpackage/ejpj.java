package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final /* synthetic */ class ejpj extends fdbo implements fdap {
    public static final ejpj a = new ejpj();

    public ejpj() {
        super(1, fdbp.class, "extractDayFromDatetime", "extractDay$extractDayFromDatetime(Lgoogle/internal/communications/instantmessaging/v1/SuggestProto$DatetimeAnnotation;)Ljava/lang/Integer;", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ezcl ezclVar = (ezcl) obj;
        ezclVar.getClass();
        ezbz ezbzVar = ezclVar.f;
        if (ezbzVar == null) {
            ezbzVar = ezbz.a;
        }
        return Integer.valueOf(ezbzVar.b);
    }
}
