package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csps implements csoc {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/spam/system/bugle/BugleParticipantWrapper");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final ParticipantsTable.BindData e;
    public final alqm f;
    public final eofj g;
    public final boolean h;
    public final csdn i;
    public final boolean j;
    public final boolean k;
    private final dqsn l;
    private final fdjx m;
    private final cspo n;
    private final fdkf o;
    private final String p;
    private final String q;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public csps(defpackage.fcsu r1, defpackage.fcsu r2, defpackage.fcsu r3, defpackage.fcsu r4, defpackage.fcsu r5, defpackage.dqsn r6, defpackage.fdjx r7, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData r8) {
        /*
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r7.getClass()
            r0.<init>()
            r0.b = r3
            r0.c = r4
            r0.d = r5
            r0.l = r6
            r0.m = r7
            r0.e = r8
            cspo r3 = new cspo
            java.lang.String r4 = r8.R()
            r4.getClass()
            r3.<init>(r4)
            r0.n = r3
            java.lang.Object r1 = r1.b()
            alrj r1 = (defpackage.alrj) r1
            alqm r1 = r1.q(r8)
            r0.f = r1
            java.lang.Object r2 = r2.b()
            aixq r2 = (defpackage.aixq) r2
            ekgb r3 = defpackage.ekgb.r(r1)
            ekgb r2 = r2.a(r3)
            r2.getClass()
            java.lang.Object r2 = defpackage.fcva.X(r2)
            r2.getClass()
            elns r2 = (defpackage.elns) r2
            int r2 = r2.ordinal()
            r3 = 16
            if (r2 == r3) goto L72
            switch(r2) {
                case 2: goto L6f;
                case 3: goto L6c;
                case 4: goto L69;
                case 5: goto L72;
                case 6: goto L6f;
                case 7: goto L66;
                case 8: goto L66;
                case 9: goto L6f;
                case 10: goto L6f;
                case 11: goto L69;
                case 12: goto L69;
                case 13: goto L69;
                default: goto L63;
            }
        L63:
            eofj r2 = defpackage.eofj.UNKNOWN_DESTINATION_TYPE
            goto L74
        L66:
            eofj r2 = defpackage.eofj.ALPHA_CODE
            goto L74
        L69:
            eofj r2 = defpackage.eofj.LONG_CODE
            goto L74
        L6c:
            eofj r2 = defpackage.eofj.EMAIL
            goto L74
        L6f:
            eofj r2 = defpackage.eofj.SHORT_CODE
            goto L74
        L72:
            eofj r2 = defpackage.eofj.BOT
        L74:
            r0.g = r2
            cspr r2 = new cspr
            r3 = 0
            r2.<init>(r0, r1, r3)
            fdkf r2 = defpackage.eicj.c(r7, r2)
            r0.o = r2
            boolean r2 = r8.aa()
            r0.h = r2
            int r2 = r8.o()
            csdn r2 = defpackage.csdm.a(r2)
            r0.i = r2
            boolean r2 = r8.X()
            r0.j = r2
            boolean r2 = defpackage.bbca.r(r8)
            r0.k = r2
            csod r2 = defpackage.csod.a
            java.lang.String r3 = defpackage.csod.b(r1)
            if (r3 == 0) goto Lcc
            r0.p = r3
            java.lang.String r1 = r2.a(r1)
            r0.q = r1
            boolean r2 = defpackage.fdgn.H(r3)
            java.lang.String r3 = "Failed requirement."
            if (r2 != 0) goto Lc6
            if (r1 == 0) goto Lc5
            boolean r1 = defpackage.fdgn.H(r1)
            if (r1 != 0) goto Lbf
            goto Lc5
        Lbf:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r3)
            throw r1
        Lc5:
            return
        Lc6:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r3)
            throw r1
        Lcc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Required value was null."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csps.<init>(fcsu, fcsu, fcsu, fcsu, fcsu, dqsn, fdjx, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData):void");
    }

    @Override // defpackage.csoc
    public final alqm a() {
        return this.f;
    }

    @Override // defpackage.csoc
    public final csdn b() {
        return this.i;
    }

    @Override // defpackage.csoc
    public final csob c() {
        ParticipantsTable.BindData bindDataB = ((bbca) this.b.b()).b(this.e.R());
        if (bindDataB == null) {
            return null;
        }
        return new csob(bindDataB.aa(), csdm.a(bindDataB.o()), bindDataB.X());
    }

    @Override // defpackage.csoc
    public final eofj d() {
        return this.g;
    }

    @Override // defpackage.csoc
    public final String e() {
        return this.q;
    }

    @Override // defpackage.csoc
    public final String f() {
        return this.p;
    }

    @Override // defpackage.csoc
    public final fdkf g() {
        return this.o;
    }

    @Override // defpackage.csoc
    public final boolean h() {
        return this.j;
    }

    @Override // defpackage.csoc
    public final boolean i() {
        return this.k;
    }

    @Override // defpackage.csoc
    public final boolean j() {
        return !this.h && this.i.e();
    }

    @Override // defpackage.csoc
    public final boolean k() {
        return this.h;
    }

    @Override // defpackage.csoc
    public final /* synthetic */ cspo l() {
        return this.n;
    }

    @Override // defpackage.csoc
    public final void m() {
        ecem.b();
        Object objC = this.l.c("SpamDatabaseOperations#updateParticipantIsSpam", new ejxr() { // from class: cspp
            @Override // defpackage.ejxr
            public final Object get() {
                csps cspsVar = this.a;
                csob csobVarC = cspsVar.c();
                if (csobVarC == null || csobVarC.b.e()) {
                    return false;
                }
                bsbs bsbsVarF = ParticipantsTable.f();
                bsbsVarF.ap("markParticipantAsAllowlisted");
                bsbsVarF.A(new csdn().a());
                bsbsVarF.z(false);
                return Boolean.valueOf(bsbsVarF.e(cspsVar.e.R()));
            }
        });
        objC.getClass();
        ((Boolean) objC).booleanValue();
    }

    @Override // defpackage.csoc
    public final void n(final csdl csdlVar, final boolean z) {
        ecem.b();
        Object objC = this.l.c("SpamDatabaseOperations#updateParticipantIsSpam", new ejxr() { // from class: cspq
            @Override // defpackage.ejxr
            public final Object get() {
                csps cspsVar = this.a;
                csob csobVarC = cspsVar.c();
                if (csobVarC == null) {
                    return false;
                }
                boolean z2 = z;
                csdl csdlVar2 = csdlVar;
                csdn csdnVar = csobVarC.b;
                csdn csdnVarB = csdnVar.b(csdlVar2, z2);
                boolean zF = fdbq.f(csdnVar, csdnVarB);
                boolean z3 = csobVarC.a;
                if (zF && z2 == z3) {
                    return true;
                }
                bsbs bsbsVarF = ParticipantsTable.f();
                bsbsVarF.ap("updateParticipantIsSpam");
                bsbsVarF.al();
                bsbsVarF.A(csdnVarB.a());
                if (csdnVar.c(csdlVar2, z2)) {
                    bsbsVarF.z(z2);
                }
                ParticipantsTable.BindData bindData = cspsVar.e;
                boolean zE = bsbsVarF.e(bindData.R());
                ((bbca) cspsVar.b.b()).p(zE ? 1 : 0, true != zE ? "Failed to update participants' spam status." : "Successfully updated participants' spam status.");
                if (zE) {
                    ((bakt) cspsVar.c.b()).R(bindData.R());
                    ekrw ekrwVarH = csps.a.h();
                    ekrwVarH.X(eksq.a, "BugleSpam");
                    ekrd ekrdVar = (ekrd) ekrwVarH;
                    ekrdVar.X(new ekrz("oldState", Boolean.class, false, false), Boolean.valueOf(z3));
                    ekrdVar.X(new ekrz("oldSources", csdn.class, false, false), csdnVar);
                    ekrdVar.X(new ekrz("newState", Boolean.class, false, false), Boolean.valueOf(z2));
                    ekrdVar.X(new ekrz("newSources", csdn.class, false, false), csdnVarB);
                    ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/spam/system/bugle/BugleParticipantWrapper", "updateParticipantIsSpam$lambda$0", 182, "BugleParticipantWrapper.kt")).q("BuglerSpamDatabaseOperations: updated spam state.");
                }
                return Boolean.valueOf(zE);
            }
        });
        objC.getClass();
        ((Boolean) objC).booleanValue();
    }
}
