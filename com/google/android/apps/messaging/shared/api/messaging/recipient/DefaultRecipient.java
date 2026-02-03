package com.google.android.apps.messaging.shared.api.messaging.recipient;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.recipient.DefaultRecipient;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.alqm;
import defpackage.alre;
import defpackage.alwm;
import defpackage.anpj;
import defpackage.anqq;
import defpackage.anqr;
import defpackage.antq;
import defpackage.anuc;
import defpackage.anue;
import defpackage.anug;
import defpackage.anvh;
import defpackage.anvu;
import defpackage.anvv;
import defpackage.anvw;
import defpackage.anwg;
import defpackage.anys;
import defpackage.anyt;
import defpackage.anyx;
import defpackage.anzg;
import defpackage.anzh;
import defpackage.aobo;
import defpackage.aobq;
import defpackage.aobr;
import defpackage.aobs;
import defpackage.aobt;
import defpackage.aubq;
import defpackage.awhr;
import defpackage.awjh;
import defpackage.awjl;
import defpackage.awlc;
import defpackage.axjf;
import defpackage.bbax;
import defpackage.bbbd;
import defpackage.bbdl;
import defpackage.bncf;
import defpackage.cczi;
import defpackage.chos;
import defpackage.chot;
import defpackage.choz;
import defpackage.chpa;
import defpackage.chpb;
import defpackage.chpc;
import defpackage.chpd;
import defpackage.chpe;
import defpackage.chpf;
import defpackage.chpg;
import defpackage.chph;
import defpackage.chpi;
import defpackage.chpm;
import defpackage.chpq;
import defpackage.cpbl;
import defpackage.cqiz;
import defpackage.cqsx;
import defpackage.cqtp;
import defpackage.crmw;
import defpackage.crmx;
import defpackage.crvx;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ejvr;
import defpackage.ejwg;
import defpackage.ejwl;
import defpackage.ejxr;
import defpackage.ejxx;
import defpackage.ekfv;
import defpackage.ekgb;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.ekrw;
import defpackage.eksq;
import defpackage.eooz;
import defpackage.eosc;
import defpackage.fcsu;
import defpackage.fctd;
import defpackage.fcva;
import defpackage.fcww;
import defpackage.fcyh;
import defpackage.fdae;
import defpackage.fdgn;
import defpackage.qxf;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class DefaultRecipient implements ResolvedRecipient, anug {
    public final ParticipantsTable.BindData b;
    public final alqm c;
    public final fcsu d;
    private ProfilesTable.BindData e;
    private bncf f;
    private final anue g;
    private final Context h;
    private final eosc i;
    private final fcsu j;
    private final fcsu k;
    private final fcsu l;
    private final ejxr m;
    private final fcsu n;
    private final fcsu o;
    private final ejxr p;
    private final ejxr q;
    private final fcsu r;
    private final fcsu s;
    private final fcsu t;
    private final fcsu u;
    private final anvu v;
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/recipient/DefaultRecipient");
    public static final Parcelable.Creator<Recipient> CREATOR = new anqq();

    /* compiled from: PG */
    public interface a {
        alre am();

        anqr at();
    }

    public DefaultRecipient(Context context, eosc eoscVar, fcsu<cqiz> fcsuVar, fcsu<axjf> fcsuVar2, fcsu<anyt> fcsuVar3, final fcsu<anwg> fcsuVar4, fcsu<anyx> fcsuVar5, fcsu<aobq> fcsuVar6, final fcsu<aobt> fcsuVar7, final fcsu<anzh> fcsuVar8, fcsu<chot> fcsuVar9, fcsu<choz> fcsuVar10, anvv anvvVar, fcsu<anvh> fcsuVar11, fcsu<awjh> fcsuVar12, fcsu<crmx> fcsuVar13, final ParticipantsTable.BindData bindData, final alqm alqmVar) {
        this.h = context;
        this.i = eoscVar;
        this.j = fcsuVar;
        this.k = fcsuVar2;
        this.l = fcsuVar3;
        this.u = fcsuVar13;
        this.m = ejxx.a(new ejxr() { // from class: anqp
            @Override // defpackage.ejxr
            public final Object get() {
                return ((anwg) fcsuVar4.b()).a(alqmVar);
            }
        });
        this.n = fcsuVar5;
        this.o = fcsuVar6;
        this.p = ejxx.a(new ejxr() { // from class: anqf
            @Override // defpackage.ejxr
            public final Object get() {
                return aobt.a(bindData);
            }
        });
        this.q = ejxx.a(new ejxr() { // from class: anqg
            @Override // defpackage.ejxr
            public final Object get() {
                return anzh.a(bindData);
            }
        });
        if (bindData.aF("profiles_table_join_tag")) {
            this.e = (ProfilesTable.BindData) bindData.ax("profiles_table_join_tag", ProfilesTable.BindData.class);
        }
        if (bindData.aF("contacts_table_join_tag")) {
            this.f = (bncf) bindData.aw("contacts_table_join_tag", bncf.class);
        }
        ejwl.a(!bbdl.k(bindData));
        this.b = bindData;
        this.g = new anue(bindData.R());
        this.c = alqmVar;
        this.r = fcsuVar9;
        this.s = fcsuVar10;
        this.t = fcsuVar11;
        this.v = anvvVar.a(bindData, this.f, this.e);
        this.d = fcsuVar12;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final boolean A() {
        return this.b.S() != null;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final boolean B() {
        if (((Boolean) ((cczi) crvx.c.get()).e()).booleanValue() && D()) {
            return true;
        }
        if (!((Boolean) ((cczi) crvx.b.get()).e()).booleanValue()) {
            return false;
        }
        alqm alqmVar = this.c;
        return alqmVar.s() || alqmVar.C();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final boolean C() {
        return bbbd.m(this.b);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final boolean D() {
        return this.b.p() == 1;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final anpj E(int i) {
        anyt anytVar = (anyt) this.l.b();
        cqtp cqtpVar = (cqtp) anytVar.a.b();
        cqtpVar.getClass();
        eosc eoscVar = (eosc) anytVar.b.b();
        eoscVar.getClass();
        eosc eoscVar2 = (eosc) anytVar.c.b();
        eoscVar2.getClass();
        awlc awlcVar = (awlc) anytVar.d.b();
        awlcVar.getClass();
        awhr awhrVar = (awhr) anytVar.e.b();
        awhrVar.getClass();
        awhr awhrVar2 = (awhr) anytVar.f.b();
        awhrVar2.getClass();
        alqm alqmVar = this.c;
        alqmVar.getClass();
        if (i != 0) {
            return new anys(cqtpVar, eoscVar, eoscVar2, awlcVar, awhrVar, awhrVar2, alqmVar, i);
        }
        throw null;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient
    public final anue F() {
        return this.g;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final anvw G() {
        cpbl cpblVar = cpbl.b;
        anvu anvuVar = this.v;
        return new anvw(anvuVar.a(this, cpblVar), anvuVar.a(this, cpbl.a), anvuVar.b());
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final anzg H() {
        return (anzg) this.q.get();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final aobs I() {
        return (aobs) this.p.get();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final ParticipantColor J() {
        return bbax.a(this.b);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final eiju K() {
        return E(2).b().h(new ejvr() { // from class: anqe
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                boolean zR = ((anyy) obj).r();
                ekrw ekrwVarH = DefaultRecipient.a.h();
                ekrwVarH.X(eksq.a, "BugleRecipients");
                ekrd ekrdVar = (ekrd) ekrwVarH;
                ekrdVar.X(cqnc.H, cqcv.c(this.a.c).toString());
                ekrd ekrdVar2 = (ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/recipient/DefaultRecipient", "isRcsGroupChatEnabled", 472, "DefaultRecipient.java");
                Boolean boolValueOf = Boolean.valueOf(zR);
                ekrdVar2.t("isRcsGroupChatEnabled = %b.", boolValueOf);
                return boolValueOf;
            }
        }, this.i);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final long a() {
        return this.b.u();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    @Deprecated
    public final Uri b() {
        return ((axjf) this.k.b()).a(this.b);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final Uri c(cpbl cpblVar) {
        return this.v.a(this, cpblVar);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final Uri d() {
        bncf bncfVar = this.f;
        if (bncfVar == null) {
            return this.b.w();
        }
        bncfVar.aA(8, "thumbnail");
        return bncfVar.i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final Uri e() {
        ParticipantsTable.BindData bindData = this.b;
        if (bindData.S() != null) {
            return ContactsContract.Contacts.getLookupUri(bindData.u(), bindData.S());
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefaultRecipient) {
            return this.c.equals(((DefaultRecipient) obj).c);
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final qxf f() {
        cqiz cqizVar = (cqiz) this.j.b();
        String strX = x(true);
        alqm alqmVar = this.c;
        String str = alqmVar.F().a;
        ParticipantsTable.BindData bindData = this.b;
        return cqizVar.l(strX, alqmVar, 2, str, bindData.u(), bindData.S(), bindData.v(), bindData.u(), bindData.x(), true);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final alqm g() {
        return this.c;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final alwm h() {
        return this.b.y();
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final anpj i() {
        return (anpj) this.m.get();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final antq j() {
        Long lH;
        String string;
        Instant instantOfEpochMilli = null;
        if (this.e == null) {
            return null;
        }
        chot chotVar = (chot) this.r.b();
        ProfilesTable.BindData bindData = this.e;
        bindData.getClass();
        final alqm alqmVar = this.c;
        alqmVar.getClass();
        fcsu fcsuVar = chotVar.a;
        cqsx cqsxVar = (cqsx) chotVar.b.b();
        cqsxVar.getClass();
        fcyh fcyhVar = (fcyh) chotVar.c.b();
        fcyhVar.getClass();
        Long l = (Long) chotVar.d.b();
        l.getClass();
        fcsu fcsuVar2 = chotVar.e;
        long jLongValue = l.longValue();
        Long l2 = (Long) fcsuVar2.b();
        l2.getClass();
        long jLongValue2 = l2.longValue();
        String strV = bindData.v();
        String str = "";
        if (strV == null) {
            strV = "";
        }
        String strW = bindData.w();
        if (strW == null) {
            strW = "";
        }
        String strX = bindData.x();
        if (strX == null) {
            strX = "";
        }
        chpd chpdVar = (chpd) chpe.a.createBuilder();
        chpdVar.getClass();
        chpf.b(strV, chpdVar);
        chpf.c(strW, chpdVar);
        chpf.d(strX, chpdVar);
        chpq chpqVar = chpq.PROFILE_PEOPLE_SHARING_SOURCE;
        chpf.e(chpqVar, chpdVar);
        chpb chpbVarA = chpa.a(chpf.a(chpdVar));
        chpg chpgVar = (chpg) chph.a.createBuilder();
        chpgVar.getClass();
        Uri uriQ = bindData.q();
        if (uriQ != null && (string = uriQ.toString()) != null) {
            str = string;
        }
        chpi.c(str, chpgVar);
        chpi.b(chpqVar, chpgVar);
        chpc chpcVarB = chpa.b(chpi.a(chpgVar));
        String strB = bindData.B();
        if (strB != null && (lH = fdgn.h(strB)) != null) {
            instantOfEpochMilli = Instant.ofEpochMilli(lH.longValue());
        }
        return new chos(chpbVarA, chpcVarB, instantOfEpochMilli, false, false, fctd.a(new fdae() { // from class: chop
            @Override // defpackage.fdae
            public final Object invoke() {
                return alqmVar;
            }
        }), fcsuVar, cqsxVar, fcyhVar, jLongValue, jLongValue2);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final defpackage.antr k() {
        /*
            r19 = this;
            r4 = r19
            fcsu r0 = r4.s
            java.lang.Object r0 = r0.b()
            choz r0 = (defpackage.choz) r0
            fcsu r1 = r0.a
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable$BindData r2 = r4.e
            choy r3 = new choy
            java.lang.Object r1 = r1.b()
            r6 = r1
            eosc r6 = (defpackage.eosc) r6
            r6.getClass()
            fcsu r1 = r0.b
            java.lang.Object r1 = r1.b()
            r7 = r1
            j$.util.Optional r7 = (j$.util.Optional) r7
            r7.getClass()
            fcsu r1 = r0.c
            java.lang.Object r1 = r1.b()
            r8 = r1
            fdjx r8 = (defpackage.fdjx) r8
            r8.getClass()
            fcsu r9 = r0.d
            fcsu r0 = r0.e
            java.lang.Object r0 = r0.b()
            r10 = r0
            j$.util.Optional r10 = (j$.util.Optional) r10
            r10.getClass()
            r0 = 0
            r1 = 1
            r5 = 0
            if (r2 == 0) goto L5f
            java.lang.String r11 = r2.v()
            if (r11 != 0) goto L5b
            java.lang.String r11 = r2.w()
            if (r11 != 0) goto L5b
            java.lang.String r11 = r2.x()
            if (r11 == 0) goto L58
            goto L5b
        L58:
            r17 = r0
            goto L5d
        L5b:
            r17 = r1
        L5d:
            r11 = r2
            goto L62
        L5f:
            r17 = r0
            r11 = r5
        L62:
            chpb r12 = new chpb
            if (r11 == 0) goto L6b
            java.lang.String r13 = r11.w()
            goto L6c
        L6b:
            r13 = r5
        L6c:
            if (r11 == 0) goto L73
            java.lang.String r14 = r11.x()
            goto L74
        L73:
            r14 = r5
        L74:
            if (r11 == 0) goto L7c
            java.lang.String r11 = r11.v()
            r15 = r11
            goto L7d
        L7c:
            r15 = r5
        L7d:
            r16 = 0
            r18 = 8
            r12.<init>(r13, r14, r15, r16, r17, r18)
            if (r2 == 0) goto L92
            android.net.Uri r11 = r2.q()
            if (r11 == 0) goto L92
            java.lang.String r11 = r11.toString()
            if (r11 != 0) goto L94
        L92:
            java.lang.String r11 = defpackage.choy.a
        L94:
            r13 = r2
            chpc r2 = new chpc
            android.net.Uri r14 = android.net.Uri.parse(r11)
            int r11 = r11.length()
            if (r11 <= 0) goto La2
            r0 = r1
        La2:
            r1 = 2
            r2.<init>(r14, r5, r0, r1)
            if (r13 == 0) goto Lb0
            java.lang.String r5 = r13.y()
            r0 = r3
            r3 = r5
            r5 = r13
            goto Lb2
        Lb0:
            r0 = r3
            r3 = r5
        Lb2:
            r1 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.api.messaging.recipient.DefaultRecipient.k():antr");
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final anuc l() {
        return (anuc) ejwg.c(this.b.z(), anuc.a);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final aobr m() {
        boolean z;
        int iT = this.b.t();
        if (iT == 8 || iT == 10) {
            z = true;
        } else if (iT == 4) {
            iT = 4;
            z = true;
        } else {
            z = false;
        }
        return new aobo(iT == 7 || iT == 11 || iT == 12 || iT == 9 || iT == 4 || iT == 5 || iT == 8 || iT == 10 || iT == 3, z, iT == 12, iT);
    }

    @Override // defpackage.anug
    public final ParticipantsTable.BindData n() {
        return this.b;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final chpm o() {
        chpm chpmVarE = this.v.a.E();
        chpmVarE.getClass();
        return chpmVarE;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final chpq p() {
        return this.v.b();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final chpq q() {
        return this.b.F();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient
    public final eiju r() {
        alqm alqmVar = this.c;
        final Optional optionalE = alqmVar.e();
        if (optionalE.isEmpty()) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleRecipients");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/api/messaging/recipient/DefaultRecipient", "getDestinationToken", 410, "DefaultRecipient.java")).q("No RCS identifier available, returning dummy destination token.");
            return eijx.e(awjl.a);
        }
        if (D()) {
            return ((awjh) this.d.b()).a((aubq) optionalE.get());
        }
        crmx crmxVar = (crmx) this.u.b();
        String strJ = alqmVar.j();
        if (crmxVar.M(strJ)) {
            crmw crmwVarB = crmxVar.b(strJ, "");
            if (crmwVarB == null) {
                crmwVarB = crmxVar.a(strJ, "");
                crmxVar.D(strJ, "", crmwVarB);
            }
            if (crmwVarB.b()) {
                return ((awjh) this.d.b()).a((aubq) optionalE.get());
            }
        }
        return E(2).b().i(new eooz() { // from class: anqh
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (((anyy) obj).q()) {
                    return ((awjh) this.a.d.b()).a((aubq) optionalE.get());
                }
                ekrw ekrwVarH2 = DefaultRecipient.a.h();
                ekrwVarH2.X(eksq.a, "BugleRecipients");
                ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/api/messaging/recipient/DefaultRecipient", "getDestinationToken", 430, "DefaultRecipient.java")).q("Recipient does not support RCS, returning dummy destination token.");
                return eijx.e(awjl.a);
            }
        }, this.i);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final eiju s() {
        return ((anvh) this.t.b()).a(this.c).h(new ejvr() { // from class: anqo
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((Boolean) obj).booleanValue() ? anvg.c : anvg.b;
            }
        }, this.i);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final eiju t() {
        return ((anyx) this.n.b()).a(this.c);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final ekgb u() {
        Uri uriK;
        fcww fcwwVar = new fcww((byte[]) null);
        anvu anvuVar = this.v;
        ProfilesTable.BindData bindData = anvuVar.c;
        Uri uriQ = bindData != null ? bindData.q() : null;
        if (uriQ != null) {
            fcwwVar.add(new anvw(anvuVar.c(this, uriQ), uriQ, chpq.PROFILE_PEOPLE_SHARING_SOURCE));
        }
        bncf bncfVar = anvuVar.b;
        if (bncfVar != null && (uriK = bncfVar.k()) != null) {
            fcwwVar.add(new anvw(anvuVar.c(this, uriK), d(), chpq.PROFILE_CONTACT_SOURCE));
        }
        if (fcwwVar.isEmpty()) {
            fcwwVar.add(new anvw(c(cpbl.b), c(cpbl.a), chpq.PROFILE_UNSPECIFIED_SOURCE));
        }
        return ekfv.a(fcva.a(fcwwVar));
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final String v() {
        return this.b.P();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final String w() {
        return this.b.Q();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("participant", this.b);
        bundle.putParcelable("identity", alre.d(this.c));
        bundle.putParcelable("profile", this.e);
        parcel.writeBundle(bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        r4 = r0.O();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (android.text.TextUtils.isEmpty(r4) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        return r3.h.getResources().getString(com.google.android.apps.messaging.R.string.unknown_sender);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (android.text.TextUtils.isEmpty(r2) != false) goto L16;
     */
    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String x(boolean r4) {
        /*
            r3 = this;
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r0 = r3.b
            java.lang.String r1 = r0.Q()
            java.lang.String r2 = r0.P()
            if (r4 == 0) goto L1a
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto L13
            goto L27
        L13:
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 == 0) goto L20
            goto L28
        L1a:
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L21
        L20:
            return r2
        L21:
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto L28
        L27:
            return r1
        L28:
            java.lang.String r4 = r0.O()
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L33
            return r4
        L33:
            android.content.Context r4 = r3.h
            android.content.res.Resources r4 = r4.getResources()
            r0 = 2132088741(0x7f1517a5, float:1.9817774E38)
            java.lang.String r4 = r4.getString(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.api.messaging.recipient.DefaultRecipient.x(boolean):java.lang.String");
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient
    public final String y() {
        ProfilesTable.BindData bindData;
        ParticipantsTable.BindData bindData2 = this.b;
        String strQ = bindData2.Q();
        if (TextUtils.isEmpty(bindData2.P()) && TextUtils.isEmpty(strQ) && (bindData = this.e) != null) {
            return bindData.v();
        }
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient
    public final boolean z() {
        return this.b.X();
    }

    public DefaultRecipient(Context context, eosc eoscVar, fcsu<cqiz> fcsuVar, fcsu<axjf> fcsuVar2, fcsu<anyt> fcsuVar3, final fcsu<anwg> fcsuVar4, fcsu<anyx> fcsuVar5, fcsu<aobq> fcsuVar6, final fcsu<aobt> fcsuVar7, final fcsu<anzh> fcsuVar8, fcsu<chot> fcsuVar9, fcsu<choz> fcsuVar10, anvv anvvVar, fcsu<anvh> fcsuVar11, fcsu<awjh> fcsuVar12, fcsu<crmx> fcsuVar13, final ParticipantsTable.BindData bindData, ProfilesTable.BindData bindData2, final alqm alqmVar) {
        this.h = context;
        this.i = eoscVar;
        this.j = fcsuVar;
        this.k = fcsuVar2;
        this.l = fcsuVar3;
        this.u = fcsuVar13;
        this.m = ejxx.a(new ejxr() { // from class: anqi
            @Override // defpackage.ejxr
            public final Object get() {
                return ((anwg) fcsuVar4.b()).a(alqmVar);
            }
        });
        this.n = fcsuVar5;
        this.o = fcsuVar6;
        this.p = ejxx.a(new ejxr() { // from class: anqj
            @Override // defpackage.ejxr
            public final Object get() {
                return aobt.a(bindData);
            }
        });
        this.q = ejxx.a(new ejxr() { // from class: anqk
            @Override // defpackage.ejxr
            public final Object get() {
                return anzh.a(bindData);
            }
        });
        if (bindData.aF("profiles_table_join_tag")) {
            this.e = (ProfilesTable.BindData) bindData.ax("profiles_table_join_tag", ProfilesTable.BindData.class);
        } else {
            this.e = bindData2;
        }
        if (bindData.aF("contacts_table_join_tag")) {
            this.f = (bncf) bindData.aw("contacts_table_join_tag", bncf.class);
        }
        ejwl.a(!bbdl.k(bindData));
        this.b = bindData;
        this.r = fcsuVar9;
        this.s = fcsuVar10;
        this.g = new anue(bindData.R());
        this.c = alqmVar;
        this.t = fcsuVar11;
        this.v = anvvVar.a(bindData, this.f, bindData2);
        this.d = fcsuVar12;
    }

    public DefaultRecipient(Context context, eosc eoscVar, fcsu<cqiz> fcsuVar, fcsu<axjf> fcsuVar2, fcsu<anyt> fcsuVar3, final fcsu<anwg> fcsuVar4, fcsu<anyx> fcsuVar5, fcsu<aobq> fcsuVar6, final fcsu<aobt> fcsuVar7, final fcsu<anzh> fcsuVar8, fcsu<chot> fcsuVar9, fcsu<choz> fcsuVar10, anvv anvvVar, fcsu<anvh> fcsuVar11, fcsu<awjh> fcsuVar12, fcsu<crmx> fcsuVar13, final ParticipantsTable.BindData bindData, ProfilesTable.BindData bindData2, bncf bncfVar, final alqm alqmVar) {
        this.h = context;
        this.i = eoscVar;
        this.j = fcsuVar;
        this.k = fcsuVar2;
        this.l = fcsuVar3;
        this.u = fcsuVar13;
        this.m = ejxx.a(new ejxr() { // from class: anql
            @Override // defpackage.ejxr
            public final Object get() {
                return ((anwg) fcsuVar4.b()).a(alqmVar);
            }
        });
        this.n = fcsuVar5;
        this.o = fcsuVar6;
        this.p = ejxx.a(new ejxr() { // from class: anqm
            @Override // defpackage.ejxr
            public final Object get() {
                return aobt.a(bindData);
            }
        });
        this.q = ejxx.a(new ejxr() { // from class: anqn
            @Override // defpackage.ejxr
            public final Object get() {
                return anzh.a(bindData);
            }
        });
        if (bindData.aF("profiles_table_join_tag")) {
            this.e = (ProfilesTable.BindData) bindData.ax("profiles_table_join_tag", ProfilesTable.BindData.class);
        } else {
            this.e = bindData2;
        }
        this.f = bncfVar;
        ejwl.a(!bbdl.k(bindData));
        this.b = bindData;
        this.r = fcsuVar9;
        this.s = fcsuVar10;
        this.g = new anue(bindData.R());
        this.c = alqmVar;
        this.t = fcsuVar11;
        this.v = anvvVar.a(bindData, bncfVar, bindData2);
        this.d = fcsuVar12;
    }
}
