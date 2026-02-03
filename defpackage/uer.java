package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum uer {
    REACTION_BADGE(0, ueq.REACTIONS_GROUP),
    CUSTOM_REACTION_BADGE(1, ueq.REACTIONS_GROUP),
    STAR_BADGE(2, ueq.STAR_GROUP),
    CALENDAR_BADGE(3, ueq.CALENDAR_GROUP),
    SCHEDULED_SEND_BADGE(4, ueq.SCHEDULED_SEND_GROUP),
    REMINDER_BADGE(5, ueq.REMINDER_GROUP);

    public final int g;
    public final ueq h;

    uer(int i2, ueq ueqVar) {
        this.g = i2;
        this.h = ueqVar;
    }
}
