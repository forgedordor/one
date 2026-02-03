package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfpb {
    public final dfoa a;
    public final dfoa b;
    public final dfoa c;
    public final dfoa d;
    public final dfoa e;

    public dfpb(dfpc dfpcVar) {
        this.a = dfpcVar.i("enable_conference_information_object", false);
        this.b = dfpcVar.i("enable_reject_closed_group_invite", false);
        this.c = dfpcVar.i("enable_no_failure_report_imdn", false);
        this.d = dfpcVar.i("enable_pani_in_cpim", false);
        this.e = dfpcVar.h("pani_header_cpim_namespace", "");
    }
}
