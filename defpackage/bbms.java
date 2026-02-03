package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbms extends bdxl {
    public final ConversationIdType a;
    public final ekgb b;

    public bbms(ConversationIdType conversationIdType, ekgb ekgbVar) {
        this.a = conversationIdType;
        this.b = ekgbVar;
    }

    @Override // defpackage.bdxl
    public final ConversationIdType a() {
        return this.a;
    }

    @Override // defpackage.bdxl
    public final ekgb b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdxl) {
            bdxl bdxlVar = (bdxl) obj;
            bdxlVar.g();
            bdxlVar.i();
            bdxlVar.k();
            bdxlVar.h();
            bdxlVar.j();
            bdxlVar.e();
            bdxlVar.f();
            if (this.a.equals(bdxlVar.a()) && ekjz.h(this.b, bdxlVar.b())) {
                bdxlVar.d();
                bdxlVar.c();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() ^ 798697306) * 1000003) ^ this.b.hashCode()) * (-721379959);
    }

    public final String toString() {
        ekgb ekgbVar = this.b;
        return "ConversationListQueryBuilder{whereArchived=null, whereNotArchived=null, whereSpam=null, whereCloudSync=null, whereNotCloudSync=null, whereActiveRcsGroup=null, whereApprovedByParent=false, conversationId=" + this.a.toString() + ", conversationIds=" + ekgbVar.toString() + ", limit=null, additionalPredicate=null}";
    }

    @Override // defpackage.bdxl
    public final void c() {
    }

    @Override // defpackage.bdxl
    public final void d() {
    }

    @Override // defpackage.bdxl
    public final void e() {
    }

    @Override // defpackage.bdxl
    public final void f() {
    }

    @Override // defpackage.bdxl
    public final void g() {
    }

    @Override // defpackage.bdxl
    public final void h() {
    }

    @Override // defpackage.bdxl
    public final void i() {
    }

    @Override // defpackage.bdxl
    public final void j() {
    }

    @Override // defpackage.bdxl
    public final void k() {
    }
}
