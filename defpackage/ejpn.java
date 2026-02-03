package defpackage;

import j$.time.LocalDateTime;

/* compiled from: PG */
/* loaded from: classes5.dex */
final /* synthetic */ class ejpn extends fdbo implements fdap {
    public static final ejpn a = new ejpn();

    public ejpn() {
        super(1, fdbp.class, "extractInferredMonth", "extractMonth$extractInferredMonth(Ljava/time/LocalDateTime;)Ljava/lang/Integer;", 0);
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        if (((LocalDateTime) obj) != null) {
            return Integer.valueOf(r1.getMonthValue() - 1);
        }
        return null;
    }
}
