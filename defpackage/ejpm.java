package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final /* synthetic */ class ejpm extends fdbo implements fdap {
    public static final ejpm a = new ejpm();

    public ejpm() {
        super(1, fdbp.class, "extractMonthFromDatetime", "extractMonth$extractMonthFromDatetime(Lgoogle/internal/communications/instantmessaging/v1/SuggestProto$DatetimeAnnotation;)Ljava/lang/Integer;", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ezcl ezclVar = (ezcl) obj;
        ezclVar.getClass();
        ezcg ezcgVar = ezclVar.e;
        if (ezcgVar == null) {
            ezcgVar = ezcg.a;
        }
        return Integer.valueOf(ezcgVar.b);
    }
}
