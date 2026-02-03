package defpackage;

import android.view.View;
import androidx.preference.Preference;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.cloudstore.fi.FiAccountPreference;
import com.google.android.apps.messaging.cloudstore.fi.SyncPreference;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class trj {
    public static final cqce a = cqce.g("BugleCms", "FiSettingsFragmentPeer");
    static final cczv b = cdag.h(cdag.b, "counter_when_user_entering_settings_page", false);
    public Snackbar A;
    public Snackbar B;
    public final fcsu C;
    public final fcsu D;
    private final cpmi E;
    private Snackbar F;
    public final tqs c;
    public final aurx d;
    public final eils e;
    public final ehac f;
    public final eigp g;
    public final egbf h;
    public final aijh i;
    public final egpr j;
    public final efwo k;
    public final egps l = new trh(this);
    public final egps m = new tri(this);
    public FiAccountPreference n;
    public SyncPreference o;
    public SwitchPreferenceCompat p;
    public Preference q;
    public boolean r;
    public boolean s;
    public boolean t;
    public final fcsu u;
    public final fcsu v;
    public final apqc w;
    public final apqb x;
    public final fcsu y;
    public final fcsu z;

    /* compiled from: PG */
    final class a implements egzv<egbs> {
        public a() {
        }

        @Override // defpackage.egzv
        public final void a(Throwable th) {
            throw new IllegalStateException("Error retrieving AccountInfo for id " + trj.this.k.a(), th);
        }

        @Override // defpackage.egzv
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            egbs egbsVar = (egbs) obj;
            trj trjVar = trj.this;
            trjVar.n.M(egbsVar.d);
            trjVar.n.n(egbsVar.g);
            FiAccountPreference fiAccountPreference = trjVar.n;
            fiAccountPreference.b = egbsVar.h;
            fiAccountPreference.d();
            trjVar.n.G(true);
        }

        @Override // defpackage.egzv
        public final void hn() {
            trj trjVar = trj.this;
            trjVar.n.n(trjVar.c.Y(R.string.loading));
        }
    }

    public trj(tqs tqsVar, aurx aurxVar, eils eilsVar, ehac ehacVar, efwo efwoVar, eigp eigpVar, egbf egbfVar, cpmi cpmiVar, aijh aijhVar, egpr egprVar, fcsu fcsuVar, apqb apqbVar, fcsu fcsuVar2, apqc apqcVar, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6) {
        this.c = tqsVar;
        this.d = aurxVar;
        this.k = efwoVar;
        this.e = eilsVar;
        this.f = ehacVar;
        this.g = eigpVar;
        this.h = egbfVar;
        this.E = cpmiVar;
        this.i = aijhVar;
        this.j = egprVar;
        this.z = fcsuVar4;
        this.u = fcsuVar;
        this.x = apqbVar;
        this.w = apqcVar;
        this.v = fcsuVar3;
        this.y = fcsuVar2;
        this.C = fcsuVar5;
        this.D = fcsuVar6;
    }

    public final void a() {
        this.j.h(egpq.b(this.E.f(this.k)), new egpo(null), this.m);
    }

    public final void b() {
        this.j.h(egpq.b(this.E.d(this.k, 4, 1)), new egpo(null), this.m);
    }

    public final void c(boolean z) {
        this.p.G(z);
        this.n.G(z);
    }

    public final void d(String str) {
        View view = this.c.Q;
        view.getClass();
        Snackbar snackbar = this.F;
        if (snackbar == null) {
            Snackbar snackbarQ = Snackbar.q(view, str, -2);
            snackbarQ.n();
            this.F = snackbarQ;
        } else {
            snackbar.t(str);
        }
        this.F.i();
    }

    public final int e(aumq aumqVar) {
        autx autxVar = (autx) this.y.b();
        aumqVar.getClass();
        if (!cpyl.a()) {
            autt auttVarB = autt.b(aumqVar.f);
            if (auttVarB == null) {
                auttVarB = autt.INITIAL_SYNC_STATUS_NOT_SET;
            }
            switch (auttVarB) {
                case INITIAL_SYNC_STATUS_NOT_SET:
                case STARTED:
                    return 3;
                case RESTORE:
                case BACKUP:
                case RESTORE_KEYS:
                case FAILED:
                case INITIAL_BACKUP_NEEDS_RETRY:
                case RESTORE_MESSAGES_COMPLETE:
                    return 1;
                case COMPLETE:
                    return 2;
                default:
                    throw new fctg();
            }
        }
        if (autxVar.b.a() && autxVar.c.a()) {
            return 3;
        }
        autt auttVarB2 = autt.b(aumqVar.f);
        if (auttVarB2 == null) {
            auttVarB2 = autt.INITIAL_SYNC_STATUS_NOT_SET;
        }
        switch (auttVarB2) {
            case INITIAL_SYNC_STATUS_NOT_SET:
            case STARTED:
                return 3;
            case RESTORE:
            case RESTORE_KEYS:
                return 4;
            case BACKUP:
            case RESTORE_MESSAGES_COMPLETE:
                return 5;
            case FAILED:
            case INITIAL_BACKUP_NEEDS_RETRY:
                return 1;
            case COMPLETE:
                return 2;
            default:
                throw new fctg();
        }
    }

    /* compiled from: PG */
    final class b implements egzv<aumq> {
        public b() {
        }

        @Override // defpackage.egzv
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            Snackbar snackbar;
            Snackbar snackbar2;
            aumq aumqVar = (aumq) obj;
            trj trjVar = trj.this;
            boolean zM = autx.m(aumqVar);
            apqb apqbVar = trjVar.x;
            if (!apqbVar.a() && aumqVar.k && aumqVar.e && !trjVar.r && zM) {
                tqs tqsVar = trjVar.c;
                View view = tqsVar.Q;
                view.getClass();
                trjVar.r = true;
                Snackbar snackbarQ = Snackbar.q(view, tqsVar.Y(R.string.hangouts_syncing_conversations), -2);
                snackbarQ.n();
                trjVar.A = snackbarQ;
                trjVar.A.i();
                return;
            }
            if (trjVar.r && ((!zM || !aumqVar.e) && (snackbar2 = trjVar.A) != null)) {
                snackbar2.e();
                return;
            }
            if (apqbVar.a()) {
                if (!aumqVar.e || !zM) {
                    if (!trjVar.s || (snackbar = trjVar.B) == null) {
                        return;
                    }
                    snackbar.e();
                    return;
                }
                if (trjVar.s) {
                    return;
                }
                tqs tqsVar2 = trjVar.c;
                View view2 = tqsVar2.Q;
                view2.getClass();
                trjVar.s = true;
                Snackbar snackbarQ2 = Snackbar.q(view2, tqsVar2.Y(R.string.syncing_conversations), -2);
                snackbarQ2.n();
                trjVar.B = snackbarQ2;
                trjVar.B.i();
            }
        }

        @Override // defpackage.egzv
        public final /* synthetic */ void hn() {
        }

        @Override // defpackage.egzv
        public final void a(Throwable th) {
        }
    }

    /* compiled from: PG */
    final class c implements egzv<aumq> {
        public c() {
        }

        @Override // defpackage.egzv
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            auml aumlVarB = auml.b(((aumq) obj).l);
            if (aumlVarB == null) {
                aumlVarB = auml.UNSPECIFIED_STATUS;
            }
            int iOrdinal = aumlVarB.ordinal();
            if (iOrdinal == 4) {
                trj.a.p("Feature disabled, finishing Fi Settings activity");
                einf.f(new trv(), trj.this.c);
            } else if (iOrdinal == 5) {
                trj trjVar = trj.this;
                trjVar.c(false);
                trjVar.d(trjVar.c.Y(R.string.fi_settings_opt_out_in_progress));
            } else {
                if (iOrdinal != 6) {
                    return;
                }
                trj trjVar2 = trj.this;
                trjVar2.c(true);
                trjVar2.d(trjVar2.c.Y(R.string.fi_settings_opt_out_failed));
            }
        }

        @Override // defpackage.egzv
        public final void hn() {
        }

        @Override // defpackage.egzv
        public final void a(Throwable th) {
        }
    }

    /* compiled from: PG */
    final class d implements egzv<aumq> {
        public d() {
        }

        @Override // defpackage.egzv
        public final void a(Throwable th) {
            trj.this.p.G(true);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
        @Override // defpackage.egzv
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final /* bridge */ /* synthetic */ void b(java.lang.Object r10) {
            /*
                r9 = this;
                trj r0 = defpackage.trj.this
                aumq r10 = (defpackage.aumq) r10
                androidx.preference.SwitchPreferenceCompat r1 = r0.p
                boolean r2 = r10.d
                r1.k(r2)
                int r1 = r10.l
                auml r1 = defpackage.auml.b(r1)
                if (r1 != 0) goto L15
                auml r1 = defpackage.auml.UNSPECIFIED_STATUS
            L15:
                auml r2 = defpackage.auml.DISABLING
                boolean r1 = r1.equals(r2)
                androidx.preference.SwitchPreferenceCompat r2 = r0.p
                r3 = 1
                r1 = r1 ^ r3
                r2.G(r1)
                boolean r1 = defpackage.cpyl.a()
                r2 = 2132084453(0x7f1506e5, float:1.9809077E38)
                r4 = 4
                r5 = 3
                r6 = 2132084454(0x7f1506e6, float:1.980908E38)
                if (r1 == 0) goto L8a
                boolean r1 = r10.B
                if (r1 == 0) goto L8a
                com.google.android.apps.messaging.cloudstore.fi.SyncPreference r1 = r0.o
                int r7 = r0.e(r10)
                ausj r10 = r10.C
                if (r10 != 0) goto L40
                ausj r10 = defpackage.ausj.a
            L40:
                r1.a = r7
                int r7 = r7 + (-1)
                if (r7 == 0) goto L83
                if (r7 == r3) goto L7f
                if (r7 == r5) goto L66
                if (r7 == r4) goto L4d
                goto L86
            L4d:
                long r4 = r10.e
                long r7 = r10.f
                boolean r10 = com.google.android.apps.messaging.cloudstore.fi.SyncPreference.ab(r7, r4)
                if (r10 == 0) goto L62
                r10 = 2132084450(0x7f1506e2, float:1.980907E38)
                long r4 = com.google.android.apps.messaging.cloudstore.fi.SyncPreference.k(r7, r4)
                r1.o(r10, r4)
                goto L86
            L62:
                r1.l(r6)
                goto L86
            L66:
                long r4 = r10.c
                long r7 = r10.d
                boolean r10 = com.google.android.apps.messaging.cloudstore.fi.SyncPreference.ab(r7, r4)
                if (r10 == 0) goto L7b
                r10 = 2132084451(0x7f1506e3, float:1.9809073E38)
                long r4 = com.google.android.apps.messaging.cloudstore.fi.SyncPreference.k(r7, r4)
                r1.o(r10, r4)
                goto L86
            L7b:
                r1.l(r6)
                goto L86
            L7f:
                r1.l(r2)
                goto L86
            L83:
                r1.l(r6)
            L86:
                r1.d()
                goto La7
            L8a:
                com.google.android.apps.messaging.cloudstore.fi.SyncPreference r1 = r0.o
                int r10 = r0.e(r10)
                r1.a = r10
                int r10 = r10 + (-1)
                if (r10 == 0) goto La1
                if (r10 == r3) goto L9d
                if (r10 == r5) goto La1
                if (r10 == r4) goto La1
                goto La4
            L9d:
                r1.l(r2)
                goto La4
            La1:
                r1.l(r6)
            La4:
                r1.d()
            La7:
                androidx.preference.SwitchPreferenceCompat r10 = r0.p
                r10.N(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: trj.d.b(java.lang.Object):void");
        }

        @Override // defpackage.egzv
        public final void hn() {
        }
    }
}
