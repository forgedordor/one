package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final /* synthetic */ class ejpp extends fdbo implements fdap {
    public static final ejpp a = new ejpp();

    public ejpp() {
        super(1, fdbp.class, "extractYearFromDatetime", "extractYear$extractYearFromDatetime(Lgoogle/internal/communications/instantmessaging/v1/SuggestProto$DatetimeAnnotation;)Ljava/lang/Integer;", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ezcl ezclVar = (ezcl) obj;
        ezclVar.getClass();
        ezck ezckVar = ezclVar.d;
        if (ezckVar == null) {
            ezckVar = ezck.a;
        }
        return Integer.valueOf(ezckVar.b);
    }
}
