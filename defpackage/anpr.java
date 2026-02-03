package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anpr {
    public static boolean a(eljx eljxVar) {
        ejwl.b(!Objects.equals(eljxVar, eljx.UNKNOWN_LATCH_REASON), "unknown fallback latch reason");
        return Objects.equals(eljxVar, eljx.DEBUG_MENU_COMMAND_FAIL_SEND) || Objects.equals(eljxVar, eljx.MANUAL_RETRY_FORCES_FALLBACK) || Objects.equals(eljxVar, eljx.DITTO_CHANNEL_RESEND);
    }
}
