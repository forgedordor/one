package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzzm implements bzze {
    public static final brzi[] a;
    public final fcsu b;
    private final fcsu c;

    static {
        brzh brzhVar = ParticipantsTable.c;
        a = new brzi[]{brzhVar.a, brzhVar.h, brzhVar.f, brzhVar.g, brzhVar.n, brzhVar.m, brzhVar.E, brzhVar.M, brzhVar.G, brzhVar.H, brzhVar.v, brzhVar.C, brzhVar.D, brzhVar.d};
    }

    public bzzm(fcsu fcsuVar, fcsu fcsuVar2) {
        this.c = fcsuVar;
        this.b = fcsuVar2;
    }

    public static String b(ParticipantsTable.BindData bindData) {
        return "dest_" + bindData.T() + "_subId_" + bindData.r();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0120  */
    @Override // defpackage.bzze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData r18, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData r19) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzzm.a(com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData):void");
    }
}
