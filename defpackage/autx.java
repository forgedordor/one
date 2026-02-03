package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class autx {
    public final aurx a;
    public final aqfh b;
    public final aukg c;
    private final Set d;

    public autx(aurx aurxVar, aqfh aqfhVar, aukg aukgVar) {
        aurxVar.getClass();
        aukgVar.getClass();
        this.a = aurxVar;
        this.b = aqfhVar;
        this.c = aukgVar;
        this.d = fcwm.d(autt.INITIAL_SYNC_STATUS_NOT_SET, autt.STARTED, autt.RESTORE_KEYS);
    }

    public static final elng l(auml aumlVar) {
        aumlVar.getClass();
        switch (aumlVar) {
            case UNSPECIFIED_STATUS:
            case ENABLE_FAILED:
            case DISABLED:
            case DISABLING:
            case DISABLE_FAILED:
                return elng.NOT_ENABLED;
            case ENABLED:
                return elng.ENABLED;
            case ENABLING:
                return elng.IN_INITIAL_SYNC;
            default:
                throw new fctg();
        }
    }

    public static final boolean m(aumq aumqVar) {
        aumqVar.getClass();
        autt auttVarB = autt.b(aumqVar.f);
        if (auttVarB == null) {
            auttVarB = autt.INITIAL_SYNC_STATUS_NOT_SET;
        }
        auttVarB.getClass();
        return auttVarB == autt.RESTORE || auttVarB == autt.RESTORE_KEYS;
    }

    public static final boolean n(aumq aumqVar) {
        autt auttVarB = autt.b(aumqVar.f);
        if (auttVarB == null) {
            auttVarB = autt.INITIAL_SYNC_STATUS_NOT_SET;
        }
        return auttVarB == autt.COMPLETE;
    }

    public static final boolean o(aumq aumqVar) {
        aumqVar.getClass();
        autt auttVarB = autt.b(aumqVar.f);
        if (auttVarB == null) {
            auttVarB = autt.INITIAL_SYNC_STATUS_NOT_SET;
        }
        return auttVarB == autt.RESTORE_MESSAGES_COMPLETE;
    }

    public final eqli a(aumq aumqVar) {
        eqli eqliVar;
        aumqVar.getClass();
        if (this.b.a() && this.c.a()) {
            return eqli.INITIAL_SYNC_STATE_UNSPECIFIED;
        }
        autt auttVarB = autt.b(aumqVar.f);
        if (auttVarB == null) {
            auttVarB = autt.INITIAL_SYNC_STATUS_NOT_SET;
        }
        switch (auttVarB) {
            case INITIAL_SYNC_STATUS_NOT_SET:
            case STARTED:
                eqliVar = eqli.INITIAL_SYNC_STATE_UNSPECIFIED;
                break;
            case RESTORE:
            case RESTORE_KEYS:
                eqliVar = eqli.RESTORE;
                break;
            case BACKUP:
            case RESTORE_MESSAGES_COMPLETE:
                eqliVar = eqli.BACKUP;
                break;
            case FAILED:
            case INITIAL_BACKUP_NEEDS_RETRY:
                eqliVar = eqli.FAILED;
                break;
            case COMPLETE:
                eqliVar = eqli.COMPLETE;
                break;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(auttVarB))));
        }
        eqliVar.getClass();
        return eqliVar;
    }

    public final String b(aumq aumqVar) {
        aumqVar.getClass();
        if (this.b.a() && this.c.a()) {
            return "STARTED";
        }
        autt auttVarB = autt.b(aumqVar.f);
        if (auttVarB == null) {
            auttVarB = autt.INITIAL_SYNC_STATUS_NOT_SET;
        }
        return auttVarB.name();
    }

    public final void c(boolean z) {
        this.a.ac(autt.BACKUP, z);
    }

    public final void d() {
        this.a.ab(autt.COMPLETE);
    }

    @fcsv
    public final void e() {
        f(true);
    }

    public final void f(boolean z) {
        this.a.ac(autt.INITIAL_SYNC_STATUS_NOT_SET, z);
    }

    public final void g() {
        this.a.ab(autt.FAILED);
    }

    public final void h() {
        this.a.ab(autt.RESTORE_MESSAGES_COMPLETE);
    }

    public final void i() {
        this.a.ab(autt.RESTORE_KEYS);
    }

    public final boolean j(aumq aumqVar) {
        if (this.b.a() && this.c.a()) {
            return true;
        }
        autt auttVarB = autt.b(aumqVar.f);
        if (auttVarB == null) {
            auttVarB = autt.INITIAL_SYNC_STATUS_NOT_SET;
        }
        return auttVarB != autt.INITIAL_SYNC_STATUS_NOT_SET;
    }

    public final boolean k(aumq aumqVar) {
        aumqVar.getClass();
        autt auttVarB = autt.b(aumqVar.f);
        if (auttVarB == null) {
            auttVarB = autt.INITIAL_SYNC_STATUS_NOT_SET;
        }
        return !this.d.contains(auttVarB);
    }
}
