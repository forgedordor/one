package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxru extends pdk {
    @Override // defpackage.pdk
    public final String a() {
        return "UPDATE OR REPLACE `gnp_accounts` SET `id` = ?,`account_specific_id` = ?,`account_type` = ?,`obfuscated_gaia_id` = ?,`actual_account_name` = ?,`actual_account_oid` = ?,`registration_status` = ?,`registration_id` = ?,`sync_sources` = ?,`representative_target_id` = ?,`sync_version` = ?,`last_registration_time_ms` = ?,`last_registration_request_hash` = ?,`first_registration_version` = ?,`internal_target_id` = ?,`fitbit_decoded_id` = ? WHERE `id` = ?";
    }

    @Override // defpackage.pdk
    public final /* bridge */ /* synthetic */ void b(pjl pjlVar, Object obj) {
        dxhe dxheVar = (dxhe) obj;
        pjlVar.e(1, dxheVar.e());
        pjlVar.g(2, dxheVar.j());
        pjlVar.e(3, dxheVar.q());
        if (dxheVar.n() == null) {
            pjlVar.f(4);
        } else {
            pjlVar.g(4, dxheVar.n());
        }
        if (dxheVar.k() == null) {
            pjlVar.f(5);
        } else {
            pjlVar.g(5, dxheVar.k());
        }
        if (dxheVar.l() == null) {
            pjlVar.f(6);
        } else {
            pjlVar.g(6, dxheVar.l());
        }
        pjlVar.e(7, dxheVar.b());
        if (dxheVar.o() == null) {
            pjlVar.f(8);
        } else {
            pjlVar.g(8, dxheVar.o());
        }
        pjlVar.g(9, dxqf.b(dxheVar.i()));
        if (dxheVar.p() == null) {
            pjlVar.f(10);
        } else {
            pjlVar.g(10, dxheVar.p());
        }
        pjlVar.e(11, dxheVar.g());
        pjlVar.e(12, dxheVar.f());
        pjlVar.e(13, dxheVar.a());
        pjlVar.e(14, dxheVar.c());
        if (dxheVar.m() == null) {
            pjlVar.f(15);
        } else {
            pjlVar.g(15, dxheVar.m());
        }
        pjlVar.e(16, dxheVar.d());
        pjlVar.e(17, dxheVar.e());
    }
}
