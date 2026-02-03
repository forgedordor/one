package defpackage;

import j$.time.LocalDateTime;

/* compiled from: PG */
/* loaded from: classes5.dex */
final /* synthetic */ class ejpq extends fdbo implements fdap {
    public static final ejpq a = new ejpq();

    public ejpq() {
        super(1, fdbp.class, "extractInferredYear", "extractYear$extractInferredYear(Ljava/time/LocalDateTime;)Ljava/lang/Integer;", 0);
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        LocalDateTime localDateTime = (LocalDateTime) obj;
        if (localDateTime != null) {
            return Integer.valueOf(localDateTime.getYear());
        }
        return null;
    }
}
