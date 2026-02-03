package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum rtf {
    RUNNING(false),
    PAUSED(false),
    CLEARED(false),
    SUCCESS(true),
    FAILED(true);

    public final boolean f;

    rtf(boolean z) {
        this.f = z;
    }
}
