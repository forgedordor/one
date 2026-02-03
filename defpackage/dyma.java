package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyma extends pdk {
    @Override // defpackage.pdk
    public final String a() {
        return "DELETE FROM `EducationState` WHERE `name` = ?";
    }

    @Override // defpackage.pdk
    public final /* bridge */ /* synthetic */ void b(pjl pjlVar, Object obj) {
        String str = ((dylo) obj).a;
        if (str == null) {
            pjlVar.f(1);
        } else {
            pjlVar.g(1, str);
        }
    }
}
