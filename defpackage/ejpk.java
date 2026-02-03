package defpackage;

import j$.time.LocalDateTime;

/* compiled from: PG */
/* loaded from: classes5.dex */
final /* synthetic */ class ejpk extends fdbo implements fdap {
    public static final ejpk a = new ejpk();

    public ejpk() {
        super(1, fdbp.class, "extractInferredDay", "extractDay$extractInferredDay(Ljava/time/LocalDateTime;)Ljava/lang/Integer;", 0);
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        LocalDateTime localDateTime = (LocalDateTime) obj;
        if (localDateTime != null) {
            return Integer.valueOf(localDateTime.getDayOfMonth());
        }
        return null;
    }
}
