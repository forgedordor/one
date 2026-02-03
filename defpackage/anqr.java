package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.recipient.DefaultRecipient;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anqr {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public final fcsu l;
    public final fcsu m;
    public final fcsu n;
    public final fcsu o;
    public final fcsu p;

    public anqr(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, fcsu fcsuVar16) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
        fcsuVar3.getClass();
        this.c = fcsuVar3;
        fcsuVar4.getClass();
        this.d = fcsuVar4;
        fcsuVar5.getClass();
        this.e = fcsuVar5;
        fcsuVar6.getClass();
        this.f = fcsuVar6;
        fcsuVar7.getClass();
        this.g = fcsuVar7;
        fcsuVar8.getClass();
        this.h = fcsuVar8;
        fcsuVar9.getClass();
        this.i = fcsuVar9;
        fcsuVar10.getClass();
        this.j = fcsuVar10;
        fcsuVar11.getClass();
        this.k = fcsuVar11;
        fcsuVar12.getClass();
        this.l = fcsuVar12;
        fcsuVar13.getClass();
        this.m = fcsuVar13;
        fcsuVar14.getClass();
        this.n = fcsuVar14;
        fcsuVar15.getClass();
        this.o = fcsuVar15;
        fcsuVar16.getClass();
        this.p = fcsuVar16;
    }

    public final DefaultRecipient a(ParticipantsTable.BindData bindData, alqm alqmVar) {
        Context context = (Context) this.a.b();
        context.getClass();
        eosc eoscVar = (eosc) this.b.b();
        eoscVar.getClass();
        anvv anvvVar = (anvv) this.m.b();
        anvvVar.getClass();
        bindData.getClass();
        alqmVar.getClass();
        return new DefaultRecipient(context, eoscVar, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, anvvVar, this.n, this.o, this.p, bindData, alqmVar);
    }
}
