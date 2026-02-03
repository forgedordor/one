package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum cmxm {
    SEND_BUTTON_ACCURATE(new dzfh("MLA::pressButton")),
    NOTIFICATION(new dzfh("MLA::notification")),
    TACHYGRAM_FINISHED_SENDING(new dzfh("MLA::tachygramFinishedSending")),
    TICKLE_ARRIVED(new dzfh("MLA::tickle")),
    TACHYGRAM_MESSAGE_ARRIVED(new dzfh("MLA::tachygramArrived")),
    SMS_ARRIVED(new dzfh("MLA::smsArrived"));

    final dzfh g;

    cmxm(dzfh dzfhVar) {
        this.g = dzfhVar;
    }
}
