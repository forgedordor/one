package defpackage;

import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byjd {
    private static final cqce g = cqce.g("BugleCms", "CmsBackupRescheduleDelay");
    static final cczi a = cdag.f(cdag.b, "cms_backup_queue_max_reschedule_delay_millis", TimeUnit.HOURS.toMillis(5));
    static final cczi b = cdag.f(cdag.b, "cms_backup_cms_key_max_reschedule_delay_millis", TimeUnit.HOURS.toMillis(5));
    static final cczi c = cdag.f(cdag.b, "cms_backup_participant_max_reschedule_delay_millis", TimeUnit.HOURS.toMillis(5));
    static final cczi d = cdag.f(cdag.b, "cms_backup_conversation_max_reschedule_delay_millis", TimeUnit.HOURS.toMillis(5));
    static final cczi e = cdag.f(cdag.b, "cms_backup_message_max_reschedule_delay_millis", TimeUnit.HOURS.toMillis(5));
    static final cczi f = cdag.f(cdag.b, "cms_backup_message_part_max_reschedule_delay_millis", TimeUnit.HOURS.toMillis(5));

    public static Duration a(long j, int i) {
        long jLongValue;
        double dPow = Math.pow(2.0d, Math.min(j, 30L)) * 1000.0d;
        if (i == 1) {
            jLongValue = ((Long) e.e()).longValue();
        } else if (i == 2) {
            jLongValue = ((Long) d.e()).longValue();
        } else if (i == 3) {
            jLongValue = ((Long) c.e()).longValue();
        } else if (i == 5) {
            jLongValue = ((Long) f.e()).longValue();
        } else if (i != 7) {
            cqbd cqbdVarE = g.e();
            cqbdVarE.I("Unexpected table type, falling back to generic max delay");
            cqbdVarE.y("tableType", i);
            cqbdVarE.r();
            jLongValue = ((Long) a.e()).longValue();
        } else {
            jLongValue = ((Long) b.e()).longValue();
        }
        return Duration.ofMillis(Math.min((long) dPow, jLongValue));
    }
}
