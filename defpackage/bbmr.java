package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bbmr extends bcvg {
    private final Boolean a;
    private final Boolean b;
    private final Boolean c;
    private final Boolean d;
    private final Boolean e;
    private final boolean f;
    private final ConversationIdType g;
    private final ekgb h;
    private final Function i;
    private final Integer j;

    public bbmr(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, boolean z, ConversationIdType conversationIdType, ekgb ekgbVar, Function function, Integer num) {
        this.a = bool;
        this.b = bool2;
        this.c = bool3;
        this.d = bool4;
        this.e = bool5;
        this.f = z;
        this.g = conversationIdType;
        this.h = ekgbVar;
        this.i = function;
        this.j = num;
    }

    @Override // defpackage.bcvg
    public final ConversationIdType a() {
        return this.g;
    }

    @Override // defpackage.bcvg
    public final ekgb b() {
        return this.h;
    }

    @Override // defpackage.bcvg
    public final Boolean c() {
        return this.e;
    }

    @Override // defpackage.bcvg
    public final Boolean d() {
        return this.a;
    }

    @Override // defpackage.bcvg
    public final Boolean e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        Function function;
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bcvg) {
            bcvg bcvgVar = (bcvg) obj;
            Boolean bool = this.a;
            if (bool != null ? bool.equals(bcvgVar.d()) : bcvgVar.d() == null) {
                Boolean bool2 = this.b;
                if (bool2 != null ? bool2.equals(bcvgVar.e()) : bcvgVar.e() == null) {
                    Boolean bool3 = this.c;
                    if (bool3 != null ? bool3.equals(bcvgVar.g()) : bcvgVar.g() == null) {
                        bcvgVar.k();
                        Boolean bool4 = this.d;
                        if (bool4 != null ? bool4.equals(bcvgVar.f()) : bcvgVar.f() == null) {
                            Boolean bool5 = this.e;
                            if (bool5 != null ? bool5.equals(bcvgVar.c()) : bcvgVar.c() == null) {
                                if (this.f == bcvgVar.j() && this.g.equals(bcvgVar.a()) && ekjz.h(this.h, bcvgVar.b()) && ((function = this.i) != null ? function.equals(bcvgVar.i()) : bcvgVar.i() == null) && ((num = this.j) != null ? num.equals(bcvgVar.h()) : bcvgVar.h() == null)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.bcvg
    public final Boolean f() {
        return this.d;
    }

    @Override // defpackage.bcvg
    public final Boolean g() {
        return this.c;
    }

    @Override // defpackage.bcvg
    public final Integer h() {
        return this.j;
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.b;
        int iHashCode2 = (((iHashCode ^ 1000003) * 1000003) ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
        Boolean bool3 = this.c;
        int iHashCode3 = iHashCode2 ^ (bool3 == null ? 0 : bool3.hashCode());
        Boolean bool4 = this.d;
        int iHashCode4 = ((iHashCode3 * (-721379959)) ^ (bool4 == null ? 0 : bool4.hashCode())) * 1000003;
        Boolean bool5 = this.e;
        int iHashCode5 = (((((((iHashCode4 ^ (bool5 == null ? 0 : bool5.hashCode())) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003;
        Function function = this.i;
        int iHashCode6 = (iHashCode5 ^ (function == null ? 0 : function.hashCode())) * 1000003;
        Integer num = this.j;
        return iHashCode6 ^ (num != null ? num.hashCode() : 0);
    }

    @Override // defpackage.bcvg
    public final Function i() {
        return this.i;
    }

    @Override // defpackage.bcvg
    public final boolean j() {
        return this.f;
    }

    public final String toString() {
        Function function = this.i;
        ekgb ekgbVar = this.h;
        return "ConversationListFromConversationToParticipantsQueryBuilder{whereArchived=" + this.a + ", whereNotArchived=" + this.b + ", whereSpam=" + this.c + ", whereCloudSync=null, whereNotCloudSync=" + this.d + ", whereActiveRcsGroup=" + this.e + ", whereApprovedByParent=" + this.f + ", conversationId=" + this.g.toString() + ", conversationIds=" + ekgbVar.toString() + ", additionalPredicate=" + String.valueOf(function) + ", limit=" + this.j + "}";
    }

    @Override // defpackage.bcvg
    public final void k() {
    }
}
